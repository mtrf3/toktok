package X;

import com.bytedance.creativex.recorder.filter.panel.FilterPanelState;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class WPC extends AbstractC65781Prl implements InterfaceC88472Yns<FilterPanelState, FilterPanelState> {
    public static final WPC LJLIL = new WPC();

    public WPC() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final FilterPanelState invoke(FilterPanelState filterPanelState) {
        FilterPanelState receiver = filterPanelState;
        o.LJIIIZ(receiver, "$receiver");
        return FilterPanelState.copy$default(receiver, null, null, false, null, new C145425nG(), null, 47, null);
    }
}
