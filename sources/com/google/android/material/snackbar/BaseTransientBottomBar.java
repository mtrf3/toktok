package com.google.android.material.snackbar;

import X.C06F;
import X.C07820Sk;
import X.C07840Sm;
import X.C111644Zs;
import X.C111664Zu;
import X.C16300kU;
import X.C16330kX;
import X.C16340kY;
import X.C16360ka;
import X.C16880lQ;
import X.C45621qg;
import X.C78865UxJ;
import X.C78966Uyw;
import X.C80003VaZ;
import X.C80194Vde;
import X.C80195Vdf;
import X.C80196Vdg;
import X.C80200Vdk;
import X.C80204Vdo;
import X.C80205Vdp;
import X.C80244VeS;
import X.C80250VeY;
import X.C80285Vf7;
import X.InterfaceC111654Zt;
import X.InterfaceC80004Vaa;
import X.InterfaceC80197Vdh;
import X.InterfaceC80198Vdi;
import X.RunnableC80007Vad;
import X.RunnableC80193Vdd;
import X.ViewOnTouchListenerC80206Vdq;
import Y.ARunnableS50S0100000_14;
import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityManager;
import android.widget.FrameLayout;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.zhiliaoapp.musically.R;
import java.util.List;
import o3.IDaS471S0100000_14;
import o3.h0;

/* loaded from: classes15.dex */
public abstract class BaseTransientBottomBar<B extends BaseTransientBottomBar<B>> {
    public static final Handler LJIILIIL;
    public static final int[] LJIILJJIL = {R.attr.bbu};
    public final ViewGroup LIZ;
    public final Context LIZIZ;
    public final h LIZJ;
    public final InterfaceC80004Vaa LIZLLL;
    public int LJ;
    public final Rect LJI;
    public int LJII;
    public int LJIIIIZZ;
    public int LJIIIZ;
    public int LJIIJ;
    public final AccessibilityManager LJIIJJI;
    public final RunnableC80007Vad LJFF = new RunnableC80007Vad(this);
    public final C80204Vdo LJIIL = new C80204Vdo(this);

    static {
        C16880lQ.LJLLJ(BaseTransientBottomBar.class);
        LJIILIIL = new Handler(C16880lQ.LLJJJJ(), new C80194Vde());
    }

    public void LIZ() {
        LIZIZ(3);
    }

    /* loaded from: classes15.dex */
    public static class h extends FrameLayout {
        public static final ViewOnTouchListenerC80206Vdq LJLJLJ = new ViewOnTouchListenerC80206Vdq();
        public InterfaceC80198Vdi LJLIL;
        public InterfaceC80197Vdh LJLILLLLZI;
        public int LJLJI;
        public final float LJLJJI;
        public final float LJLJJL;
        public ColorStateList LJLJJLL;
        public PorterDuff.Mode LJLJL;

        @Override // android.view.ViewGroup, android.view.View
        public final void onAttachedToWindow() {
            super.onAttachedToWindow();
            InterfaceC80197Vdh interfaceC80197Vdh = this.LJLILLLLZI;
            if (interfaceC80197Vdh != null) {
                C80195Vdf c80195Vdf = (C80195Vdf) interfaceC80197Vdh;
                if (Build.VERSION.SDK_INT >= 29) {
                    WindowInsets rootWindowInsets = c80195Vdf.LIZ.LIZJ.getRootWindowInsets();
                    if (rootWindowInsets != null) {
                        c80195Vdf.LIZ.LJIIJ = rootWindowInsets.getMandatorySystemGestureInsets().bottom;
                        c80195Vdf.LIZ.LJFF();
                    }
                } else {
                    c80195Vdf.getClass();
                }
            }
            C16340kY.LIZJ(this);
        }

