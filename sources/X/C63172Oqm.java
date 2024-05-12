package X;

import android.content.ContentValues;
import android.text.TextUtils;
import defpackage.b0;

/* renamed from: X.Oqm, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63172Oqm {
    public static String[] LIZJ() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("create index msg_ky_id_index on message_kv(");
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("create index msg_ky_key_index on message_kv(");
        return new String[]{JBR.LJFF(LIZ, EnumC63175Oqp.COLUMN_MSG_ID.key, ")", LIZ), JBR.LJFF(LIZ2, EnumC63175Oqp.COLUMN_KEY.key, ")", LIZ2)};
    }

    public static String LIZIZ() {
        StringBuilder sb = new StringBuilder("create table if not exists message_kv(");
        EnumC63175Oqp[] values = EnumC63175Oqp.values();
        int length = values.length;
        int i = 0;
        while (i < length) {
            EnumC63175Oqp enumC63175Oqp = values[i];
            sb.append(enumC63175Oqp.key);
            sb.append(" ");
            i = C0EH.LIZIZ(sb, enumC63175Oqp.type, ",", i, 1);
        }
        sb.append("primary key(");
        sb.append(EnumC63175Oqp.COLUMN_MSG_ID.key);
        sb.append(",");
        return AnonymousClass073.LIZIZ(sb, EnumC63175Oqp.COLUMN_KEY.key, "));");
    }

    public static String LIZ(String str, String str2) {
        InterfaceC63132Oq8 interfaceC63132Oq8;
        InterfaceC63132Oq8 interfaceC63132Oq82 = null;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return null;
        }
        try {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("select value from message_kv where ");
            LIZ.append(EnumC63175Oqp.COLUMN_MSG_ID.key);
            LIZ.append("=? AND ");
            LIZ.append(EnumC63175Oqp.COLUMN_KEY.key);
            LIZ.append("=?");
            interfaceC63132Oq8 = C78847Ux1.LJJJLZIJ(X1D.LIZIZ(LIZ), new String[]{str, str2});
            try {
                try {
                    if (interfaceC63132Oq8.moveToFirst()) {
                        String string = interfaceC63132Oq8.getString(interfaceC63132Oq8.getColumnIndex(EnumC63175Oqp.COLUMN_VALUE.key));
                        C63143OqJ.LIZ(interfaceC63132Oq8);
                        return string;
                    }
                } catch (Exception e) {
                    e = e;
                    C63322OtC.LJ("IMMsgKvDaoget", e);
                    C16880lQ.LLLLIIL(e);
                    C63337OtR.LJFF(e);
                    C63143OqJ.LIZ(interfaceC63132Oq8);
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                interfaceC63132Oq82 = interfaceC63132Oq8;
                C63143OqJ.LIZ(interfaceC63132Oq82);
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            interfaceC63132Oq8 = null;
        } catch (Throwable th2) {
            th = th2;
            C63143OqJ.LIZ(interfaceC63132Oq82);
            throw th;
        }
        C63143OqJ.LIZ(interfaceC63132Oq8);
        return null;
    }

    public static void LIZLLL(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str3)) {
            if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
                C63322OtC.LJI("IMMsgKvDao", C0ON.LIZJ("delete invalid:", str, ", ", str2), null);
                return;
            }
            try {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("delete from message_kv where ");
                LIZ.append(EnumC63175Oqp.COLUMN_MSG_ID.key);
                LIZ.append("=\"");
                LIZ.append(str);
                LIZ.append("\" AND ");
                LIZ.append(EnumC63175Oqp.COLUMN_KEY.key);
                LIZ.append("=\"");
                LIZ.append(str2);
                LIZ.append("\"");
                if (C78847Ux1.LJIL(X1D.LIZIZ(LIZ))) {
                    return;
                }
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("IMMsgKvDaodelete failed:");
                LIZ2.append(str);
                LIZ2.append(", ");
                LIZ2.append(str2);
                C63322OtC.LIZLLL(X1D.LIZIZ(LIZ2));
                return;
            } catch (Exception e) {
                C63322OtC.LIZLLL("IMMsgKvDao");
                C16880lQ.LLLLIIL(e);
                C63337OtR.LJFF(e);
                return;
            }
        }
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("IMMsgKvDaoinsertOrUpdate params invalid, cid:");
            LIZ3.append(str);
            LIZ3.append(", key:");
            LIZ3.append(str2);
            C63322OtC.LIZLLL(X1D.LIZIZ(LIZ3));
            return;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put(EnumC63175Oqp.COLUMN_MSG_ID.key, str);
        contentValues.put(EnumC63175Oqp.COLUMN_KEY.key, str2);
        contentValues.put(EnumC63175Oqp.COLUMN_VALUE.key, str3);
        long LJJJZ = C78847Ux1.LJJJZ("message_kv", contentValues);
        if (LJJJZ < 0) {
            StringBuilder LIZLLL = C06540Nm.LIZLLL("IMMsgKvDaoinsertOrUpdate failed, cid:", str, ", key:", str2, ", value:");
            b0.LJ(LIZLLL, str3, ", result:", LJJJZ);
            C63322OtC.LIZLLL(X1D.LIZIZ(LIZLLL));
        }
    }
}
