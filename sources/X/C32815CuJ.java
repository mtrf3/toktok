package X;

import com.bytedance.android.livesdk.gift.model.Prop;
import com.bytedance.android.livesdk.model.Gift;
import org.json.JSONObject;

/* renamed from: X.CuJ, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32815CuJ implements BU3<C78126UlO> {
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x0125 -> B:32:0x0004). Please report as a decompilation issue!!! */
    @Override // X.BU3
    public final void LIZ(Object obj, java.util.Map map) {
        String str;
        String str2;
        String str3;
        String str4;
        C78126UlO c78126UlO = (C78126UlO) obj;
        if (c78126UlO == null) {
            return;
        }
        Gift gift = c78126UlO.LIZIZ;
        Prop prop = c78126UlO.LIZLLL;
        if (2 == c78126UlO.LJ) {
            str = "guest_";
        } else {
            str = "";
        }
        if (gift != null && gift.LIZ()) {
            str2 = "animation_gift";
        } else if (c78126UlO.LJI == 1) {
            str2 = "single_gift";
        } else if (c78126UlO.LJII > 1) {
            str2 = "bunching_gift";
        } else {
            str2 = "running_gift";
        }
        if (!map.containsKey("request_page")) {
            map.put("request_page", "normal");
        }
        if (c78126UlO.LIZJ > 0) {
            str3 = "prop_type";
            str4 = "prop_id";
        } else {
            str3 = "gift_type";
            str4 = "gift_id";
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(str);
        LIZ.append(str2);
        map.put(str3, X1D.LIZIZ(LIZ));
        long j = c78126UlO.LIZJ;
        if (j <= 0) {
            j = c78126UlO.LIZ;
        }
        map.put(str4, String.valueOf(j));
        if (c78126UlO.LIZJ <= 0) {
            map.put("gift_cnt", String.valueOf(c78126UlO.LJI));
        } else {
            map.put("prop_cnt", String.valueOf(c78126UlO.LJI));
        }
        map.put("group_cnt", String.valueOf(c78126UlO.LJII));
        map.put("combo_cnt", String.valueOf(c78126UlO.LJFF));
        if (2 == c78126UlO.LJ) {
            map.put("guest_id", String.valueOf(0L));
        }
        if (c78126UlO.LIZJ <= 0) {
            if (gift != null) {
                map.put("money", String.valueOf(c78126UlO.LJI * gift.diamondCount));
            }
        } else if (prop != null && gift != null) {
            map.put("income", String.valueOf(c78126UlO.LJI * gift.diamondCount));
            map.put("money", String.valueOf(c78126UlO.LJI * gift.diamondCount));
        }
        try {
            JSONObject jSONObject = new JSONObject();
            long j2 = c78126UlO.LIZJ;
            if (j2 <= 0) {
                jSONObject.put(String.valueOf(c78126UlO.LIZ), String.valueOf(c78126UlO.LJI));
                map.put("gift_info", jSONObject.toString());
            } else {
                jSONObject.put(String.valueOf(j2), String.valueOf(c78126UlO.LJI));
                map.put("prop_info", jSONObject.toString());
            }
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
    }
}
