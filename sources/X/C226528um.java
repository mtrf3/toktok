package X;

import com.zhiliaoapp.musically.R;

/* renamed from: X.8um, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C226528um extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public static final C226528um LJLIL = new C226528um();

    public C226528um() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        int intValue = ((Number) C226548uo.LIZ.getValue()).intValue();
        if (intValue == EnumC226538un.ADD.getValue()) {
            return Integer.valueOf(R.raw.icon_camera_plus_fill);
        }
        if (intValue == EnumC226538un.SHARE.getValue()) {
            return Integer.valueOf(R.raw.icon_camera_share_fill);
        }
        return Integer.valueOf(R.raw.icon_camera_share_fill);
    }
}
