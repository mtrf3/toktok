package X;

import com.ss.android.ugc.aweme.shortvideo.effectdiscover.EffectDiscoverPanelState;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class TFU extends AbstractC65781Prl implements InterfaceC88472Yns<EffectDiscoverPanelState, EffectDiscoverPanelState> {
    public static final TFU LJLIL = new TFU();

    public TFU() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final EffectDiscoverPanelState invoke(EffectDiscoverPanelState effectDiscoverPanelState) {
        EffectDiscoverPanelState setStateImmediate = effectDiscoverPanelState;
        o.LJIIIZ(setStateImmediate, "$this$setStateImmediate");
        return EffectDiscoverPanelState.copy$default(setStateImmediate, null, false, null, new C81668W3k(), 7, null);
    }
}