package X;

import Y.IDTListenerS116S0100000_7;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.IBinder;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.WindowManager;
import androidx.lifecycle.MutableLiveData;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.AqS23S0310000_7;
import kotlin.jvm.internal.o;

/* renamed from: X.GVq, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41634GVq {
    public final Context LIZ;
    public final View LIZIZ;
    public final float LIZJ = 0.8f;
    public final int LIZLLL = C7MY.LIZIZ(12);
    public final int LJ = C7MY.LIZIZ(8);
    public final int LJFF = C7MY.LIZIZ(6);
    public int LJI;
    public int LJII;
    public int LJIIIIZZ;
    public final int LJIIIZ;
    public final WindowManager.LayoutParams LJIIJ;
    public WindowManager LJIIJJI;
    public final int LJIIL;
    public int LJIILIIL;
    public final Handler LJIILJJIL;
    public boolean LJIILL;
    public int LJIILLIIL;
    public int LJIIZILJ;
    public ValueAnimator LJIJ;
    public ValueAnimator LJIJI;
    public float LJIJJ;
    public float LJIJJLI;
    public float LJIL;
    public float LJJ;
    public long LJJI;
    public long LJJIFFI;
    public boolean LJJII;
    public boolean LJJIII;
    public int LJJIIJ;
    public final long LJJIIJZLJL;
    public final long LJJIIZ;
    public final long LJJIIZI;
    public float LJJIJ;
    public float LJJIJIIJI;
    public long LJJIJIIJIL;
    public final MutableLiveData<Boolean> LJJIJIL;
    public InterfaceC41635GVr LJJIJL;

    public static void LIZIZ(C41634GVq c41634GVq) {
        int i;
        int LIZIZ = C7MY.LIZIZ(50);
        WindowManager.LayoutParams layoutParams = c41634GVq.LJIIJ;
        if (C173636rf.LIZIZ(c41634GVq.LIZ)) {
            int i2 = c41634GVq.LJIILLIIL;
            int i3 = c41634GVq.LJII;
            if (c41634GVq.LIZIZ.getMeasuredWidth() > 0) {
                LIZIZ = c41634GVq.LIZIZ.getMeasuredWidth();
            }
            i = (i3 - LIZIZ) - i2;
        } else {
            i = c41634GVq.LJIILLIIL;
        }
        layoutParams.x = i;
        layoutParams.y = c41634GVq.LJIIZILJ;
    }

    public final void LIZJ(View view) {
        Float f;
        try {
            WindowManager windowManager = this.LJIIJJI;
            if (windowManager != null) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("removeWindowView: x = ");
                LIZ.append(this.LJIIJ.x);
                LIZ.append(", y = ");
                LIZ.append(this.LJIIJ.y);
                LIZ.append(", alpha = ");
                if (view == null) {
                    f = null;
                } else {
                    f = Float.valueOf(view.getAlpha());
                }
                LIZ.append(f);
                X1D.LIZIZ(LIZ);
                windowManager.removeViewImmediate(view);
            }
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    public C41634GVq(Context context, C42041Gej c42041Gej) {
        this.LIZ = context;
        this.LIZIZ = c42041Gej;
        this.LJI = C60996Nwm.LJ(context);
        this.LJII = C81184Vtc.LJ(context);
        this.LJIIIIZZ = C81184Vtc.LJFF(context);
        this.LJIIIZ = C81184Vtc.LIZJ(context);
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.LJIIJ = layoutParams;
        this.LJIIL = ViewConfiguration.get(context).getScaledTouchSlop();
        this.LJIILJJIL = new Handler(C16880lQ.LLJJJJ());
        this.LJIILL = true;
        this.LJIILLIIL = C41620GVc.LIZIZ;
        this.LJIIZILJ = C41620GVc.LIZJ + this.LJIIIIZZ;
        this.LJIJJ = -1.0f;
        this.LJIJJLI = -1.0f;
        this.LJIL = -1.0f;
        this.LJJ = -1.0f;
        this.LJJIII = true;
        this.LJJIIJZLJL = 500L;
        this.LJJIIZ = 300L;
        this.LJJIIZI = 200L;
        this.LJJIJIL = new MutableLiveData<>(Boolean.FALSE);
        layoutParams.type = 1000;
        layoutParams.flags = 552;
        layoutParams.format = 1;
        layoutParams.gravity = 8388659;
        layoutParams.width = -2;
        layoutParams.height = -2;
        c42041Gej.setOnTouchListener(new IDTListenerS116S0100000_7(this, 10));
        LIZIZ(this);
    }

    public static void LIZLLL(C41634GVq c41634GVq, int i) {
        boolean z;
        int i2;
        int i3 = 0;
        if ((i & 1) != 0) {
            z = true;
        } else {
            z = false;
        }
        if ((i & 2) != 0) {
            i3 = c41634GVq.LIZIZ.getMeasuredWidth();
        }
        if (o.LJ(c41634GVq.LJJIJIL.getValue(), Boolean.TRUE)) {
            return;
        }
        int i4 = c41634GVq.LJIIJ.x;
        int i5 = c41634GVq.LIZLLL;
        int i6 = (c41634GVq.LJII - i3) - i5;
        C76732zl c76732zl = new C76732zl();
        WindowManager.LayoutParams layoutParams = c41634GVq.LJIIJ;
        if (layoutParams.x > (c41634GVq.LJII - i3) / 2) {
            i2 = i6;
        } else {
            i2 = i5;
        }
        c76732zl.element = i2;
        float f = c41634GVq.LJJIJIIJI;
        if (f > 0.0f && c41634GVq.LJJIJ > c41634GVq.LIZJ && z) {
            c76732zl.element = i6;
        } else if (f < 0.0f && c41634GVq.LJJIJ > c41634GVq.LIZJ && z) {
            c76732zl.element = i5;
        }
        int i7 = layoutParams.y;
        int i8 = c41634GVq.LJ + c41634GVq.LJIIIIZZ;
        int measuredHeight = ((c41634GVq.LJI - c41634GVq.LJIIIZ) - c41634GVq.LIZIZ.getMeasuredHeight()) - c41634GVq.LJFF;
        int i9 = c41634GVq.LJIIJ.y;
        if (i9 <= measuredHeight) {
            if (i9 < i8) {
                measuredHeight = i8;
            } else {
                measuredHeight = i9;
            }
        }
        if (z) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.setDuration(300L);
            ofFloat.addUpdateListener(new GVU(c41634GVq, i4, c76732zl, i7, measuredHeight));
            ofFloat.setInterpolator(C55953Lxd.LJIIJJI());
            ofFloat.start();
            return;
        }
        if (c41634GVq.LIZIZ.getParent() == null) {
            return;
        }
        WindowManager.LayoutParams layoutParams2 = c41634GVq.LJIIJ;
        layoutParams2.x = c76732zl.element;
        layoutParams2.y = measuredHeight;
        WindowManager windowManager = c41634GVq.LJIIJJI;
        if (windowManager == null) {
            return;
        }
        windowManager.updateViewLayout(c41634GVq.LIZIZ, layoutParams2);
    }

    public final void LIZ(Activity activity, int i, int i2, InterfaceC88472Yns<? super Boolean, C76800UCe> afterAdd, boolean z, boolean z2) {
        WindowManager windowManager;
        int LIZIZ;
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(afterAdd, "afterAdd");
        if (i > 0 && !GVE.LIZ()) {
            this.LJIILLIIL = i;
            WindowManager.LayoutParams layoutParams = this.LJIIJ;
            if (C173636rf.LIZIZ(this.LIZ)) {
                int i3 = this.LJII;
                if (this.LIZIZ.getMeasuredWidth() > 0) {
                    LIZIZ = this.LIZIZ.getMeasuredWidth();
                } else {
                    LIZIZ = C7MY.LIZIZ(50);
                }
                i = (i3 - LIZIZ) - i;
            }
            layoutParams.x = i;
        }
        if (i2 > 0 && !GVE.LIZ()) {
            this.LJIIZILJ = i2;
            this.LJIIJ.y = i2 + this.LJIIIIZZ;
        }
        Object LLILIL = C16880lQ.LLILIL(activity, "window");
        Float f = null;
        if (LLILIL instanceof WindowManager) {
            windowManager = (WindowManager) LLILIL;
        } else {
            windowManager = null;
        }
        this.LJIIJJI = windowManager;
        IBinder windowToken = activity.getWindow().getDecorView().getWindowToken();
        if (windowToken == null) {
            if (!z) {
                JVD.LIZ(activity.getWindow().getDecorView(), new AqS23S0310000_7(this, (C41634GVq) activity, (Activity) afterAdd, (InterfaceC88472Yns<? super Boolean, C76800UCe>) z2, true));
                return;
            } else {
                afterAdd.invoke(Boolean.FALSE);
                return;
            }
        }
        this.LJIIJ.token = windowToken;
        int LJ = C60996Nwm.LJ(this.LIZ);
        if (LJ != this.LJI) {
            this.LJI = LJ;
            this.LJII = C81184Vtc.LJ(this.LIZ);
            this.LJIIIIZZ = C81184Vtc.LJFF(this.LIZ);
        }
        WindowManager windowManager2 = this.LJIIJJI;
        if (windowManager2 != null) {
            int hashCode = windowManager2.hashCode();
            if (hashCode == this.LJIILIIL) {
                afterAdd.invoke(Boolean.TRUE);
                return;
            }
            if (this.LIZIZ.getParent() != null) {
                LIZJ(this.LIZIZ);
            }
            View view = this.LIZIZ;
            WindowManager.LayoutParams layoutParams2 = this.LJIIJ;
            try {
                WindowManager windowManager3 = this.LJIIJJI;
                if (windowManager3 != null) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("addWindowView: x = ");
                    LIZ.append(this.LJIIJ.x);
                    LIZ.append(", y = ");
                    LIZ.append(this.LJIIJ.y);
                    LIZ.append(", alpha = ");
                    if (view != null) {
                        f = Float.valueOf(view.getAlpha());
                    }
                    LIZ.append(f);
                    X1D.LIZIZ(LIZ);
                    C51639KOl.LIZ(new Object[]{view, layoutParams2});
                    windowManager3.addView(view, layoutParams2);
                }
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
            }
            JVD.LIZ(this.LIZIZ, new AqS157S0100000_7(this, 599));
            this.LJIILIIL = hashCode;
        }
        afterAdd.invoke(Boolean.TRUE);
    }
}
