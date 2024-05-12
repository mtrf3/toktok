package X;

import android.app.Activity;
import android.content.Intent;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.detail.ui.DetailActivity;
import kotlin.jvm.internal.o;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.Lvq, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55842Lvq extends M56 {
    @Override // X.M56
    public final String LIZJ(android.net.Uri uri) {
        o.LJIIIZ(uri, "uri");
        return "detail";
    }

    @Override // X.M56
    public final boolean LJFF(String host, String path) {
        o.LJIIIZ(host, "host");
        o.LJIIIZ(path, "path");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(host);
        LIZ.append(path);
        if (!ujb.o.LJJJLIIL(X1D.LIZIZ(LIZ), "aweme/detail_list", false)) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(host);
            LIZ2.append(path);
            if (!ujb.o.LJJJLIIL(X1D.LIZIZ(LIZ2), "tuwen/detail_list", false)) {
                return false;
            }
        }
        return true;
    }

    @Override // X.M56
    public final Intent LIZ(Activity activity, android.net.Uri uri, String host, String path, String fromTokenType, boolean z) {
        Intent intent;
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(uri, "uri");
        o.LJIIIZ(host, "host");
        o.LJIIIZ(path, "path");
        o.LJIIIZ(fromTokenType, "fromTokenType");
        String queryParameter = UriProtector.getQueryParameter(uri, "label");
        if (TextUtils.isEmpty(queryParameter)) {
            queryParameter = "web";
        }
        String queryParameter2 = UriProtector.getQueryParameter(uri, "gids");
        String queryParameter3 = UriProtector.getQueryParameter(uri, "push_params");
        if (!o.LJ("tuwen", host) && (FWS.LIZ().LIZ || activity.isTaskRoot())) {
            intent = C51029K0z.LJIJI(activity);
            intent.putExtra("extra_from_deeplink", true);
        } else {
            intent = new Intent(activity, (Class<?>) DetailActivity.class);
            if (TextUtils.isEmpty(fromTokenType)) {
                fromTokenType = queryParameter;
            }
            intent.putExtra("from_adsapp_activity", true);
            intent.putExtra("refer", fromTokenType);
            intent.putExtra("from_uid", UriProtector.getQueryParameter(uri, "from_uid"));
        }
        if (!TextUtils.isEmpty(queryParameter2)) {
            String queryParameter4 = UriProtector.getQueryParameter(uri, "from");
            if (!TextUtils.isEmpty(queryParameter4)) {
                intent.putExtra("from_micro_app", queryParameter4);
                intent.putExtra("refer", "mp_page");
            }
            intent.putExtra("ids", queryParameter2);
        }
        if (!TextUtils.isEmpty(queryParameter3)) {
            intent.putExtra("push_params", queryParameter3);
        }
        UriProtector.getQueryParameter(uri, "push_id");
        if (TextUtils.isEmpty(queryParameter2) && !TextUtils.isEmpty(queryParameter3)) {
            try {
                JSONObjectProtectorUtils.getString(new JSONObject(queryParameter3), "gids");
            } catch (JSONException e) {
                C16880lQ.LLLLIIL(e);
            }
        }
        M62.LIZIZ.LIZIZ(uri, "detail", z);
        return intent;
    }
}
