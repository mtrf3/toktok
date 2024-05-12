package X;

import com.ss.android.ugc.aweme.services.IAVMobService;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.HUe, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44144HUe implements IAVMobService {
    @Override // com.ss.android.ugc.aweme.services.IAVMobService
    public final void onEventV3(String eventName, java.util.Map<String, String> map) {
        o.LJIIIZ(eventName, "eventName");
        GXR.LIZ(eventName, map);
    }

    @Override // com.ss.android.ugc.aweme.services.IAVMobService
    public final void onEventV3(String eventName, JSONObject jSONObject) {
        o.LJIIIZ(eventName, "eventName");
        GXR.LIZIZ(eventName, jSONObject);
    }
}
