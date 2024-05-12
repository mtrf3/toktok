package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.EdgeEffect;
import kotlin.jvm.internal.o;

/* renamed from: X.0SE, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0SE {
    public static final C0SE LIZ = new C0SE();

    public static final float LIZIZ(EdgeEffect edgeEffect) {
        o.LJIIIZ(edgeEffect, "edgeEffect");
        try {
            return edgeEffect.getDistance();
        } catch (Throwable unused) {
            return 0.0f;
        }
    }

    public static final EdgeEffect LIZ(Context context, AttributeSet attributeSet) {
        o.LJIIIZ(context, "context");
        try {
            return new EdgeEffect(context, attributeSet);
        } catch (Throwable unused) {
            return new EdgeEffect(context);
        }
    }

    public static final float LIZJ(EdgeEffect edgeEffect, float f, float f2) {
        o.LJIIIZ(edgeEffect, "edgeEffect");
        try {
            return edgeEffect.onPullDistance(f, f2);
        } catch (Throwable unused) {
            edgeEffect.onPull(f, f2);
            return 0.0f;
        }
    }
}
