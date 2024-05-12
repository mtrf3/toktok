package X;

import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class R8M extends AbstractC67056QTk {
    public final /* synthetic */ C45R<R54> LIZ;
    public final /* synthetic */ InterfaceC69056R8i LIZIZ;

    @Override // X.AbstractC67055QTj
    public final void onNeedSecureCaptcha(QQI response) {
        o.LJIIIZ(response, "response");
        ((C73516StE) this.LIZ).onError(new C69084R9k(response.LIZLLL, response.LJFF, EnumC69116RAq.SET_OR_RESET_PASSWORD, this.LIZIZ.LJLLLL(), null, null, 32, null));
    }

    @Override // X.AbstractC67055QTj
    public final void onSuccess(QQI response) {
        o.LJIIIZ(response, "response");
        ((C73516StE) this.LIZ).onSuccess(response);
    }

    public R8M(InterfaceC69056R8i interfaceC69056R8i, C73516StE c73516StE) {
        this.LIZ = c73516StE;
        this.LIZIZ = interfaceC69056R8i;
    }

    @Override // X.AbstractC67055QTj
    public final void onError(QQI response, int i) {
        o.LJIIIZ(response, "response");
        ((C73516StE) this.LIZ).onError(new C69084R9k(i, response.LJFF, EnumC69116RAq.SET_OR_RESET_PASSWORD, this.LIZIZ.LJLLLL(), null, null, 32, null));
    }

    @Override // X.AbstractC67055QTj
    public final void onNeedCaptcha(QQI response, String str) {
        o.LJIIIZ(response, "response");
        ((C73516StE) this.LIZ).onError(new C69084R9k(response.LIZLLL, response.LJFF, EnumC69116RAq.SET_OR_RESET_PASSWORD, this.LIZIZ.LJLLLL(), null, null, 32, null));
    }
}
