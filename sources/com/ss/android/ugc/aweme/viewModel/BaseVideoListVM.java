package com.ss.android.ugc.aweme.viewmodel;

import X.ActivityC45651qj;
import X.C221108m2;
import X.C2NU;
import X.C42258GiE;
import X.C42259GiF;
import X.C57359MfD;
import X.C5S1;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C78404Ups;
import X.EV6;
import X.InterfaceC208718Hb;
import X.InterfaceC57784Mm4;
import androidx.fragment.app.Fragment;
import com.bytedance.ext_power_list.AssemListViewModel;
import com.ss.android.ugc.aweme.fragments.MentionVideoListFragment;
import com.zhiliaoapp.musically.R;

/* loaded from: classes13.dex */
public abstract class BaseVideoListVM<S extends InterfaceC208718Hb<S, ITEM>, ITEM extends InterfaceC57784Mm4, Cursor> extends AssemListViewModel<S, ITEM, Cursor> {
    public Fragment LJLJI;
    public int LJLIL = -1;
    public final EV6 LJLILLLLZI = C78404Ups.LIZIZ(this, C65352Pkq.LIZ(C57359MfD.class));
    public final C62822Ol8 LJLJJI = C221108m2.LIZIZ(C42259GiF.LJLIL);
    public final C62822Ol8 LJLJJL = C221108m2.LIZIZ(C42258GiE.LJLIL);
    public boolean LJLJJLL = true;
    public final long LJLJL = 60;
    public final int LJLJLJ = 20;

    public final ActivityC45651qj getActivity() {
        Fragment fragment = this.LJLJI;
        if (fragment != null) {
            return fragment.mo49getActivity();
        }
        return null;
    }

    public final boolean hv0() {
        Fragment fragment = this.LJLJI;
        if ((fragment instanceof MentionVideoListFragment) && fragment != null) {
            return MentionVideoListFragment.LJLLILLLL;
        }
        return false;
    }

    public static boolean gv0(Fragment fragment) {
        ActivityC45651qj activityC45651qj;
        if (fragment != null) {
            fragment.mo49getActivity();
        }
        if (C2NU.LIZ.LIZIZ()) {
            return true;
        }
        if (fragment != null) {
            activityC45651qj = fragment.mo49getActivity();
        } else {
            activityC45651qj = null;
        }
        C5S1 c5s1 = new C5S1(activityC45651qj);
        c5s1.LIZJ(R.string.img);
        c5s1.LJ();
        return false;
    }

    public final void iv0(boolean z) {
        MentionVideoListFragment mentionVideoListFragment;
        Fragment fragment = this.LJLJI;
        if ((fragment instanceof MentionVideoListFragment) && (mentionVideoListFragment = (MentionVideoListFragment) fragment) != null) {
            mentionVideoListFragment.LJLJL = z;
        }
    }

    public final void jv0(boolean z) {
        Fragment fragment = this.LJLJI;
        if ((fragment instanceof MentionVideoListFragment) && fragment != null) {
            MentionVideoListFragment.LJLLILLLL = true;
        }
    }
}
