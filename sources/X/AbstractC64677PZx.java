package X;

import android.text.TextUtils;
import com.bytedance.common.utility.Logger;
import com.bytedance.mt.protector.impl.PatternProtector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.PZx, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract class AbstractC64677PZx {
    public long LJII;
    public long LJIIIIZZ;
    public int LJIIIZ;
    public long LJIIJ;
    public String LJIIJJI;
    public int LJIIL;
    public final List<String> LIZ = new ArrayList();
    public final List<String> LIZIZ = new ArrayList();
    public final List<String> LIZJ = new ArrayList();
    public final List<String> LIZLLL = new ArrayList();
    public final List<String> LJ = new ArrayList();
    public final List<String> LJFF = new ArrayList();
    public final List<String> LJI = new ArrayList();
    public List<String> LJIILIIL = new ArrayList();

    public abstract boolean LIZIZ(String str, long j, JSONObject jSONObject);

    static {
        C16880lQ.LJLLJ(AbstractC64677PZx.class);
    }

    public final boolean LIZJ() {
        long j = this.LJII;
        if (j == 0 && this.LJIIIIZZ == 0) {
            return true;
        }
        if (j != -1 && this.LJIIIIZZ != -1) {
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis > this.LJII && currentTimeMillis < this.LJIIIIZZ) {
                return true;
            }
            Logger.debug();
        }
        return false;
    }

    public final boolean LIZLLL(android.net.Uri uri) {
        if (!((ArrayList) this.LIZ).isEmpty()) {
            Iterator it = ((ArrayList) this.LIZ).iterator();
            while (it.hasNext()) {
                if (EZX.LIZIZ(uri.getHost(), (String) it.next())) {
                }
            }
            Logger.debug();
            return false;
        }
        String path = uri.getPath();
        if (TextUtils.isEmpty(path)) {
            return false;
        }
        if (!((ArrayList) this.LIZIZ).isEmpty()) {
            Iterator it2 = ((ArrayList) this.LIZIZ).iterator();
            while (it2.hasNext()) {
                if (path.equals(it2.next())) {
                    Logger.debug();
                    return true;
                }
            }
        }
        if (!((ArrayList) this.LIZJ).isEmpty()) {
            Iterator it3 = ((ArrayList) this.LIZJ).iterator();
            while (it3.hasNext()) {
                if (path.startsWith((String) it3.next())) {
                    Logger.debug();
                    return true;
                }
            }
        }
        if (!((ArrayList) this.LIZLLL).isEmpty()) {
            Iterator it4 = ((ArrayList) this.LIZLLL).iterator();
            while (it4.hasNext()) {
                if (path.contains((String) it4.next())) {
                    Logger.debug();
                    return true;
                }
            }
        }
        if (!((ArrayList) this.LJ).isEmpty()) {
            Iterator it5 = ((ArrayList) this.LJ).iterator();
            while (it5.hasNext()) {
                if (path.matches((String) it5.next())) {
                    Logger.debug();
                    return true;
                }
            }
        }
        if (!((ArrayList) this.LJFF).isEmpty()) {
            if (!((ArrayList) this.LJI).isEmpty()) {
                Iterator it6 = ((ArrayList) this.LJI).iterator();
                while (it6.hasNext()) {
                    if (path.contains((String) it6.next())) {
                    }
                }
                return false;
            }
            Iterator it7 = ((ArrayList) this.LJFF).iterator();
            while (it7.hasNext()) {
                if (uri.toString().matches((String) it7.next())) {
                    Logger.debug();
                    return true;
                }
            }
        }
        return false;
    }

    public final void LJ(JSONObject jSONObject) {
        LJFF(jSONObject, "host_group", this.LIZ, false);
        LJFF(jSONObject, "equal_group", this.LIZIZ, false);
        LJFF(jSONObject, "prefixes_group", this.LIZJ, false);
        LJFF(jSONObject, "contain_group", this.LIZLLL, false);
        LJFF(jSONObject, "pattern_group", this.LJ, true);
        LJFF(jSONObject, "url_group", this.LJFF, true);
        LJFF(jSONObject, "path_contain", this.LJI, false);
    }

    public static void LJFF(JSONObject jSONObject, String str, List list, boolean z) {
        JSONArray optJSONArray = jSONObject.optJSONArray(str);
        if (optJSONArray != null) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                String optString = optJSONArray.optString(i);
                if (!TextUtils.isEmpty(optString)) {
                    if (z) {
                        if (!TextUtils.isEmpty(optString)) {
                            try {
                                PatternProtector.compile(optString);
                                ((ArrayList) list).add(optString);
                            } catch (Throwable unused) {
                            }
                        }
                    } else {
                        ((ArrayList) list).add(optString);
                    }
                }
            }
        }
    }

    public static AbstractC64677PZx LIZ(String str, JSONObject jSONObject, int i, long j, long j2, long j3, String str2, long j4, List<String> list, int i2) {
        AbstractC64677PZx abstractC64677PZx;
        if (str.equals("tc")) {
            abstractC64677PZx = new C64676PZw();
        } else {
            abstractC64677PZx = null;
        }
        if (str.equals("dispatch")) {
            abstractC64677PZx = new C64678PZy();
        }
        if (str.equals("delay")) {
            abstractC64677PZx = new C48162IvG();
        } else if (abstractC64677PZx == null) {
            return null;
        }
        abstractC64677PZx.LJIIIZ = i;
        abstractC64677PZx.LJII = j;
        abstractC64677PZx.LJIIIIZZ = j2;
        abstractC64677PZx.LJIIJ = j3;
        abstractC64677PZx.LJIILIIL = list;
        if (i2 < 0) {
            abstractC64677PZx.LJIIL = Integer.MAX_VALUE;
        } else {
            abstractC64677PZx.LJIIL = i2;
        }
        if (!abstractC64677PZx.LIZIZ(str2, j4, jSONObject)) {
            return null;
        }
        return abstractC64677PZx;
    }
}
