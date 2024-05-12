package X;

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
import kotlin.jvm.internal.o;

/* loaded from: classes17.dex */
public final class Z9S implements Window.Callback {
    public final Window.Callback LJLIL;
    public InterfaceC26237ARl LJLILLLLZI;

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
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.LJLIL.dispatchTouchEvent(motionEvent);
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
    public final boolean onCreatePanelMenu(int i, Menu p1) {
        o.LJIIIZ(p1, "p1");
        return this.LJLIL.onCreatePanelMenu(i, p1);
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
    public final boolean onMenuItemSelected(int i, MenuItem p1) {
        o.LJIIIZ(p1, "p1");
        return this.LJLIL.onMenuItemSelected(i, p1);
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuOpened(int i, Menu p1) {
        o.LJIIIZ(p1, "p1");
        return this.LJLIL.onMenuOpened(i, p1);
    }

    @Override // android.view.Window.Callback
    public final void onPanelClosed(int i, Menu p1) {
        o.LJIIIZ(p1, "p1");
        this.LJLIL.onPanelClosed(i, p1);
    }

    @Override // android.view.Window.Callback
    public final boolean onPreparePanel(int i, View view, Menu p2) {
        o.LJIIIZ(p2, "p2");
        return this.LJLIL.onPreparePanel(i, view, p2);
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested() {
        return this.LJLIL.onSearchRequested();
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested(SearchEvent searchEvent) {
        return this.LJLIL.onSearchRequested(searchEvent);
    }

    @Override // android.view.Window.Callback
    public final void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.LJLIL.onWindowAttributesChanged(layoutParams);
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return this.LJLIL.onWindowStartingActionMode(callback);
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
        return this.LJLIL.onWindowStartingActionMode(callback, i);
    }

    public Z9S(Window.Callback callback) {
        this.LJLIL = callback;
    }

    @Override // android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        this.LJLIL.onWindowFocusChanged(z);
        InterfaceC26237ARl interfaceC26237ARl = this.LJLILLLLZI;
        if (interfaceC26237ARl != null) {
            interfaceC26237ARl.onWindowFocusChanged(z);
        }
    }
}
