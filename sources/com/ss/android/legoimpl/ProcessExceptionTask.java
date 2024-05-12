package com.ss.android.legoimpl;

import X.C09900aA;
import X.C0RN;
import X.EE1;
import X.EFD;
import X.EFK;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import android.content.Context;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class ProcessExceptionTask implements EE1 {
    public final EFD LJLIL;

    @Override // X.EEY
    public final String key() {
        return "ProcessExceptionTask";
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

    @Override // X.EEY
    public final EnumC36092EEm scenesType() {
        return EnumC36092EEm.DEFAULT;
    }

    @Override // X.EE1
    public final EFK type() {
        return EFK.BOOT_FINISH;
    }

    public ProcessExceptionTask(EFD efd) {
        this.LJLIL = efd;
    }

    @Override // X.EEY
    public final void run(Context context) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject.put("process_monitor_content", this.LJLIL.LIZ);
        jSONObject2.put("process_init_content", this.LJLIL.LIZIZ);
        C09900aA.LJI("process_init_event", jSONObject2, jSONObject, null);
    }
}
