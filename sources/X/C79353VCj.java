package X;

import android.content.ContentValues;
import android.database.Cursor;
import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.performance.LiveGiftNewGifterBadgeSetting;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.VCj, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C79353VCj extends C78596Usy {
    public static final String LJLLI;
    public static final String LJLLILLLL;
    public static final String LJLLJ;
    public static final String LJLLL;
    public static final C79364VCu LJLLLL;
    public static final java.util.Map<String, C79365VCv> LJLLLLLL;

    static {
        StringBuilder LIZLLL = C06540Nm.LIZLLL("CREATE TABLE IF NOT EXISTS ", "settings_config", " (", "settings_name", " text not null ,");
        YE1.LIZLLL(LIZLLL, "settings_value", " text ,", "expand_value", " text ,");
        YE1.LIZLLL(LIZLLL, "update_time", " text ,", "create_time", " timestamp not null default (datetime('now','localtime')))");
        LJLLI = X1D.LIZIZ(LIZLLL);
        LJLLILLLL = "StrategyConfig";
        LJLLJ = "FeatureConfig";
        LJLLL = "CommonConfig";
        LJLLLL = new C79364VCu();
        LJLLLLLL = new ConcurrentHashMap();
    }

    public static void LJJL(List list) {
        long currentTimeMillis = System.currentTimeMillis();
        if (list == null || list.size() <= 0) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        String[] strArr = {"settings_name"};
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C79365VCv c79365VCv = (C79365VCv) it.next();
            ContentValues contentValues = new ContentValues();
            contentValues.put("settings_name", c79365VCv.LIZ);
            contentValues.put("settings_value", c79365VCv.LIZIZ);
            contentValues.put("expand_value", c79365VCv.LIZJ);
            contentValues.put("update_time", C78596Usy.LJIILL());
            sb.append(c79365VCv.LIZ);
            arrayList.add(contentValues);
        }
        long LJJJJL = C78596Usy.LJJJJL("settings_config", strArr, arrayList);
        C79364VCu c79364VCu = LJLLLL;
        c79364VCu.LIZ("settings_config", C79360VCq.MONITOR_UPDATE_OPERATE, sb.toString(), LiveGiftNewGifterBadgeSetting.DEFAULT, LJJJJL, currentTimeMillis);
        c79364VCu.uploadMonitorLog();
    }

    public static C79365VCv LJJLIIIIJ(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        C79365VCv c79365VCv = new C79365VCv();
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) LJLLLLLL;
        if (concurrentHashMap.containsKey(str)) {
            return (C79365VCv) concurrentHashMap.get(str);
        }
        long currentTimeMillis = System.currentTimeMillis();
        Cursor LJJJJJL = C78596Usy.LJJJJJL("settings_config", new String[]{"settings_name", "settings_value", "expand_value", "update_time", "create_time"}, "settings_name = ?", new String[]{str});
        if (LJJJJJL == null) {
            return null;
        }
        long j = -1;
        while (LJJJJJL.moveToNext()) {
            try {
                c79365VCv.LIZ = LJJJJJL.getString(0);
                c79365VCv.LIZIZ = LJJJJJL.getString(1);
                c79365VCv.LIZJ = LJJJJJL.getString(2);
                c79365VCv.LIZLLL = LJJJJJL.getString(3);
                c79365VCv.LJ = LJJJJJL.getString(4);
                ((ConcurrentHashMap) LJLLLLLL).put(str, c79365VCv);
                j = 1;
            } catch (Exception unused) {
            } catch (Throwable th) {
                try {
                    LJJJJJL.close();
                } catch (Exception unused2) {
                }
                throw th;
            }
        }
        C79364VCu c79364VCu = LJLLLL;
        c79364VCu.LIZ("settings_config", C79360VCq.MONITOR_QUERY_OPERATE, str, LiveGiftNewGifterBadgeSetting.DEFAULT, j, currentTimeMillis);
        c79364VCu.uploadMonitorLog();
        try {
            LJJJJJL.close();
            return c79365VCv;
        } catch (Exception unused3) {
            return c79365VCv;
        }
    }

    public static JSONObject LJJLI(String str, String str2) {
        JSONObject jSONObject = null;
        if (TextUtils.isEmpty(str2)) {
            return null;
        }
        C79365VCv LJJLIIIIJ = LJJLIIIIJ(str);
        new JSONObject();
        if (LJJLIIIIJ == null || TextUtils.isEmpty(LJJLIIIIJ.LIZIZ)) {
            return null;
        }
        try {
            JSONObject jSONObject2 = new JSONObject(LJJLIIIIJ.LIZIZ);
            if (!jSONObject2.has(str2)) {
                return null;
            }
            jSONObject = jSONObject2.optJSONObject(str2);
            return jSONObject;
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
            return jSONObject;
        }
    }
}
