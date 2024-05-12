package X;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;

/* renamed from: X.18o, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class DialogInterfaceOnKeyListenerC281418o implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, C02N {
    public final C281318n LJLIL;
    public DialogInterfaceC39771hF LJLILLLLZI;
    public C281218m LJLJI;

    @Override // X.C02N
    public final boolean LIZIZ(C281318n c281318n) {
        return false;
    }

    public DialogInterfaceOnKeyListenerC281418o(C281318n c281318n) {
        this.LJLIL = c281318n;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        this.LJLJI.LIZ(this.LJLIL, true);
    }

    @Override // X.C02N
    public final void LIZ(C281318n c281318n, boolean z) {
        DialogInterfaceC39771hF dialogInterfaceC39771hF;
        if ((z || c281318n == this.LJLIL) && (dialogInterfaceC39771hF = this.LJLILLLLZI) != null) {
            dialogInterfaceC39771hF.dismiss();
        }
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        C281318n c281318n = this.LJLIL;
        C281218m c281218m = this.LJLJI;
        if (c281218m.LJLJJLL == null) {
            c281218m.LJLJJLL = new C02H(c281218m);
        }
        c281318n.LJIILLIIL(c281218m.LJLJJLL.getItem(i), null, 0);
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        if (i == 82 || i == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.LJLILLLLZI.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.LJLILLLLZI.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                this.LJLIL.LIZJ(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return this.LJLIL.performShortcut(i, keyEvent, 0);
    }
}
