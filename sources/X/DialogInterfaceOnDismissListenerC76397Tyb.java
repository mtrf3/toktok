package X;

import android.content.DialogInterface;
import com.bytedance.android.live.liveinteract.multihost.biz.dialog.LinkDialog;

/* renamed from: X.Tyb, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class DialogInterfaceOnDismissListenerC76397Tyb implements DialogInterface.OnDismissListener {
    public final /* synthetic */ C76470Tzm LJLIL;
    public final /* synthetic */ C76280Twi LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LJLJJI;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LJLJJL;

    public DialogInterfaceOnDismissListenerC76397Tyb(C76470Tzm c76470Tzm, C76280Twi c76280Twi, boolean z, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro2) {
        this.LJLIL = c76470Tzm;
        this.LJLILLLLZI = c76280Twi;
        this.LJLJI = z;
        this.LJLJJI = interfaceC65784Pro;
        this.LJLJJL = interfaceC65784Pro2;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        LinkDialog linkDialog = this.LJLIL.LLIIZ;
        if (linkDialog != null) {
            linkDialog.setOnDismissListener(null);
        }
        this.LJLIL.LLIIZ = null;
        if (C8E.LIZLLL().LJIL().size() == 2 && C8E.LIZLLL().LJIILJJIL().size() == 2 && this.LJLILLLLZI.LJ() == EnumC76178Tv4.NORMAL) {
            C75832TpU.LIZ.LJJIIJZLJL(this.LJLJI);
            this.LJLIL.LJIIIIZZ(this.LJLJJI, this.LJLJJL, this.LJLJI);
        }
    }
}
