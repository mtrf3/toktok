package webcast.api.room;

import X.InterfaceC65349Pkn;
import java.util.ArrayList;
import java.util.List;
import webcast.data.MusicCollection;
import webcast.data.MusicSong;

/* loaded from: classes17.dex */
public final class MusicResponse {

    @InterfaceC65349Pkn("data")
    public Packs data;

    /* loaded from: classes17.dex */
    public static final class Pack {

        @InterfaceC65349Pkn("collection")
        public MusicCollection collection;

        @InterfaceC65349Pkn("has_more")
        public boolean hasMore;

        @InterfaceC65349Pkn("songs")
        public List<MusicSong> songs = new ArrayList();

        @InterfaceC65349Pkn("total")
        public long total;
    }

    /* loaded from: classes17.dex */
    public static final class Packs {

        @InterfaceC65349Pkn("favourites")
        public FavouritesPack favourites;

        @InterfaceC65349Pkn("packs")
        public List<Pack> packs = new ArrayList();

        @InterfaceC65349Pkn("playlist")
        public PlaylistPack playlist;
    }
}
