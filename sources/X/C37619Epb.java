package X;

import defpackage.b0;
import kotlin.jvm.internal.o;

/* renamed from: X.Epb, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37619Epb {
    public final int LIZ;
    public final Integer LIZIZ;
    public final String LIZJ;
    public final boolean LIZLLL;
    public final int LJ;

    public final int hashCode() {
        int i;
        int i2 = this.LIZ * 31;
        Integer num = this.LIZIZ;
        int i3 = 0;
        if (num != null) {
            i = num.intValue();
        } else {
            i = 0;
        }
        int i4 = (i2 + i) * 31;
        String str = this.LIZJ;
        if (str != null) {
            i3 = str.hashCode();
        }
        return ((i4 + i3) * 31) + (this.LIZLLL ? 1 : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("MusicListRequestParam(radioCursor=");
        LIZ.append(this.LIZ);
        LIZ.append(", radioCount=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", idsArrayJson=");
        LIZ.append(this.LIZJ);
        LIZ.append(", isCommerceMusic=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", soundPageScene=");
        return b0.LIZJ(LIZ, this.LJ, ')', LIZ);
    }

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!o.LJ(C37619Epb.class, cls)) {
            return false;
        }
        o.LJII(obj, "null cannot be cast to non-null type com.ss.android.ugc.aweme.choosemusic.model.data.MusicListRequestParam");
        C37619Epb c37619Epb = (C37619Epb) obj;
        if (this.LIZ == c37619Epb.LIZ && o.LJ(this.LIZIZ, c37619Epb.LIZIZ) && o.LJ(this.LIZJ, c37619Epb.LIZJ) && this.LIZLLL == c37619Epb.LIZLLL && this.LJ == c37619Epb.LJ) {
            return true;
        }
        return false;
    }

    public C37619Epb(int i, int i2, Integer num, String str, boolean z) {
        this.LIZ = i;
        this.LIZIZ = num;
        this.LIZJ = str;
        this.LIZLLL = z;
        this.LJ = i2;
    }
}
