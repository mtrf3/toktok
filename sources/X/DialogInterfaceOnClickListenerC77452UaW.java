package X;

import android.content.DialogInterface;
import com.bytedance.android.live.wallet.WalletExchange;

/* renamed from: X.UaW, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class DialogInterfaceOnClickListenerC77452UaW implements DialogInterface.OnClickListener {
    public final /* synthetic */ String LJLIL;

    public DialogInterfaceOnClickListenerC77452UaW(String str) {
        this.LJLIL = str;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        C77448UaS.LIZ(1, "ug_exchange", this.LJLIL, true);
        WalletExchange.LJLIL.LJJII("auto_exchange_window", this.LJLIL);
    }
}
