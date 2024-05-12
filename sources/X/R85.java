package X;

import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class R85 extends R4N {
    public final /* synthetic */ C45R<C69022R7a> LIZ;
    public final /* synthetic */ EnumC69116RAq LIZIZ;
    public final /* synthetic */ EnumC69113RAn LIZJ;

    @Override // X.AbstractC67055QTj
    /* renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final void onSuccess(R40<C69022R7a> response) {
        o.LJIIIZ(response, "response");
        C69022R7a c69022R7a = response.LJIIIZ;
        if (c69022R7a != null && c69022R7a.LJFF != null) {
            ((C73516StE) this.LIZ).onSuccess(c69022R7a);
            return;
        }
        ((C73516StE) this.LIZ).onError(new C69084R9k(-1, "no data", this.LIZIZ, this.LIZJ, null, "no data"));
    }

    @Override // X.AbstractC67055QTj
    public final void onNeedSecureCaptcha(QQI response) {
        o.LJIIIZ(response, "response");
        C45R<C69022R7a> c45r = this.LIZ;
        int i = response.LIZLLL;
        String str = response.LJFF;
        EnumC69116RAq enumC69116RAq = this.LIZIZ;
        EnumC69113RAn enumC69113RAn = this.LIZJ;
        o.LJIIIIZZ(str, "response.errorMsg");
        ((C73516StE) c45r).onError(new C69084R9k(i, str, enumC69116RAq, enumC69113RAn, null, str));
    }

    @Override // X.AbstractC67055QTj
    /* renamed from: LIZ, reason: merged with bridge method [inline-methods] */
    public final void onError(R40<C69022R7a> r40, int i) {
        String str;
        String str2;
        C45R<C69022R7a> c45r = this.LIZ;
        String str3 = null;
        if (r40 != null) {
            str = r40.LJFF;
        } else {
            str = null;
        }
        EnumC69116RAq enumC69116RAq = this.LIZIZ;
        EnumC69113RAn enumC69113RAn = this.LIZJ;
        JSONObject LJII = C69093R9t.LJII(r40);
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
        ((C73516StE) c45r).onError(new C69084R9k(i, str, enumC69116RAq, enumC69113RAn, LJII, X1D.LIZIZ(LIZ)));
    }

    @Override // X.AbstractC67055QTj
    public final void onNeedCaptcha(QQI response, String str) {
        o.LJIIIZ(response, "response");
        C45R<C69022R7a> c45r = this.LIZ;
        int i = response.LIZLLL;
        String str2 = response.LJFF;
        EnumC69116RAq enumC69116RAq = this.LIZIZ;
        EnumC69113RAn enumC69113RAn = this.LIZJ;
        o.LJIIIIZZ(str2, "response.errorMsg");
        ((C73516StE) c45r).onError(new C69084R9k(i, str2, enumC69116RAq, enumC69113RAn, null, str2));
    }

    public R85(C73516StE c73516StE, EnumC69116RAq enumC69116RAq, EnumC69113RAn enumC69113RAn) {
        this.LIZ = c73516StE;
        this.LIZIZ = enumC69116RAq;
        this.LIZJ = enumC69113RAn;
    }
}
