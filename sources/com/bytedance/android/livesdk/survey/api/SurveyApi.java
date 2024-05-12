package com.bytedance.android.livesdk.survey.api;

import X.AbstractC73672Svk;
import X.C28467BFf;
import X.E8L;
import X.E8M;
import X.InterfaceC195757mF;
import X.InterfaceC36229EJt;
import X.InterfaceC64986Pew;
import com.bytedance.android.livesdk.survey.model.SurveyData;
import java.util.HashMap;

/* loaded from: classes6.dex */
public interface SurveyApi {
    @E8L("/webcast/room/survey/list/")
    AbstractC73672Svk<C28467BFf<SurveyData>> list(@InterfaceC64986Pew("room_id") long j, @InterfaceC64986Pew("survey_version") long j2);

    @E8M("/webcast/room/survey/submit/")
    @InterfaceC195757mF
    AbstractC73672Svk<C28467BFf<Void>> submit(@InterfaceC36229EJt HashMap<String, Object> hashMap);
}
