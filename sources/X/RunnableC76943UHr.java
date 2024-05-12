package X;

import java.util.Map;
import org.json.JSONObject;

/* renamed from: X.UHr, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class RunnableC76943UHr implements Runnable {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ long LJLJI;
    public final /* synthetic */ String LJLJJI;
    public final /* synthetic */ long LJLJJL;
    public final /* synthetic */ String LJLJJLL;
    public final /* synthetic */ String LJLJL;
    public final /* synthetic */ String LJLJLJ;
    public final /* synthetic */ long LJLJLLL;
    public final /* synthetic */ int LJLL;
    public final /* synthetic */ java.util.Map<String, String> LJLLI;
    public final /* synthetic */ Long LJLLILLLL;
    public final /* synthetic */ Long LJLLJ;
    public final /* synthetic */ int LJLLL;

    public RunnableC76943UHr(int i, int i2, int i3, long j, long j2, long j3, Long l, Long l2, String str, String str2, String str3, String str4, String str5, java.util.Map map) {
        this.LJLIL = str;
        this.LJLILLLLZI = i;
        this.LJLJI = j;
        this.LJLJJI = str2;
        this.LJLJJL = j2;
        this.LJLJJLL = str3;
        this.LJLJL = str4;
        this.LJLJLJ = str5;
        this.LJLJLLL = j3;
        this.LJLL = i2;
        this.LJLLI = map;
        this.LJLLILLLL = l;
        this.LJLLJ = l2;
        this.LJLLL = i3;
    }

    public final void LIZ() {
        long j;
        long LIZ = C32431Co7.LIZ();
        JSONObject jSONObject = new JSONObject();
        int i = this.LJLILLLLZI;
        long j2 = this.LJLJI;
        String str = this.LJLJJI;
        java.util.Map<String, String> map = this.LJLLI;
        jSONObject.put("asset_type", i);
        jSONObject.put("download_assets_from", j2);
        jSONObject.put("resource_format", str);
        for (Map.Entry<String, String> entry : map.entrySet()) {
            jSONObject.put(entry.getKey(), entry.getValue());
        }
        JSONObject jSONObject2 = new JSONObject();
        long j3 = this.LJLJJL;
        String str2 = this.LJLJJLL;
        String str3 = this.LJLJL;
        Long l = this.LJLLILLLL;
        Long l2 = this.LJLLJ;
        int i2 = this.LJLL;
        int i3 = this.LJLILLLLZI;
        long j4 = this.LJLJI;
        String str4 = this.LJLJJI;
        int i4 = this.LJLLL;
        java.util.Map<String, String> map2 = this.LJLLI;
        jSONObject2.put("asset_id", j3);
        jSONObject2.put("resource_bytevc1_url", str2);
        jSONObject2.put("urls", str3);
        jSONObject2.put("free_disksize", LIZ);
        long j5 = 0;
        if (l != null) {
            j = l.longValue();
        } else {
            j = 0;
        }
        if (l2 != null) {
            j5 = l2.longValue();
        }
        jSONObject2.put("prepare_available_duration", j + j5);
        jSONObject2.put("prepare_download_duration", l);
        jSONObject2.put("download_process_duration", l2);
        jSONObject2.put("error_type", i2);
        jSONObject2.put("asset_type", i3);
        jSONObject2.put("download_assets_from", j4);
        jSONObject2.put("resource_format", str4);
        jSONObject2.put("retry_count", i4);
        for (Map.Entry<String, String> entry2 : map2.entrySet()) {
            jSONObject2.put(entry2.getKey(), entry2.getValue());
        }
        JSONObject jSONObject3 = new JSONObject();
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("gift_asset_download_start");
        LIZ2.append(this.LJLIL);
        BZI LIZ3 = C28787BRn.LIZ(X1D.LIZIZ(LIZ2));
        LIZ3.LJIIZILJ();
        LIZ3.LJJ(jSONObject);
        LIZ3.LJJ(jSONObject2);
        LIZ3.LJIJJ(Integer.valueOf(C32710Csc.LIZIZ()), "is_anchor");
        LIZ3.LJIJJ(Integer.valueOf(this.LJLILLLLZI), "asset_type");
        LIZ3.LJIJJ(Long.valueOf(this.LJLJI), "download_assets_from");
        LIZ3.LJIJJ(this.LJLJJI, "resource_format");
        LIZ3.LJIJJ(Long.valueOf(this.LJLJJL), "asset_id");
        LIZ3.LJIJJ(this.LJLJJLL, "resource_bytevc1_url");
        LIZ3.LJIJJ(this.LJLJL, "urls");
        LIZ3.LJIJJ(this.LJLJLJ, "remote_md5");
        LIZ3.LJIJJ(Long.valueOf(this.LJLJLLL), "remote_filesize");
        LIZ3.LJIJJ(Long.valueOf(LIZ), "free_disksize");
        LIZ3.LJIJJ(C1H.LJ(), "overload_score");
        LIZ3.LJJIIJZLJL();
        if (this.LJLL == 0) {
            StringBuilder LIZ4 = X1D.LIZ();
            LIZ4.append("gift_asset_download_start");
            LIZ4.append(this.LJLIL);
            C0K2.LJI(X1D.LIZIZ(LIZ4), jSONObject, jSONObject3, jSONObject2);
            return;
        }
        StringBuilder LIZ5 = X1D.LIZ();
        LIZ5.append("gift_asset_download_start");
        LIZ5.append(this.LJLIL);
        C0K2.LJ(X1D.LIZIZ(LIZ5), jSONObject, jSONObject3, jSONObject2);
        StringBuilder LIZ6 = X1D.LIZ();
        LIZ6.append("gift_asset_download_start_error");
        LIZ6.append(this.LJLIL);
        C0K2.LJI(X1D.LIZIZ(LIZ6), jSONObject, jSONObject3, jSONObject2);
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
