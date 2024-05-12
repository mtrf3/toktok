package X;

import android.content.Context;
import android.util.DisplayMetrics;

/* renamed from: X.ZvM, reason: case insensitive filesystem */
/* loaded from: classes22.dex */
public final class C91484ZvM extends C1C9 {
    public C91484ZvM(Context context) {
        super(context);
    }

    @Override // X.C1C9
    public final float LJIIJ(DisplayMetrics displayMetrics) {
        if (displayMetrics != null) {
            return 350.0f / displayMetrics.densityDpi;
        }
        throw new NullPointerException("densityDpi");
    }
}
