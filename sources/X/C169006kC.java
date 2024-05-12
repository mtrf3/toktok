package X;

import android.animation.ObjectAnimator;
import android.view.View;
import android.widget.ImageView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS168S0100000_2;

/* renamed from: X.6kC, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C169006kC extends AbstractC169046kG {
    public final ImageView LIZLLL;
    public final C81232VuO LJ;
    public final View LJFF;
    public final boolean LJI;
    public ObjectAnimator LJII;

    @Override // X.AbstractC169046kG
    public final void LIZ() {
        ObjectAnimator objectAnimator;
        ObjectAnimator objectAnimator2 = this.LJII;
        if (objectAnimator2 != null && objectAnimator2.isRunning() && (objectAnimator = this.LJII) != null) {
            objectAnimator.cancel();
        }
        ImageView imageView = this.LIZLLL;
        if (imageView == null) {
            return;
        }
        imageView.setRotation(0.0f);
    }

    @Override // X.AbstractC169046kG
    public final void LIZIZ() {
        ImageView imageView = this.LIZLLL;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        LIZ();
    }

    @Override // X.AbstractC169046kG
    public final void LJFF() {
        if (this.LJI) {
            return;
        }
        LIZLLL(0);
        LIZJ(0);
    }

    @Override // X.AbstractC169046kG
    public final void LJ(boolean z) {
        if (this.LJI) {
            return;
        }
        if (z) {
            LIZLLL(0);
        }
        C81232VuO c81232VuO = this.LJ;
        if (c81232VuO != null) {
            c81232VuO.setClickStatusColor(0);
        }
    }

    @Override // X.AbstractC169046kG
    public final void LJI(AqS168S0100000_2 aqS168S0100000_2) {
        ImageView imageView = this.LIZLLL;
        if (imageView != null) {
            imageView.setVisibility(0);
        }
        ImageView imageView2 = this.LIZLLL;
        if (imageView2 != null) {
            imageView2.setImageResource(R.drawable.th);
        }
        ImageView imageView3 = this.LIZLLL;
        if (imageView3 == null) {
            return;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(imageView3, "rotation", 0.0f, 360.0f);
        this.LJII = ofFloat;
        if (ofFloat != null) {
            ofFloat.setDuration(800L);
        }
        ObjectAnimator objectAnimator = this.LJII;
        if (objectAnimator != null) {
            objectAnimator.setRepeatMode(1);
        }
        ObjectAnimator objectAnimator2 = this.LJII;
        if (objectAnimator2 != null) {
            objectAnimator2.setRepeatCount(-1);
        }
        ObjectAnimator objectAnimator3 = this.LJII;
        if (objectAnimator3 != null) {
            objectAnimator3.start();
        }
    }

    public C169006kC(ImageView imageView, C81232VuO c81232VuO, View view) {
        super(c81232VuO, view);
        this.LIZLLL = imageView;
        this.LJ = c81232VuO;
        this.LJFF = view;
        this.LJI = true;
    }
}
