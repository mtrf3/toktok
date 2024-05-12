package X;

import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.apm.core.ActivityLifeObserver;
import com.bytedance.services.slardar.config.IConfigManager;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public abstract class PGP implements InterfaceC64217PIf, InterfaceC64103PDv, PE2 {
    public boolean LJLIL;
    public boolean LJLILLLLZI;
    public boolean LJLJI;
    public boolean LJLJJI;
    public String LJLJJL;
    public long LJLJJLL;

    public void LIZ() {
        this.LJLIL = true;
        if (!this.LJLJJI) {
            this.LJLJJI = true;
            if (LJIIJ()) {
                F9U.LIZ.LIZ(this);
            }
        }
        LJIIL();
        this.LJLJJLL = System.currentTimeMillis();
    }

    @Override // X.InterfaceC64217PIf
    public final void LIZLLL(Activity activity) {
    }

    @Override // X.InterfaceC64217PIf
    public final void LJFF(Activity activity) {
    }

    @Override // X.InterfaceC64217PIf
    public final void LJI(Activity activity) {
    }

    public abstract void LJIIIIZZ(JSONObject jSONObject);

    public abstract boolean LJIIJ();

    public void LJIIJJI() {
    }

    public void LJIIL() {
    }

    public abstract long LJIILJJIL();

    @Override // X.InterfaceC64217PIf
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // X.InterfaceC64217PIf
    public final void onActivityStarted(Activity activity) {
    }

    public final void LJIIIZ() {
        if (this.LJLJI) {
            return;
        }
        if (!TextUtils.isEmpty(this.LJLJJL)) {
            this.LJLJI = true;
            ActivityLifeObserver.getInstance().register(this);
            this.LJLILLLLZI = true ^ ActivityLifeObserver.getInstance().isForeground();
            LJIIJJI();
            ((IConfigManager) C171096nZ.LIZ(IConfigManager.class)).registerConfigListener(this);
            if (C09970aH.LJII()) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("perf init: ");
                LIZ.append(this.LJLJJL);
                X1D.LIZIZ(LIZ);
                return;
            }
            return;
        }
        throw new IllegalStateException("Must set collector Setting key, before init");
    }

    public static final void LJIILIIL(PEF pef) {
        String sb;
        if (PGR.LIZJ == null) {
            synchronized (PGR.class) {
                if (PGR.LIZJ == null) {
                    PGR.LIZJ = new PGR();
                }
            }
        }
        Object[] array = PGR.LIZJ.LIZ.toArray();
        if (array == null) {
            sb = "";
        } else {
            StringBuilder sb2 = new StringBuilder();
            boolean z = true;
            for (Object obj : array) {
                if (z) {
                    z = false;
                } else {
                    sb2.append("#");
                }
                sb2.append(obj.toString());
            }
            sb = sb2.toString();
        }
        if (TextUtils.isEmpty(sb)) {
            sb = ActivityLifeObserver.getInstance().getTopActivityClassName();
        }
        JSONObject jSONObject = pef.LJ;
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        try {
            if (TextUtils.isEmpty(sb)) {
                sb = ActivityLifeObserver.getInstance().getTopActivityClassName();
            }
            jSONObject.put(WM7.SCENE_SERVICE, sb);
            jSONObject.put("process_name", C09970aH.LIZIZ());
            jSONObject.put("is_main_process", C09970aH.LJIIIIZZ());
            if (jSONObject.isNull("is_front")) {
                jSONObject.put("is_front", ActivityLifeObserver.getInstance().isForeground());
            }
            pef.LJ = jSONObject;
        } catch (JSONException unused) {
        }
        boolean equals = TextUtils.equals(pef.LIZ, "memory");
        PGR LIZ = PGR.LIZ();
        LIZ.getClass();
        JSONObject jSONObject2 = new JSONObject();
        try {
            for (Map.Entry<String, String> entry : LIZ.LIZIZ.entrySet()) {
                jSONObject2.put(entry.getKey(), entry.getValue());
            }
            if (equals) {
                C39712FiG c39712FiG = C39715FiJ.LIZ;
                if (c39712FiG.LIZ) {
                    try {
                        c39712FiG.LIZIZ(jSONObject2);
                    } catch (JSONException unused2) {
                    }
                }
                c39712FiG.LIZ(jSONObject2);
            }
        } catch (JSONException unused3) {
        }
        pef.LJFF = jSONObject2;
        C64089PDh.LJIIJ().LIZLLL(pef);
    }

    @Override // X.PE2
    public final void LIZIZ(long j) {
        long LJIILJJIL = LJIILJJIL();
        if (LJIILJJIL > 0 && j - this.LJLJJLL > LJIILJJIL && this.LJLIL) {
            LJIIL();
            this.LJLJJLL = System.currentTimeMillis();
        }
    }

    @Override // X.InterfaceC64217PIf
    public void LIZJ(Activity activity) {
        this.LJLILLLLZI = false;
    }

    @Override // X.InterfaceC64217PIf
    public void LJII(Activity activity) {
        this.LJLILLLLZI = true;
    }

    @Override // X.InterfaceC64103PDv
    public final void LJ(JSONObject jSONObject, boolean z) {
        JSONObject optJSONObject;
        JSONObject optJSONObject2 = jSONObject.optJSONObject("performance_modules");
        if (optJSONObject2 == null || (optJSONObject = optJSONObject2.optJSONObject(this.LJLJJL)) == null) {
            return;
        }
        optJSONObject.optInt("enable_upload", 0);
        LJIIIIZZ(optJSONObject);
    }
}
