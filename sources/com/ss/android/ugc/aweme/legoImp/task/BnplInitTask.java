package com.ss.android.ugc.aweme.legoImp.task;

import X.C0RN;
import X.C113554cx;
import X.C19N;
import X.EE1;
import X.EFK;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import X.FMX;
import X.OSZ;
import android.content.Context;
import com.ss.android.ugc.aweme.pipo.PipoService;
import java.util.List;
import kotlin.jvm.internal.AqS17S0000100_6;

/* loaded from: classes7.dex */
public final class BnplInitTask implements EE1 {
    @Override // X.EEY
    public final String key() {
        return "BnplInitTask";
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
        if (!PipoService.LJ().LIZJ() && C19N.LJ("ec_bnpl_preload_switch", false)) {
            long currentTimeMillis = System.currentTimeMillis();
            FMX.LJIIL("rd_pipo_bnpl_df_download_start", C113554cx.LJJLIIIIJ(new OSZ("bnpl_source_id", "init_task"), new OSZ("download_scene", "initTask")));
            PipoService.LJ().LIZIZ(new AqS17S0000100_6(currentTimeMillis, 0));
        }
    }
}
