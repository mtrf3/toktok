package X;

import com.bytedance.android.live.broadcast.api.PerceptionAppealApi;
import java.util.HashMap;

/* renamed from: X.0Io, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C05260Io {
    public static final /* synthetic */ C05260Io LIZ = new C05260Io();

    public static AbstractC73672Svk LIZ(C12510eN c12510eN) {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put(WM7.SCENE_SERVICE, String.valueOf(c12510eN.LIZ));
        hashMap.put("room_id", String.valueOf(c12510eN.LIZIZ));
        hashMap.put("punish_id", String.valueOf(c12510eN.LIZJ));
        hashMap.put("punish_type", c12510eN.LIZLLL);
        C65814PsI.LIZ().getClass();
        return ((PerceptionAppealApi) C65814PsI.LIZJ(PerceptionAppealApi.class)).perceptionAppeal(hashMap);
    }
}
