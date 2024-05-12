package X;

import com.bytedance.android.livesdk.livesetting.performance.LivePlayEnforceIntervalSetting;

/* loaded from: classes16.dex */
public enum YH3 {
    VIEWABLE_1S(1),
    VIEWABLE_2S(2),
    VIEWABLE_6S(4),
    VIEWABLE_15S(8);

    public final int LJLIL;

    public static YH3 valueOf(String str) {
        return (YH3) V0N.LJJJ(YH3.class, str);
    }

    public final long getDuration() {
        int i = YH6.LIZ[ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        return LivePlayEnforceIntervalSetting.DEFAULT;
                    }
                    throw new C162476Zf();
                }
                return 6000L;
            }
            return 2000L;
        }
        return 1000L;
    }

    public final String getLabel() {
        int i = YH6.LIZ[ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        return "15s";
                    }
                    throw new C162476Zf();
                }
                return "6s";
            }
            return "2s";
        }
        return "1s";
    }

    public final int getValue() {
        return this.LJLIL;
    }

    YH3(int i) {
        this.LJLIL = i;
    }
}
