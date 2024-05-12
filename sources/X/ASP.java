package X;

import Y.ARunnableS40S0100000_4;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import com.bytedance.tux.sheet.BaseSheet;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;
import o3.h0;

/* loaded from: classes5.dex */
public final class ASP extends OOS {
    public final int LJLJLLL;
    public AST LJLL;
    public AST LJLLI;
    public boolean LJLLILLLL;
    public boolean LJLLJ;
    public final GradientDrawable LJLLL;
    public ViewGroup LJLLLL;
    public final String LJLLLLLL;
    public final String LJLZ;
    public boolean LJZ;

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        this.LJZ = false;
        AKZ.LIZ();
        super.onDetachedFromWindow();
    }

    @Override // android.app.Dialog
    public final void show() {
        if (!new C03880Dg(2).LIZJ(300000, "com/google/android/material/bottomsheet/BottomSheetDialog", "show", this, new Object[0], "void", new C65300Pk0(false, "()V", "7027983506796429268")).LIZ) {
            super.show();
        }
        ViewGroup viewGroup = this.LJLLLL;
        if (viewGroup != null) {
            viewGroup.setImportantForAccessibility(2);
            viewGroup.postDelayed(new ARunnableS40S0100000_4(viewGroup, 13), 1000L);
        }
    }

    public final void LJJ() {
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.c8m);
        if (viewGroup != null) {
            viewGroup.setBackground(this.LJLLL);
            this.LJLLLL = viewGroup;
        }
        ViewGroup viewGroup2 = this.LJLLLL;
        if (viewGroup2 != null) {
            viewGroup2.setContentDescription(this.LJLZ);
            h0.LJIILLIIL(viewGroup2, C17720mm.LJI, this.LJLLLLLL, new ASS(this));
        }
        if (this.LJLLILLLL) {
            Context context = getContext();
            o.LJIIIIZZ(context, "context");
            ASR asr = new ASR(context, null, 6);
            asr.setFitsSystemWindows(true);
            asr.setRemoveTopInsets(true);
            LJJI(asr);
            return;
        }
        if (!this.LJLLJ || Build.VERSION.SDK_INT >= 30) {
            return;
        }
        Context context2 = getContext();
        o.LJIIIIZZ(context2, "context");
        ViewGroup c26254ASc = new C26254ASc(context2);
        c26254ASc.setFitsSystemWindows(true);
        LJJI(c26254ASc);
    }

    public final void LJJI(ViewGroup viewGroup) {
        ViewGroup viewGroup2 = (ViewGroup) findViewById(R.id.bs8);
        if (viewGroup2 == null) {
            return;
        }
        viewGroup.setId(viewGroup2.getId());
        viewGroup.setLayoutParams(viewGroup2.getLayoutParams());
        ViewParent parent = viewGroup2.getParent();
        if (parent instanceof ViewGroup) {
            int childCount = viewGroup2.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup2.getChildAt(i);
                C16880lQ.LJLLL(childAt, viewGroup2);
                viewGroup.addView(childAt);
            }
            ViewGroup viewGroup3 = (ViewGroup) parent;
            C16880lQ.LJLLL(viewGroup2, viewGroup3);
            viewGroup3.addView(viewGroup);
        }
    }

    public final void LJJIFFI(boolean z) {
        float f;
        if (z) {
            f = BaseSheet.LJLL;
        } else {
            f = 0.0f;
        }
        GradientDrawable gradientDrawable = this.LJLLL;
        if (gradientDrawable == null) {
            return;
        }
        gradientDrawable.setCornerRadii(new float[]{f, f, f, f, 0.0f, 0.0f, 0.0f, 0.0f});
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (this.LJZ != z) {
            if (z) {
                AKZ.LIZIZ(this);
            } else {
                AKZ.LIZ();
            }
            this.LJZ = z;
        }
    }

    @Override // X.OOS, X.C18Z, android.app.Dialog
    public final void setContentView(View view) {
        o.LJIIIZ(view, "view");
        super.setContentView(view);
        LJJ();
    }

    @Override // X.OOS, X.C18Z, android.app.Dialog
    public final void setContentView(int i) {
        super.setContentView(i);
        LJJ();
    }

    public ASP(Context context, Integer num) {
        super(context, R.style.py);
        int color;
        Window window;
        WindowManager.LayoutParams attributes;
        ASX asx = ASX.LIZ;
        this.LJLL = asx;
        this.LJLLI = asx;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, new int[]{R.attr.ql, R.attr.qm, R.attr.qn, R.attr.qo, R.attr.qp, R.attr.qq, R.attr.qr, R.attr.qs, R.attr.qt, R.attr.qu, R.attr.qv, R.attr.qw, R.attr.qx, R.attr.qy, R.attr.qz, R.attr.r0, R.attr.r1, R.attr.r2, R.attr.r3, R.attr.r4, R.attr.r5, R.attr.r6}, R.attr.kh, 0);
        o.LJIIIIZZ(obtainStyledAttributes, "context.obtainStyledAttr…eetStyle, 0\n            )");
        if (num != null) {
            color = num.intValue();
        } else {
            color = obtainStyledAttributes.getColor(3, 1);
        }
        this.LJLJLLL = color;
        String LLLZLZ = C16880lQ.LLLZLZ(obtainStyledAttributes, 5);
        this.LJLLLLLL = LLLZLZ == null ? "" : LLLZLZ;
        String LLLZLZ2 = C16880lQ.LLLZLZ(obtainStyledAttributes, 6);
        this.LJLZ = LLLZLZ2 != null ? LLLZLZ2 : "";
        obtainStyledAttributes.recycle();
        Window window2 = getWindow();
        if (window2 != null) {
            window2.addFlags(256);
        }
        if (Build.VERSION.SDK_INT >= 30 && (window = getWindow()) != null && (attributes = window.getAttributes()) != null) {
            attributes.setFitInsetsSides(0);
        }
        C110614Vt c110614Vt = new C110614Vt();
        c110614Vt.LIZ = Integer.valueOf(color);
        float f = BaseSheet.LJLL;
        c110614Vt.LJIIIIZZ = Float.valueOf(f);
        c110614Vt.LJIIIZ = Float.valueOf(f);
        this.LJLLL = (GradientDrawable) c110614Vt.LIZ(context);
    }

    @Override // X.OOS, X.C18Z, android.app.Dialog
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        o.LJIIIZ(view, "view");
        super.setContentView(view, layoutParams);
        LJJ();
    }
}
