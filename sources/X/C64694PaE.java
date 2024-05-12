package X;

import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.watchlive.player.LivePlayerResourceReleaseSetting;
import com.bytedance.common.utility.Logger;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.mt.protector.impl.PatternProtector;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.PaE, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64694PaE {
    public static volatile C64694PaE LIZJ;
    public volatile int LIZ;
    public final List<C64696PaG> LIZIZ = new CopyOnWriteArrayList();

    static {
        C16880lQ.LJLLJ(C64694PaE.class);
    }

    public static C64694PaE LIZJ() {
        if (LIZJ == null) {
            synchronized (C64694PaE.class) {
                if (LIZJ == null) {
                    LIZJ = new C64694PaE();
                }
            }
        }
        return LIZJ;
    }

    public final C64696PaG LIZ(String str) {
        Iterator it = ((CopyOnWriteArrayList) this.LIZIZ).iterator();
        while (it.hasNext()) {
            C64696PaG c64696PaG = (C64696PaG) it.next();
            if (c64696PaG.LJIIIIZZ.equals(str)) {
                return c64696PaG;
            }
        }
        return null;
    }

    public final void LJ(String str) {
        Logger.debug();
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.LIZ = jSONObject.optInt("enabled_v2", 0);
            ((CopyOnWriteArrayList) this.LIZIZ).clear();
            JSONArray jSONArray = JSONObjectProtectorUtils.getJSONArray(jSONObject, "match_rules");
            for (int i = 0; i < jSONArray.length(); i++) {
                LJI((JSONObject) jSONArray.get(i));
            }
        } catch (Throwable unused) {
            Logger.debug();
        }
    }

    public final void LJI(JSONObject jSONObject) {
        boolean z;
        ArrayList arrayList = new ArrayList();
        LJFF("host_group", arrayList, jSONObject);
        ArrayList arrayList2 = new ArrayList();
        LJFF("concurrent_hosts", arrayList2, jSONObject);
        if (arrayList.isEmpty() || arrayList2.size() < 2) {
            return;
        }
        C64696PaG c64696PaG = new C64696PaG(arrayList, arrayList2);
        ArrayList arrayList3 = new ArrayList();
        if (LJFF("equal_group", arrayList3, jSONObject)) {
            c64696PaG.LIZJ = arrayList3;
        }
        ArrayList arrayList4 = new ArrayList();
        if (LJFF("prefix_group", arrayList4, jSONObject)) {
            c64696PaG.LIZLLL = arrayList4;
        }
        ArrayList arrayList5 = new ArrayList();
        JSONArray optJSONArray = jSONObject.optJSONArray("pattern_group");
        if (optJSONArray != null) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                String optString = optJSONArray.optString(i);
                if (!TextUtils.isEmpty(optString)) {
                    try {
                        arrayList5.add(PatternProtector.compile(optString, 2));
                    } catch (Throwable unused) {
                    }
                }
            }
            c64696PaG.LJ = arrayList5;
        }
        c64696PaG.LJII = jSONObject.optInt("fail_count", Integer.MAX_VALUE);
        c64696PaG.LJI = jSONObject.optInt("forbid_seconds", 0);
        c64696PaG.LJIIL = jSONObject.optInt("connect_interval_millis", LivePlayerResourceReleaseSetting.ENABLE);
        boolean z2 = true;
        if (jSONObject.optInt("bypass_rs_enabled", 1) > 0) {
            z = true;
        } else {
            z = false;
        }
        c64696PaG.LJIILJJIL = z;
        c64696PaG.LJIILL = jSONObject.optString("rs_name", null);
        if (c64696PaG.LJIIL <= 0) {
            return;
        }
        if (jSONObject.optInt("retry_for_not_2xx_code", 0) <= 0) {
            z2 = false;
        }
        c64696PaG.LJIILIIL = z2;
        HashSet hashSet = new HashSet();
        JSONArray optJSONArray2 = jSONObject.optJSONArray("block_code_list");
        if (optJSONArray2 != null) {
            for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
                hashSet.add(Integer.valueOf(optJSONArray2.optInt(i2)));
            }
            c64696PaG.LJFF = hashSet;
        }
        ((CopyOnWriteArrayList) this.LIZIZ).add(c64696PaG);
    }

    public final boolean LIZIZ(int i, String str) {
        C64696PaG LIZ;
        java.util.Set<Integer> set;
        if (i == 0 || TextUtils.isEmpty(str) || (LIZ = LIZ(str)) == null || (set = LIZ.LJFF) == null) {
            return false;
        }
        return ((HashSet) set).contains(Integer.valueOf(i));
    }

    public final void LIZLLL(String str, boolean z) {
        C64696PaG LIZ;
        if (TextUtils.isEmpty(str) || (LIZ = LIZ(str)) == null) {
            return;
        }
        Logger.debug();
        if (z) {
            if (LIZ.LJIIIZ == 0 && !LIZ.LJIIJJI) {
                return;
            }
            LIZ.LJIIIZ = 0;
            LIZ.LJIIJJI = false;
            return;
        }
        int i = LIZ.LJIIIZ + 1;
        LIZ.LJIIIZ = i;
        if (i < LIZ.LJII) {
            return;
        }
        if (!LIZ.LJIIJJI) {
            LIZ.LJIIJJI = true;
            LIZ.LJIIJ = SystemClock.uptimeMillis();
        }
        Logger.debug();
    }

    public static boolean LJFF(String str, List list, JSONObject jSONObject) {
        JSONArray optJSONArray;
        if (jSONObject == null || TextUtils.isEmpty(str) || (optJSONArray = jSONObject.optJSONArray(str)) == null) {
            return false;
        }
        for (int i = 0; i < optJSONArray.length(); i++) {
            String optString = optJSONArray.optString(i);
            if (!TextUtils.isEmpty(optString)) {
                ((ArrayList) list).add(optString);
            }
        }
        return true;
    }
}
