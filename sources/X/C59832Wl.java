package X;

import kotlin.jvm.internal.o;

/* renamed from: X.2Wl, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C59832Wl {
    public final java.util.Map<String, Object> LIZ;
    public final String LIZIZ;
    public final boolean LIZJ;
    public final EnumC61862bm LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C59832Wl)) {
            return false;
        }
        C59832Wl c59832Wl = (C59832Wl) obj;
        return o.LJ(this.LIZ, c59832Wl.LIZ) && o.LJ(this.LIZIZ, c59832Wl.LIZIZ) && this.LIZJ == c59832Wl.LIZJ && this.LIZLLL == c59832Wl.LIZLLL;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = this.LIZ.hashCode() * 31;
        String str = this.LIZIZ;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        boolean z = this.LIZJ;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return this.LIZLLL.hashCode() + ((hashCode2 + i) * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("FirstScreenModel(data=");
        LIZ.append(this.LIZ);
        LIZ.append(", templateDataState=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", asyncUpdate=");
        LIZ.append(this.LIZJ);
        LIZ.append(", firstScreenType=");
        LIZ.append(this.LIZLLL);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C59832Wl(java.util.Map<String, ? extends Object> map, String str, boolean z, EnumC61862bm firstScreenType) {
        o.LJIIIZ(firstScreenType, "firstScreenType");
        this.LIZ = map;
        this.LIZIZ = str;
        this.LIZJ = z;
        this.LIZLLL = firstScreenType;
    }
}
