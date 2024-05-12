package X;

import kotlin.jvm.internal.o;

/* renamed from: X.NBr, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58951NBr extends AbstractC58948NBo {
    public final int LIZ;
    public final java.util.Map<String, Object> LIZIZ;
    public final int LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final java.util.Map<String, Object> LJFF;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C58951NBr)) {
            return false;
        }
        C58951NBr c58951NBr = (C58951NBr) obj;
        return this.LIZ == c58951NBr.LIZ && o.LJ(this.LIZIZ, c58951NBr.LIZIZ);
    }

    public final int hashCode() {
        return this.LIZIZ.hashCode() + (this.LIZ * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Tap(touchNumber=");
        LIZ.append(this.LIZ);
        LIZ.append(", tapParams=");
        return C15890jp.LIZ(LIZ, this.LIZIZ, ')', LIZ);
    }

    public C58951NBr(int i, java.util.Map<String, ? extends Object> tapParams) {
        o.LJIIIZ(tapParams, "tapParams");
        this.LIZ = i;
        this.LIZIZ = tapParams;
        Object obj = tapParams.get(EnumC58952NBs.ENTER_FROM.getRName());
        o.LJII(obj, "null cannot be cast to non-null type kotlin.Int");
        this.LIZJ = ((Integer) obj).intValue();
        Object obj2 = tapParams.get(EnumC58952NBs.REFER.getRName());
        o.LJII(obj2, "null cannot be cast to non-null type kotlin.String");
        this.LIZLLL = (String) obj2;
        Object obj3 = tapParams.get(EnumC58952NBs.TAG.getRName());
        o.LJII(obj3, "null cannot be cast to non-null type kotlin.String");
        this.LJ = (String) obj3;
        Object obj4 = tapParams.get(EnumC58952NBs.AD_EXTRA_DATA.getRName());
        o.LJII(obj4, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any?>");
        this.LJFF = (java.util.Map) obj4;
    }
}
