package X;

import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.common.utility.Logger;
import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.IvG, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48162IvG extends AbstractC64677PZx {
    public int LJIILJJIL;
    public int LJIILL;
    public int LJIILLIIL;
    public final java.util.Map<String, java.util.Set<String>> LJIIZILJ = new HashMap();

    static {
        C16880lQ.LJLLJ(C48162IvG.class);
    }

    public final int LJI() {
        int i = this.LJIILJJIL;
        if (i > 0) {
            return i;
        }
        if (this.LJIILL < this.LJIILLIIL) {
            return new Random().nextInt(this.LJIILLIIL - this.LJIILL) + this.LJIILL;
        }
        return 0;
    }

    @Override // X.AbstractC64677PZx
    public final boolean LIZIZ(String str, long j, JSONObject jSONObject) {
        int i;
        int i2;
        LJ(jSONObject);
        String optString = jSONObject.optString("tag");
        int i3 = 0;
        if (!TextUtils.isEmpty(optString)) {
            for (String str2 : optString.split(";")) {
                ArrayList arrayList = new ArrayList();
                if (C61694OJe.LIZIZ(str2, ",", arrayList)) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        Pair pair = (Pair) it.next();
                        java.util.Set set = (java.util.Set) ((HashMap) this.LJIIZILJ).get(pair.first);
                        if (set == null) {
                            set = new HashSet();
                        }
                        set.add(pair.second);
                        ((HashMap) this.LJIIZILJ).put(pair.first, set);
                    }
                }
            }
        }
        this.LJIILJJIL = jSONObject.optInt("delay");
        JSONArray optJSONArray = jSONObject.optJSONArray("random");
        if (this.LJIILJJIL <= 0 && optJSONArray != null) {
            if (optJSONArray.length() != 2) {
                return false;
            }
            try {
                i2 = JSONArrayProtectorUtils.getInt(optJSONArray, 0);
                try {
                    i = JSONArrayProtectorUtils.getInt(optJSONArray, 1);
                } catch (JSONException e) {
                    e = e;
                    C16880lQ.LLLLIIL(e);
                    i = 0;
                    if (i2 > 0) {
                    }
                    return false;
                }
            } catch (JSONException e2) {
                e = e2;
                i2 = 0;
            }
            if (i2 > 0 || i <= 0 || i2 >= i) {
                return false;
            }
            i3 = i2;
        } else {
            i = 0;
        }
        this.LJIILL = i3;
        this.LJIILLIIL = i;
        Logger.debug();
        return true;
    }
}
