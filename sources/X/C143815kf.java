package X;

import com.ss.android.ugc.aweme.shortvideo.AVMusic;
import kotlin.jvm.internal.o;

/* renamed from: X.5kf, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C143815kf {
    public final AVMusic LIZ;
    public final String LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;
    public final float LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C143815kf)) {
            return false;
        }
        C143815kf c143815kf = (C143815kf) obj;
        return o.LJ(this.LIZ, c143815kf.LIZ) && o.LJ(this.LIZIZ, c143815kf.LIZIZ) && this.LIZJ == c143815kf.LIZJ && this.LIZLLL == c143815kf.LIZLLL && Float.compare(this.LJ, c143815kf.LJ) == 0;
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
        int i2 = hashCode * 31;
        String str = this.LIZIZ;
        if (str != null) {
            i = str.hashCode();
        }
        return Float.floatToIntBits(this.LJ) + ((((((i2 + i) * 31) + this.LIZJ) * 31) + this.LIZLLL) * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("OriginMusicData(avMusic=");
        LIZ.append(this.LIZ);
        LIZ.append(", musicPath=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", musicStart=");
        LIZ.append(this.LIZJ);
        LIZ.append(", musicDuration=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", musicVolume=");
        return C74221TAz.LIZLLL(LIZ, this.LJ, ')', LIZ);
    }

    public C143815kf(AVMusic aVMusic, String str, int i, int i2, float f) {
        this.LIZ = aVMusic;
        this.LIZIZ = str;
        this.LIZJ = i;
        this.LIZLLL = i2;
        this.LJ = f;
    }
}
