package X;

import com.ss.android.ugc.aweme.search.common.ui.component.SearchInflowCommonComponent;
import kotlin.jvm.internal.o;

/* renamed from: X.JZa, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49366JZa implements C2MJ {
    public final /* synthetic */ SearchInflowCommonComponent LJLIL;

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

    public C49366JZa(SearchInflowCommonComponent searchInflowCommonComponent) {
        this.LJLIL = searchInflowCommonComponent;
    }

    @Override // X.C2MJ
    public final void Ye(C2MA selectedHolder) {
        o.LJIIIZ(selectedHolder, "selectedHolder");
    }

    @Override // X.C2MJ, X.C0C3
    public final void onPageSelected(int i) {
        SearchInflowCommonComponent searchInflowCommonComponent = this.LJLIL;
        if (!searchInflowCommonComponent.LJLILLLLZI && JZV.LIZ(C2S6.LIZ(searchInflowCommonComponent.getContext()))) {
            C49629Jdp.LIZ.storeBoolean("has_swiped_inner_flow", true);
        }
        this.LJLIL.LJLILLLLZI = false;
    }
}
