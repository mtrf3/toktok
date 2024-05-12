package X;

import Y.ACListenerS23S0100000_3;
import Y.ARunnableS39S0100000_3;
import android.animation.AnimatorSet;
import android.app.Activity;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.PopupWindow;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.8vY, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C227008vY extends PopupWindow {
    public static int LJIILL;
    public final Activity LIZ;
    public C136845Yq LIZIZ;
    public TuxTextView LIZJ;
    public int LIZLLL;
    public int LJ;
    public boolean LJFF;
    public boolean LJI;
    public int LJII;
    public int LJIIIIZZ;
    public final boolean LJIIIZ;
    public long LJIIJ;
    public AnimatorSet LJIIJJI;
    public final ARunnableS39S0100000_3 LJIIL;
    public long LJIILIIL;
    public long LJIILJJIL;

    public final void LIZIZ() {
        if (!this.LJI) {
            C136845Yq c136845Yq = this.LIZIZ;
            o.LJI(c136845Yq);
            c136845Yq.setVisibility(8);
            LIZJ();
            getContentView().removeCallbacks(this.LJIIL);
        }
    }

    public final void LIZJ() {
        AnimatorSet animatorSet = this.LJIIJJI;
        if (animatorSet != null) {
            o.LJI(animatorSet);
            C16880lQ.LJLJJL(animatorSet);
            AnimatorSet animatorSet2 = this.LJIIJJI;
            o.LJI(animatorSet2);
            animatorSet2.cancel();
            this.LJIIJJI = null;
        }
        if (this.LIZ.isFinishing() || !isShowing()) {
            return;
        }
        try {
            super.dismiss();
        } catch (Exception e) {
            C78983UzD.LJIIZILJ(e);
            C36922EeM.LIZ(e);
        }
    }

    @Override // android.widget.PopupWindow
    public final void dismiss() {
        if (!this.LJI) {
            LIZ(this.LJII, false);
            getContentView().removeCallbacks(this.LJIIL);
        }
    }

    public C227008vY(Activity activity) {
        super(activity);
        this.LIZ = activity;
        this.LJIIIZ = true;
        this.LJIIJ = 7000L;
        this.LJIIL = new ARunnableS39S0100000_3(this, 193);
        this.LJIILIIL = 800L;
        this.LJIILJJIL = 200L;
        LJIILL = (int) ((activity.getResources().getDisplayMetrics().density * 3.0f) + 0.5f);
        setWidth(-2);
        setHeight(-2);
        setFocusable(false);
        setOutsideTouchable(false);
        setClippingEnabled(false);
        setBackgroundDrawable(new ColorDrawable(0));
        setInputMethodMode(1);
        setSoftInputMode(16);
        TuxTextView tuxTextView = new TuxTextView(activity, null, 6, 0);
        this.LIZJ = tuxTextView;
        tuxTextView.setTextColor(AnonymousClass636.LJIIIIZZ(R.attr.go, activity));
        TuxTextView tuxTextView2 = this.LIZJ;
        o.LJI(tuxTextView2);
        tuxTextView2.setTuxFont(61);
        TuxTextView tuxTextView3 = this.LIZJ;
        o.LJI(tuxTextView3);
        tuxTextView3.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        TuxTextView tuxTextView4 = this.LIZJ;
        o.LJI(tuxTextView4);
        tuxTextView4.setMaxLines(2);
        TuxTextView tuxTextView5 = this.LIZJ;
        o.LJI(tuxTextView5);
        tuxTextView5.setGravity(17);
        LIZLLL(this.LIZJ);
        this.LJFF = true;
        getContentView().measure(LiveLayoutPreloadThreadPriority.DEFAULT, LiveLayoutPreloadThreadPriority.DEFAULT);
    }

    public final void LIZLLL(View view) {
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
        if (this.LJIIIIZZ != 0) {
            C136845Yq c136845Yq6 = this.LIZIZ;
            o.LJI(c136845Yq6);
            c136845Yq6.setBgColor(this.LJIIIIZZ);
        }
        C136845Yq c136845Yq7 = this.LIZIZ;
        o.LJI(c136845Yq7);
        c136845Yq7.setNeedPath(this.LJIIIZ);
        C136845Yq c136845Yq8 = this.LIZIZ;
        o.LJI(c136845Yq8);
        c136845Yq8.setNeedPressFade(false);
        C136845Yq c136845Yq9 = this.LIZIZ;
        o.LJI(c136845Yq9);
        c136845Yq9.setOnClickListener(new ViewOnClickListenerC13880ga(new ACListenerS23S0100000_3(this, 281)));
        setContentView(this.LIZIZ);
    }

    public static void LJ(C227008vY c227008vY, TuxTextView tuxTextView) {
        if (c227008vY.LIZ.isFinishing() || tuxTextView == null || tuxTextView.getWindowToken() == null) {
            return;
        }
        c227008vY.getContentView().removeCallbacks(c227008vY.LJIIL);
        c227008vY.LJII = 80;
        if (!c227008vY.isShowing()) {
            int i = c227008vY.LIZLLL;
            if (i != 0 && c227008vY.LJ != 0) {
                c227008vY.getContentView().measure(View.MeasureSpec.makeMeasureSpec(i, 1073741824), View.MeasureSpec.makeMeasureSpec(c227008vY.LJ, 1073741824));
            } else {
                c227008vY.getContentView().measure(LiveLayoutPreloadThreadPriority.DEFAULT, LiveLayoutPreloadThreadPriority.DEFAULT);
            }
            float measuredWidth = c227008vY.getContentView().getMeasuredWidth() / 2;
            C136845Yq c136845Yq = c227008vY.LIZIZ;
            o.LJI(c136845Yq);
            c136845Yq.LJLLLL = measuredWidth + 0;
            c136845Yq.LJLLLLLL = 0;
            tuxTextView.getLocationOnScreen(new int[2]);
            if (c227008vY.LJFF) {
                c227008vY.getContentView().setSystemUiVisibility(4102);
            }
            int measuredWidth2 = (tuxTextView.getMeasuredWidth() - c227008vY.getContentView().getMeasuredWidth()) / 2;
            int i2 = LJIILL;
            if (C4XM.LIZ()) {
                C56308M8a.LIZ();
            }
            C46318IFu.LIZ.getClass();
            if (C46318IFu.LIZ()) {
                try {
                    C56308M8a.LIZIZ();
                    Window window = (Window) C56308M8a.LIZJ.get((WindowManager) C56308M8a.LIZIZ.get(c227008vY));
                    WindowManager.LayoutParams attributes = window.getAttributes();
                    int i3 = attributes.flags;
                    boolean booleanValue = ((Boolean) C56308M8a.LIZLLL.get(window)).booleanValue();
                    C56308M8a.LIZLLL.set(window, Boolean.FALSE);
                    attributes.flags &= -16777217;
                    c227008vY.showAsDropDown(tuxTextView, measuredWidth2, i2);
                    C56308M8a.LIZLLL.set(window, Boolean.valueOf(booleanValue));
                    attributes.flags = i3;
                } catch (Throwable unused) {
                    c227008vY.showAsDropDown(tuxTextView, measuredWidth2, i2);
                }
            } else {
                c227008vY.showAsDropDown(tuxTextView, measuredWidth2, i2);
            }
            c227008vY.LIZ(80, true);
            c227008vY.LJI = false;
            if (c227008vY.LJIIJ <= 0) {
                return;
            }
            c227008vY.getContentView().postDelayed(c227008vY.LJIIL, c227008vY.LJIIJ);
            return;
        }
        super.dismiss();
    }

    public final void LIZ(final int i, final boolean z) {
        final C136845Yq c136845Yq = this.LIZIZ;
        if (!z) {
            this.LJI = true;
        }
        AnimatorSet animatorSet = this.LJIIJJI;
        if (animatorSet == null) {
            this.LJIIJJI = new AnimatorSet();
        } else {
            C16880lQ.LJLJJL(animatorSet);
            AnimatorSet animatorSet2 = this.LJIIJJI;
            o.LJI(animatorSet2);
            animatorSet2.cancel();
        }
        o.LJI(c136845Yq);
        c136845Yq.post(new Runnable() { // from class: X.8uP
            /* JADX WARN: Removed duplicated region for block: B:16:0x0030  */
            /* JADX WARN: Removed duplicated region for block: B:19:0x0035  */
            /* JADX WARN: Removed duplicated region for block: B:22:0x004d  */
            /* JADX WARN: Removed duplicated region for block: B:25:0x0052  */
            /* JADX WARN: Removed duplicated region for block: B:28:0x007a  */
            /* JADX WARN: Removed duplicated region for block: B:31:0x00a7  */
            /* JADX WARN: Removed duplicated region for block: B:32:0x00ac  */
            /* JADX WARN: Removed duplicated region for block: B:33:0x00af  */
            /* JADX WARN: Removed duplicated region for block: B:34:0x00b1  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LIZ() {
                /*
                    Method dump skipped, instructions count: 304
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.RunnableC226298uP.LIZ():void");
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean LIZ;
                try {
                    LIZ();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        });
    }

    @Override // android.widget.PopupWindow
    public final void showAtLocation(View parent, int i, int i2, int i3) {
        o.LJIIIZ(parent, "parent");
        try {
            super.showAtLocation(parent, i, i2, i3);
        } catch (Exception e) {
            C78983UzD.LJIIZILJ(e);
            C36922EeM.LIZ(e);
        }
    }
}
