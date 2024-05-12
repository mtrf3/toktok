package X;

import android.content.Context;
import android.util.DisplayMetrics;

/* renamed from: X.Vac, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C80006Vac extends C1C9 {
    public C80006Vac(Context context) {
        super(context);
    }

    @Override // X.C1C9
    public final float LJIIJ(DisplayMetrics displayMetrics) {
        return 200.0f / displayMetrics.densityDpi;
    }

    @Override // X.C1C9
    public final int LJII(int i, int i2, int i3, int i4, int i5) {
        return (((i4 - i3) / 2) + i3) - (((i2 - i) / 2) + i);
    }
}
