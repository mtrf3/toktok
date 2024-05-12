package X;

import com.bytedance.android.live.core.monitor.PersistenceReporter;
import com.bytedance.android.livesdk.livesetting.broadcast.LivePreviewNetworkSpeedThresholdSetting;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.UBw, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76792UBw {
    public InterfaceC88472Yns<Object, ? extends JSONObject> LIZIZ;
    public InterfaceC88472Yns<Object, ? extends JSONObject> LIZJ;
    public InterfaceC88472Yns<? super JSONObject, C76800UCe> LJII;
    public InterfaceC88472Yns<Object, String> LIZ = C76793UBx.LJLIL;
    public String LIZLLL = "ttlive_monitor";
    public String LJ = "ttlive";
    public String LJFF = "ttlive";
    public String LJI = "";

    public final C76788UBs LIZ() {
        PersistenceReporter persistenceReporter;
        C05610Jx c05610Jx = new C05610Jx();
        String eventKey = this.LIZLLL;
        o.LJIIIZ(eventKey, "eventKey");
        c05610Jx.LIZ = eventKey;
        c05610Jx.LIZIZ = this.LJII;
        if (eventKey.length() == 0) {
            persistenceReporter = null;
        } else {
            persistenceReporter = new PersistenceReporter(c05610Jx.LIZ);
            persistenceReporter.LIZIZ = LivePreviewNetworkSpeedThresholdSetting.DEFAULT;
            persistenceReporter.LIZJ = 2048L;
            persistenceReporter.LIZLLL = Long.MAX_VALUE;
            persistenceReporter.LJ = c05610Jx.LIZIZ;
        }
        return new C76788UBs(this.LJ, this.LJFF, this.LJI, this.LIZ, this.LIZIZ, this.LIZJ, persistenceReporter);
    }
}
