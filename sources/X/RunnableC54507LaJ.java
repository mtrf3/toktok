package X;

import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.LaJ, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class RunnableC54507LaJ implements Runnable {
    public final /* synthetic */ OG9 LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ long LJLJI;

    public RunnableC54507LaJ(OG9 og9, String str, long j) {
        this.LJLIL = og9;
        this.LJLILLLLZI = str;
        this.LJLJI = j;
    }

    public final void LIZ() {
        OG9 og9 = this.LJLIL;
        String type = this.LJLILLLLZI;
        long j = this.LJLJI;
        og9.getClass();
        o.LJIIIZ(type, "type");
        if (!C52185Kdx.LIZ || !C64099PDr.LIZ.getLogTypeSwitch("prf_page_start_time")) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(WM7.SCENE_SERVICE, type);
        jSONObject.put("load_time", j);
        FMX.LJIILJJIL("prf_page_start_time", jSONObject);
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
