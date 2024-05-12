package X;

import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class R8B extends AbstractC67056QTk {
    public final /* synthetic */ C45R<R54> LIZ;
    public final /* synthetic */ InterfaceC69056R8i LIZIZ;

    @Override // X.AbstractC67055QTj
    public final void onNeedSecureCaptcha(QQI response) {
        o.LJIIIZ(response, "response");
        ((C73516StE) this.LIZ).onError(new C69084R9k(response.LIZLLL, response.LJFF, EnumC69116RAq.SET_OR_RESET_PASSWORD, this.LIZIZ.LJLLLL(), null, null, 32, null));
    }

    @Override // X.AbstractC67055QTj
    public final void onSuccess(QQI qqi) {
        R6R response = (R6R) qqi;
        o.LJIIIZ(response, "response");
        if (response.LJIIIZ == null) {
            C69049R8b c69049R8b = C69084R9k.Companion;
            EnumC69116RAq enumC69116RAq = EnumC69116RAq.SET_OR_RESET_PASSWORD;
            EnumC69113RAn LJLLLL = this.LIZIZ.LJLLLL();
            c69049R8b.getClass();
            C69049R8b.LIZ(enumC69116RAq, LJLLLL);
            return;
        }
        ((C73516StE) this.LIZ).onSuccess(response);
    }

    public R8B(InterfaceC69056R8i interfaceC69056R8i, C73516StE c73516StE) {
        this.LIZ = c73516StE;
        this.LIZIZ = interfaceC69056R8i;
    }

    @Override // X.AbstractC67055QTj
    public final void onError(QQI qqi, int i) {
        String str;
        C45R<R54> c45r = this.LIZ;
        if (qqi != null) {
            str = qqi.LJFF;
        } else {
            str = null;
        }
        ((C73516StE) c45r).onError(new C69084R9k(i, str, EnumC69116RAq.SET_OR_RESET_PASSWORD, this.LIZIZ.LJLLLL(), null, null, 32, null));
    }

    @Override // X.AbstractC67055QTj
    public final void onNeedCaptcha(QQI response, String str) {
        o.LJIIIZ(response, "response");
        ((C73516StE) this.LIZ).onError(new C69084R9k(response.LIZLLL, response.LJFF, EnumC69116RAq.SET_OR_RESET_PASSWORD, this.LIZIZ.LJLLLL(), null, null, 32, null));
    }
}
