package X;

import defpackage.q;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.2Xh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C60052Xh implements InterfaceC60152Xr {
    public final String LJLIL;
    public final String LJLILLLLZI;

    @Override // X.InterfaceC54035LIp
    public final boolean LLD() {
        return true;
    }

    @Override // X.InterfaceC54035LIp
    public final java.util.Map<String, Object> LLLILZ() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("enter_method", this.LJLIL);
        linkedHashMap.put("captions_unavailable_reason", this.LJLILLLLZI);
        return linkedHashMap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C60052Xh)) {
            return false;
        }
        C60052Xh c60052Xh = (C60052Xh) obj;
        return o.LJ(this.LJLIL, c60052Xh.LJLIL) && o.LJ(this.LJLILLLLZI, c60052Xh.LJLILLLLZI);
    }

    public final int hashCode() {
        int hashCode = this.LJLIL.hashCode() * 31;
        String str = this.LJLILLLLZI;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    @Override // X.InterfaceC54035LIp
    public final java.util.Map<String, Object> LLJZ() {
        return LLLILZ();
    }

    @Override // X.InterfaceC54035LIp
    public final java.util.Map<String, Object> LLLLIL() {
        return C113554cx.LJJJLIIL();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CaptionSheetParams(enterMethod=");
        LIZ.append(this.LJLIL);
        LIZ.append(", captionUnavailableReason=");
        return q.LIZIZ(LIZ, this.LJLILLLLZI, ')', LIZ);
    }

    public C60052Xh(String enterMethod, String str) {
        o.LJIIIZ(enterMethod, "enterMethod");
        this.LJLIL = enterMethod;
        this.LJLILLLLZI = str;
    }
}
