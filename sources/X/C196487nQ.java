package X;

import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.nows.feed.common.INowListFragmentPanel;
import com.ss.android.ugc.aweme.nows.feed.viewmodel.NowPageViewModel;

/* renamed from: X.7nQ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C196487nQ {
    public static boolean LIZ(INowListFragmentPanel iNowListFragmentPanel) {
        C195897mT state;
        C43I<Boolean> c43i;
        NowPageViewModel sg = iNowListFragmentPanel.sg();
        if (sg == null || (state = sg.getState()) == null || (c43i = state.LJLIL) == null || !c43i.LIZ.booleanValue()) {
            return false;
        }
        return true;
    }

    public static void LIZIZ(INowListFragmentPanel iNowListFragmentPanel) {
        Fragment fragment;
        ActivityC45651qj mo49getActivity;
        String Zn0 = iNowListFragmentPanel.Zn0();
        if (Zn0 != null && (fragment = iNowListFragmentPanel.getFragment()) != null && (mo49getActivity = fragment.mo49getActivity()) != null) {
            com.bytedance.hox.Hox.LJLLI.LIZ(mo49getActivity).hv0(Zn0, iNowListFragmentPanel);
            InterfaceC196737np player = iNowListFragmentPanel.getPlayer();
            if (player != null) {
                player.LJIIIZ(C196747nq.class, new C196747nq(mo49getActivity, Zn0));
            }
        }
    }

    public static void LIZJ(INowListFragmentPanel iNowListFragmentPanel) {
        Fragment fragment;
        ActivityC45651qj mo49getActivity;
        String Zn0 = iNowListFragmentPanel.Zn0();
        if (Zn0 != null && (fragment = iNowListFragmentPanel.getFragment()) != null && (mo49getActivity = fragment.mo49getActivity()) != null) {
            com.bytedance.hox.Hox.LJLLI.LIZ(mo49getActivity).zv0(Zn0, iNowListFragmentPanel);
            InterfaceC196737np player = iNowListFragmentPanel.getPlayer();
            if (player != null) {
                player.LJIIIIZZ(C196747nq.class);
            }
        }
    }
}
