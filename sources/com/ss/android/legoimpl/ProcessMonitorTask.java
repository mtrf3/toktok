package com.ss.android.legoimpl;

import X.C09820a2;
import X.C09900aA;
import X.C0RN;
import X.C113554cx;
import X.C34309DdJ;
import X.C36839Ed1;
import X.C39033FTp;
import X.C39035FTr;
import X.C39036FTs;
import X.C39040FTw;
import X.C60903NvH;
import X.EE1;
import X.EF1;
import X.EF7;
import X.EFK;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import X.OSZ;
import android.content.Context;
import com.bytedance.keva.Keva;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class ProcessMonitorTask implements EE1 {
    public final Map<Integer, String> LJLIL = C113554cx.LJJLIIIIJ(new OSZ(0, "Cold_Boot_Begin"), new OSZ(1, "Cold_Boot_End"), new OSZ(2, "Cold_Boot_End_Short"), new OSZ(3, "Cold_Boot_End_Long"));

    @Override // X.EEY
    public final String key() {
        return "ProcessMonitorTask";
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
    public final int targetProcess() {
        return 16777215;
    }

    @Override // X.EEY
    public final /* synthetic */ List triggerOtherLegoComponents() {
        return null;
    }

    @Override // X.EEY
    public final /* synthetic */ EnumC36103EEx triggerType() {
        return C0RN.LIZIZ(this);
    }

    @Override // X.EE1
    public final EFK type() {
        if (((Boolean) C34309DdJ.LIZ.getValue()).booleanValue()) {
            return EFK.BOOT_FINISH;
        }
        return EFK.MAIN;
    }

    @Override // X.EEY
    public final EnumC36092EEm scenesType() {
        return EnumC36092EEm.DEFAULT;
    }

    @Override // X.EEY
    public final void run(Context context) {
        if (!C36839Ed1.LIZIZ(context)) {
            if (context != null) {
                C09820a2.LIZ(context);
                C39033FTp c39033FTp = new C39033FTp();
                try {
                    c39033FTp.LJFF.put("aid", EF7.LJIIIZ);
                } catch (JSONException unused) {
                }
                c39033FTp.LJI = new C39036FTs();
                c39033FTp.LJIILL = new C60903NvH();
                c39033FTp.LJIIJ = new C39040FTw();
                c39033FTp.LJIIL = C39035FTr.LJLIL;
                C09820a2.LIZIZ(c39033FTp.LIZ());
            }
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            StringBuilder sb = new StringBuilder();
            sb.append(C36839Ed1.LIZ(context));
            sb.append('_');
            Map<Integer, String> map = this.LJLIL;
            Object value = EF1.LIZ.getValue();
            o.LJIIIIZZ(value, "<get-MAIN_PROCESS_STATE_REPO>(...)");
            sb.append((String) ((LinkedHashMap) map).get(Integer.valueOf(((Keva) value).getInt("runstate", 0))));
            jSONObject2.put("process_name", sb.toString());
            C09900aA.LJI("control_process_init_event", jSONObject2, jSONObject, null);
        }
    }
}
