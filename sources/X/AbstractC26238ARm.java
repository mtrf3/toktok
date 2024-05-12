package X;

import X.AbstractC26238ARm;
import Y.IDDListenerS144S0100000_4;
import android.content.Context;
import android.content.DialogInterface;
import kotlin.jvm.internal.o;

/* renamed from: X.ARm, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC26238ARm<T extends AbstractC26238ARm<T, U>, U> {
    public final Context LIZ;
    public CharSequence LIZIZ;
    public CharSequence LIZJ;
    public DialogInterface.OnDismissListener LIZLLL;
    public DialogInterface.OnCancelListener LJ;
    public DialogInterface.OnShowListener LJFF;
    public InterfaceC26237ARl LJI;
    public boolean LJII;

    public AbstractC26238ARm(Context context) {
        o.LJIIIZ(context, "context");
        this.LIZ = context;
        this.LJII = true;
    }

    public final void LIZ(int i) {
        LIZIZ(this.LIZ.getString(i));
    }

    public void LIZIZ(CharSequence charSequence) {
        this.LIZJ = charSequence;
    }

    public final void LIZJ(InterfaceC88472Yns onDismiss) {
        o.LJIIIZ(onDismiss, "onDismiss");
        this.LIZLLL = new IDDListenerS144S0100000_4(onDismiss, 14);
    }

    public final void LIZLLL(InterfaceC88472Yns onShow) {
        o.LJIIIZ(onShow, "onShow");
        this.LJFF = new DialogInterfaceOnShowListenerC26239ARn(onShow);
    }

    public final void LJ(int i) {
        LJFF(this.LIZ.getString(i));
    }

    public void LJFF(CharSequence charSequence) {
        this.LIZIZ = charSequence;
    }
}
