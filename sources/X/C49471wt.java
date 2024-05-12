package X;

import android.os.Build;

/* renamed from: X.1wt, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C49471wt extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C49471wt LJLIL = new C49471wt();

    public C49471wt() {
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
