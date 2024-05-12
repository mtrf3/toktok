package X;

import android.animation.TimeInterpolator;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewPropertyAnimator;
import com.ss.ugc.android.editor.components.base.transition.DavinciViewPositionRect;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.5Qw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C134825Qw {
    public final View LIZ;
    public final long LIZIZ;
    public final View LIZJ;
    public final TimeInterpolator LIZLLL;
    public DavinciViewPositionRect LJ;
    public boolean LJFF;
    public final C62822Ol8 LJI = C221108m2.LIZIZ(new AqS152S0100000_2(this, 983));

    public final ViewPropertyAnimator LIZ() {
        Object value = this.LJI.getValue();
        o.LJIIIIZZ(value, "<get-viewAnimator>(...)");
        return (ViewPropertyAnimator) value;
    }

    public final void LIZIZ(DavinciViewPositionRect davinciViewPositionRect, boolean z, C5R1 c5r1) {
        int i;
        int i2;
        int i3;
        float f;
        float f2;
        long j;
        DavinciViewPositionRect LIZ = C5R0.LIZ(this.LIZJ, davinciViewPositionRect.ratio);
        int i4 = 0;
        if (z) {
            this.LIZ.setVisibility(0);
            this.LIZ.setLayoutParams(new C018905p(davinciViewPositionRect.right - davinciViewPositionRect.left, davinciViewPositionRect.bottom - davinciViewPositionRect.top));
        }
        if (LIZ == null) {
            return;
        }
        int i5 = LIZ.right - LIZ.left;
        int i6 = LIZ.bottom - LIZ.top;
        Object parent = this.LIZ.getParent();
        o.LJII(parent, "null cannot be cast to non-null type android.view.View");
        DavinciViewPositionRect LIZ2 = C5R0.LIZ((View) parent, -1.0f);
        this.LIZ.setPivotX(0.0f);
        this.LIZ.setPivotY(0.0f);
        int i7 = davinciViewPositionRect.left;
        if (LIZ2 != null) {
            i = LIZ2.left;
        } else {
            i = 0;
        }
        int i8 = i7 - i;
        Rect rect = new Rect();
        this.LIZ.getWindowVisibleDisplayFrame(rect);
        int i9 = davinciViewPositionRect.top;
        if (LIZ2 != null) {
            i2 = LIZ2.top;
        } else {
            i2 = 0;
        }
        int i10 = i9 - i2;
        if (this.LJFF) {
            i3 = rect.top;
        } else {
            i3 = 0;
        }
        int i11 = i10 - i3;
        float f3 = i5 / (davinciViewPositionRect.right - davinciViewPositionRect.left);
        float f4 = i6 / (davinciViewPositionRect.bottom - i9);
        if (z) {
            this.LIZ.setTranslationX(i8);
            this.LIZ.setTranslationY(i11);
            this.LIZ.setScaleX(1.0f);
            this.LIZ.setScaleY(1.0f);
        } else {
            this.LIZ.setScaleX(f3);
            this.LIZ.setScaleY(f4);
        }
        LIZ().setInterpolator(this.LIZLLL);
        this.LIZ.setVisibility(0);
        ViewPropertyAnimator LIZ3 = LIZ();
        if (z) {
            f = LIZ.left;
            float f5 = LIZ.top;
            if (LIZ2 != null) {
                i4 = LIZ2.top;
            }
            f2 = f5 - i4;
        } else {
            f = i8;
            f2 = i11;
            f3 = 1.0f;
            f4 = 1.0f;
        }
        ViewPropertyAnimator translationY = LIZ3.setDuration(this.LIZIZ).setListener(c5r1).scaleX(f3).scaleY(f4).translationX(f).translationY(f2);
        if (z) {
            j = 0;
        } else {
            j = 50;
        }
        translationY.setStartDelay(j).start();
    }

    public C134825Qw(View view, long j, View view2, TimeInterpolator timeInterpolator) {
        this.LIZ = view;
        this.LIZIZ = j;
        this.LIZJ = view2;
        this.LIZLLL = timeInterpolator;
    }
}
