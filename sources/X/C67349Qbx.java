package X;

import com.bytedance.crash.AttachUserData;
import com.bytedance.crash.CrashType;
import java.util.HashMap;

/* renamed from: X.Qbx, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67349Qbx implements AttachUserData {
    public static final C67349Qbx LIZ = new C67349Qbx();

    @Override // com.bytedance.crash.AttachUserData
    public final java.util.Map<String, String> getUserData(CrashType crashType) {
        HashMap hashMap = new HashMap();
        hashMap.put("last_bdhm_url", C62612cz.LIZ(C67348Qbw.LIZ));
        hashMap.put("last_bdhm_bid", C67348Qbw.LIZIZ);
        return hashMap;
    }
}
