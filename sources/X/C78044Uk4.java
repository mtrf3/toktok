package X;

import android.content.Context;
import android.util.DisplayMetrics;
import kotlin.jvm.internal.o;

/* renamed from: X.Uk4, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78044Uk4 extends C1C9 {
    public C78044Uk4(Context context) {
        super(context);
    }

    @Override // X.C1C9
    public final float LJIIJ(DisplayMetrics displayMetrics) {
        o.LJIIIZ(displayMetrics, "displayMetrics");
        return 1000.0f / displayMetrics.densityDpi;
    }
}
