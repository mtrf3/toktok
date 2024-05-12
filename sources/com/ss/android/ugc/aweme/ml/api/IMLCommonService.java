package com.ss.android.ugc.aweme.ml.api;

import X.IED;
import X.J4G;
import android.os.Bundle;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public interface IMLCommonService {
    void addCommonEventListener(String str, J4G j4g);

    void checkAndInit(int i);

    IED getAwemeAdapter();

    void onBeforeLoadMore(String str);

    void onPlayFinishFirst(Aweme aweme, String str);

    void onPlayFirstFrame(Aweme aweme, String str);

    void onPlayPause(Aweme aweme, String str, boolean z);

    void onPlayPrepare(Aweme aweme, String str, IED ied);

    void onPlayResume(Aweme aweme, String str);

    void onPlayStop(String str, Aweme aweme, String str2);

    void onPlayStopCallPlayTime(Aweme aweme, long j, String str);

    void onViewPagerSelected(Aweme aweme, String str, int i, JSONObject jSONObject);

    void traceMobClickEvent(String str, JSONObject jSONObject);

    void traceMobClickEventBundle(String str, Bundle bundle);

    void traceMobClickEventMap(String str, Map<String, String> map);
}
