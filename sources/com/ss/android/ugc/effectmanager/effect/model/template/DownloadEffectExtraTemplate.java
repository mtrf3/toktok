package com.ss.android.ugc.effectmanager.effect.model.template;

import X.XEU;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes16.dex */
public class DownloadEffectExtraTemplate extends XEU {
    public final transient XEU kDownloadEffect;

    /* JADX WARN: Multi-variable type inference failed */
    public DownloadEffectExtraTemplate() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public XEU getKDownloadEffect() {
        return this.kDownloadEffect;
    }

    public DownloadEffectExtraTemplate(XEU xeu) {
        super(null, 1, null);
        this.kDownloadEffect = xeu;
    }

    public /* synthetic */ DownloadEffectExtraTemplate(XEU xeu, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : xeu);
    }
}
