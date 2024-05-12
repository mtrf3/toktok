package X;

import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestLiveShowConfig;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestLiveShowConfigSetting;

/* renamed from: X.U3p, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76577U3p extends AbstractC65781Prl implements InterfaceC65784Pro<MultiGuestLiveShowConfig> {
    public static final C76577U3p LJLIL = new C76577U3p();

    public C76577U3p() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final MultiGuestLiveShowConfig invoke() {
        return MultiGuestLiveShowConfigSetting.INSTANCE.getValue();
    }
}
