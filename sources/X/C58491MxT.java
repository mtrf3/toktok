package X;

import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestV3AnchorMinCapSetting;

/* renamed from: X.MxT, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58491MxT extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C58491MxT LJLIL = new C58491MxT();

    public C58491MxT() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        return Boolean.valueOf(MultiGuestV3AnchorMinCapSetting.INSTANCE.getValue());
    }
}
