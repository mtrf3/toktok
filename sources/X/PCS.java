package X;

import android.text.TextUtils;
import com.bytedance.services.slardar.config.IConfigManager;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class PCS extends AbstractRunnableC64070PCo {
    public final /* synthetic */ PCT LJLJJI;

    public final void LIZ() {
        if (TextUtils.isEmpty(PC5.LJIJJLI())) {
            C64028PAy.LIZ("APM-Config", "DeviceId not ready. try again later.");
            return;
        }
        if (this.LJLJJI.LIZJ == null) {
            if (C78248UnM.LJIIJ()) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("DeviceId ready. initConfig with device_id=");
                LIZ.append(PC5.LJIJJLI());
                C64028PAy.LIZ("APM-Config", X1D.LIZIZ(LIZ));
            }
            PCT pct = this.LJLJJI;
            if (pct.LJFF == null) {
                pct.LJFF = (IConfigManager) C171096nZ.LIZ(IConfigManager.class);
            }
            IConfigManager iConfigManager = pct.LJFF;
            if (iConfigManager != null) {
                String queryConfig = iConfigManager.queryConfig();
                if (C78248UnM.LJIIJ()) {
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("initConfig:");
                    LIZ2.append(queryConfig);
                    C64028PAy.LIZ("APM-Config", X1D.LIZIZ(LIZ2));
                }
                try {
                    if (!TextUtils.isEmpty(queryConfig)) {
                        pct.LIZLLL(new JSONObject(queryConfig), true);
                    }
                } catch (Exception unused) {
                }
            }
        } else if (C78248UnM.LJIIJ()) {
            C64028PAy.LIZ("APM-Config", "config is ready");
        }
        C64071PCp.LIZ(PD6.LIGHT_WEIGHT).LIZIZ(this.LJLJJI.LJ);
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PCS(PCT pct) {
        super(500L, 1000L);
        this.LJLJJI = pct;
    }
}
