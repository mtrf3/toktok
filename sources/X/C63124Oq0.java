package X;

import android.content.ContentValues;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Oq0, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63124Oq0 {
    public static ContentValues LIZ(C63089OpR c63089OpR) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(EnumC63126Oq2.COLUMN_USER_ID.key, Long.valueOf(c63089OpR.getUid()));
        contentValues.put(EnumC63126Oq2.COLUMN_ALIAS.key, c63089OpR.getAlias());
        contentValues.put(EnumC63126Oq2.COLUMN_CONVERSATION_ID.key, c63089OpR.getConversationId());
        contentValues.put(EnumC63126Oq2.COLUMN_ROLE.key, Integer.valueOf(c63089OpR.getRole()));
        contentValues.put(EnumC63126Oq2.COLUMN_SORT_ORDER.key, Long.valueOf(c63089OpR.getSortOrder()));
        contentValues.put(EnumC63126Oq2.COLUMN_SEC_UID.key, c63089OpR.getSecUid());
        contentValues.put(EnumC63126Oq2.COLUMN_SILENT.key, Integer.valueOf(c63089OpR.getSilent()));
        contentValues.put(EnumC63126Oq2.COLUMN_SILENT_TIME.key, Long.valueOf(c63089OpR.getSilentTime()));
        return contentValues;
    }

    public static C63089OpR LIZIZ(InterfaceC63132Oq8 interfaceC63132Oq8) {
        C63089OpR c63089OpR = new C63089OpR();
        c63089OpR.setAlias(interfaceC63132Oq8.getString(interfaceC63132Oq8.getColumnIndex(EnumC63126Oq2.COLUMN_ALIAS.key)));
        c63089OpR.setConversationId(interfaceC63132Oq8.getString(interfaceC63132Oq8.getColumnIndex(EnumC63126Oq2.COLUMN_CONVERSATION_ID.key)));
        c63089OpR.setRole(interfaceC63132Oq8.getInt(interfaceC63132Oq8.getColumnIndex(EnumC63126Oq2.COLUMN_ROLE.key)));
        c63089OpR.setSortOrder(interfaceC63132Oq8.getInt(interfaceC63132Oq8.getColumnIndex(EnumC63126Oq2.COLUMN_SORT_ORDER.key)));
        c63089OpR.setUid(interfaceC63132Oq8.getLong(interfaceC63132Oq8.getColumnIndex(EnumC63126Oq2.COLUMN_USER_ID.key)));
        c63089OpR.setSecUid(interfaceC63132Oq8.getString(interfaceC63132Oq8.getColumnIndex(EnumC63126Oq2.COLUMN_SEC_UID.key)));
        c63089OpR.setSilent(interfaceC63132Oq8.getInt(interfaceC63132Oq8.getColumnIndex(EnumC63126Oq2.COLUMN_SILENT.key)));
        c63089OpR.setSilentTime(interfaceC63132Oq8.getLong(interfaceC63132Oq8.getColumnIndex(EnumC63126Oq2.COLUMN_SILENT_TIME.key)));
        return c63089OpR;
    }

    public static void LIZLLL(String str) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("IMConversationMemberDao deleteConversation, cid:");
        LIZ.append(str);
        C63322OtC.LIZJ(X1D.LIZIZ(LIZ));
        StringBuilder LIZ2 = X1D.LIZ();
        if (C78847Ux1.LJIJJ("participant", JBR.LJFF(LIZ2, EnumC63126Oq2.COLUMN_CONVERSATION_ID.key, "=?", LIZ2), new String[]{str})) {
            C63127Oq3.LIZIZ().getClass();
            C63127Oq3.LIZ();
        }
    }

    public static List<Long> LJ(String str) {
        if (TextUtils.isEmpty(str)) {
            return new ArrayList();
        }
        long currentTimeMillis = System.currentTimeMillis();
        InterfaceC63132Oq8 interfaceC63132Oq8 = null;
        try {
            try {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("select * from participant where ");
                LIZ.append(EnumC63126Oq2.COLUMN_CONVERSATION_ID.key);
                LIZ.append("=? order by ");
                LIZ.append(EnumC63126Oq2.COLUMN_SORT_ORDER.key);
                interfaceC63132Oq8 = C78847Ux1.LJJJLZIJ(X1D.LIZIZ(LIZ), new String[]{str});
                ArrayList arrayList = new ArrayList(interfaceC63132Oq8.getCount());
                int i = -1;
                while (interfaceC63132Oq8.moveToNext()) {
                    if (i < 0) {
                        i = interfaceC63132Oq8.getColumnIndex(EnumC63126Oq2.COLUMN_USER_ID.key);
                    }
                    arrayList.add(Long.valueOf(interfaceC63132Oq8.getLong(i)));
                }
                C63275OsR.LIZIZ().LJI(currentTimeMillis, "getMemberId");
                return arrayList;
            } catch (Exception e) {
                C63322OtC.LJ("IMConversationMemberDao getMemberId", e);
                C63337OtR.LJFF(e);
                C63143OqJ.LIZ(interfaceC63132Oq8);
                return new ArrayList();
            }
        } finally {
            C63143OqJ.LIZ(interfaceC63132Oq8);
        }
    }

    public static List<C63089OpR> LJFF(String str) {
        if (TextUtils.isEmpty(str)) {
            return Collections.emptyList();
        }
        long currentTimeMillis = System.currentTimeMillis();
        ArrayList arrayList = new ArrayList();
        InterfaceC63132Oq8 interfaceC63132Oq8 = null;
        try {
            try {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("select * from participant where ");
                LIZ.append(EnumC63126Oq2.COLUMN_CONVERSATION_ID.key);
                LIZ.append("=? order by ");
                LIZ.append(EnumC63126Oq2.COLUMN_SORT_ORDER.key);
                interfaceC63132Oq8 = C78847Ux1.LJJJLZIJ(X1D.LIZIZ(LIZ), new String[]{str});
                while (interfaceC63132Oq8.moveToNext()) {
                    arrayList.add(LIZIZ(interfaceC63132Oq8));
                }
                C63275OsR.LIZIZ().LJI(currentTimeMillis, "getMemberList");
            } catch (Exception e) {
                C63322OtC.LJ("IMConversationMemberDao getMemberList", e);
                C16880lQ.LLLLIIL(e);
                C63337OtR.LJFF(e);
            }
            return arrayList;
        } finally {
            C63143OqJ.LIZ(interfaceC63132Oq8);
        }
    }

    public static void LIZJ(InterfaceC63132Oq8 interfaceC63132Oq8, java.util.Map<String, List<C63089OpR>> map) {
        if (interfaceC63132Oq8 == null) {
            return;
        }
        int columnIndex = interfaceC63132Oq8.getColumnIndex(EnumC63126Oq2.COLUMN_ALIAS.key);
        int columnIndex2 = interfaceC63132Oq8.getColumnIndex(EnumC63126Oq2.COLUMN_CONVERSATION_ID.key);
        int columnIndex3 = interfaceC63132Oq8.getColumnIndex(EnumC63126Oq2.COLUMN_ROLE.key);
        int columnIndex4 = interfaceC63132Oq8.getColumnIndex(EnumC63126Oq2.COLUMN_SORT_ORDER.key);
        int columnIndex5 = interfaceC63132Oq8.getColumnIndex(EnumC63126Oq2.COLUMN_USER_ID.key);
        int columnIndex6 = interfaceC63132Oq8.getColumnIndex(EnumC63126Oq2.COLUMN_SEC_UID.key);
        int columnIndex7 = interfaceC63132Oq8.getColumnIndex(EnumC63126Oq2.COLUMN_SILENT.key);
        int columnIndex8 = interfaceC63132Oq8.getColumnIndex(EnumC63126Oq2.COLUMN_SILENT_TIME.key);
        while (interfaceC63132Oq8.moveToNext()) {
            C63089OpR c63089OpR = new C63089OpR();
            String string = interfaceC63132Oq8.getString(columnIndex2);
            c63089OpR.setAlias(interfaceC63132Oq8.getString(columnIndex));
            c63089OpR.setConversationId(string);
            c63089OpR.setRole(interfaceC63132Oq8.getInt(columnIndex3));
            c63089OpR.setSortOrder(interfaceC63132Oq8.getInt(columnIndex4));
            c63089OpR.setUid(interfaceC63132Oq8.getLong(columnIndex5));
            c63089OpR.setSecUid(interfaceC63132Oq8.getString(columnIndex6));
            c63089OpR.setSilent(interfaceC63132Oq8.getInt(columnIndex7));
            c63089OpR.setSilentTime(interfaceC63132Oq8.getLong(columnIndex8));
            HashMap hashMap = (HashMap) map;
            List list = (List) hashMap.get(string);
            if (list == null) {
                list = new ArrayList();
                hashMap.put(string, list);
            }
            list.add(c63089OpR);
        }
    }

    public static List<C63089OpR> LJI(String str, List<Long> list) {
        if (TextUtils.isEmpty(str)) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        InterfaceC63132Oq8 interfaceC63132Oq8 = null;
        try {
            try {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("select * from participant where ");
                LIZ.append(EnumC63126Oq2.COLUMN_CONVERSATION_ID.key);
                LIZ.append("=? and ");
                LIZ.append(EnumC63126Oq2.COLUMN_USER_ID.key);
                LIZ.append(" in (");
                LIZ.append(C63312Ot2.LJII(",", list));
                LIZ.append(") order by ");
                LIZ.append(EnumC63126Oq2.COLUMN_SORT_ORDER.key);
                interfaceC63132Oq8 = C78847Ux1.LJJJLZIJ(X1D.LIZIZ(LIZ), new String[]{str});
                while (interfaceC63132Oq8.moveToNext()) {
                    arrayList.add(LIZIZ(interfaceC63132Oq8));
                }
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("IMConversationMemberDao getMemberList by ids, result:");
                LIZ2.append(arrayList.size());
                C63322OtC.LIZJ(X1D.LIZIZ(LIZ2));
            } catch (Exception e) {
                C63322OtC.LJ("IMConversationMemberDao getMemberList", e);
                C16880lQ.LLLLIIL(e);
                C63337OtR.LJFF(e);
            }
            return arrayList;
        } finally {
            C63143OqJ.LIZ(interfaceC63132Oq8);
        }
    }

    public static boolean LJII(int i, String str, List list) {
        if (TextUtils.isEmpty(str) || list == null || list.isEmpty()) {
            return false;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("IMConversationMemberDao insertOrUpdateMember, cid:");
        LIZ.append(str);
        C63322OtC.LIZJ(X1D.LIZIZ(LIZ));
        long currentTimeMillis = System.currentTimeMillis();
        ArrayList arrayList = new ArrayList();
        C78847Ux1.LJJLIIIJJI("IMConversationMemberDao.insertOrUpdateMember(String,List)");
        try {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C63089OpR c63089OpR = (C63089OpR) it.next();
                if (c63089OpR != null) {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put(EnumC63126Oq2.COLUMN_SORT_ORDER.key, Long.valueOf(c63089OpR.getSortOrder()));
                    contentValues.put(EnumC63126Oq2.COLUMN_ROLE.key, Integer.valueOf(c63089OpR.getRole()));
                    contentValues.put(EnumC63126Oq2.COLUMN_ALIAS.key, c63089OpR.getAlias());
                    contentValues.put(EnumC63126Oq2.COLUMN_SEC_UID.key, c63089OpR.getSecUid());
                    contentValues.put(EnumC63126Oq2.COLUMN_SILENT.key, Integer.valueOf(c63089OpR.getSilent()));
                    contentValues.put(EnumC63126Oq2.COLUMN_SILENT_TIME.key, Long.valueOf(c63089OpR.getSilentTime()));
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append(EnumC63126Oq2.COLUMN_USER_ID.key);
                    LIZ2.append("=? AND ");
                    LIZ2.append(EnumC63126Oq2.COLUMN_CONVERSATION_ID.key);
                    LIZ2.append("=?");
                    if (C78847Ux1.LJJLIIIJLJLI("participant", contentValues, X1D.LIZIZ(LIZ2), new String[]{String.valueOf(c63089OpR.getUid()), str}) <= 0) {
                        c63089OpR.setConversationType(i);
                        arrayList.add(c63089OpR);
                    } else {
                        C63127Oq3.LIZIZ().getClass();
                        C63127Oq3.LIZ();
                    }
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                if (C78847Ux1.LJJIL("participant", LIZ((C63089OpR) it2.next())) > 0) {
                    C63127Oq3.LIZIZ().getClass();
                    C63127Oq3.LIZ();
                }
            }
            C78847Ux1.LJIJJLI("IMConversationMemberDao.insertOrUpdateMember(String,List)", true);
            C63275OsR.LIZIZ().LJI(currentTimeMillis, "insertOrUpdateMember");
        } catch (Exception e) {
            C63322OtC.LJ("IMConversationMemberDao", e);
            C78847Ux1.LJIJJLI("IMConversationMemberDao.insertOrUpdateMember(String,List)", false);
        }
        C63309Osz LIZLLL = C63309Osz.LIZLLL();
        LIZLLL.getClass();
        if (!list.isEmpty()) {
            C115384fu c115384fu = new C115384fu(list);
            C3E7 c3e7 = LIZLLL.LIZIZ;
            if (c3e7 != null) {
                c115384fu.invoke(c3e7);
            }
        }
        return true;
    }

    public static void LJIIIIZZ(int i, String str, List list) {
        if (TextUtils.isEmpty(str) || list == null) {
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("IMConversationMemberDao insertOrUpdateMemberNoTrans, cid:");
        LIZ.append(str);
        C63322OtC.LIZJ(X1D.LIZIZ(LIZ));
        long currentTimeMillis = System.currentTimeMillis();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = (ArrayList) list;
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            C63089OpR c63089OpR = (C63089OpR) it.next();
            if (c63089OpR != null) {
                ContentValues contentValues = new ContentValues();
                contentValues.put(EnumC63126Oq2.COLUMN_SORT_ORDER.key, Long.valueOf(c63089OpR.getSortOrder()));
                contentValues.put(EnumC63126Oq2.COLUMN_ROLE.key, Integer.valueOf(c63089OpR.getRole()));
                contentValues.put(EnumC63126Oq2.COLUMN_ALIAS.key, c63089OpR.getAlias());
                contentValues.put(EnumC63126Oq2.COLUMN_SEC_UID.key, c63089OpR.getSecUid());
                contentValues.put(EnumC63126Oq2.COLUMN_SILENT.key, Integer.valueOf(c63089OpR.getSilent()));
                contentValues.put(EnumC63126Oq2.COLUMN_SILENT_TIME.key, Long.valueOf(c63089OpR.getSilentTime()));
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append(EnumC63126Oq2.COLUMN_USER_ID.key);
                LIZ2.append("=? AND ");
                if (C78847Ux1.LJJLIIIJLJLI("participant", contentValues, JBR.LJFF(LIZ2, EnumC63126Oq2.COLUMN_CONVERSATION_ID.key, "=?", LIZ2), new String[]{String.valueOf(c63089OpR.getUid()), str}) <= 0) {
                    c63089OpR.setConversationType(i);
                    arrayList.add(c63089OpR);
                } else {
                    C63127Oq3.LIZIZ().getClass();
                    C63127Oq3.LIZ();
                }
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            if (C78847Ux1.LJJIL("participant", LIZ((C63089OpR) it2.next())) > 0) {
                C63127Oq3.LIZIZ().getClass();
                C63127Oq3.LIZ();
            }
        }
        C63275OsR.LIZIZ().LJI(currentTimeMillis, "insertOrUpdateMemberNoTrans");
        C63309Osz LIZLLL = C63309Osz.LIZLLL();
        LIZLLL.getClass();
        if (arrayList2.isEmpty()) {
            return;
        }
        C115384fu c115384fu = new C115384fu(list);
        C3E7 c3e7 = LIZLLL.LIZIZ;
        if (c3e7 == null) {
            return;
        }
        c115384fu.invoke(c3e7);
    }
}
