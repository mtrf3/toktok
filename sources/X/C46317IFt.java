package X;

import android.os.Build;
import android.text.TextUtils;
import defpackage.e1;
import ujb.o;

/* renamed from: X.IFt, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C46317IFt extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C46317IFt LJLIL = new C46317IFt();

    public C46317IFt() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        C46318IFu.LIZ.getClass();
        String str = Build.BRAND;
        boolean z = false;
        if (!TextUtils.isEmpty(str) && o.LJJJJIZL("samsung", str, true) && Build.VERSION.SDK_INT >= 26 && e1.LIZ(31744, "popup_window_damage_frame_failed_fix_enable", true, true)) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
