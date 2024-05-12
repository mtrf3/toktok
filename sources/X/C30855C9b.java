package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveGiftNewGifterBadgeSetting;

/* renamed from: X.C9b, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30855C9b {
    public long LIZ;

    public static String LIZ(int i) {
        if (i != 1) {
            if (i == 2) {
                return "bad";
            }
            if (i == 3) {
                return "stuck";
            }
        }
        return "good";
    }

    public static String LIZIZ(EnumC48190Ivi enumC48190Ivi) {
        int i = C48199Ivr.LIZ[enumC48190Ivi.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return LiveGiftNewGifterBadgeSetting.DEFAULT;
                }
                return "wifi";
            }
            return "4g";
        }
        return "3g";
    }
}
