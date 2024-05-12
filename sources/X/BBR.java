package X;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.livesdk.adminsetting.LiveFilterCommentApproveDialog;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final /* synthetic */ class BBR extends TBS implements InterfaceC88472Yns<BBP, C76800UCe> {
    public BBR(Object obj) {
        super(1, obj, LiveFilterCommentApproveDialog.class, "switchPage", "switchPage(Lcom/bytedance/android/livesdk/dataChannel/BroadcastDialogPage;)V", 0);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(BBP bbp) {
        Fragment fragment;
        BBP p0 = bbp;
        o.LJIIIZ(p0, "p0");
        LiveFilterCommentApproveDialog liveFilterCommentApproveDialog = (LiveFilterCommentApproveDialog) this.receiver;
        liveFilterCommentApproveDialog.getClass();
        int i = BBQ.LIZ[p0.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    liveFilterCommentApproveDialog.dismiss();
                }
                return C76800UCe.LIZ;
            }
            fragment = (Fragment) liveFilterCommentApproveDialog.LJLILLLLZI.getValue();
        } else {
            fragment = (Fragment) liveFilterCommentApproveDialog.LJLIL.getValue();
        }
        if (fragment != null) {
            FragmentManager childFragmentManager = liveFilterCommentApproveDialog.getChildFragmentManager();
            C1B3 LIZ = C1B6.LIZ(childFragmentManager, childFragmentManager);
            if (p0.getGoNextPage()) {
                LIZ.LJIIJJI(R.anim.hc, R.anim.h_, 0, 0);
            } else {
                LIZ.LJIIJJI(R.anim.h9, R.anim.hd, 0, 0);
            }
            LIZ.LJIIJ(fragment, null, R.id.bs8);
            LIZ.LJIILJJIL();
        }
        return C76800UCe.LIZ;
    }
}
