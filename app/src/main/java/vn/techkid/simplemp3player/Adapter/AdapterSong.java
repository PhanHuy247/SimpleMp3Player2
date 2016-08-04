package vn.techkid.simplemp3player.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

import vn.techkid.simplemp3player.R;
import vn.techkid.simplemp3player.Model.Song;

/**
 * Created by HP on 7/27/2016.
 */
public class AdapterSong extends BaseAdapter {
    ArrayList<Song> arrayList = new ArrayList<>();
    public AdapterSong(ArrayList<Song> arrayList){
        this.arrayList = arrayList;
    }
    @Override
    public int getCount() {
        return arrayList.size();
    }

    @Override
    public Song getItem(int position) {
        return arrayList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView == null){
            LayoutInflater inflater = LayoutInflater.from(parent.getContext());
            convertView = inflater.inflate(R.layout.item_chart_vietnam , parent, false);
            CommentViewHolder holder = new CommentViewHolder();
            holder.txtNameSong = (TextView)convertView.findViewById(R.id.tv_title);
            holder.txtNameArtist = (TextView)convertView.findViewById(R.id.tv_artist);
            convertView.setTag(holder);
        }

        CommentViewHolder holder = (CommentViewHolder) convertView.getTag();
        holder.txtNameSong.setText(getItem(position).getTitle());
        holder.txtNameArtist.setText(String.valueOf(getItem(position).getArtist()));

        return convertView;
    }

    public static class CommentViewHolder{
        public TextView txtNameSong;
        public TextView txtNameArtist;
    }
}
