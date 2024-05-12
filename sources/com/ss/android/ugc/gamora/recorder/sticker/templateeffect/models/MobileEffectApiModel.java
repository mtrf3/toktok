package com.ss.android.ugc.gamora.recorder.sticker.templateeffect.models;

import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.sticker.model.MobileEffectTemplateInfo;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class MobileEffectApiModel {

    @InterfaceC65349Pkn("effect")
    public final Effect effect;

    @InterfaceC65349Pkn("moderation_status")
    public final int moderationStatus;

    @InterfaceC65349Pkn("template_info")
    public final MobileEffectTemplateInfo templateInfo;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileEffectApiModel)) {
            return false;
        }
        MobileEffectApiModel mobileEffectApiModel = (MobileEffectApiModel) obj;
        return o.LJ(this.effect, mobileEffectApiModel.effect) && this.moderationStatus == mobileEffectApiModel.moderationStatus && o.LJ(this.templateInfo, mobileEffectApiModel.templateInfo);
    }

    public final int hashCode() {
        int hashCode = ((this.effect.hashCode() * 31) + this.moderationStatus) * 31;
        MobileEffectTemplateInfo mobileEffectTemplateInfo = this.templateInfo;
        return hashCode + (mobileEffectTemplateInfo == null ? 0 : mobileEffectTemplateInfo.hashCode());
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("MobileEffectApiModel(effect=");
        LIZ.append(this.effect);
        LIZ.append(", moderationStatus=");
        LIZ.append(this.moderationStatus);
        LIZ.append(", templateInfo=");
        LIZ.append(this.templateInfo);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public MobileEffectApiModel(Effect effect, int i, MobileEffectTemplateInfo mobileEffectTemplateInfo) {
        o.LJIIIZ(effect, "effect");
        this.effect = effect;
        this.moderationStatus = i;
        this.templateInfo = mobileEffectTemplateInfo;
    }

    public /* synthetic */ MobileEffectApiModel(Effect effect, int i, MobileEffectTemplateInfo mobileEffectTemplateInfo, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(effect, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? null : mobileEffectTemplateInfo);
    }
}
