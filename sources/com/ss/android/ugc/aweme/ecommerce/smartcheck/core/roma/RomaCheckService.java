package com.ss.android.ugc.aweme.ecommerce.smartcheck.core.roma;

import X.C113554cx;
import X.C221108m2;
import X.C35774E2g;
import X.C35775E2h;
import X.C36054EDa;
import X.C36055EDb;
import X.C36056EDc;
import X.C36057EDd;
import X.C48841JEv;
import X.C62822Ol8;
import X.C78613UtF;
import X.C78923UyF;
import X.C84661XKn;
import X.E92;
import X.E94;
import X.EDP;
import X.EDU;
import X.EDV;
import X.EDY;
import X.EDZ;
import X.EnumC36074EDu;
import X.InterfaceC67352kd;
import X.ORZ;
import X.XIA;
import X.XKX;
import com.ss.android.ugc.aweme.ecommerce.smartcheck.core.ISmartCheckService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class RomaCheckService implements ISmartCheckService {
    public final C62822Ol8 LIZ = C221108m2.LIZIZ(C36057EDd.LJLIL);
    public final C62822Ol8 LIZIZ = C221108m2.LIZIZ(EDZ.LJLIL);
    public final C62822Ol8 LIZJ = C221108m2.LIZIZ(C36054EDa.LJLIL);
    public final C62822Ol8 LIZLLL = C221108m2.LIZIZ(C36055EDb.LJLIL);
    public final C62822Ol8 LJ = C221108m2.LIZIZ(C36056EDc.LJLIL);

    @Override // com.ss.android.ugc.aweme.ecommerce.smartcheck.core.ISmartCheckService
    public final C35775E2h getServiceInfo() {
        return new C35775E2h("roma", C35774E2g.LIZ.get("roma"));
    }

    public RomaCheckService() {
        if (EDY.LIZ().getEnable()) {
            for (RomaCheckRule romaCheckRule : EDY.LIZ().getRules()) {
                if (!((Map) this.LIZIZ.getValue()).containsKey(romaCheckRule.getMainKey())) {
                    ((Map) this.LIZIZ.getValue()).put(romaCheckRule.getMainKey(), new ArrayList());
                }
                List list = (List) ((Map) this.LIZIZ.getValue()).get(romaCheckRule.getMainKey());
                if (list != null) {
                    list.add(romaCheckRule);
                }
                ((Set) this.LIZJ.getValue()).add(Integer.valueOf(romaCheckRule.getPatternId()));
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.smartcheck.core.ISmartCheckService
    public final Object LIZ(E92 e92) {
        RomaPattern romaPattern;
        if (!EDY.LIZ().getEnable()) {
            return Boolean.FALSE;
        }
        RomaCheckRule LJ = LJ(e92);
        if (LJ != null) {
            int patternId = LJ.getPatternId();
            romaPattern = (RomaPattern) ((ConcurrentHashMap) this.LIZLLL.getValue()).get(Integer.valueOf(patternId));
            if (romaPattern == null) {
                romaPattern = (RomaPattern) ((ConcurrentHashMap) this.LJ.getValue()).get(Integer.valueOf(patternId));
            }
        } else {
            romaPattern = null;
        }
        boolean z = false;
        if (romaPattern != null) {
            RomaCheckRule LJ2 = LJ(e92);
            ArrayList arrayList = new ArrayList();
            if (LJ2 != null) {
                String mainKey = LJ2.getMainKey();
                if (mainKey != null) {
                    arrayList.add(mainKey);
                }
                List<String> moreKeys = LJ2.getMoreKeys();
                if (moreKeys != null) {
                    arrayList.addAll(moreKeys);
                }
            }
            e92.LIZIZ = ORZ.LLD(arrayList, ".", null, null, null, 62);
            EDP edp = new EDP(getServiceInfo().LIZ);
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            List<RomaPatternKey> keys = romaPattern.getKeys();
            if (keys != null) {
                for (RomaPatternKey romaPatternKey : keys) {
                    linkedHashSet.add(romaPatternKey.getKey());
                    C78923UyF.LJFF(romaPatternKey, e92, edp, null, null);
                }
            }
            E94 e94 = e92.LIZLLL;
            e94.getClass();
            LinkedHashMap linkedHashMap = (LinkedHashMap) C113554cx.LJJLIL(e94.LIZIZ("default"));
            linkedHashMap.keySet().removeAll(linkedHashSet);
            Iterator it = linkedHashMap.keySet().iterator();
            while (it.hasNext()) {
                edp.LIZIZ((String) it.next(), EnumC36074EDu.REDUNDANT, false);
            }
            ((List) e92.LJFF.getValue()).add(edp.LIZ());
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.smartcheck.core.ISmartCheckService
    public final boolean LIZIZ(E92 info) {
        o.LJIIIZ(info, "info");
        if (LJ(info) != null) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.smartcheck.core.ISmartCheckService
    public final Object LIZJ(InterfaceC67352kd<? super Boolean> interfaceC67352kd) {
        if (!EDY.LIZ().getEnable()) {
            return Boolean.FALSE;
        }
        XIA xia = C78613UtF.LIZJ;
        C84661XKn LIZIZ = XKX.LIZIZ(C48841JEv.LIZ(xia), null, null, new EDU(this, null), 3);
        XKX.LIZLLL(C48841JEv.LIZ(xia), null, null, new EDV(this, null), 3);
        return LIZIZ.LJJIJ(interfaceC67352kd);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZLLL(X.InterfaceC67352kd<? super X.C76800UCe> r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof X.EDW
            if (r0 == 0) goto Lad
            r7 = r9
            X.EDW r7 = (X.EDW) r7
            int r2 = r7.LJLJJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto Lad
            int r2 = r2 - r1
            r7.LJLJJI = r2
        L12:
            java.lang.Object r6 = r7.LJLILLLLZI
            X.NAu r5 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r7.LJLJJI
            java.lang.String r4 = "roma"
            java.lang.String r2 = "message"
            r3 = 1
            if (r0 == 0) goto L7d
            if (r0 != r3) goto Lb4
            com.ss.android.ugc.aweme.ecommerce.smartcheck.core.roma.RomaCheckService r3 = r7.LJLIL
            X.C141335gf.LIZJ(r6)
        L26:
            java.util.List r6 = (java.util.List) r6
            if (r6 == 0) goto L4c
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "fetch remote: "
            r1.append(r0)
            int r0 = r6.size()
            r1.append(r0)
            java.lang.String r0 = X.X1D.LIZIZ(r1)
            kotlin.jvm.internal.o.LJIIIZ(r0, r2)
            X.Ol8 r0 = r3.LIZLLL
            java.lang.Object r0 = r0.getValue()
            java.util.concurrent.ConcurrentHashMap r0 = (java.util.concurrent.ConcurrentHashMap) r0
            r3.LJI(r0, r6)
        L4c:
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            r1.append(r4)
            java.lang.String r0 = " finish fetch"
            r1.append(r0)
            java.lang.String r0 = X.X1D.LIZIZ(r1)
            kotlin.jvm.internal.o.LJIIIZ(r0, r2)
            X.Ol8 r0 = r3.LIZLLL
            java.lang.Object r0 = r0.getValue()
            java.util.concurrent.ConcurrentHashMap r0 = (java.util.concurrent.ConcurrentHashMap) r0
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L7a
            X.Ol8 r0 = r3.LJ
            java.lang.Object r0 = r0.getValue()
            java.util.concurrent.ConcurrentHashMap r0 = (java.util.concurrent.ConcurrentHashMap) r0
            r0.clear()
        L7a:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L7d:
            X.C141335gf.LIZJ(r6)
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            r1.append(r4)
            java.lang.String r0 = " start fetch"
            r1.append(r0)
            java.lang.String r0 = X.X1D.LIZIZ(r1)
            kotlin.jvm.internal.o.LJIIIZ(r0, r2)
            X.Ol8 r0 = r8.LIZLLL
            java.lang.Object r0 = r0.getValue()
            java.util.concurrent.ConcurrentHashMap r0 = (java.util.concurrent.ConcurrentHashMap) r0
            r0.clear()
            r7.LJLIL = r8
            r7.LJLJJI = r3
            r0 = 0
            java.lang.Object r6 = X.C36058EDe.LIZ(r0, r7)
            if (r6 != r5) goto Laa
            return r5
        Laa:
            r3 = r8
            goto L26
        Lad:
            X.EDW r7 = new X.EDW
            r7.<init>(r8, r9)
            goto L12
        Lb4:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.smartcheck.core.roma.RomaCheckService.LIZLLL(X.2kd):java.lang.Object");
    }

    public final RomaCheckRule LJ(E92 e92) {
        List list = (List) ((Map) this.LIZIZ.getValue()).get(e92.LIZJ);
        Object obj = null;
        if (list == null) {
            return null;
        }
        for (Object obj2 : list) {
            RomaCheckRule romaCheckRule = (RomaCheckRule) obj2;
            List<String> moreKeys = romaCheckRule.getMoreKeys();
            if (moreKeys == null || moreKeys.isEmpty() || ((Set) e92.LJ.getValue()).containsAll(romaCheckRule.getMoreKeys())) {
                obj = obj2;
                break;
            }
        }
        return (RomaCheckRule) obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJFF(X.InterfaceC67352kd<? super X.C76800UCe> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof X.EDX
            if (r0 == 0) goto L6c
            r5 = r7
            X.EDX r5 = (X.EDX) r5
            int r2 = r5.LJLJJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L6c
            int r2 = r2 - r1
            r5.LJLJJI = r2
        L12:
            java.lang.Object r4 = r5.LJLILLLLZI
            X.NAu r3 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r5.LJLJJI
            r2 = 1
            if (r0 == 0) goto L4d
            if (r0 != r2) goto L72
            com.ss.android.ugc.aweme.ecommerce.smartcheck.core.roma.RomaCheckService r2 = r5.LJLIL
            X.C141335gf.LIZJ(r4)
        L22:
            java.util.List r4 = (java.util.List) r4
            if (r4 == 0) goto L4a
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "fetch cache: "
            r1.append(r0)
            int r0 = r4.size()
            r1.append(r0)
            java.lang.String r1 = X.X1D.LIZIZ(r1)
            java.lang.String r0 = "message"
            kotlin.jvm.internal.o.LJIIIZ(r1, r0)
            X.Ol8 r0 = r2.LJ
            java.lang.Object r0 = r0.getValue()
            java.util.concurrent.ConcurrentHashMap r0 = (java.util.concurrent.ConcurrentHashMap) r0
            r2.LJI(r0, r4)
        L4a:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L4d:
            X.C141335gf.LIZJ(r4)
            X.Ol8 r0 = r6.LIZ
            java.lang.Object r1 = r0.getValue()
            java.util.concurrent.atomic.AtomicBoolean r1 = (java.util.concurrent.atomic.AtomicBoolean) r1
            r0 = 0
            boolean r0 = r1.compareAndSet(r0, r2)
            if (r0 == 0) goto L4a
            r5.LJLIL = r6
            r5.LJLJJI = r2
            java.lang.Object r4 = X.C36058EDe.LIZ(r2, r5)
            if (r4 != r3) goto L6a
            return r3
        L6a:
            r2 = r6
            goto L22
        L6c:
            X.EDX r5 = new X.EDX
            r5.<init>(r6, r7)
            goto L12
        L72:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.smartcheck.core.roma.RomaCheckService.LJFF(X.2kd):java.lang.Object");
    }

    public final void LJI(ConcurrentHashMap concurrentHashMap, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            RomaPattern romaPattern = (RomaPattern) it.next();
            if (((Set) this.LIZJ.getValue()).contains(Integer.valueOf(romaPattern.getId()))) {
                concurrentHashMap.put(Integer.valueOf(romaPattern.getId()), romaPattern);
            }
        }
    }
}
