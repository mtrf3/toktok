package X;

import com.bytedance.ies.ugc.aweme.network.NetworkService;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.im.sdk.common.data.model.RecommendationRequestBody;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.2ze, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C76662ze implements InterfaceC72972th {
    public static volatile boolean LJLILLLLZI;
    public static final C76662ze LJLIL = new C76662ze();
    public static final C62822Ol8 LJLJI = C221108m2.LIZIZ(C76742zm.LJLIL);
    public static final C62822Ol8 LJLJJI = C221108m2.LIZIZ(C76722zk.INSTANCE);

    static {
        HG3.LJIIL();
        HG3.LJLJL.LJIILJJIL(new LEA() { // from class: X.2zg
            @Override // X.LEA
            public final void onAccountResult(int i, boolean z, int i2, User user) {
                if (z) {
                    if (i == 2 || i == 1 || i == 3) {
                        C76662ze.LJLIL.getClass();
                        C76662ze.LJLILLLLZI = false;
                        XKX.LIZLLL(C48841JEv.LIZ(C78613UtF.LIZJ), null, null, new C76692zh(null), 3);
                    }
                }
            }
        });
    }

    public static ConcurrentHashMap LJIIIIZZ() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        Iterator it = ((ArrayList) LJII()).iterator();
        while (it.hasNext()) {
            String LIZJ = C81273Gx.LIZJ((String) it.next());
            String str = "";
            if (!o.LJ(LIZJ, "")) {
                InterfaceC75432xf.LIZ.getClass();
                C96413qP.LIZ.LJFF();
                String LIZ = C63171Oql.LIZ(LIZJ, "recommended_timestamp");
                if (LIZ != null) {
                    str = LIZ;
                }
                concurrentHashMap.put(LIZJ, str);
            }
        }
        return concurrentHashMap;
    }

    public static ConcurrentHashMap LJIIIZ() {
        return (ConcurrentHashMap) LJLJJI.getValue();
    }

    @Override // X.InterfaceC72972th
    public final InterfaceC59692Vx LIZ() {
        Long LJJIZ;
        ArrayList arrayList = new ArrayList();
        Iterator it = ((ArrayList) C76582zW.LIZIZ()).iterator();
        while (it.hasNext()) {
            String str = (String) ORZ.LJLLLLLL(0, s.LJLJJL((String) it.next(), new String[]{"_"}, 0, 6));
            if (str != null && (LJJIZ = C38350F3i.LJJIZ(str)) != null) {
                arrayList.add(Long.valueOf(LJJIZ.longValue()));
            }
        }
        return new RecommendationRequestBody(arrayList);
    }

    @Override // X.InterfaceC72972th
    public final int LJ() {
        return EnumC72992tj.CONVERSATION_PROPERTY_TYPES_RECOMMENDED_CHAT.getValue();
    }

    public static final long LJI() {
        C105004Ae.LIZJ();
        return NetworkService.LJI().LIZ();
    }

    public static List LJII() {
        Keva kevaRepo = C76582zW.LIZ();
        o.LJIIIIZZ(kevaRepo, "kevaRepo");
        String curUserId = ((RBX) HG3.LJIILL()).getCurUserId();
        o.LJIIIIZZ(curUserId, "userService().curUserId");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("previous_recommended_user_ids");
        LIZ.append(curUserId);
        String string = kevaRepo.getString(X1D.LIZIZ(LIZ), "");
        o.LJIIIIZZ(string, "repo.getString(KEY_PREVI…ENDED_USER_IDS + uid, \"\")");
        List LJLJJL = s.LJLJJL(string, new String[]{"_"}, 0, 6);
        ArrayList arrayList = new ArrayList();
        for (Object obj : LJLJJL) {
            if (!o.LJ(obj, "")) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x006a, code lost:
    
        if (r0 == false) goto L8;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004f  */
    @Override // X.InterfaceC72972th
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ() {
        /*
            r7 = this;
            com.bytedance.keva.Keva r0 = X.C105004Ae.LIZ()
            java.lang.String r2 = "kevaRepo"
            kotlin.jvm.internal.o.LJIIIIZZ(r0, r2)
            X.3Fv r0 = X.C80993Fv.LIZ()
            com.ss.android.ugc.aweme.im.sdk.privacy.data.model.ChatUserSetting r0 = r0.LIZIZ()
            r6 = 1
            if (r0 == 0) goto L73
            int r1 = r0.getChatSet()
            r0 = 3
            if (r1 != r0) goto L73
            r0 = 1
        L1c:
            if (r0 == 0) goto L24
        L1e:
            r6 = 0
        L1f:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r6)
            return r0
        L24:
            com.ss.android.ugc.aweme.im.service.IIMUnder16Proxy r0 = X.C78966Uyw.LJJIJ()
            boolean r0 = r0.LIZIZ()
            if (r0 == 0) goto L2f
            goto L1e
        L2f:
            boolean r0 = X.AnonymousClass304.LIZIZ()
            if (r0 != 0) goto L36
            goto L1e
        L36:
            com.bytedance.keva.Keva r0 = X.C105004Ae.LIZ()
            kotlin.jvm.internal.o.LJIIIIZZ(r0, r2)
            java.lang.String r0 = "low_im_activeness"
            java.lang.String r0 = X.C100483wy.LIZJ(r0)     // Catch: java.lang.Exception -> L4b
            if (r0 == 0) goto L4b
            boolean r0 = java.lang.Boolean.parseBoolean(r0)     // Catch: java.lang.Exception -> L4b
            goto L4c
        L4b:
            r0 = 0
        L4c:
            if (r0 != 0) goto L4f
            goto L1e
        L4f:
            int r0 = X.AnonymousClass304.LIZ()
            switch(r0) {
                case 1: goto L6f;
                case 2: goto L6f;
                case 3: goto L6f;
                case 4: goto L71;
                case 5: goto L71;
                case 6: goto L71;
                default: goto L56;
            }
        L56:
            r2 = -1
        L57:
            long r0 = X.C76582zW.LIZJ()
            long r4 = LJI()
            long r4 = r4 - r0
            long r2 = (long) r2
            r0 = 86400000(0x5265c00, double:4.2687272E-316)
            long r2 = r2 * r0
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 <= 0) goto L6d
            r0 = 1
        L6a:
            if (r0 != 0) goto L1f
            goto L1e
        L6d:
            r0 = 0
            goto L6a
        L6f:
            r2 = 4
            goto L57
        L71:
            r2 = 2
            goto L57
        L73:
            r0 = 0
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C76662ze.LIZJ():java.lang.Object");
    }

    @Override // X.InterfaceC72972th
    public final C76800UCe LIZLLL() {
        return C76800UCe.LIZ;
    }

    public static void LJFF(String recConvId, InterfaceC65784Pro interfaceC65784Pro) {
        o.LJIIIZ(recConvId, "recConvId");
        if (!LJIIIZ().containsKey(recConvId)) {
            return;
        }
        LJIIIZ().remove(recConvId);
        if (interfaceC65784Pro != null) {
            interfaceC65784Pro.invoke();
        }
        XKX.LIZLLL(C48841JEv.LIZ(C78613UtF.LIZ), null, null, new C76642zc(recConvId, null), 3);
    }

    public static void LJIIJJI(int i, C63120Opw c63120Opw) {
        if (c63120Opw == null || !LJIIIZ().containsKey(c63120Opw.getConversationId())) {
            return;
        }
        if (i != 5 ? i != 2 : !c63120Opw.isMute()) {
            if (i != EnumC76652zd.REMOVE_RECOMMENDED_FLAG.getValue()) {
                return;
            }
        }
        if (AnonymousClass304.LIZIZ()) {
            XKX.LIZLLL(C48841JEv.LIZ(C78613UtF.LIZJ), null, null, new C76632zb(i, c63120Opw, null), 3);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0022, code lost:
    
        if (X.C76800UCe.LIZ != null) goto L14;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    @Override // X.InterfaceC72972th
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(com.ss.android.ugc.aweme.im.sdk.common.data.model.TiktokV1ImInboxDataGetResponse r8, X.InterfaceC67352kd<? super X.C76800UCe> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof X.C76702zi
            if (r0 == 0) goto L72
            r5 = r9
            X.2zi r5 = (X.C76702zi) r5
            int r2 = r5.LJLJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L72
            int r2 = r2 - r1
            r5.LJLJI = r2
        L12:
            java.lang.Object r1 = r5.LJLIL
            X.NAu r4 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r5.LJLJI
            r6 = 1
            if (r0 == 0) goto L2c
            if (r0 != r6) goto L78
            X.C141335gf.LIZJ(r1)
        L20:
            X.UCe r0 = X.C76800UCe.LIZ
            if (r0 != 0) goto L29
        L24:
            java.lang.String r0 = ""
            X.C76582zW.LJ(r0)
        L29:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L2c:
            X.C141335gf.LIZJ(r1)
            int r1 = X.AnonymousClass304.LIZ()
            r0 = 7
            r3 = 0
            if (r1 != r0) goto L3a
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L3a:
            if (r8 == 0) goto L40
            com.ss.android.ugc.aweme.im.sdk.common.data.model.RecommendationResponseBody r2 = r8.recommendations
            if (r2 != 0) goto L43
        L40:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L43:
            java.util.List<java.lang.Long> r0 = r2.uids
            if (r0 == 0) goto L70
            int r1 = r0.size()
        L4b:
            int r0 = X.AnonymousClass304.LIZ()
            switch(r0) {
                case 1: goto L6e;
                case 2: goto L6c;
                case 3: goto L6e;
                case 4: goto L6e;
                case 5: goto L6c;
                case 6: goto L6c;
                default: goto L52;
            }
        L52:
            r0 = -1
        L53:
            int r1 = java.lang.Math.min(r1, r0)
            java.util.List<java.lang.Long> r0 = r2.uids
            if (r0 == 0) goto L24
            java.util.List r1 = r0.subList(r3, r1)
            if (r1 == 0) goto L24
            X.2ze r0 = X.C76662ze.LJLIL
            r5.LJLJI = r6
            java.lang.Object r0 = r0.LJIIJ(r1, r5)
            if (r0 != r4) goto L20
            return r4
        L6c:
            r0 = 3
            goto L53
        L6e:
            r0 = 2
            goto L53
        L70:
            r1 = 0
            goto L4b
        L72:
            X.2zi r5 = new X.2zi
            r5.<init>(r7, r9)
            goto L12
        L78:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C76662ze.LIZIZ(com.ss.android.ugc.aweme.im.sdk.common.data.model.TiktokV1ImInboxDataGetResponse, X.2kd):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0161 A[LOOP:1: B:36:0x015b->B:38:0x0161, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01a1 A[LOOP:2: B:41:0x0199->B:43:0x01a1, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01b6 A[LOOP:3: B:46:0x01b0->B:48:0x01b6, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00cf A[LOOP:4: B:56:0x00c9->B:58:0x00cf, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Type inference failed for: r0v38, types: [T, java.lang.String] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIJ(java.util.List<java.lang.Long> r15, X.InterfaceC67352kd<? super X.C76800UCe> r16) {
        /*
            Method dump skipped, instructions count: 498
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C76662ze.LJIIJ(java.util.List, X.2kd):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIL(int r10, X.InterfaceC67352kd<? super X.C76800UCe> r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof X.C76712zj
            if (r0 == 0) goto L8d
            r6 = r11
            X.2zj r6 = (X.C76712zj) r6
            int r2 = r6.LJLJJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L8d
            int r2 = r2 - r1
            r6.LJLJJI = r2
        L12:
            java.lang.Object r1 = r6.LJLILLLLZI
            X.NAu r5 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r6.LJLJJI
            r4 = 1
            if (r0 == 0) goto L5c
            if (r0 != r4) goto L93
            java.lang.Object r3 = r6.LJLIL
            java.util.Iterator r3 = (java.util.Iterator) r3
            X.C141335gf.LIZJ(r1)
        L24:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L9b
            java.lang.Object r0 = r3.next()
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r2 = X.C81273Gx.LIZJ(r0)
            X.2ze r0 = X.C76662ze.LJLIL
            r0.getClass()
            java.util.concurrent.ConcurrentHashMap r0 = LJIIIZ()
            boolean r0 = r0.containsKey(r2)
            if (r0 == 0) goto L24
            java.util.concurrent.ConcurrentHashMap r0 = LJIIIZ()
            r0.remove(r2)
            X.2zd r0 = X.EnumC76652zd.REMOVE_RECOMMENDED_FLAG
            int r1 = r0.getValue()
            r6.LJLIL = r3
            r6.LJLJJI = r4
            r0 = 0
            java.lang.Object r0 = LJIILIIL(r1, r2, r0, r6)
            if (r0 != r5) goto L24
            return r5
        L5c:
            X.C141335gf.LIZJ(r1)
            long r0 = X.C76582zW.LIZJ()
            long r7 = LJI()
            long r7 = r7 - r0
            long r2 = (long) r10
            r0 = 86400000(0x5265c00, double:4.2687272E-316)
            long r2 = r2 * r0
            int r0 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r0 > 0) goto L82
            X.3Fv r0 = X.C80993Fv.LIZ()
            com.ss.android.ugc.aweme.im.sdk.privacy.data.model.ChatUserSetting r0 = r0.LIZIZ()
            if (r0 == 0) goto La0
            int r1 = r0.getChatSet()
            r0 = 3
            if (r1 != r0) goto La0
        L82:
            java.util.List r0 = LJII()
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.util.Iterator r3 = r0.iterator()
            goto L24
        L8d:
            X.2zj r6 = new X.2zj
            r6.<init>(r9, r11)
            goto L12
        L93:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L9b:
            java.lang.String r0 = ""
            X.C76582zW.LJ(r0)
        La0:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C76662ze.LJIIL(int, X.2kd):java.lang.Object");
    }

    public static Object LJIILIIL(int i, String str, String str2, InterfaceC67352kd interfaceC67352kd) {
        if (str2 == null && i != EnumC76652zd.INSERT_NEW_RECOMMENDED_CHAT.getValue()) {
            LJIIIZ().remove(str);
        }
        InterfaceC75432xf.LIZ.getClass();
        C96413qP.LIZ.LJFF();
        C76800UCe LIZ = AnonymousClass300.LIZIZ.LIZ(str, "recommended_timestamp", str2, i, true);
        if (LIZ == EnumC58928NAu.COROUTINE_SUSPENDED) {
            return LIZ;
        }
        return C76800UCe.LIZ;
    }
}
