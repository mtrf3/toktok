package X;

import android.content.Context;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public final class ICY extends AbstractC39622Fgo {
    public static boolean LIZLLL;
    public final Context LIZIZ;
    public final String LIZJ;

    @Override // X.AbstractC39622Fgo
    public final boolean LIZ() {
        return false;
    }

    @Override // X.AbstractC39622Fgo
    public final String LIZIZ() {
        return this.LIZJ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ICY(WRQ cameraApiComponent, Context context) {
        super(cameraApiComponent);
        o.LJIIIZ(cameraApiComponent, "cameraApiComponent");
        this.LIZIZ = context;
        this.LIZJ = "GUITAR";
    }

    @Override // X.AbstractC39622Fgo
    public final void LIZJ(int i, String str) {
        C51556KLg.LIZ.getClass();
        if (!C51556KLg.LIZ().LJJJJL(this.LIZIZ)) {
            String jSONObject = LJ(LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, 1).toString();
            o.LJIIIIZZ(jSONObject, "generateResponse(PERMISS…TED, 0.0, 0.0).toString()");
            LIZLLL(i, jSONObject);
        } else {
            if (!C51556KLg.LIZ().LJJLJLI(this.LIZIZ)) {
                String jSONObject2 = LJ(LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, 2).toString();
                o.LJIIIIZZ(jSONObject2, "generateResponse(PERMISS…ICE, 0.0, 0.0).toString()");
                LIZLLL(i, jSONObject2);
                return;
            }
            XKX.LIZLLL(C780334l.LJLIL, null, null, new C65752i3(this, i, null), 3);
        }
    }

    public final void LJFF(int i, Exception exc) {
        if (exc != null) {
            C16880lQ.LLLLIIL(exc);
        }
        H78.LIZLLL("EffectGuitarHandler", exc);
        String jSONObject = LJ(LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, 3).toString();
        o.LJIIIIZZ(jSONObject, "generateResponse(PERMISS…ERS, 0.0, 0.0).toString()");
        LIZLLL(i, jSONObject);
    }

    public final JSONObject LJ(double d, double d2, int i) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("interface", this.LIZJ);
        jSONObject.put(OHQ.LIZ, i);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("long_data", d);
        jSONObject2.put("lati_data", d2);
        jSONObject.put("body", jSONObject2);
        return jSONObject;
    }
}
