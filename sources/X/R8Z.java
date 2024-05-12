package X;

import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class R8Z extends AbstractC68940R3w {
    public final /* synthetic */ C45R<C69014R6s> LIZ;
    public final /* synthetic */ EnumC69116RAq LIZIZ;
    public final /* synthetic */ EnumC69113RAn LIZJ;

    @Override // X.AbstractC67055QTj
    public final void onNeedSecureCaptcha(QQI response) {
        o.LJIIIZ(response, "response");
        ((C73516StE) this.LIZ).onError(new C69084R9k(response.LIZLLL, response.LJFF, this.LIZIZ, this.LIZJ, null, null, 32, null));
    }

    @Override // X.AbstractC67055QTj
    public final void onSuccess(QQI response) {
        o.LJIIIZ(response, "response");
        ((C73516StE) this.LIZ).onSuccess(response);
    }

    @Override // X.AbstractC67055QTj
    public final void onError(QQI response, int i) {
        o.LJIIIZ(response, "response");
        ((C73516StE) this.LIZ).onError(new C69084R9k(response.LIZLLL, response.LJFF, this.LIZIZ, this.LIZJ, null, null, 32, null));
    }

    @Override // X.AbstractC67055QTj
    public final void onNeedCaptcha(QQI response, String str) {
        o.LJIIIZ(response, "response");
        ((C73516StE) this.LIZ).onError(new C69084R9k(response.LIZLLL, response.LJFF, this.LIZIZ, this.LIZJ, null, null, 32, null));
    }

    public R8Z(C73516StE c73516StE, EnumC69116RAq enumC69116RAq, EnumC69113RAn enumC69113RAn) {
        this.LIZ = c73516StE;
        this.LIZIZ = enumC69116RAq;
        this.LIZJ = enumC69113RAn;
    }
}
