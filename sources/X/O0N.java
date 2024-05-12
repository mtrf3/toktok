package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import kotlin.jvm.internal.o;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class O0N implements C0TD {
    public static final O0N LIZ = new O0N();

    @Override // X.C0TD
    public final C0RA LIZ(C0TC chain) {
        String str;
        int i;
        String str2;
        o.LJIIIZ(chain, "chain");
        C0RA LIZIZ = chain.LIZIZ(chain.LIZ());
        if (LIZIZ != null) {
            C0R9 c0r9 = LIZIZ.LJ;
            if (c0r9 != null) {
                str = c0r9.LIZIZ;
            } else {
                str = null;
            }
            if (!TextUtils.isEmpty(str)) {
                android.net.Uri parse = UriProtector.parse(LIZIZ.LJ.LIZIZ);
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("track_url", parse.toString());
                    jSONObject.put("scheme", parse.getScheme());
                    jSONObject.put("host", parse.getHost());
                    jSONObject.put("path", parse.getPath());
                    jSONObject.put("ref", "track_sdk");
                    C33897DSb.LIZ.getClass();
                    if (C33897DSb.LIZ()) {
                        str2 = "1";
                    } else {
                        str2 = CardStruct.IStatusCode.DEFAULT;
                    }
                    jSONObject.put("use_ttnet", str2);
                } catch (JSONException e) {
                    C78983UzD.LJIIZILJ(e);
                }
                Throwable th = LIZIZ.LJFF;
                if (th != null) {
                    try {
                        jSONObject.put("error_message", th.getMessage());
                    } catch (JSONException e2) {
                        C78983UzD.LJIIZILJ(e2);
                    }
                }
                try {
                    jSONObject.put("status_code", LIZIZ.LIZ);
                } catch (JSONException e3) {
                    C78983UzD.LJIIZILJ(e3);
                }
                int i2 = LIZIZ.LIZ;
                if (i2 >= 200 && i2 < 300) {
                    i = 1;
                } else {
                    i = 0;
                }
                C09900aA.LJIIJJI("aweme_third_party_track_url_succeed_rate", i, jSONObject);
            }
        }
        return LIZIZ;
    }
}