        @Override // android.view.ViewGroup, android.view.View
        public final void onDetachedFromWindow() {
            boolean z;
            C111644Zs c111644Zs;
            super.onDetachedFromWindow();
            InterfaceC80197Vdh interfaceC80197Vdh = this.LJLILLLLZI;
            if (interfaceC80197Vdh != null) {
                C80195Vdf c80195Vdf = (C80195Vdf) interfaceC80197Vdh;
                BaseTransientBottomBar baseTransientBottomBar = c80195Vdf.LIZ;
                baseTransientBottomBar.getClass();
                C111664Zu LIZIZ = C111664Zu.LIZIZ();
                C80204Vdo c80204Vdo = baseTransientBottomBar.LJIIL;
                synchronized (LIZIZ.LIZ) {
                    z = true;
                    if (!LIZIZ.LIZJ(c80204Vdo) && ((c111644Zs = LIZIZ.LIZLLL) == null || c80204Vdo == null || c111644Zs.LIZ.get() != c80204Vdo)) {
                        z = false;
                    }
                }
                if (z) {
                    BaseTransientBottomBar.LJIILIIL.post(new ARunnableS50S0100000_14(c80195Vdf, 5));
                }
            }
        }

        public float getActionTextColorAlpha() {
            return this.LJLJJL;
        }

        public int getAnimationMode() {
            return this.LJLJI;
        }

        public float getBackgroundOverlayColorAlpha() {
            return this.LJLJJI;
        }

        public void setAnimationMode(int i) {
            this.LJLJI = i;
        }

        @Override // android.view.View
        public void setBackground(Drawable drawable) {
            setBackgroundDrawable(drawable);
        }

        @Override // android.view.View
        public void setBackgroundDrawable(Drawable drawable) {
            if (drawable != null && this.LJLJJLL != null) {
                drawable = C07840Sm.LJFF(drawable.mutate());
                C07820Sk.LJII(drawable, this.LJLJJLL);
                C07820Sk.LJIIIIZZ(drawable, this.LJLJL);
            }
            super.setBackgroundDrawable(drawable);
        }

        @Override // android.view.View
        public void setBackgroundTintList(ColorStateList colorStateList) {
            this.LJLJJLL = colorStateList;
            if (getBackground() != null) {
                Drawable LJFF = C07840Sm.LJFF(getBackground().mutate());
                C07820Sk.LJII(LJFF, colorStateList);
                C07820Sk.LJIIIIZZ(LJFF, this.LJLJL);
                if (LJFF != getBackground()) {
                    super.setBackgroundDrawable(LJFF);
                }
            }
        }

        @Override // android.view.View
        public void setBackgroundTintMode(PorterDuff.Mode mode) {
            this.LJLJL = mode;
            if (getBackground() != null) {
                Drawable LJFF = C07840Sm.LJFF(getBackground().mutate());
                C07820Sk.LJIIIIZZ(LJFF, mode);
                if (LJFF != getBackground()) {
                    super.setBackgroundDrawable(LJFF);
                }
            }
        }

        public void setOnAttachStateChangeListener(InterfaceC80197Vdh interfaceC80197Vdh) {
            this.LJLILLLLZI = interfaceC80197Vdh;
        }

        @Override // android.view.View
        public void setOnClickListener(View.OnClickListener onClickListener) {
            ViewOnTouchListenerC80206Vdq viewOnTouchListenerC80206Vdq;
            if (onClickListener != null) {
                viewOnTouchListenerC80206Vdq = null;
            } else {
                viewOnTouchListenerC80206Vdq = LJLJLJ;
            }
            setOnTouchListener(viewOnTouchListenerC80206Vdq);
            super.setOnClickListener(onClickListener);
        }

        public void setOnLayoutChangeListener(InterfaceC80198Vdi interfaceC80198Vdi) {
            this.LJLIL = interfaceC80198Vdi;
        }

