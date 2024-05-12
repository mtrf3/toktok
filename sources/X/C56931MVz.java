package X;

import android.content.Context;
import android.content.Intent;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.notification.UserListActivity;

/* renamed from: X.MVz, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56931MVz {
    public static void LIZ(Context context, String str, String str2, String str3, boolean z, int i, long j, String str4, UrlModel urlModel, String str5, boolean z2, MWH mwh) {
        if (str2 == null || str2.length() == 0 || str3 == null || str3.length() == 0) {
            return;
        }
        Intent intent = new Intent(context, (Class<?>) UserListActivity.class);
        intent.putExtra("nid", str);
        intent.putExtra("aweme_id", str2);
        intent.putExtra("ref_id", str3);
        intent.putExtra("is_new", z);
        intent.putExtra("digg_type", i);
        intent.putExtra("last_read_time", j);
        intent.putExtra("second_title", str4);
        if (str5 == null) {
            str5 = "";
        }
        intent.putExtra("tab_name", str5);
        intent.putExtra("is_story", z2);
        if (urlModel != null) {
            intent.putExtra("cover", urlModel);
        }
        if (mwh != null) {
            if (C78685UuP.LJJJZ(mwh.LIZ)) {
                intent.putExtra("sort_option_name", mwh.LIZ);
            }
            if (C78685UuP.LJJJZ(mwh.LIZIZ)) {
                intent.putExtra("notification_tab_name", mwh.LIZIZ);
            }
        }
        C16880lQ.LIZJ(context, intent);
    }
}
