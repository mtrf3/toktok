package X;

import com.benchmark.strategy.nativePort.ByteBenchFeatureCenterPort;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.AqS138S0200000_7;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.Hkt, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44971Hkt implements F4V {
    public final HashMap<String, JSONObject> LJLIL = new HashMap<>();

    @Override // X.F4V
    public final int getPriority() {
        return T4L.LIZ();
    }

    public static final void LIZ(String str) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("downgrade_sticker_preview_resolution_tag ");
        LIZ.append(str);
        H7B.LJ(X1D.LIZIZ(LIZ));
    }

    public final void LIZIZ(Effect effect) {
        List LJJIJ = C47261Igj.LJJIJ("effect_label");
        if (C09590Zf.LJIILLIIL.LIZIZ()) {
            ByteBenchFeatureCenterPort.LIZJ(LJJIJ);
        }
        if (effect == null) {
            LIZ("unregister effect label");
            C44972Hku c44972Hku = C44972Hku.LJLIL;
            JSONObject jSONObject = new JSONObject();
            c44972Hku.invoke(jSONObject);
            if (!C09590Zf.LJIILLIIL.LIZIZ()) {
                return;
            }
            ByteBenchFeatureCenterPort.LIZ(jSONObject);
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("register effect label: ");
        LIZ.append(effect.getServer_extra());
        LIZ(X1D.LIZIZ(LIZ));
        AqS138S0200000_7 aqS138S0200000_7 = new AqS138S0200000_7(this, effect, 123);
        JSONObject jSONObject2 = new JSONObject();
        aqS138S0200000_7.invoke(jSONObject2);
        if (!C09590Zf.LJIILLIIL.LIZIZ()) {
            return;
        }
        ByteBenchFeatureCenterPort.LIZ(jSONObject2);
    }

    @Override // X.F4V
    public final ERS LIZLLL(ERN ern, T4S session) {
        String str;
        o.LJIIIZ(session, "session");
        if (!InterfaceC44963Hkl.LJIIL.enableUseDynamicEffectLabel()) {
            LIZ("not hit experiment - EnableUseDynamicEffectLabel");
            return ern.LIZ(session);
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("effect ppi: ");
        Effect LIZ2 = session.LIZ();
        if (LIZ2 != null) {
            str = LIZ2.getServer_extra();
        } else {
            str = null;
        }
        LIZ.append(str);
        LIZ(X1D.LIZIZ(LIZ));
        if (session instanceof T4Q) {
            LIZIZ(((T4Q) session).LIZ);
        } else if (session instanceof T4R) {
            LIZIZ(null);
        }
        return ern.LIZ(session);
    }
}
