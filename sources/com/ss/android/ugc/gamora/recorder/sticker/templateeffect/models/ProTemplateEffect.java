package com.ss.android.ugc.gamora.recorder.sticker.templateeffect.models;

import X.ORZ;
import X.X1D;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class ProTemplateEffect extends Effect {
    public final List<String> effectTypes;

    public final String getEffectPath() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(getUnzipPath());
        LIZ.append("/effect");
        return X1D.LIZIZ(LIZ);
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.Effect, com.ss.ugc.effectplatform.model.Effect
    public List<String> getTypes() {
        List<String> types;
        com.ss.ugc.effectplatform.model.Effect kEffect = getKEffect();
        if (kEffect == null || (types = kEffect.getTypes()) == null) {
            types = super.getTypes();
        }
        List<String> LLJILJILJ = ORZ.LLJILJILJ(types);
        List<String> list = this.effectTypes;
        if (list != null) {
            ((ArrayList) LLJILJILJ).addAll(list);
        }
        return LLJILJILJ;
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.Effect, com.ss.ugc.effectplatform.model.Effect
    public void setTypes(List<String> value) {
        o.LJIIIZ(value, "value");
        super.setTypes(value);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProTemplateEffect(Effect effect, List<String> list) {
        super(effect);
        o.LJIIIZ(effect, "effect");
        this.effectTypes = list;
    }
}
