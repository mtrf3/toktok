package X;

import Y.ARunnableS50S0100000_14;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.GradientDrawable;
import android.os.Handler;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.Vus, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81262Vus extends PopupWindow {
    public View LIZ;
    public View LIZIZ;
    public final Context LIZJ;
    public final View LIZLLL;
    public final C81263Vut LJ;

    @Override // android.widget.PopupWindow
    public final void dismiss() {
        if (this.LJ.LJLJL) {
            LIZ(false);
            new Handler(C16880lQ.LLJJJJ()).postDelayed(new ARunnableS50S0100000_14(this, 206), 500L);
        } else {
            try {
                super.dismiss();
            } catch (Exception unused) {
            }
        }
    }

    public final void LIZIZ() {
        try {
            super.dismiss();
        } catch (Exception unused) {
        }
    }

    public final void LIZ(boolean z) {
        float translationY;
        float f;
        int i;
        View view = this.LIZ;
        if (view != null) {
            View toastLayout = view.findViewById(R.id.lbl);
            if (z) {
                o.LJIIIIZZ(toastLayout, "toastLayout");
                translationY = -toastLayout.getMeasuredHeight();
                int identifier = this.LIZJ.getResources().getIdentifier("status_bar_height", "dimen", "android");
                if (identifier > 0) {
                    i = this.LIZJ.getResources().getDimensionPixelSize(identifier);
                } else {
                    i = 0;
                }
                Resources system = Resources.getSystem();
                o.LJIIIIZZ(system, "Resources.getSystem()");
                f = TypedValue.applyDimension(1, 0, system.getDisplayMetrics()) + i + this.LJ.LJLLI;
            } else {
                o.LJIIIIZZ(toastLayout, "toastLayout");
                translationY = toastLayout.getTranslationY();
                f = -toastLayout.getMeasuredHeight();
            }
            ObjectAnimator duration = ObjectAnimator.ofFloat(toastLayout, "translationY", translationY, f).setDuration(416L);
            o.LJIIIIZZ(duration, "ObjectAnimator.ofFloat(\n…       ).setDuration(416)");
            duration.setInterpolator(new AccelerateDecelerateInterpolator());
            duration.start();
            return;
        }
        o.LJIJI("root");
        throw null;
    }

    public C81262Vus(Context context, View view, C81263Vut toastBundle) {
        o.LJIIIZ(toastBundle, "toastBundle");
        this.LIZJ = context;
        this.LIZLLL = view;
        this.LJ = toastBundle;
        setWidth(-1);
        setHeight(-1);
        setClippingEnabled(false);
        setTouchable(false);
        int color = context.getResources().getColor(R.color.qc);
        Resources system = Resources.getSystem();
        o.LJIIIIZZ(system, "Resources.getSystem()");
        float applyDimension = TypedValue.applyDimension(1, 4, system.getDisplayMetrics());
        int color2 = context.getResources().getColor(R.color.qd);
        View LLLZIIL = C16880lQ.LLLZIIL(R.layout.byu, C16880lQ.LLZIL(context), null);
        o.LJIIIIZZ(LLLZIIL, "LayoutInflater.from(cont…).inflate(layoutId, null)");
        this.LIZ = LLLZIIL;
        setContentView(LLLZIIL);
        View view2 = this.LIZ;
        if (view2 != null) {
            View findViewById = view2.findViewById(R.id.lbl);
            o.LJIIIIZZ(findViewById, "root.findViewById<FrameLayout>(R.id.toast_layout)");
            this.LIZIZ = findViewById;
            C81265Vuv c81265Vuv = new C81265Vuv();
            c81265Vuv.LIZ = Integer.valueOf(color);
            c81265Vuv.LIZIZ = Float.valueOf(applyDimension);
            GradientDrawable gradientDrawable = new GradientDrawable();
            Integer num = c81265Vuv.LIZ;
            if (num != null) {
                gradientDrawable.setColor(num.intValue());
            }
            Float f = c81265Vuv.LIZIZ;
            if (f != null) {
                gradientDrawable.setCornerRadius(f.floatValue());
            }
            findViewById.setBackground(gradientDrawable);
            if (toastBundle.LJLL > 0) {
                View view3 = this.LIZIZ;
                if (view3 != null) {
                    ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
                    layoutParams.width = toastBundle.LJLL;
                    View view4 = this.LIZIZ;
                    if (view4 != null) {
                        view4.setLayoutParams(layoutParams);
                    } else {
                        o.LJIJI("toastLayout");
                        throw null;
                    }
                } else {
                    o.LJIJI("toastLayout");
                    throw null;
                }
            }
            View view5 = this.LIZ;
            if (view5 != null) {
                TextView textView = (TextView) view5.findViewById(R.id.ghd);
                textView.setTextColor(color2);
                if (!TextUtils.isEmpty(toastBundle.LJLILLLLZI)) {
                    textView.setText(toastBundle.LJLILLLLZI);
                    return;
                }
                return;
            }
            o.LJIJI("root");
            throw null;
        }
        o.LJIJI("root");
        throw null;
    }
}
