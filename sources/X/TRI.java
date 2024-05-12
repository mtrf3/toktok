package X;

import com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.previewv1.GuestMediaManageFragment;
import com.bytedance.android.livesdk.LiveDialogFragment;

/* loaded from: classes14.dex */
public class TRI extends C74625TQn {
    public final /* synthetic */ GuestMediaManageFragment LJLIL;

    public TRI(GuestMediaManageFragment guestMediaManageFragment) {
        this.LJLIL = guestMediaManageFragment;
    }

    @Override // X.C74625TQn, X.U62
    public final void LJLILLLLZI(InterfaceC75441TjB interfaceC75441TjB, int i) {
        LiveDialogFragment liveDialogFragment;
        if (i != 5 && (liveDialogFragment = this.LJLIL.LLILLL) != null) {
            liveDialogFragment.dismiss();
        }
    }
}
