package X;

import android.content.DialogInterface;
import com.bytedance.android.live.liveinteract.multihost.biz.dialog.LinkDialog;

/* renamed from: X.TyX, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class DialogInterfaceOnDismissListenerC76393TyX implements DialogInterface.OnDismissListener {
    public final /* synthetic */ C76469Tzl LJLIL;
    public final /* synthetic */ C76280Twi LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI;
    public final /* synthetic */ EnumC76319TxL LJLJJI;
    public final /* synthetic */ EnumC75644TmS LJLJJL;
    public final /* synthetic */ EnumC76248TwC LJLJJLL;

    public DialogInterfaceOnDismissListenerC76393TyX(C76469Tzl c76469Tzl, C76280Twi c76280Twi, boolean z, EnumC76319TxL enumC76319TxL, EnumC75644TmS enumC75644TmS, EnumC76248TwC enumC76248TwC) {
        this.LJLIL = c76469Tzl;
        this.LJLILLLLZI = c76280Twi;
        this.LJLJI = z;
        this.LJLJJI = enumC76319TxL;
        this.LJLJJL = enumC75644TmS;
        this.LJLJJLL = enumC76248TwC;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        LinkDialog linkDialog = this.LJLIL.LLIIIILZ;
        if (linkDialog != null) {
            linkDialog.setOnDismissListener(null);
        }
        this.LJLIL.LLIIIILZ = null;
        if (C8E.LIZLLL().LJIILJJIL().size() == 4 && this.LJLILLLLZI.LJ() == EnumC76178Tv4.NORMAL) {
            C75832TpU.LIZ.LJJIIJZLJL(this.LJLJI);
            this.LJLIL.LJLJLJ(this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL);
        }
    }
}
