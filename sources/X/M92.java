package X;

import android.text.TextUtils;
import org.json.JSONObject;
import ujb.o;

/* loaded from: classes10.dex */
public final class M92 implements InterfaceC87880YeK {
    public final String LJLIL;
    public final String LJLILLLLZI;
    public final JSONObject LJLJI;

    @Override // X.InterfaceC87880YeK
    public final String LJLJJI() {
        return AnonymousClass629.LIZ("randomUUID().toString()");
    }

    @Override // X.InterfaceC87880YeK
    public final boolean LLILZLL() {
        if ((!o.LJJJJJL(this.LJLILLLLZI)) && TextUtils.isDigitsOnly(this.LJLILLLLZI) && (!o.LJJJJJL(this.LJLIL))) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC87880YeK
    public final String getRefer() {
        String optString = this.LJLJI.optString("refer");
        kotlin.jvm.internal.o.LJIIIIZZ(optString, "extJson.optString(CommercializeLogKey.REFER)");
        return optString;
    }

    @Override // X.InterfaceC87880YeK
    public final String getTag() {
        String optString = this.LJLJI.optString("tag");
        kotlin.jvm.internal.o.LJIIIIZZ(optString, "extJson.optString(CommercializeLogKey.TAG)");
        return optString;
    }

    public final int hashCode() {
        return this.LJLJI.hashCode() + C79062V1e.LJ(this.LJLILLLLZI, this.LJLIL.hashCode() * 31, 31);
    }

    @Override // X.InterfaceC87880YeK
    public final long getTimeStamp() {
        return System.currentTimeMillis();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ExtraJsonContextProvider(label=");
        LIZ.append(this.LJLIL);
        LIZ.append(", creativeId=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", extJson=");
        LIZ.append(this.LJLJI);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    @Override // X.InterfaceC87880YeK
    public final String LJ() {
        return this.LJLIL;
    }

    @Override // X.InterfaceC87880YeK
    public final String LJIJI() {
        return this.LJLILLLLZI;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof M92)) {
            return false;
        }
        M92 m92 = (M92) obj;
        if (kotlin.jvm.internal.o.LJ(this.LJLIL, m92.LJLIL) && kotlin.jvm.internal.o.LJ(this.LJLILLLLZI, m92.LJLILLLLZI) && kotlin.jvm.internal.o.LJ(this.LJLJI, m92.LJLJI)) {
            return true;
        }
        return false;
    }

    public M92(String label, String creativeId, JSONObject extJson) {
        kotlin.jvm.internal.o.LJIIIZ(label, "label");
        kotlin.jvm.internal.o.LJIIIZ(creativeId, "creativeId");
        kotlin.jvm.internal.o.LJIIIZ(extJson, "extJson");
        this.LJLIL = label;
        this.LJLILLLLZI = creativeId;
        this.LJLJI = extJson;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ads_");
        LIZ.append(C16880lQ.LJLLJ(M92.class));
        X1D.LIZIZ(LIZ);
    }
}
