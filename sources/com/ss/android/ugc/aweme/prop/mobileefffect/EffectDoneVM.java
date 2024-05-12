package com.ss.android.ugc.aweme.prop.mobileefffect;

import X.C47704Ins;
import X.C55749LuL;
import X.C74034T3u;
import com.bytedance.assem.arch.viewModel.AssemViewModel;

/* loaded from: classes13.dex */
public final class EffectDoneVM extends AssemViewModel<C74034T3u> {
    public final C55749LuL LJLIL = new C55749LuL(C47704Ins.LIZLLL(this, EffectDoneInitState.class, "mobile_effect_done_state"), true);

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C74034T3u defaultState() {
        return new C74034T3u(((EffectDoneInitState) this.LJLIL.getValue()).effectName, ((EffectDoneInitState) this.LJLIL.getValue()).author, ((EffectDoneInitState) this.LJLIL.getValue()).originalEffectImage, ((EffectDoneInitState) this.LJLIL.getValue()).editedImage, null);
    }
}
