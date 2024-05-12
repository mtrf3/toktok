package X;

import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class R8C extends R4M {
    public final /* synthetic */ C45R<R40<R7E>> LIZ;
    public final /* synthetic */ EnumC69113RAn LIZIZ;

    @Override // X.R4M
    /* renamed from: LIZIZ */
    public final void onSuccess(R40<R7E> r40) {
        super.onSuccess(r40);
        if (r40 != null) {
            ((C73516StE) this.LIZ).onSuccess(r40);
        }
    }

    @Override // X.AbstractC67055QTj
    public final void onNeedSecureCaptcha(QQI response) {
        o.LJIIIZ(response, "response");
        ((C73516StE) this.LIZ).onError(new C69084R9k(response.LIZLLL, response.LJFF, EnumC69116RAq.LOGIN, this.LIZIZ, null, null, 32, null));
    }

    public R8C(C73516StE c73516StE, EnumC69113RAn enumC69113RAn) {
        this.LIZ = c73516StE;
        this.LIZIZ = enumC69113RAn;
    }

    @Override // X.R4M
    /* renamed from: LIZ */
    public final void onError(R40<R7E> r40, int i) {
        int i2;
        String str;
        super.onError(r40, i);
        C45R<R40<R7E>> c45r = this.LIZ;
        if (r40 != null) {
            i2 = r40.LIZLLL;
            str = r40.LJFF;
        } else {
            i2 = -10000;
            str = null;
        }
        ((C73516StE) c45r).onError(new C69084R9k(i2, str, EnumC69116RAq.LOGIN, this.LIZIZ, C69093R9t.LJII(r40), null, 32, null));
    }

    @Override // X.AbstractC67055QTj
    public final void onNeedCaptcha(QQI response, String captcha) {
        o.LJIIIZ(response, "response");
        o.LJIIIZ(captcha, "captcha");
        ((C73516StE) this.LIZ).onError(new C69084R9k(response.LIZLLL, response.LJFF, EnumC69116RAq.LOGIN, this.LIZIZ, null, null, 32, null));
    }
}
