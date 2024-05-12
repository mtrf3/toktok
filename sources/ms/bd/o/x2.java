package ms.bd.o;

import android.os.Build;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;

/* loaded from: classes17.dex */
public class x2 implements Window.Callback {
    public volatile Window.Callback LJLIL;
    public final String LJLILLLLZI;

    public x2(Window.Callback callback, String str) {
        this.LJLILLLLZI = str;
        this.LJLIL = callback;
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.LJLIL.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.LJLIL.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        return this.LJLIL.dispatchKeyShortcutEvent(keyEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.LJLIL.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.LJLIL.dispatchTrackballEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeFinished(ActionMode actionMode) {
        this.LJLIL.onActionModeFinished(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeStarted(ActionMode actionMode) {
        this.LJLIL.onActionModeStarted(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onAttachedToWindow() {
        this.LJLIL.onAttachedToWindow();
    }

    @Override // android.view.Window.Callback
    public final void onContentChanged() {
        this.LJLIL.onContentChanged();
    }

    @Override // android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i, Menu menu) {
        return this.LJLIL.onCreatePanelMenu(i, menu);
    }

    @Override // android.view.Window.Callback
    public final View onCreatePanelView(int i) {
        return this.LJLIL.onCreatePanelView(i);
    }

    @Override // android.view.Window.Callback
    public final void onDetachedFromWindow() {
        this.LJLIL.onDetachedFromWindow();
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        return this.LJLIL.onMenuItemSelected(i, menuItem);
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuOpened(int i, Menu menu) {
        return this.LJLIL.onMenuOpened(i, menu);
    }

    @Override // android.view.Window.Callback
    public final void onPanelClosed(int i, Menu menu) {
        this.LJLIL.onPanelClosed(i, menu);
    }

    @Override // android.view.Window.Callback
    public final void onPointerCaptureChanged(boolean z) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.LJLIL.onPointerCaptureChanged(z);
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onPreparePanel(int i, View view, Menu menu) {
        return this.LJLIL.onPreparePanel(i, view, menu);
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested() {
        return this.LJLIL.onSearchRequested();
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested(SearchEvent searchEvent) {
        if (Build.VERSION.SDK_INT >= 23) {
            return this.LJLIL.onSearchRequested(searchEvent);
        }
        return false;
    }

    @Override // android.view.Window.Callback
    public final void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.LJLIL.onWindowAttributesChanged(layoutParams);
    }

    @Override // android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        this.LJLIL.onWindowFocusChanged(z);
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return this.LJLIL.onWindowStartingActionMode(callback);
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            return this.LJLIL.onWindowStartingActionMode(callback, i);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0065 A[Catch: all -> 0x0079, TRY_LEAVE, TryCatch #0 {all -> 0x0079, blocks: (B:3:0x0009, B:5:0x000d, B:8:0x0012, B:12:0x001e, B:14:0x0028, B:16:0x0032, B:21:0x005f, B:23:0x0065, B:25:0x0047, B:27:0x0051, B:28:0x005b, B:29:0x0059, B:30:0x0056), top: B:2:0x0009 }] */
    @Override // android.view.Window.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean dispatchTouchEvent(android.view.MotionEvent r14) {
        /*
            r13 = this;
            ms.bd.o.a3 r2 = ms.bd.o.a3.LIZ()
            java.lang.String r12 = r13.LJLILLLLZI
            r2.getClass()
            boolean r0 = r2.LJLIL     // Catch: java.lang.Throwable -> L79
            if (r0 == 0) goto L79
            boolean r0 = r2.LJLJJI     // Catch: java.lang.Throwable -> L79
            if (r0 == 0) goto L12
            goto L79
        L12:
            int r0 = r14.getAction()     // Catch: java.lang.Throwable -> L79
            r4 = 2
            r3 = 1
            if (r0 == 0) goto L1e
            if (r0 == r3) goto L1e
            if (r0 != r4) goto L79
        L1e:
            java.util.concurrent.locks.Lock r0 = r2.LJLJJLL     // Catch: java.lang.Throwable -> L79
            java.util.concurrent.locks.ReentrantLock r0 = (java.util.concurrent.locks.ReentrantLock) r0     // Catch: java.lang.Throwable -> L79
            boolean r0 = r0.tryLock()     // Catch: java.lang.Throwable -> L79
            if (r0 == 0) goto L79
            java.util.LinkedList<ms.bd.o.y2> r0 = r2.LJLJJL     // Catch: java.lang.Throwable -> L79
            int r1 = r0.size()     // Catch: java.lang.Throwable -> L79
            int r0 = ms.bd.o.a3.LJLLI     // Catch: java.lang.Throwable -> L79
            if (r1 >= r0) goto L79
            ms.bd.o.z2 r7 = ms.bd.o.z2.b     // Catch: java.lang.Throwable -> L79
            int r5 = r7.a()     // Catch: java.lang.Throwable -> L79
            long r10 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L79
            int r0 = r14.getAction()     // Catch: java.lang.Throwable -> L79
            if (r0 == 0) goto L56
            if (r0 == r3) goto L59
            if (r0 == r4) goto L47
            goto L5f
        L47:
            long r0 = r2.LJLJLLL     // Catch: java.lang.Throwable -> L79
            long r5 = r10 - r0
            r3 = 100
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 < 0) goto L79
            r2.LJLJLLL = r10     // Catch: java.lang.Throwable -> L79
            ms.bd.o.z2 r0 = ms.bd.o.z2.d     // Catch: java.lang.Throwable -> L79
            goto L5b
        L56:
            ms.bd.o.z2 r0 = ms.bd.o.z2.c     // Catch: java.lang.Throwable -> L79
            goto L5b
        L59:
            ms.bd.o.z2 r0 = ms.bd.o.z2.e     // Catch: java.lang.Throwable -> L79
        L5b:
            int r5 = r0.a()     // Catch: java.lang.Throwable -> L79
        L5f:
            int r0 = r7.a()     // Catch: java.lang.Throwable -> L79
            if (r5 == r0) goto L79
            java.util.LinkedList<ms.bd.o.y2> r1 = r2.LJLJJL     // Catch: java.lang.Throwable -> L79
            ms.bd.o.y2 r4 = new ms.bd.o.y2     // Catch: java.lang.Throwable -> L79
            float r0 = r14.getX()     // Catch: java.lang.Throwable -> L79
            double r6 = (double) r0     // Catch: java.lang.Throwable -> L79
            float r0 = r14.getY()     // Catch: java.lang.Throwable -> L79
            double r8 = (double) r0     // Catch: java.lang.Throwable -> L79
            r4.<init>(r5, r6, r8, r10, r12)     // Catch: java.lang.Throwable -> L79
            r1.add(r4)     // Catch: java.lang.Throwable -> L79
        L79:
            r2.LJFF()
            android.view.Window$Callback r0 = r13.LJLIL
            boolean r0 = r0.dispatchTouchEvent(r14)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ms.bd.o.x2.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }
}
