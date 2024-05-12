package X;

import android.content.Context;
import android.util.DisplayMetrics;
import kotlin.jvm.internal.o;

/* renamed from: X.TPb, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C74587TPb extends C1C9 {
    public C74587TPb(Context context) {
        super(context);
    }

    @Override // X.C1C9
    public final float LJIIJ(DisplayMetrics displayMetrics) {
        o.LJIIIZ(displayMetrics, "displayMetrics");
        return 0.1f / displayMetrics.densityDpi;
    }

    @Override // X.C1C9
    public final int LJII(int i, int i2, int i3, int i4, int i5) {
        return AnonymousClass030.LIZJ(i4, i3, 2, i3) - (((i2 - i) / 2) + i);
    }
}
