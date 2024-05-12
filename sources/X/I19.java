package X;

import com.ss.android.ugc.aweme.shortvideo.AVMusic;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class I19 {
    public Effect LIZ;
    public AVMusic LIZIZ;
    public String LIZJ;
    public boolean LIZLLL;
    public boolean LJ;
    public boolean LJFF;

    public I19() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof I19)) {
            return false;
        }
        I19 i19 = (I19) obj;
        return o.LJ(this.LIZ, i19.LIZ) && o.LJ(this.LIZIZ, i19.LIZIZ) && o.LJ(this.LIZJ, i19.LIZJ) && this.LIZLLL == i19.LIZLLL && this.LJ == i19.LJ && this.LJFF == i19.LJFF;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        Effect effect = this.LIZ;
        int hashCode = (effect == null ? 0 : effect.hashCode()) * 31;
        AVMusic aVMusic = this.LIZIZ;
        int hashCode2 = (hashCode + (aVMusic == null ? 0 : aVMusic.hashCode())) * 31;
        String str = this.LIZJ;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 31;
        boolean z = this.LIZLLL;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode3 + i) * 31;
        boolean z2 = this.LJ;
        int i3 = z2;
        if (z2 != 0) {
            i3 = 1;
        }
        return ((i2 + i3) * 31) + (this.LJFF ? 1 : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("LoadResult(effect=");
        LIZ.append(this.LIZ);
        LIZ.append(", avMusic=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", musicFile=");
        LIZ.append(this.LIZJ);
        LIZ.append(", musicDone=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", effectDone=");
        LIZ.append(this.LJ);
        LIZ.append(", musicInvalid=");
        return C48339Iy7.LIZJ(LIZ, this.LJFF, ')', LIZ);
    }

    public I19(int i) {
        this.LIZ = null;
        this.LIZIZ = null;
        this.LIZJ = null;
        this.LIZLLL = false;
        this.LJ = false;
        this.LJFF = false;
    }
}
