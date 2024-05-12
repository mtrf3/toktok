package X;

import android.content.DialogInterface;
import com.ss.android.ugc.aweme.services.uikit.CreativeLoadingDialogBuilder;

/* renamed from: X.Gia, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class DialogInterfaceOnDismissListenerC42280Gia implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ EnumC42283Gid LJLILLLLZI;
    public final /* synthetic */ EnumC42282Gic LJLJI;
    public final /* synthetic */ CreativeLoadingDialogBuilder LJLJJI;

    public DialogInterfaceOnDismissListenerC42280Gia(int i, EnumC42283Gid enumC42283Gid, EnumC42282Gic enumC42282Gic, CreativeLoadingDialogBuilder creativeLoadingDialogBuilder) {
        this.LJLIL = i;
        this.LJLILLLLZI = enumC42283Gid;
        this.LJLJI = enumC42282Gic;
        this.LJLJJI = creativeLoadingDialogBuilder;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        C42303Gix.LIZ(this.LJLIL, GGO.DISMISS, this.LJLILLLLZI, this.LJLJI, this.LJLJJI.getConfig().getMessage());
        DialogInterface.OnDismissListener dismissListener = this.LJLJJI.getConfig().getDismissListener();
        if (dismissListener != null) {
            dismissListener.onDismiss(dialogInterface);
        }
    }
}
