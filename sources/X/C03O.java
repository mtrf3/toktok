package X;

import android.view.View;
import android.view.ViewConfiguration;

/* renamed from: X.03O, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C03O implements View.OnTouchListener, View.OnAttachStateChangeListener {
    public final float LJLIL;
    public final int LJLILLLLZI;
    public final int LJLJI;
    public final View LJLJJI;
    public C03M LJLJJL;
    public C03N LJLJJLL;
    public boolean LJLJL;
    public int LJLJLJ;
    public final int[] LJLJLLL = new int[2];

    public abstract AnonymousClass112 LIZIZ();

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    public final void LIZ() {
        C03N c03n = this.LJLJJLL;
        if (c03n != null) {
            this.LJLJJI.removeCallbacks(c03n);
        }
        C03M c03m = this.LJLJJL;
        if (c03m != null) {
            this.LJLJJI.removeCallbacks(c03m);
        }
    }

    public boolean LIZJ() {
        AnonymousClass112 LIZIZ = LIZIZ();
        if (LIZIZ != null && !LIZIZ.isShowing()) {
            LIZIZ.show();
            return true;
        }
        return true;
    }

    public boolean LIZLLL() {
        AnonymousClass112 LIZIZ = LIZIZ();
        if (LIZIZ != null && LIZIZ.isShowing()) {
            LIZIZ.dismiss();
            return true;
        }
        return true;
    }

    public C03O(View view) {
        this.LJLJJI = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.LJLIL = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.LJLILLLLZI = tapTimeout;
        this.LJLJI = (ViewConfiguration.getLongPressTimeout() + tapTimeout) / 2;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.LJLJL = false;
        this.LJLJLJ = -1;
        C03M c03m = this.LJLJJL;
        if (c03m != null) {
            this.LJLJJI.removeCallbacks(c03m);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0069, code lost:
    
        if (r0 != false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0083, code lost:
    
        if (r1 != 3) goto L32;
     */
    /* JADX WARN: Type inference failed for: r0v8, types: [X.03N] */
    /* JADX WARN: Type inference failed for: r0v9, types: [X.03M] */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouch(android.view.View r13, android.view.MotionEvent r14) {
        /*
            Method dump skipped, instructions count: 281
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C03O.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
