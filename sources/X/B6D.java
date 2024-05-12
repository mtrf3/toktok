package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LiveSdkMultiGuestPauseViewDiffFixSetting;

/* loaded from: classes6.dex */
public final class B6D extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final B6D LJLIL = new B6D();

    public B6D() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = true;
        if (LiveSdkMultiGuestPauseViewDiffFixSetting.INSTANCE.getValue() != 1) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
