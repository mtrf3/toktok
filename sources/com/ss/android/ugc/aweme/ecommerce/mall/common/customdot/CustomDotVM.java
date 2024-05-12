package com.ss.android.ugc.aweme.ecommerce.mall.common.customdot;

import X.C36265ELd;
import X.C36266ELe;
import X.C56126M1a;
import X.C76800UCe;
import X.C78565UsT;
import X.EC0;
import X.InterfaceC56128M1c;
import X.InterfaceC88471Ynr;
import X.M0Y;
import X.M13;
import X.M18;
import X.MBB;
import X.X1D;
import X.XJL;
import X.XKQ;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class CustomDotVM extends AssemViewModel<M13> {
    public static final /* synthetic */ int LJLLL = 0;
    public Notice LJLIL;
    public Notice LJLILLLLZI;
    public InterfaceC56128M1c LJLJI;
    public C56126M1a LJLJJI;
    public boolean LJLJJL;
    public XJL<? super C76800UCe> LJLJJLL;
    public XJL<? super C76800UCe> LJLJL;
    public XJL<? super C76800UCe> LJLJLJ;
    public M18 LJLJLLL;
    public CustomDotResponse LJLL;
    public final Map<String, Boolean> LJLLI = new LinkedHashMap();
    public boolean LJLLILLLL = true;
    public int LJLLJ = -1;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final M13 defaultState() {
        return new M13(0);
    }

    public final List<BasicInfo> gv0(List<BasicInfo> list) {
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        Iterator it = ((ArrayList) list).iterator();
        while (it.hasNext()) {
            Object next = it.next();
            BasicInfo basicInfo = (BasicInfo) next;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(basicInfo.getGroup());
            LIZ.append('-');
            LIZ.append(basicInfo.getId());
            if (hashSet.add(X1D.LIZIZ(LIZ))) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    public final List<BasicInfo> jv0(List<BasicInfo> list, List<BasicInfo> list2) {
        ArrayList arrayList = null;
        if (list != null) {
            arrayList = new ArrayList();
            for (BasicInfo basicInfo : list) {
                BasicInfo basicInfo2 = basicInfo;
                if (list2 != null) {
                    Iterator<BasicInfo> it = list2.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        BasicInfo next = it.next();
                        BasicInfo basicInfo3 = next;
                        if (o.LJ(basicInfo3.getId(), basicInfo2.getId()) && basicInfo3.getGroup() == basicInfo2.getGroup()) {
                            if (next == null) {
                            }
                        }
                    }
                }
                arrayList.add(basicInfo);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mv0(android.graphics.Bitmap r7, X.InterfaceC67352kd<? super X.C76800UCe> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof X.C56102M0c
            if (r0 == 0) goto L50
            r5 = r8
            X.M0c r5 = (X.C56102M0c) r5
            int r2 = r5.LJLJJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L50
            int r2 = r2 - r1
            r5.LJLJJI = r2
        L12:
            java.lang.Object r1 = r5.LJLILLLLZI
            X.NAu r4 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r5.LJLJJI
            r3 = 0
            r2 = 1
            if (r0 == 0) goto L28
            if (r0 != r2) goto L56
            com.ss.android.ugc.aweme.ecommerce.mall.common.customdot.CustomDotVM r0 = r5.LJLIL
            X.C141335gf.LIZJ(r1)
        L23:
            r0.LJLJLJ = r3
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L28:
            X.C141335gf.LIZJ(r1)
            kotlin.jvm.internal.AqS175S0100000_9 r1 = new kotlin.jvm.internal.AqS175S0100000_9
            r0 = 476(0x1dc, float:6.67E-43)
            r1.<init>(r7, r0)
            r6.setState(r1)
            kotlin.jvm.internal.AqS175S0100000_9 r1 = new kotlin.jvm.internal.AqS175S0100000_9
            r0 = 46
            r1.<init>(r6, r0)
            r5.LJLIL = r6
            r5.LJLJJI = r2
            X.2kX r2 = new X.2kX
            r2.<init>(r1, r3)
            r0 = 2000(0x7d0, double:9.88E-321)
            java.lang.Object r0 = X.C74209TAn.LIZJ(r0, r2, r5)
            if (r0 != r4) goto L4e
            return r4
        L4e:
            r0 = r6
            goto L23
        L50:
            X.M0c r5 = new X.M0c
            r5.<init>(r6, r8)
            goto L12
        L56:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.mall.common.customdot.CustomDotVM.mv0(android.graphics.Bitmap, X.2kd):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object nv0(android.graphics.Bitmap r7, X.InterfaceC67352kd<? super X.C76800UCe> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof X.C56103M0d
            if (r0 == 0) goto L50
            r5 = r8
            X.M0d r5 = (X.C56103M0d) r5
            int r2 = r5.LJLJJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L50
            int r2 = r2 - r1
            r5.LJLJJI = r2
        L12:
            java.lang.Object r1 = r5.LJLILLLLZI
            X.NAu r4 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r5.LJLJJI
            r3 = 0
            r2 = 1
            if (r0 == 0) goto L28
            if (r0 != r2) goto L56
            com.ss.android.ugc.aweme.ecommerce.mall.common.customdot.CustomDotVM r0 = r5.LJLIL
            X.C141335gf.LIZJ(r1)
        L23:
            r0.LJLJL = r3
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L28:
            X.C141335gf.LIZJ(r1)
            kotlin.jvm.internal.AqS175S0100000_9 r1 = new kotlin.jvm.internal.AqS175S0100000_9
            r0 = 477(0x1dd, float:6.68E-43)
            r1.<init>(r7, r0)
            r6.setState(r1)
            kotlin.jvm.internal.AqS175S0100000_9 r1 = new kotlin.jvm.internal.AqS175S0100000_9
            r0 = 47
            r1.<init>(r6, r0)
            r5.LJLIL = r6
            r5.LJLJJI = r2
            X.2kX r2 = new X.2kX
            r2.<init>(r1, r3)
            r0 = 2000(0x7d0, double:9.88E-321)
            java.lang.Object r0 = X.C74209TAn.LIZJ(r0, r2, r5)
            if (r0 != r4) goto L4e
            return r4
        L4e:
            r0 = r6
            goto L23
        L50:
            X.M0d r5 = new X.M0d
            r5.<init>(r6, r8)
            goto L12
        L56:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.mall.common.customdot.CustomDotVM.nv0(android.graphics.Bitmap, X.2kd):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object ov0(X.M18 r7, X.InterfaceC67352kd<? super java.lang.Boolean> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof X.C56101M0b
            if (r0 == 0) goto L5b
            r5 = r8
            X.M0b r5 = (X.C56101M0b) r5
            int r2 = r5.LJLJJL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L5b
            int r2 = r2 - r1
            r5.LJLJJL = r2
        L12:
            java.lang.Object r1 = r5.LJLJI
            X.NAu r4 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r5.LJLJJL
            r3 = 0
            r2 = 1
            if (r0 == 0) goto L2f
            if (r0 != r2) goto L61
            X.M18 r7 = r5.LJLILLLLZI
            com.ss.android.ugc.aweme.ecommerce.mall.common.customdot.CustomDotVM r0 = r5.LJLIL
            X.C141335gf.LIZJ(r1)
        L25:
            r0.LJLJJLL = r3
            java.lang.String r0 = "=======inboxPopup dismissed==="
            X.C36266ELe.LIZ(r7, r0)
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            return r0
        L2f:
            X.C141335gf.LIZJ(r1)
            boolean r0 = r6.LJLJJL
            if (r0 != 0) goto L39
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            return r0
        L39:
            java.lang.String r0 = "=======wait inboxPopup dismiss==="
            X.C36266ELe.LIZ(r7, r0)
            kotlin.jvm.internal.AqS175S0100000_9 r1 = new kotlin.jvm.internal.AqS175S0100000_9
            r0 = 48
            r1.<init>(r6, r0)
            r5.LJLIL = r6
            r5.LJLILLLLZI = r7
            r5.LJLJJL = r2
            X.2kX r2 = new X.2kX
            r2.<init>(r1, r3)
            r0 = 5000(0x1388, double:2.4703E-320)
            java.lang.Object r0 = X.C74209TAn.LIZJ(r0, r2, r5)
            if (r0 != r4) goto L59
            return r4
        L59:
            r0 = r6
            goto L25
        L5b:
            X.M0b r5 = new X.M0b
            r5.<init>(r6, r8)
            goto L12
        L61:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.mall.common.customdot.CustomDotVM.ov0(X.M18, X.2kd):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object hv0(X.M18 r6, X.M18 r7, X.InterfaceC67352kd<? super X.C76800UCe> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof X.C56104M0e
            if (r0 == 0) goto L5f
            r3 = r8
            X.M0e r3 = (X.C56104M0e) r3
            int r2 = r3.LJLJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L5f
            int r2 = r2 - r1
            r3.LJLJI = r2
        L12:
            java.lang.Object r1 = r3.LJLIL
            X.NAu r2 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r3.LJLJI
            r4 = 1
            if (r0 == 0) goto L23
            if (r0 != r4) goto L65
            X.C141335gf.LIZJ(r1)
        L20:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L23:
            X.C141335gf.LIZJ(r1)
            if (r7 == 0) goto L20
            X.M0Y r1 = r7.LIZIZ
            X.M0Y r0 = X.M0Y.ICON_UPDATE_START
            if (r1 == r0) goto L3a
            X.M0Y r0 = X.M0Y.ICON_SHOW_ANIMATION_START
            if (r1 == r0) goto L3a
            X.M0Y r0 = X.M0Y.ICON_STAY_START
            if (r1 == r0) goto L3a
            X.M0Y r0 = X.M0Y.ICON_HIDE_ANIMATION_START
            if (r1 != r0) goto L20
        L3a:
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "cancel old red dot show process："
            r1.append(r0)
            X.M0Y r0 = r7.LIZIZ
            r1.append(r0)
            java.lang.String r0 = X.X1D.LIZIZ(r1)
            X.C36266ELe.LIZ(r6, r0)
            X.XKQ r0 = r7.LIZJ
            if (r0 == 0) goto L20
            r3.getClass()
            r3.LJLJI = r4
            java.lang.Object r0 = X.C79146V4k.LJIJI(r0, r3)
            if (r0 != r2) goto L20
            return r2
        L5f:
            X.M0e r3 = new X.M0e
            r3.<init>(r5, r8)
            goto L12
        L65:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.mall.common.customdot.CustomDotVM.hv0(X.M18, X.M18, X.2kd):java.lang.Object");
    }

    public final void lv0(InterfaceC88471Ynr interfaceC88471Ynr, boolean z, boolean z2) {
        long j;
        XKQ LJJIJIIJI;
        boolean z3 = this.LJLLILLLL;
        this.LJLLILLLL = false;
        M18 m18 = this.LJLJLLL;
        M18 m182 = new M18();
        if (m18 != null) {
            j = m18.LIZ;
        } else {
            j = 0;
        }
        m182.LIZ = j + 1;
        m182.LIZLLL = z3;
        M0Y m0y = M0Y.API_REQUEST_START;
        m182.LIZ(m0y);
        m182.LJ = z2;
        this.LJLJLLL = m182;
        if (m18 != null && m18.LIZIZ == m0y) {
            if (m18.LIZLLL || m18.LJ) {
                m18.LJFF = true;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("mark old job：isColdStart:");
                LIZ.append(m18.LIZLLL);
                LIZ.append("，isClick:");
                LIZ.append(m18.LJ);
                C36266ELe.LIZ(m182, X1D.LIZIZ(LIZ));
            } else {
                XKQ xkq = m18.LIZJ;
                if (xkq != null) {
                    xkq.LIZIZ(null);
                }
                C36266ELe.LIZ(m182, "old api request are canceled");
            }
        }
        LJJIJIIJI = C78565UsT.LJJIJIIJI(this, MBB.INSTANCE, new C36265ELd(m182, interfaceC88471Ynr, z3, this, m18, z2, z, null));
        m182.LIZJ = LJJIJIIJI;
    }

    public final void iv0(IconCfg iconCfg, IconCfg iconCfg2, CountCfg countCfg, CountCfg countCfg2, boolean z) {
        C78565UsT.LJJIJIIJI(this, MBB.INSTANCE, new EC0(this, iconCfg, iconCfg2, countCfg, countCfg2, z, null));
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0668, code lost:
    
        if (r4 == 0) goto L252;
     */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x01a2, code lost:
    
        if (r14 == null) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:214:0x01a6, code lost:
    
        if (r14 == null) goto L95;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:7:0x0023. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0536 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0659  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x00fe A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0565  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0671  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0361  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x03ad  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0432  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0461  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0496  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x04d2  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0537  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x064a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x059c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x05a4  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x03ac A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x03e8  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0460 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0480  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x04d1 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object kv0(com.ss.android.ugc.aweme.ecommerce.mall.common.customdot.CustomDotResponse r29, boolean r30, X.M18 r31, X.M18 r32, X.InterfaceC67352kd<? super X.C76800UCe> r33) {
        /*
            Method dump skipped, instructions count: 1728
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.mall.common.customdot.CustomDotVM.kv0(com.ss.android.ugc.aweme.ecommerce.mall.common.customdot.CustomDotResponse, boolean, X.M18, X.M18, X.2kd):java.lang.Object");
    }
}
