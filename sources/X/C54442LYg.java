package X;

import com.ss.android.ugc.feed.platform.panel.viewpager.ViewPagerScrollAngleComponent;
import kotlin.jvm.internal.o;

/* renamed from: X.LYg, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54442LYg implements C2MJ {
    public final /* synthetic */ ViewPagerScrollAngleComponent LJLIL;

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

    public C54442LYg(ViewPagerScrollAngleComponent viewPagerScrollAngleComponent) {
        this.LJLIL = viewPagerScrollAngleComponent;
    }

    @Override // X.C2MJ
    public final void Ye(C2MA selectedHolder) {
        o.LJIIIZ(selectedHolder, "selectedHolder");
    }

    @Override // X.C2MJ, X.C0C3
    public final void onPageSelected(int i) {
        this.LJLIL.v3();
    }
}
