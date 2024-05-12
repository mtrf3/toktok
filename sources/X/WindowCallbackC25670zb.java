package X;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import java.io.PrintStream;
import java.util.List;

/* renamed from: X.0zb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class WindowCallbackC25670zb implements Window.Callback {
    public final Window.Callback LJLIL;

    @Override // android.view.Window.Callback
    public final void onAttachedToWindow() {
        this.LJLIL.onAttachedToWindow();
    }

    @Override // android.view.Window.Callback
    public void onContentChanged() {
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

    public WindowCallbackC25670zb(Window.Callback callback) {
        if (callback != null) {
            this.LJLIL = callback;
            return;
        }
        throw new IllegalArgumentException("Window callback may not be null");
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.LJLIL.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.LJLIL.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.Window.Callback
    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        return this.LJLIL.dispatchKeyShortcutEvent(keyEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.LJLIL.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Override // android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Window window;
        try {
            return this.LJLIL.dispatchTouchEvent(motionEvent);
        } catch (IllegalStateException e) {
            Window.Callback callback = this.LJLIL;
            StringBuilder sb = new StringBuilder();
            if (callback instanceof Dialog) {
                sb.append("callback is dialog, dialog info:");
                sb.append(callback);
                Dialog dialog = (Dialog) callback;
                window = dialog.getWindow();
                Activity ownerActivity = dialog.getOwnerActivity();
                if (ownerActivity != null) {
                    sb.append(" dialog's activity info:");
                    sb.append(ownerActivity);
                } else {
                    Context context = dialog.getContext();
                    if (context instanceof Activity) {
                        sb.append(" dialog's activity info:");
                        sb.append(context);
                    }
                }
            } else {
                window = null;
            }
            if (callback instanceof Activity) {
                sb.append("callback is activity, activity info:");
                sb.append(callback);
                window = ((Activity) callback).getWindow();
            }
            PrintStream printStream = System.err;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("WindowCallbackWrapperLancet:");
            LIZ.append(sb.toString());
            printStream.println(X1D.LIZIZ(LIZ));
            if (window != null) {
                PrintStream printStream2 = System.err;
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("ViewTree info:");
                StringBuilder sb2 = new StringBuilder();
                C4H1.LIZ((ViewGroup) window.getDecorView(), sb2);
                LIZ2.append(sb2.toString());
                printStream2.println(X1D.LIZIZ(LIZ2));
            }
            throw e;
        }
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
    public View onCreatePanelView(int i) {
        return this.LJLIL.onCreatePanelView(i);
    }

    @Override // android.view.Window.Callback
    public final void onPointerCaptureChanged(boolean z) {
        this.LJLIL.onPointerCaptureChanged(z);
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
    public void onWindowFocusChanged(boolean z) {
        this.LJLIL.onWindowFocusChanged(z);
    }

    @Override // android.view.Window.Callback
    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return this.LJLIL.onWindowStartingActionMode(callback);
    }

    @Override // android.view.Window.Callback
    public boolean onCreatePanelMenu(int i, Menu menu) {
        return this.LJLIL.onCreatePanelMenu(i, menu);
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        return this.LJLIL.onMenuItemSelected(i, menuItem);
    }

    @Override // android.view.Window.Callback
    public boolean onMenuOpened(int i, Menu menu) {
        return this.LJLIL.onMenuOpened(i, menu);
    }

    @Override // android.view.Window.Callback
    public void onPanelClosed(int i, Menu menu) {
        this.LJLIL.onPanelClosed(i, menu);
    }

    @Override // android.view.Window.Callback
    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
        return this.LJLIL.onWindowStartingActionMode(callback, i);
    }

    @Override // android.view.Window.Callback
    public boolean onPreparePanel(int i, View view, Menu menu) {
        return this.LJLIL.onPreparePanel(i, view, menu);
    }

    @Override // android.view.Window.Callback
    public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i) {
        this.LJLIL.onProvideKeyboardShortcuts(list, menu, i);
    }
}
