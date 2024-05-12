package X;

import android.app.Activity;
import android.app.Application;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.PKf, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64269PKf {
    public static boolean LJIJJLI = true;
    public static boolean LJIL = false;
    public static boolean LJJ = false;
    public static int LJJI = 1;
    public static boolean LJJIFFI = false;
    public static long LJJII = -1;
    public static volatile C64269PKf LJJIII;
    public String LJI;
    public long LJII;
    public String LJIIIIZZ;
    public long LJIIIZ;
    public String LJIIJ;
    public long LJIIJJI;
    public String LJIIL;
    public long LJIILIIL;
    public String LJIILJJIL;
    public long LJIILL;
    public boolean LJIILLIIL;
    public int LJIJI;
    public F85 LJIJJ;
    public final List<String> LIZ = new ArrayList();
    public final List<Long> LIZIZ = new ArrayList();
    public final List<String> LIZJ = new ArrayList();
    public final List<Long> LIZLLL = new ArrayList();
    public final LinkedList<PK2> LJ = new LinkedList<>();
    public final ArrayList<WeakReference<Activity>> LJFF = new ArrayList<>();
    public long LJIIZILJ = -1;
    public final int LJIJ = 50;

    public static C64269PKf LIZLLL() {
        if (LJJIII == null) {
            synchronized (C64269PKf.class) {
                if (LJJIII == null) {
                    LJJIII = new C64269PKf(PK0.LIZIZ);
                }
            }
        }
        return LJJIII;
    }

    public final JSONArray LIZIZ() {
        JSONArray jSONArray = new JSONArray();
        Iterator it = new ArrayList(this.LJ).iterator();
        while (it.hasNext()) {
            jSONArray.put(((PK2) it.next()).toString());
        }
        return jSONArray;
    }

    public C64269PKf(Application application) {
        if (application != null) {
            try {
                application.registerActivityLifecycleCallbacks(new C64275PKl(this));
            } catch (Throwable unused) {
            }
        }
    }

    public static JSONObject LIZ(long j, String str) {
        JSONObject jSONObject = new JSONObject();
        PJC.LJIIJ(jSONObject, "name", str);
        PJC.LJIIJ(jSONObject, "time", Long.valueOf(j));
        return jSONObject;
    }

    public final JSONArray LIZJ(List<String> list, List<Long> list2) {
        JSONArray jSONArray = new JSONArray();
        if (this.LIZ != null) {
            ArrayList arrayList = (ArrayList) list;
            if (!arrayList.isEmpty()) {
                for (int i = 0; i < arrayList.size(); i++) {
                    try {
                        jSONArray.put(LIZ(((Long) ListProtector.get(list2, i)).longValue(), (String) ListProtector.get(arrayList, i)));
                    } catch (Throwable unused) {
                    }
                }
            }
        }
        return jSONArray;
    }

    public final void LJ(int i, String str, String str2, long j) {
        C64214PIc.LIZ().LIZ(new PK1(this, str, str2, j, i));
    }
}
