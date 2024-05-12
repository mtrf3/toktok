package X;

import com.ss.android.ugc.effectmanager.effect.listener.IIsTagNeedUpdatedListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class THA implements TEF {
    public final InterfaceC84497XEf LIZ;

    public THA(InterfaceC84497XEf effectPlatformPrimitive) {
        o.LJIIIZ(effectPlatformPrimitive, "effectPlatformPrimitive");
        this.LIZ = effectPlatformPrimitive;
    }

    @Override // X.TEF
    public final void LIZIZ(EffectCategoryModel effectCategoryModel) {
        this.LIZ.updateTag(effectCategoryModel.getId(), effectCategoryModel.getTagsUpdateTime(), TH9.LIZ);
    }

    @Override // X.TEF
    public final void LIZLLL(Effect effect) {
        this.LIZ.updateTag(effect.getId(), effect.getTagsUpdatedAt(), TEH.LIZ);
    }

    @Override // X.TEF
    public final void LIZ(Effect effect, IIsTagNeedUpdatedListener iIsTagNeedUpdatedListener) {
        if (effect != null) {
            this.LIZ.LJIIIIZZ(effect.getId(), effect.getTags(), effect.getTagsUpdatedAt(), iIsTagNeedUpdatedListener);
        }
    }

    @Override // X.TEF
    public final void LIZJ(EffectCategoryModel effectCategoryModel, TH8 th8) {
        if (effectCategoryModel != null) {
            this.LIZ.LJIIIIZZ(effectCategoryModel.getId(), effectCategoryModel.getTags(), effectCategoryModel.getTagsUpdateTime(), th8);
        }
    }
}
