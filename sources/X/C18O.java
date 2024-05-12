package X;

import android.os.Build;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.Menu;
import android.view.View;
import android.view.Window;
import androidx.appcompat.app.AppCompatDelegateImpl;
import java.util.List;

/* renamed from: X.18O, reason: invalid class name */
/* loaded from: classes.dex */
public class C18O extends WindowCallbackC25670zb {
    public C02B LJLILLLLZI;
    public final /* synthetic */ AppCompatDelegateImpl LJLJI;

    @Override // X.WindowCallbackC25670zb, android.view.Window.Callback
    public final void onContentChanged() {
    }

    @Override // X.WindowCallbackC25670zb, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (this.LJLJI.LJJIL(keyEvent) || super.dispatchKeyEvent(keyEvent)) {
            return true;
        }
        return false;
    }

    @Override // X.WindowCallbackC25670zb, android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        if (super.dispatchKeyShortcutEvent(keyEvent)) {
            return true;
        }
        AppCompatDelegateImpl appCompatDelegateImpl = this.LJLJI;
        int keyCode = keyEvent.getKeyCode();
        appCompatDelegateImpl.LJJJJIZL();
        AnonymousClass021 anonymousClass021 = appCompatDelegateImpl.LJLJLLL;
        if (anonymousClass021 != null && anonymousClass021.LJIIIZ(keyCode, keyEvent)) {
            return true;
        }
        AppCompatDelegateImpl.PanelFeatureState panelFeatureState = appCompatDelegateImpl.LLIIIL;
        if (panelFeatureState != null && appCompatDelegateImpl.LJJJJL(panelFeatureState, keyEvent.getKeyCode(), keyEvent)) {
            AppCompatDelegateImpl.PanelFeatureState panelFeatureState2 = appCompatDelegateImpl.LLIIIL;
            if (panelFeatureState2 == null) {
                return true;
            }
            panelFeatureState2.LJIIJJI = true;
            return true;
        }
        if (appCompatDelegateImpl.LLIIIL == null) {
            AppCompatDelegateImpl.PanelFeatureState LJJJJ = appCompatDelegateImpl.LJJJJ(0);
            appCompatDelegateImpl.LJJJJLI(LJJJJ, keyEvent);
            boolean LJJJJL = appCompatDelegateImpl.LJJJJL(LJJJJ, keyEvent.getKeyCode(), keyEvent);
            LJJJJ.LJIIJ = false;
            if (LJJJJL) {
                return true;
            }
        }
        return false;
    }

    @Override // X.WindowCallbackC25670zb, android.view.Window.Callback
    public final View onCreatePanelView(int i) {
        C02B c02b = this.LJLILLLLZI;
        if (c02b != null && i == 0) {
            return new View(c02b.LIZ.LIZ.getContext());
        }
        return super.onCreatePanelView(i);
    }

    @Override // X.WindowCallbackC25670zb, android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        if (Build.VERSION.SDK_INT >= 23) {
            return null;
        }
        AppCompatDelegateImpl appCompatDelegateImpl = this.LJLJI;
        if (appCompatDelegateImpl.LJZL) {
            C36431br c36431br = new C36431br(appCompatDelegateImpl.LJLJJL, callback);
            AbstractC25580zS LJJIIZI = this.LJLJI.LJJIIZI(c36431br);
            if (LJJIIZI == null) {
                return null;
            }
            return c36431br.LJ(LJJIIZI);
        }
        return super.onWindowStartingActionMode(callback);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18O(AppCompatDelegateImpl appCompatDelegateImpl, Window.Callback callback) {
        super(callback);
        this.LJLJI = appCompatDelegateImpl;
    }

    @Override // X.WindowCallbackC25670zb, android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i, Menu menu) {
        if (i == 0 && !(menu instanceof C281318n)) {
            return false;
        }
        return super.onCreatePanelMenu(i, menu);
    }

    @Override // X.WindowCallbackC25670zb, android.view.Window.Callback
    public final boolean onMenuOpened(int i, Menu menu) {
        super.onMenuOpened(i, menu);
        AppCompatDelegateImpl appCompatDelegateImpl = this.LJLJI;
        if (i == 108) {
            appCompatDelegateImpl.LJJJJIZL();
            AnonymousClass021 anonymousClass021 = appCompatDelegateImpl.LJLJLLL;
            if (anonymousClass021 != null) {
                anonymousClass021.LIZJ(true);
            }
        } else {
            appCompatDelegateImpl.getClass();
        }
        return true;
    }

    @Override // X.WindowCallbackC25670zb, android.view.Window.Callback
    public final void onPanelClosed(int i, Menu menu) {
        super.onPanelClosed(i, menu);
        AppCompatDelegateImpl appCompatDelegateImpl = this.LJLJI;
        if (i == 108) {
            appCompatDelegateImpl.LJJJJIZL();
            AnonymousClass021 anonymousClass021 = appCompatDelegateImpl.LJLJLLL;
            if (anonymousClass021 != null) {
                anonymousClass021.LIZJ(false);
                return;
            }
            return;
        }
        if (i == 0) {
            AppCompatDelegateImpl.PanelFeatureState LJJJJ = appCompatDelegateImpl.LJJJJ(i);
            if (!LJJJJ.LJIIL) {
                return;
            }
            appCompatDelegateImpl.LJJIJL(LJJJJ, false);
            return;
        }
        appCompatDelegateImpl.getClass();
    }

    @Override // X.WindowCallbackC25670zb, android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
        AppCompatDelegateImpl appCompatDelegateImpl = this.LJLJI;
        if (!appCompatDelegateImpl.LJZL || i != 0) {
            return super.onWindowStartingActionMode(callback, i);
        }
        C36431br c36431br = new C36431br(appCompatDelegateImpl.LJLJJL, callback);
        AbstractC25580zS LJJIIZI = this.LJLJI.LJJIIZI(c36431br);
        if (LJJIIZI != null) {
            return c36431br.LJ(LJJIIZI);
        }
        return null;
    }

    @Override // X.WindowCallbackC25670zb, android.view.Window.Callback
    public final boolean onPreparePanel(int i, View view, Menu menu) {
        C281318n c281318n;
        if (menu instanceof C281318n) {
            c281318n = (C281318n) menu;
        } else {
            c281318n = null;
        }
        if (i == 0 && c281318n == null) {
            return false;
        }
        if (c281318n != null) {
            c281318n.LJJ = true;
        }
        C02B c02b = this.LJLILLLLZI;
        if (c02b != null && i == 0) {
            C280418e c280418e = c02b.LIZ;
            if (!c280418e.LIZLLL) {
                c280418e.LIZ.LJIIL = true;
                c280418e.LIZLLL = true;
            }
        }
        boolean onPreparePanel = super.onPreparePanel(i, view, menu);
        if (c281318n != null) {
            c281318n.LJJ = false;
        }
        return onPreparePanel;
    }

    @Override // X.WindowCallbackC25670zb, android.view.Window.Callback
    public final void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i) {
        C281318n c281318n = this.LJLJI.LJJJJ(0).LJII;
        if (c281318n != null) {
            super.onProvideKeyboardShortcuts(list, c281318n, i);
        } else {
            super.onProvideKeyboardShortcuts(list, menu, i);
        }
    }
}
