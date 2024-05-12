package X;

import com.bytedance.android.livesdk.livesetting.broadcast.LiveExtendedScreenFilterTypeSetting;

/* loaded from: classes6.dex */
public final class CEG extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final CEG LJLIL = new CEG();

    public CEG() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        return Boolean.valueOf(LiveExtendedScreenFilterTypeSetting.INSTANCE.getEnable());
    }
}
