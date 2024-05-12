package com.ss.android.ugc.aweme.legoImp.task;

import X.C0RN;
import X.C38423F6d;
import X.EE1;
import X.EFK;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import X.FIU;
import android.content.Context;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import java.util.List;

/* loaded from: classes7.dex */
public final class PitayaInitTask implements EE1 {
    @Override // X.EEY
    public final String key() {
        return "PitayaInitTask";
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
        C38423F6d.LIZ.initPitaya(null);
        ILiveOuterService LJJJLL = LiveOuterService.LJJJLL();
        if (LJJJLL.LJJIJIIJI()) {
            LJJJLL.LJJIJIL().LJLLI();
        } else {
            LJJJLL.LJFF(new FIU(LJJJLL));
        }
    }
}
