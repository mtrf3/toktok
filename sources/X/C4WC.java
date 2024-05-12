package X;

import Y.IDbS168S0200000_1;
import Y.IDbS398S0100000_1;
import Y.IDcS364S0100000_1;
import Y.IDcS406S0100000_1;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.o;

/* renamed from: X.4WC, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4WC implements C3Q9 {
    public static final C4WC LIZIZ = new C4WC();

    public static final void LJIIL() {
        C115284fk LJIILIIL = C115284fk.LJIILIIL();
        LJIILIIL.getClass();
        if (C63308Osy.LJI().LIZLLL().LJJ) {
            C63322OtC.LIZIZ("ConversationListModel ", "start fast load");
            RunnableC63345OtZ.LJ(new IDcS406S0100000_1(LJIILIIL, 2), new IDbS398S0100000_1(LJIILIIL, 2), false);
        }
    }

    public static final List<C63120Opw> LJIILIIL() {
        java.util.Map<String, C63120Opw> map;
        boolean z;
        C115284fk LJIILIIL = C115284fk.LJIILIIL();
        synchronized (LJIILIIL) {
            map = LJIILIIL.LIZ;
        }
        Collection values = ((ConcurrentHashMap) map).values();
        ArrayList arrayList = new ArrayList();
        for (Object obj : values) {
            if (C96413qP.LIZ.LJ(((C63120Opw) obj).getConversationId()) == 2) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final List<C63120Opw> LJIILL() {
        C115284fk.LJIILIIL().getClass();
        return C63133Oq9.LJIIIIZZ(AbstractC63505Ow9.LIZIZ);
    }

    public static final boolean LJIJJ() {
        return !((ConcurrentHashMap) C115284fk.LJIILIIL().LJ).isEmpty();
    }

    @Override // X.C3Q9
    public final List<C63120Opw> LJ() {
        ArrayList arrayList;
        C115284fk LJIILIIL = C115284fk.LJIILIIL();
        synchronized (LJIILIIL) {
            C63322OtC.LJFF("ConversationListModel getGroupConversationSync");
            arrayList = new ArrayList();
            Iterator it = ((ArrayList) LJIILIIL.LJIIIIZZ()).iterator();
            while (it.hasNext()) {
                C63120Opw c63120Opw = (C63120Opw) it.next();
                if (c63120Opw != null && c63120Opw.isGroupChat()) {
                    arrayList.add(c63120Opw);
                }
            }
            if (arrayList.size() > 0) {
                C115284fk.LJJIFFI(arrayList);
            }
        }
        return arrayList;
    }

    public static final void LIZIZ(C4WS observer) {
        o.LJIIIZ(observer, "observer");
        C115284fk LJIILIIL = C115284fk.LJIILIIL();
        LJIILIIL.getClass();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ConversationListModel addPageObserver:");
        LIZ.append(observer);
        C63322OtC.LJFF(X1D.LIZIZ(LIZ));
        ((CopyOnWriteArraySet) LJIILIIL.LJII).add(observer);
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x00bf, code lost:
    
        if (r5 != null) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C63120Opw LJIIZILJ(java.lang.Long r11) {
        /*
            r10 = 0
            if (r11 == 0) goto L17
            r11.longValue()
            X.4fk r7 = X.C115284fk.LJIILIIL()
            long r3 = r11.longValue()
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 > 0) goto L18
            r7.getClass()
        L17:
            return r10
        L18:
            java.util.Map<java.lang.String, X.Opw> r0 = r7.LIZ
            java.util.concurrent.ConcurrentHashMap r0 = (java.util.concurrent.ConcurrentHashMap) r0
            java.util.Set r0 = r0.keySet()
            java.util.Iterator r6 = r0.iterator()
        L24:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L44
            java.lang.Object r1 = r6.next()
            java.util.Map<java.lang.String, X.Opw> r0 = r7.LIZ
            java.util.concurrent.ConcurrentHashMap r0 = (java.util.concurrent.ConcurrentHashMap) r0
            java.lang.Object r5 = r0.get(r1)
            X.Opw r5 = (X.C63120Opw) r5
            if (r5 == 0) goto L24
            long r1 = r5.getConversationShortId()
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 != 0) goto L24
        L42:
            r10 = r5
            goto L17
        L44:
            X.C47922IrO.LIZ()
            X.4fv r9 = X.C115394fv.LJII()
            android.util.LruCache<java.lang.String, X.Opw> r0 = r9.LIZJ
            java.util.Map r0 = r0.snapshot()
            java.util.Set r0 = r0.keySet()
            java.util.Iterator r6 = r0.iterator()
            r5 = r10
        L5a:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L77
            java.lang.Object r1 = r6.next()
            android.util.LruCache<java.lang.String, X.Opw> r0 = r9.LIZJ
            java.lang.Object r5 = r0.get(r1)
            X.Opw r5 = (X.C63120Opw) r5
            if (r5 == 0) goto L5a
            long r1 = r5.getConversationShortId()
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 != 0) goto L5a
            goto L42
        L77:
            java.util.Set<X.4W7> r0 = r9.LIZ
            if (r0 == 0) goto Lc2
            java.util.HashSet r0 = (java.util.HashSet) r0
            java.util.Iterator r8 = r0.iterator()
        L81:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto Lbf
            java.lang.Object r7 = r8.next()
            X.4W7 r7 = (X.C4W7) r7
            java.util.Map<java.lang.String, X.Opw> r0 = r7.LIZ
            java.util.Set r0 = r0.keySet()
            java.util.Iterator r6 = r0.iterator()
        L97:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto Lbd
            java.lang.Object r1 = r6.next()
            java.util.Map<java.lang.String, X.Opw> r0 = r7.LIZ
            java.lang.Object r5 = r0.get(r1)
            X.Opw r5 = (X.C63120Opw) r5
            if (r5 == 0) goto L97
            long r1 = r5.getConversationShortId()
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 != 0) goto L97
        Lb3:
            android.util.LruCache<java.lang.String, X.Opw> r1 = r9.LIZJ
            java.lang.String r0 = r5.getConversationId()
            r1.put(r0, r5)
            goto L42
        Lbd:
            r5 = r10
            goto L81
        Lbf:
            if (r5 == 0) goto Lc2
            goto Lb3
        Lc2:
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "StrangerManager  getConversationByShortId null "
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = X.X1D.LIZIZ(r1)
            X.C63322OtC.LIZLLL(r0)
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C4WC.LJIIZILJ(java.lang.Long):X.Opw");
    }

    public static final void LJIL(C4WS observer) {
        o.LJIIIZ(observer, "observer");
        C115284fk LJIILIIL = C115284fk.LJIILIIL();
        LJIILIIL.getClass();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ConversationListModel removePageObserver:");
        LIZ.append(observer);
        C63322OtC.LJFF(X1D.LIZIZ(LIZ));
        ((CopyOnWriteArraySet) LJIILIIL.LJII).remove(observer);
    }

    public static final void LJJ(C63120Opw c63120Opw) {
        C115284fk.LJIILIIL().getClass();
        C115394fv.LJII().LJIIL(c63120Opw);
    }

    public static final void LJJI(List<String> list) {
        C115284fk LJIILIIL = C115284fk.LJIILIIL();
        if (((ConcurrentHashMap) LJIILIIL.LIZ).isEmpty() || list.isEmpty()) {
            return;
        }
        for (String str : list) {
            C63120Opw c63120Opw = (C63120Opw) ((ConcurrentHashMap) LJIILIIL.LIZ).get(str);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("updateConversationListInfo - ");
            LIZ.append(str);
            C63322OtC.LJFF(X1D.LIZIZ(LIZ));
            if (c63120Opw != null) {
                int inboxType = c63120Opw.getInboxType();
                C63269OsL.LIZJ(c63120Opw.getConversationShortId(), c63120Opw.getUpdatedTime(), inboxType, c63120Opw.getConversationType(), str);
            }
        }
        C63269OsL.LIZLLL(false);
    }

    @Override // X.C3Q9
    public final C63120Opw LIZ(String str) {
        if (str == null) {
            return null;
        }
        return C115284fk.LJIILIIL().LJIIIZ(str);
    }

    @Override // X.C3Q9
    public final void LIZJ(String str) {
        C115284fk.LJIILIIL().getClass();
        C115284fk.LJJIII(str);
    }

    @Override // X.C3Q9
    public final void LJFF(C4WV observer) {
        o.LJIIIZ(observer, "observer");
        C115284fk.LJIILIIL().LIZ(observer);
    }

    @Override // X.C3Q9
    public final C63120Opw LJII(String str) {
        return C115284fk.LJIILIIL().LJIIJJI(str);
    }

    @Override // X.C3Q9
    public final boolean LJIIIIZZ(String str) {
        boolean containsKey;
        C4WW c4ww = (C4WW) C108094Mb.LIZIZ.getValue();
        c4ww.getClass();
        synchronized (c4ww.LIZLLL()) {
            containsKey = c4ww.LIZLLL().containsKey(str);
        }
        return containsKey;
    }

    @Override // X.C3Q9
    public final void LJIIIZ(C4WV observer) {
        o.LJIIIZ(observer, "observer");
        C115284fk LJIILIIL = C115284fk.LJIILIIL();
        LJIILIIL.getClass();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ConversationListModel removeObserver:");
        LIZ.append(observer);
        C63322OtC.LJFF(X1D.LIZIZ(LIZ));
        ((CopyOnWriteArraySet) LJIILIIL.LIZLLL).remove(observer);
    }

    public final void LJIJI(C3NP unreadCountCalculator) {
        o.LJIIIZ(unreadCountCalculator, "unreadCountCalculator");
        C115284fk.LJIILIIL().getClass();
        C4WK.LIZIZ().LIZLLL = unreadCountCalculator;
    }

    public static final void LJIILLIIL(String str, InterfaceC86963bA<C63120Opw> interfaceC86963bA) {
        if (str == null || str.length() == 0) {
            interfaceC86963bA.onSuccess(null);
        } else {
            C115284fk.LJIILIIL().LJIIJ(str, interfaceC86963bA);
        }
    }

    @Override // X.C3Q9
    public final void LIZLLL(String conversationId, InterfaceC86963bA<String> interfaceC86963bA) {
        o.LJIIIZ(conversationId, "conversationId");
        C115284fk.LJIILIIL().getClass();
        C63356Otk.LJIIIZ().getClass();
        if (TextUtils.isEmpty(conversationId)) {
            C63322OtC.LIZLLL("DeleteConversationHandler delete, cid invalid");
        } else {
            C115284fk.LJIILIIL().LJIIJ(conversationId, new C4N6(interfaceC86963bA, conversationId));
        }
    }

    public final void LJIIJ(InterfaceC86963bA interfaceC86963bA, List queryMessage) {
        o.LJIIIZ(queryMessage, "queryMessage");
        C115284fk.LJIILIIL().getClass();
        C63356Otk.LJIIIZ().getClass();
        C4WD.LIZ().getClass();
        C4WT c4wt = new C4WT();
        C4WF c4wf = new C4WF(c4wt, interfaceC86963bA, new ArrayList());
        ArrayList arrayList = new ArrayList();
        int i = C63308Osy.LJI().LIZLLL().LJJLIL;
        int i2 = C63308Osy.LJI().LIZLLL().LJJLJ;
        ArrayList arrayList2 = null;
        boolean z = false;
        for (Object obj : queryMessage) {
            "".equals("on_get_ws_msg");
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
            }
            arrayList2.add(obj);
            if (i > 0 && !z) {
                if (arrayList2.size() == i) {
                    new C120144na(c4wf).LJIILIIL("", arrayList2, true);
                    arrayList2 = null;
                    z = true;
                }
            } else if (arrayList2.size() == i2) {
                arrayList.add(arrayList2);
                arrayList2 = null;
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            List list = (List) it.next();
            c4wt.LIZ++;
            new C120144na(c4wf).LJIILIIL("", list, false);
        }
        if (arrayList2 != null) {
            c4wt.LIZ++;
            new C120144na(c4wf).LJIILIIL("", arrayList2, false);
        }
    }

    public static final boolean LJIJJLI(final long j, final int i, final C81963Jo query) {
        o.LJIIIZ(query, "query");
        final C115284fk LJIILIIL = C115284fk.LJIILIIL();
        if (((ConcurrentHashMap) LJIILIIL.LJ).containsKey(query.LJLIL)) {
            C63322OtC.LJI("ConversationListModel ", "loadConversationsWithQuery, is syncing already", null);
            return false;
        }
        ((ConcurrentHashMap) LJIILIIL.LJ).put(query.LJLIL, LJIILIIL.LJFF);
        C63322OtC.LJI("ConversationListModel ", "loadConversationsWithQuery", null);
        RunnableC63345OtZ.LJ(new InterfaceC63352Otg<C81913Jj>() { // from class: X.4WH
            /* JADX WARN: Code restructure failed: missing block: B:41:0x00da, code lost:
            
                if (r14 != null) goto L25;
             */
            /* JADX WARN: Removed duplicated region for block: B:33:0x00c5  */
            /* JADX WARN: Removed duplicated region for block: B:35:0x00ca  */
            @Override // X.InterfaceC63352Otg
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final X.C81913Jj LIZIZ() {
                /*
                    r20 = this;
                    r2 = r20
                    X.4fk r0 = X.C115284fk.this
                    java.util.Set<X.4WS> r0 = r0.LJII
                    java.util.concurrent.CopyOnWriteArraySet r0 = (java.util.concurrent.CopyOnWriteArraySet) r0
                    boolean r0 = r0.isEmpty()
                    if (r0 != 0) goto L28
                    X.4fk r0 = X.C115284fk.this
                    java.util.Set<X.4WS> r0 = r0.LJII
                    java.util.concurrent.CopyOnWriteArraySet r0 = (java.util.concurrent.CopyOnWriteArraySet) r0
                    java.util.Iterator r1 = r0.iterator()
                L18:
                    boolean r0 = r1.hasNext()
                    if (r0 == 0) goto L28
                    java.lang.Object r0 = r1.next()
                    X.4WS r0 = (X.C4WS) r0
                    r0.LJII()
                    goto L18
                L28:
                    X.4fk r4 = X.C115284fk.this
                    long r0 = r2
                    int r6 = r4
                    X.3Jo r13 = r5
                    r4.getClass()
                    long r11 = android.os.SystemClock.uptimeMillis()
                    X.Osy r2 = X.C63308Osy.LJI()
                    X.4eO r2 = r2.LIZLLL()
                    if (r2 == 0) goto L46
                    java.lang.String r2 = r2.LJJIFFI
                    X.C63150OqQ.LJII(r2)
                L46:
                    r2 = 0
                    long r14 = java.lang.Math.max(r0, r2)
                    int r3 = r13.LJLILLLLZI
                    r5 = 1
                    if (r3 == r5) goto L6c
                    r2 = 2
                    if (r3 == r2) goto L69
                    r19 = 0
                L56:
                    r16 = 1
                    r9 = 0
                    r18 = r6
                    java.util.List r14 = X.C63133Oq9.LJIIL(r14, r16, r18, r19)
                    X.4WK r3 = X.C4WK.LIZIZ()
                    r2 = 0
                    r3.LIZJ(r14, r2)
                    goto L6f
                L69:
                    X.3pu r19 = X.EnumC96103pu.USER_SET_CONVERSATION_CATEGORY_SECONDARY
                    goto L56
                L6c:
                    X.3pu r19 = X.EnumC96103pu.USER_SET_CONVERSATION_CATEGORY_PRIMARY
                    goto L56
                L6f:
                    org.json.JSONObject r8 = new org.json.JSONObject     // Catch: java.lang.Exception -> L83
                    r8.<init>()     // Catch: java.lang.Exception -> L83
                    java.lang.String r7 = "duration"
                    long r2 = android.os.SystemClock.uptimeMillis()     // Catch: java.lang.Exception -> L83
                    long r2 = r2 - r11
                    r8.put(r7, r2)     // Catch: java.lang.Exception -> L83
                    java.lang.String r2 = "im_sync_conversation_range_duration"
                    X.C63337OtR.LIZLLL(r2, r8)     // Catch: java.lang.Exception -> L83
                L83:
                    if (r14 == 0) goto Ld9
                    if (r6 <= 0) goto Ld9
                    r2 = r14
                    java.util.ArrayList r2 = (java.util.ArrayList) r2
                    int r2 = r2.size()
                    if (r2 < r6) goto Ld9
                    r15 = 1
                L91:
                    r3 = r14
                    java.util.ArrayList r3 = (java.util.ArrayList) r3
                    boolean r2 = r3.isEmpty()
                    if (r2 != 0) goto Ldd
                    java.lang.Object r2 = X.U26.LIZIZ(r3, r5, r14)
                    X.Opw r2 = (X.C63120Opw) r2
                    long r16 = r2.getSortOrder()
                    int r2 = (r16 > r9 ? 1 : (r16 == r9 ? 0 : -1))
                    if (r2 <= 0) goto Lb9
                    int r2 = (r16 > r0 ? 1 : (r16 == r0 ? 0 : -1))
                    if (r2 != 0) goto Lb9
                    r9 = -1
                    r5 = r0
                    r7 = r0
                    r10 = r19
                    java.util.List r14 = X.C63133Oq9.LJIIL(r5, r7, r9, r10)
                    r0 = 1
                    long r16 = r16 - r0
                Lb9:
                    X.Osy r0 = X.C63308Osy.LJI()
                    X.4eO r0 = r0.LIZLLL()
                    boolean r0 = r0.LJIJI
                    if (r0 == 0) goto Lc8
                    r4.LJJIIJ(r14)
                Lc8:
                    if (r14 != 0) goto Lcf
                    java.util.ArrayList r14 = new java.util.ArrayList
                    r14.<init>()
                Lcf:
                    X.3Jj r12 = new X.3Jj
                    r19 = 0
                    r18 = -1
                    r12.<init>(r13, r14, r15, r16, r18, r19)
                    return r12
                Ld9:
                    r15 = 0
                    if (r14 == 0) goto Ldd
                    goto L91
                Ldd:
                    r16 = 0
                    goto Lb9
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C4WH.LIZIZ():java.lang.Object");
            }
        }, new IDbS168S0200000_1(LJIILIIL, query, 1), true);
        return true;
    }

    @Override // X.C3Q9
    public final void LJI(int i, IDcS364S0100000_1 iDcS364S0100000_1, String uid) {
        o.LJIIIZ(uid, "uid");
        long LJJI = C1GE.LJJI(uid, iDcS364S0100000_1);
        if (LJJI <= 0) {
            return;
        }
        C115284fk.LJIILIIL().LIZIZ(i, LJJI);
        C115284fk.LJ(i, LJJI, iDcS364S0100000_1);
    }

    public final void LJIIJJI(List uidList, java.util.Map map, AnonymousClass379 anonymousClass379) {
        o.LJIIIZ(uidList, "uidList");
        List LJJIFFI = C1GE.LJJIFFI(uidList);
        if (LJJIFFI.isEmpty()) {
            return;
        }
        C115284fk.LJIILIIL().getClass();
        if (C63308Osy.LJI().LIZLLL().LJJLIIIJL) {
            C63383OuB LJFF = C63308Osy.LJI().LJFF();
            LJFF.getClass();
            XKX.LIZLLL(LJFF.LJIIL, null, null, new C75632xz(LJFF, 1, LJJIFFI, null, map, anonymousClass379, null), 3);
            return;
        }
        C63356Otk.LJIIIZ().getClass();
        C63559Ox1 c63559Ox1 = new C63559Ox1(anonymousClass379);
        if (LJJIFFI.isEmpty()) {
            return;
        }
        if (!LJJIFFI.contains(Long.valueOf(C63308Osy.LJI().LIZIZ().getUid()))) {
            ListProtector.add(LJJIFFI, 0, Long.valueOf(C63308Osy.LJI().LIZIZ().getUid()));
        }
        c63559Ox1.LJIILIIL(1, AbstractC63505Ow9.LIZIZ, LJJIFFI, map);
    }

    public final void LJIJ(String str, long j, int i, InterfaceC86963bA interfaceC86963bA) {
        C63356Otk.LJIIIZ().getClass();
        C63356Otk.LJ(1, str, j, i, interfaceC86963bA);
    }

    public final void LJIILJJIL(long j, EnumC63479Ovj enumC63479Ovj, EnumC96113pv[] enumC96113pvArr, Boolean bool, C86943b8 c86943b8) {
        synchronized (C115284fk.LJIILIIL()) {
            C63356Otk.LJIIIZ().getClass();
            C63356Otk.LJFF(j, enumC63479Ovj, enumC96113pvArr, bool, c86943b8);
        }
    }
}
