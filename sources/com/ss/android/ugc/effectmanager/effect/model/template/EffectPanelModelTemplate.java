package com.ss.android.ugc.effectmanager.effect.model.template;

import com.ss.ugc.effectplatform.model.EffectPanelModel;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes16.dex */
public class EffectPanelModelTemplate extends EffectPanelModel {
    public final transient EffectPanelModel kPanelModel;

    /* JADX WARN: Multi-variable type inference failed */
    public EffectPanelModelTemplate() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public EffectPanelModel getKPanelModel() {
        return this.kPanelModel;
    }

    public EffectPanelModelTemplate(EffectPanelModel effectPanelModel) {
        super(null, null, null, null, null, null, 63, null);
        this.kPanelModel = effectPanelModel;
    }

    public /* synthetic */ EffectPanelModelTemplate(EffectPanelModel effectPanelModel, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : effectPanelModel);
    }
}
