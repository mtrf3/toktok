package com.ss.android.ugc.aweme.legoImp.task;

import X.C0RN;
import X.C58096Mr6;
import X.EE1;
import X.EFK;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import android.content.Context;
import com.ss.android.ugc.aweme.inferenceengine.IInferenceEngineService;
import com.ss.android.ugc.aweme.ml.common.ClientAiInitServiceImpl;
import java.util.List;

/* loaded from: classes7.dex */
public class InferenceEngineTask implements EE1 {
    @Override // X.EEY
    public final String key() {
        return "InferenceEngineTask";
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
        return EFK.MAIN;
    }

    @Override // X.EEY
    public final void run(Context context) {
        IInferenceEngineService iInferenceEngineService;
        Object LIZ = C58096Mr6.LIZ(IInferenceEngineService.class, false);
        if (LIZ != null) {
            iInferenceEngineService = (IInferenceEngineService) LIZ;
        } else {
            if (C58096Mr6.N2 == null) {
                synchronized (IInferenceEngineService.class) {
                    if (C58096Mr6.N2 == null) {
                        C58096Mr6.N2 = new ClientAiInitServiceImpl();
                    }
                }
            }
            iInferenceEngineService = C58096Mr6.N2;
        }
        iInferenceEngineService.init(context);
    }
}
