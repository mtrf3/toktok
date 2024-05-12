package com.ss.android.ugc.aweme.ml.api;

import X.IED;
import X.J4G;
import android.os.Bundle;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.Map;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public final class MLCommonServiceDefault extends MLCommonService {
    @Override // com.ss.android.ugc.aweme.ml.api.MLCommonService, com.ss.android.ugc.aweme.ml.api.IMLCommonService
    public void addCommonEventListener(String type, J4G j4g) {
        o.LJIIIZ(type, "type");
    }

    @Override // com.ss.android.ugc.aweme.ml.api.MLCommonService, com.ss.android.ugc.aweme.ml.api.IMLCommonService
    public void checkAndInit(int i) {
    }

    @Override // com.ss.android.ugc.aweme.ml.api.MLCommonService, com.ss.android.ugc.aweme.ml.api.IMLCommonService
    public IED getAwemeAdapter() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.ml.api.MLCommonService
    public void onAppLaunch() {
    }

    @Override // com.ss.android.ugc.aweme.ml.api.MLCommonService, com.ss.android.ugc.aweme.ml.api.IMLCommonService
    public void onBeforeLoadMore(String str) {
    }

    @Override // com.ss.android.ugc.aweme.ml.api.MLCommonService, com.ss.android.ugc.aweme.ml.api.IMLCommonService
    public void onPlayFinishFirst(Aweme aweme, String str) {
    }

    @Override // com.ss.android.ugc.aweme.ml.api.MLCommonService, com.ss.android.ugc.aweme.ml.api.IMLCommonService
    public void onPlayFirstFrame(Aweme aweme, String str) {
    }

    @Override // com.ss.android.ugc.aweme.ml.api.MLCommonService, com.ss.android.ugc.aweme.ml.api.IMLCommonService
    public void onPlayPause(Aweme aweme, String str, boolean z) {
    }

    @Override // com.ss.android.ugc.aweme.ml.api.MLCommonService, com.ss.android.ugc.aweme.ml.api.IMLCommonService
    public void onPlayPrepare(Aweme aweme, String str, IED ied) {
    }

    @Override // com.ss.android.ugc.aweme.ml.api.MLCommonService, com.ss.android.ugc.aweme.ml.api.IMLCommonService
    public void onPlayResume(Aweme aweme, String str) {
    }

    @Override // com.ss.android.ugc.aweme.ml.api.MLCommonService, com.ss.android.ugc.aweme.ml.api.IMLCommonService
    public void onPlayStop(String str, Aweme aweme, String str2) {
    }

    @Override // com.ss.android.ugc.aweme.ml.api.MLCommonService, com.ss.android.ugc.aweme.ml.api.IMLCommonService
    public void onPlayStopCallPlayTime(Aweme aweme, long j, String str) {
    }

    @Override // com.ss.android.ugc.aweme.ml.api.MLCommonService, com.ss.android.ugc.aweme.ml.api.IMLCommonService
    public void onViewPagerSelected(Aweme aweme, String str, int i, JSONObject jSONObject) {
    }

    @Override // com.ss.android.ugc.aweme.ml.api.MLCommonService
    public void removeCommonEventListener(String type, J4G j4g) {
        o.LJIIIZ(type, "type");
    }

    @Override // com.ss.android.ugc.aweme.ml.api.MLCommonService
    public void runInMainActivityOnCreate() {
    }

    @Override // com.ss.android.ugc.aweme.ml.api.MLCommonService
    public void runInMainActivityOnDestroy() {
    }

    @Override // com.ss.android.ugc.aweme.ml.api.MLCommonService, com.ss.android.ugc.aweme.ml.api.IMLCommonService
    public void traceMobClickEvent(String str, JSONObject jSONObject) {
    }

    @Override // com.ss.android.ugc.aweme.ml.api.MLCommonService, com.ss.android.ugc.aweme.ml.api.IMLCommonService
    public void traceMobClickEventBundle(String str, Bundle bundle) {
    }

    @Override // com.ss.android.ugc.aweme.ml.api.MLCommonService, com.ss.android.ugc.aweme.ml.api.IMLCommonService
    public void traceMobClickEventMap(String str, Map<String, String> map) {
    }
}
