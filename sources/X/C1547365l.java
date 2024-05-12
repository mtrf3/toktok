package X;

import Y.ALAdapterS1S0110000_2;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.os.Vibrator;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.RotateAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.zhiliaoapp.musically.R;

/* renamed from: X.65l, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1547365l extends FrameLayout implements AnonymousClass655 {
    public static final /* synthetic */ int LJLLJ = 0;
    public ConstraintLayout LJLIL;
    public ImageView LJLILLLLZI;
    public ImageView LJLJI;
    public View LJLJJI;
    public View LJLJJL;
    public View LJLJJLL;
    public boolean LJLJL;
    public boolean LJLJLJ;
    public boolean LJLJLLL;
    public boolean LJLL;
    public final Vibrator LJLLI;
    public int LJLLILLLL;

    public View getContentView() {
        return this;
    }

    public final void LIZ() {
        LJFF((int) C74275TDb.LIZIZ(getContext(), 24.0f), (int) C74275TDb.LIZIZ(getContext(), 24.0f), this.LJLJJLL);
        LJFF((int) C74275TDb.LIZIZ(getContext(), 16.0f), (int) C74275TDb.LIZIZ(getContext(), 4.0f), this.LJLILLLLZI);
        LJFF((int) C74275TDb.LIZIZ(getContext(), 16.0f), (int) C74275TDb.LIZIZ(getContext(), 14.0f), this.LJLJI);
        setTopImagViewTopMargin((int) C74275TDb.LIZIZ(getContext(), 3.0f));
        setBottomImageViewBottomMargin((int) C74275TDb.LIZIZ(getContext(), 3.0f));
        setParentViewTopMargin((int) C74275TDb.LIZIZ(getContext(), 14.0f));
        AnonymousClass064 anonymousClass064 = new AnonymousClass064();
        anonymousClass064.LJII(this.LJLIL);
        anonymousClass064.LJIIIIZZ(this.LJLJJLL.getId(), 6, 0, 6);
        anonymousClass064.LJIIIIZZ(this.LJLJJLL.getId(), 7, 0, 7);
        anonymousClass064.LJIIIZ(this.LJLJJLL.getId(), 3, 0, 3, (int) C74275TDb.LIZIZ(getContext(), 14.0f));
        anonymousClass064.LJIIIIZZ(this.LJLJJLL.getId(), 4, this.LJLJJI.getId(), 3);
        anonymousClass064.LJIIIIZZ(this.LJLJJI.getId(), 6, 0, 6);
        anonymousClass064.LJIIIIZZ(this.LJLJJI.getId(), 7, 0, 7);
        anonymousClass064.LJIIIZ(this.LJLJJI.getId(), 4, 0, 4, (int) C74275TDb.LIZIZ(getContext(), 14.0f));
        anonymousClass064.LJIIIIZZ(this.LJLJJI.getId(), 3, this.LJLJJLL.getId(), 4);
        ConstraintLayout constraintLayout = this.LJLIL;
        if (constraintLayout != null) {
            anonymousClass064.LIZIZ(constraintLayout);
        }
    }

    public final void LIZLLL() {
        if (!this.LJLL) {
            return;
        }
        this.LJLL = false;
        if (!C1544664k.LIZ()) {
            LIZIZ(false, this.LJLJJI, true);
        } else {
            this.LJLJJI.setVisibility(8);
        }
    }

    public final void LJI() {
        if (this.LJLJLLL) {
            return;
        }
        this.LJLJJL.setVisibility(0);
        this.LJLJLLL = true;
        if (C1544664k.LIZ()) {
            AnonymousClass064 anonymousClass064 = new AnonymousClass064();
            anonymousClass064.LJII(this.LJLIL);
            anonymousClass064.LJIIIIZZ(this.LJLJJLL.getId(), 6, 0, 6);
            anonymousClass064.LJIIIIZZ(this.LJLJJLL.getId(), 7, 0, 7);
            anonymousClass064.LJIIIIZZ(this.LJLJJLL.getId(), 3, 0, 3);
            anonymousClass064.LJIIIIZZ(this.LJLJJLL.getId(), 4, 0, 4);
            anonymousClass064.LIZIZ(this.LJLIL);
            setParentViewTopMargin(0);
            LJFF((int) C74275TDb.LIZIZ(getContext(), 32.0f), (int) C74275TDb.LIZIZ(getContext(), 32.0f), this.LJLJJLL);
            LJFF((int) C74275TDb.LIZIZ(getContext(), 24.0f), (int) C74275TDb.LIZIZ(getContext(), 6.0f), this.LJLILLLLZI);
            LJFF((int) C74275TDb.LIZIZ(getContext(), 24.0f), (int) C74275TDb.LIZIZ(getContext(), 21.0f), this.LJLJI);
            setTopImagViewTopMargin((int) C74275TDb.LIZIZ(getContext(), 4.5f));
            setBottomImageViewBottomMargin((int) C74275TDb.LIZIZ(getContext(), 4.5f));
        } else {
            LIZIZ(true, this.LJLJJL, false);
        }
        RotateAnimation rotateAnimation = new RotateAnimation(0.0f, -20.0f, 10.0f, 30.0f);
        rotateAnimation.setDuration(300L);
        rotateAnimation.setFillAfter(true);
        this.LJLILLLLZI.startAnimation(rotateAnimation);
    }

    public final void LJII() {
        if (this.LJLL) {
            return;
        }
        this.LJLL = true;
        this.LJLJJI.setVisibility(0);
        if (!C1544664k.LIZ()) {
            LIZIZ(true, this.LJLJJI, false);
        }
    }

    public Rect getDeleteRect() {
        return new Rect(getLeft(), getTop(), getRight(), getBottom());
    }

    public final void LJ() {
        if (C1544664k.LIZ()) {
            ConstraintLayout constraintLayout = this.LJLIL;
            if (constraintLayout != null) {
                constraintLayout.setVisibility(8);
            }
            this.LJLJJLL.setVisibility(8);
            return;
        }
        if (this.LJLJJLL.getVisibility() != 0) {
            return;
        }
        LIZIZ(false, this.LJLJJLL, true);
    }

    @Override // X.AnonymousClass655
    public final void LJJJJJ() {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) getLayoutParams();
        layoutParams.topMargin = C81184Vtc.LJFF(getContext());
        setLayoutParams(layoutParams);
    }

    @Override // X.AnonymousClass655
    public final void hide() {
        LJ();
        LIZJ(false);
        this.LJLJL = false;
    }

    public C1547365l(Context context) {
        super(context, null);
        View LLLZIIL;
        if (C1544664k.LIZ()) {
            LLLZIIL = C16880lQ.LLLZIIL(R.layout.au7, C16880lQ.LLZIL(context), null);
        } else {
            LLLZIIL = C16880lQ.LLLZIIL(R.layout.au6, C16880lQ.LLZIL(context), null);
        }
        this.LJLILLLLZI = (ImageView) LLLZIIL.findViewById(R.id.lf_);
        this.LJLJI = (ImageView) LLLZIIL.findViewById(R.id.aq6);
        this.LJLJJI = LLLZIIL.findViewById(R.id.c6m);
        this.LJLJJLL = LLLZIIL.findViewById(R.id.hif);
        if (C1544664k.LIZ()) {
            ConstraintLayout constraintLayout = (ConstraintLayout) LLLZIIL.findViewById(R.id.j71);
            this.LJLIL = constraintLayout;
            constraintLayout.setVisibility(8);
            this.LJLL = true;
        }
        this.LJLJJL = LLLZIIL.findViewById(R.id.ajr);
        addView(LLLZIIL);
        this.LJLJJL.setVisibility(8);
        this.LJLJJLL.setVisibility(8);
        this.LJLLI = (Vibrator) C16880lQ.LLILL(context, "vibrator");
    }

    private void setBottomImageViewBottomMargin(int i) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.LJLJI.getLayoutParams();
        marginLayoutParams.bottomMargin = i;
        this.LJLJI.setLayoutParams(marginLayoutParams);
    }

    private void setParentViewTopMargin(int i) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.LJLJJLL.getLayoutParams();
        marginLayoutParams.topMargin = 0;
        this.LJLJJLL.setLayoutParams(marginLayoutParams);
    }

    private void setTopImagViewTopMargin(int i) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.LJLILLLLZI.getLayoutParams();
        marginLayoutParams.topMargin = i;
        this.LJLILLLLZI.setLayoutParams(marginLayoutParams);
    }

    public final void LIZJ(boolean z) {
        if (!this.LJLJLLL) {
            return;
        }
        this.LJLJLLL = false;
        this.LJLILLLLZI.clearAnimation();
        if (C1544664k.LIZ()) {
            this.LJLJJL.setVisibility(8);
            LIZ();
            if (z) {
                LJII();
                return;
            }
            return;
        }
        LIZIZ(false, this.LJLJJL, false);
    }

    public static void LIZIZ(boolean z, View view, boolean z2) {
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
        animatorSet.addListener(new ALAdapterS1S0110000_2(view, z2, 7));
        animatorSet.start();
    }

    public static void LJFF(int i, int i2, View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.width = i;
        layoutParams.height = i2;
        view.setLayoutParams(layoutParams);
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x006f, code lost:
    
        if (r9.LJLLILLLL == 1) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001e, code lost:
    
        if (r9.LJLLILLLL == 1) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0020, code lost:
    
        r0 = 2;
     */
    @Override // X.AnonymousClass655
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int LJLILLLLZI(int r10, int r11, boolean r12, boolean r13) {
        /*
            Method dump skipped, instructions count: 247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1547365l.LJLILLLLZI(int, int, boolean, boolean):int");
    }
}
