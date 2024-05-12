package com.bytedance.pumbaa.bpea.adapter;

import X.C66226Pyw;
import X.EP3;
import X.InterfaceC65784Pro;
import X.InterfaceC66259PzT;
import com.bytedance.pumbaa.bpea.adapter.api.IBPEADomainModule;
import com.bytedance.pumbaa.bpea.adapter.api.IBPEAPumbaaService;
import com.google.gson.m;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes12.dex */
public final class BPEAPumbaaService implements IBPEAPumbaaService {
    public static final AtomicBoolean LJFF = new AtomicBoolean(false);
    public C66226Pyw LIZ;
    public InterfaceC66259PzT LIZIZ;
    public InterfaceC65784Pro<m> LIZJ;
    public InterfaceC65784Pro<m> LIZLLL;
    public m LJ;

    @Override // com.bytedance.pumbaa.bpea.adapter.api.IBPEAPumbaaService, com.bytedance.pumbaa.base.ICommonService
    public final void updateSettings() {
        m mVar;
        Set services;
        m invoke;
        m LJJIJIL;
        InterfaceC65784Pro<m> interfaceC65784Pro = this.LIZJ;
        if (interfaceC65784Pro != null && (invoke = interfaceC65784Pro.invoke()) != null && (LJJIJIL = invoke.LJJIJIL("bpea")) != null) {
            mVar = LJJIJIL.LJJIJIL("modules");
        } else {
            mVar = null;
        }
        this.LJ = mVar;
        if (mVar != null && (services = ServiceManager.get().getServices(IBPEADomainModule.class)) != null) {
            Iterator it = services.iterator();
            while (it.hasNext()) {
                ((IBPEADomainModule) it.next()).LIZIZ(mVar);
            }
        }
        EP3.LIZIZ(this.LIZLLL);
    }

    /* JADX WARN: Code restructure failed: missing block: B:119:0x0273, code lost:
    
        if (r2 != null) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00f0 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00f1  */
    @Override // com.bytedance.pumbaa.bpea.adapter.api.IBPEAPumbaaService, com.bytedance.pumbaa.base.ICommonService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void init(X.C65935PuF r18, java.lang.Object r19, java.lang.Object r20, java.lang.Object r21) {
        /*
            Method dump skipped, instructions count: 637
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.pumbaa.bpea.adapter.BPEAPumbaaService.init(X.PuF, java.lang.Object, java.lang.Object, java.lang.Object):void");
    }
}
