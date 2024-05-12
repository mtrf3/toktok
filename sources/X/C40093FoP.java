package X;

import android.webkit.WebView;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.core.router.EcomSparkSubCartInterceptor$handleSparkContext$1$onActivityPostResumed$1", f = "EcomSparkSubCartInterceptor.kt", l = {BaseNotice.CREATOR}, m = "invokeSuspend")
/* renamed from: X.FoP, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40093FoP extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;

    public C40093FoP(InterfaceC67352kd<? super C40093FoP> interfaceC67352kd) {
        super(2, interfaceC67352kd);
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C40093FoP(interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        if (i != 0) {
            if (i == 1) {
                C141335gf.LIZJ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj);
            this.LJLIL = 1;
            if (XJ9.LIZ(this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        if (!C73702us.LIZIZ) {
            long currentTimeMillis = System.currentTimeMillis();
            WebView webView = new WebView(FKM.LIZ());
            webView.loadDataWithBaseURL(null, "", "text/html", "utf-8", null);
            webView.destroy();
            C76542zS.LIZJ("rd_tiktokec_warm_webview", new C28018Az8("cart", System.currentTimeMillis() - currentTimeMillis));
            C73702us.LIZIZ = true;
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return new C40093FoP(interfaceC67352kd).invokeSuspend(C76800UCe.LIZ);
    }
}
