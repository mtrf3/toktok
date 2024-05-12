package X;

import android.content.DialogInterface;
import android.view.View;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.OfT, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class DialogInterfaceOnShowListenerC62471OfT implements DialogInterface.OnShowListener {
    public final /* synthetic */ DialogC62475OfX LJLIL;

    public DialogInterfaceOnShowListenerC62471OfT(DialogC62475OfX dialogC62475OfX) {
        this.LJLIL = dialogC62475OfX;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        DialogC62475OfX dialogC62475OfX = this.LJLIL;
        DialogInterface.OnShowListener onShowListener = dialogC62475OfX.LJLJLLL;
        if (onShowListener != null) {
            onShowListener.onShow(dialogC62475OfX);
        }
        int LJIILL = KL2.LJIILL(this.LJLIL.getContext(), this.LJLIL.findViewById(R.id.juh).getHeight());
        DialogC62475OfX dialogC62475OfX2 = this.LJLIL;
        InterfaceC62474OfW interfaceC62474OfW = dialogC62475OfX2.LJLJJL.LJIILIIL;
        if (interfaceC62474OfW != null) {
            View share_panel_root_layout = dialogC62475OfX2.findViewById(R.id.juh);
            o.LJIIIIZZ(share_panel_root_layout, "share_panel_root_layout");
            interfaceC62474OfW.LJFF(share_panel_root_layout, this.LJLIL.LJLJJL, new C5JV(LJIILL, 1));
        }
        C62468OfQ.LJIIIZ(this.LJLIL.LJLJJL);
        C62468OfQ.LJIIIIZZ(this.LJLIL.LJLJJL);
    }
}
