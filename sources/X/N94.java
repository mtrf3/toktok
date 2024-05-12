package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.commercialize.track.RawURLGetter;
import java.util.Collection;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class N94 {
    static {
        C16880lQ.LJLLJ(N94.class);
    }

    public static void LIZ(final N93 n93, Collection<String> collection, boolean z) {
        String LIZ;
        if (!C79004UzY.LJJIFFI(collection)) {
            LIZ = FLE.LIZ("other");
            for (final String str : collection) {
                if (!TextUtils.isEmpty(str)) {
                    final long currentTimeMillis = System.currentTimeMillis();
                    if (!TextUtils.isEmpty(str)) {
                        try {
                            if (str.contains("{TS}") || str.contains("__TS__")) {
                                str = str.replace("{TS}", String.valueOf(currentTimeMillis)).replace("__TS__", String.valueOf(currentTimeMillis));
                            }
                            String deviceId = C59835Ne3.LIZIZ().getDeviceId();
                            if (!TextUtils.isEmpty(deviceId)) {
                                str = C61161NzR.LIZIZ.LIZIZ(str, deviceId);
                                if (str.contains("{UA}") || str.contains("__UA__")) {
                                    str = str.replace("{UA}", LIZ).replace("__UA__", LIZ);
                                }
                            }
                        } catch (Exception e) {
                            C78983UzD.LJIIZILJ(e);
                        }
                    }
                    if (z) {
                        str = C38354F3m.LIZLLL(str);
                    }
                    android.net.Uri parse = UriProtector.parse(str);
                    final JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("track_url", str);
                        jSONObject.put("scheme", parse.getScheme());
                        jSONObject.put("host", parse.getHost());
                        jSONObject.put("path", parse.getPath());
                        jSONObject.put("ref", "native");
                    } catch (JSONException e2) {
                        C78983UzD.LJIIZILJ(e2);
                    }
                    RawURLGetter.LIZIZ(str, new N96() { // from class: X.N92
                        @Override // X.N96
                        public final void LIZ(int i, Exception exc, boolean z2) {
                            N93 n932 = N93.this;
                            String str2 = str;
                            long j = currentTimeMillis;
                            JSONObject jSONObject2 = jSONObject;
                            if (n932 != null) {
                                n932.LIZ(j, str2, String.valueOf(i));
                            }
                            if (exc != null) {
                                C36922EeM.LIZ(exc);
                                try {
                                    jSONObject2.put("error_message", exc.getMessage());
                                } catch (JSONException e3) {
                                    C78983UzD.LJIIZILJ(e3);
                                }
                            }
                            try {
                                jSONObject2.put("status_code", i);
                            } catch (JSONException e4) {
                                C78983UzD.LJIIZILJ(e4);
                            }
                            if (C59835Ne3.LIZJ() != null) {
                                C59835Ne3.LIZJ().monitorStatusRate("aweme_third_party_track_url_succeed_rate", z2 ? 1 : 0, jSONObject2);
                            }
                        }
                    });
                }
            }
        }
    }
}
