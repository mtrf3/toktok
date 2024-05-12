package X;

import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class R9J extends R4N {
    public final /* synthetic */ C45R<R40<R9W>> LIZ;
    public final /* synthetic */ InterfaceC69056R8i LIZIZ;
    public final /* synthetic */ String LIZJ;
    public final /* synthetic */ String LIZLLL;
    public final /* synthetic */ String LJ;

    @Override // X.AbstractC67055QTj
    /* renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final void onSuccess(R40<R9W> response) {
        o.LJIIIZ(response, "response");
        ((C73516StE) this.LIZ).onSuccess(response);
        C1JD.LJJIII(1, 0, this.LIZJ, this.LIZLLL, this.LJ);
    }

    @Override // X.AbstractC67055QTj
    public final void onNeedSecureCaptcha(QQI response) {
        o.LJIIIZ(response, "response");
        ((C73516StE) this.LIZ).onError(new C69084R9k(response.LIZLLL, response.LJFF, this.LIZIZ.scene(), this.LIZIZ.LJLLLL(), null, null, 32, null));
    }

    @Override // X.AbstractC67055QTj
    /* renamed from: LIZ, reason: merged with bridge method [inline-methods] */
    public final void onError(R40<R9W> r40, int i) {
        int i2;
        String str;
        int i3;
        C45R<R40<R9W>> c45r = this.LIZ;
        if (r40 != null) {
            i2 = r40.LIZLLL;
            str = r40.LJFF;
        } else {
            i2 = -10000;
            str = null;
        }
        ((C73516StE) c45r).onError(new C69084R9k(i2, str, this.LIZIZ.scene(), this.LIZIZ.LJLLLL(), C69093R9t.LJII(r40), null, 32, null));
        String str2 = this.LIZJ;
        String str3 = this.LIZLLL;
        String str4 = this.LJ;
        if (r40 != null) {
            i3 = r40.LIZLLL;
        } else {
            i3 = 0;
        }
        C1JD.LJJIII(0, i3, str2, str3, str4);
    }

    @Override // X.AbstractC67055QTj
    public final void onNeedCaptcha(QQI response, String str) {
        o.LJIIIZ(response, "response");
        ((C73516StE) this.LIZ).onError(new C69084R9k(response.LIZLLL, response.LJFF, this.LIZIZ.scene(), this.LIZIZ.LJLLLL(), null, null, 32, null));
    }

    public R9J(C73516StE c73516StE, InterfaceC69056R8i interfaceC69056R8i, String str, String str2, String str3) {
        this.LIZ = c73516StE;
        this.LIZIZ = interfaceC69056R8i;
        this.LIZJ = str;
        this.LIZLLL = str2;
        this.LJ = str3;
    }
}
