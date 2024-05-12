package com.ss.android.ugc.aweme.ml.api;

import X.C47322Ihi;
import X.C48580J4u;
import X.C48582J4w;
import X.InterfaceC48513J2f;
import com.ss.android.ugc.aweme.ml.ab.OneSmartDataTrackConfig;

/* loaded from: classes9.dex */
public abstract class SmartDataTrackerService implements ISmartDataTrackerService {
    public static final C48582J4w Companion = new C48582J4w();
    public static final boolean debug = false;

    @Override // com.ss.android.ugc.aweme.ml.api.ISmartDataTrackerService
    public abstract /* synthetic */ void checkAndInit();

    @Override // com.ss.android.ugc.aweme.ml.api.ISmartDataTrackerService
    public abstract /* synthetic */ void collectDataWhenTriggerTargetEvent(String str);

    @Override // com.ss.android.ugc.aweme.ml.api.ISmartDataTrackerService
    public abstract /* synthetic */ void configOneNewTrack(OneSmartDataTrackConfig oneSmartDataTrackConfig);

    @Override // com.ss.android.ugc.aweme.ml.api.ISmartDataTrackerService
    public abstract /* synthetic */ boolean enable(String str);

    @Override // com.ss.android.ugc.aweme.ml.api.ISmartDataTrackerService
    public abstract /* synthetic */ void onScenePredictCheckOrRun(String str, C47322Ihi c47322Ihi, InterfaceC48513J2f interfaceC48513J2f);

    public abstract /* synthetic */ void onSceneRealCheckAndReport(String str, C47322Ihi c47322Ihi);

    public abstract /* synthetic */ void putExtData(String str, String str2, String str3, Object obj);

    public static final boolean getDebug() {
        Companion.getClass();
        return debug;
    }

    public static final ISmartDataTrackerService instance() {
        Companion.getClass();
        return C48580J4u.LIZ;
    }
}
