package X;

import android.app.Activity;
import com.bytedance.crash.vmMonitor.NativeVMMonitor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.PKi, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64272PKi {
    public static java.util.Map<String, Integer> LIZ;
    public static ArrayList<C64287PKx> LIZIZ;
    public static java.util.Map<Integer, Integer> LIZJ;
    public static C64272PKi LIZLLL;
    public static final C64215PId LJ = new C64215PId();

    public static C64272PKi LIZ() {
        if (LIZLLL == null) {
            synchronized (C64272PKi.class) {
                if (LIZLLL == null) {
                    LIZLLL = new C64272PKi();
                }
            }
        }
        return LIZLLL;
    }

    public static JSONArray LIZIZ() {
        JSONArray jSONArray = new JSONArray();
        Iterator<C64287PKx> it = LIZIZ.iterator();
        while (it.hasNext()) {
            C64287PKx next = it.next();
            JSONArray jSONArray2 = new JSONArray();
            jSONArray2.put(next.LIZLLL);
            jSONArray2.put(next.LIZ);
            jSONArray2.put(next.LIZIZ);
            jSONArray2.put(next.LIZJ);
            ArrayList<Integer> arrayList = next.LJ;
            JSONArray jSONArray3 = new JSONArray();
            Iterator<Integer> it2 = arrayList.iterator();
            while (it2.hasNext()) {
                jSONArray3.put(it2.next());
            }
            jSONArray2.put(jSONArray3);
            jSONArray.put(jSONArray2);
        }
        return jSONArray;
    }

    public static JSONObject LIZJ() {
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry entry : ((HashMap) LIZ).entrySet()) {
            PJC.LJIIJ(jSONObject, String.valueOf(((Integer) entry.getValue()).intValue()), entry.getKey());
        }
        return jSONObject;
    }

    public C64272PKi() {
        LIZ = new HashMap();
        LIZIZ = new ArrayList<>();
        LIZJ = new HashMap();
    }

    public static void LIZLLL(Activity activity, int i) {
        String localClassName = activity.getLocalClassName();
        if (localClassName == null) {
            return;
        }
        if (!((HashMap) LIZ).containsKey(localClassName)) {
            HashMap hashMap = (HashMap) LIZ;
            hashMap.put(localClassName, Integer.valueOf(hashMap.size()));
            NativeVMMonitor LJI = NativeVMMonitor.LJI();
            int intValue = ((Integer) ((HashMap) LIZ).get(localClassName)).intValue();
            LJI.getClass();
            if (NativeVMMonitor.LIZJ(intValue, localClassName) != 0) {
                return;
            }
        }
        int intValue2 = ((Integer) ((HashMap) LIZ).get(localClassName)).intValue();
        int hashCode = activity.hashCode();
        LIZIZ.add(new C64287PKx(i, intValue2));
        if (i == 5) {
            ((HashMap) LIZJ).remove(Integer.valueOf(hashCode));
        } else {
            ((HashMap) LIZJ).put(Integer.valueOf(hashCode), Integer.valueOf((i * 1000) + intValue2));
        }
        NativeVMMonitor.LJI().getClass();
        NativeVMMonitor.LIZIZ(intValue2, hashCode, i);
    }
}
