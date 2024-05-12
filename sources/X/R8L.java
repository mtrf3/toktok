package X;

import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class R8L extends AbstractC68940R3w {
    public final /* synthetic */ C45R<C69025R7d> LIZ;
    public final /* synthetic */ InterfaceC69056R8i LIZIZ;

    @Override // X.AbstractC67055QTj
    public final void onNeedSecureCaptcha(QQI response) {
        o.LJIIIZ(response, "response");
        ((C73516StE) this.LIZ).onError(new C69084R9k(response.LIZLLL, response.LJFF, this.LIZIZ.scene(), this.LIZIZ.LJLLLL(), null, null, 32, null));
    }

    @Override // X.AbstractC67055QTj
    public final void onSuccess(QQI response) {
        o.LJIIIZ(response, "response");
        ((C73516StE) this.LIZ).onSuccess(response);
    }

    public R8L(InterfaceC69056R8i interfaceC69056R8i, C73516StE c73516StE) {
        this.LIZ = c73516StE;
        this.LIZIZ = interfaceC69056R8i;
    }

    @Override // X.AbstractC67055QTj
    public final void onError(QQI qqi, int i) {
        String str;
        C45R<C69025R7d> c45r = this.LIZ;
        if (qqi != null) {
            str = qqi.LJFF;
        } else {
            str = null;
        }
        ((C73516StE) c45r).onError(new C69084R9k(i, str, this.LIZIZ.scene(), this.LIZIZ.LJLLLL(), null, null, 32, null));
    }

    @Override // X.AbstractC67055QTj
    public final void onNeedCaptcha(QQI response, String str) {
        o.LJIIIZ(response, "response");
        ((C73516StE) this.LIZ).onError(new C69084R9k(response.LIZLLL, response.LJFF, this.LIZIZ.scene(), this.LIZIZ.LJLLLL(), null, null, 32, null));
    }
}
