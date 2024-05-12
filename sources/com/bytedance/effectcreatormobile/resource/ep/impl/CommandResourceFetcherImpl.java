package com.bytedance.effectcreatormobile.resource.ep.impl;

import X.C78555UsJ;
import X.C93726aVW;
import X.C94101abZ;
import X.C94102aba;
import X.C94103abb;
import X.C94639akF;
import X.C94640akG;
import X.InterfaceC67352kd;
import X.XKS;
import com.bytedance.effectcreatormobile.ckeapi.api.resource.ICommonResourceFetcher;

/* loaded from: classes34.dex */
public final class CommandResourceFetcherImpl implements ICommonResourceFetcher {
    @Override // com.bytedance.effectcreatormobile.ckeapi.api.resource.ICommonResourceFetcher
    public Object downloads(String str, InterfaceC67352kd interfaceC67352kd) {
        XKS xks = new XKS(1, C78555UsJ.LJJII(interfaceC67352kd));
        xks.LJIIL();
        C93726aVW.LIZ().downloadRes(str, new C94102aba(xks));
        return xks.LJIIJJI();
    }

    @Override // com.bytedance.effectcreatormobile.ckeapi.api.resource.ICommonResourceFetcher
    public Object panelFetch(String str, InterfaceC67352kd interfaceC67352kd) {
        XKS xks = new XKS(1, C78555UsJ.LJJII(interfaceC67352kd));
        xks.LJIIL();
        C93726aVW.LIZ().panelFetch(str, new C94639akF(), new C94103abb(xks));
        return xks.LJIIJJI();
    }

    @Override // com.bytedance.effectcreatormobile.ckeapi.api.resource.ICommonResourceFetcher
    public Object categoryFetch(String str, String str2, InterfaceC67352kd interfaceC67352kd) {
        XKS xks = new XKS(1, C78555UsJ.LJJII(interfaceC67352kd));
        xks.LJIIL();
        C93726aVW.LIZ().categoryFetch(str, str2, false, new C94640akG(), new C94101abZ(xks));
        return xks.LJIIJJI();
    }
}
