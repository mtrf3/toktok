package X;

import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class R8H extends R4N {
    public final /* synthetic */ C45R<R7X> LIZ;
    public final /* synthetic */ EnumC69116RAq LIZIZ;
    public final /* synthetic */ EnumC69113RAn LIZJ;

    @Override // X.AbstractC67055QTj
    /* renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final void onSuccess(R40<R7X> response) {
        o.LJIIIZ(response, "response");
        ((C73516StE) this.LIZ).onSuccess(response.LJIIIZ);
    }

    @Override // X.AbstractC67055QTj
    public final void onNeedSecureCaptcha(QQI response) {
        o.LJIIIZ(response, "response");
        ((C73516StE) this.LIZ).onError(new C69084R9k(response.LIZLLL, response.LJFF, this.LIZIZ, this.LIZJ, null, null, 32, null));
    }

    @Override // X.AbstractC67055QTj
    /* renamed from: LIZ, reason: merged with bridge method [inline-methods] */
    public final void onError(R40<R7X> r40, int i) {
        int i2;
        String str;
        C45R<R7X> c45r = this.LIZ;
        if (r40 != null) {
            i2 = r40.LIZLLL;
            str = r40.LJFF;
        } else {
            i2 = -10000;
            str = null;
        }
        ((C73516StE) c45r).onError(new C69084R9k(i2, str, this.LIZIZ, this.LIZJ, null, null, 32, null));
    }

    @Override // X.AbstractC67055QTj
    public final void onNeedCaptcha(QQI response, String str) {
        o.LJIIIZ(response, "response");
        ((C73516StE) this.LIZ).onError(new C69084R9k(response.LIZLLL, response.LJFF, this.LIZIZ, this.LIZJ, null, null, 32, null));
    }

    public R8H(C73516StE c73516StE, EnumC69116RAq enumC69116RAq, EnumC69113RAn enumC69113RAn) {
        this.LIZ = c73516StE;
        this.LIZIZ = enumC69116RAq;
        this.LIZJ = enumC69113RAn;
    }
}
