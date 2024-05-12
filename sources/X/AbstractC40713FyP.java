package X;

import android.webkit.WebResourceRequest;
import java.util.Map;
import kotlin.jvm.internal.o;

/* renamed from: X.FyP, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40713FyP {
    public volatile String LIZ;
    public String LIZIZ;
    public java.util.Map<String, String> LIZJ;
    public final WebResourceRequest LIZLLL;

    public abstract void LIZ();

    public final String toString() {
        java.util.Map LJJJLIIL;
        String str = this.LIZ;
        if (str != null) {
            return str;
        }
        StringBuilder sb = new StringBuilder(this.LIZIZ);
        java.util.Map<String, String> map = this.LIZJ;
        if (map == null || (LJJJLIIL = C51029K0z.LJJJJJ(map)) == null) {
            LJJJLIIL = C113554cx.LJJJLIIL();
        }
        for (Map.Entry entry : LJJJLIIL.entrySet()) {
            sb.append((String) entry.getKey());
            sb.append((String) entry.getValue());
        }
        String it = sb.toString();
        this.LIZ = it;
        o.LJFF(it, "it");
        return it;
    }

    public AbstractC40713FyP(String str, java.util.Map<String, String> map, WebResourceRequest webResourceRequest) {
        this.LIZIZ = str;
        this.LIZJ = map;
        this.LIZLLL = webResourceRequest;
    }
}
