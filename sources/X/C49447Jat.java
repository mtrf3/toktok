package X;

import android.content.Context;
import android.content.Intent;
import com.ss.android.ugc.aweme.search.pages.result.livelist.core.ui.SearchLiveListActivity;
import org.json.JSONObject;

/* renamed from: X.Jat, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49447Jat {
    public static void LIZ(Context context, C49444Jaq c49444Jaq, C50948Jz6 c50948Jz6) {
        String str;
        Intent intent = new Intent(context, (Class<?>) SearchLiveListActivity.class);
        intent.putExtra("param_live_enter", c49444Jaq);
        intent.addFlags(268435456);
        if (c50948Jz6 != null) {
            intent.putExtra("param_search_enter", c50948Jz6);
        }
        C16880lQ.LIZJ(context, intent);
        JSONObject jSONObject = new JSONObject();
        if (c50948Jz6 != null) {
            str = c50948Jz6.getEnterSearchFrom();
        } else {
            str = null;
        }
        jSONObject.put("enter_from", str);
        JVR.LIZLLL("ref_search_live_list_activity", C77275UUl.LIZLLL("enter_from"), jSONObject);
    }
}
