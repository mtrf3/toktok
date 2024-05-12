package X;

import Y.ACListenerS34S0100000_14;
import Y.ARunnableS3S0211000_14;
import Y.ARunnableS50S0100000_14;
import android.animation.AnimatorSet;
import android.app.Activity;
import android.graphics.Point;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import kotlin.jvm.internal.o;

/* renamed from: X.Vup, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81259Vup extends PopupWindow {
    public final Activity LIZ;
    public C136845Yq LIZIZ;
    public int LIZJ;
    public int LIZLLL;
    public int LJ;
    public boolean LJFF;
    public int LJI;
    public int LJII;
    public boolean LJIIIIZZ;
    public boolean LJIIIZ;
    public boolean LJIIJ;
    public int LJIIJJI;
    public long LJIIL;
    public AnimatorSet LJIILIIL;
    public final ARunnableS50S0100000_14 LJIILJJIL;
    public long LJIILL;
    public final long LJIILLIIL;
    public C81260Vuq LJIIZILJ;
    public C81261Vur LJIJ;

    public final void LIZJ() {
        int i = this.LIZJ;
        if (i != 0 && this.LIZLLL != 0) {
            getContentView().measure(View.MeasureSpec.makeMeasureSpec(i, 1073741824), View.MeasureSpec.makeMeasureSpec(this.LIZLLL, 1073741824));
            return;
        }
        getContentView().measure(View.MeasureSpec.makeMeasureSpec(C60996Nwm.LJIIIIZZ(getContentView().getContext()), LiveLayoutPreloadThreadPriority.DEFAULT), View.MeasureSpec.makeMeasureSpec(C60996Nwm.LJ(getContentView().getContext()), LiveLayoutPreloadThreadPriority.DEFAULT));
    }

    public final void LIZLLL() {
        if (this.LIZ.isFinishing() || !isShowing()) {
            return;
        }
        AnimatorSet animatorSet = this.LJIILIIL;
        if (animatorSet != null) {
            o.LJI(animatorSet);
            C16880lQ.LJLJJL(animatorSet);
            AnimatorSet animatorSet2 = this.LJIILIIL;
            o.LJI(animatorSet2);
            animatorSet2.cancel();
            this.LJIILIIL = null;
        }
        try {
            super.dismiss();
        } catch (Exception e) {
            C36922EeM.LIZ(e);
        }
    }

    @Override // android.widget.PopupWindow
    public final void dismiss() {
        if (!this.LJFF) {
            LIZ(this.LJI, false);
            getContentView().removeCallbacks(this.LJIILJJIL);
            this.LJ = 0;
        }
    }

    public final int LIZIZ() {
        return getContentView().getMeasuredWidth();
    }

    public C81259Vup(Activity activity) {
        super(activity);
        this.LIZ = activity;
        this.LJIIIIZZ = true;
        this.LJIIL = 7000L;
        this.LJIILJJIL = new ARunnableS50S0100000_14(this, 213);
        this.LJIILL = 800L;
        this.LJIILLIIL = 200L;
        activity.getResources().getDisplayMetrics();
        setWidth(-2);
        setHeight(-2);
        setFocusable(false);
        setOutsideTouchable(false);
        setClippingEnabled(false);
        setBackgroundDrawable(new ColorDrawable(0));
        setInputMethodMode(1);
        setSoftInputMode(16);
    }

    public final void LJ(View view) {
        C136845Yq c136845Yq = new C136845Yq(this.LIZ);
        this.LIZIZ = c136845Yq;
        c136845Yq.setBackgroundColor(0);
        C136845Yq c136845Yq2 = this.LIZIZ;
        o.LJI(c136845Yq2);
        c136845Yq2.addView(view);
        C136845Yq c136845Yq3 = this.LIZIZ;
        o.LJI(c136845Yq3);
        c136845Yq3.setGravity(17);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
        C136845Yq c136845Yq4 = this.LIZIZ;
        o.LJI(c136845Yq4);
        c136845Yq4.setLayoutParams(marginLayoutParams);
        C136845Yq c136845Yq5 = this.LIZIZ;
        o.LJI(c136845Yq5);
        c136845Yq5.setVisibility(8);
        if (this.LJII != 0) {
            C136845Yq c136845Yq6 = this.LIZIZ;
            o.LJI(c136845Yq6);
            c136845Yq6.setBgColor(this.LJII);
        }
        C136845Yq c136845Yq7 = this.LIZIZ;
        o.LJI(c136845Yq7);
        c136845Yq7.setNeedPath(this.LJIIIIZZ);
        C136845Yq c136845Yq8 = this.LIZIZ;
        o.LJI(c136845Yq8);
        c136845Yq8.setNeedPressFade(this.LJIIIZ);
        C136845Yq c136845Yq9 = this.LIZIZ;
        o.LJI(c136845Yq9);
        c136845Yq9.setOnClickListener(new ViewOnClickListenerC13880ga(new ACListenerS34S0100000_14(this, 97)));
        setContentView(this.LIZIZ);
    }

    public final void LJFF(View view) {
        if (this.LIZ.isFinishing() || view == null || view.getWindowToken() == null) {
            return;
        }
        float LIZJ = KL2.LIZJ(this.LIZ, 36.0f);
        float LIZJ2 = KL2.LIZJ(this.LIZ, 64.0f);
        float LIZJ3 = KL2.LIZJ(this.LIZ, 16.0f);
        getContentView().removeCallbacks(this.LJIILJJIL);
        if (!isShowing()) {
            int i = 2;
            int[] iArr = new int[2];
            C81260Vuq c81260Vuq = this.LJIIZILJ;
            if (c81260Vuq != null) {
                Point point = (Point) c81260Vuq.LIZ();
                iArr[0] = point.x;
                iArr[1] = point.y;
            } else {
                view.getLocationOnScreen(iArr);
            }
            this.LJI = 48;
            this.LJIIJJI = -((int) KL2.LIZJ(view.getContext(), 3.5f));
            if ((iArr[1] - getContentView().getMeasuredHeight()) - LIZJ < LIZJ2) {
                this.LJI = 80;
            }
            if (iArr[0] - (LIZIZ() / 2.0f) < LIZJ3) {
                this.LJ = (int) (LIZJ3 - (iArr[0] - (LIZIZ() / 2.0f)));
            }
            if (C60996Nwm.LJIIIIZZ(this.LIZ) - ((LIZIZ() / 2.0f) + iArr[0]) < LIZJ3) {
                this.LJ = (int) ((C60996Nwm.LJIIIIZZ(this.LIZ) - ((LIZIZ() / 2.0f) + iArr[0])) - LIZJ3);
            }
            int i2 = this.LJI;
            if (i2 != 3) {
                if (i2 != 5) {
                    if (i2 != 48) {
                        if (i2 == 80) {
                            i = 0;
                        }
                    } else {
                        i = 3;
                    }
                }
                i = 1;
            }
            float LIZIZ = LIZIZ() / 2.0f;
            C136845Yq c136845Yq = this.LIZIZ;
            o.LJI(c136845Yq);
            c136845Yq.LJLLLL = (this.LJIIJJI + LIZIZ) - this.LJ;
            c136845Yq.LJLLLLLL = i;
            int i3 = this.LJI;
            if (i3 != 48) {
                if (i3 == 80) {
                    C16880lQ.LLLIIIIL(this, view, (int) ((iArr[0] + this.LJ) - LIZIZ), (int) (iArr[1] + LIZJ));
                    LIZ(this.LJI, true);
                }
            } else {
                C16880lQ.LLLIIIIL(this, view, (int) ((iArr[0] + this.LJ) - LIZIZ), (int) ((iArr[1] - LIZJ) - getContentView().getMeasuredHeight()));
                LIZ(this.LJI, true);
            }
            this.LJFF = false;
            if (this.LJIIL <= 0) {
                return;
            }
            getContentView().postDelayed(this.LJIILJJIL, this.LJIIL);
            return;
        }
        super.dismiss();
    }

    public final void LIZ(int i, boolean z) {
        C136845Yq c136845Yq = this.LIZIZ;
        if (!z) {
            this.LJFF = true;
        }
        AnimatorSet animatorSet = this.LJIILIIL;
        if (animatorSet == null) {
            this.LJIILIIL = new AnimatorSet();
        } else {
            C16880lQ.LJLJJL(animatorSet);
            AnimatorSet animatorSet2 = this.LJIILIIL;
            o.LJI(animatorSet2);
            animatorSet2.cancel();
        }
        o.LJI(c136845Yq);
        c136845Yq.post(new ARunnableS3S0211000_14(this, i, c136845Yq, z, 0));
    }

    @Override // android.widget.PopupWindow
    public final void showAtLocation(View parent, int i, int i2, int i3) {
        o.LJIIIZ(parent, "parent");
        try {
            super.showAtLocation(parent, i, i2, i3);
        } catch (Exception e) {
            C36922EeM.LIZ(e);
        }
    }
}
