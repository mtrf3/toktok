package X;

import com.ss.android.ugc.feed.platform.panel.player.ResumePlayPanelComponent;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class JAP implements C2MJ {
    public final /* synthetic */ ResumePlayPanelComponent LJLIL;

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

    public JAP(ResumePlayPanelComponent resumePlayPanelComponent) {
        this.LJLIL = resumePlayPanelComponent;
    }

    @Override // X.C2MJ
    public final void Ye(C2MA selectedHolder) {
        o.LJIIIZ(selectedHolder, "selectedHolder");
    }

    @Override // X.C2MJ, X.C0C3
    public final void onPageSelected(int i) {
        this.LJLIL.LJLJJL = 0L;
    }
}