        public h(Context context, AttributeSet attributeSet) {
            super(C78865UxJ.LIZ(context, attributeSet, 0, 0), attributeSet);
            Drawable LJFF;
            Context context2 = getContext();
            TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, new int[]{android.R.attr.maxWidth, R.attr.uw, R.attr.w2, R.attr.xh, R.attr.xk, R.attr.xl, R.attr.ab6, R.attr.b09});
            if (obtainStyledAttributes.hasValue(6)) {
                C16360ka.LJIJ(this, obtainStyledAttributes.getDimensionPixelSize(6, 0));
            }
            this.LJLJI = obtainStyledAttributes.getInt(2, 0);
            this.LJLJJI = obtainStyledAttributes.getFloat(3, 1.0f);
            setBackgroundTintList(C80285Vf7.LIZ(context2, obtainStyledAttributes, 4));
            setBackgroundTintMode(C80250VeY.LIZLLL(obtainStyledAttributes.getInt(5, -1), PorterDuff.Mode.SRC_IN));
            this.LJLJJL = obtainStyledAttributes.getFloat(1, 1.0f);
            obtainStyledAttributes.recycle();
            setOnTouchListener(LJLJLJ);
            setFocusable(true);
            if (getBackground() == null) {
                float dimension = getResources().getDimension(R.dimen.a3r);
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setShape(0);
                gradientDrawable.setCornerRadius(dimension);
                gradientDrawable.setColor(C78966Uyw.LJJIL(getBackgroundOverlayColorAlpha(), C78966Uyw.LJJIII(R.attr.a4y, this), C78966Uyw.LJJIII(R.attr.a4q, this)));
                if (this.LJLJJLL != null) {
                    LJFF = C07840Sm.LJFF(gradientDrawable);
                    C07820Sk.LJII(LJFF, this.LJLJJLL);
                } else {
                    LJFF = C07840Sm.LJFF(gradientDrawable);
                }
                C16300kU.LJIILLIIL(this, LJFF);
            }
        }

