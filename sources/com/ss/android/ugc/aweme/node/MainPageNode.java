package com.ss.android.ugc.aweme.node;

import X.AbstractC53895LDf;
import X.ActivityC45651qj;
import X.C116694i1;
import X.InterfaceC54080LKi;
import X.LCZ;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.TabFragmentGroup;
import com.ss.android.ugc.aweme.homepage.ui.view.tab.HomeTabViewModel;
import com.ss.android.ugc.aweme.main.uiApiImpl.HomePageUIFrameServiceImpl;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class MainPageNode extends TabFragmentGroup {
    public final ActivityC45651qj LJLLJ;

    @Override // X.InterfaceC54080LKi
    public final String LIZ() {
        return "page_feed";
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
        return "page_feed";
    }

    @Override // X.AbstractC53895LDf
    public final Class<? extends Fragment> LJIIJ() {
        return HomePageUIFrameServiceImpl.LIZ().getFragmentClass("page_feed");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MainPageNode(ActivityC45651qj activity) {
        o.LJIIIZ(activity, "activity");
        this.LJLLJ = activity;
        for (InterfaceC54080LKi interfaceC54080LKi : HomeTabViewModel.LJLJLLL.LIZ(activity).gv0()) {
            if (!o.LJ(interfaceC54080LKi.tag(), "PUBLISH")) {
                LJIILLIIL((AbstractC53895LDf) interfaceC54080LKi);
            }
        }
    }

    @Override // X.AbstractC53892LDc
    public final void LJJ(Bundle bundle, String tag) {
        o.LJIIIZ(tag, "tag");
        C116694i1.LIZ(this.LJLLJ).iv0(tag, bundle.getBoolean("isForcedRefreshView", false), o.LJ(bundle.getString("hox_skip_node"), "RootNode"), bundle, bundle.getString("enter_method", null));
    }
}
