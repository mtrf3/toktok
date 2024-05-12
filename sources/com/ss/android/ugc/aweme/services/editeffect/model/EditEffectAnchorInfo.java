package com.ss.android.ugc.aweme.services.editeffect.model;

import X.AnonymousClass391;
import X.EnumC133695Mn;
import X.X1D;
import com.ss.ugc.effectplatform.model.Effect;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class EditEffectAnchorInfo {
    public final List<EditEffectReuseDetails> details;
    public Effect effect;
    public final String effectId;
    public final EnumC133695Mn effectType;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ EditEffectAnchorInfo copy$default(EditEffectAnchorInfo editEffectAnchorInfo, String str, List list, Effect effect, EnumC133695Mn enumC133695Mn, int i, Object obj) {
        if ((i & 1) != 0) {
            str = editEffectAnchorInfo.effectId;
        }
        if ((i & 2) != 0) {
            list = editEffectAnchorInfo.details;
        }
        if ((i & 4) != 0) {
            effect = editEffectAnchorInfo.effect;
        }
        if ((i & 8) != 0) {
            enumC133695Mn = editEffectAnchorInfo.effectType;
        }
        return editEffectAnchorInfo.copy(str, list, effect, enumC133695Mn);
    }

    public final EditEffectAnchorInfo copy(String effectId, List<EditEffectReuseDetails> details, Effect effect, EnumC133695Mn effectType) {
        o.LJIIIZ(effectId, "effectId");
        o.LJIIIZ(details, "details");
        o.LJIIIZ(effectType, "effectType");
        return new EditEffectAnchorInfo(effectId, details, effect, effectType);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EditEffectAnchorInfo)) {
            return false;
        }
        EditEffectAnchorInfo editEffectAnchorInfo = (EditEffectAnchorInfo) obj;
        return o.LJ(this.effectId, editEffectAnchorInfo.effectId) && o.LJ(this.details, editEffectAnchorInfo.details) && o.LJ(this.effect, editEffectAnchorInfo.effect) && this.effectType == editEffectAnchorInfo.effectType;
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("EditEffectAnchorInfo(effectId=");
        LIZ.append(this.effectId);
        LIZ.append(", details=");
        LIZ.append(this.details);
        LIZ.append(", effect=");
        LIZ.append(this.effect);
        LIZ.append(", effectType=");
        LIZ.append(this.effectType);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public int hashCode() {
        int hashCode;
        int LIZIZ = AnonymousClass391.LIZIZ(this.details, this.effectId.hashCode() * 31, 31);
        Effect effect = this.effect;
        if (effect == null) {
            hashCode = 0;
        } else {
            hashCode = effect.hashCode();
        }
        return this.effectType.hashCode() + ((LIZIZ + hashCode) * 31);
    }

    public final List<EditEffectReuseDetails> getDetails() {
        return this.details;
    }

    public final Effect getEffect() {
        return this.effect;
    }

    public final String getEffectId() {
        return this.effectId;
    }

    public final EnumC133695Mn getEffectType() {
        return this.effectType;
    }

    public final void setEffect(Effect effect) {
        this.effect = effect;
    }

    public EditEffectAnchorInfo(String effectId, List<EditEffectReuseDetails> details, Effect effect, EnumC133695Mn effectType) {
        o.LJIIIZ(effectId, "effectId");
        o.LJIIIZ(details, "details");
        o.LJIIIZ(effectType, "effectType");
        this.effectId = effectId;
        this.details = details;
        this.effect = effect;
        this.effectType = effectType;
    }
}
