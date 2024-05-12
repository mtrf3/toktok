package com.ss.android.ugc.aweme.video.config;

import X.C46999IcV;
import X.C47282Ih4;
import X.EnumC47177IfN;
import X.ITZ;
import X.IXY;
import X.IY2;
import X.InterfaceC46770IXe;
import X.InterfaceC46771IXf;
import X.InterfaceC46772IXg;
import X.InterfaceC46774IXi;
import X.InterfaceC46867IaN;
import android.content.Context;
import com.ss.android.ugc.playerkit.simapicommon.model.SimVideo;
import com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public interface ISimPlayerConfig {
    InterfaceC46770IXe createAudioUrlProcessor();

    InterfaceC46771IXf createSubUrlProcessor();

    IY2 createVideoUrlProcessor();

    boolean disableSleepResume(String str);

    void downloadFile(String str, String str2, String str3, String str4);

    boolean enableByteVc1FailCheckCountPolicy();

    boolean enableFileIoOpt(String str);

    boolean enableForceUseH264CheckPolicy();

    boolean enableForceUseH264Global();

    int getAverageSpeedInKBps();

    InterfaceC46772IXg getBindCpuCore();

    IXY getDashProcessUrlData(String str, boolean z, long j);

    C46999IcV getISimPlayerPlaySessionConfig(boolean z);

    C47282Ih4 getPlayerConfig(ITZ itz, boolean z, boolean z2);

    int getPlayerType();

    InterfaceC46774IXi getPreRenderConfig();

    IXY getProcessUrlData(SimVideoUrlModel simVideoUrlModel, String str);

    EnumC47177IfN getProperResolution(String str, InterfaceC46867IaN interfaceC46867IaN);

    int getTTPlayerPlan();

    String getThumbCacheDir(Context context);

    SimVideoUrlModel getVideoPlayAddr(SimVideo simVideo, ITZ itz);

    boolean isCache(SimVideoUrlModel simVideoUrlModel);

    boolean isCacheAboveOrComplete(SimVideoUrlModel simVideoUrlModel, int i);

    boolean isHttpsVideoUrlModel(SimVideoUrlModel simVideoUrlModel);

    boolean isPlayerPreferchCaption();

    boolean isPlayerPreferchTtsAudio();

    boolean isPluginApplied();

    void onRecordFirstFrameTime(String str, long j, String str2, boolean z, int i);

    void onRecordFirstFrameTime(String str, long j, String str2, boolean z, boolean z2);

    void onRecordPrepareTime(String str, long j, String str2, boolean z, int i);

    void onRecordPrepareTime(String str, long j, String str2, boolean z, boolean z2);

    boolean perfEventEnabled();

    boolean perfEventEnabledInPlayRequest();

    void recordMiscLog(Context context, String str, JSONObject jSONObject);
}
