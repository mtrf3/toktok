package X;

import com.ss.android.ugc.aweme.account.login.auth.ui.ru_instant_login.GetVendorInfoResponse;
import kotlin.jvm.internal.o;

/* renamed from: X.WdQ, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82728WdQ<T, R> implements InterfaceC48038ItG {
    public final /* synthetic */ String LJLIL;

    public C82728WdQ(String str) {
        this.LJLIL = str;
    }

    @Override // X.InterfaceC48038ItG
    public final Object apply(Object obj) {
        GetVendorInfoResponse it = (GetVendorInfoResponse) obj;
        o.LJIIIZ(it, "it");
        if (it.data != null && (!r0.isEmpty())) {
            C82727WdP.LIZIZ.put(C82727WdP.LIZJ(), it.data);
        }
        GetVendorInfoResponse.VendorInfo LIZIZ = C82727WdP.LIZIZ(this.LJLIL, C82727WdP.LIZIZ.get(C82727WdP.LIZJ()));
        if (LIZIZ != null) {
            return AbstractC73638SvC.LJIJ(LIZIZ);
        }
        return AbstractC73638SvC.LJIILJJIL(new Throwable("get vendor info error"));
    }
}
