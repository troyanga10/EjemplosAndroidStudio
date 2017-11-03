package sekth.droid.maestrodetalle.Fragments;

import sekth.droid.maestrodetalle.R;
import sekth.droid.maestrodetalle.Clases.Contenido;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class ContenidoFragment extends Fragment {
	public static final String POSICION = "position";
	int position = -1;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		if (savedInstanceState != null){
			position = savedInstanceState.getInt("position");
		}
		
		return inflater.inflate(R.layout.contenido_fragment, container, false);
	}

	@Override
	public void onStart() {
		// TODO Auto-generated method stub
		super.onStart();

		Bundle args = getArguments();
		if (args != null){

			actualizarContenido(args.getInt(POSICION));
		}else if(position != -1){

			actualizarContenido(position);
		}
	}
	
	public void actualizarContenido(int position){
		

		TextView tvContenido = (TextView)getActivity().findViewById(R.id.tvContenido);
		tvContenido.setText(Contenido.descripcion[position]);

		this.position = position;
	}
	
	@Override
	public void onSaveInstanceState(Bundle outState) {
		// TODO Auto-generated method stub
		super.onSaveInstanceState(outState);
		

		outState.putInt(POSICION, position);
	}

}
