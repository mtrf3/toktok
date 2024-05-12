package X;

import android.content.Context;
import android.graphics.RectF;
import android.widget.FrameLayout;

/* renamed from: X.64P, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C64P {
    public final C64Q LIZ;

    public final RectF LIZ() {
        return new RectF(this.LIZ.getX(), this.LIZ.getY(), this.LIZ.getX() + this.LIZ.getMeasuredWidth(), this.LIZ.getY() + this.LIZ.getMeasuredHeight());
    }

    public final float LIZIZ() {
        return this.LIZ.getRotation();
    }

    public final float LIZJ() {
        return this.LIZ.getScaleY();
    }

    public final boolean LIZLLL() {
        if (this.LIZ.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    public C64P(Context context) {
        C64Q c64q = new C64Q(context, null, 6);
        this.LIZ = c64q;
        c64q.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
    }

    public final void LJ(float f) {
        this.LIZ.setAlpha(f);
    }

    public final void LJI(float f) {
        C64Q c64q = this.LIZ;
        c64q.setRotation(c64q.getRotation() - f);
    }

    public final void LJII(float f) {
        C64Q c64q = this.LIZ;
        c64q.setScaleX(c64q.getScaleX() * f);
        C64Q c64q2 = this.LIZ;
        c64q2.setScaleY(c64q2.getScaleY() * f);
    }

    public final void LJFF(float f, float f2) {
        C64Q c64q = this.LIZ;
        c64q.setX(c64q.getX() + f);
        C64Q c64q2 = this.LIZ;
        c64q2.setY(c64q2.getY() + f2);
    }
}
