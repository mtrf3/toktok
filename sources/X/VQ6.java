package X;

import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.performance.LiveGiftNewGifterBadgeSetting;
import com.lynx.react.bridge.ReadableType;

/* loaded from: classes15.dex */
public final class VQ6 {
    public static VQB LIZ(F5B f5b) {
        VQB vqb = new VQB();
        if (f5b == null) {
            vqb.LIZ = false;
        } else {
            ReadableType type = f5b.getType();
            if (type == ReadableType.Boolean) {
                vqb.LIZ = f5b.asBoolean();
                vqb.LIZIZ = false;
            } else if (type == ReadableType.String) {
                String asString = f5b.asString();
                if (TextUtils.isEmpty(asString) || LiveGiftNewGifterBadgeSetting.DEFAULT.equals(asString) || "false".equals(asString)) {
                    vqb.LIZ = false;
                    vqb.LIZIZ = false;
                } else if ("default".equals(asString) || "true".equals(asString)) {
                    vqb.LIZ = true;
                    vqb.LIZIZ = false;
                } else if ("await".equals(asString)) {
                    vqb.LIZ = true;
                    vqb.LIZIZ = true;
                }
            }
        }
        return vqb;
    }
}
