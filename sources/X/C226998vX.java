package X;

import Y.IDAListenerS1S0110000_3;
import Y.IDAListenerS72S0100000_3;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.PopupWindow;
import com.bytedance.poplayer.core.PopupManager;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.8vX */
/* loaded from: classes4.dex */
public final class C226998vX extends PopupWindow {
    public static final int LJII = O6R.LJJIIZ(C32151Nz.LJIIZILJ(44));
    public final Activity LIZ;
    public final View LIZIZ;
    public InterfaceC65784Pro<C76800UCe> LIZJ;
    public InterfaceC65784Pro<C76800UCe> LIZLLL;
    public InterfaceC65784Pro<C76800UCe> LJ;
    public final ViewOnClickListenerC226978vV LJFF;
    public final C227018vZ LJI;

    public final void LIZLLL() {
        this.LJFF.measure(0, 0);
        View view = this.LIZIZ;
        int i = LJII;
        if (C4XM.LIZ()) {
            C56308M8a.LIZ();
        }
        C46318IFu.LIZ.getClass();
        if (C46318IFu.LIZ()) {
            try {
                C56308M8a.LIZIZ();
                Window window = (Window) C56308M8a.LIZJ.get((WindowManager) C56308M8a.LIZIZ.get(this));
                WindowManager.LayoutParams attributes = window.getAttributes();
                int i2 = attributes.flags;
                boolean booleanValue = ((Boolean) C56308M8a.LIZLLL.get(window)).booleanValue();
                C56308M8a.LIZLLL.set(window, Boolean.FALSE);
                attributes.flags &= -16777217;
                showAtLocation(view, 80, 0, i);
                C56308M8a.LIZLLL.set(window, Boolean.valueOf(booleanValue));
                attributes.flags = i2;
            } catch (Throwable unused) {
                showAtLocation(view, 80, 0, i);
            }
        } else {
            showAtLocation(view, 80, 0, i);
        }
        LIZIZ(true);
    }

    @Override // android.widget.PopupWindow
    public final void dismiss() {
        this.LJFF.animate().cancel();
        LIZIZ(false).addListener(new IDAListenerS72S0100000_3(this, 0));
        C9XU.LIZLLL(this.LJI);
        PopupManager.LIZJ(C207988Eg.class);
    }

