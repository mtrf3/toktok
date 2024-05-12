package com.ss.android.ugc.gamora.recorder.sticker.templateeffect.effectpanel;

import X.X1D;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class AddButtonEffect extends Effect {
    public final com.ss.ugc.effectplatform.model.Effect newKEffect;

    public static /* synthetic */ AddButtonEffect copy$default(AddButtonEffect addButtonEffect, com.ss.ugc.effectplatform.model.Effect effect, int i, Object obj) {
        if ((i & 1) != 0) {
            effect = addButtonEffect.newKEffect;
        }
        return addButtonEffect.copy(effect);
    }

    public final AddButtonEffect copy(com.ss.ugc.effectplatform.model.Effect effect) {
        return new AddButtonEffect(effect);
    }

    @Override // com.ss.ugc.effectplatform.model.Effect
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AddButtonEffect) && o.LJ(this.newKEffect, ((AddButtonEffect) obj).newKEffect);
    }

    @Override // com.ss.ugc.effectplatform.model.Effect
    public int hashCode() {
        com.ss.ugc.effectplatform.model.Effect effect = this.newKEffect;
        if (effect == null) {
            return 0;
        }
        return effect.hashCode();
    }

    @Override // com.ss.ugc.effectplatform.model.Effect
    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AddButtonEffect(newKEffect=");
        LIZ.append(this.newKEffect);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final com.ss.ugc.effectplatform.model.Effect getNewKEffect() {
        return this.newKEffect;
    }

    public AddButtonEffect(com.ss.ugc.effectplatform.model.Effect effect) {
        super(effect);
        this.newKEffect = effect;
    }
}
