package com.ss.android.ugc.aweme.request_combine.task;

import X.C0RN;
import X.C35232DsC;
import X.C36089EEj;
import X.C36093EEn;
import X.C36165EHh;
import X.C36922EeM;
import X.C64920Pds;
import X.DXW;
import X.EE1;
import X.EEZ;
import X.EFN;
import X.EHL;
import X.EI5;
import X.EI9;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import X.EnumC36166EHi;
import X.FH5;
import android.content.Context;
import com.ss.android.ugc.aweme.notice.api.NoticeCountFetchManager$coldStartCombineRequest$1;
import com.ss.android.ugc.aweme.notice.api.ab.InboxNoticeCountStrategyExperiment;
import com.ss.android.ugc.aweme.request_combine.request.individual.FetchComplianceSettingRequest;
import com.ss.android.ugc.aweme.request_combine.request.individual.FetchLiveSettingRequest;
import com.ss.android.ugc.aweme.request_combine.request.individual.FetchShareSettingRequest;
import com.ss.android.ugc.aweme.request_combine.request.individual.FetchUnifiedSettingRequest;
import com.ss.android.ugc.aweme.request_combine.request.individual.FetchUserSettingRequest;
import com.ss.android.ugc.aweme.request_combine.request.p0.FetchCombineSettingRequest;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public abstract class BaseFetchCombineSettingsTask implements EE1 {
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

    @Override // X.EEY
    public final void run(Context context) {
        o.LJIIIZ(context, "context");
        C36165EHh.LIZ(EnumC36166EHi.FETCH_COMBINE_TASK_RUN);
        if (C64920Pds.LIZLLL(context)) {
            C36922EeM.LJ("FetchCombineSettingsTask");
            if (EI5.LIZ.LIZIZ()) {
                C36165EHh.LIZ(EnumC36166EHi.USE_SETTINGS_COMBINE_API);
                C36093EEn.LIZ.getClass();
                EHL ehl = new EHL();
                ehl.LIZLLL(new FetchCombineSettingRequest());
                if (((Boolean) DXW.LIZIZ.getValue()).booleanValue()) {
                    ehl.LIZLLL(new NoticeCountFetchManager$coldStartCombineRequest$1());
                }
                ehl.LIZJ();
                InboxNoticeCountStrategyExperiment.LIZ.getClass();
                if ((((InboxNoticeCountStrategyExperiment.MetaData) InboxNoticeCountStrategyExperiment.LIZJ.getValue()).strategy & 2) == 2) {
                    C36922EeM.LJ("FetchCombineSettingsTask delayUnreadCountAllProcess");
                    EEZ.LIZ(new EI9());
                    return;
                }
                return;
            }
            C36093EEn.LIZ.getClass();
            C36089EEj LJIIIZ = C36093EEn.LJIIIZ();
            if (!C35232DsC.LIZ()) {
                FH5.LIZIZ().getClass();
                LJIIIZ.LIZ(new FetchUnifiedSettingRequest(0));
            }
            LJIIIZ.LIZIZ(new FetchShareSettingRequest(), true);
            LJIIIZ.LIZIZ(new FetchUserSettingRequest(), true);
            LJIIIZ.LIZIZ(new NoticeCountFetchManager$coldStartCombineRequest$1(), true);
            LJIIIZ.LIZIZ(new FetchLiveSettingRequest(), true);
            LJIIIZ.LIZIZ(new FetchComplianceSettingRequest(EFN.IDLE), true);
            LJIIIZ.LIZJ();
        }
    }
}
