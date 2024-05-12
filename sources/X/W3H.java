package X;

import com.ss.android.ugc.aweme.sticker.panel.info.EffectInfoPanelState;
import com.ss.android.ugc.aweme.sticker.panel.info.EffectInfoViewModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class W3H extends AbstractC65781Prl implements InterfaceC88472Yns<EffectInfoPanelState, EffectInfoPanelState> {
    public final /* synthetic */ EffectInfoViewModel LJLIL;
    public final /* synthetic */ Effect LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ String LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W3H(EffectInfoViewModel effectInfoViewModel, Effect effect, String str, String str2) {
        super(1);
        this.LJLIL = effectInfoViewModel;
        this.LJLILLLLZI = effect;
        this.LJLJI = str;
        this.LJLJJI = str2;
    }

    @Override // X.InterfaceC88472Yns
    public final EffectInfoPanelState invoke(EffectInfoPanelState effectInfoPanelState) {
        boolean z;
        EffectInfoPanelState setStateImmediate = effectInfoPanelState;
        o.LJIIIZ(setStateImmediate, "$this$setStateImmediate");
        InterfaceC74443TJn interfaceC74443TJn = this.LJLIL.LJLLL;
        if (interfaceC74443TJn != null) {
            z = interfaceC74443TJn.LJJIL(this.LJLILLLLZI);
        } else {
            z = false;
        }
        return setStateImmediate.copy(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, z, !this.LJLIL.Qv0(this.LJLILLLLZI), !this.LJLIL.Rv0(this.LJLILLLLZI), !C1DG.LJIIIIZZ(), false, true, new C81668W3k());
    }
}
