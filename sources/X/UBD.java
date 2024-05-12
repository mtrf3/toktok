package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicSDKForwardStreamProtectConfSetting;

/* loaded from: classes14.dex */
public final class UBD extends AbstractC65781Prl implements InterfaceC65784Pro<Long> {
    public static final UBD LJLIL = new UBD();

    public UBD() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Long invoke() {
        return Long.valueOf(LinkMicSDKForwardStreamProtectConfSetting.INSTANCE.getValue().pushMoreTimerInterval);
    }
}
