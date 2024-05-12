package X;

import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import java.util.ArrayList;
import kotlin.jvm.internal.AqS155S0100000_5;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.CXh, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31485CXh extends AbstractC38123Exj<JSONObject, JSONObject> {
    @Override // X.AbstractC38123Exj
    public final void onTerminate() {
    }

    @Override // X.AbstractC38123Exj
    public final void invoke(JSONObject jSONObject, C38131Exr context) {
        Object LIZ;
        JSONObject params = jSONObject;
        o.LJIIIZ(params, "params");
        o.LJIIIZ(context, "context");
        try {
            String optString = params.optString("effect_id");
            o.LJIIIIZZ(optString, "params.optString(\"effect_id\")");
            LIZ = Long.valueOf(CastLongProtector.parseLong(optString));
            C3C5.m7constructorimpl(LIZ);
        } catch (Throwable th) {
            LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
        }
        if (C3C5.m12isFailureimpl(LIZ)) {
            LIZ = null;
        }
        Long l = (Long) LIZ;
        if (l == null) {
            finishWithFailure(new Throwable("effect id parse failed: " + params.optString("effect_id")));
            return;
        }
        C0NB.LIZIZ("preloadGiftEffect", "PreDownloadGiftAssets = " + l);
        AqS155S0100000_5 aqS155S0100000_5 = new AqS155S0100000_5(l, 181);
        InterfaceC06390Mx LIZ2 = CN1.LIZ(IGiftService.class);
        o.LJIIIIZZ(LIZ2, "getService(T::class.java)");
        if (((IGiftService) LIZ2).getAssets(null, l.longValue()) != null) {
            aqS155S0100000_5.invoke();
        } else {
            InterfaceC06390Mx LIZ3 = CN1.LIZ(IGiftService.class);
            o.LJIIIIZZ(LIZ3, "getService(T::class.java)");
            ArrayList<Long> arrayList = new ArrayList<>();
            arrayList.add(l);
            ((IGiftService) LIZ3).syncAssetList(7, arrayList, new C31486CXi(aqS155S0100000_5));
        }
        finishWithSuccess();
    }
}
