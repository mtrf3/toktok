package com.bytedance.effectcreatormobile.resource.ep.impl;

import X.C34K;
import X.C3C5;
import X.C78555UsJ;
import X.C93726aVW;
import X.C93843aXP;
import X.C94106abe;
import X.C94382ag6;
import X.C94641akH;
import X.InterfaceC67352kd;
import X.XKS;
import com.bytedance.effectcreatormobile.ckeapi.api.behaviour.res.IEffectHintResProvider;
import com.bytedance.effectcreatormobile.ckeapi.api.draft.EffectHint;
import java.util.LinkedHashMap;

/* loaded from: classes34.dex */
public final class EffectHintGuideResProviderImpl implements IEffectHintResProvider {
    public LinkedHashMap<String, EffectHint> effectHintCache;
    public final String triggerPanel;

    public EffectHintGuideResProviderImpl() {
        C93843aXP.LIZ().getEffectPlatformConfig().getClass();
        this.triggerPanel = "ame_trigger_instant";
    }

    @Override // com.bytedance.effectcreatormobile.ckeapi.api.behaviour.res.IEffectHintResProvider
    public Object loadEffectHintRes(InterfaceC67352kd<? super C94382ag6> interfaceC67352kd) {
        XKS xks = new XKS(1, C78555UsJ.LJJII(interfaceC67352kd));
        xks.LJIIL();
        C34K c34k = new C34K();
        c34k.element = false;
        LinkedHashMap<String, EffectHint> linkedHashMap = this.effectHintCache;
        if (linkedHashMap != null) {
            c34k.element = true;
            C94382ag6 c94382ag6 = new C94382ag6(true, linkedHashMap);
            C3C5.m7constructorimpl(c94382ag6);
            xks.resumeWith(c94382ag6);
        }
        C93726aVW.LIZ().panelFetch(this.triggerPanel, new C94641akH(), new C94106abe(c34k, xks, this));
        return xks.LJIIJJI();
    }
}
