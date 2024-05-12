package X;

import android.content.Context;
import android.os.Build;
import android.view.PointerIcon;

/* renamed from: X.0kB, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16110kB {
    public final PointerIcon LIZ;

    public C16110kB(PointerIcon pointerIcon) {
        this.LIZ = pointerIcon;
    }

    public static C16110kB LIZ(Context context) {
        if (Build.VERSION.SDK_INT >= 24) {
            return new C16110kB(C16100kA.LIZIZ(context, 1002));
        }
        return new C16110kB(null);
    }
}
