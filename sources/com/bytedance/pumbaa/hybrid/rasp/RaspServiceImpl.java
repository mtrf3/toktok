package com.bytedance.pumbaa.hybrid.rasp;

import X.C0R4;
import X.C37046EgM;
import X.C39491Feh;
import X.C39494Fek;
import X.C39495Fel;
import X.C39496Fem;
import X.C58096Mr6;
import X.C66226Pyw;
import X.InterfaceC39487Fed;
import X.InterfaceC39517Ff7;
import com.bytedance.pumbaa.common.interfaces.IEventMonitor;
import com.bytedance.pumbaa.hybrid.rasp.api.IRaspService;
import com.bytedance.pumbaa.ruler.adapter.api.IRuleEngineService;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class RaspServiceImpl implements IRaspService {
    public C39495Fel LIZ;
    public C39494Fek LIZIZ;
    public C39496Fem LIZJ;
    public C0R4 LIZLLL;
    public C39491Feh LJ;
    public C66226Pyw LJFF;

    public static IRaspService LJIIIIZZ() {
        Object LIZ = C58096Mr6.LIZ(IRaspService.class, false);
        if (LIZ != null) {
            return (IRaspService) LIZ;
        }
        if (C58096Mr6.LJJIJIL == null) {
            synchronized (IRaspService.class) {
                if (C58096Mr6.LJJIJIL == null) {
                    C58096Mr6.LJJIJIL = new RaspServiceImpl();
                }
            }
        }
        return C58096Mr6.LJJIJIL;
    }

    @Override // X.InterfaceC39505Fev
    public final InterfaceC39517Ff7 LIZJ() {
        IEventMonitor iEventMonitor;
        Object obj;
        C39491Feh c39491Feh = this.LJ;
        C66226Pyw c66226Pyw = this.LJFF;
        Object obj2 = null;
        if (c66226Pyw != null) {
            iEventMonitor = c66226Pyw.LJZ;
            obj = c66226Pyw.LL;
        } else {
            iEventMonitor = null;
            obj = null;
        }
        if (obj instanceof IRuleEngineService) {
            obj2 = obj;
        }
        C39494Fek c39494Fek = new C39494Fek(c39491Feh, iEventMonitor, (IRuleEngineService) obj2, this.LIZLLL);
        this.LIZIZ = c39494Fek;
        return c39494Fek;
    }

    @Override // X.InterfaceC39505Fev
    public final InterfaceC39487Fed LIZLLL() {
        IEventMonitor iEventMonitor;
        Object obj;
        C39491Feh c39491Feh = this.LJ;
        C66226Pyw c66226Pyw = this.LJFF;
        Object obj2 = null;
        if (c66226Pyw != null) {
            iEventMonitor = c66226Pyw.LJZ;
            obj = c66226Pyw.LL;
        } else {
            iEventMonitor = null;
            obj = null;
        }
        if (obj instanceof IRuleEngineService) {
            obj2 = obj;
        }
        C39495Fel c39495Fel = new C39495Fel(c39491Feh, iEventMonitor, (IRuleEngineService) obj2, this.LIZLLL);
        this.LIZ = c39495Fel;
        return c39495Fel;
    }

    @Override // com.bytedance.pumbaa.hybrid.rasp.api.IRaspService
    public final void LJ(C37046EgM c37046EgM) {
        C0R4 c0r4 = this.LIZLLL;
        if (c0r4 != null) {
            ((List) c0r4.LIZ).add(c37046EgM);
        }
    }

    @Override // X.InterfaceC39505Fev
    public final void LJFF(C39491Feh c39491Feh) {
        this.LJ = c39491Feh;
        C39494Fek c39494Fek = this.LIZIZ;
        if (c39494Fek != null) {
            c39494Fek.LIZ = c39491Feh;
        }
        C39495Fel c39495Fel = this.LIZ;
        if (c39495Fel != null) {
            c39495Fel.LIZ = c39491Feh;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001d, code lost:
    
        if (r1.LIZ(r3, "common") == true) goto L14;
     */
    @Override // X.InterfaceC39505Fev
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Boolean LIZ(android.content.Intent r5, java.lang.Throwable r6) {
        /*
            r4 = this;
            android.net.Uri r3 = r5.getData()
            if (r3 == 0) goto L26
            X.Feh r0 = r4.LJ
            if (r0 == 0) goto L24
            com.bytedance.pumbaa.hybrid.base.NavigationConfig r0 = r0.LJLIL
            if (r0 == 0) goto L24
            boolean r0 = r0.enableRasp
            r2 = 1
            if (r0 != r2) goto L24
            X.Fem r1 = r4.LIZJ
            if (r1 == 0) goto L24
            java.lang.String r0 = "common"
            boolean r0 = r1.LIZ(r3, r0)
            if (r0 != r2) goto L24
        L1f:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            return r0
        L24:
            r2 = 0
            goto L1f
        L26:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.pumbaa.hybrid.rasp.RaspServiceImpl.LIZ(android.content.Intent, java.lang.Throwable):java.lang.Boolean");
    }

    @Override // X.InterfaceC39505Fev
    public final void LIZIZ(C66226Pyw proxy, C39491Feh c39491Feh) {
        o.LJIIIZ(proxy, "proxy");
        this.LJFF = proxy;
        this.LJ = c39491Feh;
        this.LIZLLL = new C0R4();
        IEventMonitor iEventMonitor = proxy.LJZ;
        Object obj = proxy.LL;
        if (!(obj instanceof IRuleEngineService)) {
            obj = null;
        }
        this.LIZJ = new C39496Fem(iEventMonitor, (IRuleEngineService) obj, this.LIZLLL);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0021, code lost:
    
        if (r2.LIZ(r1, r7) == true) goto L14;
     */
    @Override // com.bytedance.pumbaa.hybrid.rasp.api.IRaspService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Boolean LJI(java.lang.String r6, java.lang.String r7) {
        /*
            r5 = this;
            if (r6 == 0) goto L48
            r4 = 0
            X.Feh r0 = r5.LJ     // Catch: java.lang.Throwable -> L2b
            if (r0 == 0) goto L28
            com.bytedance.pumbaa.hybrid.base.NavigationConfig r0 = r0.LJLIL     // Catch: java.lang.Throwable -> L2b
            if (r0 == 0) goto L28
            boolean r0 = r0.enableRasp     // Catch: java.lang.Throwable -> L2b
            r3 = 1
            if (r0 != r3) goto L28
            X.Fem r2 = r5.LIZJ     // Catch: java.lang.Throwable -> L2b
            if (r2 == 0) goto L28
            android.net.Uri r1 = com.bytedance.mt.protector.impl.UriProtector.parse(r6)     // Catch: java.lang.Throwable -> L2b
            java.lang.String r0 = "Uri.parse(uri)"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)     // Catch: java.lang.Throwable -> L2b
            boolean r0 = r2.LIZ(r1, r7)     // Catch: java.lang.Throwable -> L2b
            if (r0 != r3) goto L28
        L23:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)     // Catch: java.lang.Throwable -> L2b
            goto L2a
        L28:
            r3 = 0
            goto L23
        L2a:
            return r0
        L2b:
            r0 = move-exception
            java.lang.Throwable r2 = X.AnonymousClass028.LJFF(r0)
            if (r2 == 0) goto L45
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "error occur. "
            r1.append(r0)
            java.lang.String r0 = X.C38386F4s.LIZJ(r2, r4)
            r1.append(r0)
            X.X1D.LIZIZ(r1)
        L45:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            return r0
        L48:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.pumbaa.hybrid.rasp.RaspServiceImpl.LJI(java.lang.String, java.lang.String):java.lang.Boolean");
    }
}
