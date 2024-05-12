package com.ss.android.legoimpl;

import X.C0RN;
import X.C58096Mr6;
import X.EE1;
import X.EFK;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import android.content.Context;
import com.ss.android.ugc.aweme.feed.ISurveyConfigService;
import com.ss.android.ugc.aweme.feed.survey.spi.SurveyConfigServiceImpl;
import java.util.List;

/* loaded from: classes7.dex */
public final class SurveyTask implements EE1 {
    @Override // X.EEY
    public final String key() {
        return "SurveyTask";
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
        ISurveyConfigService iSurveyConfigService;
        if (context != null) {
            Object LIZ = C58096Mr6.LIZ(ISurveyConfigService.class, false);
            if (LIZ != null) {
                iSurveyConfigService = (ISurveyConfigService) LIZ;
            } else {
                if (C58096Mr6.M0 == null) {
                    synchronized (ISurveyConfigService.class) {
                        if (C58096Mr6.M0 == null) {
                            C58096Mr6.M0 = new SurveyConfigServiceImpl();
                        }
                    }
                }
                iSurveyConfigService = C58096Mr6.M0;
            }
            iSurveyConfigService.LIZ();
        }
    }
}
