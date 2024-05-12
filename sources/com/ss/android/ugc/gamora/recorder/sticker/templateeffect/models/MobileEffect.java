package com.ss.android.ugc.gamora.recorder.sticker.templateeffect.models;

import X.EQT;
import com.ss.android.ugc.aweme.sticker.model.MobileEffectTemplateInfo;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class MobileEffect extends Effect {
    public static final EQT Companion = new EQT();
    public final int moderationStatus;
    public final MobileEffectTemplateInfo templateInfo;

    public final int getModerationStatus() {
        return this.moderationStatus;
    }

    public final MobileEffectTemplateInfo getTemplateInfo() {
        return this.templateInfo;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MobileEffect(Effect effect, int i, MobileEffectTemplateInfo mobileEffectTemplateInfo) {
        super(effect);
        o.LJIIIZ(effect, "effect");
        this.moderationStatus = i;
        this.templateInfo = mobileEffectTemplateInfo;
    }
}
