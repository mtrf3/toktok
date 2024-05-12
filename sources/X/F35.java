package X;

import com.bytedance.android.monitor.HybridMonitor;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class F35<V> implements Callable {
    public final /* synthetic */ boolean LJLIL;
    public final /* synthetic */ String LJLILLLLZI;

    public F35(boolean z, String str) {
        this.LJLIL = z;
        this.LJLILLLLZI = str;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        String str;
        if (this.LJLIL) {
            str = "bullet_new";
        } else {
            str = "others";
        }
        F37 f37 = new F37("bdx_monitor_container_coverage_lynx_pv");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("template_url", this.LJLILLLLZI);
        jSONObject.put("container_type", str);
        f37.LIZLLL = jSONObject;
        f37.LJII = true;
        f37.LIZ = this.LJLILLLLZI;
        f37.LJIIIIZZ = new F34();
        HybridMonitor.getInstance().customReport(f37.LIZ());
        return C76800UCe.LIZ;
    }
}
