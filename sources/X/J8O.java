package X;

import com.bytedance.android.livesdk.livesetting.performance.LivePlayEnforceIntervalSetting;

/* loaded from: classes9.dex */
public final class J8O extends AbstractC65781Prl implements InterfaceC65784Pro<J8N> {
    public static final J8O LJLIL = new J8O();

    public J8O() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final J8N invoke() {
        int LIZ = C00F.LIZ(31744, 0, "continue_play", true);
        if (LIZ != 0) {
            if (LIZ != 1) {
                if (LIZ != 2) {
                    if (LIZ != 3) {
                        return new J8N(0L, 0L);
                    }
                    return new J8N(60000L, 30000L);
                }
                return new J8N(30000L, LivePlayEnforceIntervalSetting.DEFAULT);
            }
            return new J8N(60000L, LivePlayEnforceIntervalSetting.DEFAULT);
        }
        return new J8N(Long.MAX_VALUE, Long.MAX_VALUE);
    }
}
