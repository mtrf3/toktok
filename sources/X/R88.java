package X;

import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class R88 extends R4N {
    public final /* synthetic */ C45R<R40<R7E>> LIZ;
    public final /* synthetic */ EnumC69116RAq LIZIZ;
    public final /* synthetic */ EnumC69113RAn LIZJ;

    @Override // X.AbstractC67055QTj
    /* renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final void onSuccess(R40<R7E> response) {
        o.LJIIIZ(response, "response");
        ((C73516StE) this.LIZ).onSuccess(response);
    }

    @Override // X.AbstractC67055QTj
    public final void onNeedSecureCaptcha(QQI response) {
        o.LJIIIZ(response, "response");
        ((C73516StE) this.LIZ).onError(new C69084R9k(response.LIZLLL, response.LJFF, this.LIZIZ, this.LIZJ, null, null, 32, null));
    }

    @Override // X.AbstractC67055QTj
    /* renamed from: LIZ, reason: merged with bridge method [inline-methods] */
    public final void onError(R40<R7E> r40, int i) {
        String str;
        R7E r7e;
        C45R<R40<R7E>> c45r = this.LIZ;
        String str2 = null;
        if (r40 != null) {
            str2 = r40.LJFF;
        }
        EnumC69116RAq enumC69116RAq = this.LIZIZ;
        EnumC69113RAn enumC69113RAn = this.LIZJ;
        JSONObject jSONObject = new JSONObject();
        if (r40 == null || (r7e = r40.LJIIIZ) == null || (str = r7e.LJFF) == null) {
            str = "";
        }
        jSONObject.put("next_url", str);
        ((C73516StE) c45r).onError(new C69084R9k(i, str2, enumC69116RAq, enumC69113RAn, jSONObject, null, 32, null));
    }

    @Override // X.AbstractC67055QTj
    public final void onNeedCaptcha(QQI response, String str) {
        o.LJIIIZ(response, "response");
        ((C73516StE) this.LIZ).onError(new C69084R9k(response.LIZLLL, response.LJFF, this.LIZIZ, this.LIZJ, null, null, 32, null));
    }

    public R88(C73516StE c73516StE, EnumC69116RAq enumC69116RAq, EnumC69113RAn enumC69113RAn) {
        this.LIZ = c73516StE;
        this.LIZIZ = enumC69116RAq;
        this.LIZJ = enumC69113RAn;
    }
}