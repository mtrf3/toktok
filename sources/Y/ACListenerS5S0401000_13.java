package Y;

import X.C29210BdG;
import X.C29212BdI;
import X.C29213BdJ;
import X.C29215BdL;
import X.C29306Beo;
import X.C31811Ce7;
import X.C76800UCe;
import X.C77541Ubx;
import X.CN1;
import X.DialogC77438UaI;
import X.InterfaceC65784Pro;
import X.InterfaceC74833TYn;
import X.InterfaceC74869TZx;
import X.UI8;
import android.content.Context;
import android.net.Uri;
import android.view.View;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.liveinteract.multiguestv3.main.link.invite.guest.MultiGuestV3GuestBeInvitedDialog;
import com.bytedance.android.livesdk.comp.impl.game.linkmic.dialog.GameLinkGuestBeInvitedDialog;
import com.bytedance.android.livesdkapi.host.IHostAction;
import kotlin.jvm.internal.AqS163S0100000_13;
import kotlin.jvm.internal.AqS73S0201000_13;

/* loaded from: classes14.dex */
public class ACListenerS5S0401000_13 implements View.OnClickListener {
    public final int $t;
    public int i4;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.$t) {
            case 0:
                onClick$0(this, view);
                return;
            case 1:
                onClick$1(this, view);
                return;
            case 2:
                onClick$2(this, view);
                return;
            default:
                return;
        }
    }

    public static final void onClick$0(ACListenerS5S0401000_13 aCListenerS5S0401000_13, View view) {
        ((IActionHandlerService) CN1.LIZ(IActionHandlerService.class)).handle((Context) aCListenerS5S0401000_13.l0, (Uri) aCListenerS5S0401000_13.l1);
        C77541Ubx.LJIILL(aCListenerS5S0401000_13.i4, (UI8) aCListenerS5S0401000_13.l2, false, false);
        ((DialogC77438UaI) aCListenerS5S0401000_13.l3).dismiss();
    }

    public static final void onClick$1(ACListenerS5S0401000_13 aCListenerS5S0401000_13, View view) {
        if (((InterfaceC74833TYn) aCListenerS5S0401000_13.l0).LIZ((C29212BdI) aCListenerS5S0401000_13.l1)) {
            return;
        }
        C31811Ce7.LIZLLL("invite_issue_check", "replyAnchorWithAgree");
        ((GameLinkGuestBeInvitedDialog) aCListenerS5S0401000_13.l2).vl(aCListenerS5S0401000_13.i4);
        InterfaceC65784Pro interfaceC65784Pro = (InterfaceC65784Pro) aCListenerS5S0401000_13.l3;
        if (interfaceC65784Pro != null) {
            interfaceC65784Pro.invoke();
        }
    }

    public static final void onClick$2(ACListenerS5S0401000_13 aCListenerS5S0401000_13, View view) {
        if (((InterfaceC74869TZx) aCListenerS5S0401000_13.l0).LIZ((C29215BdL) aCListenerS5S0401000_13.l1)) {
            return;
        }
        C31811Ce7.LIZLLL("invite_issue_check", "replyAnchorWithAgree");
        MultiGuestV3GuestBeInvitedDialog multiGuestV3GuestBeInvitedDialog = (MultiGuestV3GuestBeInvitedDialog) aCListenerS5S0401000_13.l2;
        if (multiGuestV3GuestBeInvitedDialog.LLFFF) {
            IHostAction iHostAction = (IHostAction) CN1.LIZ(IHostAction.class);
            if (iHostAction != null) {
                iHostAction.jumpLivePlayActivityClearTop(((MultiGuestV3GuestBeInvitedDialog) aCListenerS5S0401000_13.l2).getContext());
            }
            C29306Beo.LJJJ(new AqS73S0201000_13((MultiGuestV3GuestBeInvitedDialog) aCListenerS5S0401000_13.l2, (MultiGuestV3GuestBeInvitedDialog) aCListenerS5S0401000_13.i4, (int) aCListenerS5S0401000_13.l3, (InterfaceC65784Pro<C76800UCe>) 1));
            return;
        }
        multiGuestV3GuestBeInvitedDialog.vl(aCListenerS5S0401000_13.i4);
        InterfaceC65784Pro interfaceC65784Pro = (InterfaceC65784Pro) aCListenerS5S0401000_13.l3;
        if (interfaceC65784Pro == null) {
            return;
        }
        interfaceC65784Pro.invoke();
    }

    public ACListenerS5S0401000_13(C29210BdG c29210BdG, C29212BdI c29212BdI, GameLinkGuestBeInvitedDialog gameLinkGuestBeInvitedDialog, AqS163S0100000_13 aqS163S0100000_13, int i) {
        this.$t = i;
        this.l0 = c29210BdG;
        this.l1 = c29212BdI;
        this.l2 = gameLinkGuestBeInvitedDialog;
        this.i4 = 0;
        this.l3 = aqS163S0100000_13;
    }

    public ACListenerS5S0401000_13(C29213BdJ c29213BdJ, C29215BdL c29215BdL, MultiGuestV3GuestBeInvitedDialog multiGuestV3GuestBeInvitedDialog, AqS163S0100000_13 aqS163S0100000_13, int i) {
        this.$t = i;
        this.l0 = c29213BdJ;
        this.l1 = c29215BdL;
        this.l2 = multiGuestV3GuestBeInvitedDialog;
        this.i4 = 0;
        this.l3 = aqS163S0100000_13;
    }

    public ACListenerS5S0401000_13(Context context, Uri uri, int i, UI8 ui8, DialogC77438UaI dialogC77438UaI, int i2) {
        this.$t = i2;
        this.l0 = context;
        this.l1 = uri;
        this.i4 = i;
        this.l2 = ui8;
        this.l3 = dialogC77438UaI;
    }
}
