package X;

import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.4ZS, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4ZS {
    public static final C4ZS LIZ = new C4ZS();

    public static void LIZIZ(InterfaceC78848Ux2 db) {
        o.LJIIIZ(db, "db");
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("createSearchContentTable => \n            |");
        LIZ2.append("CREATE TABLE IF NOT EXISTS im_search_content_official(business_type INTEGER, business_id TEXT, content_type TEXT NOT NULL, search_content TEXT, update_time INTEGER, PRIMARY KEY(business_type, business_id, content_type));");
        LIZ2.append("\n        ");
        C63322OtC.LJI("IMSearchDao", C38346F3e.LJJIJIIJIL(X1D.LIZIZ(LIZ2)), null);
        db.LJJIJIIJI("CREATE TABLE IF NOT EXISTS im_search_content_official(business_type INTEGER, business_id TEXT, content_type TEXT NOT NULL, search_content TEXT, update_time INTEGER, PRIMARY KEY(business_type, business_id, content_type));");
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("CREATE VIRTUAL TABLE IF NOT EXISTS im_search_index_official USING fts4(content='im_search_content_official', ");
        C4ZT c4zt = C4ZT.LJLILLLLZI;
        String LJFF = JBR.LJFF(LIZ3, c4zt.LJLIL, ", tokenize=mmicu);", LIZ3);
        StringBuilder LIZ4 = X1D.LIZ();
        LIZ4.append("createSearchIndexTable =>\n                ");
        LIZ4.append(LJFF);
        LIZ4.append("\n            ");
        C63322OtC.LJI("IMSearchDao", C38346F3e.LJJIJIIJI(X1D.LIZIZ(LIZ4)), null);
        db.LJJIJIIJI(LJFF);
        StringBuilder LIZ5 = X1D.LIZ();
        LIZ5.append("\n            |CREATE TRIGGER im_search_content_official_au AFTER UPDATE ON im_search_content_official BEGIN\n            |    INSERT INTO im_search_index_official(docid, ");
        YE1.LIZLLL(LIZ5, c4zt.LJLIL, ") VALUES(new.rowid, new.", "search_content", ");\n            |END;\n        ");
        String LJJIJIIJIL = C38346F3e.LJJIJIIJIL(X1D.LIZIZ(LIZ5));
        StringBuilder LIZ6 = X1D.LIZ();
        LIZ6.append("\n            |CREATE TRIGGER im_search_content_official_ai AFTER INSERT ON im_search_content_official BEGIN\n            |    INSERT INTO im_search_index_official(docid, ");
        YE1.LIZLLL(LIZ6, c4zt.LJLIL, ") VALUES(new.rowid, new.", "search_content", ");\n            |END;\n        ");
        String LJJIJIIJIL2 = C38346F3e.LJJIJIIJIL(X1D.LIZIZ(LIZ6));
        StringBuilder LIZLLL = C06540Nm.LIZLLL("\n            |createBUTriggerSql => \n            |", "CREATE TRIGGER im_search_content_official_bu BEFORE UPDATE ON im_search_content_official BEGIN \n    DELETE FROM im_search_index_official WHERE docid=old.rowid;\nEND;", "\n            |createBDTriggerSql =>\n            |", "CREATE TRIGGER im_search_content_official_bd BEFORE DELETE ON im_search_content_official BEGIN\n    DELETE FROM im_search_index_official WHERE docid=old.rowid;\nEND;", "\n            |createAUTriggerSql =>\n            |");
        YE1.LIZLLL(LIZLLL, LJJIJIIJIL, "\n            |createAITriggerSql =>\n            |", LJJIJIIJIL2, "\n        ");
        C63322OtC.LJI("IMSearchDao", C38346F3e.LJJIJIIJIL(X1D.LIZIZ(LIZLLL)), null);
        db.LJJIJIIJI("CREATE TRIGGER im_search_content_official_bu BEFORE UPDATE ON im_search_content_official BEGIN \n    DELETE FROM im_search_index_official WHERE docid=old.rowid;\nEND;");
        db.LJJIJIIJI("CREATE TRIGGER im_search_content_official_bd BEFORE DELETE ON im_search_content_official BEGIN\n    DELETE FROM im_search_index_official WHERE docid=old.rowid;\nEND;");
        db.LJJIJIIJI(LJJIJIIJIL);
        db.LJJIJIIJI(LJJIJIIJIL2);
    }

    public static C86023Ze LIZ(long j, String str) {
        InterfaceC63132Oq8 interfaceC63132Oq8;
        C86023Ze c86023Ze = null;
        try {
            interfaceC63132Oq8 = C78847Ux1.LJJJLZIJ("SELECT * FROM im_search_content_official WHERE rowid=?", new String[]{String.valueOf(j)});
            try {
                if (interfaceC63132Oq8.moveToNext()) {
                    int columnIndex = interfaceC63132Oq8.getColumnIndex("business_type");
                    int columnIndex2 = interfaceC63132Oq8.getColumnIndex("business_id");
                    int columnIndex3 = interfaceC63132Oq8.getColumnIndex("content_type");
                    int columnIndex4 = interfaceC63132Oq8.getColumnIndex("search_content");
                    int columnIndex5 = interfaceC63132Oq8.getColumnIndex("update_time");
                    String searchContent = interfaceC63132Oq8.getString(columnIndex4);
                    o.LJIIIIZZ(searchContent, "searchContent");
                    int LJJLIIIJL = s.LJJLIIIJL(searchContent, str, 0, false, 6);
                    int i = interfaceC63132Oq8.getInt(columnIndex);
                    String string = interfaceC63132Oq8.getString(columnIndex2);
                    o.LJIIIIZZ(string, "cursor.getString(businessIdIndex)");
                    int i2 = interfaceC63132Oq8.getInt(columnIndex3);
                    String string2 = interfaceC63132Oq8.getString(columnIndex4);
                    o.LJIIIIZZ(string2, "cursor.getString(searchContentIndex)");
                    c86023Ze = new C86023Ze(i, string, i2, string2, interfaceC63132Oq8.getLong(columnIndex5), new OSZ(Integer.valueOf(LJJLIIIJL), Integer.valueOf(str.length())));
                }
                C3C5.m7constructorimpl(C76800UCe.LIZ);
            } catch (Throwable th) {
                th = th;
                C3C5.m7constructorimpl(C141335gf.LIZ(th));
                C63143OqJ.LIZ(interfaceC63132Oq8);
                return c86023Ze;
            }
        } catch (Throwable th2) {
            th = th2;
            interfaceC63132Oq8 = null;
        }
        C63143OqJ.LIZ(interfaceC63132Oq8);
        return c86023Ze;
    }
}
