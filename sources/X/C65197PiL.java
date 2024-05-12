package X;

import com.bytedance.android.livesdkapi.host.IHostConfig;
import com.bytedance.ttnet.TTNetInit;
import org.json.JSONObject;

/* renamed from: X.PiL, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65197PiL {
    public static final JSONObject LIZ() {
        JSONObject jSONObject = new JSONObject();
        try {
            C65198PiM es = ((IHostConfig) CN1.LIZ(IHostConfig.class)).es();
            jSONObject.put("network_speed_in_kbps", es.LIZIZ * 8);
            jSONObject.put("recommend_bitrate", es.LIZ);
            C48631J6t networkQuality = TTNetInit.getNetworkQuality();
            if (networkQuality != null) {
                jSONObject.put("tcp_rtt", networkQuality.LIZ);
                jSONObject.put("quic_rtt", networkQuality.LIZ);
                jSONObject.put("http_rtt", networkQuality.LIZIZ);
                jSONObject.put("downstream_throughput_kbps", networkQuality.LIZJ);
            }
            C65199PiN packetLossRateMetrics = TTNetInit.getPacketLossRateMetrics(1);
            if (packetLossRateMetrics != null) {
                jSONObject.put("quic_send_loss_rate", packetLossRateMetrics.LIZ);
                jSONObject.put("quic_receive_loss_rate", packetLossRateMetrics.LIZIZ);
            }
            jSONObject.put("net_effective_connection_type", TTNetInit.getEffectiveConnectionType());
            jSONObject.put("video_download_speed", C47497IkX.LIZJ());
        } catch (Exception e) {
            C0NB.LJI("GetNetworkParams", e);
        }
        return jSONObject;
    }
}
