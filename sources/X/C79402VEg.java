package X;

import Y.ARunnableS17S0400000_14;
import Y.ARunnableS25S0300000_14;
import Y.ARunnableS33S0200000_14;
import com.lynx.tasm.LynxViewClient;
import com.lynx.tasm.base.LLog;
import org.json.JSONObject;

/* renamed from: X.VEg, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C79402VEg extends LynxViewClient {
    public final C79403VEh LIZ;
    public final InterfaceC79400VEe LIZIZ = (InterfaceC79400VEe) VEZ.LIZIZ().LIZ(InterfaceC79400VEe.class);

    public C79402VEg(C79403VEh c79403VEh) {
        this.LIZ = c79403VEh;
    }

    @Override // com.lynx.tasm.LynxViewClient
    public final void LJIILL(String str) {
        JSONObject jSONObject;
        if (this.LIZIZ == null) {
            LLog.LIZLLL(4, "LynxLifecycleTracker", "mLynxApplogService is null in LynxLifecycleTracker::onPageStart.");
            return;
        }
        C79403VEh c79403VEh = this.LIZ;
        if (c79403VEh != null) {
            jSONObject = c79403VEh.LIZ();
        } else {
            jSONObject = null;
        }
        C79411VEp.LIZJ(new ARunnableS33S0200000_14(this, jSONObject, 23));
    }

    @Override // com.lynx.tasm.LynxViewClient
    public final void onTimingSetup(java.util.Map<String, Object> map) {
        JSONObject jSONObject;
        if (this.LIZIZ == null) {
            LLog.LIZLLL(4, "LynxLifecycleTracker", "mLynxApplogService is null in LynxLifecycleTracker::onTimingSetup.");
            return;
        }
        if (map == null) {
            LLog.LIZLLL(4, "LynxLifecycleTracker", "param is null in LynxLifecycleTracker::onTimingSetup.");
            return;
        }
        C79403VEh c79403VEh = this.LIZ;
        if (c79403VEh != null) {
            jSONObject = c79403VEh.LIZ();
        } else {
            jSONObject = null;
        }
        C79411VEp.LIZJ(new ARunnableS25S0300000_14(this, map, jSONObject, 3));
    }

    @Override // com.lynx.tasm.LynxViewClient
    public final void LJJIIJ(String str, java.util.Map map, java.util.Map map2) {
        JSONObject jSONObject;
        if (this.LIZIZ == null) {
            LLog.LIZLLL(4, "LynxLifecycleTracker", "mLynxApplogService is null in LynxLifecycleTracker::onTimingUpdate.");
            return;
        }
        if (str == null) {
            LLog.LIZLLL(4, "LynxLifecycleTracker", "param is null in LynxLifecycleTracker::onTimingUpdate.");
            return;
        }
        if (!str.equals("__lynx_timing_actual_fmp")) {
            return;
        }
        C79403VEh c79403VEh = this.LIZ;
        if (c79403VEh != null) {
            jSONObject = c79403VEh.LIZ();
        } else {
            jSONObject = null;
        }
        C79411VEp.LIZJ(new ARunnableS17S0400000_14(this, map, map2, jSONObject, 2));
    }
}
