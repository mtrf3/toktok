package com.ss.android.ugc.aweme.legoImp.task;

import X.C0RN;
import X.C47281Ih3;
import X.C47289IhB;
import X.EE1;
import X.EFK;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import X.IXN;
import android.content.Context;
import java.util.List;

/* loaded from: classes7.dex */
public class PlayerConfigInitTask implements EE1 {
    @Override // X.EEY
    public final String key() {
        return "PlayerConfigInitTask";
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
        if (((Boolean) C47289IhB.LIZ.getValue()).booleanValue()) {
            try {
                C47281Ih3.LJI(IXN.LIZJ.getPlayerType(), false, true);
            } catch (Exception unused) {
            }
        }
    }
}
