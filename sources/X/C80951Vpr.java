package X;

import android.graphics.Rect;
import android.os.Build;

/* renamed from: X.Vpr, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80951Vpr {
    public static final C80948Vpo LIZ;

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            LIZ = new C80952Vps();
        } else if (i >= 23) {
            LIZ = new C80953Vpt();
        } else if (i >= 22) {
            LIZ = new C80954Vpu();
        } else {
            LIZ = new C80948Vpo();
        }
        new C80950Vpq(Float.class);
        new C80373VgX(Rect.class);
    }
}
