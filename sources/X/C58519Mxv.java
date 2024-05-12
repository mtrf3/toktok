package X;

import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestLiveShowSetting;

/* renamed from: X.Mxv, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58519Mxv extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public static final C58519Mxv LJLIL = new C58519Mxv();

    public C58519Mxv() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        return Integer.valueOf(MultiGuestLiveShowSetting.INSTANCE.getValue());
    }
}
