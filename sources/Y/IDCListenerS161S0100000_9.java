package Y;

import android.content.DialogInterface;
import com.ss.android.ugc.aweme.profile.widgets.cta.other.feature.interaction.ProfileFollowMessageComponent;
import com.ss.android.ugc.aweme.profile.widgets.follow.UserProfileFollowAssem;
import com.ss.android.ugc.profile.platform.business.header.business.cta.business.socialinteraction.HeaderCTASocialInteractionComponent;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public class IDCListenerS161S0100000_9 implements DialogInterface.OnClickListener {
    public final int $t;
    public Object l0;

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.$t) {
            case 0:
                onClick$0(this, dialogInterface, i);
                return;
            case 1:
                onClick$1(this, dialogInterface, i);
                return;
            case 2:
                onClick$2(this, dialogInterface, i);
                return;
            default:
                return;
        }
    }

    public IDCListenerS161S0100000_9(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onClick$0(IDCListenerS161S0100000_9 iDCListenerS161S0100000_9, DialogInterface dialog, int i) {
        o.LJIIIZ(dialog, "dialog");
        if (i == 0) {
            ((ProfileFollowMessageComponent) iDCListenerS161S0100000_9.l0).followImpl();
        }
        dialog.dismiss();
    }

    public static final void onClick$1(IDCListenerS161S0100000_9 iDCListenerS161S0100000_9, DialogInterface dialog, int i) {
        o.LJIIIZ(dialog, "dialog");
        if (i == 0) {
            ((UserProfileFollowAssem) iDCListenerS161S0100000_9.l0).followImpl();
        }
        dialog.dismiss();
    }

    public static final void onClick$2(IDCListenerS161S0100000_9 iDCListenerS161S0100000_9, DialogInterface dialog, int i) {
        o.LJIIIZ(dialog, "dialog");
        if (i == 0) {
            ((HeaderCTASocialInteractionComponent) iDCListenerS161S0100000_9.l0).followImpl();
        }
        dialog.dismiss();
    }
}
