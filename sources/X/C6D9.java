package X;

import Y.ALAdapterS1S0110000_2;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.os.Vibrator;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.RotateAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.zhiliaoapp.musically.R;

/* renamed from: X.6D9, reason: invalid class name */
/* loaded from: classes3.dex */
public class C6D9 extends FrameLayout {
    public ImageView LJLIL;
    public View LJLILLLLZI;
    public View LJLJI;
    public View LJLJJI;
    public boolean LJLJJL;
    public boolean LJLJJLL;
    public boolean LJLJL;
    public boolean LJLJLJ;
    public final Vibrator LJLJLLL;
    public int LJLL;

    public View getContentView() {
        return this;
    }

    public final void LIZIZ() {
        if (!this.LJLJL) {
            return;
        }
        this.LJLJL = false;
        RotateAnimation rotateAnimation = new RotateAnimation(0.0f, 0.0f, 10.0f, 30.0f);
        rotateAnimation.setFillAfter(true);
        rotateAnimation.setDuration(300L);
        this.LJLIL.startAnimation(rotateAnimation);
        LIZ(false, this.LJLJI, false);
    }

    public final void LIZLLL() {
        if (this.LJLJL) {
            return;
        }
        this.LJLJI.setVisibility(0);
        this.LJLJL = true;
        LIZ(true, this.LJLJI, false);
        RotateAnimation rotateAnimation = new RotateAnimation(0.0f, -20.0f, 10.0f, 30.0f);
        rotateAnimation.setDuration(300L);
        rotateAnimation.setFillAfter(true);
        this.LJLIL.startAnimation(rotateAnimation);
    }

    public Rect getDeleteRect() {
        return new Rect(getLeft(), getTop(), getRight(), getBottom());
    }

    public final void LJ() {
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) getLayoutParams();
        layoutParams.topMargin = C81184Vtc.LJFF(getContext());
        setLayoutParams(layoutParams);
    }

    public C6D9(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        View LLLZIIL = C16880lQ.LLLZIIL(R.layout.br7, C16880lQ.LLZIL(context), null);
        this.LJLIL = (ImageView) LLLZIIL.findViewById(R.id.lf_);
        this.LJLILLLLZI = LLLZIIL.findViewById(R.id.c6m);
        this.LJLJJI = LLLZIIL.findViewById(R.id.hif);
        this.LJLJI = LLLZIIL.findViewById(R.id.ajr);
        addView(LLLZIIL);
        this.LJLJI.setVisibility(8);
        this.LJLJJI.setVisibility(8);
        this.LJLJLLL = (Vibrator) C16880lQ.LLILL(context, "vibrator");
    }

    public static void LIZ(boolean z, View view, boolean z2) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        AnimatorSet animatorSet = new AnimatorSet();
        float[] fArr = new float[2];
        float f6 = 1.0f;
        if (z) {
            f = 0.0f;
        } else {
            f = 1.0f;
        }
        fArr[0] = f;
        if (z) {
            f2 = 1.0f;
        } else {
            f2 = 0.0f;
        }
        fArr[1] = f2;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", fArr);
        float[] fArr2 = new float[2];
        if (z) {
            f3 = 0.0f;
        } else {
            f3 = 1.0f;
        }
        fArr2[0] = f3;
        if (z) {
            f4 = 1.0f;
        } else {
            f4 = 0.0f;
        }
        fArr2[1] = f4;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, "scaleX", fArr2);
        float[] fArr3 = new float[2];
        if (z) {
            f5 = 0.0f;
        } else {
            f5 = 1.0f;
        }
        fArr3[0] = f5;
        if (!z) {
            f6 = 0.0f;
        }
        fArr3[1] = f6;
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(view, "scaleY", fArr3);
        animatorSet.setDuration(300L);
        animatorSet.play(ofFloat).with(ofFloat2).with(ofFloat3);
        animatorSet.addListener(new ALAdapterS1S0110000_2(view, z2, 2));
        animatorSet.start();
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x0076, code lost:
    
        if (r9.LJLL == 1) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0022, code lost:
    
        if (r9.LJLL == 1) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0024, code lost:
    
        r0 = 2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int LIZJ(int r10, int r11, boolean r12, boolean r13) {
        /*
            Method dump skipped, instructions count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6D9.LIZJ(int, int, boolean, boolean):int");
    }
}
