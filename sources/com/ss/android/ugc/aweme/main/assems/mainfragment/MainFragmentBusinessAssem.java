package com.ss.android.ugc.aweme.main.assems.mainfragment;

import X.C16880lQ;
import X.C212428Vi;
import X.C2K0;
import X.C56662Kg;
import X.InterfaceC55102Lju;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.tiktok.homepage.mainfragment.MainFragmentBusinessAbility;
import com.ss.android.ugc.aweme.base.BaseMainContainerAssem;
import com.ss.android.ugc.aweme.feed.experiment.FeedTouchProtectionExperiment;
import com.ss.android.ugc.aweme.homepage.ui.view.tab.top.ITabStrip;
import com.ss.android.ugc.aweme.main.MainFragment;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class MainFragmentBusinessAssem extends BaseMainContainerAssem implements MainFragmentBusinessAbility, InterfaceC55102Lju {
    @Override // X.C8W0
    public final void onResume() {
        Fragment LIZLLL;
        View view;
        View findViewById;
        String LLLZ = C16880lQ.LLLZ("main_act_assem_lifecycle_%s_%s", new Object[]{C16880lQ.LJLLJ(MainFragmentBusinessAssem.class), "onResume"});
        C56662Kg.LIZ().LIZJ(LLLZ, false);
        super.onResume();
        if (FeedTouchProtectionExperiment.LIZ() && (LIZLLL = C212428Vi.LIZLLL(this)) != null && (view = LIZLLL.getView()) != null && (findViewById = view.findViewById(R.id.j5x)) != null) {
            findViewById.setClickable(true);
        }
        C56662Kg.LIZ().LJFF(LLLZ, false);
    }

    @Override // X.InterfaceC55102Lju
    public final C2K0 provideAbility(String str) {
        if (str.hashCode() != 1875681240) {
            return null;
        }
        return this;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.MainFragmentBusinessAbility
    public final boolean ma(String str) {
        Fragment LIZLLL = C212428Vi.LIZLLL(this);
        o.LJII(LIZLLL, "null cannot be cast to non-null type com.ss.android.ugc.aweme.main.MainFragment");
        ITabStrip iTabStrip = ((MainFragment) LIZLLL).LJLJJI;
        if (iTabStrip != null) {
            return iTabStrip.gN();
        }
        return false;
    }
}
