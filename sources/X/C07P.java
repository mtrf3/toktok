package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.EdgeEffect;

/* renamed from: X.07P, reason: invalid class name */
/* loaded from: classes.dex */
public class C07P {
    public static float LIZIZ(EdgeEffect edgeEffect) {
        try {
            return edgeEffect.getDistance();
        } catch (Throwable unused) {
            return 0.0f;
        }
    }

    public static EdgeEffect LIZ(Context context, AttributeSet attributeSet) {
        try {
            return new EdgeEffect(context, attributeSet);
        } catch (Throwable unused) {
            return new EdgeEffect(context);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [android.widget.EdgeEffect] */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.widget.EdgeEffect] */
    /* JADX WARN: Type inference failed for: r0v3, types: [float] */
    public static float LIZJ(EdgeEffect edgeEffect, float f, float f2) {
        try {
            edgeEffect = edgeEffect.onPullDistance(f, f2);
            return edgeEffect;
        } catch (Throwable unused) {
            edgeEffect.onPull(f, f2);
            return 0.0f;
        }
    }
}
