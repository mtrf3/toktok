package X;

import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestAnchorThresholdConfigSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestThresholdConfig;

/* renamed from: X.CEg, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30990CEg extends AbstractC65781Prl implements InterfaceC65784Pro<MultiGuestThresholdConfig> {
    public static final C30990CEg LJLIL = new C30990CEg();

    public C30990CEg() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final MultiGuestThresholdConfig invoke() {
        return MultiGuestAnchorThresholdConfigSetting.INSTANCE.getValue();
    }
}
