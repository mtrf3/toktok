package X;

import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import java.io.Closeable;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.QHb, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66735QHb {
    public static String LIZ;

    public static synchronized String LJFF() {
        String lowerCase;
        synchronized (C66735QHb.class) {
            lowerCase = UUID.randomUUID().toString().replace("-", "").toLowerCase();
        }
        return lowerCase;
    }

    public static boolean LIZ(String str) {
        boolean z = false;
        if (TextUtils.isEmpty(str) || "unknown".equalsIgnoreCase(str) || "Null".equalsIgnoreCase(str)) {
            return false;
        }
        int i = 0;
        while (true) {
            if (i < str.length()) {
                if (str.charAt(i) != '0') {
                    break;
                }
                i++;
            } else {
                z = true;
                break;
            }
        }
        return !z;
    }

    public static void LIZIZ(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static JSONObject LIZLLL(JSONObject jSONObject) {
        Iterator<String> keys;
        if (jSONObject == null || (keys = jSONObject.keys()) == null) {
            return null;
        }
        LinkedList linkedList = new LinkedList();
        while (keys.hasNext()) {
            linkedList.add(keys.next());
        }
        try {
            return new JSONObject(jSONObject, (String[]) linkedList.toArray(new String[0]));
        } catch (Exception e) {
            QIX.LJIJJ().LJFF("copyJson failed", e, new Object[0]);
            return jSONObject;
        }
    }

    public static void LJ(SQLiteDatabase sQLiteDatabase) {
        if (sQLiteDatabase != null) {
            try {
                sQLiteDatabase.endTransaction();
            } catch (Throwable th) {
                QIX.LJIJJ().LJFF("end transaction failed", th, new Object[0]);
            }
        }
    }

    public static String LJI(java.util.Map<String, String> map) {
        if (map != null && !map.isEmpty()) {
            try {
                JSONObject jSONObject = new JSONObject();
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    jSONObject.put(entry.getKey(), entry.getValue());
                }
                return jSONObject.toString();
            } catch (Throwable unused) {
                return null;
            }
        }
        return null;
    }

    public static void LIZJ(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject2 != null) {
            try {
                Iterator<String> keys = jSONObject2.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    jSONObject.put(next, jSONObject2.opt(next));
                }
            } catch (JSONException e) {
                QIX.LJIJJ().LJFF("copy failed", e, new Object[0]);
            }
        }
    }

    public static long LJII(String str, JSONObject jSONObject) {
        try {
            return CastLongProtector.parseLong(jSONObject.optString(str));
        } catch (Throwable unused) {
            return 0L;
        }
    }
}
