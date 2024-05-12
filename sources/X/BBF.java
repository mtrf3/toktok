package X;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.livesdk.adminsetting.LiveAdminSettingDialog;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final /* synthetic */ class BBF extends TBS implements InterfaceC88472Yns<BBP, C76800UCe> {
    public BBF(Object obj) {
        super(1, obj, LiveAdminSettingDialog.class, "switchPage", "switchPage(Lcom/bytedance/android/livesdk/dataChannel/BroadcastDialogPage;)V", 0);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(BBP bbp) {
        Fragment vl;
        BBP p0 = bbp;
        o.LJIIIZ(p0, "p0");
        LiveAdminSettingDialog liveAdminSettingDialog = (LiveAdminSettingDialog) this.receiver;
        if (liveAdminSettingDialog.isAdded() && liveAdminSettingDialog.getHost() != null && (vl = liveAdminSettingDialog.vl(p0)) != null) {
            FragmentManager childFragmentManager = liveAdminSettingDialog.getChildFragmentManager();
            C1B3 LIZ = C1B6.LIZ(childFragmentManager, childFragmentManager);
            if (p0.getGoNextPage()) {
                LIZ.LJIIJJI(R.anim.hc, R.anim.h_, 0, 0);
            } else {
                LIZ.LJIIJJI(R.anim.h9, R.anim.hd, 0, 0);
            }
            LIZ.LJIIJ(vl, null, R.id.xl);
            LIZ.LJIILJJIL();
        }
        return C76800UCe.LIZ;
    }
}
