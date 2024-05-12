package X;

import com.bytedance.ies.sdk.widgets.ConstraintProperty;
import com.bytedance.ies.sdk.widgets.LayeredElementContext;
import kotlin.jvm.internal.o;

/* renamed from: X.UJr, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76995UJr {
    public final int LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final float LIZLLL;
    public final int LJ;
    public final float LJFF;
    public int LJI;

    public C76995UJr(C1O4 elementContext) {
        o.LJIIIZ(elementContext, "elementContext");
        this.LIZ = KL2.LJIIJJI(elementContext.getContext());
        this.LIZIZ = KL2.LJIIIZ(elementContext.getContext());
        this.LIZJ = KL2.LJIIL(elementContext.getContext());
        this.LIZLLL = elementContext.LJIIL;
        this.LJ = elementContext.LIZJ;
        this.LJFF = 0.5625f;
    }

    public final void LIZ(LayeredElementContext layeredElementContext, ConstraintProperty constraintProperty) {
        o.LJIIIZ(layeredElementContext, "layeredElementContext");
        o.LJIIIZ(constraintProperty, "constraintProperty");
        float f = ((this.LIZ * this.LJFF) + this.LIZLLL) - this.LJ;
        constraintProperty.removeConstraints(4);
        constraintProperty.removeConstraints(3);
        if (this.LIZIZ - this.LIZJ < this.LJI + f) {
            float f2 = ((this.LIZ * this.LJFF) / 2) + this.LIZLLL;
            constraintProperty.getView().getMeasuredHeight();
            constraintProperty.connect(3, 0, 3, (int) f2);
        } else {
            constraintProperty.connect(3, 0, 3, (int) f);
        }
        constraintProperty.apply();
    }
}
