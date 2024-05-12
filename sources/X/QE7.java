package X;

import android.content.Context;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.HashMap;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class QE7 {
    public static volatile boolean LJJIJ;
    public static volatile QE7 LJJIJIIJI;
    public int LIZJ;
    public long LIZLLL;
    public long LJ;
    public long LJFF;
    public long LJI;
    public long LJII;
    public long LJIIIIZZ;
    public long LJIIIZ;
    public long LJIIJ;
    public long LJIIJJI;
    public long LJIIL;
    public long LJIILIIL;
    public long LJIILJJIL;
    public long LJIILL;
    public long LJIILLIIL;
    public long LJIIZILJ;
    public EnumC64762PbK LIZ = EnumC64762PbK.NONE;
    public boolean LIZIZ = true;
    public long LJIJ = -1;
    public long LJIJI = -1;
    public long LJIJJ = -1;
    public long LJIJJLI = -1;
    public long LJIL = -1;
    public long LJJ = -1;
    public long LJJI = -1;
    public long LJJIFFI = -1;
    public long LJJII = -1;
    public long LJJIII = -1;
    public long LJJIIJ = -1;
    public long LJJIIJZLJL = -1;
    public long LJJIIZ = -1;
    public long LJJIIZI = -1;

    static {
        C16880lQ.LJLLJ(QE7.class);
        LJJIJ = false;
    }

    public static QE7 LIZ() {
        if (LJJIJIIJI == null) {
            synchronized (QE7.class) {
                if (LJJIJIIJI == null) {
                    LJJIJIIJI = new QE7();
                }
            }
        }
        return LJJIJIIJI;
    }

    public static boolean LIZIZ(Context context, List list) {
        Class<?> cls;
        HashMap hashMap = null;
        try {
            cls = Class.forName("com.bytedance.mobsec.metasec.ml.MSB");
        } catch (ClassNotFoundException unused) {
            cls = null;
        }
        if (cls == null) {
            try {
                cls = Class.forName("com.bytedance.mobsec.metasec.ov.MSB");
            } catch (ClassNotFoundException unused2) {
            }
        }
        if (cls == null) {
            return false;
        }
        if (list != null) {
            try {
                if (list.size() == 2) {
                    hashMap = new HashMap();
                    hashMap.put("http_callback", String.valueOf(ListProtector.get(list, 0)));
                    hashMap.put("ws_callback", String.valueOf(ListProtector.get(list, 1)));
                }
            } catch (Throwable unused3) {
                return false;
            }
        }
        cls.getMethod("a", Context.class, Integer.TYPE, java.util.Map.class).invoke(cls, context, 1, hashMap);
        return true;
    }

    public static void LIZJ(JSONObject jSONObject, String str, long j, long j2) {
        try {
            if (j > j2) {
                jSONObject.put(str, -1);
            } else {
                jSONObject.put(str, j2 - j);
            }
        } catch (JSONException unused) {
        }
    }
}
