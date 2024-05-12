package X;

import Y.AObjectS21S0001000_5;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.android.livesdk.livesetting.other.FakeRegionsSetting;
import com.bytedance.android.livesdk.livesetting.other.LiveMtTikcastSwitcherParamSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.enterroom.RequestAudienceApiExperiment;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.ttnet.TTNetInit;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: X.PiK, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65196PiK {
    public final C62822Ol8 LIZ;
    public final String[] LIZIZ;

    public C65196PiK() {
        C62822Ol8 LIZIZ = C221108m2.LIZIZ(new AObjectS21S0001000_5(0, 7));
        this.LIZ = LIZIZ;
        this.LIZIZ = new String[]{"CN", "MR", "SA", "FR", "AE"};
        LIZIZ.getValue();
    }

    public final void LIZ(StringBuilder sb) {
        String encode;
        String sb2 = sb.toString();
        if (sb2.indexOf(63) < 0) {
            sb.append("?");
        } else {
            sb.append("&");
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LIZJ(sb2, linkedHashMap);
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            arrayList.add(new Pair(entry.getKey(), entry.getValue()));
        }
        StringBuilder sb3 = new StringBuilder();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            try {
                String encode2 = URLEncoder.encode((String) pair.first, "UTF-8");
                String str = (String) pair.second;
                if (str != null) {
                    try {
                        encode = URLEncoder.encode(str, "UTF-8");
                    } catch (UnsupportedEncodingException e) {
                        throw new IllegalArgumentException(e);
                    }
                } else {
                    encode = "";
                }
                if (sb3.length() > 0) {
                    sb3.append("&");
                }
                C1DI.LIZIZ(sb3, encode2, "=", encode);
            } catch (UnsupportedEncodingException e2) {
                throw new IllegalArgumentException(e2);
            }
        }
        sb.append(sb3.toString());
    }

    public final C65127PhD LIZIZ(C65127PhD c65127PhD) {
        String str = c65127PhD.LIZ;
        if (!TextUtils.isEmpty(str)) {
            StringBuilder sb = new StringBuilder(str);
            LIZ(sb);
            c65127PhD.LIZ = sb.toString();
        }
        return c65127PhD;
    }

    public final void LIZLLL(java.util.Map<String, String> map) {
        Locale locale;
        String str;
        map.put("webcast_sdk_version", C30443Bx9.LIZ());
        if (CN1.LIZ(IHostAppContext.class) != null) {
            locale = ((IHostAppContext) CN1.LIZ(IHostAppContext.class)).currentLocale();
        } else {
            locale = null;
        }
        map.put("webcast_language", C87095YGd.LIZ(locale));
        map.put("webcast_locale", Resources.getSystem().getConfiguration().locale.toString());
        if (C30922CBq.LIZ) {
            int value = FakeRegionsSetting.INSTANCE.getValue();
            if (value >= 0) {
                String[] strArr = this.LIZIZ;
                if (value < strArr.length) {
                    str = strArr[value];
                    map.put("fake_region", str);
                }
            }
            str = "";
            map.put("fake_region", str);
        }
        if (CN1.LIZ(IHostAppContext.class) != null && ((IHostAppContext) CN1.LIZ(IHostAppContext.class)).isLocalTest() && LiveMtTikcastSwitcherParamSetting.INSTANCE.getValue() == 1) {
            map.put("tikcast", "1");
        }
        Iterator<InterfaceC121054p3> it = C65128PhE.LIZ.iterator();
        while (it.hasNext()) {
            it.next().LIZ(map);
        }
        JSONObject jSONObject = new JSONObject();
        try {
            C48631J6t networkQuality = TTNetInit.getNetworkQuality();
            jSONObject.put("tcp_rtt", networkQuality.LIZ);
            jSONObject.put("quic_rtt", networkQuality.LIZ);
            jSONObject.put("http_rtt", networkQuality.LIZIZ);
            jSONObject.put("downstream_throughput_kbps", networkQuality.LIZJ);
            C65199PiN packetLossRateMetrics = TTNetInit.getPacketLossRateMetrics(1);
            jSONObject.put("quic_send_loss_rate", packetLossRateMetrics.LIZ);
            jSONObject.put("quic_receive_loss_rate", packetLossRateMetrics.LIZIZ);
            jSONObject.put("net_effective_connection_type", TTNetInit.getEffectiveConnectionType());
            jSONObject.put("video_download_speed", C47497IkX.LIZJ());
        } catch (Exception e) {
            C0NB.LJI("GetNetworkParams", e);
        }
        map.put("current_network_quality_info", jSONObject.toString());
    }

    public final void LIZJ(String str, java.util.Map map) {
        RequestAudienceApiExperiment requestAudienceApiExperiment = RequestAudienceApiExperiment.INSTANCE;
        if (requestAudienceApiExperiment.getValue() == requestAudienceApiExperiment.getENABLE()) {
            try {
                if (((List) this.LIZ.getValue()).contains(new java.net.URL(str).getPath())) {
                    map.put("request_audience_api", "1");
                }
            } catch (MalformedURLException unused) {
            }
        }
        LIZLLL(map);
    }
}
