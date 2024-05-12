package X;

import android.text.TextUtils;
import android.util.LruCache;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestRtcAbSwitcherSetting;
import org.json.JSONObject;

/* renamed from: X.U7o, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76680U7o {
    public static final LruCache<String, java.util.Map<String, Object>> LIZ = new LruCache<>(3);

    public static void LIZIZ() {
        if (!MultiGuestRtcAbSwitcherSetting.INSTANCE.isEnable()) {
            return;
        }
        C0NB.LIZIZ("RtcAbUtil", "release all cache");
        try {
            LIZ.evictAll();
        } catch (Throwable th) {
            C0NB.LJFF("RtcAbUtil", "release error:", th);
        }
    }

    public static void LIZ(String str, String str2) {
        if (!MultiGuestRtcAbSwitcherSetting.INSTANCE.isEnable() || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        try {
            LruCache<String, java.util.Map<String, Object>> lruCache = LIZ;
            java.util.Map<String, Object> LJJJLIIL = C113554cx.LJJJLIIL();
            if (!TextUtils.isEmpty(str2)) {
                try {
                    LJJJLIIL = C38393F4z.LIZJ(new JSONObject(str2));
                } catch (Throwable th) {
                    C0NB.LJFF("RtcAbUtil", "generateMap failed,", th);
                }
            }
            lruCache.put(str, LJJJLIIL);
        } catch (Throwable th2) {
            C0NB.LJFF("RtcAbUtil", "parse rtcAbParams error,", th2);
        }
    }
}
