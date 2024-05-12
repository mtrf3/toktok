package com.ss.android.ugc.aweme.node;

import X.AbstractC53895LDf;
import X.ActivityC45651qj;
import X.C53765L8f;
import X.C53900LDk;
import X.C84193Sd;
import X.InterfaceC36571c5;
import X.LCZ;
import X.LKT;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.TabFragmentGroup;
import com.ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import com.ss.android.ugc.aweme.homepage.spi.HomePageCommonServiceImpl;
import com.ss.android.ugc.aweme.main.uiApiImpl.HomePageUIFrameServiceImpl;
import com.ss.android.ugc.aweme.spi.HomePageCommonService;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class ProfileGroupPageNode extends TabFragmentGroup {
    public final ActivityC45651qj LJLLJ;
    public final AbstractC53895LDf LJLLL;
    public ScrollSwitchStateManager LJLLLL;

    @Override // X.InterfaceC54080LKi
    public final String LIZ() {
        return "page_profile";
    }

    @Override // X.InterfaceC54080LKi
    public final View LJFF(LCZ lcz) {
        return null;
    }

    @Override // X.AbstractC53895LDf
    public final Bundle LJIIIZ() {
        return null;
    }

    @Override // X.AbstractC53892LDc
    public final boolean LJIJI() {
        return false;
    }

    @Override // X.AbstractC53895LDf
    public final String tag() {
        return "page_profile";
    }

    @Override // X.AbstractC53895LDf
    public final Class<? extends Fragment> LJIIJ() {
        return HomePageUIFrameServiceImpl.LIZ().getFragmentClass("page_profile");
    }

    public ProfileGroupPageNode(ActivityC45651qj activity) {
        HomePageCommonService LJ;
        o.LJIIIZ(activity, "activity");
        this.LJLLJ = activity;
        if (C53765L8f.LJIJJLI() && (LJ = HomePageCommonServiceImpl.LJ()) != null) {
            AbstractC53895LDf LIZLLL = LJ.LIZLLL(activity);
            this.LJLLL = LIZLLL;
            if (LIZLLL != null) {
                LJIILLIIL(LIZLLL);
                LJIILLIIL(new C53900LDk());
            }
        }
    }

    @Override // X.AbstractC53892LDc
    public final void LJJ(Bundle bundle, String tag) {
        LKT lkt;
        o.LJIIIZ(tag, "tag");
        AbstractC53895LDf abstractC53895LDf = this.LJLLL;
        if (abstractC53895LDf != null && TextUtils.equals(abstractC53895LDf.tag(), tag)) {
            if (this.LJLLLL == null) {
                this.LJLLLL = C84193Sd.LIZ(this.LJLLJ);
            }
            ScrollSwitchStateManager scrollSwitchStateManager = this.LJLLLL;
            InterfaceC36571c5 interfaceC36571c5 = null;
            if (scrollSwitchStateManager != null) {
                interfaceC36571c5 = scrollSwitchStateManager.jv0(scrollSwitchStateManager.nv0("page_profile"));
            }
            if ((interfaceC36571c5 instanceof LKT) && (lkt = (LKT) interfaceC36571c5) != null) {
                lkt.Mf(bundle);
            }
        }
    }
}
