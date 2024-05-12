package com.ss.android.ugc.aweme.simreporter.service;

import X.C46554IOw;
import X.C46648ISm;
import X.IGP;
import X.IL9;
import X.IPA;
import X.ISM;
import X.IT2;
import com.ss.android.ugc.aweme.playereventreporter.VideoInfo;
import com.ss.android.ugc.aweme.simreporter.api.ISimReporterConfig;
import java.util.HashMap;
import java.util.concurrent.Callable;

/* loaded from: classes9.dex */
public interface IPlayerEventReportService {
    public static final IL9 LIZ = IL9.LIZ;

    void initConfig(ISimReporterConfig iSimReporterConfig);

    void reportPlayFailed(String str, Callable<IPA> callable, HashMap<String, Object> hashMap, Callable<HashMap<String, Object>> callable2, boolean z);

    void reportRenderFirstFrame(String str, Callable<IT2> callable, HashMap<String, Object> hashMap, Callable<HashMap<String, Object>> callable2, boolean z);

    void reportSeekEnd(String str);

    void reportSeekStart(String str, double d);

    void reportVideoBuffering(String str, boolean z, boolean z2, Callable<C46554IOw> callable);

    void reportVideoOnResume(String str, VideoInfo videoInfo);

    void reportVideoPause(String str, IGP igp);

    void reportVideoPause(String str, Callable<C46554IOw> callable, IGP igp);

    void reportVideoPlayStart(String str, Callable<ISM> callable);

    void reportVideoPlaying(String str);

    void reportVideoStop(String str, Callable<C46648ISm> callable, HashMap<String, Object> hashMap, Callable<HashMap<String, Object>> callable2, boolean z);
}
