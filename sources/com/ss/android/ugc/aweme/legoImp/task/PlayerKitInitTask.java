package com.ss.android.ugc.aweme.legoImp.task;

import X.AbstractC73672Svk;
import X.B92;
import X.C00F;
import X.C0RN;
import X.C1DG;
import X.C30591Hz;
import X.C34710Djm;
import X.C35211Drr;
import X.C35351Du7;
import X.C35871E5z;
import X.C38995FSd;
import X.C56662Kg;
import X.C73411SrX;
import X.C73775SxP;
import X.C84763XOl;
import X.EE1;
import X.EFK;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import X.FJ1;
import X.FKM;
import X.GFJ;
import X.IXB;
import X.InterfaceC46878IaY;
import X.T16;
import Y.AfS17S0001000_5;
import Y.AfS18S0001000_6;
import Y.AfS36S0101000_5;
import Y.AfS38S0000000_6;
import Y.IDRunnableS6S0101000;
import android.content.Context;
import com.bytedance.ies.ugc.aweme.plugin.service.IPluginService;
import com.ss.android.ugc.aweme.plugin.aab.AabPluginServiceImpl;
import com.ss.mediakit.medialoader.AVMDLDataLoader;
import com.ss.ttvideoengine.TTVideoEngine;
import java.util.List;
import java.util.Objects;

/* loaded from: classes7.dex */
public class PlayerKitInitTask implements EE1 {
    @Override // X.EEY
    public final String key() {
        return "PlayerKitInitTask";
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
        return 1;
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
        return EFK.BACKGROUND;
    }

    @Override // X.EEY
    public final void run(Context context) {
        C56662Kg.LIZ().LIZJ("method_init_player_kit_duration", false);
        if (((Boolean) C35351Du7.LIZIZ.getValue()).booleanValue()) {
            AVMDLDataLoader.initApplicationContext(FKM.LIZ());
            TTVideoEngine.LJLLLLLL(1501, 1);
        }
        if (((Boolean) C34710Djm.LJJJJZI.getValue()).booleanValue()) {
            TTVideoEngine.LJLLLLLL(737, 1);
        } else {
            TTVideoEngine.LJLLLLLL(737, 0);
        }
        if (TasksHolder.LJJII == null) {
            TasksHolder.LJJII = new ColdBootPreloadPlayerSoTask();
        }
        ColdBootPreloadPlayerSoTask coldBootPreloadPlayerSoTask = TasksHolder.LJJII;
        C56662Kg.LIZ().LJFF("cold_boot_start_to_feed_player", false);
        C56662Kg.LIZ().LIZJ("player_init_to_precreate", false);
        C56662Kg.LIZ().LIZJ("player_init_build_duration", false);
        IXB.LIZIZ = new FJ1();
        C73775SxP LJIILIIL = AbstractC73672Svk.LJJIZ(C84763XOl.LJFF(), C84763XOl.LJ()).LJJIJL(new GFJ()).LJJJ(T16.LIZ()).LJIILIIL();
        InterfaceC46878IaY LIZ = C1DG.LIZ();
        Objects.requireNonNull(LIZ);
        LJIILIIL.LJJJLIIL(new AfS36S0101000_5(3, LIZ, 65), new AfS17S0001000_5(2, 23));
        C38995FSd.LIZLLL().execute(new IDRunnableS6S0101000(10, coldBootPreloadPlayerSoTask, 31));
        C30591Hz.LJLIL = new B92();
        IPluginService LIZLLL = AabPluginServiceImpl.LIZLLL();
        if (C00F.LIZ(31744, 0, "enable_download_pcdn_so", true) == 1 && !LIZLLL.checkPluginInstalled("com.ss.android.ugc.aweme.player")) {
            C35871E5z.LIZ = (C73411SrX) C84763XOl.LJFF().LJJJJZI(new AfS18S0001000_6(1, 2));
        }
        C56662Kg.LIZ().LJFF("method_init_player_kit_duration", false);
        if (((Boolean) C35211Drr.LIZ.getValue()).booleanValue()) {
            C84763XOl.LJI().LJJJJZI(new AfS38S0000000_6(1));
        }
    }
}
