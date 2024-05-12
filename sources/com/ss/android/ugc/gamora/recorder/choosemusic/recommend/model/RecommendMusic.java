package com.ss.android.ugc.gamora.recorder.choosemusic.recommend.model;

import X.C1NE;
import X.C38340F2y;
import X.C61878OQg;
import X.HNT;
import X.InterfaceC65349Pkn;
import X.X1D;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class RecommendMusic extends C38340F2y {
    public static final HNT Companion = new HNT();
    public static final RecommendMusic EMPTY = new RecommendMusic(C61878OQg.INSTANCE);

    @InterfaceC65349Pkn("music_list")
    public List<MusicInfoAndEffectUseCount> musicList;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RecommendMusic copy$default(RecommendMusic recommendMusic, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = recommendMusic.musicList;
        }
        return recommendMusic.copy(list);
    }

    public final RecommendMusic copy(List<MusicInfoAndEffectUseCount> list) {
        return new RecommendMusic(list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof RecommendMusic) && o.LJ(this.musicList, ((RecommendMusic) obj).musicList);
    }

    public int hashCode() {
        List<MusicInfoAndEffectUseCount> list = this.musicList;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    @Override // X.C38340F2y
    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("RecommendMusic(musicList=");
        return C1NE.LIZIZ(LIZ, this.musicList, ')', LIZ);
    }

    public final List<MusicInfoAndEffectUseCount> getMusicList() {
        return this.musicList;
    }

    public RecommendMusic(List<MusicInfoAndEffectUseCount> list) {
        this.musicList = list;
    }

    public final void setMusicList(List<MusicInfoAndEffectUseCount> list) {
        this.musicList = list;
    }
}