        @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
        public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            InterfaceC80198Vdi interfaceC80198Vdi = this.LJLIL;
            if (interfaceC80198Vdi != null) {
                C80196Vdg c80196Vdg = (C80196Vdg) interfaceC80198Vdi;
                c80196Vdg.LIZ.LIZJ.setOnLayoutChangeListener(null);
                c80196Vdg.LIZ.LJ();
            }
        }
    }

    public final void LJ() {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList;
        AccessibilityManager accessibilityManager = this.LJIIJJI;
        if (accessibilityManager == null || ((enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(1)) != null && enabledAccessibilityServiceList.isEmpty())) {
            this.LIZJ.post(new RunnableC80193Vdd(this));
            return;
        }
        if (this.LIZJ.getParent() != null) {
            this.LIZJ.setVisibility(0);
        }
        LIZLLL();
    }

    public final void LJFF() {
        Rect rect;
        ViewGroup.LayoutParams layoutParams = this.LIZJ.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams) || (rect = this.LJI) == null) {
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.bottomMargin = rect.bottom + this.LJII;
        marginLayoutParams.leftMargin = rect.left + this.LJIIIIZZ;
        marginLayoutParams.rightMargin = rect.right + this.LJIIIZ;
        this.LIZJ.requestLayout();
        if (Build.VERSION.SDK_INT < 29 || this.LJIIJ <= 0) {
            return;
        }
        ViewGroup.LayoutParams layoutParams2 = this.LIZJ.getLayoutParams();
        if (!(layoutParams2 instanceof C06F) || !(((C06F) layoutParams2).LIZ instanceof SwipeDismissBehavior)) {
            return;
        }
        this.LIZJ.removeCallbacks(this.LJFF);
        this.LIZJ.post(this.LJFF);
    }

    public final void LIZJ() {
        C111664Zu LIZIZ = C111664Zu.LIZIZ();
        C80204Vdo c80204Vdo = this.LJIIL;
        synchronized (LIZIZ.LIZ) {
            if (LIZIZ.LIZJ(c80204Vdo)) {
                LIZIZ.LIZJ = null;
                C111644Zs c111644Zs = LIZIZ.LIZLLL;
                if (c111644Zs != null) {
                    LIZIZ.LIZJ = c111644Zs;
                    LIZIZ.LIZLLL = null;
                    InterfaceC111654Zt interfaceC111654Zt = c111644Zs.LIZ.get();
                    if (interfaceC111654Zt != null) {
                        interfaceC111654Zt.show();
                    } else {
                        LIZIZ.LIZJ = null;
                    }
                }
            }
        }
        ViewParent parent = this.LIZJ.getParent();
        if (parent instanceof ViewGroup) {
            C16880lQ.LJLLL(this.LIZJ, (ViewGroup) parent);
        }
    }

    public final void LIZLLL() {
        C111664Zu LIZIZ = C111664Zu.LIZIZ();
        C80204Vdo c80204Vdo = this.LJIIL;
        synchronized (LIZIZ.LIZ) {
            if (LIZIZ.LIZJ(c80204Vdo)) {
                LIZIZ.LJFF(LIZIZ.LIZJ);
            }
        }
    }

    /* loaded from: classes15.dex */
    public static class Behavior extends SwipeDismissBehavior<View> {
        public final C80200Vdk LJIIIIZZ = new C80200Vdk(this);

        @Override // com.google.android.material.behavior.SwipeDismissBehavior
        public final boolean LIZ(View view) {
            this.LJIIIIZZ.getClass();
            return view instanceof h;
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior, X.C06C
        public final boolean onInterceptTouchEvent(C45621qg c45621qg, View view, MotionEvent motionEvent) {
            C80200Vdk c80200Vdk = this.LJIIIIZZ;
            c80200Vdk.getClass();
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked == 1 || actionMasked == 3) {
                    C111664Zu.LIZIZ().LJ(c80200Vdk.LIZ);
                }
            } else if (c45621qg.LJII((int) motionEvent.getX(), (int) motionEvent.getY(), view)) {
                C111664Zu LIZIZ = C111664Zu.LIZIZ();
                InterfaceC111654Zt interfaceC111654Zt = c80200Vdk.LIZ;
                synchronized (LIZIZ.LIZ) {
                    if (LIZIZ.LIZJ(interfaceC111654Zt)) {
                        C111644Zs c111644Zs = LIZIZ.LIZJ;
                        if (!c111644Zs.LIZJ) {
                            c111644Zs.LIZJ = true;
                            LIZIZ.LIZIZ.removeCallbacksAndMessages(c111644Zs);
                        }
                    }
                }
            }
            return super.onInterceptTouchEvent(c45621qg, view, motionEvent);
        }
    }

    public final void LIZIZ(int i) {
        C111664Zu LIZIZ = C111664Zu.LIZIZ();
        C80204Vdo c80204Vdo = this.LJIIL;
        synchronized (LIZIZ.LIZ) {
            if (LIZIZ.LIZJ(c80204Vdo)) {
                LIZIZ.LIZ(LIZIZ.LIZJ, i);
            } else {
                C111644Zs c111644Zs = LIZIZ.LIZLLL;
                if (c111644Zs != null && c80204Vdo != null && c111644Zs.LIZ.get() == c80204Vdo) {
                    LIZIZ.LIZ(LIZIZ.LIZLLL, i);
                }
            }
        }
    }

    public BaseTransientBottomBar(Context context, ViewGroup viewGroup, C80003VaZ c80003VaZ, C80003VaZ c80003VaZ2) {
        int i;
        if (c80003VaZ != null) {
            if (c80003VaZ2 != null) {
                this.LIZ = viewGroup;
                this.LIZLLL = c80003VaZ2;
                this.LIZIZ = context;
                C80244VeS.LIZJ(context, C80244VeS.LIZ, "Theme.AppCompat");
                LayoutInflater LLZIL = C16880lQ.LLZIL(context);
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes(LJIILJJIL);
                int resourceId = obtainStyledAttributes.getResourceId(0, -1);
                obtainStyledAttributes.recycle();
                if (resourceId != -1) {
                    i = R.layout.bu2;
                } else {
                    i = R.layout.ak5;
                }
                h hVar = (h) C16880lQ.LLLLIILL(LLZIL, i, viewGroup, false);
                this.LIZJ = hVar;
                float actionTextColorAlpha = hVar.getActionTextColorAlpha();
                if (actionTextColorAlpha != 1.0f) {
                    c80003VaZ.LJLILLLLZI.setTextColor(C78966Uyw.LJJIL(actionTextColorAlpha, C78966Uyw.LJJIII(R.attr.a4y, c80003VaZ), c80003VaZ.LJLILLLLZI.getCurrentTextColor()));
                }
                hVar.addView(c80003VaZ);
                ViewGroup.LayoutParams layoutParams = hVar.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    this.LJI = new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
                }
                C16330kX.LJFF(hVar, 1);
                C16300kU.LJIJ(hVar, 1);
                hVar.setFitsSystemWindows(true);
                C16360ka.LJIJJ(hVar, new C80205Vdp(this));
                h0.LJIJI(hVar, new IDaS471S0100000_14(this, 0));
                this.LJIIJJI = (AccessibilityManager) C16880lQ.LLILL(context, "accessibility");
                return;
            }
            throw new IllegalArgumentException("Transient bottom bar must have non-null callback");
        }
        throw new IllegalArgumentException("Transient bottom bar must have non-null content");
    }
}
