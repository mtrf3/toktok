package X;

import com.ss.android.ugc.aweme.sticker.panel.info.EffectInfoPanelState;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class W3G extends AbstractC65781Prl implements InterfaceC88472Yns<EffectInfoPanelState, EffectInfoPanelState> {
    public static final W3G LJLIL = new W3G();

    public W3G() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final EffectInfoPanelState invoke(EffectInfoPanelState effectInfoPanelState) {
        EffectInfoPanelState setStateImmediate = effectInfoPanelState;
        o.LJIIIZ(setStateImmediate, "$this$setStateImmediate");
        if (setStateImmediate.isPreviouslyVisible()) {
            return EffectInfoPanelState.copy$default(setStateImmediate, null, null, null, false, false, false, false, false, false, new C81668W3k(), 383, null);
        }
        return EffectInfoPanelState.copy$default(setStateImmediate, null, null, null, false, false, false, false, false, false, null, 1023, null);
    }
}
