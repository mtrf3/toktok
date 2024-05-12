package X;

import Y.IDAListenerS83S0100000_29;
import Y.IDCListenerS137S0100000_29;
import Y.IDUListenerS264S0100000_29;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.Zqj, reason: case insensitive filesystem */
/* loaded from: classes22.dex */
public final class C91197Zqj {
    public static final /* synthetic */ int LJIJI = 0;
    public final View LIZ;
    public final View LIZIZ;
    public final View LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final TuxTextView LJII;
    public final TuxTextView LJIIIIZZ;
    public final FrameLayout LJIIIZ;
    public final FrameLayout LJIIJ;
    public final Integer LJIIJJI;
    public final Integer LJIIL;
    public ValueAnimator LJIILIIL;
    public ValueAnimator LJIILJJIL;
    public C91408Zu8 LJIJ;
    public InterfaceC91195Zqh LJFF = null;
    public InterfaceC91194Zqg LJI = null;
    public int LJIILL = 2;
    public EnumC91190Zqc LJIILLIIL = EnumC91190Zqc.BY_USER_CLICK;
    public EnumC91191Zqd LJIIZILJ = EnumC91191Zqd.FAVORITES;

    public final boolean LJ() {
        ValueAnimator valueAnimator = this.LJIILIIL;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            return true;
        }
        ValueAnimator valueAnimator2 = this.LJIILJJIL;
        if (valueAnimator2 != null && valueAnimator2.isRunning()) {
            return true;
        }
        return false;
    }

    public final boolean LIZIZ() {
        if (LJ() || this.LJIILL == 2) {
            return false;
        }
        C91408Zu8 c91408Zu8 = this.LJIJ;
        if (c91408Zu8 != null) {
            C91215Zr1.LIZIZ(c91408Zu8);
            return true;
        }
        return true;
    }

    public final void LIZJ() {
        InterfaceC91195Zqh interfaceC91195Zqh;
        LIZIZ();
        EnumC91191Zqd enumC91191Zqd = this.LJIIZILJ;
        EnumC91191Zqd enumC91191Zqd2 = EnumC91191Zqd.DAILY_MIX;
        if (enumC91191Zqd != enumC91191Zqd2) {
            LJFF(false);
            TuxTextView tuxTextView = this.LJIIIIZZ;
            if (tuxTextView != null && (interfaceC91195Zqh = this.LJFF) != null) {
                interfaceC91195Zqh.LIZ(enumC91191Zqd2, tuxTextView, this.LJIILLIIL);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZLLL() {
        /*
            r4 = this;
            r4.LIZIZ()
            X.Zqd r0 = r4.LJIIZILJ
            X.Zqd r3 = X.EnumC91191Zqd.FAVORITES
            if (r0 == r3) goto L49
            r4.LJIIZILJ = r3
            com.bytedance.tux.input.TuxTextView r1 = r4.LJII
            r0 = 1
            LIZ(r1, r0)
            com.bytedance.tux.input.TuxTextView r0 = r4.LJIIIIZZ
            r2 = 0
            LIZ(r0, r2)
            com.bytedance.tux.input.TuxTextView r1 = r4.LJII
            if (r1 == 0) goto L26
            java.lang.Integer r0 = r4.LJIIJJI
            if (r0 == 0) goto L3c
            int r0 = r0.intValue()
            r1.setTextColor(r0)
        L26:
            com.bytedance.tux.input.TuxTextView r1 = r4.LJIIIIZZ
            if (r1 == 0) goto L35
            java.lang.Integer r0 = r4.LJIIL
            if (r0 == 0) goto L3c
            int r0 = r0.intValue()
            r1.setTextColor(r0)
        L35:
            java.lang.String r1 = r4.LIZLLL
            java.lang.String r0 = r4.LJ
            X.C91249ZrZ.LJI(r2, r1, r0)
        L3c:
            com.bytedance.tux.input.TuxTextView r2 = r4.LJII
            if (r2 == 0) goto L49
            X.Zqh r1 = r4.LJFF
            if (r1 == 0) goto L49
            X.Zqc r0 = r4.LJIILLIIL
            r1.LIZ(r3, r2, r0)
        L49:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C91197Zqj.LIZLLL():void");
    }

    public final void LJFF(boolean z) {
        this.LJIIZILJ = EnumC91191Zqd.DAILY_MIX;
        LIZ(this.LJIIIIZZ, true);
        LIZ(this.LJII, false);
        TuxTextView tuxTextView = this.LJIIIIZZ;
        if (tuxTextView != null) {
            Integer num = this.LJIIJJI;
            if (num != null) {
                tuxTextView.setTextColor(num.intValue());
            } else {
                return;
            }
        }
        TuxTextView tuxTextView2 = this.LJII;
        if (tuxTextView2 != null) {
            Integer num2 = this.LJIIL;
            if (num2 != null) {
                tuxTextView2.setTextColor(num2.intValue());
            } else {
                return;
            }
        }
        if (!z) {
            C91249ZrZ.LJI(1, this.LIZLLL, this.LJ);
        }
    }

    public final boolean LJI(EnumC91190Zqc scene) {
        InterfaceC54434LXy slideGuideViewModel;
        o.LJIIIZ(scene, "scene");
        int i = 0;
        if (LJ() || this.LJIILL == 1) {
            return false;
        }
        this.LJIILLIIL = scene;
        C91408Zu8 c91408Zu8 = this.LJIJ;
        if (c91408Zu8 != null) {
            Context context = this.LIZ.getContext();
            o.LJIIIIZZ(context, "mView.context");
            ActivityC45651qj LJJIFFI = C45804HyK.LJJIFFI(context);
            if (LJJIFFI != null && (slideGuideViewModel = LNZ.LIZIZ.getSlideGuideViewModel(LJJIFFI)) != null) {
                slideGuideViewModel.setVisible(false);
            }
            C91215Zr1.LIZLLL(c91408Zu8);
        }
        String str = this.LIZLLL;
        String str2 = this.LJ;
        int i2 = C91196Zqi.LIZ[scene.ordinal()];
        if (i2 != 1) {
            if (i2 == 2) {
                i = 2;
            }
        } else {
            i = 1;
        }
        C91249ZrZ.LJII(i, str, str2);
        return true;
    }

    public final void LJII(float f) {
        int height;
        FrameLayout frameLayout;
        FrameLayout frameLayout2 = this.LJIIIZ;
        if (frameLayout2 == null || (height = frameLayout2.getHeight()) == 0) {
            return;
        }
        this.LIZ.setBackground(new ColorDrawable(Color.argb((int) (f * 127.5d), 0, 0, 0)));
        View view = this.LIZIZ;
        if (view != null) {
            view.setRotation((-180) * f);
        }
        float f2 = height * (f - 1.0f);
        FrameLayout frameLayout3 = this.LJIIIZ;
        if (frameLayout3 != null) {
            frameLayout3.setTranslationY(f2);
        }
        if (f2 >= (-C17N.LJIILL(60.0d)) || (frameLayout = this.LJIIJ) == null) {
            return;
        }
        frameLayout.setTranslationY(f2);
    }

    public static void LIZ(TuxTextView tuxTextView, boolean z) {
        if (tuxTextView != null) {
            if (z) {
                C110614Vt c110614Vt = new C110614Vt();
                c110614Vt.LIZIZ = Integer.valueOf(R.attr.db);
                c110614Vt.LIZJ = Float.valueOf(C32151Nz.LJIIZILJ(18));
                Context context = tuxTextView.getContext();
                o.LJIIIIZZ(context, "context");
                tuxTextView.setBackground(c110614Vt.LIZ(context));
                return;
            }
            C110614Vt c110614Vt2 = new C110614Vt();
            c110614Vt2.LJFF = Integer.valueOf(R.attr.db);
            c110614Vt2.LIZLLL = Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(1)));
            c110614Vt2.LIZJ = Float.valueOf(C32151Nz.LJIIZILJ(18));
            Context context2 = tuxTextView.getContext();
            o.LJIIIIZZ(context2, "context");
            tuxTextView.setBackground(c110614Vt2.LIZ(context2));
        }
    }

    public C91197Zqj(View view, View view2, View view3, String str, String str2) {
        int i;
        ViewTreeObserver viewTreeObserver;
        this.LIZ = view;
        this.LIZIZ = view2;
        this.LIZJ = view3;
        this.LIZLLL = str;
        this.LJ = str2;
        TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.aua);
        this.LJII = tuxTextView;
        TuxTextView tuxTextView2 = (TuxTextView) view.findViewById(R.id.au8);
        this.LJIIIIZZ = tuxTextView2;
        FrameLayout frameLayout = (FrameLayout) view.findViewById(R.id.dby);
        this.LJIIIZ = frameLayout;
        FrameLayout frameLayout2 = (FrameLayout) view.findViewById(R.id.dbu);
        this.LJIIJ = frameLayout2;
        View findViewById = view.findViewById(R.id.nkb);
        Context context = view.getContext();
        o.LJIIIIZZ(context, "mView.context");
        Integer LJI = C79045V0n.LJI(R.attr.dm, context);
        this.LJIIL = LJI;
        Context context2 = view.getContext();
        o.LJIIIIZZ(context2, "mView.context");
        this.LJIIJJI = C79045V0n.LJI(R.attr.dj, context2);
        if (LJI != null) {
            int intValue = LJI.intValue();
            if (tuxTextView2 != null) {
                tuxTextView2.setTextColor(intValue);
            }
            if (tuxTextView != null) {
                tuxTextView.setTextColor(intValue);
            }
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.LJIILIIL = ofFloat;
        if (ofFloat != null) {
            ofFloat.setDuration(342L);
        }
        ValueAnimator valueAnimator = this.LJIILIIL;
        if (valueAnimator != null) {
            valueAnimator.setInterpolator(new InterpolatorC91085Zov(4.0f));
        }
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.LJIILJJIL = ofFloat2;
        if (ofFloat2 != null) {
            ofFloat2.setDuration(342L);
        }
        ValueAnimator valueAnimator2 = this.LJIILJJIL;
        if (valueAnimator2 != null) {
            valueAnimator2.setInterpolator(new InterpolatorC91085Zov(4.0f));
        }
        ValueAnimator valueAnimator3 = this.LJIILIIL;
        if (valueAnimator3 != null) {
            valueAnimator3.addUpdateListener(new IDUListenerS264S0100000_29(this, 9));
        }
        ValueAnimator valueAnimator4 = this.LJIILJJIL;
        if (valueAnimator4 != null) {
            valueAnimator4.addUpdateListener(new IDUListenerS264S0100000_29(this, 10));
        }
        ValueAnimator valueAnimator5 = this.LJIILIIL;
        if (valueAnimator5 != null) {
            valueAnimator5.addListener(new IDAListenerS83S0100000_29(this, 4));
        }
        ValueAnimator valueAnimator6 = this.LJIILJJIL;
        if (valueAnimator6 != null) {
            valueAnimator6.addListener(new IDAListenerS83S0100000_29(this, 5));
        }
        Context context3 = view.getContext();
        o.LJIIIIZZ(context3, "mView.context");
        LifecycleOwner LIZIZ = C57434MgQ.LIZIZ(context3);
        if (LIZIZ != null) {
            this.LJIJ = new C91408Zu8(this.LJIILIIL, this.LJIILJJIL, LIZIZ);
        }
        if (tuxTextView2 != null) {
            C16880lQ.LJJJJI(tuxTextView2, new IDCListenerS137S0100000_29(this, 6));
        }
        if (tuxTextView != null) {
            C16880lQ.LJJJJI(tuxTextView, new IDCListenerS137S0100000_29(this, 7));
        }
        C16880lQ.LJIIJ(new IDCListenerS137S0100000_29(this, 8), view);
        int[] iArr = new int[2];
        if (view3 != null) {
            view3.getLocationInWindow(iArr);
            i = view3.getHeight();
        } else {
            i = 0;
        }
        int i2 = iArr[1];
        if (i2 != 0 && i != 0) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, i2 + C17N.LJIILL(60.0d) + i);
            if (frameLayout2 != null) {
                frameLayout2.setLayoutParams(layoutParams);
            }
            if (frameLayout != null) {
                frameLayout.setLayoutParams(layoutParams);
            }
        }
        LJFF(true);
        if (findViewById != null && (viewTreeObserver = findViewById.getViewTreeObserver()) != null) {
            viewTreeObserver.addOnWindowAttachListener(new ViewTreeObserverOnWindowAttachListenerC91192Zqe(this));
        }
    }
}
