package X;

import com.bytedance.android.livesdk.livesetting.portal.PortalFeatureSetting;

/* loaded from: classes6.dex */
public final class BSN extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final BSN LJLIL = new BSN();

    public BSN() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        return Boolean.valueOf(PortalFeatureSetting.INSTANCE.getValue());
    }
}
