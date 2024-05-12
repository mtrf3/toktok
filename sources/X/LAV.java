package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicVoiceChatLayoutConfigV2Setting;

/* loaded from: classes10.dex */
public final class LAV {
    public static final java.util.Map<String, Float> LIZ;
    public static final C62822Ol8 LIZIZ;

    static {
        C65864Pt6 c65864Pt6 = new C65864Pt6();
        c65864Pt6.put(LivesdkLinkmicVoiceChatLayoutConfigV2Setting.DEFAULT, Float.valueOf(0.58f));
        c65864Pt6.put("3002", Float.valueOf(0.69f));
        c65864Pt6.build();
        LIZ = c65864Pt6;
        LIZIZ = C221108m2.LIZIZ(C30764C5o.LJLIL);
    }

    public static String LIZIZ() {
        return (String) LIZIZ.getValue();
    }

    public static float LIZ(String str) {
        Float f;
        if (str == null || (f = LIZ.get(str)) == null) {
            return 0.58f;
        }
        return f.floatValue();
    }
}
