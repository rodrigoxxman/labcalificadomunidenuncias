//package com.rsalas.labcalificadomunidenuncias.Adapters;
//
//import android.support.v7.widget.RecyclerView;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.ImageView;
//import android.widget.TextView;
//
//import com.rsalas.labcalificadomunidenuncias.Models.Denuncia;
//import com.rsalas.labcalificadomunidenuncias.R;
//import com.rsalas.labcalificadomunidenuncias.Services.ApiService;
//import com.squareup.picasso.Picasso;
//
//import java.util.ArrayList;
//import java.util.List;
//
///**
// * Created by Alumno on 11/05/2018.
// */
//
//public class DenunciasAdapter extends RecyclerView.Adapter<DenunciasAdapter.ViewHolder> {
//
//    private List<Denuncia> productos;
//
//    public DenunciasAdapter(){
//        this.denuncias = new ArrayList<>();
//    }
//
//    public void setDenuncias(List<Denuncia> denuncias){
//        this.denuncias = denuncias;
//    }
//
//    public class ViewHolder extends RecyclerView.ViewHolder{
//
//        public ImageView fotoImage;
//        public TextView tituloText;
//        public TextView descText;
//
//        public ViewHolder(View itemView) {
//            super(itemView);
//            fotoImage = itemView.findViewById(R.id.foto_image);
//            tituloText = itemView.findViewById(R.id.titulo_text);
//            descText = itemView.findViewById(R.id.descripcion_text);
//        }
//    }
//
//    @Override
//    public DenunciasAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
//        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_denuncia, parent, false);
//        return new ViewHolder(itemView);
//    }
//
//    @Override
//    public void onBindViewHolder(DenunciasAdapter.ViewHolder viewHolder, int position) {
//
//        Denuncia denuncia = this.denuncias.get(position);
//
//        viewHolder.tituloText.setText(denuncia.getNombre());
//        viewHolder.descText.setText("S/. " + denuncia.getPrecio());
//
//        String url = ApiService.API_BASE_URL + "/images/" + producto.getImagen();
//        Picasso.with(viewHolder.itemView.getContext()).load(url).into(viewHolder.fotoImage);
//
//    }
//
//    @Override
//    public int getItemCount() {
//        return this.productos.size();
//    }
//
//}
