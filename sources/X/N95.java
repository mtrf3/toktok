package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.common.applog.AppLog;
import com.ss.android.ugc.aweme.commercialize.track.RawURLGetter;
import java.util.Collection;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class N95 {
    static {
        C16880lQ.LJLLJ(N95.class);
    }

    public static void LIZ(final C35V c35v, Collection collection) {
        if (C79004UzY.LJJIFFI(collection)) {
            return;
        }
        String LIZIZ = FLE.LIZIZ();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            final String str = (String) it.next();
            if (!TextUtils.isEmpty(str)) {
                final long currentTimeMillis = System.currentTimeMillis();
                if (!TextUtils.isEmpty(str)) {
                    try {
                        if (str.contains("{TS}") || str.contains("__TS__")) {
                            str = str.replace("{TS}", String.valueOf(currentTimeMillis)).replace("__TS__", String.valueOf(currentTimeMillis));
                        }
                        String serverDeviceId = AppLog.getServerDeviceId();
                        if (!TextUtils.isEmpty(serverDeviceId)) {
                            if (str.contains("{UID}") || str.contains("__UID__")) {
                                str = str.replace("{UID}", serverDeviceId).replace("__UID__", serverDeviceId);
                            }
                            if (str.contains("{UA}") || str.contains("__UA__")) {
                                str = str.replace("{UA}", LIZIZ).replace("__UA__", LIZIZ);
                            }
                        }
                    } catch (Exception e) {
                        C16880lQ.LLLLIIL(e);
                    }
                }
                android.net.Uri parse = UriProtector.parse(str);
                final JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("track_url", str);
                    jSONObject.put("scheme", parse.getScheme());
                    jSONObject.put("host", parse.getHost());
                    jSONObject.put("path", parse.getPath());
                    jSONObject.put("ref", "native");
                } catch (JSONException unused) {
                }
                RawURLGetter.LIZIZ(str, new N96() { // from class: X.35X
                    @Override // X.N96
                    public final void LIZ(int i, Exception exc, boolean z) {
                        C35W c35w = c35v;
                        String str2 = str;
                        long j = currentTimeMillis;
                        JSONObject jSONObject2 = jSONObject;
                        if (c35w != null) {
                            c35w.LIZ(j, str2, String.valueOf(i));
                        }
                        if (exc != null) {
                            C36922EeM.LIZ(exc);
                            try {
                                jSONObject2.put("error_message", exc.getMessage());
                            } catch (JSONException unused2) {
                            }
                        }
                        try {
                            jSONObject2.put("status_code", i);
                        } catch (JSONException unused3) {
                        }
                        C09900aA.LJIIJJI("aweme_third_party_track_url_succeed_rate", z ? 1 : 0, jSONObject2);
                    }
                });
            }
        }
    }
}
