package com.ss.android.legoimpl;

import X.C0RN;
import X.C16880lQ;
import X.C36210EJa;
import X.C36211EJb;
import X.C36839Ed1;
import X.EE1;
import X.EF7;
import X.EFK;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import android.content.Context;
import com.ss.android.common.lib.AppLogNewUtils;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class BackgroundStartStatistics implements EE1 {
    @Override // X.EEY
    public final String key() {
        return "BackgroundStartStatistics";
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
        return EFK.BOOT_FINISH;
    }

    @Override // X.EEY
    public final void run(Context context) {
        C36210EJa.LIZ = System.currentTimeMillis();
        try {
            String LIZ = C36839Ed1.LIZ(EF7.LIZIZ());
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("status", "true");
            jSONObject.put("processName", LIZ);
            AppLogNewUtils.onEventV3("background_start", jSONObject);
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
        C36211EJb.LJFF.clear();
        C36211EJb.LIZIZ.clear();
    }
}
