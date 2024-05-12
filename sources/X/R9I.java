package X;

import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class R9I extends R4N {
    public final /* synthetic */ C45R<R40<R9X>> LIZ;
    public final /* synthetic */ InterfaceC69056R8i LIZIZ;

    @Override // X.AbstractC67055QTj
    /* renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final void onSuccess(R40<R9X> response) {
        o.LJIIIZ(response, "response");
        ((C73516StE) this.LIZ).onSuccess(response);
    }

    @Override // X.AbstractC67055QTj
    public final void onNeedSecureCaptcha(QQI response) {
        o.LJIIIZ(response, "response");
        ((C73516StE) this.LIZ).onError(new C69084R9k(response.LIZLLL, response.LJFF, this.LIZIZ.scene(), this.LIZIZ.LJLLLL(), null, null, 32, null));
    }

    public R9I(InterfaceC69056R8i interfaceC69056R8i, C73516StE c73516StE) {
        this.LIZ = c73516StE;
        this.LIZIZ = interfaceC69056R8i;
    }

    @Override // X.AbstractC67055QTj
    /* renamed from: LIZ, reason: merged with bridge method [inline-methods] */
    public final void onError(R40<R9X> r40, int i) {
        int i2;
        String str;
        C45R<R40<R9X>> c45r = this.LIZ;
        if (r40 != null) {
            i2 = r40.LIZLLL;
            str = r40.LJFF;
        } else {
            i2 = -10000;
            str = null;
        }
        ((C73516StE) c45r).onError(new C69084R9k(i2, str, this.LIZIZ.scene(), this.LIZIZ.LJLLLL(), C69093R9t.LJII(r40), null, 32, null));
    }

    @Override // X.AbstractC67055QTj
    public final void onNeedCaptcha(QQI response, String str) {
        o.LJIIIZ(response, "response");
        ((C73516StE) this.LIZ).onError(new C69084R9k(response.LIZLLL, response.LJFF, this.LIZIZ.scene(), this.LIZIZ.LJLLLL(), null, null, 32, null));
    }
}
