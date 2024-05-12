package com.ss.android.ugc.aweme.audiomode.legoimpl;

import X.C0RN;
import X.C47516Ikq;
import X.C47928IrU;
import X.EE1;
import X.EFK;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import android.content.Context;
import com.mammon.audiosdk.SAMICore;
import com.mammon.audiosdk.enums.SAMICoreContextType;
import com.mammon.audiosdk.structures.SAMICoreAbContext;
import java.util.List;

/* loaded from: classes9.dex */
public final class AudioSDKABLegoTask implements EE1 {
    @Override // X.EEY
    public final String key() {
        return "AudioSDKABLegoTask";
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
        return EFK.BACKGROUND;
    }

    @Override // X.EEY
    public final void run(Context context) {
        System.currentTimeMillis();
        if (C47516Ikq.LIZ) {
            SAMICoreAbContext.getInstance().init(new C47928IrU());
            SAMICore.InitContext(null, null, SAMICoreContextType.SAMICoreContextType_AbConfig, null);
        }
    }
}
