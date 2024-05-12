package X;

import com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility;
import kotlin.jvm.internal.o;

/* renamed from: X.JqL, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50405JqL implements C2MJ {
    public final /* synthetic */ InterfaceC50393Jq9 LJLIL;
    public final /* synthetic */ IViewPagerComponentAbility LJLILLLLZI;

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

    @Override // X.C2MJ
    public final void Ye(C2MA selectedHolder) {
        o.LJIIIZ(selectedHolder, "selectedHolder");
    }

    @Override // X.C2MJ, X.C0C3
    public final void onPageSelected(int i) {
        this.LJLIL.zj0(this.LJLILLLLZI.getCurrentAweme());
    }

    public C50405JqL(InterfaceC50393Jq9 interfaceC50393Jq9, IViewPagerComponentAbility iViewPagerComponentAbility) {
        this.LJLIL = interfaceC50393Jq9;
        this.LJLILLLLZI = iViewPagerComponentAbility;
    }
}
