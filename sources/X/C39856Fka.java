package X;

import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import kotlin.jvm.internal.o;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.Fka, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39856Fka implements InterfaceC86859Y7b {
    @Override // X.InterfaceC86859Y7b
    public final void LIZ(String reason) {
        o.LJIIJ(reason, "reason");
    }

    @Override // X.InterfaceC86859Y7b
    public final void LIZIZ(String str, JSONObject jSONObject) {
    }

    @Override // X.InterfaceC86859Y7b
    public final void LIZJ(String content, JSONObject config) {
        o.LJIIJ(config, "config");
        o.LJIIJ(content, "content");
        JSONArray jSONArray = JSONObjectProtectorUtils.getJSONArray(config, "denyList");
        o.LJFF(jSONArray, "config.getJSONArray(\"denyList\")");
        C60905NvJ.LIZ = jSONArray;
    }
}
