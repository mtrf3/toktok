package X;

import Y.IDbS169S0200000_10;
import Y.IDbS398S0100000_1;
import Y.IDcS135S0200000_1;
import Y.IDcS136S0200000_10;
import Y.IDcS14S1100000_10;
import Y.IDcS407S0100000_10;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Oqe, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63164Oqe implements C31F {
    public static final C63164Oqe LIZIZ = new C63164Oqe();

    public static final long LJIIIIZZ() {
        InterfaceC63132Oq8 interfaceC63132Oq8 = null;
        try {
            try {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("select ");
                EnumC63154OqU enumC63154OqU = EnumC63154OqU.COLUMN_INNER_INDEX;
                LIZ.append(enumC63154OqU.key);
                LIZ.append(" from ");
                LIZ.append("msg");
                LIZ.append(" order by ");
                LIZ.append(enumC63154OqU.key);
                LIZ.append(" desc limit 1");
                interfaceC63132Oq8 = C78847Ux1.LJJJLZIJ(X1D.LIZIZ(LIZ), null);
                if (interfaceC63132Oq8 != null && interfaceC63132Oq8.moveToFirst()) {
                    return interfaceC63132Oq8.getLong(interfaceC63132Oq8.getColumnIndex(enumC63154OqU.key));
                }
            } catch (Exception e) {
                C63322OtC.LJ("IMMsgDao getMaxIndexRegardlessConversation", e);
                C63337OtR.LJFF(e);
            }
            C63143OqJ.LIZ(interfaceC63132Oq8);
            return 0L;
        } finally {
            C63143OqJ.LIZ(interfaceC63132Oq8);
        }
    }

    public static final void LJIILL() {
        C63356Otk.LJIIIZ().getClass();
        RunnableC63345OtZ.LJ(new IDcS407S0100000_10(new C63216OrU(), 10), null, false);
    }

    public static final void LJI(List<? extends C109544Rq> list) {
        ArrayList arrayList = (ArrayList) list;
        if (arrayList.isEmpty()) {
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("MessageModel  batchSaveMessageContentPbAndLocalExt: ");
        LIZ.append(arrayList.size());
        C63322OtC.LJFF(X1D.LIZIZ(LIZ));
        RunnableC63345OtZ.LIZLLL(new IDcS407S0100000_10(list, 4), new C63183Oqx(), C63346Ota.LIZJ());
    }

    public static final List<C109544Rq> LJIIJ(List<Long> list) {
        ArrayList LJ = AnonymousClass391.LJ(list, "msgIdList");
        InterfaceC63132Oq8 interfaceC63132Oq8 = null;
        try {
            try {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("select rowid,* from msg where ");
                LIZ.append(EnumC63154OqU.COLUMN_SERVER_ID.key);
                LIZ.append(" in ('");
                LIZ.append(C63312Ot2.LJII("','", list));
                LIZ.append("') ");
                interfaceC63132Oq8 = C78847Ux1.LJJJLZIJ(X1D.LIZIZ(LIZ), null);
                C63150OqQ.LIZLLL(interfaceC63132Oq8, LJ);
            } catch (Exception e) {
                C63322OtC.LJ("IMMsgDao getMsgIdWithContentBy", e);
                C63337OtR.LJFF(e);
            }
            return LJ;
        } finally {
            C63143OqJ.LIZ(interfaceC63132Oq8);
        }
    }

    public static final boolean LJIIL(long j) {
        InterfaceC63132Oq8 interfaceC63132Oq8 = null;
        try {
            try {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("select rowid from msg where ");
                LIZ.append(EnumC63154OqU.COLUMN_SERVER_ID.key);
                LIZ.append("=?");
                interfaceC63132Oq8 = C78847Ux1.LJJJLZIJ(X1D.LIZIZ(LIZ), new String[]{String.valueOf(j)});
                if (interfaceC63132Oq8 != null) {
                    if (interfaceC63132Oq8.moveToFirst()) {
                        C63143OqJ.LIZ(interfaceC63132Oq8);
                        return true;
                    }
                }
            } catch (Exception e) {
                C63322OtC.LJ("IMMsgDao isMsgSaved", e);
                C63337OtR.LJFF(e);
            }
            return false;
        } finally {
            C63143OqJ.LIZ(interfaceC63132Oq8);
        }
    }

    public static final void LJIILJJIL(List<? extends C109544Rq> messages) {
        o.LJIIIZ(messages, "messages");
        if (messages.isEmpty()) {
            return;
        }
        C63309Osz.LIZLLL().LJIIJJI(Collections.unmodifiableList(messages));
    }

    public static final void LJIILLIIL(String msgUuid) {
        o.LJIIIZ(msgUuid, "msgUuid");
        C63356Otk.LJIIIZ().getClass();
        RunnableC63345OtZ.LJ(new IDcS14S1100000_10(new C63216OrU(), msgUuid, 3), null, false);
    }

    @Override // X.C31F
    public final C109544Rq LJ(long j) {
        return C63150OqQ.LJIILIIL(j);
    }

    @Override // X.C31F
    public final void LIZIZ(List<? extends C109544Rq> msgList, boolean z) {
        o.LJIIIZ(msgList, "msgList");
        if (msgList.isEmpty()) {
            return;
        }
        List LJLL = ORZ.LJLL(msgList);
        int LJJIIZ = C51029K0z.LJJIIZ(C32I.LJJL(LJLL, 10));
        if (LJJIIZ < 16) {
            LJJIIZ = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(LJJIIZ);
        Iterator it = ((ArrayList) LJLL).iterator();
        while (it.hasNext()) {
            C109544Rq c109544Rq = (C109544Rq) it.next();
            OSZ osz = new OSZ(c109544Rq.getUuid(), c109544Rq.getLocalExt());
            linkedHashMap.put(osz.getFirst(), osz.getSecond());
        }
        if (linkedHashMap.isEmpty()) {
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("MessageModel  batchUpdateMessageLocalExt: ");
        LIZ.append(linkedHashMap.size());
        LIZ.append(", notify update: ");
        LIZ.append(z);
        C63322OtC.LJFF(X1D.LIZIZ(LIZ));
        RunnableC63345OtZ.LIZLLL(new IDcS407S0100000_10(linkedHashMap, 3), new C63168Oqi(z), C63346Ota.LIZJ());
    }

    @Override // X.C31F
    public final C109544Rq LIZJ(long j, String conversationId) {
        o.LJIIIZ(conversationId, "conversationId");
        return C63150OqQ.LJIILL(j, conversationId);
    }

    public final void LJFF(InterfaceC86963bA interfaceC86963bA, C109544Rq msg) {
        o.LJIIIZ(msg, "msg");
        C63322OtC.LJFF("MessageModel addMessage");
        C63308Osy.LJI().LIZLLL().getClass();
        RunnableC63345OtZ.LIZLLL(new IDcS407S0100000_10(msg, 1), new IDbS169S0200000_10(msg, interfaceC86963bA, 1), C63346Ota.LIZJ());
    }

    public final void LJIIIZ(java.util.Map map, IDcS135S0200000_1 iDcS135S0200000_1) {
        C63356Otk LJIIIZ = C63356Otk.LJIIIZ();
        LJIIIZ.getClass();
        HashSet hashSet = new HashSet(((LinkedHashMap) map).values());
        C115284fk LJIILIIL = C115284fk.LJIILIIL();
        C63167Oqh c63167Oqh = new C63167Oqh(LJIIIZ, map, iDcS135S0200000_1);
        LJIILIIL.getClass();
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            C63120Opw LJIIIZ2 = LJIILIIL.LJIIIZ(str);
            if (LJIIIZ2 != null) {
                hashMap.put(str, Long.valueOf(LJIIIZ2.getConversationShortId()));
            } else {
                arrayList.add(str);
            }
        }
        if (hashMap.size() == hashSet.size()) {
            c63167Oqh.onSuccess(hashMap);
        } else {
            RunnableC63345OtZ.LJ(new C63155OqV(arrayList), new IDbS169S0200000_10(hashMap, c63167Oqh, 2), false);
        }
    }

    public final void LJIILIIL(C63219OrX c63219OrX, C80363Dk c80363Dk) {
        C63356Otk.LJIIIZ().getClass();
        new C63216OrU(c80363Dk).LJIILL(c63219OrX);
    }

    public final void LJIIZILJ(InterfaceC86963bA interfaceC86963bA, C109544Rq msg) {
        o.LJIIIZ(msg, "msg");
        if (msg.getUuid() == null || msg.getLocalExt() == null) {
            if (interfaceC86963bA != null) {
                C63623Oy3 c63623Oy3 = new C63375Ou3().LIZ;
                c63623Oy3.LIZJ = "invalid msg parameters";
                interfaceC86963bA.LIZIZ(c63623Oy3);
                return;
            }
            return;
        }
        C63220OrY.LJIJJ(msg.getUuid(), msg.getLocalExt(), interfaceC86963bA);
    }

    public final void LJIJI(InterfaceC86963bA interfaceC86963bA, C109544Rq msg) {
        o.LJIIIZ(msg, "msg");
        LJIJ(msg, interfaceC86963bA, 0, null);
    }

    public final void LJIJJ(C84573Tp c84573Tp, C109544Rq msg) {
        o.LJIIIZ(msg, "msg");
        C63322OtC.LJFF("MessageModel updateMessage");
        RunnableC63345OtZ.LJ(new IDcS407S0100000_10(msg, 2), new IDbS398S0100000_1(c84573Tp, 3), false);
    }

    public static final void LJII(C109544Rq msg, boolean z, InterfaceC86963bA<C109544Rq> interfaceC86963bA) {
        o.LJIIIZ(msg, "msg");
        C63356Otk.LJIIIZ().getClass();
        if (TextUtils.isEmpty(msg.getConversationId())) {
            if (interfaceC86963bA != null) {
                interfaceC86963bA.LIZIZ(C63623Oy3.LIZ(C63622Oy2.LIZJ(-1015)));
                return;
            }
            return;
        }
        C115284fk.LJIILIIL().LJIIJ(msg.getConversationId(), new C63311Ot1(interfaceC86963bA, msg, z));
    }

    @Override // X.C31F
    public final void LIZLLL(InterfaceC86963bA interfaceC86963bA, String conversationID, List list) {
        o.LJIIIZ(conversationID, "conversationID");
        C63356Otk.LJIIIZ().getClass();
        C115284fk.LJIILIIL().LJIIJ(conversationID, new IDcS136S0200000_10(interfaceC86963bA, list, 2));
    }

    public final int LJIIJJI(long j, long j2, String conversationId, boolean z) {
        o.LJIIIZ(conversationId, "conversationId");
        int i = -1;
        if ((!z && conversationId.length() == 0) || j > j2) {
            return -1;
        }
        if (j == j2) {
            return 1;
        }
        if (z) {
            InterfaceC63132Oq8 interfaceC63132Oq8 = null;
            try {
                try {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("select * from msg where ");
                    EnumC63154OqU enumC63154OqU = EnumC63154OqU.COLUMN_INNER_INDEX;
                    LIZ.append(enumC63154OqU.key);
                    LIZ.append("<=? AND ");
                    LIZ.append(enumC63154OqU.key);
                    LIZ.append(">=?");
                    interfaceC63132Oq8 = C78847Ux1.LJJJLZIJ(X1D.LIZIZ(LIZ), new String[]{String.valueOf(j2), String.valueOf(j)});
                    i = interfaceC63132Oq8.getCount();
                } catch (Exception e) {
                    C16880lQ.LLLLIIL(e);
                    C63322OtC.LJ("IMMsgDao computeMsgCountRegardlessConv", e);
                    C63337OtR.LJFF(e);
                }
                return i;
            } finally {
                C63143OqJ.LIZ(interfaceC63132Oq8);
            }
        }
        return C63150OqQ.LJ(j, j2, conversationId);
    }

    public final void LJIJ(C109544Rq msg, InterfaceC86963bA<C109544Rq> interfaceC86963bA, int i, C63623Oy3 c63623Oy3) {
        o.LJIIIZ(msg, "msg");
        C4ZL.LIZIZ();
        C82873Nb.LJIIL(msg);
        if (i != 0) {
            LJIJJ(null, msg);
            C63309Osz LIZLLL = C63309Osz.LIZLLL();
            C63540Owi c63540Owi = new C63540Owi();
            c63540Owi.LJJIJIIJI = i;
            LIZLLL.LJIIIZ(i, msg, c63540Owi);
            if (interfaceC86963bA != null) {
                interfaceC86963bA.LIZIZ(c63623Oy3);
                return;
            }
            return;
        }
        C63308Osy LJI = C63308Osy.LJI();
        if (LJI.LIZLLL().LJJLIIIJJI) {
            C63383OuB LJFF = LJI.LJFF();
            LJFF.getClass();
            XKX.LIZLLL(LJFF.LJIIL, C120394nz.LIZ(), null, new C63390OuI(interfaceC86963bA, LJFF, msg, null), 2);
        } else {
            C63356Otk.LJIIIZ().getClass();
            new C63536Owe(interfaceC86963bA).LJIILLIIL(msg);
        }
    }

    @Override // X.C31F
    public final List<C109544Rq> LIZ(long j, long j2, Integer num, boolean z, int[] iArr, boolean z2, boolean z3) {
        int i;
        String LIZIZ2;
        String LIZIZ3;
        String LIZIZ4;
        if (num != null) {
            i = num.intValue();
        } else {
            i = 0;
        }
        ArrayList arrayList = new ArrayList();
        InterfaceC63132Oq8 interfaceC63132Oq8 = null;
        try {
            try {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("select rowid,* from msg where ");
                LIZ.append(EnumC63154OqU.COLUMN_DELETED.key);
                LIZ.append("=? AND ");
                LIZ.append(EnumC63154OqU.COLUMN_NET_STATUS.key);
                LIZ.append("=?");
                String LIZIZ5 = X1D.LIZIZ(LIZ);
                if (z2) {
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append(LIZIZ5);
                    LIZ2.append(" AND ");
                    LIZ2.append(EnumC63154OqU.COLUMN_INNER_INDEX.key);
                    LIZ2.append(">=?");
                    LIZIZ2 = X1D.LIZIZ(LIZ2);
                } else {
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append(LIZIZ5);
                    LIZ3.append(" AND ");
                    LIZ3.append(EnumC63154OqU.COLUMN_INNER_INDEX.key);
                    LIZ3.append(">?");
                    LIZIZ2 = X1D.LIZIZ(LIZ3);
                }
                if (z3) {
                    StringBuilder LIZ4 = X1D.LIZ();
                    LIZ4.append(LIZIZ2);
                    LIZ4.append(" AND ");
                    LIZ4.append(EnumC63154OqU.COLUMN_INNER_INDEX.key);
                    LIZ4.append("<=?");
                    LIZIZ3 = X1D.LIZIZ(LIZ4);
                } else {
                    StringBuilder LIZ5 = X1D.LIZ();
                    LIZ5.append(LIZIZ2);
                    LIZ5.append(" AND ");
                    LIZ5.append(EnumC63154OqU.COLUMN_INNER_INDEX.key);
                    LIZ5.append("<?");
                    LIZIZ3 = X1D.LIZIZ(LIZ5);
                }
                if (iArr != null && iArr.length > 0) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("(");
                    for (int i2 = 0; i2 < iArr.length; i2++) {
                        sb.append(iArr[i2]);
                        if (i2 < iArr.length - 1) {
                            sb.append(",");
                        }
                    }
                    sb.append(")");
                    StringBuilder LIZ6 = X1D.LIZ();
                    LIZ6.append(LIZIZ3);
                    LIZ6.append(" AND ");
                    LIZ6.append(EnumC63154OqU.COLUMN_MSG_TYPE.key);
                    LIZ6.append(" IN ");
                    LIZ6.append((Object) sb);
                    LIZIZ3 = X1D.LIZIZ(LIZ6);
                }
                if (z) {
                    StringBuilder LIZ7 = X1D.LIZ();
                    LIZ7.append(LIZIZ3);
                    LIZ7.append(" order by ");
                    LIZ7.append(EnumC63154OqU.COLUMN_ORDER_INDEX.key);
                    LIZ7.append(" desc, ");
                    LIZ7.append(EnumC63154OqU.COLUMN_CREATE_TIME.key);
                    LIZ7.append(" desc");
                    LIZIZ4 = X1D.LIZIZ(LIZ7);
                } else {
                    StringBuilder LIZ8 = X1D.LIZ();
                    LIZ8.append(LIZIZ3);
                    LIZ8.append(" order by ");
                    LIZ8.append(EnumC63154OqU.COLUMN_ORDER_INDEX.key);
                    LIZ8.append(" asc, ");
                    LIZ8.append(EnumC63154OqU.COLUMN_CREATE_TIME.key);
                    LIZ8.append(" asc");
                    LIZIZ4 = X1D.LIZIZ(LIZ8);
                }
                if (i > 0) {
                    StringBuilder LIZ9 = X1D.LIZ();
                    LIZ9.append(LIZIZ4);
                    LIZ9.append(" limit ");
                    LIZ9.append(i);
                    LIZIZ4 = X1D.LIZIZ(LIZ9);
                }
                interfaceC63132Oq8 = C78847Ux1.LJJJLZIJ(LIZIZ4, new String[]{String.valueOf(0), String.valueOf(0), String.valueOf(j), String.valueOf(j2)});
                if (interfaceC63132Oq8 != null) {
                    if (C63308Osy.LJI().LIZLLL().LJJJJJL) {
                        C63150OqQ.LIZLLL(interfaceC63132Oq8, arrayList);
                    } else {
                        while (interfaceC63132Oq8.moveToNext()) {
                            arrayList.add(C63150OqQ.LIZJ(interfaceC63132Oq8));
                        }
                    }
                }
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
                C63322OtC.LJ("IMMsgDao queryMessageListInRange error: ", e);
                C63337OtR.LJFF(e);
            }
            C63143OqJ.LIZ(interfaceC63132Oq8);
            StringBuilder LIZ10 = X1D.LIZ();
            LIZ10.append("IMMsgDao queryMessageListInRange, cid:");
            LIZ10.append("");
            LIZ10.append(", minIndex:");
            LIZ10.append(j);
            C0MT.LIZLLL(LIZ10, ", maxIndex:", j2, ", limit:");
            LIZ10.append(i);
            LIZ10.append(", count:");
            LIZ10.append(arrayList.size());
            C63322OtC.LIZJ(X1D.LIZIZ(LIZ10));
            return arrayList;
        } catch (Throwable th) {
            C63143OqJ.LIZ(null);
            throw th;
        }
    }
}
