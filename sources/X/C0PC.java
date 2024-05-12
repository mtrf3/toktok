package X;

import android.os.Build;

/* renamed from: X.0PC, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0PC {
    public final C0PD LIZ;

    public C0PC() {
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            this.LIZ = new C41361jo();
        } else if (i >= 29) {
            this.LIZ = new C30641Ie();
        } else {
            this.LIZ = new C30631Id();
        }
    }

    public C0PC(C0PI c0pi) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            this.LIZ = new C41361jo(c0pi);
        } else if (i >= 29) {
            this.LIZ = new C30641Ie(c0pi);
        } else {
            this.LIZ = new C30631Id(c0pi);
        }
    }
}
