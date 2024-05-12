package X;

import android.text.TextUtils;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class M94 extends F9E implements InterfaceC87880YeK {
    public final String LJLIL;
    public final java.util.Map<String, Object> LJLILLLLZI;
    public final M95 LJLJI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI, this.LJLJI};
    }

    @Override // X.InterfaceC87880YeK
    public final String LJ() {
        C58653N0f c58653N0f;
        String str;
        M95 m95 = this.LJLJI;
        o.LJIIIZ(m95, "<this>");
        Object LIZ = m95.LIZ(InterfaceC58626Mze.class);
        if (!(LIZ instanceof C58653N0f) || (c58653N0f = (C58653N0f) LIZ) == null || (str = c58653N0f.LIZIZ) == null) {
            return "";
        }
        return str;
    }

    @Override // X.InterfaceC87880YeK
    public final String LJIJI() {
        String str;
        Object obj = this.LJLILLLLZI.get("value");
        if (!(obj instanceof String) || (str = (String) obj) == null) {
            return "";
        }
        return str;
    }

    @Override // X.InterfaceC87880YeK
    public final String LJLJJI() {
        return AnonymousClass629.LIZ("randomUUID().toString()");
    }

    @Override // X.InterfaceC87880YeK
    public final String getRefer() {
        String str;
        Object obj = this.LJLILLLLZI.get("refer");
        if (!(obj instanceof String) || (str = (String) obj) == null) {
            return "";
        }
        return str;
    }

    @Override // X.InterfaceC87880YeK
    public final String getTag() {
        String str;
        Object obj = this.LJLILLLLZI.get("tag");
        if (!(obj instanceof String) || (str = (String) obj) == null) {
            return "";
        }
        return str;
    }

    @Override // X.InterfaceC87880YeK
    public final boolean LLILZLL() {
        if ((!ujb.o.LJJJJJL(LJIJI())) && TextUtils.isDigitsOnly(LJIJI()) && (!ujb.o.LJJJJJL(LJ()))) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC87880YeK
    public final long getTimeStamp() {
        return System.currentTimeMillis();
    }

    public M94(M95 contexts, String eventName, java.util.Map params) {
        o.LJIIIZ(eventName, "eventName");
        o.LJIIIZ(params, "params");
        o.LJIIIZ(contexts, "contexts");
        this.LJLIL = eventName;
        this.LJLILLLLZI = params;
        this.LJLJI = contexts;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ads_");
        LIZ.append(C16880lQ.LJLLJ(M94.class));
        X1D.LIZIZ(LIZ);
    }
}
