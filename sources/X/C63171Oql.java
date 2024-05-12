package X;

import android.content.ContentValues;
import android.text.TextUtils;
import defpackage.b0;

/* renamed from: X.Oql, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63171Oql {
    public static String LIZIZ() {
        StringBuilder sb = new StringBuilder("create table if not exists conversation_kv(");
        EnumC63177Oqr[] values = EnumC63177Oqr.values();
        int length = values.length;
        int i = 0;
        while (i < length) {
            EnumC63177Oqr enumC63177Oqr = values[i];
            sb.append(enumC63177Oqr.key);
            sb.append(" ");
            i = C0EH.LIZIZ(sb, enumC63177Oqr.type, ",", i, 1);
        }
        sb.append("primary key(");
        sb.append(EnumC63177Oqr.COLUMN_CONV_ID.key);
        sb.append(",");
        return AnonymousClass073.LIZIZ(sb, EnumC63177Oqr.COLUMN_KEY.key, "));");
    }

    /* JADX WARN: Not initialized variable reg: 1, insn: 0x0069: MOVE (r4 I:??[OBJECT, ARRAY]) = (r1 I:??[OBJECT, ARRAY]) (LINE:33554537), block:B:27:0x0069 */
    public static String LIZ(String str, String str2) {
        InterfaceC63132Oq8 interfaceC63132Oq8;
        InterfaceC63132Oq8 interfaceC63132Oq82;
        InterfaceC63132Oq8 interfaceC63132Oq83 = null;
        if (!TextUtils.isEmpty(str)) {
            try {
                if (!TextUtils.isEmpty(str2)) {
                    try {
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append("select value from conversation_kv where ");
                        LIZ.append(EnumC63177Oqr.COLUMN_CONV_ID.key);
                        LIZ.append("=? AND ");
                        LIZ.append(EnumC63177Oqr.COLUMN_KEY.key);
                        LIZ.append("=?");
                        interfaceC63132Oq82 = C78847Ux1.LJJJLZIJ(X1D.LIZIZ(LIZ), new String[]{str, str2});
                        try {
                            if (interfaceC63132Oq82.moveToFirst()) {
                                String string = interfaceC63132Oq82.getString(interfaceC63132Oq82.getColumnIndex(EnumC63177Oqr.COLUMN_VALUE.key));
                                C63143OqJ.LIZ(interfaceC63132Oq82);
                                return string;
                            }
                        } catch (Exception e) {
                            e = e;
                            C63322OtC.LJ("IMConversationKvDao get", e);
                            C63337OtR.LJ("IMConversationKvDao get", e);
                            C63143OqJ.LIZ(interfaceC63132Oq82);
                            return null;
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
                }
            } catch (Throwable th2) {
                th = th2;
                interfaceC63132Oq83 = interfaceC63132Oq8;
            }
        }
        return null;
    }

    public static boolean LIZJ(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str3)) {
            if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
                C63322OtC.LJI("IMConversationKvDao ", C0ON.LIZJ("delete invalid:", str, ", ", str2), null);
                return false;
            }
            try {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("delete from conversation_kv where ");
                LIZ.append(EnumC63177Oqr.COLUMN_CONV_ID.key);
                LIZ.append("=\"");
                LIZ.append(str);
                LIZ.append("\" AND ");
                LIZ.append(EnumC63177Oqr.COLUMN_KEY.key);
                LIZ.append("=\"");
                LIZ.append(str2);
                LIZ.append("\"");
                boolean LJIL = C78847Ux1.LJIL(X1D.LIZIZ(LIZ));
                if (!LJIL) {
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("IMConversationKvDao delete failed:");
                    LIZ2.append(str);
                    LIZ2.append(", ");
                    LIZ2.append(str2);
                    C63322OtC.LIZLLL(X1D.LIZIZ(LIZ2));
                }
                return LJIL;
            } catch (Exception e) {
                C63322OtC.LIZLLL("IMConversationKvDao ");
                C16880lQ.LLLLIIL(e);
                C63337OtR.LJFF(e);
                return false;
            }
        }
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("IMConversationKvDao insertOrUpdate params invalid, cid:");
            LIZ3.append(str);
            LIZ3.append(", key:");
            LIZ3.append(str2);
            C63322OtC.LIZLLL(X1D.LIZIZ(LIZ3));
            return false;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put(EnumC63177Oqr.COLUMN_CONV_ID.key, str);
        contentValues.put(EnumC63177Oqr.COLUMN_KEY.key, str2);
        contentValues.put(EnumC63177Oqr.COLUMN_VALUE.key, str3);
        long LJJJZ = C78847Ux1.LJJJZ("conversation_kv", contentValues);
        if (LJJJZ < 0) {
            StringBuilder LIZLLL = C06540Nm.LIZLLL("IMConversationKvDao insertOrUpdate failed, cid:", str, ", key:", str2, ", value:");
            b0.LJ(LIZLLL, str3, ", result:", LJJJZ);
            C63322OtC.LIZLLL(X1D.LIZIZ(LIZLLL));
            return false;
        }
        if (LJJJZ <= 0) {
            return false;
        }
        return true;
    }
}
