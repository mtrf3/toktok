package X;

import Y.IDRunnableS85S0100000;
import android.app.Activity;
import android.os.Build;
import com.bytedance.apm.core.ActivityLifeObserver;
import com.bytedance.services.slardar.config.IConfigManager;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* renamed from: X.1mP, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C42971mP extends PGP {
    public final java.util.Map<String, InterfaceC23150vX> LJLJL = new ConcurrentHashMap();
    public long LJLJLJ = -1;
    public boolean LJLJLLL;
    public long LJLL;
    public boolean LJLLI;

    @Override // X.PGP
    public final boolean LJIIJ() {
        return true;
    }

    @Override // X.PGP
    public final void LJIIJJI() {
        if (Build.VERSION.SDK_INT > 29) {
            return;
        }
        this.LJLJLLL = ActivityLifeObserver.getInstance().isForeground();
        this.LJLJLJ = System.currentTimeMillis();
        C43891nt c43891nt = new C43891nt();
        AnonymousClass262 anonymousClass262 = new AnonymousClass262();
        try {
            C20080qa c20080qa = new C20080qa();
            ((HashMap) c20080qa.LIZ).put("alarm", c43891nt);
            ((HashMap) c20080qa.LIZ).put("power", anonymousClass262);
            c20080qa.LIZ();
            C43901nu c43901nu = new C43901nu();
            ((ConcurrentHashMap) this.LJLJL).put("alarm", c43891nt);
            ((ConcurrentHashMap) this.LJLJL).put("cpu_active_time", c43901nu);
            ((ConcurrentHashMap) this.LJLJL).put("power", anonymousClass262);
            PE0 pe0 = F9U.LIZ;
            pe0.LIZ(this);
            if (C09970aH.LJIIIIZZ() && this.LJLIL) {
                C21260sU c21260sU = C21250sT.LIZ;
                c21260sU.getClass();
                pe0.LIZJ(new IDRunnableS85S0100000(c21260sU, 98));
            }
        } catch (Exception e) {
            if (C09970aH.LJII()) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("hook failed: ");
                LIZ.append(e.getMessage());
                X1D.LIZIZ(LIZ);
            }
            ActivityLifeObserver.getInstance().unregister(this);
            ((IConfigManager) C171096nZ.LIZ(IConfigManager.class)).unregisterConfigListener(this);
        }
    }

    public C42971mP() {
        this.LJLJJL = "battery";
    }

    @Override // X.PGP, X.InterfaceC64103PDv
    public final void LIZ() {
        super.LIZ();
        C21260sU c21260sU = C21250sT.LIZ;
        c21260sU.getClass();
        F9U.LIZ.LIZJ(new IDRunnableS85S0100000(c21260sU, 98));
    }

    @Override // X.PGP
    public final void LJIIL() {
        if (C09970aH.LJII()) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("onTimer record, current is background? : ");
            LIZ.append(ActivityLifeObserver.getInstance().isForeground());
            X1D.LIZIZ(LIZ);
        }
        LJIILL();
        Iterator it = ((ConcurrentHashMap) this.LJLJL).values().iterator();
        while (it.hasNext()) {
            ((InterfaceC23150vX) it.next()).LIZLLL();
        }
    }

    @Override // X.PGP
    public final long LJIILJJIL() {
        return this.LJLL * 60000;
    }

    public final void LJIILL() {
        long currentTimeMillis = System.currentTimeMillis();
        if (this.LJLJLJ != -1) {
            C21260sU c21260sU = C21250sT.LIZ;
            c21260sU.LIZIZ = ActivityLifeObserver.getInstance().getTopActivityClassName();
            c21260sU.LIZJ(new IRT(currentTimeMillis, currentTimeMillis - this.LJLJLJ, "ground_record", this.LJLJLLL));
        }
        this.LJLJLJ = currentTimeMillis;
    }

    @Override // X.PGP, X.InterfaceC64217PIf
    public final void LIZJ(Activity activity) {
        super.LIZJ(activity);
        C09970aH.LJII();
        LJIILL();
        Iterator it = ((ConcurrentHashMap) this.LJLJL).values().iterator();
        while (it.hasNext()) {
            ((InterfaceC23150vX) it.next()).LIZIZ();
        }
        this.LJLJLLL = true;
    }

    @Override // X.PGP, X.InterfaceC64217PIf
    public final void LJII(Activity activity) {
        super.LJII(activity);
        C09970aH.LJII();
        LJIILL();
        Iterator it = ((ConcurrentHashMap) this.LJLJL).values().iterator();
        while (it.hasNext()) {
            ((InterfaceC23150vX) it.next()).LJI();
        }
        this.LJLJLLL = false;
    }

    @Override // X.PGP
    public final void LJIIIIZZ(JSONObject jSONObject) {
        this.LJLL = jSONObject.optLong("battery_record_interval", 10L);
        boolean z = false;
        int optInt = jSONObject.optInt("enable_upload", 0);
        if (C09970aH.LJII()) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("mRecordInterval:");
            C06510Nj.LIZIZ(LIZ, this.LJLL, ",mBatteryCollectEnabled", optInt);
            X1D.LIZIZ(LIZ);
        }
        if (optInt <= 0 || this.LJLL <= 0) {
            ((ConcurrentHashMap) this.LJLJL).clear();
            ActivityLifeObserver.getInstance().unregister(this);
            F9U.LIZ.LJI(this);
        }
        if (jSONObject.optInt("trace_enable", 0) == 1) {
            z = true;
        }
        this.LJLLI = z;
        if (z) {
            MPE.LJLILLLLZI = jSONObject.optLong("max_single_wake_lock_hold_time_second", 120L) * 1000;
            MPE.LJLJI = jSONObject.optInt("max_total_wake_lock_acquire_count", 5);
            MPE.LJLJJI = jSONObject.optLong("max_total_wake_lock_hold_time_second", 240L) * 1000;
            MPE.LJLJJL = jSONObject.optInt("max_wake_up_alarm_invoke_count", 5);
            MPE.LJLJJLL = jSONObject.optInt("max_normal_alarm_invoke_count", 10);
            jSONObject.optLong("max_single_loc_request_time_second", 120L);
            jSONObject.optInt("max_total_loc_request_count", 5);
            jSONObject.optLong("max_total_loc_request_time_second", 240L);
        }
    }
}
