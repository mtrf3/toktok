package X;

import android.content.DialogInterface;
import com.ss.android.ugc.aweme.services.uikit.CreativeLoadingDialogBuilder;

/* renamed from: X.Gib, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class DialogInterfaceOnShowListenerC42281Gib implements DialogInterface.OnShowListener {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ EnumC42283Gid LJLILLLLZI;
    public final /* synthetic */ EnumC42282Gic LJLJI;
    public final /* synthetic */ CreativeLoadingDialogBuilder LJLJJI;

    public DialogInterfaceOnShowListenerC42281Gib(int i, EnumC42283Gid enumC42283Gid, EnumC42282Gic enumC42282Gic, CreativeLoadingDialogBuilder creativeLoadingDialogBuilder) {
        this.LJLIL = i;
        this.LJLILLLLZI = enumC42283Gid;
        this.LJLJI = enumC42282Gic;
        this.LJLJJI = creativeLoadingDialogBuilder;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        C42303Gix.LIZ(this.LJLIL, GGO.SHOW, this.LJLILLLLZI, this.LJLJI, this.LJLJJI.getConfig().getMessage());
        DialogInterface.OnShowListener showListener = this.LJLJJI.getConfig().getShowListener();
        if (showListener != null) {
            showListener.onShow(dialogInterface);
        }
    }
}
