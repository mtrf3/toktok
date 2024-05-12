package X;

import android.os.Build;

/* renamed from: X.297, reason: invalid class name */
/* loaded from: classes.dex */
public final class AnonymousClass297 extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final AnonymousClass297 LJLIL = new AnonymousClass297();

    public AnonymousClass297() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z;
        if (Build.VERSION.SDK_INT < 29) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
