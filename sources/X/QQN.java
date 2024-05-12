package X;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes12.dex */
public class QQN {
    public String LIZ;
    public java.util.Map<String, String> LIZIZ;

    public final void LIZ() {
        if (this.LIZIZ == null) {
            this.LIZIZ = new HashMap();
        }
        C66960QPs.LIZ();
        if (QWR.LIZIZ()) {
            this.LIZIZ.put("multi_login", "1");
        }
    }

    public final QQ1 LIZIZ() {
        return new QQ1(this.LIZ, "get", this.LIZIZ);
    }

    public final QQ1 LJFF() {
        return new QQ1(this.LIZ, "post", this.LIZIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZLLL(java.util.Map map) {
        if (this.LIZIZ == null) {
            this.LIZIZ = map;
        } else {
            if (map == null) {
                return;
            }
            for (Map.Entry entry : map.entrySet()) {
                this.LIZIZ.put(entry.getKey(), entry.getValue());
            }
        }
    }

    public final void LIZJ(String str, String str2) {
        if (this.LIZIZ == null) {
            this.LIZIZ = new HashMap();
        }
        this.LIZIZ.put(str, str2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJ(java.util.Map map, java.util.Map map2) {
        if (this.LIZIZ == null) {
            this.LIZIZ = new HashMap();
        }
        for (Map.Entry entry : ((HashMap) map).entrySet()) {
            this.LIZIZ.put(entry.getKey(), entry.getValue());
        }
        if (map2 != null && !map2.isEmpty()) {
            for (String str : map2.keySet()) {
                if (!TextUtils.isEmpty(str) && map2.get(str) != null) {
                    this.LIZIZ.put(str, map2.get(str));
                }
            }
        }
    }
}
