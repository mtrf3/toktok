package X;

import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;

/* renamed from: X.083, reason: invalid class name */
/* loaded from: classes.dex */
public class AnonymousClass083 {
    public final AnonymousClass084 LIZ;

    public AnonymousClass083() {
        C28661Ao c28661Ao;
        if (Build.VERSION.SDK_INT >= 28) {
            c28661Ao = new C28661Ao() { // from class: X.1hl
                @Override // X.AnonymousClass084
                public final Signature[] LIZIZ(PackageManager packageManager, String str) {
                    return C16880lQ.LLLLLLZ(packageManager, str, 64).signatures;
                }
            };
        } else {
            c28661Ao = new C28661Ao();
        }
        this.LIZ = c28661Ao;
    }
}
