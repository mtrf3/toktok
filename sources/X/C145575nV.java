package X;

import com.ss.android.ugc.aweme.shortvideo.AVMusic;
import com.ss.android.ugc.aweme.shortvideo.AVMusicWaveBean;
import kotlin.jvm.internal.o;

/* renamed from: X.5nV, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C145575nV {
    public final AVMusic LIZ;
    public final String LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;
    public final AVMusicWaveBean LJ;

    public C145575nV() {
        this(null, "", 0, 0, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C145575nV)) {
            return false;
        }
        C145575nV c145575nV = (C145575nV) obj;
        return o.LJ(this.LIZ, c145575nV.LIZ) && o.LJ(this.LIZIZ, c145575nV.LIZIZ) && this.LIZJ == c145575nV.LIZJ && this.LIZLLL == c145575nV.LIZLLL && o.LJ(this.LJ, c145575nV.LJ);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CutMusicUpdateData(curMusic=");
        LIZ.append(this.LIZ);
        LIZ.append(", musicPath=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", length=");
        LIZ.append(this.LIZJ);
        LIZ.append(", start=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", waveBean=");
        LIZ.append(this.LJ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final int hashCode() {
        int hashCode;
        AVMusic aVMusic = this.LIZ;
        int i = 0;
        if (aVMusic == null) {
            hashCode = 0;
        } else {
            hashCode = aVMusic.hashCode();
        }
        int LJ = (((C79062V1e.LJ(this.LIZIZ, hashCode * 31, 31) + this.LIZJ) * 31) + this.LIZLLL) * 31;
        AVMusicWaveBean aVMusicWaveBean = this.LJ;
        if (aVMusicWaveBean != null) {
            i = aVMusicWaveBean.hashCode();
        }
        return LJ + i;
    }

    public C145575nV(AVMusic aVMusic, String musicPath, int i, int i2, AVMusicWaveBean aVMusicWaveBean) {
        o.LJIIIZ(musicPath, "musicPath");
        this.LIZ = aVMusic;
        this.LIZIZ = musicPath;
        this.LIZJ = i;
        this.LIZLLL = i2;
        this.LJ = aVMusicWaveBean;
    }
}
