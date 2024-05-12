package X;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.livesdk.giftlimitnotification.GiftLimitSettingDialog;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final /* synthetic */ class BB7 extends TBS implements InterfaceC88472Yns<BBP, C76800UCe> {
    public BB7(Object obj) {
        super(1, obj, GiftLimitSettingDialog.class, "switchPage", "switchPage(Lcom/bytedance/android/livesdk/dataChannel/BroadcastDialogPage;)V", 0);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(BBP bbp) {
        Fragment fragment;
        BBP p0 = bbp;
        o.LJIIIZ(p0, "p0");
        GiftLimitSettingDialog giftLimitSettingDialog = (GiftLimitSettingDialog) this.receiver;
        giftLimitSettingDialog.getClass();
        if (p0 == BBP.DISMISS) {
            giftLimitSettingDialog.dismiss();
        } else if (BBE.LIZ[p0.ordinal()] == 1 && (fragment = giftLimitSettingDialog.LJLIL) != null) {
            FragmentManager childFragmentManager = giftLimitSettingDialog.getChildFragmentManager();
            C1B3 LIZ = C1B6.LIZ(childFragmentManager, childFragmentManager);
            if (p0.getGoNextPage()) {
                LIZ.LJIIJJI(R.anim.hc, R.anim.h_, 0, 0);
            } else {
                LIZ.LJIIJJI(R.anim.h9, R.anim.hd, 0, 0);
            }
            LIZ.LJIIJ(fragment, null, R.id.dtj);
            LIZ.LJIILJJIL();
        }
        return C76800UCe.LIZ;
    }
}
