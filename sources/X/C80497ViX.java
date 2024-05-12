package X;

import android.animation.TypeEvaluator;
import android.graphics.Rect;
import kotlin.jvm.internal.o;

/* renamed from: X.ViX, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80497ViX implements TypeEvaluator<Rect> {
    public final Rect LIZ;

    public C80497ViX(Rect rect) {
        this.LIZ = rect;
    }

    @Override // android.animation.TypeEvaluator
    /* renamed from: LIZ, reason: merged with bridge method [inline-methods] */
    public final Rect evaluate(float f, Rect rect, Rect rect2) {
        o.LJI(rect);
        int i = rect.left;
        o.LJI(rect2);
        int i2 = i + ((int) ((rect2.left - rect.left) * f));
        int i3 = rect.top + ((int) ((rect2.top - r3) * f));
        int i4 = rect.right + ((int) ((rect2.right - r2) * f));
        int i5 = rect.bottom + ((int) ((rect2.bottom - r1) * f));
        Rect rect3 = this.LIZ;
        if (rect3 == null) {
            return new Rect(i2, i3, i4, i5);
        }
        o.LJI(rect3);
        rect3.set(i2, i3, i4, i5);
        return this.LIZ;
    }
}
