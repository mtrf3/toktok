package X;

import Y.IDRunnableS85S0100000;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;

/* renamed from: X.03H, reason: invalid class name */
/* loaded from: classes.dex */
public final class C03H implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {
    public static C03H LJLL;
    public static C03H LJLLI;
    public final View LJLIL;
    public final CharSequence LJLILLLLZI;
    public final int LJLJI;
    public final IDRunnableS85S0100000 LJLJJI = new IDRunnableS85S0100000(this, 11);
    public final IDRunnableS85S0100000 LJLJJL = new IDRunnableS85S0100000(this, 12);
    public int LJLJJLL;
    public int LJLJL;
    public C03K LJLJLJ;
    public boolean LJLJLLL;

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    public final void LIZ() {
        if (LJLLI == this) {
            LJLLI = null;
            C03K c03k = this.LJLJLJ;
            if (c03k != null) {
                if (c03k.LIZIZ.getParent() != null) {
                    ((WindowManager) C16880lQ.LLILL(c03k.LIZ, "window")).removeView(c03k.LIZIZ);
                }
                this.LJLJLJ = null;
                this.LJLJJLL = Integer.MAX_VALUE;
                this.LJLJL = Integer.MAX_VALUE;
                this.LJLIL.removeOnAttachStateChangeListener(this);
            }
        }
        if (LJLL == this) {
            LIZIZ(null);
        }
        this.LJLIL.removeCallbacks(this.LJLJJL);
    }

    public static void LIZIZ(C03H c03h) {
        C03H c03h2 = LJLL;
        if (c03h2 != null) {
            c03h2.LJLIL.removeCallbacks(c03h2.LJLJJI);
        }
        LJLL = c03h;
        if (c03h != null) {
            c03h.LJLIL.postDelayed(c03h.LJLJJI, ViewConfiguration.getLongPressTimeout());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x019a, code lost:
    
        if (r11 == null) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0153  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ(boolean r18) {
        /*
            Method dump skipped, instructions count: 442
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C03H.LIZJ(boolean):void");
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        this.LJLJJLL = view.getWidth() / 2;
        this.LJLJL = view.getHeight() / 2;
        LIZJ(true);
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        LIZ();
    }

    public C03H(View view, CharSequence charSequence) {
        int scaledTouchSlop;
        this.LJLIL = view;
        this.LJLILLLLZI = charSequence;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(view.getContext());
        if (Build.VERSION.SDK_INT >= 28) {
            scaledTouchSlop = C16510kp.LIZ(viewConfiguration);
        } else {
            scaledTouchSlop = viewConfiguration.getScaledTouchSlop() / 2;
        }
        this.LJLJI = scaledTouchSlop;
        this.LJLJJLL = Integer.MAX_VALUE;
        this.LJLJL = Integer.MAX_VALUE;
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    @Override // android.view.View.OnHoverListener
    public final boolean onHover(View view, MotionEvent motionEvent) {
        if (this.LJLJLJ != null && this.LJLJLLL) {
            return false;
        }
        AccessibilityManager accessibilityManager = (AccessibilityManager) C16880lQ.LLILL(this.LJLIL.getContext(), "accessibility");
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 7) {
            if (action == 10) {
                this.LJLJJLL = Integer.MAX_VALUE;
                this.LJLJL = Integer.MAX_VALUE;
                LIZ();
            }
        } else if (this.LJLIL.isEnabled() && this.LJLJLJ == null) {
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (Math.abs(x - this.LJLJJLL) > this.LJLJI || Math.abs(y - this.LJLJL) > this.LJLJI) {
                this.LJLJJLL = x;
                this.LJLJL = y;
                LIZIZ(this);
            }
        }
        return false;
    }
}
