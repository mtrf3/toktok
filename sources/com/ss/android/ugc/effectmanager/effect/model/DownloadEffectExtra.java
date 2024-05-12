package com.ss.android.ugc.effectmanager.effect.model;

import X.XEU;
import com.ss.android.ugc.effectmanager.effect.model.template.DownloadEffectExtraTemplate;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes16.dex */
public final class DownloadEffectExtra extends DownloadEffectExtraTemplate implements Serializable {
    public final transient XEU kDownloadEffect;

    /* JADX WARN: Multi-variable type inference failed */
    public DownloadEffectExtra() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // X.XEU
    public String getPanel() {
        String panel;
        XEU kDownloadEffect = getKDownloadEffect();
        if (kDownloadEffect != null && (panel = kDownloadEffect.getPanel()) != null) {
            return panel;
        }
        return super.getPanel();
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.DownloadEffectExtraTemplate
    public XEU getKDownloadEffect() {
        return this.kDownloadEffect;
    }

    public DownloadEffectExtra(XEU xeu) {
        super(xeu);
        String panel;
        this.kDownloadEffect = xeu;
        XEU kDownloadEffect = getKDownloadEffect();
        if (kDownloadEffect != null && (panel = kDownloadEffect.getPanel()) != null) {
            super.setPanel(panel);
        }
    }

    @Override // X.XEU
    public void setPanel(String str) {
        XEU kDownloadEffect = getKDownloadEffect();
        if (kDownloadEffect != null) {
            kDownloadEffect.setPanel(str);
        }
        super.setPanel(str);
    }

    public /* synthetic */ DownloadEffectExtra(XEU xeu, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : xeu);
    }
}
