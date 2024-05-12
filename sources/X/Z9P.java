package X;

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
import kotlin.jvm.internal.o;

/* loaded from: classes17.dex */
public final class Z9P implements Window.Callback {
    public final Window.Callback LJLIL;

    @Override // android.view.Window.Callback
    public final void onAttachedToWindow() {
        this.LJLIL.onAttachedToWindow();
    }

    @Override // android.view.Window.Callback
    public final void onContentChanged() {
        this.LJLIL.onContentChanged();
    }

    @Override // android.view.Window.Callback
    public final void onDetachedFromWindow() {
        this.LJLIL.onDetachedFromWindow();
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested() {
        return this.LJLIL.onSearchRequested();
    }

    public Z9P(Window.Callback callback) {
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
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent != null && motionEvent.getAction() == 0) {
            C98673u3.LIZ = System.currentTimeMillis();
        }
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
    public final View onCreatePanelView(int i) {
        return this.LJLIL.onCreatePanelView(i);
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
    public final boolean onCreatePanelMenu(int i, Menu menu) {
        o.LJIIIZ(menu, "menu");
        return this.LJLIL.onCreatePanelMenu(i, menu);
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem item) {
        o.LJIIIZ(item, "item");
        return this.LJLIL.onMenuItemSelected(i, item);
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuOpened(int i, Menu menu) {
        o.LJIIIZ(menu, "menu");
        return this.LJLIL.onMenuOpened(i, menu);
    }

    @Override // android.view.Window.Callback
    public final void onPanelClosed(int i, Menu menu) {
        o.LJIIIZ(menu, "menu");
        this.LJLIL.onPanelClosed(i, menu);
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            return this.LJLIL.onWindowStartingActionMode(callback, i);
        }
        return null;
    }

    @Override // android.view.Window.Callback
    public final boolean onPreparePanel(int i, View view, Menu menu) {
        o.LJIIIZ(menu, "menu");
        return this.LJLIL.onPreparePanel(i, view, menu);
    }
}