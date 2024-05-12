package X;

import java.text.DecimalFormat;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class NFK {
    public final String LIZ;
    public final String LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;
    public final String LJ;
    public final String LJFF;
    public final N4Z LJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NFK)) {
            return false;
        }
        NFK nfk = (NFK) obj;
        return o.LJ(this.LIZ, nfk.LIZ) && o.LJ(this.LIZIZ, nfk.LIZIZ) && this.LIZJ == nfk.LIZJ && this.LIZLLL == nfk.LIZLLL && o.LJ(this.LJ, nfk.LJ) && o.LJ(this.LJFF, nfk.LJFF) && this.LJI == nfk.LJI;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("RecommendMusicCardUiState(titleName=");
        LIZ.append(this.LIZ);
        LIZ.append(", artistName=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", musicDurationSec=");
        LIZ.append(this.LIZJ);
        LIZ.append(", musicShootCount=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", recommendFromTag=");
        LIZ.append(this.LJ);
        LIZ.append(", coverUrl=");
        LIZ.append(this.LJFF);
        LIZ.append(", playButtonState=");
        LIZ.append(this.LJI);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final String LIZ() {
        int i = this.LIZJ;
        return C63144OqK.LIZIZ(new Object[]{Integer.valueOf(i / 60), Integer.valueOf(i % 60)}, 2, null, "%02d:%02d", "format(locale, format, *args)");
    }

    public final String LIZIZ() {
        int LJIIL = C78842Uww.LJIIL((int) Math.floor(Math.log10(this.LIZLLL) / 3), 0, 4);
        String str = new String[]{"", "K", "M", "B", "T"}[LJIIL];
        if (str.length() == 0) {
            return String.valueOf(this.LIZLLL);
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(new DecimalFormat("#0.0").format(this.LIZLLL / Math.pow(10.0d, LJIIL * 3.0d)));
        LIZ.append(str);
        return X1D.LIZIZ(LIZ);
    }

    public final int hashCode() {
        int hashCode;
        int LJ = (((C79062V1e.LJ(this.LIZIZ, this.LIZ.hashCode() * 31, 31) + this.LIZJ) * 31) + this.LIZLLL) * 31;
        String str = this.LJ;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (LJ + hashCode) * 31;
        String str2 = this.LJFF;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return this.LJI.hashCode() + ((i2 + i) * 31);
    }

    public NFK(String str, String str2, int i, int i2, String str3, String str4, N4Z playButtonState) {
        o.LJIIIZ(playButtonState, "playButtonState");
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = i;
        this.LIZLLL = i2;
        this.LJ = str3;
        this.LJFF = str4;
        this.LJI = playButtonState;
    }
}
