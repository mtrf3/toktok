package com.ss.android.ugc.gamora.recorder.choosemusic.recommend.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.music.model.Music;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class SimpleMusic {

    @InterfaceC65349Pkn("music_info")
    public Music musicModel;

    /* JADX WARN: Multi-variable type inference failed */
    public SimpleMusic() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ SimpleMusic copy$default(SimpleMusic simpleMusic, Music music, int i, Object obj) {
        if ((i & 1) != 0) {
            music = simpleMusic.musicModel;
        }
        return simpleMusic.copy(music);
    }

    public final SimpleMusic copy(Music music) {
        return new SimpleMusic(music);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SimpleMusic) && o.LJ(this.musicModel, ((SimpleMusic) obj).musicModel);
    }

    public int hashCode() {
        Music music = this.musicModel;
        if (music == null) {
            return 0;
        }
        return music.hashCode();
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SimpleMusic(musicModel=");
        LIZ.append(this.musicModel);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final Music getMusicModel() {
        return this.musicModel;
    }

    public SimpleMusic(Music music) {
        this.musicModel = music;
    }

    public final void setMusicModel(Music music) {
        this.musicModel = music;
    }

    public /* synthetic */ SimpleMusic(Music music, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : music);
    }
}
