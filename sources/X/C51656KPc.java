package X;

import android.view.View;
import com.ss.android.ugc.aweme.base.ui.CommonPageFragment;
import com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel;
import com.ss.android.ugc.aweme.detail.ui.DetailPageFragment;
import com.ss.android.ugc.aweme.search.detail.filter.component.cell.FilterContentRootComponent;
import com.ss.android.ugc.aweme.search.detail.filter.component.panel.FilterLogicComponent;
import com.ss.android.ugc.aweme.search.detail.filter.ui.FilterDetailPageFragment;
import com.ss.android.ugc.feed.platform.panel.base.EventCenter;
import kotlin.jvm.internal.o;

/* renamed from: X.KPc, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51656KPc implements InterfaceC224618rh {
    public static final C51656KPc LIZ = new C51656KPc();

    @Override // X.InterfaceC224618rh
    public final C65776Prg LIZ() {
        return C65352Pkq.LIZ(FilterLogicComponent.class);
    }

    @Override // X.InterfaceC224618rh
    public final C65776Prg LIZIZ() {
        return C65352Pkq.LIZ(FilterContentRootComponent.class);
    }

    @Override // X.InterfaceC224618rh
    public final Class<? extends CommonPageFragment> LJ() {
        return FilterDetailPageFragment.class;
    }

    @Override // X.InterfaceC224618rh
    public final KPJ LIZJ(DetailPageFragment detailPageFragment, KPL iVMSubscriber) {
        o.LJIIIZ(detailPageFragment, "detailPageFragment");
        o.LJIIIZ(iVMSubscriber, "iVMSubscriber");
        return new KPJ(detailPageFragment, iVMSubscriber);
    }

    @Override // X.InterfaceC224618rh
    public final KPI LJFF(DetailFragmentPanel detailFragmentPanel, KPL iVMSubscriber) {
        o.LJIIIZ(detailFragmentPanel, "detailFragmentPanel");
        o.LJIIIZ(iVMSubscriber, "iVMSubscriber");
        return new KPI(detailFragmentPanel, iVMSubscriber);
    }

    @Override // X.InterfaceC224618rh
    public final C51677KPx LIZLLL(View view, String str, EventCenter eventCenter) {
        if (!Z9N.LIZIZ.LJJIIZI(str) || !(eventCenter instanceof EventCenter) || eventCenter == null) {
            return null;
        }
        return new C51677KPx(eventCenter, view);
    }
}
