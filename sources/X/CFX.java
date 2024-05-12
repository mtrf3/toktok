package X;

import com.bytedance.android.livesdk.livesetting.gecko.TTLiveGeckoSplitSetting;

/* loaded from: classes6.dex */
public final class CFX {
    public static String LIZ(String str, String str2) {
        if (!TTLiveGeckoSplitSetting.INSTANCE.isSplit()) {
            return str;
        }
        return str2;
    }
}
