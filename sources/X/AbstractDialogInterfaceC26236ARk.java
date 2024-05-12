package X;

import X.AbstractC26238ARm;
import Y.IDCListenerS280S0100000_4;
import Y.IDDListenerS144S0100000_4;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.Window;
import kotlin.jvm.internal.o;

/* renamed from: X.ARk, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractDialogInterfaceC26236ARk<T extends AbstractC26238ARm<T, ?>> implements DialogInterface {
    public final ARJ LJLIL;
    public final Context LJLILLLLZI;
    public final InterfaceC26237ARl LJLJI;
    public final DialogInterface.OnDismissListener LJLJJI;
    public final DialogInterface.OnCancelListener LJLJJL;
    public final DialogInterface.OnShowListener LJLJJLL;
    public Object LJLJL;

    public abstract Dialog LIZJ();

    @Override // android.content.DialogInterface
    public final void dismiss() {
        LIZIZ(null);
    }

    public final void LIZ() {
        Window window;
        LIZJ().setOnDismissListener(new IDDListenerS144S0100000_4(this, 13));
        LIZJ().setOnCancelListener(new IDCListenerS280S0100000_4(this, 5));
        if (this.LJLJJLL != null) {
            LIZJ().setOnShowListener(new DialogInterfaceOnShowListenerC26235ARj(this));
        }
        InterfaceC26237ARl interfaceC26237ARl = this.LJLJI;
        if (interfaceC26237ARl == null || (window = LIZJ().getWindow()) == null) {
            return;
        }
        Window.Callback callback = window.getCallback();
        o.LJIIIIZZ(callback, "callback");
        Z9S z9s = new Z9S(callback);
        z9s.LJLILLLLZI = interfaceC26237ARl;
        window.setCallback(z9s);
    }

    public final void LIZLLL() {
        C16880lQ.LIZ(LIZJ());
    }

    public final Dialog LJ() {
        C16880lQ.LIZ(LIZJ());
        return LIZJ();
    }

    @Override // android.content.DialogInterface
    public final void cancel() {
        LIZJ().cancel();
    }

    public AbstractDialogInterfaceC26236ARk(T builder) {
        o.LJIIIZ(builder, "builder");
        Context context = builder.LIZ;
        o.LJIIIZ(context, "context");
        this.LJLIL = new ARJ(context);
        this.LJLILLLLZI = builder.LIZ;
        this.LJLJI = builder.LJI;
        this.LJLJJI = builder.LIZLLL;
        this.LJLJJL = builder.LJ;
        this.LJLJJLL = builder.LJFF;
    }

    public final void LIZIZ(Object obj) {
        this.LJLJL = obj;
        try {
            LIZJ().dismiss();
        } catch (Exception unused) {
        }
    }
}
