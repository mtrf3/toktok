package X;

import com.bytedance.android.livesdk.livesetting.performance.LivePlayEnforceIntervalSetting;

/* renamed from: X.31R, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C31R extends AbstractC65781Prl implements InterfaceC65784Pro<Long> {
    public static final C31R LJLIL = new C31R();

    public C31R() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Long invoke() {
        long j;
        int LIZ = C31V.LIZ();
        if (LIZ != 0) {
            if (LIZ != 1) {
                if (LIZ != 2) {
                    j = 60000;
                }
            } else {
                j = LivePlayEnforceIntervalSetting.DEFAULT;
            }
            return Long.valueOf(j);
        }
        j = 30000;
        return Long.valueOf(j);
    }
}
