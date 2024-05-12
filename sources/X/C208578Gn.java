package X;

import android.os.Build;

/* renamed from: X.8Gn, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C208578Gn extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C208578Gn LJLIL = new C208578Gn();

    public C208578Gn() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z;
        if (Build.VERSION.SDK_INT >= 23) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(C84S.LIZIZ("use_dynamic_cover", z));
    }
}
