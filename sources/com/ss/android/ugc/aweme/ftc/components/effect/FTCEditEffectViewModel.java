package com.ss.android.ugc.aweme.ftc.components.effect;

import X.InterfaceC146785pS;
import X.Z9U;
import X.Z9V;
import X.Z9W;
import X.Z9X;
import X.Z9Y;
import com.bytedance.ui_component.LifecycleAwareViewModel;
import kotlin.jvm.internal.AqS40S0001000_16;

/* loaded from: classes17.dex */
public final class FTCEditEffectViewModel extends LifecycleAwareViewModel<FTCEditEffectState> implements InterfaceC146785pS {
    @Override // X.InterfaceC146785pS
    public void C5() {
        setStateImmediate(Z9W.LJLIL);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.jedi.arch.JediViewModel
    /* renamed from: Jv0, reason: merged with bridge method [inline-methods] */
    public FTCEditEffectState kv0() {
        return new FTCEditEffectState(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 63, 0 == true ? 1 : 0);
    }

    @Override // X.InterfaceC146785pS
    public void LLIL() {
        setStateImmediate(Z9X.LJLIL);
    }

    @Override // X.InterfaceC146785pS
    public void Q9() {
        setStateImmediate(Z9V.LJLIL);
    }

    @Override // X.InterfaceC146785pS
    public void hide() {
        setStateImmediate(Z9U.LJLIL);
    }

    @Override // X.InterfaceC146785pS
    public void show() {
        setStateImmediate(Z9Y.LJLIL);
    }

    @Override // X.InterfaceC146785pS
    public void LJJLIIIJ(int i) {
        setStateImmediate(new AqS40S0001000_16(i, 0));
    }

    @Override // X.InterfaceC146785pS
    public void l0(int i) {
        setStateImmediate(new AqS40S0001000_16(i, 1));
    }
}
