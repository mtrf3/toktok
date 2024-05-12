package X;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.OqT, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63153OqT {
    public static String LJ() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("select p.*, m.");
        YE1.LIZLLL(LIZ, EnumC63154OqU.COLUMN_SERVER_ID.key, " from ", "msg_property_new", " p left join ");
        LIZ.append("msg");
        LIZ.append(" m on p.");
        LIZ.append(EnumC63157OqX.COLUMN_MSG_UUID.key);
        LIZ.append("=m.");
        LIZ.append(EnumC63154OqU.COLUMN_MSG_ID.key);
        LIZ.append(" where p.");
        C0EH.LIZLLL(LIZ, EnumC63157OqX.COLUMN_STATUS.key, " in (", 5, ",");
        return C08380Uo.LIZ(LIZ, 3, ")", LIZ);
    }

    public static String LJII() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(EnumC63157OqX.COLUMN_MSG_UUID.key);
        LIZ.append("=? and ");
        LIZ.append(EnumC63157OqX.COLUMN_KEY.key);
        LIZ.append("=? and ");
        return JBR.LJFF(LIZ, EnumC63157OqX.COLUMN_IDEMPOTENT_ID.key, "=?", LIZ);
    }

    public static C32H LIZIZ(InterfaceC63132Oq8 interfaceC63132Oq8) {
        C32H c32h = new C32H();
        c32h.msgUuid = interfaceC63132Oq8.getString(interfaceC63132Oq8.getColumnIndex(EnumC63157OqX.COLUMN_MSG_UUID.key));
        c32h.conversationId = interfaceC63132Oq8.getString(interfaceC63132Oq8.getColumnIndex(EnumC63157OqX.COLUMN_CONVERSATION_ID.key));
        c32h.uid = Long.valueOf(interfaceC63132Oq8.getLong(interfaceC63132Oq8.getColumnIndex(EnumC63157OqX.COLUMN_SENDER.key)));
        c32h.sec_uid = interfaceC63132Oq8.getString(interfaceC63132Oq8.getColumnIndex(EnumC63157OqX.COLUMN_SENDER_SEC.key));
        c32h.create_time = Long.valueOf(interfaceC63132Oq8.getLong(interfaceC63132Oq8.getColumnIndex(EnumC63157OqX.COLUMN_CREATE_TIME.key)));
        c32h.create_time_v2 = Long.valueOf(interfaceC63132Oq8.getLong(interfaceC63132Oq8.getColumnIndex(EnumC63157OqX.COLUMN_CREATE_TIME_V2.key)));
        c32h.idempotent_id = interfaceC63132Oq8.getString(interfaceC63132Oq8.getColumnIndex(EnumC63157OqX.COLUMN_IDEMPOTENT_ID.key));
        c32h.key = interfaceC63132Oq8.getString(interfaceC63132Oq8.getColumnIndex(EnumC63157OqX.COLUMN_KEY.key));
        c32h.value = interfaceC63132Oq8.getString(interfaceC63132Oq8.getColumnIndex(EnumC63157OqX.COLUMN_VALUE.key));
        c32h.version = interfaceC63132Oq8.getLong(interfaceC63132Oq8.getColumnIndex(EnumC63157OqX.COLUMN_VERSION.key));
        c32h.status = interfaceC63132Oq8.getInt(interfaceC63132Oq8.getColumnIndex(EnumC63157OqX.COLUMN_STATUS.key));
        c32h.deleted = interfaceC63132Oq8.getInt(interfaceC63132Oq8.getColumnIndex(EnumC63157OqX.COLUMN_DELETED.key));
        return c32h;
    }

    public static List<C32H> LIZJ(InterfaceC63132Oq8 interfaceC63132Oq8) {
        ArrayList arrayList = new ArrayList();
        if (interfaceC63132Oq8 == null) {
            return arrayList;
        }
        int columnIndex = interfaceC63132Oq8.getColumnIndex(EnumC63157OqX.COLUMN_MSG_UUID.key);
        int columnIndex2 = interfaceC63132Oq8.getColumnIndex(EnumC63157OqX.COLUMN_CONVERSATION_ID.key);
        int columnIndex3 = interfaceC63132Oq8.getColumnIndex(EnumC63157OqX.COLUMN_SENDER.key);
        int columnIndex4 = interfaceC63132Oq8.getColumnIndex(EnumC63157OqX.COLUMN_SENDER_SEC.key);
        int columnIndex5 = interfaceC63132Oq8.getColumnIndex(EnumC63157OqX.COLUMN_CREATE_TIME.key);
        int columnIndex6 = interfaceC63132Oq8.getColumnIndex(EnumC63157OqX.COLUMN_CREATE_TIME_V2.key);
        int columnIndex7 = interfaceC63132Oq8.getColumnIndex(EnumC63157OqX.COLUMN_IDEMPOTENT_ID.key);
        int columnIndex8 = interfaceC63132Oq8.getColumnIndex(EnumC63157OqX.COLUMN_KEY.key);
        int columnIndex9 = interfaceC63132Oq8.getColumnIndex(EnumC63157OqX.COLUMN_VALUE.key);
        int columnIndex10 = interfaceC63132Oq8.getColumnIndex(EnumC63157OqX.COLUMN_VERSION.key);
        int columnIndex11 = interfaceC63132Oq8.getColumnIndex(EnumC63157OqX.COLUMN_STATUS.key);
        int columnIndex12 = interfaceC63132Oq8.getColumnIndex(EnumC63157OqX.COLUMN_DELETED.key);
        while (interfaceC63132Oq8.moveToNext()) {
            C32H c32h = new C32H();
            c32h.msgUuid = interfaceC63132Oq8.getString(columnIndex);
            c32h.conversationId = interfaceC63132Oq8.getString(columnIndex2);
            c32h.uid = Long.valueOf(interfaceC63132Oq8.getLong(columnIndex3));
            c32h.sec_uid = interfaceC63132Oq8.getString(columnIndex4);
            c32h.create_time = Long.valueOf(interfaceC63132Oq8.getLong(columnIndex5));
            c32h.create_time_v2 = Long.valueOf(interfaceC63132Oq8.getLong(columnIndex6));
            c32h.idempotent_id = interfaceC63132Oq8.getString(columnIndex7);
            c32h.key = interfaceC63132Oq8.getString(columnIndex8);
            c32h.value = interfaceC63132Oq8.getString(columnIndex9);
            c32h.version = interfaceC63132Oq8.getLong(columnIndex10);
            c32h.status = interfaceC63132Oq8.getInt(columnIndex11);
            c32h.deleted = interfaceC63132Oq8.getInt(columnIndex12);
            arrayList.add(c32h);
        }
        return arrayList;
    }

    public static Collection<C63219OrX> LIZLLL(String str) {
        InterfaceC63132Oq8 interfaceC63132Oq8;
        C32H LIZIZ;
        try {
            interfaceC63132Oq8 = C78847Ux1.LJJJLZIJ(str, null);
            if (interfaceC63132Oq8 == null) {
                C63143OqJ.LIZ(interfaceC63132Oq8);
                return null;
            }
            try {
                try {
                    HashMap hashMap = new HashMap();
                    while (interfaceC63132Oq8.moveToNext()) {
                        long j = interfaceC63132Oq8.getLong(interfaceC63132Oq8.getColumnIndex(EnumC63154OqU.COLUMN_SERVER_ID.key));
                        if (j > 0 && (LIZIZ = LIZIZ(interfaceC63132Oq8)) != null && !TextUtils.isEmpty(LIZIZ.msgUuid)) {
                            C63219OrX c63219OrX = (C63219OrX) hashMap.get(LIZIZ.msgUuid);
                            if (c63219OrX == null) {
                                C63120Opw LJIIIZ = C115284fk.LJIILIIL().LJIIIZ(LIZIZ.conversationId);
                                if (LJIIIZ != null) {
                                    c63219OrX = new C63219OrX();
                                    c63219OrX.setClientMessageId(LIZIZ.msgUuid);
                                    c63219OrX.setServerMessageId(j);
                                    c63219OrX.setConversationId(LJIIIZ.getConversationId());
                                    c63219OrX.setConversationShortId(LJIIIZ.getConversationShortId());
                                    c63219OrX.setConversationType(LJIIIZ.getConversationType());
                                    c63219OrX.setInboxType(LJIIIZ.getInboxType());
                                    hashMap.put(LIZIZ.msgUuid, c63219OrX);
                                }
                            }
                            c63219OrX.addPropertyContent(LIZIZ);
                        }
                    }
                    Collection<C63219OrX> values = hashMap.values();
                    C63143OqJ.LIZ(interfaceC63132Oq8);
                    return values;
                } catch (Exception e) {
                    e = e;
                    C63322OtC.LJ("IMMsgPropertyDao collectResendProperties", e);
                    C16880lQ.LLLLIIL(e);
                    C63337OtR.LJFF(e);
                    C63143OqJ.LIZ(interfaceC63132Oq8);
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                C63143OqJ.LIZ(interfaceC63132Oq8);
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            interfaceC63132Oq8 = null;
        } catch (Throwable th2) {
            th = th2;
            interfaceC63132Oq8 = null;
            C63143OqJ.LIZ(interfaceC63132Oq8);
            throw th;
        }
    }

    /* JADX WARN: Not initialized variable reg: 6, insn: 0x0088: MOVE (r8 I:??[OBJECT, ARRAY]) = (r6 I:??[OBJECT, ARRAY]) (LINE:16777352), block:B:37:0x0088 */
    public static java.util.Map<String, List<C32H>> LJFF(String str) {
        InterfaceC63132Oq8 interfaceC63132Oq8;
        InterfaceC63132Oq8 interfaceC63132Oq82;
        long currentTimeMillis = System.currentTimeMillis();
        InterfaceC63132Oq8 interfaceC63132Oq83 = null;
        try {
            try {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("select * from msg_property_new where ");
                LIZ.append(EnumC63157OqX.COLUMN_MSG_UUID.key);
                LIZ.append("=? order by ");
                LIZ.append(EnumC63157OqX.COLUMN_CREATE_TIME.key);
                LIZ.append(" asc");
                interfaceC63132Oq8 = C78847Ux1.LJJJLZIJ(X1D.LIZIZ(LIZ), new String[]{str});
                HashMap hashMap = null;
                while (interfaceC63132Oq8.moveToNext()) {
                    try {
                        C32H LIZIZ = LIZIZ(interfaceC63132Oq8);
                        if (LIZIZ != null && LIZIZ.deleted != 1) {
                            if (hashMap == null) {
                                hashMap = new HashMap();
                            }
                            List list = (List) hashMap.get(LIZIZ.key);
                            if (list == null) {
                                list = new ArrayList();
                                hashMap.put(LIZIZ.key, list);
                            }
                            list.add(LIZIZ);
                        }
                    } catch (Exception e) {
                        e = e;
                        C63322OtC.LJ("IMMsgPropertyDao getMessageProperties", e);
                        C16880lQ.LLLLIIL(e);
                        C63337OtR.LJFF(e);
                        C63143OqJ.LIZ(interfaceC63132Oq8);
                        return null;
                    }
                }
                C63275OsR.LIZIZ().LJI(currentTimeMillis, "getMessageProperties");
                C63143OqJ.LIZ(interfaceC63132Oq8);
                return hashMap;
            } catch (Throwable th) {
                th = th;
                interfaceC63132Oq83 = interfaceC63132Oq82;
                C63143OqJ.LIZ(interfaceC63132Oq83);
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            interfaceC63132Oq8 = null;
        } catch (Throwable th2) {
            th = th2;
            C63143OqJ.LIZ(interfaceC63132Oq83);
            throw th;
        }
    }

    public static void LJIIIIZZ(C109544Rq c109544Rq) {
        boolean z;
        List<C32H> value;
        if (c109544Rq == null || TextUtils.isEmpty(c109544Rq.getUuid())) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        InterfaceC78848Ux2 LJI = C63143OqJ.LJII().LJI();
        if (LJI != null && LJI.LJJJ()) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            C78847Ux1.LJJLIIIJJI("IMMsgPropertyDao.updateMessageProperty");
        }
        InterfaceC63146OqM interfaceC63146OqM = null;
        try {
            try {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("delete from msg_property_new where ");
                LIZ.append(EnumC63157OqX.COLUMN_MSG_UUID.key);
                LIZ.append("='");
                LIZ.append(c109544Rq.getUuid());
                LIZ.append("' and ");
                EnumC63157OqX enumC63157OqX = EnumC63157OqX.COLUMN_STATUS;
                LIZ.append(enumC63157OqX.key);
                LIZ.append("<>");
                LIZ.append(1);
                LIZ.append(" and ");
                LIZ.append(enumC63157OqX.key);
                LIZ.append("<>");
                LIZ.append(4);
                LIZ.append(" and ");
                LIZ.append(enumC63157OqX.key);
                LIZ.append("<>");
                LIZ.append(5);
                LIZ.append(" and ");
                LIZ.append(enumC63157OqX.key);
                LIZ.append("<>");
                LIZ.append(3);
                C78847Ux1.LJIL(X1D.LIZIZ(LIZ));
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("insert or ignore into msg_property_new values(");
                LIZ2.append(C63143OqJ.LJ(EnumC63157OqX.values().length));
                LIZ2.append(")");
                interfaceC63146OqM = C78847Ux1.LJIJ(X1D.LIZIZ(LIZ2));
                java.util.Map<String, List<C32H>> propertyItemListMap = c109544Rq.getPropertyItemListMap();
                if (propertyItemListMap != null && !propertyItemListMap.isEmpty()) {
                    for (Map.Entry<String, List<C32H>> entry : propertyItemListMap.entrySet()) {
                        String key = entry.getKey();
                        if (key != null && (value = entry.getValue()) != null) {
                            for (C32H c32h : value) {
                                if (c32h != null) {
                                    c32h.msgUuid = c109544Rq.getUuid();
                                    c32h.conversationId = c109544Rq.getConversationId();
                                    c32h.key = key;
                                    C63308Osy.LJI().LIZLLL().getClass();
                                    LIZ(interfaceC63146OqM, c32h);
                                    interfaceC63146OqM.LJIILJJIL();
                                }
                            }
                        }
                    }
                }
                c109544Rq.setPropertyItemListMap(LJFF(c109544Rq.getUuid()));
                if (!z) {
                    C78847Ux1.LJIJJLI("IMMsgPropertyDao.updateMessageProperty", true);
                }
                C63275OsR.LIZIZ().LJI(currentTimeMillis, "updateMessageProperty");
            } catch (Exception e) {
                C63322OtC.LJ("IMMsgPropertyDao updateMessageProperty", e);
                C16880lQ.LLLLIIL(e);
                C63337OtR.LJFF(e);
                if (!z) {
                    C78847Ux1.LJIJJLI("IMMsgPropertyDao.updateMessageProperty", false);
                }
            }
        } finally {
            C63143OqJ.LIZIZ(interfaceC63146OqM);
        }
    }

    public static void LIZ(InterfaceC63146OqM interfaceC63146OqM, C32H c32h) {
        long longValue;
        if (interfaceC63146OqM == null || TextUtils.isEmpty(c32h.msgUuid)) {
            return;
        }
        int ordinal = EnumC63157OqX.COLUMN_MSG_UUID.ordinal() + 1;
        String str = c32h.msgUuid;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        interfaceC63146OqM.LJJII(ordinal, str);
        int ordinal2 = EnumC63157OqX.COLUMN_CONVERSATION_ID.ordinal() + 1;
        String str3 = c32h.conversationId;
        if (str3 == null) {
            str3 = "";
        }
        interfaceC63146OqM.LJJII(ordinal2, str3);
        int ordinal3 = EnumC63157OqX.COLUMN_KEY.ordinal() + 1;
        String str4 = c32h.key;
        if (str4 == null) {
            str4 = "";
        }
        interfaceC63146OqM.LJJII(ordinal3, str4);
        int ordinal4 = EnumC63157OqX.COLUMN_IDEMPOTENT_ID.ordinal() + 1;
        String str5 = c32h.idempotent_id;
        if (str5 == null) {
            str5 = "";
        }
        interfaceC63146OqM.LJJII(ordinal4, str5);
        interfaceC63146OqM.LJIIIZ(EnumC63157OqX.COLUMN_SENDER.ordinal() + 1, c32h.uid.longValue());
        int ordinal5 = EnumC63157OqX.COLUMN_SENDER_SEC.ordinal() + 1;
        String str6 = c32h.sec_uid;
        if (str6 == null) {
            str6 = "";
        }
        interfaceC63146OqM.LJJII(ordinal5, str6);
        interfaceC63146OqM.LJIIIZ(EnumC63157OqX.COLUMN_CREATE_TIME.ordinal() + 1, c32h.create_time.longValue());
        int ordinal6 = EnumC63157OqX.COLUMN_VALUE.ordinal() + 1;
        String str7 = c32h.value;
        if (str7 != null) {
            str2 = str7;
        }
        interfaceC63146OqM.LJJII(ordinal6, str2);
        interfaceC63146OqM.LJIIIZ(EnumC63157OqX.COLUMN_DELETED.ordinal() + 1, c32h.deleted);
        interfaceC63146OqM.LJIIIZ(EnumC63157OqX.COLUMN_VERSION.ordinal() + 1, c32h.version);
        interfaceC63146OqM.LJIIIZ(EnumC63157OqX.COLUMN_STATUS.ordinal() + 1, c32h.status);
        Long l = c32h.create_time_v2;
        if (l == null) {
            longValue = 0;
        } else {
            longValue = l.longValue();
        }
        interfaceC63146OqM.LJIIIZ(EnumC63157OqX.COLUMN_CREATE_TIME_V2.ordinal() + 1, longValue);
    }

    /* JADX WARN: Not initialized variable reg: 2, insn: 0x0052: MOVE (r3 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]) (LINE:50331730), block:B:27:0x0052 */
    public static C32H LJI(String str, String str2, String str3) {
        InterfaceC63132Oq8 interfaceC63132Oq8;
        InterfaceC63132Oq8 interfaceC63132Oq82;
        InterfaceC63132Oq8 interfaceC63132Oq83 = null;
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            try {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("select * from msg_property_new where ");
                LIZ.append(LJII());
                interfaceC63132Oq82 = C78847Ux1.LJJJLZIJ(X1D.LIZIZ(LIZ), new String[]{str, str2, str3});
                if (interfaceC63132Oq82 != null) {
                    try {
                        if (interfaceC63132Oq82.moveToNext()) {
                            C32H LIZIZ = LIZIZ(interfaceC63132Oq82);
                            C63143OqJ.LIZ(interfaceC63132Oq82);
                            return LIZIZ;
                        }
                    } catch (Exception e) {
                        e = e;
                        C63322OtC.LJ("IMMsgPropertyDao getMessageProperty", e);
                        C16880lQ.LLLLIIL(e);
                        C63337OtR.LJFF(e);
                        C63143OqJ.LIZ(interfaceC63132Oq82);
                        return null;
                    }
                }
            } catch (Exception e2) {
                e = e2;
                interfaceC63132Oq82 = null;
            } catch (Throwable th) {
                th = th;
                C63143OqJ.LIZ(interfaceC63132Oq83);
                throw th;
            }
            C63143OqJ.LIZ(interfaceC63132Oq82);
            return null;
        } catch (Throwable th2) {
            th = th2;
            interfaceC63132Oq83 = interfaceC63132Oq8;
        }
    }
}
