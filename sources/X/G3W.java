package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;

/* loaded from: classes7.dex */
public final class G3W implements ViewTreeObserver.OnGlobalLayoutListener {
    public final WeakReference<View> LJLIL;
    public final ViewTreeObserver LJLILLLLZI;
    public int LJLJI;
    public final ViewGroup.LayoutParams LJLJJI;

    /* JADX WARN: Removed duplicated region for block: B:16:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onGlobalLayout() {
        /*
            r6 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r6.LJLIL
            java.lang.Object r4 = r0.get()
            android.view.View r4 = (android.view.View) r4
            if (r4 != 0) goto L18
            android.view.ViewTreeObserver r0 = r6.LJLILLLLZI
            boolean r0 = r0.isAlive()
            if (r0 == 0) goto L17
            android.view.ViewTreeObserver r0 = r6.LJLILLLLZI
            r0.removeGlobalOnLayoutListener(r6)
        L17:
            return
        L18:
            android.graphics.Rect r5 = new android.graphics.Rect
            r5.<init>()
            r4.getWindowVisibleDisplayFrame(r5)
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 23
            if (r1 < r0) goto L63
            android.view.WindowInsets r3 = r4.getRootWindowInsets()
            if (r3 != 0) goto L47
            int r1 = r5.bottom
        L2e:
            int r0 = r6.LJLJI
            if (r1 == r0) goto L46
            android.view.ViewGroup$LayoutParams r0 = r6.LJLJJI
            r0.height = r1
            r4.setLayoutParams(r0)
            Y.ARunnableS12S0101000_8 r3 = new Y.ARunnableS12S0101000_8
            r2 = 0
            r0 = 31
            r3.<init>(r2, r4, r0)
            r4.post(r3)
            r6.LJLJI = r1
        L46:
            return
        L47:
            int r1 = r3.getStableInsetTop()
            int r0 = r5.top
            if (r1 != r0) goto L52
            int r1 = r5.bottom
            goto L2e
        L52:
            int r0 = r3.getStableInsetTop()
            int r2 = r5.top
            if (r0 >= r2) goto L63
            int r1 = r5.bottom
            int r0 = r3.getStableInsetTop()
            int r2 = r2 - r0
            int r1 = r1 - r2
            goto L2e
        L63:
            int r1 = r5.bottom
            goto L2e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.G3W.onGlobalLayout():void");
    }

    public G3W(View view) {
        if (view != null) {
            this.LJLIL = new WeakReference<>(view);
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.LJLILLLLZI = viewTreeObserver;
            viewTreeObserver.addOnGlobalLayoutListener(this);
            this.LJLJJI = view.getLayoutParams();
        }
    }
}
