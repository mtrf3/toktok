package X;

import Y.ARunnableS40S0100000_4;
import android.content.DialogInterface;
import kotlin.jvm.internal.o;

/* renamed from: X.ARg, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class DialogInterfaceOnShowListenerC26232ARg implements DialogInterface.OnShowListener {
    public final /* synthetic */ C26231ARf LJLIL;

    public DialogInterfaceOnShowListenerC26232ARg(C26231ARf c26231ARf) {
        this.LJLIL = c26231ARf;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        C26231ARf c26231ARf = this.LJLIL;
        DialogInterface.OnShowListener onShowListener = c26231ARf.LJLJJLL;
        if (onShowListener != null) {
            onShowListener.onShow(c26231ARf);
        }
        C26231ARf c26231ARf2 = this.LJLIL;
        if (c26231ARf2.LJLJLJ.LJIIIIZZ) {
            c26231ARf2.LJLLI.performAccessibilityAction(64, null);
            return;
        }
        C74291TDr c74291TDr = c26231ARf2.LJLL;
        o.LJIIIZ(c74291TDr, "<this>");
        c74291TDr.setImportantForAccessibility(2);
        c74291TDr.postDelayed(new ARunnableS40S0100000_4(c74291TDr, 13), 1000L);
    }
}