    public final Animator LIZIZ(boolean z) {
        float f;
        float f2;
        float f3;
        long j;
        float f4 = 0.0f;
        if (z) {
            f2 = LJII;
            f = 0.0f;
        } else {
            f = LJII;
            f2 = 0.0f;
        }
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.LJFF, "translationY", f2, f).setDuration(348L);
        o.LJIIIIZZ(duration, "ofFloat(\n            roo…       ).setDuration(348)");
        duration.setInterpolator(new InterpolatorC227028va());
        ViewOnClickListenerC226978vV viewOnClickListenerC226978vV = this.LJFF;
        float[] fArr = new float[2];
        if (z) {
            f3 = 0.0f;
        } else {
            f3 = 1.0f;
        }
        fArr[0] = f3;
        if (z) {
            f4 = 1.0f;
        }
        fArr[1] = f4;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(viewOnClickListenerC226978vV, "alpha", fArr);
        if (z) {
            j = 150;
        } else {
            j = 100;
        }
        ObjectAnimator duration2 = ofFloat.setDuration(j);
        o.LJIIIIZZ(duration2, "ofFloat(\n            roo…n(if (isIn) 150 else 100)");
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(duration2, duration);
        animatorSet.addListener(new IDAListenerS1S0110000_3(this, z, 0));
        animatorSet.start();
        return animatorSet;
    }

    public final void LIZJ(ViewOnClickListenerC226978vV viewOnClickListenerC226978vV) {
        LFH lfh = LFH.LIZIZ;
        lfh.LIZLLL().LJIIZILJ();
        if (LEZ.LIZ.LIZIZ(this.LIZ, null)) {
            lfh.LIZLLL().LJIIZILJ();
            viewOnClickListenerC226978vV.setPadding(O6R.LJJIIZ(C32151Nz.LJIIZILJ(60)), viewOnClickListenerC226978vV.getPaddingTop(), viewOnClickListenerC226978vV.getPaddingRight(), viewOnClickListenerC226978vV.getPaddingBottom());
        } else {
            viewOnClickListenerC226978vV.setPadding(0, viewOnClickListenerC226978vV.getPaddingTop(), viewOnClickListenerC226978vV.getPaddingRight(), viewOnClickListenerC226978vV.getPaddingBottom());
        }
    }

    /* JADX WARN: Type inference failed for: r0v29, types: [X.8vZ] */
    public C226998vX(Activity activity, EnumC207888Dw popupFlow) {
        View decorView;
        String string;
        String LIZIZ;
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(popupFlow, "popupFlow");
        this.LIZ = activity;
        Window window = activity.getWindow();
        if (window != null && (decorView = window.getDecorView()) != null) {
            this.LIZIZ = decorView;
            InterfaceC226988vW interfaceC226988vW = new InterfaceC226988vW() { // from class: X.8Ec
                @Override // X.InterfaceC226988vW
                public final void LIZ() {
                    InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = C226998vX.this.LIZLLL;
                    if (interfaceC65784Pro != null) {
                        interfaceC65784Pro.invoke();
                    }
                    C226998vX.this.dismiss();
                }

                @Override // X.InterfaceC226988vW
                public final void LIZIZ() {
                    InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = C226998vX.this.LIZJ;
                    if (interfaceC65784Pro != null) {
                        interfaceC65784Pro.invoke();
                    }
                }
            };
            ViewOnClickListenerC226978vV viewOnClickListenerC226978vV = new ViewOnClickListenerC226978vV(activity, null);
            C2068389v c2068389v = new C2068389v();
            c2068389v.LIZ = R.raw.icon_camera_person_double_star_fill;
            c2068389v.LJ = Integer.valueOf(R.attr.go);
            viewOnClickListenerC226978vV.setIconImageResource(c2068389v.LIZ(activity));
            EnumC207888Dw enumC207888Dw = EnumC207888Dw.ONLY_NICKNAME;
            if (popupFlow == enumC207888Dw) {
                string = viewOnClickListenerC226978vV.getContext().getString(R.string.cl7);
            } else {
                string = viewOnClickListenerC226978vV.getContext().getString(R.string.cl6);
            }
            o.LJIIIIZZ(string, "if (popupFlow == AvatarA…ews_banner_cta)\n        }");
            if (popupFlow == enumC207888Dw) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(viewOnClickListenerC226978vV.getContext().getString(R.string.cl9));
                LIZ.append(' ');
                LIZIZ = X1D.LIZIZ(LIZ);
            } else {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append(viewOnClickListenerC226978vV.getContext().getString(R.string.cl8));
                LIZ2.append(' ');
                LIZIZ = X1D.LIZIZ(LIZ2);
            }
            StringBuilder sb = new StringBuilder();
            sb.append(LIZIZ);
            sb.append(string);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(sb);
            String spannableStringBuilder2 = spannableStringBuilder.toString();
            o.LJIIIIZZ(spannableStringBuilder2, "builder.toString()");
            int LJJLIIJ = s.LJJLIIJ(spannableStringBuilder2, string, 6);
            Integer LJI = C79045V0n.LJI(R.attr.eb, activity);
            if (LJI != null) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(LJI.intValue()), LJJLIIJ, string.length() + LJJLIIJ, 34);
            }
            spannableStringBuilder.setSpan(new StyleSpan(1), LJJLIIJ, string.length() + LJJLIIJ, 34);
            viewOnClickListenerC226978vV.setTitleText(spannableStringBuilder);
            C2068389v c2068389v2 = new C2068389v();
            c2068389v2.LIZ = R.raw.icon_x_mark_small;
            c2068389v2.LJ = Integer.valueOf(R.attr.gp);
            viewOnClickListenerC226978vV.setCloseImage(c2068389v2.LIZ(activity));
            viewOnClickListenerC226978vV.setNoticeBackgroundColor(0);
            if (C99W.LIZ) {
                View findViewById = viewOnClickListenerC226978vV.findViewById(R.id.h41);
                C110614Vt c110614Vt = new C110614Vt();
                c110614Vt.LIZJ = C61328O5c.LIZJ(12);
                c110614Vt.LIZIZ = Integer.valueOf(R.attr.cl);
                Context context = viewOnClickListenerC226978vV.getContext();
                o.LJIIIIZZ(context, "context");
                findViewById.setBackground(c110614Vt.LIZ(context));
            }
            viewOnClickListenerC226978vV.setElevation(2.0f);
            setContentView(viewOnClickListenerC226978vV);
            this.LJFF = viewOnClickListenerC226978vV;
            this.LJI = new G27() { // from class: X.8vZ
                @Override // X.G27
                public final void onConfigurationChanged(Activity activity2, Configuration newConfig) {
                    o.LJIIIZ(newConfig, "newConfig");
                    C226998vX c226998vX = C226998vX.this;
                    c226998vX.LIZJ(c226998vX.LJFF);
                }
            };
            setWidth(-1);
            setHeight(-2);
            viewOnClickListenerC226978vV.setOnInternalClickListener(interfaceC226988vW);
            return;
        }
        throw new IllegalStateException("Bad activity");
    }
}
