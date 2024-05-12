package X;

import Y.IDComparatorS29S0000000_1;
import Y.IDbS168S0200000_1;
import Y.IDcS135S0200000_1;
import Y.IDcS13S1100000_1;
import Y.IDcS406S0100000_1;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: X.4fk, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C115284fk {
    public static C115284fk LJIIJJI;
    public long LJIIIIZZ;
    public long LJIIIZ;
    public final java.util.Map<String, C63120Opw> LIZ = new ConcurrentHashMap();
    public final java.util.Map<String, C63120Opw> LIZIZ = new ConcurrentHashMap();
    public final java.util.Set<String> LIZJ = new CopyOnWriteArraySet();
    public final java.util.Set<C4WP> LIZLLL = new CopyOnWriteArraySet();
    public final java.util.Map<String, Object> LJ = new ConcurrentHashMap();
    public final Object LJFF = new Object();
    public boolean LJI = false;
    public final java.util.Set<C4WS> LJII = new CopyOnWriteArraySet();
    public final C4WE LJIIJ = new C4WE(this);

    public final synchronized List<C63120Opw> LJIIIIZZ() {
        C63322OtC.LJFF("ConversationListModel getAllConversationSyncNoSort");
        return LJII();
    }

    public static C115284fk LJIILIIL() {
        if (LJIIJJI == null) {
            synchronized (C115284fk.class) {
                if (LJIIJJI == null) {
                    LJIIJJI = new C115284fk();
                }
            }
        }
        return LJIIJJI;
    }

    public final void LIZLLL() {
        C63322OtC.LJFF("ConversationListModel clear");
        ((ConcurrentHashMap) this.LIZ).clear();
        ((ConcurrentHashMap) this.LIZIZ).clear();
        ((ConcurrentHashMap) this.LJ).clear();
        this.LJI = false;
        C4WK LIZIZ = C4WK.LIZIZ();
        ((ConcurrentHashMap) LIZIZ.LIZ).clear();
        ((ConcurrentHashMap) LIZIZ.LIZJ).clear();
        ((ConcurrentHashMap) LIZIZ.LIZIZ).clear();
    }

    public final List<C63120Opw> LJII() {
        ArrayList arrayList = new ArrayList();
        for (C63120Opw c63120Opw : ((ConcurrentHashMap) this.LIZ).values()) {
            if (!c63120Opw.isHide()) {
                arrayList.add(c63120Opw);
            }
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ConversationListModel filterShowList:");
        LIZ.append(arrayList.size());
        C63322OtC.LJFF(X1D.LIZIZ(LIZ));
        return arrayList;
    }

    public static boolean LIZJ(Integer num) {
        if (num != null && num.intValue() == EnumC63552Owu.CONV_NOT_FOUND.getValue() && C63308Osy.LJI().LIZLLL().LJJLL) {
            return true;
        }
        return false;
    }

    public static void LJJ(C63120Opw c63120Opw) {
        if (c63120Opw == null || c63120Opw.getSortOrder() == C63133Oq9.LJII(c63120Opw)) {
            return;
        }
        RunnableC63345OtZ.LJ(new IDcS406S0100000_1(c63120Opw, 1), null, false);
    }

    public static void LJJIFFI(List<C63120Opw> list) {
        if (!list.isEmpty()) {
            C63308Osy.LJI().getClass();
            C63291Osh.LIZ().getClass();
            if (C63291Osh.LIZLLL.getBoolean(C63291Osh.LJIIIZ("allow_conversation_pagination"))) {
                Collections.sort(list, new IDComparatorS29S0000000_1(7));
            } else {
                C63308Osy.LJI().getClass();
                Collections.sort(list, null);
            }
        }
    }

    public static void LJJIII(String str) {
        C63356Otk.LJIIIZ().getClass();
        C63217OrV c63217OrV = new C63217OrV();
        C63120Opw LJIIIZ = LJIILIIL().LJIIIZ(str);
        if (LJIIIZ == null || LJIIIZ.isTemp()) {
            c63217OrV.LIZIZ(C63622Oy2.LIZJ(-1017));
            return;
        }
        if (((CopyOnWriteArraySet) C63269OsL.LIZIZ).contains(str)) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("hasGettingConversation: ");
            LIZ.append(str);
            C63322OtC.LJII(X1D.LIZIZ(LIZ));
            c63217OrV.LIZIZ(C63622Oy2.LIZJ(-1018));
            return;
        }
        int inboxType = LJIIIZ.getInboxType();
        long conversationShortId = LJIIIZ.getConversationShortId();
        int conversationType = LJIIIZ.getConversationType();
        long updatedTime = LJIIIZ.getUpdatedTime();
        synchronized (c63217OrV) {
            c63217OrV.LJIILIIL(inboxType, conversationType, conversationShortId, updatedTime, str, false);
        }
    }

    public final void LIZ(C4WP c4wp) {
        if (c4wp != null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("ConversationListModel addObserver:");
            LIZ.append(c4wp);
            C63322OtC.LJFF(X1D.LIZIZ(LIZ));
            ((CopyOnWriteArraySet) this.LIZLLL).add(c4wp);
        }
    }

    public final void LJI(final C63120Opw c63120Opw) {
        C47922IrO.LIZ();
        LJJI(c63120Opw.getConversationId());
        C63309Osz LIZLLL = C63309Osz.LIZLLL();
        LIZLLL.getClass();
        if (!TextUtils.isEmpty(c63120Opw.getConversationId())) {
            LIZLLL.LIZ(c63120Opw.getConversationId(), new InterfaceC118594l5<InterfaceC120024nO>() { // from class: X.4fm
                @Override // X.InterfaceC118594l5
                public final void invoke(InterfaceC120024nO interfaceC120024nO) {
                    interfaceC120024nO.f3(C63120Opw.this);
                }
            });
        }
        C4WK LIZIZ = C4WK.LIZIZ();
        ((ConcurrentHashMap) LIZIZ.LIZ).remove(c63120Opw.getConversationId());
        ((ConcurrentHashMap) LIZIZ.LIZIZ).remove(c63120Opw.getConversationId());
        ((ConcurrentHashMap) LIZIZ.LIZJ).remove(c63120Opw.getConversationId());
        LIZIZ.LIZLLL();
        Iterator it = ((CopyOnWriteArraySet) this.LIZLLL).iterator();
        while (it.hasNext()) {
            ((InterfaceC120024nO) it.next()).f3(c63120Opw);
        }
    }

    public final C63120Opw LJIIIZ(String str) {
        C63120Opw c63120Opw = (C63120Opw) ((ConcurrentHashMap) this.LIZ).get(str);
        C47922IrO.LIZ();
        if (c63120Opw == null) {
            return C115394fv.LJII().LIZLLL(str);
        }
        return c63120Opw;
    }

    public final C63120Opw LJIIJJI(String str) {
        C63322OtC.LJFF("ConversationListModel getConversation async");
        C63120Opw LJIIIZ = LJIIIZ(str);
        if (LJIIIZ != null) {
            return LJIIIZ;
        }
        C63120Opw LJIIIZ2 = C63133Oq9.LJIIIZ(str, true);
        if (LJIIIZ2 != null) {
            if (LJIIIZ2.isStranger()) {
                C115394fv.LJII().LJIILL(LJIIIZ2);
            } else {
                C47922IrO.LIZ();
                LJIIL(LJIIIZ2);
            }
        }
        return LJIIIZ2;
    }

    public final void LJIIL(C63120Opw... c63120OpwArr) {
        if (c63120OpwArr != null && c63120OpwArr.length > 0) {
            StringBuilder sb = new StringBuilder();
            for (C63120Opw c63120Opw : c63120OpwArr) {
                if (c63120Opw != null) {
                    String conversationId = c63120Opw.getConversationId();
                    sb.append(conversationId);
                    sb.append("_");
                    if (((ConcurrentHashMap) this.LIZ).get(conversationId) != null && ((C63120Opw) ((ConcurrentHashMap) this.LIZ).get(conversationId)).getUpdatedTime() > c63120Opw.getUpdatedTime()) {
                        C63322OtC.LJI("ConversationListModel insertOrUpdateConversation, replace by smaller updateTime, cid:", conversationId, null);
                    }
                    ((ConcurrentHashMap) this.LIZ).put(conversationId, c63120Opw);
                }
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("ConversationListModel insertOrUpdateConversation size:");
            LIZ.append(c63120OpwArr.length);
            LIZ.append(", ids:");
            LIZ.append((Object) sb);
            C63322OtC.LJFF(X1D.LIZIZ(LIZ));
        }
    }

    public final boolean LJIILJJIL(String str) {
        if (!TextUtils.isEmpty(str) && ((CopyOnWriteArraySet) this.LIZJ).contains(str)) {
            return true;
        }
        return false;
    }

    public final void LJIILL(final C63120Opw c63120Opw) {
        if (c63120Opw != null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("ConversationListModel onCreateConversation:");
            LIZ.append(c63120Opw.getConversationId());
            LIZ.append(", isStranger:");
            LIZ.append(c63120Opw.isStranger());
            LIZ.append(", isInBox:");
            LIZ.append(c63120Opw.isInBox());
            C63322OtC.LJFF(X1D.LIZIZ(LIZ));
            if (c63120Opw.isStranger()) {
                LJJI(c63120Opw.getConversationId());
                C115394fv.LJII().LJIILL(c63120Opw);
                return;
            }
            C47922IrO.LIZ();
            LJIIL(c63120Opw);
            C63309Osz LIZLLL = C63309Osz.LIZLLL();
            LIZLLL.getClass();
            if (!TextUtils.isEmpty(c63120Opw.getConversationId())) {
                LIZLLL.LIZ(c63120Opw.getConversationId(), new InterfaceC118594l5<InterfaceC120024nO>() { // from class: X.4fn
                    @Override // X.InterfaceC118594l5
                    public final void invoke(InterfaceC120024nO interfaceC120024nO) {
                        interfaceC120024nO.we0(C63120Opw.this);
                    }
                });
            }
            Iterator it = ((CopyOnWriteArraySet) this.LIZLLL).iterator();
            while (it.hasNext()) {
                ((InterfaceC120024nO) it.next()).we0(c63120Opw);
            }
        }
    }

    public final void LJIILLIIL(C63120Opw c63120Opw) {
        if (c63120Opw != null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("ConversationListModel onDeleteConversation:");
            LIZ.append(c63120Opw.getConversationId());
            LIZ.append(", isStranger:");
            LIZ.append(c63120Opw.isStranger());
            LIZ.append(", isInBox:");
            LIZ.append(c63120Opw.isInBox());
            C63322OtC.LJFF(X1D.LIZIZ(LIZ));
            if (c63120Opw.isStranger()) {
                C115394fv.LJII().LJIIL(c63120Opw);
            } else {
                LJI(c63120Opw);
            }
        }
    }

    public final void LJIIZILJ(final C63120Opw c63120Opw) {
        if (c63120Opw != null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("ConversationListModel onDissolveConversation:");
            LIZ.append(c63120Opw.getConversationId());
            C63322OtC.LJFF(X1D.LIZIZ(LIZ));
            if (((ConcurrentHashMap) this.LIZ).containsKey(c63120Opw.getConversationId())) {
                ((ConcurrentHashMap) this.LIZ).put(c63120Opw.getConversationId(), c63120Opw);
            }
            C63309Osz LIZLLL = C63309Osz.LIZLLL();
            LIZLLL.getClass();
            if (!TextUtils.isEmpty(c63120Opw.getConversationId())) {
                LIZLLL.LIZ(c63120Opw.getConversationId(), new InterfaceC118594l5<InterfaceC120024nO>() { // from class: X.4fo
                    @Override // X.InterfaceC118594l5
                    public final void invoke(InterfaceC120024nO interfaceC120024nO) {
                        interfaceC120024nO.Tu(C63120Opw.this);
                    }
                });
            }
            Iterator it = ((CopyOnWriteArraySet) this.LIZLLL).iterator();
            while (it.hasNext()) {
                ((InterfaceC120024nO) it.next()).Tu(c63120Opw);
            }
            C4WK LIZIZ = C4WK.LIZIZ();
            ((ConcurrentHashMap) LIZIZ.LIZ).remove(c63120Opw.getConversationId());
            ((ConcurrentHashMap) LIZIZ.LIZIZ).remove(c63120Opw.getConversationId());
            ((ConcurrentHashMap) LIZIZ.LIZJ).remove(c63120Opw.getConversationId());
            LIZIZ.LIZLLL();
        }
    }

    public final void LJIJJLI(C63120Opw c63120Opw) {
        if (c63120Opw != null && !((ConcurrentHashMap) this.LJ).isEmpty()) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("ConversationListModel recordConversationWhileSyncing:");
            LIZ.append(c63120Opw.getConversationId());
            C63322OtC.LJFF(X1D.LIZIZ(LIZ));
            ((ConcurrentHashMap) this.LIZIZ).put(c63120Opw.getConversationId(), c63120Opw);
        }
    }

    public final void LJJI(String str) {
        ((ConcurrentHashMap) this.LIZ).remove(str);
        C4WK LIZIZ = C4WK.LIZIZ();
        ((ConcurrentHashMap) LIZIZ.LIZ).remove(str);
        ((ConcurrentHashMap) LIZIZ.LIZJ).remove(str);
        ((ConcurrentHashMap) LIZIZ.LIZIZ).remove(str);
        ((ConcurrentHashMap) this.LIZIZ).remove(str);
    }

    public final void LJJII(C63120Opw c63120Opw) {
        if (c63120Opw != null) {
            if (c63120Opw.isStranger()) {
                C115394fv.LJII().LJIILL(c63120Opw);
                return;
            }
            C47922IrO.LIZ();
        }
        LJIIL(c63120Opw);
        LJIJJLI(c63120Opw);
    }

    public final void LJJIIJ(List<C63120Opw> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (C63120Opw c63120Opw : list) {
            if (CardStruct.IStatusCode.DEFAULT.equals(c63120Opw.getConversationId())) {
                C63322OtC.LJII("ConversationListModel updateLoadedListToMemory dirty conversation");
                arrayList.add(c63120Opw);
                C63337OtR.LJI("im_dirty_sync", c63120Opw.getConversationId());
            }
        }
        if (!arrayList.isEmpty()) {
            list.removeAll(arrayList);
        }
        if (!list.isEmpty()) {
            StringBuilder sb = new StringBuilder();
            for (C63120Opw c63120Opw2 : list) {
                if (c63120Opw2 != null) {
                    String conversationId = c63120Opw2.getConversationId();
                    sb.append(conversationId);
                    sb.append("_");
                    if (((ConcurrentHashMap) this.LIZ).get(conversationId) != null && ((C63120Opw) ((ConcurrentHashMap) this.LIZ).get(conversationId)).getUpdatedTime() > c63120Opw2.getUpdatedTime()) {
                        C63322OtC.LJI("ConversationListModel insertOrUpdateConversation, replace by smaller updateTime, cid:", conversationId, null);
                    }
                    ((ConcurrentHashMap) this.LIZ).put(conversationId, c63120Opw2);
                }
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("ConversationListModel insertOrUpdateConversation size:");
            LIZ.append(list.size());
            LIZ.append(", ids:");
            LIZ.append((Object) sb);
            C63322OtC.LJFF(X1D.LIZIZ(LIZ));
        }
        ((ConcurrentHashMap) this.LIZ).putAll(this.LIZIZ);
        ((ConcurrentHashMap) this.LIZIZ).clear();
        synchronized (this) {
            if (!list.isEmpty()) {
                for (C63120Opw c63120Opw3 : list) {
                    if (c63120Opw3 != null && c63120Opw3.isWaitingInfo()) {
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append("retryWaitingInfoConversations - ");
                        LIZ2.append(c63120Opw3.getConversationId());
                        C63322OtC.LJFF(X1D.LIZIZ(LIZ2));
                        int inboxType = c63120Opw3.getInboxType();
                        String conversationId2 = c63120Opw3.getConversationId();
                        C63269OsL.LIZJ(c63120Opw3.getConversationShortId(), c63120Opw3.getUpdatedTime(), inboxType, c63120Opw3.getConversationType(), conversationId2);
                    }
                }
                C63269OsL.LIZLLL(false);
            }
        }
    }

    public static void LJFF(long j, InterfaceC86963bA interfaceC86963bA) {
        if (C63308Osy.LJI().LIZLLL().LJJLIIIJL) {
            C63383OuB LJFF = C63308Osy.LJI().LJFF();
            XKX.LIZLLL(LJFF.LJIIL, null, null, new C75642y0(LJFF, 0, j, interfaceC86963bA, null), 3);
        } else {
            LJ(0, j, interfaceC86963bA);
        }
    }

    public final void LIZIZ(int i, long j) {
        String LIZJ = C120014nN.LIZJ(i, j, C63308Osy.LJI().LIZIZ().getUid());
        if (LJIIIZ(LIZJ) == null) {
            C63120Opw c63120Opw = new C63120Opw();
            c63120Opw.setInboxType(i);
            c63120Opw.setConversationId(LIZJ);
            c63120Opw.setConversationType(AbstractC63505Ow9.LIZ);
            c63120Opw.setUpdatedTime(System.currentTimeMillis());
            c63120Opw.setMemberCount(2);
            c63120Opw.setIsMember(true);
            LJIILL(c63120Opw);
            RunnableC63345OtZ.LJ(new IDcS406S0100000_1(c63120Opw, 0), null, false);
        }
    }

    public final void LJIIJ(final String str, InterfaceC86963bA<C63120Opw> interfaceC86963bA) {
        C63322OtC.LJFF("ConversationListModel getConversation async");
        C63120Opw LJIIIZ = LJIIIZ(str);
        if (LJIIIZ != null) {
            interfaceC86963bA.onSuccess(LJIIIZ);
        } else {
            RunnableC63345OtZ.LJ(new InterfaceC63352Otg<C63120Opw>() { // from class: X.4fl
                @Override // X.InterfaceC63352Otg
                public final C63120Opw LIZIZ() {
                    return C63133Oq9.LJIIIZ(str, true);
                }
            }, new IDbS168S0200000_1(this, interfaceC86963bA, 0), false);
        }
    }

    public final void LJIJ(final String str, final List<C63089OpR> list) {
        if (list == null) {
            return;
        }
        C63309Osz LIZLLL = C63309Osz.LIZLLL();
        LIZLLL.getClass();
        if (!TextUtils.isEmpty(str)) {
            LIZLLL.LIZ(str, new InterfaceC118594l5<InterfaceC120024nO>() { // from class: X.4fq
                @Override // X.InterfaceC118594l5
                public final void invoke(InterfaceC120024nO interfaceC120024nO) {
                    interfaceC120024nO.Mi(str, list);
                }
            });
        }
        Iterator it = ((CopyOnWriteArraySet) this.LIZLLL).iterator();
        while (it.hasNext()) {
            ((InterfaceC120024nO) it.next()).Mi(str, list);
        }
    }

    public final void LJIJI(int i, C63120Opw c63120Opw) {
        if (c63120Opw != null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("ConversationListModel onUpdateConversation, cid:");
            LIZ.append(c63120Opw.getConversationId());
            LIZ.append(", reason:");
            LIZ.append(i);
            LIZ.append(", isStranger:");
            LIZ.append(c63120Opw.isStranger());
            LIZ.append(", isInBox:");
            LIZ.append(c63120Opw.isInBox());
            C63322OtC.LJFF(X1D.LIZIZ(LIZ));
            LJJ(c63120Opw);
            if (c63120Opw.isStranger()) {
                C115394fv.LJII().LJIILJJIL(i, c63120Opw);
                return;
            }
            C47922IrO.LIZ();
            LJIIL(c63120Opw);
            C63309Osz.LIZLLL().LJIIJ(i, c63120Opw);
            Iterator it = ((CopyOnWriteArraySet) this.LIZLLL).iterator();
            while (it.hasNext()) {
                ((InterfaceC120024nO) it.next()).y9(i, c63120Opw);
            }
            C4WK LIZIZ = C4WK.LIZIZ();
            LIZIZ.getClass();
            ArrayList arrayList = new ArrayList();
            arrayList.add(c63120Opw);
            LIZIZ.LIZJ(arrayList, true);
        }
    }

    public static void LJ(int i, long j, InterfaceC86963bA interfaceC86963bA) {
        if (C63308Osy.LJI().LIZLLL().LJJLIIIJL) {
            C63383OuB LJFF = C63308Osy.LJI().LJFF();
            XKX.LIZLLL(LJFF.LJIIL, null, null, new C75642y0(LJFF, i, j, interfaceC86963bA, null), 3);
            return;
        }
        C63356Otk.LJIIIZ().getClass();
        C63559Ox1 c63559Ox1 = new C63559Ox1(interfaceC86963bA);
        ArrayList arrayList = new ArrayList();
        arrayList.add(Long.valueOf(C63308Osy.LJI().LIZIZ().getUid()));
        arrayList.add(Long.valueOf(j));
        c63559Ox1.LJIILIIL(i, AbstractC63505Ow9.LIZ, arrayList, null);
    }

    public static void LJIL(int i, InterfaceC86963bA interfaceC86963bA, String str) {
        long LIZLLL = C120014nN.LIZLLL(str);
        if (LIZLLL == -1) {
            C63623Oy3 c63623Oy3 = new C63375Ou3().LIZ;
            c63623Oy3.LIZJ = "conversation invalid";
            interfaceC86963bA.LIZIZ(c63623Oy3);
        } else {
            C63323OtD c63323OtD = new C63323OtD();
            c63323OtD.LIZJ("imsdk_conv_shortid_refresh");
            c63323OtD.LIZ(str, "conversation_id");
            c63323OtD.LIZ(Integer.valueOf(i), "imsdk_cmd");
            LJFF(LIZLLL, new IDcS135S0200000_1(c63323OtD, interfaceC86963bA, 2));
        }
    }

    public final void LJIJJ(boolean z, final int i, final C63120Opw... c63120OpwArr) {
        if (c63120OpwArr != null && c63120OpwArr.length > 0) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("ConversationListModel onUpdateConversation, conversations:");
            LIZ.append(c63120OpwArr.length);
            LIZ.append(", reason:");
            LIZ.append(i);
            C63322OtC.LJFF(X1D.LIZIZ(LIZ));
            boolean z2 = false;
            for (C63120Opw c63120Opw : c63120OpwArr) {
                LJJ(c63120Opw);
                if (c63120Opw != null && c63120Opw.isStranger()) {
                    C115394fv.LJII().LJIILJJIL(i, c63120Opw);
                    LJI(c63120Opw);
                    z2 = true;
                } else {
                    C47922IrO.LIZ();
                    if (z) {
                        LJIJJLI(c63120Opw);
                    }
                    if (c63120Opw != null) {
                        String conversationId = c63120Opw.getConversationId();
                        C63120Opw c63120Opw2 = (C63120Opw) ((ConcurrentHashMap) this.LIZ).get(conversationId);
                        if (i == 5 && c63120Opw2 != null && c63120Opw2.isStickTop() != c63120Opw.isStickTop()) {
                            RunnableC63345OtZ.LJ(new IDcS13S1100000_1(c63120Opw2, c63120Opw, conversationId, 1), new InterfaceC63353Oth<C63120Opw>() { // from class: X.4fj
                                @Override // X.InterfaceC63353Oth
                                public final void LIZLLL(C63120Opw c63120Opw3) {
                                    C63120Opw c63120Opw4 = c63120Opw3;
                                    C115284fk.this.LJIIL(c63120Opw4);
                                    C63309Osz.LIZLLL().LJIIJ(i, c63120Opw4);
                                    Iterator it = ((CopyOnWriteArraySet) C115284fk.this.LIZLLL).iterator();
                                    while (it.hasNext()) {
                                        ((InterfaceC120024nO) it.next()).y9(i, c63120Opw4);
                                    }
                                    C4WK.LIZIZ().LIZJ(Arrays.asList(c63120OpwArr), true);
                                }
                            }, false);
                        } else {
                            LJIIL(c63120Opw);
                            C63309Osz.LIZLLL().LJIIJ(i, c63120Opw);
                            Iterator it = ((CopyOnWriteArraySet) this.LIZLLL).iterator();
                            while (it.hasNext()) {
                                ((InterfaceC120024nO) it.next()).y9(i, c63120Opw);
                            }
                            C4WK.LIZIZ().LIZJ(Arrays.asList(c63120OpwArr), true);
                        }
                    }
                }
            }
            if (z2) {
                C115394fv.LJII().LJIIIZ();
            }
        }
    }
}
