package X;

import android.content.Intent;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.effectpanel.EffectTemplateCategoryFragment;

/* loaded from: classes13.dex */
public final class TE3 implements InterfaceC144185lG {
    public final /* synthetic */ EffectTemplateCategoryFragment LJLIL;

    public TE3(EffectTemplateCategoryFragment effectTemplateCategoryFragment) {
        this.LJLIL = effectTemplateCategoryFragment;
    }

    @Override // X.InterfaceC144185lG
    public final boolean onActivityResult(int i, int i2, Intent intent) {
        if (i != 10088 || i2 != -1) {
            return false;
        }
        if (intent != null) {
            String LLJJIJIIJIL = C16880lQ.LLJJIJIIJIL(intent, "request_code_publish_effect_result");
            String LLJJIJIIJIL2 = C16880lQ.LLJJIJIIJIL(intent, "request_code_save_draft_result");
            if (LLJJIJIIJIL != null) {
                EffectTemplateCategoryFragment.Jl(this.LJLIL, LLJJIJIIJIL, null, false, 6);
            } else if (LLJJIJIIJIL2 != null) {
                EffectTemplateCategoryFragment.Jl(this.LJLIL, null, LLJJIJIIJIL2, false, 5);
            }
        }
        return true;
    }
}
