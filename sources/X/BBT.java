package X;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.livesdk.adminsetting.fastaddblockwords.LiveFastAddBlockKeywordsDialog;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final /* synthetic */ class BBT extends TBS implements InterfaceC88472Yns<BBP, C76800UCe> {
    public BBT(Object obj) {
        super(1, obj, LiveFastAddBlockKeywordsDialog.class, "switchPage", "switchPage(Lcom/bytedance/android/livesdk/dataChannel/BroadcastDialogPage;)V", 0);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(BBP bbp) {
        Fragment fragment;
        BBP p0 = bbp;
        o.LJIIIZ(p0, "p0");
        LiveFastAddBlockKeywordsDialog liveFastAddBlockKeywordsDialog = (LiveFastAddBlockKeywordsDialog) this.receiver;
        liveFastAddBlockKeywordsDialog.getClass();
        int i = BBS.LIZ[p0.ordinal()];
        if (i != 1) {
            if (i == 2) {
                fragment = (Fragment) liveFastAddBlockKeywordsDialog.LJLIL.getValue();
            }
            return C76800UCe.LIZ;
        }
        fragment = (Fragment) liveFastAddBlockKeywordsDialog.LJLILLLLZI.getValue();
        if (fragment != null) {
            FragmentManager childFragmentManager = liveFastAddBlockKeywordsDialog.getChildFragmentManager();
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
