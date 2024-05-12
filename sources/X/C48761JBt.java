package X;

import com.ss.android.ugc.feed.platform.panel.autoscroll.AutoScrollComponent;
import kotlin.jvm.internal.o;

/* renamed from: X.JBt, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48761JBt implements C2MJ {
    public final /* synthetic */ AutoScrollComponent LJLIL;

    @Override // X.C2MJ
    public final void J8(int i) {
    }

    @Override // X.C2MJ
    public final void e(int i, boolean z) {
    }

    @Override // X.C2MJ, X.C0C3
    public final void onPageScrolled(int i, float f, int i2) {
    }

    public C48761JBt(AutoScrollComponent autoScrollComponent) {
        this.LJLIL = autoScrollComponent;
    }

    @Override // X.C2MJ
    public final void Ye(C2MA selectedHolder) {
        o.LJIIIZ(selectedHolder, "selectedHolder");
    }

    @Override // X.C2MJ, X.C0C3
    public final void onPageScrollStateChanged(int i) {
        this.LJLIL.LJLLL = i;
    }

    @Override // X.C2MJ, X.C0C3
    public final void onPageSelected(int i) {
        this.LJLIL.O3(false);
        AutoScrollComponent autoScrollComponent = this.LJLIL;
        autoScrollComponent.LL = false;
        autoScrollComponent.H3();
    }
}
