package X;

import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.im.service.model.IMContact;
import com.ss.android.ugc.aweme.im.service.model.IMConversation;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.ThreadMode;

/* renamed from: X.3Fd, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C80813Fd implements C3GF {
    public static final C80813Fd LIZ;
    public static final HashMap<String, List<InterfaceC80823Fe>> LIZIZ;
    public static final HashMap<String, Boolean> LIZJ;

    static {
        C80813Fd c80813Fd = new C80813Fd();
        LIZ = c80813Fd;
        C42625Go9.LIZIZ(c80813Fd);
        LIZIZ = new HashMap<>();
        LIZJ = new HashMap<>();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.util.List, java.lang.Object] */
    @Override // X.C3GF
    public final List<IMUser> LJIILIIL() {
        C80533Eb.LIZ.getClass();
        ArrayList arrayList = new ArrayList();
        C3Q9.LIZ.getClass();
        C75782yE.LIZ();
        ArrayList arrayList2 = new ArrayList(C4WC.LJIILIIL());
        Iterator it = arrayList2.iterator();
        o.LJIIIIZZ(it, "sessionItems.iterator()");
        while (it.hasNext()) {
            C63120Opw c63120Opw = (C63120Opw) it.next();
            C109544Rq lastShowMessage = c63120Opw.getLastShowMessage();
            long LIZLLL = C81273Gx.LIZLLL(c63120Opw.getConversationId());
            if (c63120Opw.getConversationType() != AbstractC63505Ow9.LIZ || lastShowMessage == null || lastShowMessage.getMsgType() == 15 || LIZLLL <= 0) {
                it.remove();
            }
        }
        int size = arrayList2.size();
        ArrayList arrayList3 = arrayList2;
        if (size > 10) {
            ?? subList = arrayList2.subList(0, 10);
            o.LJIIIIZZ(subList, "sessionItems.subList(0, RECENT_MOST)");
            arrayList3 = subList;
        }
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            IMUser LJIIJJI = C79004UzY.LJIIJJI((C63120Opw) it2.next());
            if (LJIIJJI != null) {
                LJIIJJI.setType(1);
                arrayList.add(LJIIJJI);
            }
        }
        return arrayList;
    }

    @Override // X.C3GF
    public final List<IMUser> LJIILLIIL() {
        C80533Eb.LIZ.getClass();
        return C80853Fh.LJ().LJ(C80853Fh.LIZLLL());
    }

    @Override // X.C3GF
    public final List<IMUser> getAllFriends() {
        C80533Eb.LIZ.getClass();
        return C80853Fh.LJ().LJ(C80853Fh.LIZIZ());
    }

    @Override // X.C3GF
    public final Object LIZJ(InterfaceC67352kd<? super Integer> interfaceC67352kd) {
        return C80853Fh.LJ().LIZJ(interfaceC67352kd);
    }

    @Override // X.C3GF
    public final Object LJ(C85963Yy c85963Yy) {
        return C80853Fh.LJ().LIZIZ(c85963Yy);
    }

    @Override // X.C3GF
    public final OSZ LJFF(String str) {
        String LJJIII = C78897Uxp.LJJIII(str);
        InterfaceC80833Ff interfaceC80833Ff = C86970YBi.LIZIZ;
        return new OSZ(interfaceC80833Ff.LIZ(LJJIII), interfaceC80833Ff.LIZIZ(LJJIII));
    }

    @Override // X.C3GF
    public final void LJIIJ(InterfaceC80823Fe interfaceC80823Fe) {
        HashMap<String, List<InterfaceC80823Fe>> hashMap = LIZIZ;
        synchronized (hashMap) {
            Collection<List<InterfaceC80823Fe>> values = hashMap.values();
            o.LJIIIIZZ(values, "observerMap.values");
            Iterator<List<InterfaceC80823Fe>> it = values.iterator();
            while (it.hasNext()) {
                it.next().remove(interfaceC80823Fe);
            }
        }
    }

    @Override // X.C3GF
    public final String LJIIJJI(String str) {
        if (str != null) {
            C96423qQ.LIZ();
            C4Z2.LJIILLIIL();
            Long valueOf = CastLongProtector.valueOf(str);
            o.LJIIIIZZ(valueOf, "valueOf(it)");
            return C81273Gx.LIZIZ(valueOf.longValue());
        }
        return "";
    }

    @Override // X.C3GF
    public final IMUser LJIIL(String str) {
        return C80533Eb.LJIIJ(str, null);
    }

    @Override // X.C3GF
    public final Object LJIILJJIL(C3GI c3gi) {
        return C80853Fh.LJ().LJIIJJI(c3gi);
    }

    @Override // X.C3GF
    public final Boolean LJIILL(String str) {
        return LIZJ.get(str);
    }

    @Override // X.C3GF
    public final void LJIIZILJ(IMUser iMUser) {
        if (iMUser == null || iMUser.getUid() == null) {
            return;
        }
        if (iMUser.isBlock()) {
            iMUser.setFollowStatus(0);
        }
        XKX.LIZLLL(C780334l.LJLIL, C78613UtF.LIZJ, null, new C80423Dq(iMUser, null), 2);
    }

    @Override // X.C3GF
    public final String LJIJI(IMContact contact) {
        o.LJIIIZ(contact, "contact");
        return C3K0.LIZJ(contact);
    }

    @Override // X.C3GF
    public final String LJIJJ(IMContact contact) {
        o.LJIIIZ(contact, "contact");
        if (contact instanceof IMUser) {
            return ((IMUser) contact).getUid();
        }
        if (contact instanceof IMConversation) {
            IMConversation iMConversation = (IMConversation) contact;
            if (iMConversation.getConversationType() == AbstractC63505Ow9.LIZ) {
                return String.valueOf(C81273Gx.LIZLLL(iMConversation.getConversationId()));
            }
        }
        return null;
    }

    @Override // X.C3GF
    public final void LJIJJLI(IMUser iMUser) {
        XKX.LIZLLL(C780334l.LJLIL, C78613UtF.LIZJ, null, new C80793Fb(iMUser, null), 2);
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onIMUserUpdated(C39R event) {
        List<InterfaceC80823Fe> list;
        List LLJI;
        o.LJIIIZ(event, "event");
        HashMap<String, List<InterfaceC80823Fe>> hashMap = LIZIZ;
        synchronized (hashMap) {
            list = hashMap.get(event.LJLIL);
        }
        List<InterfaceC80823Fe> list2 = list;
        if (list2 != null && (LLJI = ORZ.LLJI(list2)) != null) {
            Iterator it = LLJI.iterator();
            while (it.hasNext()) {
                ((InterfaceC80823Fe) it.next()).LIZ(event.LJLJI);
            }
        }
    }

    @Override // X.C3GF
    public final void LJI(String str, InterfaceC80823Fe interfaceC80823Fe) {
        HashMap<String, List<InterfaceC80823Fe>> hashMap = LIZIZ;
        synchronized (hashMap) {
            List<InterfaceC80823Fe> list = hashMap.get(str);
            if (list == null) {
                list = new ArrayList<>();
                hashMap.put(str, list);
            }
            list.add(interfaceC80823Fe);
        }
    }

    @Override // X.C3GF
    public final void LJII(User user, AqS151S0100000_1 aqS151S0100000_1) {
        XKX.LIZLLL(C780334l.LJLIL, C78613UtF.LIZJ, null, new C75322xU(user, aqS151S0100000_1, null), 2);
    }

    @Override // X.C3GF
    public final List LJIIIIZZ(String str, List list) {
        C80533Eb.LIZ.getClass();
        return C65777Prh.LIZIZ(C80533Eb.LJIILL(str, list, false));
    }

    @Override // X.C3GF
    public final void LJIIIZ(String userId, boolean z) {
        o.LJIIIZ(userId, "userId");
        LIZJ.put(userId, Boolean.valueOf(z));
    }

    @Override // X.C3GF
    public final void LJIJ(Aweme aweme, final InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns) {
        String str;
        int i;
        o.LJIIIZ(aweme, "aweme");
        C81023Fy c81023Fy = C81023Fy.LJLIL;
        User author = aweme.getAuthor();
        String str2 = null;
        if (author != null) {
            String uid = author.getUid();
            boolean z = false;
            if (uid != null && (i = c81023Fy.LIZ().getInt(uid, 0)) > 0) {
                if (i == 1) {
                    z = true;
                }
                interfaceC88472Yns.invoke(Boolean.valueOf(z));
                return;
            }
        }
        C3EU c3eu = new C3EU() { // from class: X.3EQ
            @Override // X.C3EU
            public final void LIZ(IMUser result) {
                o.LJIIIZ(result, "result");
                boolean z2 = true;
                if (result.getShareStatus() != 1) {
                    z2 = false;
                }
                InterfaceC88472Yns<Boolean, C76800UCe> interfaceC88472Yns2 = interfaceC88472Yns;
                if (interfaceC88472Yns2 != null) {
                    interfaceC88472Yns2.invoke(Boolean.valueOf(z2));
                }
                C81023Fy c81023Fy2 = C81023Fy.LJLIL;
                String uid2 = result.getUid();
                o.LJIIIIZZ(uid2, "result.uid");
                c81023Fy2.LIZIZ(result.getShareStatus(), uid2);
            }

            @Override // X.C3EU
            public final void LIZIZ(Throwable throwable) {
                o.LJIIIZ(throwable, "throwable");
                InterfaceC88472Yns<Boolean, C76800UCe> interfaceC88472Yns2 = interfaceC88472Yns;
                if (interfaceC88472Yns2 != null) {
                    interfaceC88472Yns2.invoke(Boolean.FALSE);
                }
            }
        };
        User author2 = aweme.getAuthor();
        if (author2 != null) {
            str = author2.getUid();
        } else {
            str = null;
        }
        User author3 = aweme.getAuthor();
        if (author3 != null) {
            str2 = author3.getSecUid();
        }
        C80533Eb.LJI(str, str2, c3eu);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:1|(2:3|(6:5|6|7|(1:(1:13)(2:10|11))(5:17|(1:31)(1:21)|(4:25|(1:27)|28|(1:30))|23|24)|14|15))|34|6|7|(0)(0)|14|15) */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0065, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0066, code lost:
    
        X.C34B.LJ("TTBA_Check_Welcome_Msg_Enabled", r1);
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001b  */
    @Override // X.C3GF
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZLLL(java.lang.String r6, java.lang.String r7, X.InterfaceC67352kd<? super java.lang.Boolean> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof X.C80803Fc
            if (r0 == 0) goto L1e
            r4 = r8
            X.3Fc r4 = (X.C80803Fc) r4
            int r2 = r4.LJLJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L1e
            int r2 = r2 - r1
            r4.LJLJI = r2
        L12:
            java.lang.Object r3 = r4.LJLIL
            X.NAu r2 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r4.LJLJI
            r1 = 1
            if (r0 == 0) goto L2c
            if (r0 != r1) goto L24
            goto L53
        L1e:
            X.3Fc r4 = new X.3Fc
            r4.<init>(r5, r8)
            goto L12
        L24:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2c:
            X.C141335gf.LIZJ(r3)
            if (r6 == 0) goto L37
            boolean r0 = ujb.o.LJJJJJL(r6)
            if (r0 == 0) goto L3b
        L37:
            r0 = 1
        L38:
            if (r0 != 0) goto L6b
            goto L3d
        L3b:
            r0 = 0
            goto L38
        L3d:
            if (r7 != 0) goto L42
            java.lang.String r7 = ""
        L42:
            r4.LJLJI = r1     // Catch: java.lang.Exception -> L65
            X.Ol8 r0 = X.C30U.LJ     // Catch: java.lang.Exception -> L65
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Exception -> L65
            com.ss.android.ugc.aweme.im.sdk.common.data.api.TikTokImApi r0 = (com.ss.android.ugc.aweme.im.sdk.common.data.api.TikTokImApi) r0     // Catch: java.lang.Exception -> L65
            java.lang.Object r3 = r0.getIsWelcomeMessageEnabled(r6, r7, r4)     // Catch: java.lang.Exception -> L65
            if (r3 != r2) goto L56
            return r2
        L53:
            X.C141335gf.LIZJ(r3)     // Catch: java.lang.Exception -> L65
        L56:
            com.ss.android.ugc.aweme.im.sdk.common.data.model.WelcomeMsgEnabledResponse r3 = (com.ss.android.ugc.aweme.im.sdk.common.data.model.WelcomeMsgEnabledResponse) r3     // Catch: java.lang.Exception -> L65
            java.lang.Boolean r1 = r3.hasWelcomeMsg     // Catch: java.lang.Exception -> L65
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch: java.lang.Exception -> L65
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)     // Catch: java.lang.Exception -> L65
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch: java.lang.Exception -> L65
            return r0
        L65:
            r1 = move-exception
            java.lang.String r0 = "TTBA_Check_Welcome_Msg_Enabled"
            X.C34B.LJ(r0, r1)
        L6b:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C80813Fd.LIZLLL(java.lang.String, java.lang.String, X.2kd):java.lang.Object");
    }
}
