package X;

import android.content.res.Resources;
import android.util.DisplayMetrics;

/* renamed from: X.57X, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C57X {
    public static final int LIZ = C78977Uz7.LJJIJIL(180);
    public static final int LIZIZ = C78977Uz7.LJJIJIL(30);
    public static final int LIZJ;

    static {
        int i;
        C78977Uz7.LJJIJIL(48);
        C78977Uz7.LJJIJIL(30);
        C78977Uz7.LJJIJIL(52);
        C78977Uz7.LJJIJIL(44);
        DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
        if (displayMetrics != null) {
            i = displayMetrics.widthPixels;
        } else {
            i = 0;
        }
        LIZJ = i;
    }
}
