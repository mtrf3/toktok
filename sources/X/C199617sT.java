package X;

import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONObject;

/* renamed from: X.7sT, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C199617sT {
    public InterfaceC60761Nsz LIZ;
    public final String LIZIZ;

    public C199617sT() {
        C51556KLg.LIZ.getClass();
        String LJIJJLI = C51556KLg.LIZ().LJIJJLI("poi_discover_map_mode");
        this.LIZIZ = LJIJJLI == null ? "" : LJIJJLI;
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onCollectedStatusChange(C187127Wa event) {
        o.LJIIIZ(event, "event");
        long currentTimeMillis = System.currentTimeMillis();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("poi_id", event.LJLILLLLZI);
        jSONObject.put("is_collected", event.LJLIL);
        C01R.LIZIZ(currentTimeMillis, new C78528Urs(jSONObject), "poiCollectStatusChange");
    }
}
