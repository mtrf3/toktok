package X;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.ss.android.ugc.aweme.homepage.ui.view.tab.top.xtab.XTabPanelController;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class LOB extends C08Z {
    public final /* synthetic */ XTabPanelController LIZ;

    public LOB(XTabPanelController xTabPanelController) {
        this.LIZ = xTabPanelController;
    }

    @Override // X.C08Z
    public final void onFragmentPaused(FragmentManager fm, Fragment f) {
        o.LJIIIZ(fm, "fm");
        o.LJIIIZ(f, "f");
        super.onFragmentPaused(fm, f);
        this.LIZ.LIZ();
    }

    @Override // X.C08Z
    public final void onFragmentResumed(FragmentManager fm, Fragment f) {
        o.LJIIIZ(fm, "fm");
        o.LJIIIZ(f, "f");
        if (o.LJ(this.LIZ.LJLJLLL, f)) {
            XTabPanelController xTabPanelController = this.LIZ;
            xTabPanelController.LIZJ(xTabPanelController.LJLJJI, true);
        }
    }
}
