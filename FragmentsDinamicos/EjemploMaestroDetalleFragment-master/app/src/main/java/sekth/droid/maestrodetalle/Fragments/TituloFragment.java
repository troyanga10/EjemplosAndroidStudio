package sekth.droid.maestrodetalle.Fragments;

import sekth.droid.maestrodetalle.Clases.Contenido;
import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class TituloFragment extends ListFragment {

	onTituloSelectedListener mCallback;

	public interface onTituloSelectedListener {
		public void onTituloSelected(int position);
	}

	@Override
	public void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);

		setListAdapter(new ArrayAdapter<String>(getActivity(),
				android.R.layout.simple_list_item_1, Contenido.titulos));
	}

	@Override
	public void onAttach(Activity activity) {
		// TODO Auto-generated method stub
		super.onAttach(activity);

		try {
			mCallback = (onTituloSelectedListener) activity;
		} catch (ClassCastException e) {
			Log.d("ClassCastException",
					"La Activity debe implementar esta Interface");
		}
	}

	@Override
	public void onListItemClick(ListView l, View v, int position, long id) {
		// TODO Auto-generated method stub
		super.onListItemClick(l, v, position, id);

		mCallback.onTituloSelected(position);
	}

}
