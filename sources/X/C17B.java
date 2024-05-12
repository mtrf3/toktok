package X;

import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import kotlin.jvm.internal.o;

/* renamed from: X.17B, reason: invalid class name */
/* loaded from: classes.dex */
public final class C17B {
    public static C17C LIZ(Paint.Align alig) {
        o.LJIIIZ(alig, "alig");
        int ordinal = alig.ordinal();
        if (ordinal == Paint.Align.LEFT.ordinal()) {
            return new C17C() { // from class: X.1gs
                @Override // X.C17C
                public final float LIZJ(int i) {
                    return 0.0f;
                }

                @Override // X.C17C
                public final void LIZ(RectF dynamicRectF, int i, int i2, float f, float f2, boolean z) {
                    o.LJIIIZ(dynamicRectF, "dynamicRectF");
                    if (z) {
                        dynamicRectF.set(f2, 0.0f, i2, i);
                    } else {
                        dynamicRectF.set(0.0f, 0.0f, f2, i);
                    }
                }
            };
        }
        if (ordinal == Paint.Align.RIGHT.ordinal()) {
            return new C17C() { // from class: X.1gw
                public final float LIZIZ = C15380j0.LIZ(4.0f);

                @Override // X.C17C
                public final float LIZJ(int i) {
                    return i;
                }

                @Override // X.C17C
                public final float LIZLLL(int i, Rect lyricsRect) {
                    o.LJIIIZ(lyricsRect, "lyricsRect");
                    return (lyricsRect.height() - i) + this.LIZIZ;
                }

                @Override // X.C17C
                public final void LIZ(RectF dynamicRectF, int i, int i2, float f, float f2, boolean z) {
                    o.LJIIIZ(dynamicRectF, "dynamicRectF");
                    float f3 = i2;
                    float f4 = f3 - (f - f2);
                    if (z) {
                        dynamicRectF.set(f4, 0.0f, f3, i);
                    } else {
                        dynamicRectF.set(0.0f, 0.0f, f4, i);
                    }
                }
            };
        }
        if (ordinal == Paint.Align.CENTER.ordinal()) {
            return new C17C() { // from class: X.1gp
                @Override // X.C17C
                public final float LIZJ(int i) {
                    return i / 2.0f;
                }

                @Override // X.C17C
                public final void LIZ(RectF dynamicRectF, int i, int i2, float f, float f2, boolean z) {
                    o.LJIIIZ(dynamicRectF, "dynamicRectF");
                    float f3 = i2;
                    float LIZ = C1I0.LIZ(f3, f, 2.0f, f2);
                    if (z) {
                        dynamicRectF.set(LIZ, 0.0f, f3, (i / 2) + 5);
                    } else {
                        dynamicRectF.set(0.0f, 0.0f, LIZ, i);
                    }
                }
            };
        }
        throw new Exception("error Paint.Align");
    }
}
