package com.ss.android.ugc.aweme.ml.api;

import X.C47322Ihi;
import X.InterfaceC48513J2f;
import com.ss.android.ugc.aweme.ml.ab.OneSmartDataTrackConfig;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class SmartDataTrackerServiceDefault extends SmartDataTrackerService {
    @Override // com.ss.android.ugc.aweme.ml.api.SmartDataTrackerService, com.ss.android.ugc.aweme.ml.api.ISmartDataTrackerService
    public void checkAndInit() {
    }

    @Override // com.ss.android.ugc.aweme.ml.api.SmartDataTrackerService, com.ss.android.ugc.aweme.ml.api.ISmartDataTrackerService
    public void collectDataWhenTriggerTargetEvent(String event) {
        o.LJIIIZ(event, "event");
    }

    @Override // com.ss.android.ugc.aweme.ml.api.SmartDataTrackerService, com.ss.android.ugc.aweme.ml.api.ISmartDataTrackerService
    public void configOneNewTrack(OneSmartDataTrackConfig oneSmartDataTrackConfig) {
    }

    @Override // com.ss.android.ugc.aweme.ml.api.SmartDataTrackerService, com.ss.android.ugc.aweme.ml.api.ISmartDataTrackerService
    public boolean enable(String str) {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.ml.api.SmartDataTrackerService, com.ss.android.ugc.aweme.ml.api.ISmartDataTrackerService
    public void onScenePredictCheckOrRun(String str, C47322Ihi c47322Ihi, InterfaceC48513J2f interfaceC48513J2f) {
    }

    @Override // com.ss.android.ugc.aweme.ml.api.SmartDataTrackerService
    public void onSceneRealCheckAndReport(String str, C47322Ihi c47322Ihi) {
    }

    @Override // com.ss.android.ugc.aweme.ml.api.SmartDataTrackerService
    public void putExtData(String str, String str2, String key, Object value) {
        o.LJIIIZ(key, "key");
        o.LJIIIZ(value, "value");
    }
}
