package X;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;

/* renamed from: X.Vef, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80257Vef extends C80256Vee {
    @Override // X.C80256Vee
    public final void LIZIZ(C80261Vej c80261Vej, View view, View view2, float f, Drawable drawable) {
        boolean z;
        float sin;
        float cos;
        RectF LIZ = C80256Vee.LIZ(c80261Vej, view);
        RectF LIZ2 = C80256Vee.LIZ(c80261Vej, view2);
        if (LIZ.left < LIZ2.left) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            double d = (f * 3.141592653589793d) / 2.0d;
            sin = (float) (1.0d - Math.cos(d));
            cos = (float) Math.sin(d);
        } else {
            double d2 = (f * 3.141592653589793d) / 2.0d;
            sin = (float) Math.sin(d2);
            cos = (float) (1.0d - Math.cos(d2));
        }
        drawable.setBounds(C80237VeL.LIZ(sin, (int) LIZ.left, (int) LIZ2.left), drawable.getBounds().top, C80237VeL.LIZ(cos, (int) LIZ.right, (int) LIZ2.right), drawable.getBounds().bottom);
    }
}
