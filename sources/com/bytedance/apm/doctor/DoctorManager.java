package com.bytedance.apm.doctor;

import X.C64081PCz;
import X.C78915Uy7;
import X.PD0;
import X.PD1;
import X.PD2;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public class DoctorManager {
    public final List<ApmListener> LIZ = new ArrayList();

    /* loaded from: classes12.dex */
    public interface ApmListener {
        void onDataEvent(int i, String str, JSONObject jSONObject);

        void onEvent(String str, String str2);
    }

    public static DoctorManager getInstance() {
        return PD1.LIZ;
    }

    public final void LIZ(String str, JSONObject jSONObject) {
        if (C78915Uy7.LJIJJ(this.LIZ) || jSONObject == null) {
            return;
        }
        PD2.LIZ.LJII(new C64081PCz(jSONObject, str, new ArrayList(this.LIZ)));
    }

    public final void LIZIZ(String str, String str2) {
        if (C78915Uy7.LJIJJ(this.LIZ)) {
            return;
        }
        PD2.LIZ.LJII(new PD0(new ArrayList(this.LIZ), str, str2));
    }
}
