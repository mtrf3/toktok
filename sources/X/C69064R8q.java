package X;

import kotlin.jvm.internal.o;

/* renamed from: X.R8q, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C69064R8q extends R4O {
    public final /* synthetic */ C45R<R40<C69073R8z>> LIZ;
    public final /* synthetic */ InterfaceC69056R8i LIZIZ;

    @Override // X.AbstractC67055QTj
    /* renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final void onSuccess(R40<C69073R8z> response) {
        o.LJIIIZ(response, "response");
        C69073R8z c69073R8z = response.LJIIIZ;
        if (c69073R8z != null && c69073R8z.LJFF != null) {
            ((C73516StE) this.LIZ).onSuccess(response);
            return;
        }
        C45R<R40<C69073R8z>> c45r = this.LIZ;
        C69049R8b c69049R8b = C69084R9k.Companion;
        EnumC69116RAq scene = this.LIZIZ.scene();
        EnumC69113RAn LJLLLL = this.LIZIZ.LJLLLL();
        c69049R8b.getClass();
        ((C73516StE) c45r).onError(C69049R8b.LIZ(scene, LJLLLL));
    }

    @Override // X.AbstractC67055QTj
    public final void onNeedSecureCaptcha(QQI response) {
        o.LJIIIZ(response, "response");
        super.onNeedSecureCaptcha(response);
        ((C73516StE) this.LIZ).onError(new C69084R9k(response.LIZLLL, response.LJFF, this.LIZIZ.scene(), this.LIZIZ.LJLLLL(), null, null, 32, null));
    }

    public C69064R8q(InterfaceC69056R8i interfaceC69056R8i, C73516StE c73516StE) {
        this.LIZ = c73516StE;
        this.LIZIZ = interfaceC69056R8i;
    }

    @Override // X.AbstractC67055QTj
    /* renamed from: LIZ, reason: merged with bridge method [inline-methods] */
    public final void onError(R40<C69073R8z> r40, int i) {
        String str;
        C45R<R40<C69073R8z>> c45r = this.LIZ;
        if (r40 != null) {
            str = r40.LJFF;
        } else {
            str = null;
        }
        ((C73516StE) c45r).onError(new C69084R9k(i, str, this.LIZIZ.scene(), this.LIZIZ.LJLLLL(), null, null, 32, null));
    }

    @Override // X.AbstractC67055QTj
    public final void onNeedCaptcha(QQI response, String str) {
        o.LJIIIZ(response, "response");
        super.onNeedCaptcha(response, str);
        ((C73516StE) this.LIZ).onError(new C69084R9k(response.LIZLLL, response.LJFF, this.LIZIZ.scene(), this.LIZIZ.LJLLLL(), null, null, 32, null));
    }
}