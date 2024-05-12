package X;

import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.shortvideo.model.MusicWaveBean;
import defpackage.b0;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class XV7 {
    public final MusicWaveBean LIZ;
    public final MusicModel LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;
    public final boolean LJ;
    public final String LJFF;
    public final String LJI;
    public final int LJII;
    public final int LJIIIIZZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof XV7)) {
            return false;
        }
        XV7 xv7 = (XV7) obj;
        return o.LJ(this.LIZ, xv7.LIZ) && o.LJ(this.LIZIZ, xv7.LIZIZ) && this.LIZJ == xv7.LIZJ && this.LIZLLL == xv7.LIZLLL && this.LJ == xv7.LJ && o.LJ(this.LJFF, xv7.LJFF) && o.LJ(this.LJI, xv7.LJI) && this.LJII == xv7.LJII && this.LJIIIIZZ == xv7.LJIIIIZZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode;
        MusicWaveBean musicWaveBean = this.LIZ;
        int i = 0;
        if (musicWaveBean == null) {
            hashCode = 0;
        } else {
            hashCode = musicWaveBean.hashCode();
        }
        int i2 = hashCode * 31;
        MusicModel musicModel = this.LIZIZ;
        if (musicModel != null) {
            i = musicModel.hashCode();
        }
        int i3 = (((((i2 + i) * 31) + this.LIZJ) * 31) + this.LIZLLL) * 31;
        boolean z = this.LJ;
        int i4 = z;
        if (z != 0) {
            i4 = 1;
        }
        return ((C79062V1e.LJ(this.LJI, C79062V1e.LJ(this.LJFF, (i3 + i4) * 31, 31), 31) + this.LJII) * 31) + this.LJIIIIZZ;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("MusicWaveRefreshData(waveBean=");
        LIZ.append(this.LIZ);
        LIZ.append(", musicModel=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", startTime=");
        LIZ.append(this.LIZJ);
        LIZ.append(", cutLength=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", isMusicLoop=");
        LIZ.append(this.LJ);
        LIZ.append(", musicEditedFrom=");
        LIZ.append(this.LJFF);
        LIZ.append(", musicPath=");
        LIZ.append(this.LJI);
        LIZ.append(", musicLength=");
        LIZ.append(this.LJII);
        LIZ.append(", trimmedMusicDuration=");
        return b0.LIZJ(LIZ, this.LJIIIIZZ, ')', LIZ);
    }

    public XV7(MusicWaveBean musicWaveBean, MusicModel musicModel, int i, int i2, String musicPath, int i3, int i4) {
        o.LJIIIZ(musicPath, "musicPath");
        this.LIZ = musicWaveBean;
        this.LIZIZ = musicModel;
        this.LIZJ = i;
        this.LIZLLL = i2;
        this.LJ = false;
        this.LJFF = "";
        this.LJI = musicPath;
        this.LJII = i3;
        this.LJIIIIZZ = i4;
    }
}
