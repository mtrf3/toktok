package X;

import android.animation.ObjectAnimator;
import android.graphics.Rect;
import android.view.View;
import android.view.Window;

/* renamed from: X.Xkt, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85739Xkt {
    public int LIZ;
    public final C62822Ol8 LIZIZ = C221108m2.LIZIZ(C85738Xks.LJLIL);
    public final C62822Ol8 LIZJ = C221108m2.LIZIZ(C85740Xku.LJLIL);

    public final int LIZ(ActivityC45651qj activityC45651qj, C74088T5w c74088T5w, SY4 sy4, View view, int i) {
        View decorView;
        Rect rect = new Rect();
        Window window = activityC45651qj.getWindow();
        if (window != null && (decorView = window.getDecorView()) != null) {
            decorView.getWindowVisibleDisplayFrame(rect);
        }
        c74088T5w.getLocationOnScreen((int[]) this.LIZJ.getValue());
        int LIZJ = ((int[]) this.LIZJ.getValue())[1] + ((int) KL2.LIZJ(activityC45651qj, 104.0f));
        int i2 = rect.bottom;
        int i3 = LIZJ - i2;
        this.LIZ = i3;
        if (i > i2) {
            this.LIZ = i3 - (i - i2);
        }
        int i4 = this.LIZ;
        if (i4 > 0) {
            ObjectAnimator.ofFloat(view, "translationY", 0.0f, -i4).setDuration(100L).start();
        }
        return this.LIZ;
    }
}
