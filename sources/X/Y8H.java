package X;

import kotlin.jvm.internal.o;
import org.json.JSONObject;
import ujb.s;

/* loaded from: classes16.dex */
public final class Y8H {
    public static final Y8H LIZ = new Y8H();
    public static final Y8I LIZIZ = new Y8I();

    public final synchronized void LIZ(JSONObject json, boolean z) {
        o.LJIIIZ(json, "json");
        String url = json.optString("uri");
        if (url != null && url.length() != 0) {
            o.LJIIIIZZ(url, "url");
            boolean LJJJLZIJ = s.LJJJLZIJ(url, "~tplv-tiktok-shrink", false);
            if (z) {
                Y8I y8i = LIZIZ;
                y8i.LIZ++;
                y8i.LIZJ += json.optInt("file_size") / 1024;
                y8i.LJ += json.optInt("duration");
                if (LJJJLZIJ) {
                    y8i.LIZIZ++;
                    y8i.LIZLLL += json.optInt("file_size") / 1024;
                    y8i.LJFF += json.optInt("duration");
                }
            } else {
                Y8I y8i2 = LIZIZ;
                y8i2.LJI++;
                if (LJJJLZIJ) {
                    y8i2.LJII++;
                }
            }
        }
    }
}
