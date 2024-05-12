package X;

import android.view.View;
import android.view.ViewPropertyAnimator;

/* renamed from: X.09K, reason: invalid class name */
/* loaded from: classes.dex */
public final /* synthetic */ class C09K {
    public static String LIZIZ(String str, Class cls) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(str);
        LIZ.append(cls);
        return X1D.LIZIZ(LIZ);
    }

    public static ViewPropertyAnimator LIZ(View view, float f, long j) {
        return view.animate().alpha(f).setDuration(j);
    }
}
