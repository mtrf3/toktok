package X;

import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class R80 extends R4M {
    public final /* synthetic */ C45R<R40<R7E>> LIZ;
    public final /* synthetic */ EnumC69116RAq LIZIZ;
    public final /* synthetic */ EnumC69113RAn LIZJ;

    @Override // X.R4M
    /* renamed from: LIZIZ */
    public final void onSuccess(R40<R7E> r40) {
        if (r40 != null) {
            ((C73516StE) this.LIZ).onSuccess(r40);
        }
    }

    @Override // X.AbstractC67055QTj
    public final void onNeedSecureCaptcha(QQI response) {
        o.LJIIIZ(response, "response");
        ((C73516StE) this.LIZ).onError(new C69084R9k(response.LIZLLL, response.LJFF, this.LIZIZ, this.LIZJ, null, null, 32, null));
    }

    @Override // X.R4M
    /* renamed from: LIZ */
    public final void onError(R40<R7E> r40, int i) {
        String str;
        R7E r7e;
        JSONObject jSONObject;
        JSONObject optJSONObject;
        R7E r7e2;
        JSONObject jSONObject2 = new JSONObject();
        String str2 = null;
        if (r40 == null || (r7e2 = r40.LJIIIZ) == null || (str = r7e2.LJFF) == null) {
            str = "";
        }
        jSONObject2.put("next_url", str);
        if (i == 2030) {
            if (r40 != null && (r7e = r40.LJIIIZ) != null && (jSONObject = r7e.LJ) != null && (optJSONObject = jSONObject.optJSONObject("data")) != null) {
                jSONObject2.put("data", optJSONObject);
            }
            jSONObject2.put("url_path", "/passport/mobile/send_code/v1/");
        } else if (i == 1206) {
            C5S1 c5s1 = new C5S1(C58725N2z.LIZ);
            c5s1.LIZJ(R.string.dqp);
            c5s1.LJ();
        }
        C45R<R40<R7E>> c45r = this.LIZ;
        if (r40 != null) {
            str2 = r40.LJFF;
        }
        ((C73516StE) c45r).onError(new C69084R9k(i, str2, this.LIZIZ, this.LIZJ, jSONObject2, null, 32, null));
    }

    @Override // X.AbstractC67055QTj
    public final void onNeedCaptcha(QQI response, String str) {
        o.LJIIIZ(response, "response");
        ((C73516StE) this.LIZ).onError(new C69084R9k(response.LIZLLL, response.LJFF, this.LIZIZ, this.LIZJ, null, null, 32, null));
    }

    public R80(C73516StE c73516StE, EnumC69116RAq enumC69116RAq, EnumC69113RAn enumC69113RAn) {
        this.LIZ = c73516StE;
        this.LIZIZ = enumC69116RAq;
        this.LIZJ = enumC69113RAn;
    }
}
