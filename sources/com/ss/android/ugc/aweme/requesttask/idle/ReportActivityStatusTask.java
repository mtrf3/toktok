package com.ss.android.ugc.aweme.requesttask.idle;

import X.C09900aA;
import X.C0RN;
import X.C36922EeM;
import X.EE1;
import X.EFK;
import X.EJY;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import X.X1D;
import android.content.Context;
import android.os.Bundle;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class ReportActivityStatusTask implements EE1 {
    public final String LJLIL = "MainActivity";
    public final Bundle LJLILLLLZI;

    @Override // X.EEY
    public final String key() {
        return "ReportActivityStatusTask";
    }

    @Override // X.EEY
    public final /* synthetic */ boolean meetTrigger() {
        return true;
    }

    @Override // X.EEY
    public final /* synthetic */ String prefix() {
        return "task_";
    }

    @Override // X.EE1
    public final /* synthetic */ boolean serialExecute() {
        return false;
    }

    @Override // X.EEY
    public final /* synthetic */ int targetProcess() {
        return C0RN.LIZ();
    }

    @Override // X.EEY
    public final /* synthetic */ List triggerOtherLegoComponents() {
        return null;
    }

    @Override // X.EEY
    public final /* synthetic */ EnumC36103EEx triggerType() {
        return C0RN.LIZIZ(this);
    }

    @Override // X.EEY
    public final EnumC36092EEm scenesType() {
        return EnumC36092EEm.DEFAULT;
    }

    @Override // X.EE1
    public final EFK type() {
        return EFK.SPARSE;
    }

    public ReportActivityStatusTask(Bundle bundle) {
        this.LJLILLLLZI = bundle;
    }

    @Override // X.EEY
    public final void run(Context context) {
        boolean z;
        String str = this.LJLIL;
        int i = 1;
        if (this.LJLILLLLZI != null) {
            z = true;
        } else {
            z = false;
        }
        EJY ejy = new EJY(str, z);
        try {
            String str2 = ejy.LIZ;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("The activity is recovered by the system or config change:");
            LIZ.append(ejy.LIZIZ);
            C36922EeM.LIZLLL(4, str2, X1D.LIZIZ(LIZ));
            if (!ejy.LIZIZ) {
                i = 0;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("activity", ejy.LIZ);
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("");
            LIZ2.append(ejy.LIZIZ);
            jSONObject.put("activity_status", X1D.LIZIZ(LIZ2));
            C09900aA.LJIIJJI("activity_monitor", i, jSONObject);
        } catch (Throwable th) {
            C36922EeM.LJFF(th);
        }
    }
}
