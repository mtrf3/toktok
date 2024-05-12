package X;

import com.bytedance.android.livesdk.livesetting.performance.LivePlayEnforceIntervalSetting;

/* renamed from: X.2Mx, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C57352Mx extends AbstractC65781Prl implements InterfaceC88472Yns<Boolean, Long> {
    public static final C57352Mx LJLIL = new C57352Mx();

    public C57352Mx() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final Long invoke(Boolean bool) {
        long j;
        if (bool.booleanValue()) {
            j = 60000;
        } else {
            j = LivePlayEnforceIntervalSetting.DEFAULT;
        }
        return Long.valueOf(j);
    }
}
