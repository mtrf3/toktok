package com.ss.android.ugc.aweme.services.watermark;

import X.F9E;
import com.ss.android.ugc.effectmanager.common.model.UrlModel;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class ViralEffectInfo extends F9E {
    public final UrlModel effectIcon;
    public final String effectId;
    public final String effectName;

    public static /* synthetic */ ViralEffectInfo copy$default(ViralEffectInfo viralEffectInfo, String str, String str2, UrlModel urlModel, int i, Object obj) {
        if ((i & 1) != 0) {
            str = viralEffectInfo.effectId;
        }
        if ((i & 2) != 0) {
            str2 = viralEffectInfo.effectName;
        }
        if ((i & 4) != 0) {
            urlModel = viralEffectInfo.effectIcon;
        }
        return viralEffectInfo.copy(str, str2, urlModel);
    }

    public final ViralEffectInfo copy(String effectId, String effectName, UrlModel effectIcon) {
        o.LJIIIZ(effectId, "effectId");
        o.LJIIIZ(effectName, "effectName");
        o.LJIIIZ(effectIcon, "effectIcon");
        return new ViralEffectInfo(effectId, effectName, effectIcon);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.effectId, this.effectName, this.effectIcon};
    }

    public final UrlModel getEffectIcon() {
        return this.effectIcon;
    }

    public final String getEffectId() {
        return this.effectId;
    }

    public final String getEffectName() {
        return this.effectName;
    }

    public ViralEffectInfo(String effectId, String effectName, UrlModel effectIcon) {
        o.LJIIIZ(effectId, "effectId");
        o.LJIIIZ(effectName, "effectName");
        o.LJIIIZ(effectIcon, "effectIcon");
        this.effectId = effectId;
        this.effectName = effectName;
        this.effectIcon = effectIcon;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ ViralEffectInfo(String str, String str2, UrlModel urlModel, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? new UrlModel(null, 1, 0 == true ? 1 : 0) : urlModel);
    }
}
