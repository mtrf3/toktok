package X;

import defpackage.b0;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class ELP implements InterfaceC60152Xr {
    public final String LJLIL;
    public final String LJLILLLLZI;
    public final String LJLJI;
    public final String LJLJJI;
    public final String LJLJJL;
    public final int LJLJJLL;
    public final int LJLJL;
    public final int LJLJLJ;

    @Override // X.InterfaceC54035LIp
    public final boolean LLD() {
        return true;
    }

    @Override // X.InterfaceC54035LIp
    public final java.util.Map<String, Object> LLLILZ() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("subtitle_id", this.LJLIL);
        linkedHashMap.put("target_language", this.LJLILLLLZI);
        linkedHashMap.put("caption_original_language", this.LJLJI);
        linkedHashMap.put("caption_type", this.LJLJJI);
        linkedHashMap.put("trigger_method", this.LJLJJL);
        linkedHashMap.put("is_first_time", Integer.valueOf(this.LJLJJLL));
        linkedHashMap.put("is_preload", Integer.valueOf(this.LJLJL));
        linkedHashMap.put("is_lazy_load", Integer.valueOf(this.LJLJLJ));
        return linkedHashMap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ELP)) {
            return false;
        }
        ELP elp = (ELP) obj;
        return o.LJ(this.LJLIL, elp.LJLIL) && o.LJ(this.LJLILLLLZI, elp.LJLILLLLZI) && o.LJ(this.LJLJI, elp.LJLJI) && o.LJ(this.LJLJJI, elp.LJLJJI) && o.LJ(this.LJLJJL, elp.LJLJJL) && this.LJLJJLL == elp.LJLJJLL && this.LJLJL == elp.LJLJL && this.LJLJLJ == elp.LJLJLJ;
    }

    public final int hashCode() {
        int hashCode;
        int LJ = C79062V1e.LJ(this.LJLILLLLZI, this.LJLIL.hashCode() * 31, 31);
        String str = this.LJLJI;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return ((((C79062V1e.LJ(this.LJLJJL, C79062V1e.LJ(this.LJLJJI, (LJ + hashCode) * 31, 31), 31) + this.LJLJJLL) * 31) + this.LJLJL) * 31) + this.LJLJLJ;
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
        LIZ.append("PerfCaptionLoadStartParams(subtitleId=");
        LIZ.append(this.LJLIL);
        LIZ.append(", targetLanguage=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", captionOriginalLanguage=");
        LIZ.append(this.LJLJI);
        LIZ.append(", captionType=");
        LIZ.append(this.LJLJJI);
        LIZ.append(", triggerMethod=");
        LIZ.append(this.LJLJJL);
        LIZ.append(", isFirstLoad=");
        LIZ.append(this.LJLJJLL);
        LIZ.append(", isPreload=");
        LIZ.append(this.LJLJL);
        LIZ.append(", isLazyload=");
        return b0.LIZJ(LIZ, this.LJLJLJ, ')', LIZ);
    }

    public ELP(String str, String str2, int i, String str3, String str4, String str5, int i2) {
        C43588H8u.LIZLLL(str, "subtitleId", str2, "targetLanguage", str4, "captionType", str5, "triggerMethod");
        this.LJLIL = str;
        this.LJLILLLLZI = str2;
        this.LJLJI = str3;
        this.LJLJJI = str4;
        this.LJLJJL = str5;
        this.LJLJJLL = i;
        this.LJLJL = 0;
        this.LJLJLJ = i2;
    }
}
