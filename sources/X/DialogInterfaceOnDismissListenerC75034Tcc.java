package X;

import android.content.DialogInterface;
import com.bytedance.android.live.liveinteract.multiguestv3.main.moderator.guest.MultiGuestAsGuestModeratorsWidget;
import com.bytedance.android.live.liveinteract.platform.common.datachannel.ResetRedDotNumEvent;

/* renamed from: X.Tcc, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class DialogInterfaceOnDismissListenerC75034Tcc implements DialogInterface.OnDismissListener {
    public final /* synthetic */ MultiGuestAsGuestModeratorsWidget LJLIL;
    public final /* synthetic */ C74846TZa LJLILLLLZI;

    public DialogInterfaceOnDismissListenerC75034Tcc(MultiGuestAsGuestModeratorsWidget multiGuestAsGuestModeratorsWidget, C74846TZa c74846TZa) {
        this.LJLIL = multiGuestAsGuestModeratorsWidget;
        this.LJLILLLLZI = c74846TZa;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        MultiGuestAsGuestModeratorsWidget multiGuestAsGuestModeratorsWidget = this.LJLIL;
        multiGuestAsGuestModeratorsWidget.LJLJI = null;
        this.LJLILLLLZI.LJLJL = null;
        multiGuestAsGuestModeratorsWidget.dataChannel.pv0(ResetRedDotNumEvent.class);
    }
}
