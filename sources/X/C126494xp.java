package X;

import com.ss.android.ugc.aweme.mvtheme.MvNetFileBean;
import defpackage.i0;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* renamed from: X.4xp, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C126494xp {
    public final java.util.Map<String, MvNetFileBean> LIZ = new LinkedHashMap();
    public final java.util.Map<String, String> LIZIZ = new LinkedHashMap();

    public final String LIZIZ(String str) {
        String key = C38352F3k.LIZJ(str);
        java.util.Map<String, String> map = this.LIZIZ;
        o.LJIIIIZZ(key, "key");
        map.put(key, str);
        return key;
    }

    public final String LIZJ(String key) {
        o.LJIIIZ(key, "key");
        if (this.LIZIZ.containsKey(key)) {
            for (Map.Entry entry : ((LinkedHashMap) this.LIZIZ).entrySet()) {
                Object key2 = entry.getKey();
                String str = (String) entry.getValue();
                if (o.LJ(key, key2)) {
                    return str;
                }
            }
        }
        return "";
    }

    public final MvNetFileBean LIZ(String str, String str2) {
        return (MvNetFileBean) ((LinkedHashMap) this.LIZ).get(i0.LJFF(str, str2));
    }

    public final void LIZLLL(String str, String algorithmName, MvNetFileBean mvNetFileBean) {
        o.LJIIIZ(algorithmName, "algorithmName");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(str);
        LIZ.append(algorithmName);
        String LIZIZ = X1D.LIZIZ(LIZ);
        if (!this.LIZ.containsKey(LIZIZ)) {
            this.LIZ.put(LIZIZ, mvNetFileBean);
        }
    }
}
