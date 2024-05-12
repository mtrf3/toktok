package X;

import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class R96 extends R4O {
    public final /* synthetic */ C45R<R40<R9Y>> LIZ;
    public final /* synthetic */ InterfaceC69056R8i LIZIZ;
    public final /* synthetic */ String LIZJ;
    public final /* synthetic */ String LIZLLL;
    public final /* synthetic */ String LJ;

    @Override // X.AbstractC67055QTj
    /* renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final void onSuccess(R40<R9Y> response) {
        o.LJIIIZ(response, "response");
        R9Y r9y = response.LJIIIZ;
        if (r9y == null || r9y.LJI == null) {
            ((C73516StE) this.LIZ).onError(new C69084R9k(-1, "no data", EnumC69116RAq.LOGIN, EnumC69113RAn.INPUT_PHONE_FIND_PASSWORD, null, "no data"));
            return;
        }
        ((C73516StE) this.LIZ).onSuccess(response);
    }

    @Override // X.AbstractC67055QTj
    public final void onNeedSecureCaptcha(QQI response) {
        o.LJIIIZ(response, "response");
        C45R<R40<R9Y>> c45r = this.LIZ;
        int i = response.LIZLLL;
        String str = response.LJFF;
        EnumC69116RAq enumC69116RAq = EnumC69116RAq.LOGIN;
        EnumC69113RAn LJLLLL = this.LIZIZ.LJLLLL();
        String str2 = response.LJFF;
        o.LJIIIIZZ(str2, "response.errorMsg");
        ((C73516StE) c45r).onError(new C69084R9k(i, str, enumC69116RAq, LJLLLL, null, str2));
    }

    @Override // X.AbstractC67055QTj
    /* renamed from: LIZ, reason: merged with bridge method [inline-methods] */
    public final void onError(R40<R9Y> r40, int i) {
        int i2;
        String str;
        String str2;
        C45R<R40<R9Y>> c45r = this.LIZ;
        if (r40 != null) {
            i2 = r40.LIZLLL;
        } else {
            i2 = -10000;
        }
        String str3 = null;
        if (r40 != null) {
            str = r40.LJFF;
        } else {
            str = null;
        }
        EnumC69116RAq enumC69116RAq = EnumC69116RAq.LOGIN;
        EnumC69113RAn LJLLLL = this.LIZIZ.LJLLLL();
        JSONObject LJII = C69093R9t.LJII(r40);
        if (LJII != null) {
            String str4 = this.LIZJ;
            String str5 = this.LIZLLL;
            String str6 = this.LJ;
            LJII.put("loginType", str4);
            LJII.put("pwd", str5);
            LJII.put("handle", str6);
        } else {
            LJII = null;
        }
        StringBuilder LIZ = X1D.LIZ();
        if (r40 != null) {
            str2 = r40.LJFF;
        } else {
            str2 = null;
        }
        LIZ.append(str2);
        LIZ.append('|');
        if (r40 != null) {
            str3 = r40.LJI;
        }
        LIZ.append(str3);
        ((C73516StE) c45r).onError(new C69084R9k(i2, str, enumC69116RAq, LJLLLL, LJII, X1D.LIZIZ(LIZ)));
    }

    @Override // X.AbstractC67055QTj
    public final void onNeedCaptcha(QQI response, String captcha) {
        o.LJIIIZ(response, "response");
        o.LJIIIZ(captcha, "captcha");
        C45R<R40<R9Y>> c45r = this.LIZ;
        int i = response.LIZLLL;
        String str = response.LJFF;
        EnumC69116RAq enumC69116RAq = EnumC69116RAq.LOGIN;
        EnumC69113RAn LJLLLL = this.LIZIZ.LJLLLL();
        String str2 = response.LJFF;
        o.LJIIIIZZ(str2, "response.errorMsg");
        ((C73516StE) c45r).onError(new C69084R9k(i, str, enumC69116RAq, LJLLLL, null, str2));
    }

    public R96(C73516StE c73516StE, InterfaceC69056R8i interfaceC69056R8i, String str, String str2, String str3) {
        this.LIZ = c73516StE;
        this.LIZIZ = interfaceC69056R8i;
        this.LIZJ = str;
        this.LIZLLL = str2;
        this.LJ = str3;
    }
}
