package X;

import android.content.Context;
import com.ss.android.common.util.MultiProcessSharedProvider;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.EeC, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36912EeC {
    public static volatile C36912EeC LIZJ;
    public final Context LIZ;
    public final C35976EAa<Long, C36915EeF> LIZIZ;

    public final List<C36915EeF> LIZ() {
        LinkedHashMap linkedHashMap;
        LinkedList linkedList = new LinkedList();
        if (!C36916EeG.LIZIZ(this.LIZ).LJ) {
            this.LIZIZ.LIZ();
            return linkedList;
        }
        C35976EAa<Long, C36915EeF> c35976EAa = this.LIZIZ;
        synchronized (c35976EAa) {
            linkedHashMap = new LinkedHashMap(c35976EAa.LIZ);
        }
        if (linkedHashMap.isEmpty()) {
            return linkedList;
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            if (entry != null) {
                linkedList.add(entry.getValue());
            }
        }
        return linkedList;
    }

    public C36912EeC(Context context) {
        Context LLLLL = C16880lQ.LLLLL(context);
        this.LIZ = LLLLL;
        this.LIZIZ = new C35976EAa<>(C36916EeG.LIZIZ(context).LIZLLL);
        try {
            ((C36913EeD) C36916EeG.LJI).getClass();
            String LIZIZ = MultiProcessSharedProvider.LIZJ(LLLLL).LIZIZ("pop_window_message_cache_list");
            if (!C38354F3m.LJ(LIZIZ)) {
                JSONArray jSONArray = new JSONArray(LIZIZ);
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    JSONObject optJSONObject = jSONArray.optJSONObject(i);
                    C36915EeF c36915EeF = new C36915EeF();
                    c36915EeF.LIZ(optJSONObject);
                    this.LIZIZ.LIZIZ(Long.valueOf(c36915EeF.LIZ), c36915EeF);
                }
            }
        } catch (Throwable unused) {
        }
    }
}
