package X;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.HandlerThread;
import android.text.TextUtils;
import com.bytedance.apm.core.ActivityLifeObserver;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.1mQ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C42981mQ extends PGP {
    public boolean LJLJL;
    public int LJLJLJ;
    public long LJLJLLL;
    public String LJLL;
    public boolean LJLZ;
    public final ConcurrentHashMap<String, C14580hi> LJLLI = new ConcurrentHashMap<>();
    public final Object LJLLILLLL = new Object();
    public long LJLLJ = 0;
    public float LJLLL = 0.0f;
    public long LJLLLL = 0;
    public long LJLLLLLL = 0;
    public final PHF LJZ = PHR.LIZ;
    public final CopyOnWriteArrayList<Long> LJZI = new CopyOnWriteArrayList<>();
    public final C33641Ts LJZL = new C33641Ts(this);

    @Override // X.PGP
    public final boolean LJIIJ() {
        return !this.LJLILLLLZI;
    }

    @Override // X.PGP
    public final void LJIIL() {
        for (Map.Entry<String, C14580hi> entry : this.LJLLI.entrySet()) {
            try {
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put(WM7.SCENE_SERVICE, entry.getKey());
                jSONObject.put("current", entry.getValue().LIZ);
                jSONObject.put("capacity", entry.getValue().LIZLLL);
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("cpu_time", entry.getValue().LIZIZ);
                jSONObject3.put("traffic", entry.getValue().LIZJ);
                jSONObject3.put("loc", entry.getValue().LJ.toString());
                C64089PDh.LJIIJ().LIZLLL(new PEF("battery", "", jSONObject, jSONObject2, jSONObject3));
            } catch (JSONException unused) {
            }
        }
        this.LJLLI.clear();
    }

    public final void LJIILL() {
        if (!TextUtils.isEmpty(this.LJLL)) {
            this.LJLL = null;
            F9U.LIZ.LJI(this);
            HandlerThread handlerThread = PMM.LIZ;
            if (handlerThread != null) {
                handlerThread.quit();
                ((C33641Ts) PMM.LIZJ).LIZ.LJIILLIIL();
                PMM.LIZ = null;
                PMM.LIZIZ = null;
                PMM.LIZJ = null;
            }
            LJIILLIIL();
        }
    }

    public final void LJIILLIIL() {
        this.LJLLJ = 0L;
        this.LJLLL = 0.0f;
    }

    public C42981mQ() {
        boolean z;
        this.LJLJJL = "battery";
        Context context = C09970aH.LIZ;
        try {
            Intent LJJLIIIJILLIZJL = C16880lQ.LJJLIIIJILLIZJL(new BroadcastReceiver() { // from class: X.0hk
                public final void LIZ(Intent intent) {
                    boolean z2;
                    int intExtra = intent.getIntExtra("status", -1);
                    C42981mQ c42981mQ = C42981mQ.this;
                    if (intExtra == 2 || intExtra == 5) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    c42981mQ.LJLZ = z2;
                    if (z2) {
                        synchronized (c42981mQ.LJLLILLLL) {
                            C42981mQ.this.LJIILL();
                        }
                    }
                }

                @Override // android.content.BroadcastReceiver
                public final void onReceive(Context context2, Intent intent) {
                    if (!C84763XOl.LJIIJJI && intent != null) {
                        if (!((ArrayList) C38413F5t.LIZ).contains(intent.getAction()) && C38413F5t.LIZ("onBroadcastReceiverReceive")) {
                            C35532Dx2.LIZIZ();
                        }
                    }
                    if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
                        LIZ(intent);
                    } else {
                        C38523F9z.LIZ();
                        LIZ(intent);
                    }
                }
            }, context, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            if (LJJLIIIJILLIZJL != null) {
                int intExtra = LJJLIIIJILLIZJL.getIntExtra("status", -1);
                if (intExtra == 2 || intExtra == 5) {
                    z = true;
                } else {
                    z = false;
                }
                this.LJLZ = z;
                return;
            }
        } catch (Throwable unused) {
        }
        this.LJLZ = true;
    }

    @Override // X.PGP
    public final long LJIILJJIL() {
        return this.LJLJLLL;
    }

    @Override // X.PGP, X.InterfaceC64217PIf
    public final void LIZJ(Activity activity) {
        super.LIZJ(activity);
    }

    @Override // X.PGP, X.InterfaceC64217PIf
    public final void LJII(Activity activity) {
        super.LJII(activity);
        F9U.LIZ.LJI(this);
        synchronized (this.LJLLILLLL) {
            LJIILL();
        }
    }

    @Override // X.PGP
    public final void LJIIIIZZ(JSONObject jSONObject) {
        boolean z = false;
        if (jSONObject.optInt("energy_enable", 0) == 1) {
            z = true;
        }
        this.LJLJL = z;
        if (z) {
            this.LJLJLJ = jSONObject.optInt("battery_energy_sample_interval", 3000);
            this.LJLJLLL = jSONObject.optLong("battery_energy_upload_interval", 120000L);
        } else {
            ActivityLifeObserver.getInstance().unregister(this);
            F9U.LIZ.LJI(this);
        }
    }
}
