package com.ss.android.ugc.aweme.ml.api;

import X.C47322Ihi;
import X.InterfaceC48513J2f;
import com.ss.android.ugc.aweme.ml.ab.OneSmartDataTrackConfig;

/* loaded from: classes9.dex */
public interface ISmartDataTrackerService {
    void checkAndInit();

    void collectDataWhenTriggerTargetEvent(String str);

    void configOneNewTrack(OneSmartDataTrackConfig oneSmartDataTrackConfig);

    boolean enable(String str);

    void onScenePredictCheckOrRun(String str, C47322Ihi c47322Ihi, InterfaceC48513J2f interfaceC48513J2f);
}
