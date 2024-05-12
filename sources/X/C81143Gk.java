package X;

import Y.ACallableS104S0100000_1;
import Y.ACallableS53S0300000_1;
import Y.AfS18S1000000_1;
import android.util.LruCache;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import djb.IDaS20S0000000_1;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.CoroutineExceptionHandler;
import ujb.s;

/* renamed from: X.3Gk, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C81143Gk {
    public static final C81143Gk LIZ = new C81143Gk();
    public static final ConcurrentHashMap<String, CopyOnWriteArraySet<InterfaceC81223Gs>> LIZIZ = new ConcurrentHashMap<>();
    public static final LruCache<String, ConcurrentHashMap<String, C81243Gu>> LIZJ = new LruCache<>(50);
    public static final LruCache<String, List<C81243Gu>> LIZLLL = new LruCache<>(50);
    public static final LruCache<String, String> LJ = new LruCache<>(50);
    public static final ConcurrentHashMap<String, AbstractC90763hI> LJFF = new ConcurrentHashMap<>();
    public static final C62822Ol8 LJI = C221108m2.LIZIZ(C81213Gr.LJLIL);

    public static List LIZLLL(String conversationId) {
        o.LJIIIZ(conversationId, "conversationId");
        String str = LJ.get(conversationId);
        if (str != null) {
            return s.LJLJJI(str, new char[]{','}, false, 6);
        }
        return C61878OQg.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0081, code lost:
    
        if (r0 != null) goto L22;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [X.3Gm] */
    /* JADX WARN: Type inference failed for: r2v0, types: [T, X.3Gu] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C81243Gu LIZ(X.EnumC81073Gd r9, final X.C81183Go r10, final X.InterfaceC81233Gt r11) {
        /*
            java.lang.String r0 = "mode"
            kotlin.jvm.internal.o.LJIIIZ(r9, r0)
            X.2mC r3 = new X.2mC
            r3.<init>()
            X.3Gu r2 = new X.3Gu
            java.lang.String r1 = r10.LIZIZ
            java.lang.String r0 = r10.LIZJ
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r2.<init>(r1, r0)
            r3.element = r2
            java.lang.String r0 = r10.LIZ
            r8 = 0
            if (r0 != 0) goto L26
            if (r11 == 0) goto L25
            X.3Gp r0 = X.EnumC81193Gp.Default
            r11.LIZ(r2, r0)
        L25:
            return r8
        L26:
            com.ss.android.ugc.aweme.im.service.model.IMUser r0 = X.C44384HbQ.LJLIIIL(r2)
            if (r0 != 0) goto L3d
            java.lang.String r4 = r10.LIZIZ
            java.lang.String r0 = r10.LIZJ
            java.lang.String r2 = java.lang.String.valueOf(r0)
            X.3Gn r1 = new X.3Gn
            r1.<init>()
            r0 = 0
            X.C80533Eb.LJIIJJI(r4, r2, r0, r1)
        L3d:
            java.lang.String r1 = r10.LIZ
            java.lang.String r0 = "conversationId"
            kotlin.jvm.internal.o.LJIIIZ(r1, r0)
            X.3hI r2 = X.C81273Gx.LIZ(r1)
            android.util.LruCache<java.lang.String, java.util.List<X.3Gu>> r1 = X.C81143Gk.LIZLLL
            java.lang.String r0 = r10.LIZ
            java.lang.Object r0 = r1.get(r0)
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L9e
            java.util.Iterator r7 = r0.iterator()
        L58:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L9c
            java.lang.Object r0 = r7.next()
            r1 = r0
            X.3Gu r1 = (X.C81243Gu) r1
            java.lang.String r6 = r10.LIZIZ
            X.OpR r1 = r1.getMember()
            if (r1 == 0) goto L9a
            long r4 = r1.getUid()
            java.lang.Long r1 = java.lang.Long.valueOf(r4)
            java.lang.String r1 = r1.toString()
        L79:
            boolean r1 = kotlin.jvm.internal.o.LJ(r6, r1)
            if (r1 == 0) goto L58
        L7f:
            X.3Gu r0 = (X.C81243Gu) r0
            if (r0 == 0) goto L9e
        L83:
            T r2 = r3.element
            X.3Gu r2 = (X.C81243Gu) r2
            X.OpR r1 = r0.getMember()
            r2.setMember(r1)
            if (r11 == 0) goto L95
            X.3Gp r1 = X.EnumC81193Gp.UpdateMember
            r11.LIZ(r0, r1)
        L95:
            T r0 = r3.element
            X.3Gu r0 = (X.C81243Gu) r0
            return r0
        L9a:
            r1 = r8
            goto L79
        L9c:
            r0 = r8
            goto L7f
        L9e:
            android.util.LruCache<java.lang.String, java.util.concurrent.ConcurrentHashMap<java.lang.String, X.3Gu>> r1 = X.C81143Gk.LIZJ
            java.lang.String r0 = r10.LIZ
            java.lang.Object r1 = r1.get(r0)
            java.util.concurrent.ConcurrentHashMap r1 = (java.util.concurrent.ConcurrentHashMap) r1
            if (r1 == 0) goto Lb5
            java.lang.String r0 = r10.LIZIZ
            java.lang.Object r0 = r1.get(r0)
            X.3Gu r0 = (X.C81243Gu) r0
            if (r0 == 0) goto Lb5
            goto L83
        Lb5:
            X.3Gd r0 = X.EnumC81073Gd.AT_MOST_DB
            if (r9 != r0) goto Lc4
            java.lang.String r1 = r10.LIZIZ
            X.3Gm r0 = new X.3Gm
            r0.<init>()
            r2.LJIIIZ(r1, r0)
        Lc3:
            return r8
        Lc4:
            if (r11 == 0) goto Lc3
            T r1 = r3.element
            X.3Gu r1 = (X.C81243Gu) r1
            X.3Gp r0 = X.EnumC81193Gp.UpdateMember
            r11.LIZ(r1, r0)
            goto Lc3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C81143Gk.LIZ(X.3Gd, X.3Go, X.3Gt):X.3Gu");
    }

    public static void LJ(EnumC81123Gi reason, String conversationId, List imMemberList) {
        o.LJIIIZ(reason, "reason");
        o.LJIIIZ(conversationId, "conversationId");
        o.LJIIIZ(imMemberList, "imMemberList");
        LIZLLL.put(conversationId, imMemberList);
        CopyOnWriteArraySet<InterfaceC81223Gs> copyOnWriteArraySet = LIZIZ.get(conversationId);
        if (copyOnWriteArraySet != null) {
            Iterator<InterfaceC81223Gs> it = copyOnWriteArraySet.iterator();
            o.LJIIIIZZ(it, "set.iterator()");
            while (it.hasNext()) {
                it.next().QK(reason, conversationId, imMemberList);
            }
        }
        ConcurrentHashMap<String, C81243Gu> concurrentHashMap = new ConcurrentHashMap<>();
        Iterator it2 = imMemberList.iterator();
        while (it2.hasNext()) {
            C81243Gu c81243Gu = (C81243Gu) it2.next();
            concurrentHashMap.put(c81243Gu.getUid(), c81243Gu);
        }
        LIZJ.put(conversationId, concurrentHashMap);
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("setMemberList for ");
        LIZ2.append(conversationId);
        LIZ2.append(" from : ");
        LIZ2.append(reason);
        C34B.LIZIZ("GroupMemberLoader", X1D.LIZIZ(LIZ2));
    }

    public static void LIZIZ(String str, List list, XKW xkw, XKW xkw2, InterfaceC80883Fk interfaceC80883Fk) {
        XKX.LIZLLL(C48841JEv.LIZ(xkw.plus(new IDaS20S0000000_1(CoroutineExceptionHandler.LJJJJIZL, 24))), null, null, new C81103Gg(list, interfaceC80883Fk, xkw2, str, null), 3);
    }

    public static void LIZJ(C81143Gk c81143Gk, String conversationId, InterfaceC81223Gs interfaceC81223Gs, InterfaceC80883Fk imUserDao, int i) {
        XIA ioDispatcher;
        AbstractC78621UtN mainDispatcher;
        InterfaceC81223Gs interfaceC81223Gs2;
        Integer num = null;
        if ((i & 2) != 0) {
            interfaceC81223Gs = null;
        }
        if ((i & 4) != 0) {
            ioDispatcher = C78613UtF.LIZJ;
        } else {
            ioDispatcher = null;
        }
        if ((i & 8) != 0) {
            mainDispatcher = C36636EZk.LIZ;
        } else {
            mainDispatcher = null;
        }
        if ((i & 16) != 0) {
            imUserDao = C80853Fh.LJ();
        }
        c81143Gk.getClass();
        o.LJIIIZ(conversationId, "conversationId");
        o.LJIIIZ(ioDispatcher, "ioDispatcher");
        o.LJIIIZ(mainDispatcher, "mainDispatcher");
        o.LJIIIZ(imUserDao, "imUserDao");
        List<C81243Gu> cache = LIZLLL.get(conversationId);
        if (interfaceC81223Gs != null) {
            final WeakReference weakReference = new WeakReference(interfaceC81223Gs);
            interfaceC81223Gs2 = new InterfaceC81223Gs() { // from class: X.3Gl
                @Override // X.InterfaceC81223Gs
                public final void Qj0(String str) {
                    InterfaceC81223Gs interfaceC81223Gs3 = weakReference.get();
                    if (interfaceC81223Gs3 != null) {
                        interfaceC81223Gs3.Qj0(str);
                    }
                }

                @Override // X.InterfaceC81223Gs
                public final void QK(EnumC81123Gi reason, String conversationId2, List memberList) {
                    o.LJIIIZ(conversationId2, "conversationId");
                    o.LJIIIZ(memberList, "memberList");
                    o.LJIIIZ(reason, "reason");
                    InterfaceC81223Gs interfaceC81223Gs3 = weakReference.get();
                    if (interfaceC81223Gs3 != null) {
                        interfaceC81223Gs3.QK(reason, conversationId2, memberList);
                        if (C76800UCe.LIZ != null) {
                            return;
                        }
                    }
                    C81143Gk.LIZ.getClass();
                    CopyOnWriteArraySet<InterfaceC81223Gs> copyOnWriteArraySet = C81143Gk.LIZIZ.get(conversationId2);
                    if (copyOnWriteArraySet != null) {
                        copyOnWriteArraySet.remove(this);
                    }
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("unregister:");
                    LIZ2.append(conversationId2);
                    C34B.LIZIZ("GroupMemberLoader", X1D.LIZIZ(LIZ2));
                }
            };
            ConcurrentHashMap<String, CopyOnWriteArraySet<InterfaceC81223Gs>> concurrentHashMap = LIZIZ;
            CopyOnWriteArraySet<InterfaceC81223Gs> copyOnWriteArraySet = concurrentHashMap.get(conversationId);
            if (copyOnWriteArraySet == null) {
                copyOnWriteArraySet = new CopyOnWriteArraySet<>();
            }
            copyOnWriteArraySet.add(interfaceC81223Gs2);
            concurrentHashMap.put(conversationId, copyOnWriteArraySet);
        } else {
            interfaceC81223Gs2 = null;
        }
        StringBuilder LIZIZ2 = C25620zW.LIZIZ("getGroupMemberList conversation id = ", conversationId, " cache size = ");
        if (cache != null) {
            num = Integer.valueOf(cache.size());
        }
        LIZIZ2.append(num);
        C34B.LJI("GroupMemberLoader", X1D.LIZIZ(LIZIZ2));
        if (cache == null || cache.isEmpty()) {
            ConcurrentHashMap<String, AbstractC90763hI> concurrentHashMap2 = LJFF;
            final AbstractC90763hI abstractC90763hI = concurrentHashMap2.get(conversationId);
            if (abstractC90763hI == null) {
                abstractC90763hI = C81273Gx.LIZ(conversationId);
                final String str = ((C120184ne) abstractC90763hI).LIZIZ;
                abstractC90763hI.LJIIL(new C4WU() { // from class: X.3Gj
                    @Override // X.InterfaceC120024nO
                    public final int JG() {
                        return -100;
                    }

                    @Override // X.InterfaceC120024nO
                    public final void hW(int i2, String str2) {
                    }

                    @Override // X.InterfaceC120024nO
                    public final void tq0(int i2, String str2, List list) {
                    }

                    @Override // X.InterfaceC120024nO
                    public final void BH(List<C63089OpR> list) {
                        Integer num2;
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append("onRemoveMember, list.size = ");
                        if (list != null) {
                            num2 = Integer.valueOf(list.size());
                        } else {
                            num2 = null;
                        }
                        LIZ2.append(num2);
                        C34B.LIZIZ("GroupMemberLoader", X1D.LIZIZ(LIZ2));
                        C81143Gk c81143Gk2 = C81143Gk.LIZ;
                        String str2 = str;
                        c81143Gk2.getClass();
                        if (str2 == null || str2.length() == 0 || list == null || list.isEmpty()) {
                            return;
                        }
                        List<C81243Gu> list2 = C81143Gk.LIZLLL.get(str2);
                        o.LJIIIIZZ(list2, "groupMemberFullList[conversationId]");
                        ArrayList arrayList = new ArrayList();
                        for (Object obj : list2) {
                            if (!ORZ.LJLJJI(((C81243Gu) obj).getMember(), list)) {
                                arrayList.add(obj);
                            }
                        }
                        C81143Gk c81143Gk3 = C81143Gk.LIZ;
                        EnumC81123Gi enumC81123Gi = EnumC81123Gi.RemoveMember;
                        c81143Gk3.getClass();
                        C81143Gk.LJ(enumC81123Gi, str2, arrayList);
                    }

                    @Override // X.InterfaceC120024nO
                    public final void CN(C63120Opw c63120Opw) {
                        String str2;
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append("onLeaveConversation, conversationId = ");
                        if (c63120Opw != null) {
                            str2 = c63120Opw.getConversationId();
                        } else {
                            str2 = null;
                        }
                        LIZ2.append(str2);
                        C34B.LIZIZ("GroupMemberLoader", X1D.LIZIZ(LIZ2));
                        C81143Gk.LIZLLL.remove(str);
                        C81143Gk.LIZJ.remove(str);
                    }

                    @Override // X.InterfaceC120024nO
                    public final void DH(List<C63089OpR> list) {
                        Integer num2;
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append("onAddMember, list.size = ");
                        if (list != null) {
                            num2 = Integer.valueOf(list.size());
                        } else {
                            num2 = null;
                        }
                        LIZ2.append(num2);
                        C34B.LIZIZ("GroupMemberLoader", X1D.LIZIZ(LIZ2));
                        C81143Gk c81143Gk2 = C81143Gk.LIZ;
                        String str2 = str;
                        c81143Gk2.getClass();
                        if (list == null || list.isEmpty()) {
                            return;
                        }
                        List<C81243Gu> list2 = C81143Gk.LIZLLL.get(str2);
                        o.LJIIIIZZ(list2, "groupMemberFullList[conversationId]");
                        List LLJILJILJ = ORZ.LLJILJILJ(list2);
                        ArrayList arrayList = new ArrayList(C32I.LJJL(LLJILJILJ, 10));
                        Iterator it = ((ArrayList) LLJILJILJ).iterator();
                        while (it.hasNext()) {
                            arrayList.add(((C81243Gu) it.next()).getUid());
                        }
                        C78999UzT.LJFF(AbstractC73638SvC.LJIILLIIL(new ACallableS53S0300000_1(list, arrayList, LLJILJILJ, 1)).LJJIIJ(T16.LIZ()).LJIJJ(C73969T1h.LIZIZ()).LJJII(new AfS18S1000000_1(str2, 1), new InterfaceC64592gB() { // from class: X.2qz
                            @Override // X.InterfaceC64592gB
                            public final void accept(Object obj) {
                                Throwable it2 = (Throwable) obj;
                                o.LJIIIIZZ(it2, "it");
                                C34B.LJ("GroupMemberLoader", it2);
                            }
                        }), (C73318Sq2) C81143Gk.LJI.getValue());
                    }

                    @Override // X.InterfaceC120024nO
                    public final void MO(List<C63089OpR> list) {
                        Integer num2;
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append("onUpdate, list.size = ");
                        if (list != null) {
                            num2 = Integer.valueOf(list.size());
                        } else {
                            num2 = null;
                        }
                        LIZ2.append(num2);
                        C34B.LIZIZ("GroupMemberLoader", X1D.LIZIZ(LIZ2));
                        C81143Gk c81143Gk2 = C81143Gk.LIZ;
                        String str2 = str;
                        c81143Gk2.getClass();
                        if (str2 == null || str2.length() == 0 || list == null || list.isEmpty()) {
                            return;
                        }
                        List<C81243Gu> updateMemberToCache$lambda$10 = C81143Gk.LIZLLL.get(str2);
                        o.LJIIIIZZ(updateMemberToCache$lambda$10, "updateMemberToCache$lambda$10");
                        for (C81243Gu c81243Gu : updateMemberToCache$lambda$10) {
                            C63089OpR member = c81243Gu.getMember();
                            o.LJIIIZ(list, "<this>");
                            int indexOf = list.indexOf(member);
                            if (indexOf > -1) {
                                c81243Gu.setMember((C63089OpR) ListProtector.get(list, indexOf));
                            }
                        }
                        C81143Gk c81143Gk3 = C81143Gk.LIZ;
                        EnumC81123Gi enumC81123Gi = EnumC81123Gi.UpdateMember;
                        c81143Gk3.getClass();
                        C81143Gk.LJ(enumC81123Gi, str2, updateMemberToCache$lambda$10);
                    }

                    @Override // X.InterfaceC120024nO
                    public final void Tu(C63120Opw c63120Opw) {
                        String str2;
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append("onDissolveConversation, conversationId = ");
                        if (c63120Opw != null) {
                            str2 = c63120Opw.getConversationId();
                        } else {
                            str2 = null;
                        }
                        LIZ2.append(str2);
                        C34B.LIZIZ("GroupMemberLoader", X1D.LIZIZ(LIZ2));
                    }

                    @Override // X.InterfaceC120024nO
                    public final void f3(C63120Opw c63120Opw) {
                        String str2;
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append("onDeleteConversation, conversationId = ");
                        if (c63120Opw != null) {
                            str2 = c63120Opw.getConversationId();
                        } else {
                            str2 = null;
                        }
                        LIZ2.append(str2);
                        C34B.LIZIZ("GroupMemberLoader", X1D.LIZIZ(LIZ2));
                    }

                    @Override // X.InterfaceC120024nO
                    public final void we0(C63120Opw c63120Opw) {
                        String str2;
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append("onCreateConversation, conversationId = ");
                        if (c63120Opw != null) {
                            str2 = c63120Opw.getConversationId();
                        } else {
                            str2 = null;
                        }
                        LIZ2.append(str2);
                        C34B.LIZIZ("GroupMemberLoader", X1D.LIZIZ(LIZ2));
                    }

                    @Override // X.InterfaceC120024nO
                    public final void Mi(String conversationId2, List<C63089OpR> list) {
                        Integer num2;
                        o.LJIIIZ(conversationId2, "conversationId");
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append("onLoadMember, conversationId = ");
                        LIZ2.append(conversationId2);
                        LIZ2.append(" list.size = ");
                        if (list != null) {
                            num2 = Integer.valueOf(list.size());
                        } else {
                            num2 = null;
                        }
                        LIZ2.append(num2);
                        C34B.LIZIZ("GroupMemberLoader", X1D.LIZIZ(LIZ2));
                        C81143Gk.LIZ.getClass();
                        if (list != null && (!list.isEmpty())) {
                            C78999UzT.LJFF(AbstractC73638SvC.LJIILLIIL(new ACallableS104S0100000_1(list, 19)).LJJIIJ(T16.LIZ()).LJIJJ(C73969T1h.LIZIZ()).LJJII(new AfS18S1000000_1(conversationId2, 2), new InterfaceC64592gB() { // from class: X.2qy
                                @Override // X.InterfaceC64592gB
                                public final void accept(Object obj) {
                                    StringBuilder LIZ3 = X1D.LIZ();
                                    LIZ3.append("fetchMemberInfo error: ");
                                    LIZ3.append(obj);
                                    C34B.LIZIZ("GroupMemberLoader", X1D.LIZIZ(LIZ3));
                                }
                            }), (C73318Sq2) C81143Gk.LJI.getValue());
                        } else {
                            C34B.LIZIZ("GroupMemberLoader", "fetchMemberInfo memberList == null");
                        }
                    }

                    @Override // X.InterfaceC120024nO
                    public final void y9(int i2, C63120Opw c63120Opw) {
                        String str2;
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append("onUpdateConversation, conversationId = ");
                        if (c63120Opw != null) {
                            str2 = c63120Opw.getConversationId();
                        } else {
                            str2 = null;
                        }
                        LIZ2.append(str2);
                        LIZ2.append(" reason = ");
                        LIZ2.append(i2);
                        C34B.LIZIZ("GroupMemberLoader", X1D.LIZIZ(LIZ2));
                        AbstractC90763hI.this.LJIIJ();
                        if (C81253Gv.LIZ() && c63120Opw != null) {
                            if ((i2 == 10 || i2 == 5) && c63120Opw.getLocalExt().get("a:recent_mentions") != null) {
                                String str3 = c63120Opw.getLocalExt().get("a:recent_mentions");
                                LruCache<String, String> lruCache = C81143Gk.LJ;
                                if (!o.LJ(str3, lruCache.get(c63120Opw.getConversationId()))) {
                                    lruCache.put(c63120Opw.getConversationId(), c63120Opw.getLocalExt().get("a:recent_mentions"));
                                    CopyOnWriteArraySet<InterfaceC81223Gs> copyOnWriteArraySet2 = C81143Gk.LIZIZ.get(c63120Opw.getConversationId());
                                    if (copyOnWriteArraySet2 != null) {
                                        Iterator<InterfaceC81223Gs> it = copyOnWriteArraySet2.iterator();
                                        while (it.hasNext()) {
                                            InterfaceC81223Gs next = it.next();
                                            String conversationId2 = c63120Opw.getConversationId();
                                            o.LJIIIIZZ(conversationId2, "conv.conversationId");
                                            next.Qj0(conversationId2);
                                        }
                                    }
                                }
                            }
                        }
                    }
                });
                concurrentHashMap2.put(conversationId, abstractC90763hI);
            }
            abstractC90763hI.LJIIJ();
            return;
        }
        o.LJIIIIZZ(cache, "cache");
        LIZIZ(conversationId, cache, ioDispatcher, mainDispatcher, imUserDao);
        if (interfaceC81223Gs2 == null) {
            return;
        }
        interfaceC81223Gs2.QK(EnumC81123Gi.ReadFromCache, conversationId, cache);
    }
}
