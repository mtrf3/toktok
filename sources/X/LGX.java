package X;

import Y.ARunnableS8S1200000_9;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.experiment.SlidePage;
import com.ss.android.ugc.aweme.experiment.SlidePageItem;
import com.ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import com.ss.android.ugc.aweme.homepage.ui.view.tab.HomeTabViewModel;
import com.ss.android.ugc.aweme.node.MainPageNode;
import com.ss.android.ugc.aweme.node.ProfileGroupPageNode;
import com.ss.android.ugc.aweme.node.ProfilePageNode;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class LGX extends AbstractC53892LDc {
    public final ActivityC45651qj LJLL;

    @Override // X.AbstractC53895LDf
    public final Bundle LJIIIZ() {
        return null;
    }

    @Override // X.AbstractC53895LDf
    public final Class<? extends Fragment> LJIIJ() {
        return null;
    }

    @Override // X.AbstractC53892LDc
    public final boolean LJIJI() {
        return true;
    }

    @Override // X.AbstractC53895LDf
    public final String tag() {
        return "RootNode";
    }

    public LGX(ActivityC45651qj activity) {
        AbstractC53895LDf profilePageNode;
        SlidePageItem slidePageItem;
        o.LJIIIZ(activity, "activity");
        this.LJLL = activity;
        if (C53765L8f.LJIJ()) {
            SlidePage LJII = C53765L8f.LJII();
            if (LJII != null && (slidePageItem = LJII.left) != null) {
                LGT.LIZ = LGT.LIZ(activity, slidePageItem.landingPage);
            }
            AbstractC53895LDf abstractC53895LDf = LGT.LIZ;
            if (abstractC53895LDf != null) {
                LJIILLIIL(abstractC53895LDf);
            }
        }
        LJIILLIIL(new MainPageNode(activity));
        if (C53765L8f.LJIJJLI()) {
            profilePageNode = new ProfileGroupPageNode(activity);
        } else {
            profilePageNode = new ProfilePageNode(activity);
        }
        LJIILLIIL(profilePageNode);
    }

    @Override // X.AbstractC53892LDc
    public final void LJJ(Bundle bundle, String tag) {
        o.LJIIIZ(tag, "tag");
        if (C53765L8f.LJIJJLI() || C53765L8f.LJIJ()) {
            C1DH.LJJIJIIJI(new ARunnableS8S1200000_9(this, tag, bundle, 5));
        } else {
            LJJI(bundle, tag);
        }
    }

    public final void LJJI(Bundle bundle, String pageName) {
        boolean z = bundle.getBoolean("isSmoothScroll", false);
        if (C53320KwG.LIZIZ() && bundle.getBoolean("passiveSwitch")) {
            HomeTabViewModel.LJLJLLL.LIZ(this.LJLL).LJLJL = true;
            ScrollSwitchStateManager LIZ = C84193Sd.LIZ(this.LJLL);
            LIZ.getClass();
            o.LJIIIZ(pageName, "pageName");
            LIZ.LJLIL.setValue(LIZ.nv0(pageName), z, false);
            return;
        }
        C84193Sd.LIZ(this.LJLL).E50(pageName, z);
    }
}
