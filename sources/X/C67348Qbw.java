package X;

import com.bytedance.crash.CrashType;
import com.bytedance.crash.Npth;
import java.util.HashMap;

/* renamed from: X.Qbw, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67348Qbw {
    public static volatile String LIZ = "";
    public static volatile String LIZIZ = "";

    static {
        try {
            Npth.addAttachUserData(C67349Qbx.LIZ, CrashType.ALL);
            C3C5.m7constructorimpl(C76800UCe.LIZ);
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
    }

    public static void LIZ(String str, String str2) {
        if (str == null) {
            str = "";
        }
        LIZ = str;
        if (str2 == null) {
            str2 = "";
        }
        LIZIZ = str2;
        HashMap hashMap = new HashMap();
        hashMap.put("last_bdhm_url", C62612cz.LIZ(LIZ));
        hashMap.put("last_bdhm_bid", LIZIZ);
        Npth.addTags(hashMap);
    }
}
