package X;

import android.text.TextUtils;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.YcD, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C87749YcD {
    public String LIZ;
    public String LIZIZ;
    public int LIZJ;
    public int LIZLLL;
    public String LJ;
    public long LJFF;
    public long LJI;
    public int LJII;
    public int LJIIIZ;
    public long LJIIJ;
    public long LJIIJJI;
    public int LJIIIIZZ = -1;
    public Integer LJIIL = 0;

    public final JSONObject LIZ() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(C63832P3k.LIZ, LIZIZ(15, this.LIZ));
        jSONObject.put("host", LIZIZ(20, this.LIZIZ));
        jSONObject.put("hit_code", this.LIZJ);
        jSONObject.put("hit_code_l2", this.LIZLLL);
        if (this.LIZJ == 0) {
            jSONObject.put("cdn_hit_str", this.LJ);
        }
        jSONObject.put("rsp_time", this.LJFF);
        jSONObject.put("cache_size", this.LJI);
        jSONObject.put("url_idx", this.LJIIIIZZ);
        jSONObject.put("status_code", this.LJII);
        jSONObject.put("dl_duration", this.LJIIJJI);
        jSONObject.put("dl_size", this.LJIIJ);
        return jSONObject;
    }

    public static String LIZIZ(int i, String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        o.LJI(str);
        if (str.length() <= i) {
            return str;
        }
        String substring = str.substring(0, i - 1);
        o.LJIIIIZZ(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }
}
