package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class BNG {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(List list, Long l, List list2, List list3, String str, long j, String deleteType, int i, String errorMsg) {
        String str2;
        o.LJIIIZ(deleteType, "deleteType");
        o.LJIIIZ(errorMsg, "errorMsg");
        JSONObject jSONObject = new JSONObject();
        long id = ((C29374Bfu) B83.LIZ().LIZIZ()).LIZIZ.getId();
        if (list == null || (str2 = Integer.valueOf(list.size()).toString()) == null) {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        jSONObject.put("delete_count", str2);
        jSONObject.put("delete_array", String.valueOf(list));
        jSONObject.put("user_id", String.valueOf(id));
        jSONObject.put("all_assets_size", String.valueOf(l));
        jSONObject.put("assets_md5_list", String.valueOf(list2));
        jSONObject.put("assets_type_list", String.valueOf(list3));
        if (str == null) {
            str = "";
        }
        jSONObject.put("target_resource_format", str);
        jSONObject.put("error_code", String.valueOf(i));
        jSONObject.put("error_msg", errorMsg);
        jSONObject.put("delete_duration", j);
        jSONObject.put("delete_type", deleteType);
        C0K2.LJIIIIZZ(O5Y.LJJL("gift_asset_delete"), 0, jSONObject);
        BZI LIZ2 = C28787BRn.LIZ("gift_asset_delete");
        LIZ2.LJIIZILJ();
        LIZ2.LJJ(jSONObject);
        LIZ2.LJJIIJZLJL();
    }
}
