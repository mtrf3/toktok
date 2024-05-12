package X;

import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.VCk, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C79354VCk extends C78596Usy {
    public static final String LJLLI;
    public static final String LJLLILLLL;
    public static final java.util.Map<String, C79352VCi> LJLLJ;
    public static SharedPreferences LJLLL;
    public static final String LJLLLL;
    public static long LJLLLLLL;
    public static Context LJLZ;
    public static final C79364VCu LJZ;

    static {
        StringBuilder LIZLLL = C06540Nm.LIZLLL("CREATE TABLE IF NOT EXISTS ", "history_info", " (", "session_id", " text not null ,");
        YE1.LIZLLL(LIZLLL, "domain", " text ,", "play_time", " integer ,");
        YE1.LIZLLL(LIZLLL, "first_frame_download_speed", " integer ,", "first_frame_network", " text ,");
        YE1.LIZLLL(LIZLLL, "expand_value", " text,", "update_time", " text ,");
        LJLLI = JBR.LJFF(LIZLLL, "create_time", " timestamp not null default (datetime('now','localtime')))", LIZLLL);
        StringBuilder LIZLLL2 = C06540Nm.LIZLLL("CREATE TRIGGER delete_till INSERT ON ", "history_info", " WHEN (select count(*) from ", "history_info", ") > ");
        LIZLLL2.append(C79346VCc.LIZLLL().LJIILIIL.LJI);
        LIZLLL2.append(" BEGIN  DELETE FROM ");
        LIZLLL2.append("history_info");
        LIZLLL2.append(" WHERE ");
        YE1.LIZLLL(LIZLLL2, "update_time", " IN (SELECT ", "update_time", " FROM ");
        YE1.LIZLLL(LIZLLL2, "history_info", " ORDER BY ", "update_time", " limit (select count(*) -30 from ");
        LJLLILLLL = JBR.LJFF(LIZLLL2, "history_info", ")) ; END ", LIZLLL2);
        new ConcurrentHashMap();
        LJLLJ = new ConcurrentHashMap();
        LJLLLL = "live_stream_strategy_hisinfo";
        LJLLLLLL = 0L;
        LJZ = new C79364VCu();
    }

    public static void LJJL() {
        ((ConcurrentHashMap) LJLLJ).clear();
        Context context = LJLZ;
        if (context == null) {
            return;
        }
        if (LJLLL == null) {
            LJLLL = F9J.LIZIZ(context, 0, LJLLLL);
        }
        SharedPreferences sharedPreferences = LJLLL;
        if (sharedPreferences != null) {
            try {
                SharedPreferences.Editor edit = sharedPreferences.edit();
                edit.clear();
                edit.commit();
                LJLLLLLL = 0L;
            } catch (Exception unused) {
            }
        }
    }

    public static void LJJLI(List list) {
        ArrayList arrayList = (ArrayList) list;
        if (arrayList.size() <= 0) {
            return;
        }
        String[] strArr = {"session_id"};
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C79352VCi c79352VCi = (C79352VCi) it.next();
            ContentValues contentValues = new ContentValues();
            contentValues.put("domain", c79352VCi.mDomain);
            contentValues.put("session_id", c79352VCi.mSessionId);
            contentValues.put("first_frame_network", c79352VCi.mNetwork);
            contentValues.put("first_frame_download_speed", Long.valueOf(c79352VCi.mDownloadSpeed));
            contentValues.put("play_time", Long.valueOf(c79352VCi.mPlayTime));
            contentValues.put("update_time", c79352VCi.mUpdate);
            arrayList2.add(contentValues);
        }
        C78596Usy.LJJJJL("history_info", strArr, arrayList2);
    }
}
