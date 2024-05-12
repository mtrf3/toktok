package X;

import kotlin.jvm.internal.o;

/* renamed from: X.0jq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15900jq {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final java.util.Map<String, Object> LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15900jq)) {
            return false;
        }
        C15900jq c15900jq = (C15900jq) obj;
        return o.LJ(this.LIZ, c15900jq.LIZ) && o.LJ(this.LIZIZ, c15900jq.LIZIZ) && o.LJ(this.LIZJ, c15900jq.LIZJ) && o.LJ(this.LIZLLL, c15900jq.LIZLLL);
    }

    public final int hashCode() {
        int hashCode;
        int LJ = C79062V1e.LJ(this.LIZIZ, this.LIZ.hashCode() * 31, 31);
        String str = this.LIZJ;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (LJ + hashCode) * 31;
        java.util.Map<String, Object> map = this.LIZLLL;
        if (map != null) {
            i = map.hashCode();
        }
        return i2 + i;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("JSBSendGiftEventData(giftEnterSource=");
        LIZ.append(this.LIZ);
        LIZ.append(", giftEnterMethod=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", giftEnterPage=");
        LIZ.append(this.LIZJ);
        LIZ.append(", giftExtra=");
        return C15890jp.LIZ(LIZ, this.LIZLLL, ')', LIZ);
    }

    public C15900jq(String giftEnterSource, String giftEnterMethod, String str, java.util.Map<String, ? extends Object> map) {
        o.LJIIIZ(giftEnterSource, "giftEnterSource");
        o.LJIIIZ(giftEnterMethod, "giftEnterMethod");
        this.LIZ = giftEnterSource;
        this.LIZIZ = giftEnterMethod;
        this.LIZJ = str;
        this.LIZLLL = map;
    }
}
