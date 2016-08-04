package vn.techkid.simplemp3player.Model;

import android.widget.ImageView;

/**
 * Created by Laptop88 on 7/27/2016.
 */
public class Song {
    private int position;
    private String title;
    private String path;
    private String artist;
    private String songImage;
    private String album;
    private String accessLink;
    private String downloadLink;
    private String detailDownloadLink;

    public Song(){

    }
    public Song(String title, String artist) {
        this.title = title;
        this.artist = artist;
    }

    public Song(int position, String title, String artist) {
        this.position = position;
        this.title = title;
        this.artist = artist;
    }



    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public String getAccessLink() {
        return accessLink;
    }

    public void setAccessLink(String accessLink) {
        this.accessLink = accessLink;
    }

    public String getDownloadLink() {
        return downloadLink;
    }

    public void setDownloadLink(String downloadLink) {
        this.downloadLink = downloadLink;
    }

    public String getDetailDownloadLink() {
        return detailDownloadLink;
    }

    public void setDetailDownloadLink(String detailDownloadLink) {
        this.detailDownloadLink = detailDownloadLink;
    }

    public String getSongImage() {
        return songImage;
    }

    public void setSongImage(String songImage) {
        this.songImage = songImage;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
}
