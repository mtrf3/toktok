package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class O7J {
    public final List<String> LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final String LJFF;
    public final List<String> LJI;

    public final boolean LIZIZ() {
        boolean z = false;
        if (!TextUtils.isEmpty(this.LJFF) && C30591Hz.LJIJJ(this.LJI)) {
            Iterator<String> it = this.LJI.iterator();
            while (it.hasNext()) {
                z |= !TextUtils.isEmpty(it.next());
            }
        }
        return z;
    }

    public final boolean LIZJ() {
        if (this.LIZIZ <= 0 || this.LIZJ <= 0 || C30591Hz.LJIILLIIL(this.LIZ) || C78886Uxe.LJJIIZI(this.LIZLLL)) {
            return false;
        }
        String str = (String) ListProtector.get(this.LIZ, 0);
        if (C78886Uxe.LJJIIZI(str) && this.LIZ.size() >= 2) {
            str = (String) ListProtector.get(this.LIZ, 1);
            if (C78886Uxe.LJJIIZI(str) && this.LIZ.size() >= 3) {
                str = (String) ListProtector.get(this.LIZ, 2);
            }
        }
        return !C78886Uxe.LJJIIZI(str);
    }

    public static List<String> LIZ(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList(3);
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject optJSONObject = jSONArray.optJSONObject(i);
            if (optJSONObject != null) {
                String optString = optJSONObject.optString("url");
                if (!C78886Uxe.LJJIIZI(optString)) {
                    arrayList.add(optString);
                }
            }
        }
        return arrayList;
    }

    public O7J(List<String> list, int i, int i2, String str, String str2, List<String> list2, String str3) {
        this.LIZ = list;
        this.LIZIZ = i;
        this.LIZJ = i2;
        this.LIZLLL = str;
        this.LJ = str2;
        this.LJFF = str3;
        this.LJI = list2;
    }
}
