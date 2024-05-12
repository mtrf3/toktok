package X;

import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class F4B {
    public Long LIZIZ;
    public Long LIZ = 0L;
    public final F4K LIZJ = new F4K();
    public final F4J LIZLLL = new F4J();
    public final F47 LJ = new F47();
    public final F4L LJFF = new F4L();

    public final void LIZ(String str, Throwable th, boolean z) {
        String value;
        String str2 = this.LIZJ.LIZLLL;
        JSONObject jSONObject = new JSONObject();
        String str3 = this.LIZJ.LIZ;
        if (str3 != null) {
            jSONObject.put("js_name", str3);
        }
        F4F f4f = this.LIZJ.LIZIZ;
        if (f4f != null && (value = f4f.getValue()) != null) {
            jSONObject.put("inject_time", value);
        }
        String str4 = this.LIZJ.LIZJ;
        if (str4 != null) {
            jSONObject.put("business_line", str4);
        }
        String str5 = this.LIZJ.LIZLLL;
        if (str5 != null) {
            jSONObject.put("current_url", str5);
        }
        Integer num = this.LJ.LIZ;
        if (num != null) {
            jSONObject.put("config_state", num.intValue());
        }
        Integer num2 = this.LJ.LIZIZ;
        if (num2 != null) {
            jSONObject.put("config_res_from", num2.intValue());
        }
        Integer num3 = this.LIZLLL.LIZ;
        if (num3 != null) {
            jSONObject.put("script_state", num3.intValue());
        }
        Integer num4 = this.LIZLLL.LIZIZ;
        if (num4 != null) {
            jSONObject.put("script_res_from", num4.intValue());
        }
        String str6 = this.LIZLLL.LIZJ;
        if (str6 != null) {
            jSONObject.put("script_url", str6);
        }
        if (o.LJ(str, "js_inject_manage_client_inline_main")) {
            jSONObject.put("script_url_insert_state", this.LJFF.LIZ);
            jSONObject.put("inline_hit_csp", this.LJFF.LIZJ);
            jSONObject.put("inline_hit_post", this.LJFF.LIZIZ);
            jSONObject.put("inline_hit_super_response", this.LJFF.LIZLLL);
        }
        if (z) {
            jSONObject.put("client_final_state", 1);
        } else {
            jSONObject.put("client_final_state", 0);
            if (th != null) {
                jSONObject.put("error_msg", th.getMessage());
            }
        }
        JSONObject jSONObject2 = new JSONObject();
        Long l = this.LJ.LIZLLL;
        if (l != null) {
            jSONObject2.put("config_check_duration", l.longValue());
        }
        Long l2 = this.LJ.LIZJ;
        if (l2 != null) {
            jSONObject2.put("config_load_duration", l2.longValue());
        }
        Long l3 = this.LIZLLL.LIZLLL;
        if (l3 != null) {
            jSONObject2.put("script_load_duration", l3.longValue());
        }
        Long l4 = this.LIZIZ;
        if (l4 != null) {
            jSONObject2.put("duration", l4.longValue());
        }
        F3V.LIZ(str, str2, jSONObject, jSONObject2);
    }
}
