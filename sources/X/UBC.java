package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicSDKForwardStreamProtectConfSetting;

/* loaded from: classes14.dex */
public final class UBC extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final UBC LJLIL = new UBC();

    public UBC() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        return Boolean.valueOf(LinkMicSDKForwardStreamProtectConfSetting.INSTANCE.getValue().enablePushMore);
    }
}
