package X;

import android.content.Context;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.router.SmartRoute;
import com.ss.android.common.lib.AppLogNewUtils;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AqS30S0100100_6;
import kotlin.jvm.internal.AqS36S0100100_6;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class FBT implements FBS {
    @Override // X.FBS
    public final void LIZIZ(JSONObject params) {
        o.LJIIIZ(params, "params");
        AppLogNewUtils.onEventV3("roma_sdk_get_schema_result", params);
    }

    @Override // X.FBS
    public final boolean fa(String shortLink) {
        o.LJIIIZ(shortLink, "shortLink");
        return ujb.o.LJJJLIIL(shortLink, "aweme://roma_redirect", false);
    }

    public static final void LIZLLL(Context context, String longLink) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(longLink, "longLink");
        SmartRoute smartRoute = new SmartRoute(context);
        smartRoute.withUrl(longLink);
        smartRoute.open();
    }

    @Override // X.FBS
    public final String LIZJ(String str, String str2) {
        Object obj;
        JSONObject jSONObject;
        List<FCV> LIZ = FCS.LIZ(C47261Igj.LJJIJIL(new FCU(str, FJ6.OBJECT)));
        if (!(true ^ ((ArrayList) LIZ).isEmpty())) {
            return null;
        }
        FCV fcv = (FCV) ListProtector.get(LIZ, 0);
        if (fcv != null) {
            obj = fcv.LIZIZ;
        } else {
            obj = null;
        }
        if (!(obj instanceof JSONObject) || (jSONObject = (JSONObject) obj) == null) {
            return null;
        }
        return jSONObject.optString(str2);
    }

    @Override // X.FBS
    public final void LIZ(Context context, String longLink, AqS36S0100100_6 aqS36S0100100_6, AqS30S0100100_6 aqS30S0100100_6) {
        Object LIZ;
        o.LJIIJ(context, "context");
        o.LJIIJ(longLink, "longLink");
        try {
            LIZLLL(context, longLink);
            LIZ = C76800UCe.LIZ;
            C3C5.m7constructorimpl(LIZ);
        } catch (Throwable th) {
            LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
        }
        if (C3C5.m13isSuccessimpl(LIZ)) {
            aqS36S0100100_6.invoke();
        }
        Throwable m10exceptionOrNullimpl = C3C5.m10exceptionOrNullimpl(LIZ);
        if (m10exceptionOrNullimpl != null) {
            aqS30S0100100_6.invoke(m10exceptionOrNullimpl);
        }
    }
}
