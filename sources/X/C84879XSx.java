package X;

import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import kotlin.jvm.internal.o;

/* renamed from: X.XSx, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84879XSx {
    public final MusicModel LIZ;
    public final int LIZIZ;
    public final boolean LIZJ = false;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C84879XSx)) {
            return false;
        }
        C84879XSx c84879XSx = (C84879XSx) obj;
        return o.LJ(this.LIZ, c84879XSx.LIZ) && this.LIZIZ == c84879XSx.LIZIZ && this.LIZJ == c84879XSx.LIZJ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        MusicModel musicModel = this.LIZ;
        int hashCode = (((musicModel == null ? 0 : musicModel.hashCode()) * 31) + this.LIZIZ) * 31;
        boolean z = this.LIZJ;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PlayMusicInfo(musicModel=");
        LIZ.append(this.LIZ);
        LIZ.append(", pageType=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", isLoop=");
        return C48339Iy7.LIZJ(LIZ, this.LIZJ, ')', LIZ);
    }

    public C84879XSx(MusicModel musicModel, int i) {
        this.LIZ = musicModel;
        this.LIZIZ = i;
    }
}
