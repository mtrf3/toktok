package X;

import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.comp.impl.game.linkmic.fragment.GameLinkMediaManageFragment;

/* loaded from: classes14.dex */
public class TTC extends C74624TQm {
    public final /* synthetic */ GameLinkMediaManageFragment LJLIL;

    public TTC(GameLinkMediaManageFragment gameLinkMediaManageFragment) {
        this.LJLIL = gameLinkMediaManageFragment;
    }

    @Override // X.C74624TQm, X.U62
    public final void LJLILLLLZI(InterfaceC75441TjB interfaceC75441TjB, int i) {
        LiveDialogFragment liveDialogFragment;
        if (i != 5 && (liveDialogFragment = this.LJLIL.LJLLILLLL) != null) {
            liveDialogFragment.dismiss();
        }
    }
}
