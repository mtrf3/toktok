package X;

import kotlin.jvm.internal.o;
import webcast.data.MusicSong;

/* renamed from: X.1Vx, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C34211Vx extends AbstractC17370mD {
    public final MusicSong LIZ;
    public final C33541Ti LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C34211Vx)) {
            return false;
        }
        C34211Vx c34211Vx = (C34211Vx) obj;
        return o.LJ(this.LIZ, c34211Vx.LIZ) && o.LJ(this.LIZIZ, c34211Vx.LIZIZ);
    }

    public final int hashCode() {
        return this.LIZIZ.hashCode() + (this.LIZ.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("UpdateFavoriteSongList(musicSong=");
        LIZ.append(this.LIZ);
        LIZ.append(", songList=");
        LIZ.append(this.LIZIZ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C34211Vx(MusicSong musicSong, C33541Ti songList) {
        o.LJIIIZ(musicSong, "musicSong");
        o.LJIIIZ(songList, "songList");
        this.LIZ = musicSong;
        this.LIZIZ = songList;
    }
}
