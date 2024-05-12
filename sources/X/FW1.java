package X;

import Y.IDComparatorS34S0000000_6;
import android.content.SharedPreferences;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class FW1 {
    public static final IDComparatorS34S0000000_6 LJ;
    public static final FW3 LJFF;
    public final SharedPreferences LIZ;
    public final List<FW2> LIZIZ;
    public final long LIZJ;
    public long LIZLLL;

    static {
        C16880lQ.LJLLJ(FW1.class);
        LJ = new IDComparatorS34S0000000_6(7);
        LJFF = new FW3();
    }

    public final void LIZJ() {
        JSONArray jSONArray = new JSONArray();
        Iterator it = ((ArrayList) this.LIZIZ).iterator();
        while (it.hasNext()) {
            FW2 fw2 = (FW2) it.next();
            fw2.getClass();
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("aid", fw2.LIZ);
                jSONObject.put("time", fw2.LIZIZ);
            } catch (JSONException e) {
                C16880lQ.LLLLIIL(e);
            }
            jSONArray.put(jSONObject);
        }
        this.LIZ.edit().putString("push_list", jSONArray.toString()).apply();
    }

    public FW1() {
        ArrayList arrayList = new ArrayList();
        this.LIZIZ = arrayList;
        this.LIZJ = 604800000L;
        SharedPreferences LIZIZ = F9J.LIZIZ(C1791471i.LIZ, 0, "app_push_info");
        this.LIZ = LIZIZ;
        String string = LIZIZ.getString("push_list", "[]");
        arrayList.clear();
        try {
            JSONArray jSONArray = new JSONArray(string);
            for (int i = 0; i < jSONArray.length(); i++) {
                try {
                    JSONObject optJSONObject = jSONArray.optJSONObject(i);
                    if (optJSONObject != null) {
                        FW2 LIZ = FW2.LIZ(optJSONObject);
                        if (!this.LIZIZ.contains(LIZ)) {
                            this.LIZIZ.add(LIZ);
                        }
                    }
                } catch (Exception unused) {
                }
            }
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    public final boolean LIZIZ() {
        FW2 fw2;
        long currentTimeMillis = System.currentTimeMillis();
        boolean z = false;
        if (currentTimeMillis - this.LIZLLL <= 5000) {
            return false;
        }
        this.LIZLLL = currentTimeMillis;
        Collections.sort(this.LIZIZ, LJ);
        int size = ((ArrayList) this.LIZIZ).size() - 1;
        while (size >= 0) {
            do {
                fw2 = (FW2) ListProtector.get(this.LIZIZ, size);
            } while (fw2 == null);
            if (currentTimeMillis <= this.LIZJ + fw2.LIZIZ) {
                break;
            }
            ListProtector.remove(this.LIZIZ, size);
            size--;
            z = true;
        }
        if (z) {
            LIZJ();
        }
        return z;
    }

    public final void LIZ(String str) {
        long currentTimeMillis = System.currentTimeMillis();
        if (C38354F3m.LJ(str)) {
            return;
        }
        FW2 fw2 = new FW2();
        fw2.LIZIZ = currentTimeMillis;
        fw2.LIZ = str;
        synchronized (this) {
            if (!((ArrayList) this.LIZIZ).contains(fw2)) {
                ((ArrayList) this.LIZIZ).add(fw2);
            }
            if (!LIZIZ()) {
                LIZJ();
            }
        }
    }
}
