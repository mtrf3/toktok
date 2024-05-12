package X;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Build;
import android.util.Property;
import android.view.View;

/* renamed from: X.0Dl, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C03930Dl {
    public static final C46131rV LIZ;
    public static final C03910Dj LIZIZ;

    /* JADX WARN: Type inference failed for: r1v1, types: [X.0Dj] */
    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            LIZ = new C55992Hr() { // from class: X.2IC
                @Override // X.C40591iZ
                public final float LJJJJZI(View view) {
                    return view.getTransitionAlpha();
                }

                @Override // X.C55992Hr, X.C17J
                public final void LJJJJJ(int i2, View view) {
                    view.setTransitionVisibility(i2);
                }

                @Override // X.C40591iZ
                public final void LJJJLIIL(View view, float f) {
                    view.setTransitionAlpha(f);
                }

                @Override // X.C46131rV
                public final void LJJJLL(View view, Matrix matrix) {
                    view.transformMatrixToGlobal(matrix);
                }

                @Override // X.C46131rV
                public final void LJJJLZIJ(View view, Matrix matrix) {
                    view.transformMatrixToLocal(matrix);
                }

                @Override // X.C538129h, X.C17J
                public final void LJJJJIZL(View view, int i2, int i3, int i4, int i5) {
                    view.setLeftTopRightBottom(i2, i3, i4, i5);
                }
            };
        } else if (i >= 23) {
            LIZ = new C55992Hr();
        } else if (i >= 22) {
            LIZ = new C538129h();
        } else {
            LIZ = new C46131rV();
        }
        final Class<Float> cls = Float.class;
        LIZIZ = new Property<View, Float>(cls) { // from class: X.0Dj
            @Override // android.util.Property
            public final Float get(View view) {
                return Float.valueOf(C03930Dl.LIZ.LJJJJZI(view));
            }

            @Override // android.util.Property
            public final void set(View view, Float f) {
                float floatValue = f.floatValue();
                C03930Dl.LIZ.LJJJLIIL(view, floatValue);
            }
        };
        final Class<Rect> cls2 = Rect.class;
        new Property<View, Rect>(cls2) { // from class: X.0Dk
            @Override // android.util.Property
            public final Rect get(View view) {
                return C16320kW.LIZ(view);
            }

            @Override // android.util.Property
            public final void set(View view, Rect rect) {
                C16320kW.LIZJ(view, rect);
            }
        };
    }

    public static void LIZ(View view, int i, int i2, int i3, int i4) {
        LIZ.LJJJJIZL(view, i, i2, i3, i4);
    }
}
