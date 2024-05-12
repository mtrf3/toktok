package X;

import android.content.Context;
import android.util.DisplayMetrics;

/* renamed from: X.Uk2, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78042Uk2 extends C1C9 {
    @Override // X.C1C9
    public final int LJIILJJIL() {
        return -1;
    }

    public C78042Uk2(Context context) {
        super(context);
    }

    @Override // X.C1C9
    public final float LJIIJ(DisplayMetrics displayMetrics) {
        if (displayMetrics != null && Integer.valueOf(displayMetrics.densityDpi) != null) {
            return 200.0f / displayMetrics.densityDpi;
        }
        return 25.0f / displayMetrics.densityDpi;
    }
}
