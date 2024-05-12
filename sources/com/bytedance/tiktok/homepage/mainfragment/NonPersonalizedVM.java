package com.bytedance.tiktok.homepage.mainfragment;

import X.ActivityC45651qj;
import X.C116694i1;
import X.C35667DzD;
import X.C35668DzE;
import X.C47261Igj;
import X.C84763XOl;
import X.C90383gg;
import X.ORZ;
import android.app.Activity;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import java.util.ArrayList;

/* loaded from: classes10.dex */
public final class NonPersonalizedVM extends AssemViewModel<C35667DzD> {
    public static final ArrayList<String> LJLIL = C47261Igj.LJII("HOME", "For You", "Following", "FRIENDS_TAB");

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C35667DzD defaultState() {
        return new C35667DzD(Boolean.valueOf(C90383gg.LIZ()), 2, 0);
    }

    public final void gv0() {
        ActivityC45651qj activityC45651qj;
        Activity LJIIIIZZ = C84763XOl.LJIIIIZZ();
        if ((LJIIIIZZ instanceof ActivityC45651qj) && (activityC45651qj = (ActivityC45651qj) LJIIIIZZ) != null && ORZ.LJLJJI(C116694i1.LIZ(activityC45651qj).nv0(), LJLIL)) {
            setState(C35668DzE.LJLIL);
        }
    }
}
