package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.qainvitation.model.QAInvitationSettingsData;
import com.ss.android.ugc.aweme.qainvitation.service.IQAInvitationService;
import com.ss.android.ugc.aweme.qainvitation.service.QAInvitationService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.3fp, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C89853fp {
    public final C73318Sq2 LIZ;
    public final InterfaceC88472Yns<C89863fq, C76800UCe> LIZIZ;
    public final InterfaceC65784Pro<C76800UCe> LIZJ;
    public int LIZLLL;
    public final boolean LJ;
    public final List<IMUser> LJFF;
    public String LJI;
    public String LJII;
    public long LJIIIIZZ;
    public long LJIIIZ;
    public final IQAInvitationService LJIIJ;
    public List<IMUser> LJIIJJI;
    public C89863fq LJIIL;

    public final int LJFF() {
        QAInvitationSettingsData LIZLLL;
        Integer num;
        IQAInvitationService iQAInvitationService = this.LJIIJ;
        if (iQAInvitationService != null && (LIZLLL = iQAInvitationService.LIZLLL()) != null && (num = LIZLLL.invitationLimit) != null) {
            return num.intValue();
        }
        return 30;
    }

    public static List LIZLLL(List list) {
        if (list.isEmpty()) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            IMUser iMUser = (IMUser) it.next();
            if (!o.LJ(iMUser.getUid(), ((RBX) HG3.LJIILL()).getCurUserId())) {
                arrayList.add(iMUser);
            }
        }
        return arrayList;
    }

    public final IMUser LJ(IMUser user) {
        boolean z;
        o.LJIIIZ(user, "user");
        List<IMUser> list = this.LJIIJJI;
        if (list == null || list.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        IMUser iMUser = null;
        if (z) {
            return null;
        }
        Iterator<IMUser> it = this.LJIIJJI.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            IMUser next = it.next();
            if (o.LJ(next.getUid(), user.getUid())) {
                iMUser = next;
                break;
            }
        }
        return iMUser;
    }

    public final void LJIIIIZZ(IMUser user) {
        o.LJIIIZ(user, "user");
        Iterator<IMUser> it = this.LJIIJJI.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            IMUser next = it.next();
            if (o.LJ(user.getUid(), next.getUid())) {
                if (next != null) {
                    this.LJIIJJI.remove(next);
                }
            }
        }
        List<? extends IMUser> LLJILJILJ = ORZ.LLJILJILJ(this.LJIIL.LIZ);
        ArrayList arrayList = (ArrayList) LLJILJILJ;
        Iterator it2 = arrayList.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next2 = it2.next();
            if (o.LJ(user.getUid(), ((IMUser) next2).getUid())) {
                if (next2 != null) {
                    arrayList.remove(next2);
                    C89863fq c89863fq = this.LJIIL;
                    LIZJ(LLJILJILJ, c89863fq.LIZIZ, c89863fq.LIZJ, c89863fq.LJ, c89863fq.LIZLLL);
                }
            }
        }
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", this.LJII);
        c188727au.LJIIIZ("enter_method", this.LJI);
        c188727au.LJ(this.LJIIIZ, "from_user_id");
        c188727au.LJIIIZ("to_user_id", user.getUid());
        FMX.LJIIL("cancel_select_qa_invitee", c188727au.LIZ);
        this.LIZIZ.invoke(this.LJIIL);
    }

    public final void LJIIIZ(int i) {
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", this.LJII);
        c188727au.LJIIIZ("enter_method", this.LJI);
        c188727au.LJ(this.LJIIIIZZ, "question_id");
        c188727au.LIZLLL(this.LJIIJJI.size(), "invitee_count");
        c188727au.LIZLLL(i, "is_success");
        FMX.LJIIL("send_qa_invitation", c188727au.LIZ);
    }

    public static boolean LIZIZ(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        Locale ROOT = Locale.ROOT;
        o.LJIIIIZZ(ROOT, "ROOT");
        String lowerCase = str.toLowerCase(ROOT);
        o.LJIIIIZZ(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        if (!s.LJJJLZIJ(lowerCase, str2, false)) {
            return false;
        }
        return true;
    }

    public static String LJI(List list, List list2) {
        boolean z;
        ArrayList LJ = C61328O5c.LJ(list);
        if (list2 == null || list2.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            LJ.addAll(list2);
        }
        try {
            Gson gson = new Gson();
            ArrayList arrayList = new ArrayList(C32I.LJJL(LJ, 10));
            Iterator it = LJ.iterator();
            while (it.hasNext()) {
                String uid = ((IMUser) it.next()).getUid();
                o.LJIIIIZZ(uid, "it.uid");
                arrayList.add(Long.valueOf(CastLongProtector.parseLong(uid)));
            }
            String LJIILL = gson.LJIILL(arrayList);
            o.LJIIIIZZ(LJIILL, "{\n            Gson().toJ…\n            })\n        }");
            return LJIILL;
        } catch (Exception unused) {
            return "";
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x006f, code lost:
    
        if (r2 == null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0071, code lost:
    
        com.bytedance.mt.protector.impl.collections.ListProtector.add(r11.LJIIJJI, 0, r12);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(com.ss.android.ugc.aweme.im.service.model.IMUser r12, X.EnumC89943fy r13) {
        /*
            r11 = this;
            java.lang.String r0 = "user"
            kotlin.jvm.internal.o.LJIIIZ(r12, r0)
            java.lang.String r0 = "contactType"
            kotlin.jvm.internal.o.LJIIIZ(r13, r0)
            r5 = r11
            X.3fq r0 = r5.LJIIL
            java.util.List<com.ss.android.ugc.aweme.im.service.model.IMUser> r0 = r0.LJFF
            java.util.Iterator r3 = r0.iterator()
        L13:
            boolean r0 = r3.hasNext()
            r2 = 0
            if (r0 == 0) goto L2f
            java.lang.Object r2 = r3.next()
            r0 = r2
            com.ss.android.ugc.aweme.im.service.model.IMUser r0 = (com.ss.android.ugc.aweme.im.service.model.IMUser) r0
            java.lang.String r1 = r12.getUid()
            java.lang.String r0 = r0.getUid()
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            if (r0 == 0) goto L13
        L2f:
            r3 = 0
            r1 = 1
            if (r2 != 0) goto L4e
            X.3fq r0 = r5.LJIIL
            java.util.List<com.ss.android.ugc.aweme.im.service.model.IMUser> r0 = r0.LIZ
            java.util.List r6 = X.ORZ.LLJILJILJ(r0)
            com.bytedance.mt.protector.impl.collections.ListProtector.add(r6, r3, r12)
            X.3fq r0 = r5.LJIIL
            java.util.List<com.ss.android.ugc.aweme.im.service.model.IMUser> r7 = r0.LIZIZ
            java.util.List<com.ss.android.ugc.aweme.im.service.model.IMUser> r8 = r0.LIZJ
            java.util.List<com.ss.android.ugc.aweme.im.service.model.IMUser> r9 = r0.LJ
            java.util.List<com.ss.android.ugc.aweme.im.service.model.IMUser> r10 = r0.LIZLLL
            r5.LIZJ(r6, r7, r8, r9, r10)
            r12.setIsUserNotInAllFriends(r1)
        L4e:
            java.util.List<com.ss.android.ugc.aweme.im.service.model.IMUser> r0 = r5.LJIIJJI
            java.util.Iterator r4 = r0.iterator()
        L54:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L71
            java.lang.Object r2 = r4.next()
            r0 = r2
            com.ss.android.ugc.aweme.im.service.model.IMUser r0 = (com.ss.android.ugc.aweme.im.service.model.IMUser) r0
            java.lang.String r1 = r0.getUid()
            java.lang.String r0 = r12.getUid()
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            if (r0 == 0) goto L54
            if (r2 != 0) goto L76
        L71:
            java.util.List<com.ss.android.ugc.aweme.im.service.model.IMUser> r0 = r5.LJIIJJI
            com.bytedance.mt.protector.impl.collections.ListProtector.add(r0, r3, r12)
        L76:
            X.7au r3 = new X.7au
            r3.<init>()
            java.lang.String r1 = r5.LJII
            java.lang.String r0 = "enter_from"
            r3.LJIIIZ(r0, r1)
            java.lang.String r1 = r5.LJI
            java.lang.String r0 = "enter_method"
            r3.LJIIIZ(r0, r1)
            java.lang.String r2 = "from_user_id"
            long r0 = r5.LJIIIZ
            r3.LJ(r0, r2)
            java.lang.String r1 = r12.getUid()
            java.lang.String r0 = "to_user_id"
            r3.LJIIIZ(r0, r1)
            java.lang.String r1 = r13.getValue()
            java.lang.String r0 = "type"
            r3.LJIIIZ(r0, r1)
            java.util.Map<java.lang.String, java.lang.String> r1 = r3.LIZ
            java.lang.String r0 = "select_qa_invitee"
            X.FMX.LJIIL(r0, r1)
            X.Yns<X.3fq, X.UCe> r1 = r5.LIZIZ
            X.3fq r0 = r5.LJIIL
            r1.invoke(r0)
            X.Pro<X.UCe> r0 = r5.LIZJ
            r0.invoke()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C89853fp.LIZ(com.ss.android.ugc.aweme.im.service.model.IMUser, X.3fy):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C89853fp(C73318Sq2 c73318Sq2, InterfaceC88472Yns<? super C89863fq, C76800UCe> allContactsObserver, InterfaceC65784Pro<C76800UCe> hideKeyboardObserver) {
        o.LJIIIZ(allContactsObserver, "allContactsObserver");
        o.LJIIIZ(hideKeyboardObserver, "hideKeyboardObserver");
        this.LIZ = c73318Sq2;
        this.LIZIZ = allContactsObserver;
        this.LIZJ = hideKeyboardObserver;
        this.LJ = true;
        this.LJFF = new ArrayList();
        this.LJI = "";
        this.LJII = "";
        this.LJIIJ = QAInvitationService.LJI();
        this.LJIIJJI = new ArrayList();
        C61878OQg c61878OQg = C61878OQg.INSTANCE;
        this.LJIIL = new C89863fq(c61878OQg, c61878OQg, c61878OQg, c61878OQg, c61878OQg, c61878OQg);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.util.List] */
    public final C89863fq LIZJ(List<? extends IMUser> selectedSUGUsers, List<? extends IMUser> recentFriends, List<? extends IMUser> mutualFriends, List<? extends IMUser> inviteeList, List<? extends IMUser> allFollowingFriends) {
        o.LJIIIZ(selectedSUGUsers, "selectedSUGUsers");
        o.LJIIIZ(recentFriends, "recentFriends");
        o.LJIIIZ(mutualFriends, "mutualFriends");
        o.LJIIIZ(inviteeList, "inviteeList");
        o.LJIIIZ(allFollowingFriends, "allFollowingFriends");
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(selectedSUGUsers);
        arrayList.addAll(recentFriends);
        arrayList.addAll(mutualFriends);
        arrayList.addAll(allFollowingFriends);
        ArrayList arrayList2 = arrayList;
        if (this.LJ) {
            arrayList2 = LIZLLL(arrayList);
        }
        C89863fq c89863fq = new C89863fq(selectedSUGUsers, recentFriends, mutualFriends, allFollowingFriends, inviteeList, arrayList2);
        this.LJIIL = c89863fq;
        return c89863fq;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0072, code lost:
    
        r0 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C89863fq LJII(java.util.List<com.ss.android.ugc.aweme.im.service.model.IMUser> r19, java.util.List<com.ss.android.ugc.aweme.im.service.model.IMUser> r20, java.util.List<com.ss.android.ugc.aweme.qainvitation.model.UserBlockData> r21, java.util.List<? extends com.ss.android.ugc.aweme.im.service.model.IMUser> r22, java.util.List<com.ss.android.ugc.aweme.im.service.model.IMUser> r23) {
        /*
            Method dump skipped, instructions count: 340
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C89853fp.LJII(java.util.List, java.util.List, java.util.List, java.util.List, java.util.List):X.3fq");
    }
}
