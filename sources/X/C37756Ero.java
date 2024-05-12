package X;

import com.bytedance.lynx.hybrid.settings.HybridSettings;
import com.ss.android.ugc.effectmanager.common.utils.JsonExtKt;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.Ero, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37756Ero extends AbstractC65781Prl implements InterfaceC65784Pro<List<? extends Object>> {
    public static final C37756Ero LJLIL = new C37756Ero();

    public C37756Ero() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final List<? extends Object> invoke() {
        Object LIZ;
        try {
            JSONObject config = HybridSettings.INSTANCE.getConfig("spark_allow_app_whitelist");
            if (config != null) {
                LIZ = config.optJSONArray("allowList");
            } else {
                LIZ = null;
            }
            C3C5.m7constructorimpl(LIZ);
        } catch (Throwable th) {
            LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
        }
        if (C3C5.m12isFailureimpl(LIZ)) {
            LIZ = null;
        }
        JSONArray jSONArray = (JSONArray) LIZ;
        if (jSONArray != null) {
            return JsonExtKt.toList(jSONArray);
        }
        return null;
    }
}
