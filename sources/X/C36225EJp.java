package X;

import kotlin.jvm.internal.o;

/* renamed from: X.EJp, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36225EJp implements InterfaceC116954iR<C76800UCe> {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ String LJLJJI;

    @Override // X.InterfaceC116954iR
    public final void onComplete() {
    }

    @Override // X.InterfaceC116954iR
    public final void onSubscribe(InterfaceC92693kP d) {
        o.LJIIIZ(d, "d");
    }

    @Override // X.InterfaceC116954iR
    public final void onError(Throwable e) {
        o.LJIIIZ(e, "e");
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("status", "failed");
        FMX.LJIIL("appsflyer_third_party_tracking", c188727au.LIZ);
    }

    @Override // X.InterfaceC116954iR
    public final void onNext(C76800UCe t) {
        o.LJIIIZ(t, "t");
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("status", "success");
        c188727au.LJIIIZ("media_source", this.LJLIL);
        c188727au.LJIIIZ("campaign", this.LJLILLLLZI);
        c188727au.LJIIIZ("cost_model", this.LJLJI);
        c188727au.LJIIIZ("click_lookBack", this.LJLJJI);
        FMX.LJIIL("appsflyer_third_party_tracking", c188727au.LIZ);
    }

    public C36225EJp(String str, String str2, String str3, String str4) {
        this.LJLIL = str;
        this.LJLILLLLZI = str2;
        this.LJLJI = str3;
        this.LJLJJI = str4;
    }
}
