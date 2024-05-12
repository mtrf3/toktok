package X;

import android.content.Context;
import android.util.DisplayMetrics;

/* renamed from: X.UkA, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public class C78050UkA extends C1C9 {
    public C78050UkA(Context context) {
        super(context);
    }

    @Override // X.C1C9
    public final float LJIIJ(DisplayMetrics displayMetrics) {
        return 200.0f / displayMetrics.densityDpi;
    }

    @Override // X.C1C9
    public final int LJII(int i, int i2, int i3, int i4, int i5) {
        return AnonymousClass030.LIZJ(i4, i3, 2, i3) - (((i2 - i) / 2) + i);
    }
}
