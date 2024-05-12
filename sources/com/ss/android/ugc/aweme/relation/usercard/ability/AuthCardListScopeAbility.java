package com.ss.android.ugc.aweme.relation.usercard.ability;

import X.AYY;
import X.AbstractC27771Av9;
import X.AbstractC57896Mns;
import X.C113554cx;
import X.C162476Zf;
import X.C221108m2;
import X.C25600zU;
import X.C27484AqW;
import X.C47261Igj;
import X.C51029K0z;
import X.C52926Kpu;
import X.C57580Mim;
import X.C57778Mly;
import X.C57819Mmd;
import X.C57859MnH;
import X.C57888Mnk;
import X.C57889Mnl;
import X.C57898Mnu;
import X.C57900Mnw;
import X.C57962Mow;
import X.C57989MpN;
import X.C57991MpP;
import X.C57992MpQ;
import X.C57993MpR;
import X.C57994MpS;
import X.C57996MpU;
import X.C57997MpV;
import X.C58000MpY;
import X.C58015Mpn;
import X.C58017Mpp;
import X.C62822Ol8;
import X.C73318Sq2;
import X.C73542Ste;
import X.C73674Svm;
import X.C73969T1h;
import X.C76800UCe;
import X.C77266UUc;
import X.C78605Ut7;
import X.C78613UtF;
import X.C78685UuP;
import X.C78999UzT;
import X.EnumC58046MqI;
import X.EnumC77147UPn;
import X.HG3;
import X.InterfaceC57927MoN;
import X.InterfaceC65784Pro;
import X.InterfaceC70422pa;
import X.InterfaceC88472Yns;
import X.L7X;
import X.MSJ;
import X.ORZ;
import X.RBX;
import X.T3Q;
import X.UPC;
import X.UTK;
import X.X1D;
import X.XIA;
import X.XKW;
import X.XKX;
import Y.AfS65S0100000_13;
import androidx.lifecycle.LifecycleOwnerKt;
import com.ss.android.ugc.aweme.relation.model.RecUser;
import com.ss.android.ugc.aweme.relation.usercard.vm.UserCardListViewModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS156S0200000_9;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.AqS175S0100000_9;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class AuthCardListScopeAbility implements IAuthCardListScopeAbility {
    public static final /* synthetic */ int LJLZ = 0;
    public final InterfaceC65784Pro<C57859MnH> LJLIL;
    public final InterfaceC70422pa LJLILLLLZI;
    public final C57962Mow LJLJI;
    public final IUserCardListAbility LJLJJI;
    public final InterfaceC65784Pro<C76800UCe> LJLJJL;
    public final InterfaceC88472Yns<Integer, C76800UCe> LJLJJLL;
    public final InterfaceC65784Pro<C76800UCe> LJLJL;
    public final InterfaceC65784Pro<C57778Mly> LJLJLJ;
    public final InterfaceC88472Yns<List<? extends EnumC58046MqI>, C76800UCe> LJLJLLL;
    public final String LJLL;
    public final XKW LJLLI;
    public final C73318Sq2 LJLLILLLL;
    public final C62822Ol8 LJLLJ;
    public final C62822Ol8 LJLLL;
    public final Map<EnumC58046MqI, Integer> LJLLLL;
    public final Map<EnumC58046MqI, Boolean> LJLLLLLL;

    public AuthCardListScopeAbility() {
        throw null;
    }

    public final C57859MnH getConfig() {
        return this.LJLIL.invoke();
    }

    @Override // com.ss.android.ugc.aweme.relation.usercard.ability.IAuthCardListScopeAbility
    public final void onCleared() {
        this.LJLLILLLL.LIZLLL();
    }

    public final AbstractC57896Mns LIZ() {
        return getConfig().getListConfig().LJ;
    }

    public final boolean LIZJ() {
        return C27484AqW.LJFF(C57898Mnu.LIZLLL(getConfig()));
    }

    public final void LJII(EnumC58046MqI enumC58046MqI, boolean z) {
        List<? extends EnumC58046MqI> LLJILJILJ = ORZ.LLJILJILJ(getConfig().getApiConfig().LJ);
        ArrayList arrayList = (ArrayList) LLJILJILJ;
        if (!arrayList.contains(enumC58046MqI)) {
            arrayList.add(enumC58046MqI);
            this.LJLJLLL.invoke(LLJILJILJ);
        }
        this.LJLJJL.invoke();
        this.LJLJJI.W7(new C57997MpV(z, this, enumC58046MqI));
        AYY ayy = AYY.LIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("refresh by ");
        LIZ.append(enumC58046MqI);
        String LIZIZ = X1D.LIZIZ(LIZ);
        ayy.getClass();
        AYY.LIZIZ("AuthAbility", LIZIZ);
    }

    @Override // com.ss.android.ugc.aweme.relation.usercard.ability.IAuthCardListScopeAbility
    public final void Mj0(EnumC58046MqI platform, AqS156S0200000_9 aqS156S0200000_9) {
        Class<? extends UPC> LJJIJIIJI;
        o.LJIIIZ(platform, "platform");
        int i = C58000MpY.LIZ[platform.ordinal()];
        if (i != 1) {
            if (i == 2) {
                LJJIJIIJI = C77266UUc.LIZIZ.LJIIJJI();
            } else {
                throw new C162476Zf();
            }
        } else {
            LJJIJIIJI = C77266UUc.LIZIZ.LJJIJIIJI();
        }
        if (C52926Kpu.LIZ()) {
            XKX.LIZLLL(LifecycleOwnerKt.getLifecycleScope(C57898Mnu.LIZLLL(getConfig())), null, null, new C57993MpR(this, platform, aqS156S0200000_9, null), 3);
            return;
        }
        C25600zU LJIIIIZZ = C78605Ut7.LJIIIIZZ(C57898Mnu.LIZIZ(getConfig()));
        String curUserId = ((RBX) HG3.LJIILL()).getCurUserId();
        if (curUserId == null) {
            curUserId = "";
        }
        String str = getConfig().getTrackerConfig().LIZ;
        C57819Mmd trackerConfig = getConfig().getTrackerConfig();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("from_myself", this.LJLL);
        String str2 = trackerConfig.LJFF;
        if (C78685UuP.LJJJZ(str2) && str2 != null) {
            linkedHashMap.put("position", str2);
        }
        if (linkedHashMap.isEmpty()) {
            linkedHashMap = null;
        }
        C78999UzT.LJFF(T3Q.LIZIZ(LJIIIIZZ, LJJIJIIJI, curUserId, str, "click", true, linkedHashMap).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS65S0100000_13(aqS156S0200000_9, 170), C73674Svm.LIZLLL), this.LJLLILLLL);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(int r9, X.EnumC58046MqI r10, X.InterfaceC67352kd<? super X.C76800UCe> r11) {
        /*
            Method dump skipped, instructions count: 267
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.relation.usercard.ability.AuthCardListScopeAbility.LIZIZ(int, X.MqI, X.2kd):java.lang.Object");
    }

    public final void LJ(EnumC58046MqI enumC58046MqI, boolean z, boolean z2) {
        getConfig().getApiConfig().LJIILLIIL = true;
        XKX.LIZLLL(this.LJLILLLLZI, this.LJLLI, null, new C57991MpP(this, enumC58046MqI, z, z2, null), 2);
    }

    public final void LIZLLL(EnumC58046MqI enumC58046MqI, boolean z, boolean z2, boolean z3) {
        boolean z4;
        AYY ayy = AYY.LIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("on ");
        LIZ.append(enumC58046MqI);
        LIZ.append(" checked, isGrant: ");
        LIZ.append(z);
        LIZ.append(", willUpload: ");
        LIZ.append(z3);
        String LIZIZ = X1D.LIZIZ(LIZ);
        ayy.getClass();
        AYY.LIZIZ("AuthAbility", LIZIZ);
        this.LJLLLL.remove(enumC58046MqI);
        if (!z) {
            if (!o.LJ(((LinkedHashMap) this.LJLLLLLL).get(enumC58046MqI), Boolean.valueOf(z))) {
                this.LJLJI.LJJIFFI();
                return;
            }
            return;
        }
        int i = 0;
        if ((LIZ() instanceof C57888Mnk) || (LIZ() instanceof C57889Mnl)) {
            z4 = true;
        } else {
            z4 = false;
        }
        Iterator<InterfaceC57927MoN> it = this.LJLJI.iterator();
        int i2 = 0;
        while (true) {
            if (it.hasNext()) {
                InterfaceC57927MoN next = it.next();
                if ((next instanceof C57900Mnw) && ((C57900Mnw) next).LJLIL == enumC58046MqI) {
                    break;
                } else {
                    i2++;
                }
            } else {
                i2 = -1;
                break;
            }
        }
        if (i2 != -1) {
            this.LJLLLL.put(enumC58046MqI, Integer.valueOf(i2));
            List<InterfaceC57927MoN> LJIILLIIL = this.LJLJI.LJIILLIIL();
            if (!(LJIILLIIL instanceof Collection) || !LJIILLIIL.isEmpty()) {
                i = 0;
                for (InterfaceC57927MoN interfaceC57927MoN : LJIILLIIL) {
                    if ((interfaceC57927MoN instanceof RecUser) || (interfaceC57927MoN instanceof C57900Mnw) || ((interfaceC57927MoN instanceof AbstractC27771Av9) && !((AbstractC27771Av9) interfaceC57927MoN).LJLJI)) {
                        i++;
                        if (i < 0) {
                            C47261Igj.LJJJJIZL();
                            throw null;
                        }
                    }
                }
            }
            if (!z4 || i != 1) {
                this.LJLJI.LJIIIIZZ(i2);
            }
        }
        boolean z5 = LIZ() instanceof C58017Mpp;
        if (z3 || z2 || z5) {
            return;
        }
        XKX.LIZLLL(this.LJLILLLLZI, this.LJLLI, null, new C57992MpQ(enumC58046MqI, this, LIZJ(), null), 2);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:1|(2:3|(9:5|6|7|(1:(1:(1:(7:12|13|14|(2:16|(6:18|(1:20)|21|(2:23|(1:28))(1:29)|25|26))|30|25|26)(2:31|32))(7:33|34|35|(1:37)|30|25|26))(2:39|40))(2:56|(2:63|64)(2:59|(1:61)(1:62)))|41|(1:(2:44|(4:46|(1:48)|14|(0)))(2:49|50))(2:51|(4:53|(1:55)|35|(0)))|30|25|26))|67|6|7|(0)(0)|41|(0)(0)|30|25|26) */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00c2, code lost:
    
        if (r8.isEmpty() == false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00ef, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00f0, code lost:
    
        r2 = X.AYY.LIZ;
        r1 = X.X1D.LIZ();
        r1.append("route ffp(");
        r1.append(r12);
        r1.append(") error");
        r1 = X.X1D.LIZIZ(r1);
        r2.getClass();
        X.AYY.LIZ("AuthAbility", r1, r3);
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0091 A[Catch: all -> 0x00ef, TryCatch #0 {all -> 0x00ef, blocks: (B:13:0x008a, B:14:0x008d, B:16:0x0091, B:18:0x0097, B:21:0x00d2, B:28:0x0115, B:29:0x00e5, B:30:0x00c4, B:34:0x00b7, B:35:0x00ba, B:37:0x00be, B:40:0x0061, B:41:0x0064, B:44:0x0077, B:46:0x007d, B:49:0x009e, B:50:0x00a3, B:51:0x00a4, B:53:0x00aa, B:59:0x004b), top: B:7:0x001c }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00be A[Catch: all -> 0x00ef, TryCatch #0 {all -> 0x00ef, blocks: (B:13:0x008a, B:14:0x008d, B:16:0x0091, B:18:0x0097, B:21:0x00d2, B:28:0x0115, B:29:0x00e5, B:30:0x00c4, B:34:0x00b7, B:35:0x00ba, B:37:0x00be, B:40:0x0061, B:41:0x0064, B:44:0x0077, B:46:0x007d, B:49:0x009e, B:50:0x00a3, B:51:0x00a4, B:53:0x00aa, B:59:0x004b), top: B:7:0x001c }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00a4 A[Catch: all -> 0x00ef, TryCatch #0 {all -> 0x00ef, blocks: (B:13:0x008a, B:14:0x008d, B:16:0x0091, B:18:0x0097, B:21:0x00d2, B:28:0x0115, B:29:0x00e5, B:30:0x00c4, B:34:0x00b7, B:35:0x00ba, B:37:0x00be, B:40:0x0061, B:41:0x0064, B:44:0x0077, B:46:0x007d, B:49:0x009e, B:50:0x00a3, B:51:0x00a4, B:53:0x00aa, B:59:0x004b), top: B:7:0x001c }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIIIZZ(boolean r10, boolean r11, X.EnumC58046MqI r12, X.InterfaceC67352kd<? super X.C76800UCe> r13) {
        /*
            Method dump skipped, instructions count: 287
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.relation.usercard.ability.AuthCardListScopeAbility.LJIIIIZZ(boolean, boolean, X.MqI, X.2kd):java.lang.Object");
    }

    public AuthCardListScopeAbility(AqS159S0100000_9 aqS159S0100000_9, InterfaceC70422pa assemScope, C57962Mow source, IUserCardListAbility listAbility, AqS159S0100000_9 aqS159S0100000_92, L7X l7x, C57989MpN c57989MpN, AqS159S0100000_9 aqS159S0100000_93, AqS175S0100000_9 aqS175S0100000_9) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AuthCard_");
        LIZ.append(((UserCardListViewModel) aqS159S0100000_9.l0).LJLIL.hashCode());
        String sign = X1D.LIZIZ(LIZ);
        XIA ioDispatcher = C78613UtF.LIZJ;
        o.LJIIIZ(assemScope, "assemScope");
        o.LJIIIZ(source, "source");
        o.LJIIIZ(listAbility, "listAbility");
        o.LJIIIZ(sign, "sign");
        o.LJIIIZ(ioDispatcher, "ioDispatcher");
        this.LJLIL = aqS159S0100000_9;
        this.LJLILLLLZI = assemScope;
        this.LJLJI = source;
        this.LJLJJI = listAbility;
        this.LJLJJL = aqS159S0100000_92;
        this.LJLJJLL = l7x;
        this.LJLJL = c57989MpN;
        this.LJLJLJ = aqS159S0100000_93;
        this.LJLJLLL = aqS175S0100000_9;
        this.LJLL = sign;
        this.LJLLI = ioDispatcher;
        this.LJLLILLLL = new C73318Sq2();
        this.LJLLJ = C221108m2.LIZIZ(C58015Mpn.LJLIL);
        this.LJLLL = C221108m2.LIZIZ(C57580Mim.LJLIL);
        this.LJLLLL = new LinkedHashMap();
        EnumC58046MqI[] values = EnumC58046MqI.values();
        int LJJIIZ = C51029K0z.LJJIIZ(values.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(LJJIIZ < 16 ? 16 : LJJIIZ);
        int i = 0;
        for (EnumC58046MqI enumC58046MqI : values) {
            linkedHashMap.put(enumC58046MqI, Boolean.valueOf(enumC58046MqI.isGrant()));
        }
        this.LJLLLLLL = C113554cx.LJJLIL(linkedHashMap);
        if (LIZ() instanceof MSJ) {
            return;
        }
        if (C52926Kpu.LIZ()) {
            EnumC77147UPn[] values2 = EnumC77147UPn.values();
            int length = values2.length;
            while (i < length) {
                XKX.LIZLLL(this.LJLILLLLZI, null, null, new C57994MpS(values2[i], this, null), 3);
                i++;
            }
            return;
        }
        EnumC58046MqI[] values3 = EnumC58046MqI.values();
        int length2 = values3.length;
        while (i < length2) {
            EnumC58046MqI enumC58046MqI2 = values3[i];
            C78999UzT.LJFF(C73542Ste.LJIIIIZZ(UTK.LIZIZ.LJFF(enumC58046MqI2).LIZIZ().LJJJ(C73969T1h.LIZIZ()), null, null, new C57996MpU(this, enumC58046MqI2), 3), this.LJLLILLLL);
            i++;
        }
    }
}
