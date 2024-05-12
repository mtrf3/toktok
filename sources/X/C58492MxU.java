package X;

import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestV3GuestMinCapSetting;

/* renamed from: X.MxU, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58492MxU extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C58492MxU LJLIL = new C58492MxU();

    public C58492MxU() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        return Boolean.valueOf(MultiGuestV3GuestMinCapSetting.INSTANCE.getValue());
    }
}
