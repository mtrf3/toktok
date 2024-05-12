package X;

import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.Jjt, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50005Jjt extends AbstractC50008Jjw {
    @Override // X.AbstractC50008Jjw
    public final String LIZ() {
        return "searchEnterLiveFlow";
    }

    @Override // X.AbstractC50008Jjw
    public final void LIZIZ(JSONObject jSONObject, C50007Jjv c50007Jjv) {
        EnterRoomConfig enterRoomConfig;
        boolean z;
        try {
            JSONObject optJSONObject = jSONObject.optJSONObject("log_extra");
            if (optJSONObject != null) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                Iterator<String> keys = optJSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    o.LJIIIIZZ(next, "next");
                    String string = JSONObjectProtectorUtils.getString(optJSONObject, next);
                    o.LJIIIIZZ(string, "jsonObject.getString(next)");
                    linkedHashMap.put(next, string);
                }
                C50653JuL.LJLILLLLZI.getClass();
                C50654JuM.LIZJ(linkedHashMap, false);
                enterRoomConfig = new EnterRoomConfig();
                enterRoomConfig.mLogData.search_id = optJSONObject.optString("search_id");
                enterRoomConfig.mLogData.search_keyword = optJSONObject.optString("search_keyword");
                enterRoomConfig.mLogData.search_type = optJSONObject.optString("search_type");
                enterRoomConfig.mLogData.requestId = optJSONObject.optString("search_id");
                enterRoomConfig.mLogData.anchorId = optJSONObject.optString("anchor_id");
                enterRoomConfig.mRoomsData.enterMethod = optJSONObject.optString("enter_method");
                enterRoomConfig.mRoomsData.enterFromMerge = optJSONObject.optString("enter_from");
            } else {
                enterRoomConfig = null;
            }
            long optLong = jSONObject.optLong("start_cursor");
            if (jSONObject.optInt("has_more") == 1) {
                z = true;
            } else {
                z = false;
            }
            LiveRoomStruct liveRoomStruct = (LiveRoomStruct) C69432nz.LIZ().LJI(jSONObject.optString("cur_raw_data"), LiveRoomStruct.class);
            JSONArray optJSONArray = jSONObject.optJSONArray("raw_data_list");
            ArrayList arrayList = new ArrayList();
            int length = optJSONArray.length();
            for (int i = 0; i < length; i++) {
                arrayList.add(C69432nz.LIZ().LJI(optJSONArray.get(i).toString(), LiveRoomStruct.class));
            }
            C2U8.LIZ(new C49996Jjk(liveRoomStruct, arrayList, optLong, enterRoomConfig, Boolean.valueOf(z)));
        } catch (Exception e) {
            c50007Jjv.LIZ(e.getMessage());
        }
        c50007Jjv.LIZ.LIZ(1, "success", C770830u.LIZLLL("code", 1));
    }
}
