package X;

import Y.AfS22S1000000_13;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchXSetting;
import com.bytedance.android.monitorV2.lynx.LynxViewMonitor;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes14.dex */
public final class UH5 implements UH9 {
    public final /* synthetic */ String LIZ;
    public final /* synthetic */ UH3 LIZIZ;
    public final /* synthetic */ String LIZJ;
    public final /* synthetic */ long LIZLLL;

    @Override // X.UH9
    public final void onSuccess() {
        LiveMatchXSetting.INSTANCE.setSparkLoadSuccess(true);
        B7Q.LIZ("success", 0, true, "");
        long currentTimeMillis = System.currentTimeMillis();
        LynxViewMonitor.Companion.getClass();
        LynxViewMonitor lynxViewMonitor = LynxViewMonitor.INSTANCE;
        String str = this.LIZ;
        JSONObject LIZLLL = C770830u.LIZLLL("stage", 0);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("duration", currentTimeMillis - this.LIZLLL);
        lynxViewMonitor.reportCustom(null, "match_x_show_duration", str, LIZLLL, null, jSONObject, null, 0);
        this.LIZIZ.LJ.put(this.LIZJ, Long.valueOf(currentTimeMillis));
        HashMap<String, String> hashMap = this.LIZIZ.LJFF;
        String str2 = this.LIZJ;
        String url = this.LIZ;
        o.LJIIIIZZ(url, "url");
        hashMap.put(str2, url);
        this.LIZIZ.LJI.put(this.LIZJ, AbstractC73672Svk.LJJLIIIJLJLI(300L, TimeUnit.MILLISECONDS).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJJZI(new AfS22S1000000_13(this.LIZ, 0)));
    }

    @Override // X.UH9
    public final void LIZ(String url, C60704Ns4 c60704Ns4) {
        o.LJIIIZ(url, "url");
        LiveMatchXSetting.INSTANCE.setSparkLoadSuccess(false);
        B7Q.LIZ(c60704Ns4.LIZIZ, c60704Ns4.LIZ, false, url);
    }

    public UH5(String str, UH3 uh3, String str2, long j) {
        this.LIZ = str;
        this.LIZIZ = uh3;
        this.LIZJ = str2;
        this.LIZLLL = j;
    }
}
