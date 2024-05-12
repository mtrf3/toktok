package X;

import Y.ARunnableS7S1100000_6;
import android.content.Context;
import com.bytedance.lynx.hybrid.settings.HybridSettings;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;
import org.json.JSONArray;
import org.json.JSONObject;
import ujb.s;

/* renamed from: X.F9e, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38502F9e implements InterfaceC38506F9i {
    public static final C38502F9e LIZIZ = new C38502F9e();
    public static final ConcurrentHashMap<String, AbstractC38233EzV> LIZ = new ConcurrentHashMap<>();

    @Override // X.InterfaceC38506F9i
    public final void LIZ(Context context, C60737Nsb hybridContext, String originUrl) {
        String applyGlobalLoadUrl;
        JSONArray optJSONArray;
        o.LJIIJ(originUrl, "originUrl");
        o.LJIIJ(hybridContext, "hybridContext");
        try {
            JSONObject config = HybridSettings.INSTANCE.getConfig("hybrid_lynx_prefetch");
            if (config != null && (optJSONArray = config.optJSONArray("denyList")) != null) {
                int length = optJSONArray.length();
                for (int i = 0; i < length; i++) {
                    if (s.LJJJLZIJ(originUrl, optJSONArray.get(i).toString(), false)) {
                        return;
                    }
                }
            }
        } catch (Exception unused) {
        }
        try {
            JSONObject config2 = HybridSettings.INSTANCE.getConfig("hybrid_lynx_prefetch");
            if (config2 != null) {
                if (config2.optInt("enable", 1) != 1) {
                    return;
                }
            }
        } catch (Exception unused2) {
        }
        C39836FkG.LJII.getClass();
        C39858Fkc c39858Fkc = C38262Ezy.LIZ().LIZLLL;
        if (c39858Fkc != null && (applyGlobalLoadUrl = c39858Fkc.applyGlobalLoadUrl(originUrl)) != null) {
            originUrl = applyGlobalLoadUrl;
        }
        C38097ExJ.LIZIZ("hybrid_prefetch_start", hybridContext, originUrl, null);
        C60882aC.LIZ.post(new ARunnableS7S1100000_6(hybridContext, originUrl, 16));
    }
}
