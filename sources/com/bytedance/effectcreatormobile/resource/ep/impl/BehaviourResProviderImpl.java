package com.bytedance.effectcreatormobile.resource.ep.impl;

import X.C34K;
import X.C3C5;
import X.C78555UsJ;
import X.C93726aVW;
import X.C93843aXP;
import X.C94099abX;
import X.C94100abY;
import X.C94381ag5;
import X.C94384ag8;
import X.C94638akE;
import X.InterfaceC67352kd;
import X.XKS;
import com.bytedance.effectcreatormobile.ckeapi.api.behaviour.res.IBehaviourResProvider;
import java.util.List;

/* loaded from: classes34.dex */
public final class BehaviourResProviderImpl implements IBehaviourResProvider {
    public List<C94384ag8> actionCache;
    public final String actionPanel;
    public List<C94384ag8> triggerCache;
    public final String triggerPanel;

    public BehaviourResProviderImpl() {
        C93843aXP.LIZ().getEffectPlatformConfig().getClass();
        this.triggerPanel = "ame_trigger_instant";
        C93843aXP.LIZ().getEffectPlatformConfig().getClass();
        this.actionPanel = "ame_action";
    }

    @Override // com.bytedance.effectcreatormobile.ckeapi.api.behaviour.res.IBehaviourResProvider
    public Object loadActionRes(InterfaceC67352kd<? super C94381ag5> interfaceC67352kd) {
        XKS xks = new XKS(1, C78555UsJ.LJJII(interfaceC67352kd));
        xks.LJIIL();
        C34K c34k = new C34K();
        c34k.element = false;
        List<C94384ag8> list = this.actionCache;
        if (list != null) {
            c34k.element = true;
            C94381ag5 c94381ag5 = new C94381ag5(true, list);
            C3C5.m7constructorimpl(c94381ag5);
            xks.resumeWith(c94381ag5);
        }
        C93726aVW.LIZ().panelFetch(this.actionPanel, new C94638akE(), new C94099abX(c34k, xks, this));
        return xks.LJIIJJI();
    }

    @Override // com.bytedance.effectcreatormobile.ckeapi.api.behaviour.res.IBehaviourResProvider
    public Object loadTriggerRes(InterfaceC67352kd<? super C94381ag5> interfaceC67352kd) {
        XKS xks = new XKS(1, C78555UsJ.LJJII(interfaceC67352kd));
        xks.LJIIL();
        C34K c34k = new C34K();
        c34k.element = false;
        List<C94384ag8> list = this.triggerCache;
        if (list != null) {
            c34k.element = true;
            C94381ag5 c94381ag5 = new C94381ag5(true, list);
            C3C5.m7constructorimpl(c94381ag5);
            xks.resumeWith(c94381ag5);
        }
        C93726aVW.LIZ().panelFetch(this.triggerPanel, new C94638akE(), new C94100abY(c34k, xks, this));
        return xks.LJIIJJI();
    }
}
