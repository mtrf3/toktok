package X;

import android.content.Context;
import android.view.ViewConfiguration;
import kotlin.jvm.internal.o;

/* renamed from: X.aWJ, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C93775aWJ {
    public float LIZ;
    public final int LIZIZ;

    public C93775aWJ(Context context) {
        o.LJIIIZ(context, "context");
        this.LIZ = -1.0f;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        o.LJIIIIZZ(viewConfiguration, "ViewConfiguration.get(context)");
        this.LIZIZ = viewConfiguration.getScaledTouchSlop();
    }
}
