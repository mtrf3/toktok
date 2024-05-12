package X;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.live.effect.music.LiveBGMDialog;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.2Hs, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C56002Hs extends TBS implements InterfaceC88472Yns<BBP, C76800UCe> {
    public C56002Hs(Object obj) {
        super(1, obj, LiveBGMDialog.class, "switchPage", "switchPage(Lcom/bytedance/android/livesdk/dataChannel/BroadcastDialogPage;)V", 0);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(BBP bbp) {
        BBP p0 = bbp;
        o.LJIIIZ(p0, "p0");
        LiveBGMDialog liveBGMDialog = (LiveBGMDialog) this.receiver;
        FragmentManager childFragmentManager = liveBGMDialog.getChildFragmentManager();
        C1B3 LIZ = C1B6.LIZ(childFragmentManager, childFragmentManager);
        if (p0.getGoNextPage()) {
            LIZ.LJIIJJI(R.anim.hc, R.anim.h_, 0, 0);
        } else {
            LIZ.LJIIJJI(R.anim.h9, R.anim.hd, 0, 0);
        }
        if (p0 == BBP.BGM_PLAYLIST) {
            if (!((Fragment) liveBGMDialog.LJLILLLLZI.getValue()).isAdded()) {
                LIZ.LIZIZ(R.id.dm7, (Fragment) liveBGMDialog.LJLILLLLZI.getValue());
            }
        } else {
            LIZ.LJJI((Fragment) liveBGMDialog.LJLILLLLZI.getValue());
            ((Fragment) liveBGMDialog.LJLIL.getValue()).onResume();
        }
        LIZ.LJIILJJIL();
        return C76800UCe.LIZ;
    }
}
