package X;

import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class QHU implements J2V {
    public final /* synthetic */ QH9 LIZ;

    @Override // X.J2V
    public final Object LIZ() {
        String LIZIZ;
        String str;
        String str2;
        String str3;
        if (this.LIZ.LJ.getLong("app_log_last_config_time", 0L) <= 0) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject.put("appId", this.LIZ.LJIIL.LJIIIZ);
            long j = this.LIZ.LJ.getLong("session_interval", 0L);
            String str4 = "--";
            if (j <= 0) {
                LIZIZ = "--";
            } else {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(j);
                LIZ.append("ms");
                LIZIZ = X1D.LIZIZ(LIZ);
            }
            jSONObject2.put("BgSession Interval", LIZIZ);
            long j2 = this.LIZ.LJ.getLong("batch_event_interval", 0L);
            if (j2 <= 0) {
                str = "--";
            } else {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append(j2);
                LIZ2.append("ms");
                str = X1D.LIZIZ(LIZ2);
            }
            jSONObject2.put("Batch Interval", str);
            long j3 = this.LIZ.LJ.getLong("abtest_fetch_interval", 0L);
            if (j3 <= 0) {
                str2 = "--";
            } else {
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append(j3);
                LIZ3.append("ms");
                str2 = X1D.LIZIZ(LIZ3);
            }
            jSONObject2.put("ABTest Interval", str2);
            jSONObject2.put("BAV", this.LIZ.LJ.getBoolean("bav_log_collect", false));
            jSONObject2.put("ABTest", this.LIZ.LJ.getBoolean("bav_ab_config", false));
            jSONObject2.put("Realtime Events", this.LIZ.LJ.getString("real_time_events", "[]"));
            jSONObject2.put("Disable Detail", this.LIZ.LJ.getBoolean("forbid_report_phone_detail_info", false));
            long j4 = this.LIZ.LJ.getLong("fetch_interval", 0L);
            if (j4 > 0) {
                StringBuilder LIZ4 = X1D.LIZ();
                LIZ4.append(j4);
                LIZ4.append("ms");
                str4 = X1D.LIZIZ(LIZ4);
            }
            jSONObject2.put("Server Interval", str4);
            int i = this.LIZ.LJ.getInt("content_encode_method", 0);
            boolean z = true;
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        str3 = "UNKNOWN";
                    } else {
                        str3 = "ZSTD+DICT";
                    }
                } else {
                    str3 = "ZSTD";
                }
            } else {
                str3 = "GZIP";
            }
            jSONObject2.put("Compress Type", str3);
            jSONObject2.put("Log Back", this.LIZ.LJ.getString("log_back", ""));
            if (this.LIZ.LJ.getLong("max_pack_size", 0L) <= 0) {
                z = false;
            }
            jSONObject2.put("Pack Size Limited", z);
            jSONObject2.put("Max Pack Size", this.LIZ.LJ.getLong("max_pack_size", 0L));
            jSONObject2.put("Ignore Priority", this.LIZ.LJ.getBoolean("ignore_event_priority", false));
            jSONObject.put("config", jSONObject2);
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    public QHU(QH9 qh9) {
        this.LIZ = qh9;
    }
}
