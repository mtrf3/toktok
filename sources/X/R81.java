package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class R81 extends R4O {
    public final /* synthetic */ InterfaceC69056R8i LIZ;
    public final /* synthetic */ String LIZIZ;
    public final /* synthetic */ int LIZJ;
    public final /* synthetic */ Fragment LIZLLL;
    public final /* synthetic */ C45R<R40<R7Y>> LJ;

    @Override // X.AbstractC67055QTj
    /* renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final void onSuccess(R40<R7Y> response) {
        String str;
        o.LJIIIZ(response, "response");
        C35936E8m c35936E8m = new C35936E8m();
        c35936E8m.LIZLLL("enter_from", this.LIZ.q9().LJJLIIIJJI());
        c35936E8m.LIZLLL("enter_method", this.LIZ.q9().LJJLIIIJLLLLLLLZ());
        c35936E8m.LIZLLL("send_method", this.LIZIZ);
        c35936E8m.LIZ(this.LIZJ, "send_reason");
        c35936E8m.LIZLLL("status", "success");
        Bundle arguments = this.LIZLLL.getArguments();
        if (arguments != null) {
            str = arguments.getString("page");
        } else {
            str = null;
        }
        c35936E8m.LIZLLL("page", str);
        c35936E8m.LIZ(response.LJ, "error_code");
        FMX.LJIIL("send_email_code", c35936E8m.LIZ);
        ((C73516StE) this.LJ).onSuccess(response);
    }

    @Override // X.AbstractC67055QTj
    public final void onNeedSecureCaptcha(QQI response) {
        o.LJIIIZ(response, "response");
        ((C73516StE) this.LJ).onError(new C69084R9k(response.LIZLLL, response.LJFF, EnumC69116RAq.LOGIN, EnumC69113RAn.INPUT_EMAIL_FIND_PASSWORD, null, null, 32, null));
    }

    @Override // X.AbstractC67055QTj
    /* renamed from: LIZ, reason: merged with bridge method [inline-methods] */
    public final void onError(R40<R7Y> r40, int i) {
        String str;
        int i2;
        C35936E8m c35936E8m = new C35936E8m();
        c35936E8m.LIZLLL("enter_from", this.LIZ.q9().LJJLIIIJJI());
        c35936E8m.LIZLLL("enter_method", this.LIZ.q9().LJJLIIIJLLLLLLLZ());
        c35936E8m.LIZLLL("send_method", this.LIZIZ);
        c35936E8m.LIZ(this.LIZJ, "send_reason");
        c35936E8m.LIZLLL("status", "fail");
        c35936E8m.LIZ(i, "error_code");
        Bundle arguments = this.LIZLLL.getArguments();
        String str2 = null;
        if (arguments != null) {
            str = arguments.getString("page");
        } else {
            str = null;
        }
        c35936E8m.LIZLLL("page", str);
        FMX.LJIIL("send_email_code", c35936E8m.LIZ);
        C45R<R40<R7Y>> c45r = this.LJ;
        if (r40 != null) {
            i2 = r40.LIZLLL;
            str2 = r40.LJFF;
        } else {
            i2 = -10000;
        }
        ((C73516StE) c45r).onError(new C69084R9k(i2, str2, EnumC69116RAq.LOGIN, EnumC69113RAn.INPUT_EMAIL_FIND_PASSWORD, C69093R9t.LJII(r40), null, 32, null));
    }

    @Override // X.AbstractC67055QTj
    public final void onNeedCaptcha(QQI response, String str) {
        o.LJIIIZ(response, "response");
        ((C73516StE) this.LJ).onError(new C69084R9k(response.LIZLLL, response.LJFF, EnumC69116RAq.LOGIN, EnumC69113RAn.INPUT_EMAIL_FIND_PASSWORD, null, null, 32, null));
    }

    public R81(InterfaceC69056R8i interfaceC69056R8i, String str, int i, Fragment fragment, C73516StE c73516StE) {
        this.LIZ = interfaceC69056R8i;
        this.LIZIZ = str;
        this.LIZJ = i;
        this.LIZLLL = fragment;
        this.LJ = c73516StE;
    }
}
