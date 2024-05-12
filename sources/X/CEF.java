package X;

import com.bytedance.android.livesdk.livesetting.publicscreen.LiveExtendedPublicScreenMaxMessageConfig;

/* loaded from: classes6.dex */
public final class CEF extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public static final CEF LJLIL = new CEF();

    public CEF() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        return Integer.valueOf(LiveExtendedPublicScreenMaxMessageConfig.getValue().maxMessageCount);
    }
}
