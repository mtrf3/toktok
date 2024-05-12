package X;

import android.text.TextUtils;
import java.util.HashMap;

/* renamed from: X.Opo, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63112Opo {
    public static String LJ() {
        StringBuilder sb = new StringBuilder("create table if not exists conversation_core (");
        EnumC63114Opq[] values = EnumC63114Opq.values();
        int length = values.length;
        int i = 0;
        while (i < length) {
            EnumC63114Opq enumC63114Opq = values[i];
            sb.append(enumC63114Opq.key);
            sb.append(" ");
            i = C0EH.LIZIZ(sb, enumC63114Opq.type, ",", i, 1);
        }
        String sb2 = sb.toString();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(sb2.substring(0, sb2.length() - 1));
        LIZ.append(");");
        return X1D.LIZIZ(LIZ);
    }

    public static C63088OpQ LIZIZ(InterfaceC63132Oq8 interfaceC63132Oq8) {
        C63088OpQ c63088OpQ = new C63088OpQ();
        c63088OpQ.setConversationId(interfaceC63132Oq8.getString(interfaceC63132Oq8.getColumnIndex(EnumC63114Opq.COLUMN_ID.key)));
        c63088OpQ.setVersion(interfaceC63132Oq8.getLong(interfaceC63132Oq8.getColumnIndex(EnumC63114Opq.COLUMN_VERSION.key)));
        c63088OpQ.setName(interfaceC63132Oq8.getString(interfaceC63132Oq8.getColumnIndex(EnumC63114Opq.COLUMN_NAME.key)));
        c63088OpQ.setIcon(interfaceC63132Oq8.getString(interfaceC63132Oq8.getColumnIndex(EnumC63114Opq.COLUMN_ICON.key)));
        c63088OpQ.setDesc(interfaceC63132Oq8.getString(interfaceC63132Oq8.getColumnIndex(EnumC63114Opq.COLUMN_DESC.key)));
        c63088OpQ.setNotice(interfaceC63132Oq8.getString(interfaceC63132Oq8.getColumnIndex(EnumC63114Opq.COLUMN_NOTICE.key)));
        c63088OpQ.setOwner(interfaceC63132Oq8.getLong(interfaceC63132Oq8.getColumnIndex(EnumC63114Opq.COLUMN_OWNER_ID.key)));
        c63088OpQ.setSecOwner(interfaceC63132Oq8.getString(interfaceC63132Oq8.getColumnIndex(EnumC63114Opq.COLUMN_SEC_OWNER.key)));
        c63088OpQ.setSilent(interfaceC63132Oq8.getInt(interfaceC63132Oq8.getColumnIndex(EnumC63114Opq.COLUMN_SILENT.key)));
        c63088OpQ.setSilentNormalOnly(interfaceC63132Oq8.getInt(interfaceC63132Oq8.getColumnIndex(EnumC63114Opq.COLUMN_SILENT_NORMAL_ONLY.key)));
        c63088OpQ.setMode(interfaceC63132Oq8.getInt(interfaceC63132Oq8.getColumnIndex(EnumC63114Opq.COLUMN_MODE.key)));
        c63088OpQ.setExtStr(interfaceC63132Oq8.getString(interfaceC63132Oq8.getColumnIndex(EnumC63114Opq.COLUMN_EXT.key)));
        return c63088OpQ;
    }

    public static C63088OpQ LIZLLL(String str) {
        InterfaceC63132Oq8 interfaceC63132Oq8;
        InterfaceC63132Oq8 interfaceC63132Oq82 = null;
        r2 = null;
        r2 = null;
        C63088OpQ c63088OpQ = null;
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            try {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("select * from conversation_core where ");
                LIZ.append(EnumC63114Opq.COLUMN_ID.key);
                LIZ.append("=?");
                interfaceC63132Oq8 = C78847Ux1.LJJJLZIJ(X1D.LIZIZ(LIZ), new String[]{str});
                try {
                    if (interfaceC63132Oq8.moveToFirst()) {
                        c63088OpQ = LIZIZ(interfaceC63132Oq8);
                    }
                } catch (Exception e) {
                    e = e;
                    C63322OtC.LJ("IMConversationCoreDao get ", e);
                    C63337OtR.LJFF(e);
                    C63143OqJ.LIZ(interfaceC63132Oq8);
                    return c63088OpQ;
                }
            } catch (Exception e2) {
                e = e2;
                interfaceC63132Oq8 = null;
            } catch (Throwable th) {
                th = th;
                C63143OqJ.LIZ(interfaceC63132Oq82);
                throw th;
            }
            C63143OqJ.LIZ(interfaceC63132Oq8);
            return c63088OpQ;
        } catch (Throwable th2) {
            th = th2;
            interfaceC63132Oq82 = interfaceC63132Oq8;
        }
    }

    public static boolean LJFF(C63088OpQ c63088OpQ) {
        boolean z = false;
        if (c63088OpQ == null || TextUtils.isEmpty(c63088OpQ.getConversationId())) {
            return false;
        }
        Boolean bool = Boolean.FALSE;
        InterfaceC63146OqM interfaceC63146OqM = null;
        try {
            try {
                C63308Osy.LJI().LIZLLL().getClass();
                StringBuilder sb = new StringBuilder();
                StringBuilder sb2 = new StringBuilder();
                sb.append(" replace into conversation_core(");
                for (EnumC63114Opq enumC63114Opq : EnumC63114Opq.values()) {
                    sb.append(enumC63114Opq.key);
                    sb.append(",");
                    sb2.append("?,");
                }
                String sb3 = sb.toString();
                String sb4 = sb2.toString();
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(sb3.substring(0, sb3.length() - 1));
                LIZ.append(") values (");
                LIZ.append(sb4.substring(0, sb4.length() - 1));
                LIZ.append(");");
                String LIZIZ = X1D.LIZIZ(LIZ);
                C78847Ux1.LJJLIIIJJI("IMConversationCoreDao.insertOrUpdate");
                interfaceC63146OqM = C78847Ux1.LJIJ(LIZIZ);
                LIZ(interfaceC63146OqM, c63088OpQ);
                if (interfaceC63146OqM != null) {
                    if (interfaceC63146OqM.LJIJJLI() > 0) {
                        z = true;
                    }
                    bool = Boolean.valueOf(z);
                }
                if (bool.booleanValue()) {
                    C63308Osy.LJI().LIZLLL().getClass();
                }
            } catch (Exception e) {
                C63322OtC.LJ("IMConversationCoreDao insertOrUpdate ", e);
                C63337OtR.LJ("IMConversationCoreDao insertOrUpdate", e);
            }
            C78847Ux1.LJIJJLI("IMConversationCoreDao.insertOrUpdate", true);
            C63143OqJ.LIZIZ(interfaceC63146OqM);
            return bool.booleanValue();
        } catch (Throwable th) {
            C78847Ux1.LJIJJLI("IMConversationCoreDao.insertOrUpdate", true);
            C63143OqJ.LIZIZ(interfaceC63146OqM);
            throw th;
        }
    }

    public static void LIZ(InterfaceC63146OqM interfaceC63146OqM, C63088OpQ c63088OpQ) {
        if (interfaceC63146OqM == null || c63088OpQ == null) {
            return;
        }
        interfaceC63146OqM.LJJIIZI();
        int ordinal = EnumC63114Opq.COLUMN_ID.ordinal() + 1;
        String conversationId = c63088OpQ.getConversationId();
        String str = "";
        if (conversationId == null) {
            conversationId = "";
        }
        interfaceC63146OqM.LJJII(ordinal, conversationId);
        interfaceC63146OqM.LJIIIZ(EnumC63114Opq.COLUMN_VERSION.ordinal() + 1, c63088OpQ.getVersion());
        int ordinal2 = EnumC63114Opq.COLUMN_NAME.ordinal() + 1;
        String name = c63088OpQ.getName();
        if (name == null) {
            name = "";
        }
        interfaceC63146OqM.LJJII(ordinal2, name);
        int ordinal3 = EnumC63114Opq.COLUMN_ICON.ordinal() + 1;
        String icon = c63088OpQ.getIcon();
        if (icon == null) {
            icon = "";
        }
        interfaceC63146OqM.LJJII(ordinal3, icon);
        int ordinal4 = EnumC63114Opq.COLUMN_DESC.ordinal() + 1;
        String desc = c63088OpQ.getDesc();
        if (desc == null) {
            desc = "";
        }
        interfaceC63146OqM.LJJII(ordinal4, desc);
        int ordinal5 = EnumC63114Opq.COLUMN_NOTICE.ordinal() + 1;
        String notice = c63088OpQ.getNotice();
        if (notice == null) {
            notice = "";
        }
        interfaceC63146OqM.LJJII(ordinal5, notice);
        interfaceC63146OqM.LJIIIZ(EnumC63114Opq.COLUMN_OWNER_ID.ordinal() + 1, c63088OpQ.getOwner());
        int ordinal6 = EnumC63114Opq.COLUMN_SEC_OWNER.ordinal() + 1;
        String secOwner = c63088OpQ.getSecOwner();
        if (secOwner == null) {
            secOwner = "";
        }
        interfaceC63146OqM.LJJII(ordinal6, secOwner);
        interfaceC63146OqM.LJIIIZ(EnumC63114Opq.COLUMN_SILENT.ordinal() + 1, c63088OpQ.getSilent());
        interfaceC63146OqM.LJIIIZ(EnumC63114Opq.COLUMN_SILENT_NORMAL_ONLY.ordinal() + 1, c63088OpQ.getSilentNormalOnly());
        interfaceC63146OqM.LJIIIZ(EnumC63114Opq.COLUMN_MODE.ordinal() + 1, c63088OpQ.getMode());
        int ordinal7 = EnumC63114Opq.COLUMN_EXT.ordinal() + 1;
        String extStr = c63088OpQ.getExtStr();
        if (extStr != null) {
            str = extStr;
        }
        interfaceC63146OqM.LJJII(ordinal7, str);
    }

    public static void LIZJ(InterfaceC63132Oq8 interfaceC63132Oq8, java.util.Map<String, C63088OpQ> map) {
        if (interfaceC63132Oq8 == null) {
            return;
        }
        int columnIndex = interfaceC63132Oq8.getColumnIndex(EnumC63114Opq.COLUMN_ID.key);
        int columnIndex2 = interfaceC63132Oq8.getColumnIndex(EnumC63114Opq.COLUMN_VERSION.key);
        int columnIndex3 = interfaceC63132Oq8.getColumnIndex(EnumC63114Opq.COLUMN_NAME.key);
        int columnIndex4 = interfaceC63132Oq8.getColumnIndex(EnumC63114Opq.COLUMN_ICON.key);
        int columnIndex5 = interfaceC63132Oq8.getColumnIndex(EnumC63114Opq.COLUMN_DESC.key);
        int columnIndex6 = interfaceC63132Oq8.getColumnIndex(EnumC63114Opq.COLUMN_NOTICE.key);
        int columnIndex7 = interfaceC63132Oq8.getColumnIndex(EnumC63114Opq.COLUMN_OWNER_ID.key);
        int columnIndex8 = interfaceC63132Oq8.getColumnIndex(EnumC63114Opq.COLUMN_SEC_OWNER.key);
        int columnIndex9 = interfaceC63132Oq8.getColumnIndex(EnumC63114Opq.COLUMN_SILENT.key);
        int columnIndex10 = interfaceC63132Oq8.getColumnIndex(EnumC63114Opq.COLUMN_SILENT_NORMAL_ONLY.key);
        int columnIndex11 = interfaceC63132Oq8.getColumnIndex(EnumC63114Opq.COLUMN_MODE.key);
        int columnIndex12 = interfaceC63132Oq8.getColumnIndex(EnumC63114Opq.COLUMN_EXT.key);
        while (interfaceC63132Oq8.moveToNext()) {
            C63088OpQ c63088OpQ = new C63088OpQ();
            String string = interfaceC63132Oq8.getString(columnIndex);
            c63088OpQ.setConversationId(string);
            c63088OpQ.setVersion(interfaceC63132Oq8.getLong(columnIndex2));
            c63088OpQ.setName(interfaceC63132Oq8.getString(columnIndex3));
            c63088OpQ.setIcon(interfaceC63132Oq8.getString(columnIndex4));
            c63088OpQ.setDesc(interfaceC63132Oq8.getString(columnIndex5));
            c63088OpQ.setNotice(interfaceC63132Oq8.getString(columnIndex6));
            c63088OpQ.setOwner(interfaceC63132Oq8.getLong(columnIndex7));
            c63088OpQ.setSecOwner(interfaceC63132Oq8.getString(columnIndex8));
            c63088OpQ.setSilent(interfaceC63132Oq8.getInt(columnIndex9));
            c63088OpQ.setSilentNormalOnly(interfaceC63132Oq8.getInt(columnIndex10));
            c63088OpQ.setMode(interfaceC63132Oq8.getInt(columnIndex11));
            c63088OpQ.setExtStr(interfaceC63132Oq8.getString(columnIndex12));
            ((HashMap) map).put(string, c63088OpQ);
        }
    }
}
