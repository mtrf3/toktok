package X;

import com.bytedance.android.livesdk.livesetting.portal.PortalAdLabelEnableSetting;

/* loaded from: classes6.dex */
public final class BSZ extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final BSZ LJLIL = new BSZ();

    public BSZ() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        return Boolean.valueOf(PortalAdLabelEnableSetting.INSTANCE.getValue());
    }
}
