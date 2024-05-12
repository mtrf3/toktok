package X;

import defpackage.q;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.2YV, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C2YV implements InterfaceC60152Xr {
    public final String LJLIL;
    public final String LJLILLLLZI;
    public final String LJLJI;

    @Override // X.InterfaceC54035LIp
    public final boolean LLD() {
        return true;
    }

    @Override // X.InterfaceC54035LIp
    public final java.util.Map<String, Object> LLLILZ() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("enter_method", this.LJLIL);
        linkedHashMap.put("target_lang", this.LJLILLLLZI);
        linkedHashMap.put("bio_card_lang", this.LJLJI);
        return linkedHashMap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2YV)) {
            return false;
        }
        C2YV c2yv = (C2YV) obj;
        return o.LJ(this.LJLIL, c2yv.LJLIL) && o.LJ(this.LJLILLLLZI, c2yv.LJLILLLLZI) && o.LJ(this.LJLJI, c2yv.LJLJI);
    }

    public final int hashCode() {
        int hashCode;
        String str = this.LJLIL;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int LJ = C79062V1e.LJ(this.LJLILLLLZI, hashCode * 31, 31);
        String str2 = this.LJLJI;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return LJ + i;
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
        LIZ.append("BioTranslationParams(enterMethod=");
        LIZ.append(this.LJLIL);
        LIZ.append(", targetLang=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", bioCardLang=");
        return q.LIZIZ(LIZ, this.LJLJI, ')', LIZ);
    }

    public C2YV(String str, String targetLang, String str2) {
        o.LJIIIZ(targetLang, "targetLang");
        this.LJLIL = str;
        this.LJLILLLLZI = targetLang;
        this.LJLJI = str2;
    }
}
