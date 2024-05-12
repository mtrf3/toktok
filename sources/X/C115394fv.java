package X;

import Y.ARunnableS29S0200000_10;
import Y.IDbS398S0100000_1;
import Y.IDcS14S1100000_10;
import Y.IDcS364S0100000_1;
import Y.IDcS406S0100000_1;
import Y.IDcS407S0100000_10;
import android.text.TextUtils;
import android.util.LruCache;
import com.bytedance.im.core.proto.BatchMarkConversationReadRequestBody;
import com.bytedance.im.core.proto.GetStrangerMessagesRequestBody;
import com.bytedance.im.core.proto.MessageBody;
import com.bytedance.im.core.proto.ResponseBody;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: X.4fv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C115394fv {
    public static volatile C115394fv LJ;
    public InterfaceC83423Pe LIZIZ;
    public final java.util.Set<C4W7> LIZ = new HashSet();
    public final LruCache<String, C63120Opw> LIZJ = new LruCache<>(C63308Osy.LJI().LIZLLL().LJJIJIL);
    public final java.util.Set<String> LIZLLL = new CopyOnWriteArraySet();

    public static C115394fv LJII() {
        if (LJ == null) {
            synchronized (C115394fv.class) {
                if (LJ == null) {
                    LJ = new C115394fv();
                }
            }
        }
        return LJ;
    }

    public final void LJ() {
        C63322OtC.LJFF("StrangerManager getStrangerBox");
        if (C63308Osy.LJI().LIZLLL().LJLJJL) {
            LJIIIZ();
        } else {
            new C63529OwX(new AbstractC75682y4<List<C63120Opw>>() { // from class: X.4N3
                @Override // X.InterfaceC86963bA
                public final void LIZIZ(C63623Oy3 c63623Oy3) {
                    C63322OtC.LIZLLL("StrangerManager getStrangerBox onFailure");
                    C115394fv.this.LJIIIZ();
                }

                @Override // X.AbstractC75682y4
                public final void LIZJ(long j, Object obj, boolean z) {
                    Integer valueOf;
                    List list = (List) obj;
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("StrangerManager getStrangerBox onSuccess, result:");
                    if (list == null) {
                        valueOf = null;
                    } else {
                        valueOf = Integer.valueOf(list.size());
                    }
                    LIZ.append(valueOf);
                    C63322OtC.LJFF(X1D.LIZIZ(LIZ));
                    C115394fv.this.LJIIIZ();
                }
            }).LJIILIIL(0L, C63308Osy.LJI().LIZLLL().LJLJI);
        }
    }

    public final void LJIIIZ() {
        C63322OtC.LJFF("StrangerManager loadStrangerBoxFromLocal");
        RunnableC63345OtZ.LJ(new InterfaceC63352Otg<C3LB>() { // from class: X.4N4
            @Override // X.InterfaceC63352Otg
            public final C3LB LIZIZ() {
                C63120Opw c63120Opw;
                C4N5 c4n5 = C63308Osy.LJI().LIZLLL().LJJLIIIJ;
                List LJIILIIL = C63133Oq9.LJIILIIL(-1, -1L, EnumC97443s4.ALL);
                ArrayList arrayList = (ArrayList) LJIILIIL;
                if (arrayList.size() > 0) {
                    c63120Opw = (C63120Opw) ListProtector.get(LJIILIIL, 0);
                } else {
                    c63120Opw = null;
                }
                if (c4n5 != null) {
                    c4n5.isEnabled();
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        C63120Opw c63120Opw2 = (C63120Opw) it.next();
                        if (c63120Opw2.isFiltered()) {
                            arrayList3.add(c63120Opw2);
                        } else {
                            arrayList2.add(c63120Opw2);
                        }
                    }
                    return new C3LB(arrayList2, arrayList3, c63120Opw);
                }
                return new C3LB(LJIILIIL, new ArrayList(), c63120Opw);
            }
        }, new IDbS398S0100000_1(this, 10), false);
    }

    public final void LJIIJ() {
        Iterator it = ((HashSet) this.LIZ).iterator();
        while (it.hasNext()) {
            C4W9 c4w9 = ((C4W7) it.next()).LIZIZ;
            if (c4w9 != null) {
                c4w9.vq0();
            }
        }
    }

    public static boolean LJIIIIZZ(MessageBody messageBody) {
        if (messageBody != null && messageBody.message_type.intValue() == EnumC63179Oqt.MESSAGE_TYPE_MODE_CHANGE.getValue()) {
            return true;
        }
        return false;
    }

    public final C63120Opw LIZLLL(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        C63120Opw c63120Opw = this.LIZJ.get(str);
        if (c63120Opw == null) {
            java.util.Set<C4W7> set = this.LIZ;
            if (set != null) {
                Iterator it = ((HashSet) set).iterator();
                while (it.hasNext()) {
                    C4W7 c4w7 = (C4W7) it.next();
                    c4w7.getClass();
                    if (TextUtils.isEmpty(str)) {
                        c63120Opw = null;
                    } else {
                        c63120Opw = c4w7.LIZ.get(str);
                        if (c63120Opw != null) {
                            this.LIZJ.put(str, c63120Opw);
                            break;
                        }
                    }
                }
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("StrangerManager getConversation null ");
            LIZ.append(str);
            C63322OtC.LIZLLL(X1D.LIZIZ(LIZ));
        }
        return c63120Opw;
    }

    public final void LJIIJJI(EnumC97443s4 enumC97443s4) {
        C4W9 c4w9;
        boolean z;
        C63322OtC.LJFF("StrangerManager onDeleteAllConversation");
        this.LIZJ.evictAll();
        Iterator it = ((HashSet) this.LIZ).iterator();
        while (it.hasNext()) {
            C4W7 c4w7 = (C4W7) it.next();
            EnumC97443s4 enumC97443s42 = c4w7.LJI;
            if (enumC97443s4 == enumC97443s42) {
                C63322OtC.LJFF("StrangerListModel onDeleteAllConversation");
                c4w7.LIZ.clear();
                C4W9 c4w92 = c4w7.LIZIZ;
                if (c4w92 != null) {
                    c4w92.Gy();
                }
            } else if (enumC97443s42 == EnumC97443s4.ALL && c4w7.LJII) {
                Iterator<Map.Entry<String, C63120Opw>> it2 = c4w7.LIZ.entrySet().iterator();
                boolean z2 = false;
                while (it2.hasNext()) {
                    boolean isFiltered = it2.next().getValue().isFiltered();
                    if (enumC97443s4 == EnumC97443s4.FILTERED) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (isFiltered == z) {
                        it2.remove();
                        z2 = true;
                    }
                }
                if (z2 && (c4w9 = c4w7.LIZIZ) != null) {
                    c4w9.Gy();
                }
            }
        }
        LJ();
    }

    public final void LJIIL(C63120Opw c63120Opw) {
        String conversationId;
        String conversationId2;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("StrangerManager onDeleteConversation:");
        if (c63120Opw == null) {
            conversationId = null;
        } else {
            conversationId = c63120Opw.getConversationId();
        }
        LIZ.append(conversationId);
        C63322OtC.LJFF(X1D.LIZIZ(LIZ));
        if (c63120Opw != null) {
            this.LIZJ.remove(c63120Opw.getConversationId());
        }
        Iterator it = ((HashSet) this.LIZ).iterator();
        while (it.hasNext()) {
            C4W7 c4w7 = (C4W7) it.next();
            c4w7.getClass();
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("StrangerListModel onDeleteConversation:");
            if (c63120Opw == null) {
                conversationId2 = null;
            } else {
                conversationId2 = c63120Opw.getConversationId();
            }
            LIZ2.append(conversationId2);
            C63322OtC.LJFF(X1D.LIZIZ(LIZ2));
            if (c63120Opw != null) {
                c4w7.LIZ.remove(c63120Opw.getConversationId());
                C4W9 c4w9 = c4w7.LIZIZ;
                if (c4w9 != null) {
                    c4w9.f3(c63120Opw);
                }
            }
        }
    }

    public final void LJIILIIL(String str) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("StrangerManager onStrangerTransferred:");
        LIZ.append(str);
        C63322OtC.LJFF(X1D.LIZIZ(LIZ));
        ((CopyOnWriteArraySet) this.LIZLLL).remove(str);
        Iterator it = ((HashSet) this.LIZ).iterator();
        while (it.hasNext()) {
            C4W7 c4w7 = (C4W7) it.next();
            c4w7.getClass();
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("StrangerListModel onStrangerTransfer: ");
            LIZ2.append(str);
            C63322OtC.LJFF(X1D.LIZIZ(LIZ2));
            c4w7.LIZ.remove(str);
        }
    }

    public final void LJIILL(C63120Opw c63120Opw) {
        String conversationId;
        String conversationId2;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("StrangerManager updateMemoryConversation:");
        if (c63120Opw == null) {
            conversationId = null;
        } else {
            conversationId = c63120Opw.getConversationId();
        }
        LIZ.append(conversationId);
        C63322OtC.LJFF(X1D.LIZIZ(LIZ));
        if (c63120Opw != null) {
            this.LIZJ.put(c63120Opw.getConversationId(), c63120Opw);
        }
        Iterator it = ((HashSet) this.LIZ).iterator();
        while (it.hasNext()) {
            C4W7 c4w7 = (C4W7) it.next();
            c4w7.getClass();
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("StrangerListModel updateMemoryConversation:");
            if (c63120Opw == null) {
                conversationId2 = null;
            } else {
                conversationId2 = c63120Opw.getConversationId();
            }
            LIZ2.append(conversationId2);
            C63322OtC.LJFF(X1D.LIZIZ(LIZ2));
            if (c63120Opw != null) {
                c4w7.LIZ.put(c63120Opw.getConversationId(), c63120Opw);
            }
        }
    }

    public final void LIZ(List<C63120Opw> list, EnumC97443s4 enumC97443s4) {
        C63508OwC c63508OwC = new C63508OwC(new IDcS364S0100000_1(this, enumC97443s4, 27));
        ArrayList arrayList = (ArrayList) list;
        if (arrayList.isEmpty()) {
            return;
        }
        c63508OwC.LIZJ = list;
        int i = 0;
        c63508OwC.LIZLLL = 0;
        ArrayList arrayList2 = new ArrayList();
        Iterator<C63120Opw> it = c63508OwC.LIZJ.iterator();
        while (it.hasNext()) {
            arrayList2.add(it.next().getConversationId());
        }
        RunnableC63345OtZ.LJ(new IDcS407S0100000_10(arrayList2, 15), new IDbS398S0100000_1(c63508OwC, 11), false);
        c63508OwC.LIZLLL(c63508OwC.LIZJ);
        int size = arrayList.size();
        int i2 = 100;
        while (i < size) {
            if (i + i2 > size) {
                i2 = size - i;
            }
            int i3 = i + i2;
            c63508OwC.LJIILIIL(arrayList.subList(i, i3));
            i = i3;
        }
    }

    public final void LIZIZ(List<C63120Opw> list, EnumC97443s4 enumC97443s4) {
        C120134nZ c120134nZ = new C120134nZ(new IDcS364S0100000_1(this, enumC97443s4, 26));
        ArrayList arrayList = (ArrayList) list;
        if (arrayList.isEmpty()) {
            return;
        }
        c120134nZ.LIZJ = list;
        c120134nZ.LIZLLL = 0;
        ArrayList arrayList2 = new ArrayList();
        Iterator<C63120Opw> it = c120134nZ.LIZJ.iterator();
        while (it.hasNext()) {
            arrayList2.add(it.next().getConversationId());
        }
        RunnableC63345OtZ.LJ(new IDcS406S0100000_1(arrayList2, 7), new IDbS398S0100000_1(c120134nZ, 12), false);
        c120134nZ.LIZLLL(c120134nZ.LIZJ);
        int size = arrayList.size();
        int i = 100;
        int i2 = 0;
        while (i2 < size) {
            if (i2 + i > size) {
                i = size - i2;
            }
            int i3 = i2 + i;
            List<C63120Opw> subList = arrayList.subList(i2, i3);
            ArrayList arrayList3 = new ArrayList(subList.size());
            for (C63120Opw c63120Opw : subList) {
                C63462OvS c63462OvS = new C63462OvS();
                c63462OvS.LIZLLL = c63120Opw.getConversationId();
                c63462OvS.LJ = Long.valueOf(c63120Opw.getConversationShortId());
                c63462OvS.LJFF = Integer.valueOf(c63120Opw.getConversationType());
                arrayList3.add(c63462OvS.build());
            }
            C120514oB c120514oB = new C120514oB();
            C63685Oz3.LIZ(arrayList3);
            c120514oB.LIZLLL = arrayList3;
            BatchMarkConversationReadRequestBody build = c120514oB.build();
            C89453Z8v c89453Z8v = new C89453Z8v();
            c89453Z8v.LJJ = build;
            c120134nZ.LJIIJJI(c120134nZ.LIZLLL, c89453Z8v.build(), null, new Object[0]);
            i2 = i3;
        }
    }

    public final void LIZJ(String str, final InterfaceC86963bA<List<C109544Rq>> interfaceC86963bA) {
        if (C63308Osy.LJI().LIZLLL().LJLJJL) {
            interfaceC86963bA.LIZIZ(null);
            return;
        }
        C63120Opw LIZLLL = LIZLLL(str);
        if (LIZLLL == null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("StrangerManager fetchStrangerMessages, but conversation is null, cid:");
            LIZ.append(str);
            C63322OtC.LJFF(X1D.LIZIZ(LIZ));
            interfaceC86963bA.LIZIZ(null);
            return;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("StrangerManager fetchStrangerMessages, cid:");
        LIZ2.append(str);
        C63322OtC.LJFF(X1D.LIZIZ(LIZ2));
        AbstractC63515OwJ<List<C109544Rq>> abstractC63515OwJ = new AbstractC63515OwJ<List<C109544Rq>>(interfaceC86963bA) { // from class: X.4nq
            @Override // X.AbstractC63515OwJ
            public final boolean LJFF() {
                return true;
            }

            {
                int value = EnumC63625Oy5.GET_STRANGER_MESSAGES_IN_CONVERSATION.getValue();
            }

            @Override // X.AbstractC63515OwJ
            public final boolean LJIIIZ(C63622Oy2 c63622Oy2) {
                ResponseBody responseBody = c63622Oy2.LJLJL.body;
                if (responseBody != null && responseBody.get_stranger_messages_body != null) {
                    return true;
                }
                return false;
            }

            @Override // X.AbstractC63515OwJ
            public final void LJII(C63622Oy2 c63622Oy2, ARunnableS29S0200000_10 aRunnableS29S0200000_10) {
                if (c63622Oy2.LJIIJ() && LJIIIZ(c63622Oy2)) {
                    List<MessageBody> list = c63622Oy2.LJLJL.body.get_stranger_messages_body.messages;
                    String LJIIIIZZ = c63622Oy2.LJIIIIZZ();
                    if (list == null || list.isEmpty()) {
                        C63322OtC.LJFF("StrangerMsgHandler saveMsg, null or empty");
                        LIZLLL(null);
                    } else {
                        RunnableC63345OtZ.LIZLLL(new IDcS14S1100000_10(list, LJIIIIZZ, 8), new IDbS398S0100000_1(this, 13), C63346Ota.LIZJ());
                    }
                    C63337OtR.LJII(c63622Oy2, true).LIZ();
                    return;
                }
                LIZIZ(c63622Oy2);
                C63337OtR.LJII(c63622Oy2, false).LIZ();
            }
        };
        int inboxType = LIZLLL.getInboxType();
        long conversationShortId = LIZLLL.getConversationShortId();
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("StrangerMsgHandler get, inbox:");
        LIZ3.append(inboxType);
        LIZ3.append(", shortId:");
        LIZ3.append(conversationShortId);
        C63322OtC.LJFF(X1D.LIZIZ(LIZ3));
        C120554oF c120554oF = new C120554oF();
        c120554oF.LJ = Boolean.FALSE;
        c120554oF.LIZLLL = Long.valueOf(conversationShortId);
        GetStrangerMessagesRequestBody build = c120554oF.build();
        C89453Z8v c89453Z8v = new C89453Z8v();
        c89453Z8v.LJJJJ = build;
        abstractC63515OwJ.LJIIJJI(inboxType, c89453Z8v.build(), null, new Object[0]);
    }

    public final synchronized void LJI(int i, MessageBody messageBody) {
        if (messageBody != null) {
            String str = messageBody.conversation_id;
            LJFF(i, messageBody.conversation_type.intValue(), messageBody.conversation_short_id.longValue(), str);
        }
    }

    public final void LJIILJJIL(int i, C63120Opw c63120Opw) {
        String conversationId;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("StrangerManager onUpdateConversation:");
        if (c63120Opw == null) {
            conversationId = null;
        } else {
            conversationId = c63120Opw.getConversationId();
        }
        LIZ.append(conversationId);
        LIZ.append(", reason:");
        LIZ.append(i);
        C63322OtC.LJFF(X1D.LIZIZ(LIZ));
        if (c63120Opw != null) {
            this.LIZJ.put(c63120Opw.getConversationId(), c63120Opw);
            Iterator it = ((HashSet) this.LIZ).iterator();
            while (it.hasNext()) {
                C4W7 c4w7 = (C4W7) it.next();
                c4w7.getClass();
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("StrangerListModel onUpdateConversation:");
                LIZ2.append(c63120Opw.getConversationId());
                LIZ2.append(", reason:");
                LIZ2.append(i);
                C63322OtC.LJFF(X1D.LIZIZ(LIZ2));
                if (i == 2 || i == 5) {
                    c4w7.LIZ.put(c63120Opw.getConversationId(), c63120Opw);
                    C4W9 c4w9 = c4w7.LIZIZ;
                    if (c4w9 != null) {
                        c4w9.FA(Collections.singletonList(c63120Opw), false);
                    }
                } else if (c4w7.LIZ.containsKey(c63120Opw.getConversationId())) {
                    c4w7.LIZ.put(c63120Opw.getConversationId(), c63120Opw);
                    C4W9 c4w92 = c4w7.LIZIZ;
                    if (c4w92 != null) {
                        c4w92.y9(i, c63120Opw);
                    }
                }
            }
        }
        if (C63308Osy.LJI().LIZLLL().LJLJJL && C63308Osy.LJI().LIZLLL().LJLLJ) {
            LJ();
        }
    }

    public final synchronized void LJFF(int i, int i2, long j, String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("StrangerManager handleStrangerTransfer:");
        LIZ.append(str);
        C63322OtC.LJFF(X1D.LIZIZ(LIZ));
        if (((CopyOnWriteArraySet) this.LIZLLL).contains(str)) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("StrangerManager already transferring, ignore:");
            LIZ2.append(str);
            C63322OtC.LJFF(X1D.LIZIZ(LIZ2));
            return;
        }
        ((CopyOnWriteArraySet) this.LIZLLL).add(str);
        C63120Opw LJIIIZ = C115284fk.LJIILIIL().LJIIIZ(str);
        if (LJIIIZ != null && !LJIIIZ.isStranger()) {
            ((CopyOnWriteArraySet) this.LIZLLL).remove(str);
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("StrangerManager find memory already transferred, ignore:");
            LIZ3.append(str);
            C63322OtC.LJFF(X1D.LIZIZ(LIZ3));
            return;
        }
        RunnableC63345OtZ.LJ(new C115404fw(this, str, i, j, i2), new IDbS398S0100000_1(this, 9), false);
    }
}
