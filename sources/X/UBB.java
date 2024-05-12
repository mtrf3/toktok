package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicSDKForwardStreamProtectConfSetting;

/* loaded from: classes14.dex */
public final class UBB extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final UBB LJLIL = new UBB();

    public UBB() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        return Boolean.valueOf(LinkMicSDKForwardStreamProtectConfSetting.INSTANCE.getValue().enableMissPush);
    }
}
