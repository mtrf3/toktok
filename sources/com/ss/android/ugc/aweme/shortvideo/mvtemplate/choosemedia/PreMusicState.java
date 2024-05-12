package com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia;

import X.InterfaceC61312at;
import X.X1D;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import defpackage.q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class PreMusicState implements InterfaceC61312at {
    public final String preMusicFile;
    public final MusicModel preMusicModel;

    /* JADX WARN: Multi-variable type inference failed */
    public PreMusicState() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ PreMusicState copy$default(PreMusicState preMusicState, MusicModel musicModel, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            musicModel = preMusicState.preMusicModel;
        }
        if ((i & 2) != 0) {
            str = preMusicState.preMusicFile;
        }
        return preMusicState.copy(musicModel, str);
    }

    public final PreMusicState copy(MusicModel musicModel, String str) {
        return new PreMusicState(musicModel, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PreMusicState)) {
            return false;
        }
        PreMusicState preMusicState = (PreMusicState) obj;
        return o.LJ(this.preMusicModel, preMusicState.preMusicModel) && o.LJ(this.preMusicFile, preMusicState.preMusicFile);
    }

    public int hashCode() {
        MusicModel musicModel = this.preMusicModel;
        int hashCode = (musicModel == null ? 0 : musicModel.hashCode()) * 31;
        String str = this.preMusicFile;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PreMusicState(preMusicModel=");
        LIZ.append(this.preMusicModel);
        LIZ.append(", preMusicFile=");
        return q.LIZIZ(LIZ, this.preMusicFile, ')', LIZ);
    }

    public final String getPreMusicFile() {
        return this.preMusicFile;
    }

    public final MusicModel getPreMusicModel() {
        return this.preMusicModel;
    }

    public PreMusicState(MusicModel musicModel, String str) {
        this.preMusicModel = musicModel;
        this.preMusicFile = str;
    }

    public /* synthetic */ PreMusicState(MusicModel musicModel, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : musicModel, (i & 2) != 0 ? null : str);
    }
}
