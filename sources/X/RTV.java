package X;

import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class RTV {
    public final RTW LIZ;
    public final String LIZIZ;
    public final String LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RTV)) {
            return false;
        }
        RTV rtv = (RTV) obj;
        return o.LJ(this.LIZ, rtv.LIZ) && o.LJ(this.LIZIZ, rtv.LIZIZ) && o.LJ(this.LIZJ, rtv.LIZJ);
    }

    public final int hashCode() {
        RTW rtw = this.LIZ;
        int hashCode = (rtw != null ? rtw.hashCode() : 0) * 31;
        String str = this.LIZIZ;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.LIZJ;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Page(meta=");
        LIZ.append(this.LIZ);
        LIZ.append(", name=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", displayName=");
        return JBR.LJFF(LIZ, this.LIZJ, ")", LIZ);
    }

    public RTV(RTW meta) {
        String displayName = meta.LIZ;
        o.LJIIIZ(meta, "meta");
        o.LJIIIZ(displayName, "name");
        o.LJIIIZ(displayName, "displayName");
        this.LIZ = meta;
        this.LIZIZ = displayName;
        this.LIZJ = displayName;
    }
}
