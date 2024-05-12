package X;

import com.zhiliaoapp.musically.R;
import defpackage.q;
import kotlin.jvm.internal.o;

/* renamed from: X.5SM, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5SM {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;

    public C5SM() {
        this(null, null, null, null, 31);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5SM)) {
            return false;
        }
        C5SM c5sm = (C5SM) obj;
        return o.LJ(this.LIZ, c5sm.LIZ) && o.LJ(this.LIZIZ, c5sm.LIZIZ) && o.LJ(this.LIZJ, c5sm.LIZJ) && o.LJ(this.LIZLLL, c5sm.LIZLLL) && o.LJ(this.LJ, c5sm.LJ);
    }

    public final int hashCode() {
        int hashCode;
        String str = this.LIZ;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = hashCode * 31;
        String str2 = this.LIZIZ;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return this.LJ.hashCode() + C79062V1e.LJ(this.LIZLLL, C79062V1e.LJ(this.LIZJ, (i2 + i) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("UIElements(playPath=");
        LIZ.append(this.LIZ);
        LIZ.append(", gameplayAlgorithm=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", titleStr=");
        LIZ.append(this.LIZJ);
        LIZ.append(", contentStr=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", confirmStr=");
        return q.LIZIZ(LIZ, this.LJ, ')', LIZ);
    }

    public C5SM(String str, String str2, String str3, String str4, int i) {
        String str5 = str4;
        String str6 = str2;
        String str7 = str3;
        str = (i & 1) != 0 ? null : str;
        if ((i & 4) != 0) {
            str6 = C60903NvH.LJ.getString(R.string.cil);
            o.LJIIIIZZ(str6, "getApplication().getStri…(R.string.cc_official_tt)");
        }
        if ((i & 8) != 0) {
            str7 = C60903NvH.LJ.getString(R.string.dfq);
            o.LJIIIIZZ(str7, "getApplication().getStri…lick_go_cc_local_tt_file)");
        }
        if ((i & 16) != 0) {
            str5 = C60903NvH.LJ.getString(R.string.grx);
            o.LJIIIIZZ(str5, "getApplication().getString(R.string.go_cc)");
        }
        HH1.LIZ(str6, "titleStr", str7, "contentStr", str5, "confirmStr");
        this.LIZ = str;
        this.LIZIZ = null;
        this.LIZJ = str6;
        this.LIZLLL = str7;
        this.LJ = str5;
    }
}
