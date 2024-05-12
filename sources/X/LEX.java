package X;

import android.content.res.Configuration;
import androidx.viewpager.widget.ViewPager;
import com.ss.android.ugc.aweme.tablet.impl.settings.TabletCommentSplitSettings;

/* loaded from: classes10.dex */
public final class LEX implements C70D {
    public static final LEX LIZ = new LEX();

    @Override // X.C70D
    public final float LLJJJJLIIL() {
        if (C35686DzW.LIZ("ITabletCommentHelper.provideSectionRatio")) {
            return 0.4f;
        }
        return ((TabletCommentSplitSettings.TabletCommentSplitConfig) TabletCommentSplitSettings.LIZIZ.getValue()).provideSectionRatio;
    }

    @Override // X.C70D
    public final boolean LLJJLIIIJLLLLLLLZ() {
        if (C35686DzW.LIZ("ITabletCommentHelper.blockDetailPageExperiment")) {
            return false;
        }
        return true;
    }

    @Override // X.C70D
    public final boolean LLJLIL() {
        if (C35686DzW.LIZ("ITabletCommentHelper.blockDislike")) {
            return false;
        }
        return C54966Lhi.LIZJ();
    }

    @Override // X.C70D
    public final boolean LLJJL(boolean z) {
        if (C35686DzW.LIZ("ITabletCommentHelper.blockNowFeed")) {
            return false;
        }
        return z;
    }

    @Override // X.C70D
    public final void LLJL(ActivityC45651qj activityC45651qj, ViewPager viewPager, Configuration configuration) {
        int LIZ2;
        if (C35686DzW.LIZ("ITabletCommentHelper.updateCommentPanelHeight") || LEO.LIZJ() || viewPager == null) {
            return;
        }
        if (configuration != null) {
            LIZ2 = configuration.screenHeightDp;
        } else {
            LIZ2 = C53946LFe.LIZJ(activityC45651qj, null).LIZ();
        }
        if (LIZ2 < 700) {
            viewPager.getLayoutParams().height = C17N.LJIILL(430.0d);
            viewPager.requestLayout();
        } else {
            viewPager.getLayoutParams().height = C17N.LJIILL(499.0d);
            viewPager.requestLayout();
        }
    }
}
