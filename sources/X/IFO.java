package X;

import Y.ARunnableS7S0210000_8;
import android.view.View;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.feed.platform.panel.speed.TabletPlaybackSpeedComponent;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class IFO implements C2MJ {
    public final /* synthetic */ TabletPlaybackSpeedComponent LJLIL;

    @Override // X.C2MJ
    public final void J8(int i) {
    }

    @Override // X.C2MJ
    public final void e(int i, boolean z) {
    }

    @Override // X.C2MJ, X.C0C3
    public final void onPageScrollStateChanged(int i) {
    }

    @Override // X.C2MJ, X.C0C3
    public final void onPageScrolled(int i, float f, int i2) {
    }

    public IFO(TabletPlaybackSpeedComponent tabletPlaybackSpeedComponent) {
        this.LJLIL = tabletPlaybackSpeedComponent;
    }

    @Override // X.C2MJ
    public final void Ye(C2MA selectedHolder) {
        o.LJIIIZ(selectedHolder, "selectedHolder");
    }

    @Override // X.C2MJ, X.C0C3
    public final void onPageSelected(int i) {
        boolean z;
        long j;
        TabletPlaybackSpeedComponent tabletPlaybackSpeedComponent = this.LJLIL;
        Aweme aweme = tabletPlaybackSpeedComponent.getAweme();
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        tabletPlaybackSpeedComponent.getClass();
        if (LFH.LIZIZ.LIZLLL().LJIILLIIL().LIZLLL().LIZ()) {
            return;
        }
        View containerView = tabletPlaybackSpeedComponent.getContainerView();
        ARunnableS7S0210000_8 aRunnableS7S0210000_8 = new ARunnableS7S0210000_8(aweme, tabletPlaybackSpeedComponent, z, 7);
        if (z) {
            j = 500;
        } else {
            j = 0;
        }
        containerView.postDelayed(aRunnableS7S0210000_8, j);
    }
}
