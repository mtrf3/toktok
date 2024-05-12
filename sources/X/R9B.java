package X;

import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class R9B extends R4N {
    public final /* synthetic */ C45R<C69074R9a> LIZ;
    public final /* synthetic */ EnumC69116RAq LIZIZ;
    public final /* synthetic */ EnumC69113RAn LIZJ;

    @Override // X.AbstractC67055QTj
    /* renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final void onSuccess(R40<C69074R9a> r40) {
        if (r40 != null && r40.LJIIIZ != null) {
            C69074R9a c69074R9a = r40.LJIIIZ;
            if (c69074R9a.LJFF != null) {
                ((C73516StE) this.LIZ).onSuccess(c69074R9a);
                return;
            }
        }
        ((C73516StE) this.LIZ).onError(new C69084R9k(-1, "no data", this.LIZIZ, this.LIZJ, null, "no data"));
    }

    @Override // X.AbstractC67055QTj
    public final void onNeedSecureCaptcha(QQI qqi) {
        if (qqi != null) {
            C45R<C69074R9a> c45r = this.LIZ;
            int i = qqi.LIZLLL;
            String str = qqi.LJFF;
            EnumC69116RAq enumC69116RAq = this.LIZIZ;
            EnumC69113RAn enumC69113RAn = this.LIZJ;
            o.LJIIIIZZ(str, "response.errorMsg");
            ((C73516StE) c45r).onError(new C69084R9k(i, str, enumC69116RAq, enumC69113RAn, null, str));
        }
    }

    @Override // X.AbstractC67055QTj
    /* renamed from: LIZ, reason: merged with bridge method [inline-methods] */
    public final void onError(R40<C69074R9a> r40, int i) {
        String str;
        String str2;
        C45R<C69074R9a> c45r = this.LIZ;
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
    public final void onNeedCaptcha(QQI qqi, String str) {
        if (qqi != null) {
            C45R<C69074R9a> c45r = this.LIZ;
            int i = qqi.LIZLLL;
            String str2 = qqi.LJFF;
            EnumC69116RAq enumC69116RAq = this.LIZIZ;
            EnumC69113RAn enumC69113RAn = this.LIZJ;
            o.LJIIIIZZ(str2, "response.errorMsg");
            ((C73516StE) c45r).onError(new C69084R9k(i, str2, enumC69116RAq, enumC69113RAn, null, str2));
        }
    }

    public R9B(C73516StE c73516StE, EnumC69116RAq enumC69116RAq, EnumC69113RAn enumC69113RAn) {
        this.LIZ = c73516StE;
        this.LIZIZ = enumC69116RAq;
        this.LIZJ = enumC69113RAn;
    }
}
