package X;

import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class KJ3 implements C33Q {
    public final MusicModel LJLIL;
    public final KJ4 LJLILLLLZI;

    public KJ3() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KJ3)) {
            return false;
        }
        KJ3 kj3 = (KJ3) obj;
        return o.LJ(this.LJLIL, kj3.LJLIL) && this.LJLILLLLZI == kj3.LJLILLLLZI;
    }

    public final int hashCode() {
        MusicModel musicModel = this.LJLIL;
        return this.LJLILLLLZI.hashCode() + ((musicModel == null ? 0 : musicModel.hashCode()) * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SearchMusicState(playingModel=");
        LIZ.append(this.LJLIL);
        LIZ.append(", playingStatus=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public /* synthetic */ KJ3(int i) {
        this(null, KJ4.Default);
    }

    public KJ3(MusicModel musicModel, KJ4 playingStatus) {
        o.LJIIIZ(playingStatus, "playingStatus");
        this.LJLIL = musicModel;
        this.LJLILLLLZI = playingStatus;
    }
}
