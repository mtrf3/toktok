package X;

import com.bytedance.android.livesdk.livesetting.other.LiveLogMonitorSampleSetting;
import java.util.Map;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.UHq, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class RunnableC76942UHq implements Runnable {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ Long LJLJI;
    public final /* synthetic */ Long LJLJJI;
    public final /* synthetic */ int LJLJJL;
    public final /* synthetic */ long LJLJJLL;
    public final /* synthetic */ String LJLJL;
    public final /* synthetic */ long LJLJLJ;
    public final /* synthetic */ String LJLJLLL;
    public final /* synthetic */ String LJLL;
    public final /* synthetic */ String LJLLI;
    public final /* synthetic */ String LJLLILLLL;
    public final /* synthetic */ Long LJLLJ;
    public final /* synthetic */ long LJLLL;
    public final /* synthetic */ int LJLLLL;
    public final /* synthetic */ java.util.Map<String, String> LJLLLLLL;
    public final /* synthetic */ String LJLZ;

    public RunnableC76942UHq(int i, int i2, int i3, long j, long j2, long j3, Long l, Long l2, Long l3, String str, String str2, String str3, String str4, String str5, String str6, String str7, java.util.Map map) {
        this.LJLIL = i;
        this.LJLILLLLZI = str;
        this.LJLJI = l;
        this.LJLJJI = l2;
        this.LJLJJL = i2;
        this.LJLJJLL = j;
        this.LJLJL = str2;
        this.LJLJLJ = j2;
        this.LJLJLLL = str3;
        this.LJLL = str4;
        this.LJLLI = str5;
        this.LJLLILLLL = str6;
        this.LJLLJ = l3;
        this.LJLLL = j3;
        this.LJLLLL = i3;
        this.LJLLLLLL = map;
        this.LJLZ = str7;
    }

    public final void LIZ() {
        long LIZ;
        long j;
        long j2;
        long j3;
        long j4;
        long j5;
        long j6;
        if (this.LJLIL == 0) {
            LIZ = 0;
        } else {
            LIZ = C32431Co7.LIZ();
        }
        JSONObject jSONObject = new JSONObject();
        Long l = this.LJLJI;
        Long l2 = this.LJLJJI;
        if (l != null) {
            j = l.longValue();
        } else {
            j = 0;
        }
        if (l2 != null) {
            j2 = l2.longValue();
        } else {
            j2 = 0;
        }
        jSONObject.put("prepare_available_duration", j + j2);
        jSONObject.put("prepare_download_duration", l);
        jSONObject.put("download_process_duration", l2);
        JSONObject jSONObject2 = new JSONObject();
        int i = this.LJLIL;
        int i2 = this.LJLJJL;
        long j7 = this.LJLJJLL;
        String str = this.LJLJL;
        java.util.Map<String, String> map = this.LJLLLLLL;
        jSONObject2.put("error_type", i);
        jSONObject2.put("asset_type", i2);
        jSONObject2.put("download_assets_from", j7);
        jSONObject2.put("resource_format", str);
        for (Map.Entry<String, String> entry : map.entrySet()) {
            jSONObject2.put(entry.getKey(), entry.getValue());
        }
        JSONObject jSONObject3 = new JSONObject();
        long j8 = this.LJLJLJ;
        String str2 = this.LJLJLLL;
        String str3 = this.LJLL;
        String str4 = this.LJLZ;
        int i3 = this.LJLIL;
        String str5 = this.LJLLI;
        String str6 = this.LJLLILLLL;
        Long l3 = this.LJLLJ;
        long j9 = this.LJLLL;
        Long l4 = this.LJLJI;
        Long l5 = this.LJLJJI;
        int i4 = this.LJLJJL;
        long j10 = this.LJLJJLL;
        String str7 = this.LJLJL;
        int i5 = this.LJLLLL;
        java.util.Map<String, String> map2 = this.LJLLLLLL;
        jSONObject3.put("asset_id", j8);
        jSONObject3.put("resource_bytevc1_url", str2);
        jSONObject3.put("urls", str3);
        jSONObject3.put("error_msg", str4);
        jSONObject3.put("error_code", i3);
        jSONObject3.put("local_md5", str5);
        jSONObject3.put("remote_md5", str6);
        jSONObject3.put("local_filesize", l3);
        jSONObject3.put("remote_filesize", j9);
        jSONObject3.put("free_disksize", LIZ);
        if (l4 != null) {
            j3 = l4.longValue();
        } else {
            j3 = 0;
        }
        if (l5 != null) {
            j4 = l5.longValue();
        } else {
            j4 = 0;
        }
        jSONObject3.put("prepare_available_duration", j3 + j4);
        jSONObject3.put("prepare_download_duration", l4);
        jSONObject3.put("download_process_duration", l5);
        jSONObject3.put("error_type", i3);
        jSONObject3.put("asset_type", i4);
        jSONObject3.put("download_assets_from", j10);
        jSONObject3.put("resource_format", str7);
        jSONObject3.put("retry_count", i5);
        for (Map.Entry<String, String> entry2 : map2.entrySet()) {
            jSONObject3.put(entry2.getKey(), entry2.getValue());
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("gift_asset_download_status");
        LIZ2.append(this.LJLILLLLZI);
        if (!o.LJ("gift_asset_download_status", X1D.LIZIZ(LIZ2)) || LiveLogMonitorSampleSetting.INSTANCE.isReport("livesdk_gift_asset_download_status", 0.1d)) {
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("gift_asset_download_status");
            LIZ3.append(this.LJLILLLLZI);
            BZI LIZ4 = C28787BRn.LIZ(X1D.LIZIZ(LIZ3));
            LIZ4.LJIIZILJ();
            LIZ4.LJJ(jSONObject);
            LIZ4.LJJ(jSONObject2);
            LIZ4.LJJ(jSONObject3);
            LIZ4.LJIJJ(Integer.valueOf(C32710Csc.LIZIZ()), "is_anchor");
            Long l6 = this.LJLJI;
            if (l6 != null) {
                j5 = l6.longValue();
            } else {
                j5 = 0;
            }
            Long l7 = this.LJLJJI;
            if (l7 != null) {
                j6 = l7.longValue();
            } else {
                j6 = 0;
            }
            LIZ4.LJIJJ(Long.valueOf(j5 + j6), "prepare_available_duration");
            LIZ4.LJIJJ(this.LJLJI, "prepare_download_duration");
            LIZ4.LJIJJ(this.LJLJJI, "download_process_duration");
            LIZ4.LJIJJ(Integer.valueOf(this.LJLIL), "error_type");
            LIZ4.LJIJJ(Integer.valueOf(this.LJLJJL), "asset_type");
            LIZ4.LJIJJ(Long.valueOf(this.LJLJJLL), "download_assets_from");
            LIZ4.LJIJJ(this.LJLJL, "resource_format");
            LIZ4.LJIJJ(Long.valueOf(this.LJLJLJ), "asset_id");
            LIZ4.LJIJJ(this.LJLJLLL, "resource_bytevc1_url");
            LIZ4.LJIJJ(this.LJLL, "urls");
            LIZ4.LJIJJ(this.LJLLI, "local_md5");
            LIZ4.LJIJJ(this.LJLLILLLL, "remote_md5");
            LIZ4.LJIJJ(this.LJLLJ, "local_filesize");
            LIZ4.LJIJJ(Long.valueOf(this.LJLLL), "remote_filesize");
            LIZ4.LJIJJ(Long.valueOf(LIZ), "free_disksize");
            UFE.LIZIZ(this.LJLLLL, LIZ4, "retry_count");
        }
        if (this.LJLIL == 0) {
            StringBuilder LIZ5 = X1D.LIZ();
            LIZ5.append("gift_asset_download_status");
            LIZ5.append(this.LJLILLLLZI);
            C0K2.LJI(X1D.LIZIZ(LIZ5), jSONObject2, jSONObject, jSONObject3);
            return;
        }
        StringBuilder LIZ6 = X1D.LIZ();
        LIZ6.append("gift_asset_download_status");
        LIZ6.append(this.LJLILLLLZI);
        C0K2.LJI(X1D.LIZIZ(LIZ6), jSONObject2, jSONObject, jSONObject3);
        StringBuilder LIZ7 = X1D.LIZ();
        LIZ7.append("gift_asset_download_status_error");
        LIZ7.append(this.LJLILLLLZI);
        C0K2.LJI(X1D.LIZIZ(LIZ7), jSONObject2, jSONObject, jSONObject3);
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }
}
