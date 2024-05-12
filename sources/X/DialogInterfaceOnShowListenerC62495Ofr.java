package X;

import Y.ARunnableS46S0100000_10;
import android.content.DialogInterface;
import com.zhiliaoapp.musically.R;

/* renamed from: X.Ofr, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class DialogInterfaceOnShowListenerC62495Ofr implements DialogInterface.OnShowListener {
    public final /* synthetic */ InterfaceC65784Pro<Boolean> LJLIL;
    public final /* synthetic */ DialogC62475OfX LJLILLLLZI;

    public DialogInterfaceOnShowListenerC62495Ofr(InterfaceC65784Pro<Boolean> interfaceC65784Pro, DialogC62475OfX dialogC62475OfX) {
        this.LJLIL = interfaceC65784Pro;
        this.LJLILLLLZI = dialogC62475OfX;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        if (this.LJLIL.invoke().booleanValue()) {
            this.LJLILLLLZI.findViewById(R.id.ju4).postDelayed(new ARunnableS46S0100000_10(this.LJLILLLLZI, 206), 300L);
        }
    }
}
