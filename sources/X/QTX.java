package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class QTX extends C67049QTd {
    public String LJIJ;
    public String LJIJI;
    public long LJIJJ;
    public String LJIJJLI;
    public String LJIL;
    public boolean LJJ;
    public String LJJI;
    public String LJJIFFI;
    public String LJJII;
    public int LJJIII;
    public int LJJIIJ;
    public int LJJIIJZLJL;
    public int LJJIIZ;
    public long LJJIIZI;
    public String LJJIJ;
    public int LJJIJIIJI;
    public int LJJIJIIJIL;
    public boolean LJJIJIL;
    public String LJJIJL;
    public String LJJIJLIJ;
    public String LJJIL;
    public int LJJIZ;
    public int LJJJ;
    public boolean LJJJI;
    public boolean LJJJIL;
    public int LJJJJ;

    public final void LIZ() {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        JSONObject jSONObject = this.LJIILJJIL;
        this.LIZ = jSONObject.optLong("user_id", 0L);
        this.LIZJ = jSONObject.optString("sec_user_id", "");
        this.LJFF = jSONObject.optString("session_key", "");
        this.LIZJ = jSONObject.optString("sec_user_id", "");
        if (jSONObject.optInt("new_user") != 0) {
            z = true;
        } else {
            z = false;
        }
        this.LJ = z;
        this.LJI = jSONObject.optString("mobile", "");
        if (jSONObject.optInt("has_password") != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.LJIIIZ = z2;
        this.LJIIIIZZ = jSONObject.optString("sec_user_id", "");
        this.LJIIJ = jSONObject.optBoolean("is_visitor_account", false);
        this.LJII = jSONObject.optString("email", "");
        C67046QTa c67046QTa = new C67046QTa("mobile");
        C67046QTa c67046QTa2 = new C67046QTa("email");
        String str = this.LJII;
        c67046QTa2.LIZJ = str;
        if (!TextUtils.isEmpty(str)) {
            ((HashMap) this.LIZIZ).put("email", c67046QTa2);
        }
        String str2 = this.LJI;
        c67046QTa.LIZJ = str2;
        if (!TextUtils.isEmpty(str2)) {
            ((HashMap) this.LIZIZ).put("mobile", c67046QTa);
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("connects");
        if (optJSONArray != null) {
            int length = optJSONArray.length();
            long currentTimeMillis = System.currentTimeMillis();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObject2 = JSONArrayProtectorUtils.getJSONObject(optJSONArray, i);
                String string = JSONObjectProtectorUtils.getString(jSONObject2, "platform");
                if (string != null && string.length() != 0) {
                    C67046QTa c67046QTa3 = new C67046QTa(string);
                    if (jSONObject2.has("screen_name")) {
                        c67046QTa3.LIZJ = jSONObject2.optString("screen_name");
                    } else if (jSONObject2.has("platform_screen_name")) {
                        c67046QTa3.LIZJ = jSONObject2.optString("platform_screen_name");
                    }
                    c67046QTa3.LIZLLL = jSONObject2.optString("profile_image_url");
                    c67046QTa3.LJ = jSONObject2.optString("platform_uid");
                    c67046QTa3.LJFF = jSONObject2.optString("sec_platform_uid");
                    c67046QTa3.LJI = jSONObject2.optLong("modify_time");
                    jSONObject2.optString("create_time");
                    c67046QTa3.LJIIIZ = jSONObject.optLong("user_id", 0L);
                    long optLong = jSONObject2.optLong("expires_in");
                    if (optLong > 0) {
                        c67046QTa3.LJII = (1000 * optLong) + currentTimeMillis;
                    }
                    c67046QTa3.LJIIIIZZ = optLong;
                    C67046QTa c67046QTa4 = (C67046QTa) ((HashMap) this.LIZIZ).get(string);
                    if (c67046QTa4 != null) {
                        long j = c67046QTa4.LJI;
                        if (j > 0 && j > c67046QTa3.LJI) {
                        }
                    }
                    ((HashMap) this.LIZIZ).put(string, c67046QTa3);
                }
            }
        }
        this.LIZLLL = jSONObject.optInt("country_code", -1);
        boolean z5 = true;
        if (jSONObject.optInt("is_kids_mode") != 1) {
            z5 = false;
        }
        this.LJIIJJI = z5;
        JSONObject jSONObject3 = this.LJIILJJIL;
        if (jSONObject3.has("name")) {
            this.LJIILL = jSONObject3.optString("name");
        } else if (jSONObject3.has("username")) {
            this.LJIILL = jSONObject3.optString("username");
        }
        this.LJIIZILJ = jSONObject3.optString("avatar_url");
        this.LJIILLIIL = jSONObject3.optString("description");
        JSONObject jSONObject4 = this.LJIILJJIL;
        this.LJJIII = jSONObject4.optInt("can_be_found_by_phone");
        this.LJJIIJ = jSONObject4.optInt("share_to_repost", -1);
        this.LJJIIJZLJL = jSONObject4.optInt("user_privacy_extend") & 1;
        this.LJJIIZ = jSONObject4.optInt("user_privacy_extend");
        this.LJJIJIIJIL = jSONObject4.optInt("gender");
        this.LJIJ = jSONObject4.optString("screen_name");
        this.LJIJI = jSONObject4.optString("verified_content");
        jSONObject4.optBoolean("is_generated");
        this.LJJIJIL = jSONObject4.optBoolean("user_verified");
        if (jSONObject4.optInt("is_recommend_allowed") != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.LJJ = z3;
        this.LJJI = jSONObject4.optString("recommend_hint_message");
        this.LJJIFFI = jSONObject4.optString("user_decoration");
        this.LJJII = jSONObject4.optString("user_auth_info");
        this.LJJIJL = jSONObject4.optString("birthday");
        this.LJJIJLIJ = jSONObject4.optString("area");
        this.LJJIL = jSONObject4.optString("industry");
        this.LJJJ = jSONObject4.optInt("is_blocked");
        this.LJJIZ = jSONObject4.optInt("is_blocking");
        this.LJJJI = jSONObject4.optBoolean("is_toutiao");
        if (jSONObject4.optInt("has_password") != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.LJJJIL = z4;
        JSONObject optJSONObject = jSONObject4.optJSONObject("media");
        if (optJSONObject != null) {
            this.LJIJJLI = optJSONObject.optString("avatar_url");
            this.LJIJJ = optJSONObject.optLong("id");
            this.LJIL = optJSONObject.optString("name");
            this.LJJIJIIJI = optJSONObject.optInt("display_app_ocr_entrance", 0);
        }
        jSONObject4.optInt("followings_count");
        jSONObject4.optInt("followers_count");
        jSONObject4.optInt("visit_count_recent");
        this.LJJIIZI = jSONObject4.optLong("media_id");
        this.LJJIJ = jSONObject4.optString("bg_img_url");
        this.LJJJJ = jSONObject4.optInt("app_id");
    }

    public QTX() {
    }

    public QTX(JSONObject jSONObject) {
        super(jSONObject);
    }

    public QTX(JSONObject jSONObject, JSONObject jSONObject2) {
        super(jSONObject, jSONObject2);
    }
}
