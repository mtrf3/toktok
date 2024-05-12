package X;

import com.bytedance.creativex.recorder.filter.panel.FilterPanelState;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class WPE extends AbstractC65781Prl implements InterfaceC88472Yns<FilterPanelState, FilterPanelState> {
    public static final WPE LJLIL = new WPE();

    public WPE() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final FilterPanelState invoke(FilterPanelState filterPanelState) {
        FilterPanelState receiver = filterPanelState;
        o.LJIIIZ(receiver, "$receiver");
        return FilterPanelState.copy$default(receiver, null, null, false, null, null, null, 61, null);
    }
}
