package com.ss.android.ugc.gamora.recorder.sticker.templateeffect.models;

import X.C78966Uyw;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.Objects;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class MobileEffectTemplateEffect extends Effect {
    public final Effect effect;

    public static /* synthetic */ MobileEffectTemplateEffect copy$default(MobileEffectTemplateEffect mobileEffectTemplateEffect, Effect effect, int i, Object obj) {
        if ((i & 1) != 0) {
            effect = mobileEffectTemplateEffect.effect;
        }
        return mobileEffectTemplateEffect.copy(effect);
    }

    public final MobileEffectTemplateEffect copy(Effect effect) {
        o.LJIIIZ(effect, "effect");
        return new MobileEffectTemplateEffect(effect);
    }

    @Override // com.ss.ugc.effectplatform.model.Effect
    public int hashCode() {
        return Objects.hash(this.effect);
    }

    @Override // com.ss.ugc.effectplatform.model.Effect
    public String toString() {
        return C78966Uyw.LJJJLL("MobileEffectTemplateEffect:%s", this.effect);
    }

    public final Effect getEffect() {
        return this.effect;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MobileEffectTemplateEffect(Effect effect) {
        super(effect);
        o.LJIIIZ(effect, "effect");
        this.effect = effect;
    }

    @Override // com.ss.ugc.effectplatform.model.Effect
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileEffectTemplateEffect)) {
            return false;
        }
        return C78966Uyw.LJIIIZ(new Object[]{((MobileEffectTemplateEffect) obj).effect}, new Object[]{this.effect});
    }
}
