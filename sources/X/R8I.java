package X;

import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class R8I extends AbstractC67056QTk {
    public final /* synthetic */ C45R<C69032R7k> LIZ;
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

    public R8I(InterfaceC69056R8i interfaceC69056R8i, C73516StE c73516StE) {
        this.LIZ = c73516StE;
        this.LIZIZ = interfaceC69056R8i;
    }

    @Override // X.AbstractC67055QTj
    public final void onError(QQI qqi, int i) {
        int i2;
        String str;
        JSONObject jSONObject;
        C45R<C69032R7k> c45r = this.LIZ;
        if (qqi != null) {
            i2 = qqi.LIZLLL;
        } else {
            i2 = -10000;
        }
        JSONObject jSONObject2 = null;
        if (qqi != null) {
            str = qqi.LJFF;
        } else {
            str = null;
        }
        EnumC69116RAq scene = this.LIZIZ.scene();
        EnumC69113RAn LJLLLL = this.LIZIZ.LJLLLL();
        if (qqi != null && (jSONObject = qqi.LJII) != null) {
            jSONObject2 = jSONObject.optJSONObject("data");
        }
        ((C73516StE) c45r).onError(new C69084R9k(i2, str, scene, LJLLLL, jSONObject2, null, 32, null));
    }

    @Override // X.AbstractC67055QTj
    public final void onNeedCaptcha(QQI response, String str) {
        o.LJIIIZ(response, "response");
        ((C73516StE) this.LIZ).onError(new C69084R9k(response.LIZLLL, response.LJFF, this.LIZIZ.scene(), this.LIZIZ.LJLLLL(), null, null, 32, null));
    }
}
