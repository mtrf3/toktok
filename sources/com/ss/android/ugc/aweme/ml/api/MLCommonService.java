package com.ss.android.ugc.aweme.ml.api;

import X.C46433IKf;
import X.C46434IKg;
import X.IED;
import X.J4G;
import android.os.Bundle;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public abstract class MLCommonService implements IMLCommonService {
    public static final C46433IKf Companion = new C46433IKf();
    public static final boolean debug = false;

    @Override // com.ss.android.ugc.aweme.ml.api.IMLCommonService
    public abstract /* synthetic */ void addCommonEventListener(String str, J4G j4g);

    @Override // com.ss.android.ugc.aweme.ml.api.IMLCommonService
    public abstract /* synthetic */ void checkAndInit(int i);

    @Override // com.ss.android.ugc.aweme.ml.api.IMLCommonService
    public abstract /* synthetic */ IED getAwemeAdapter();

    public abstract /* synthetic */ void onAppLaunch();

    @Override // com.ss.android.ugc.aweme.ml.api.IMLCommonService
    public abstract /* synthetic */ void onBeforeLoadMore(String str);

    @Override // com.ss.android.ugc.aweme.ml.api.IMLCommonService
    public abstract /* synthetic */ void onPlayFinishFirst(Aweme aweme, String str);

    @Override // com.ss.android.ugc.aweme.ml.api.IMLCommonService
    public abstract /* synthetic */ void onPlayFirstFrame(Aweme aweme, String str);

    @Override // com.ss.android.ugc.aweme.ml.api.IMLCommonService
    public abstract /* synthetic */ void onPlayPause(Aweme aweme, String str, boolean z);

    @Override // com.ss.android.ugc.aweme.ml.api.IMLCommonService
    public abstract /* synthetic */ void onPlayPrepare(Aweme aweme, String str, IED ied);

    @Override // com.ss.android.ugc.aweme.ml.api.IMLCommonService
    public abstract /* synthetic */ void onPlayResume(Aweme aweme, String str);

    @Override // com.ss.android.ugc.aweme.ml.api.IMLCommonService
    public abstract /* synthetic */ void onPlayStop(String str, Aweme aweme, String str2);

    @Override // com.ss.android.ugc.aweme.ml.api.IMLCommonService
    public abstract /* synthetic */ void onPlayStopCallPlayTime(Aweme aweme, long j, String str);

    @Override // com.ss.android.ugc.aweme.ml.api.IMLCommonService
    public abstract /* synthetic */ void onViewPagerSelected(Aweme aweme, String str, int i, JSONObject jSONObject);

    public abstract /* synthetic */ void removeCommonEventListener(String str, J4G j4g);

    public abstract /* synthetic */ void runInMainActivityOnCreate();

    public abstract /* synthetic */ void runInMainActivityOnDestroy();

    @Override // com.ss.android.ugc.aweme.ml.api.IMLCommonService
    public abstract /* synthetic */ void traceMobClickEvent(String str, JSONObject jSONObject);

    @Override // com.ss.android.ugc.aweme.ml.api.IMLCommonService
    public abstract /* synthetic */ void traceMobClickEventBundle(String str, Bundle bundle);

    @Override // com.ss.android.ugc.aweme.ml.api.IMLCommonService
    public abstract /* synthetic */ void traceMobClickEventMap(String str, Map<String, String> map);

    public static final boolean getDebug() {
        Companion.getClass();
        return debug;
    }

    public static final IMLCommonService instance() {
        Companion.getClass();
        return C46434IKg.LIZ;
    }
}
