package com.ss.avframework.livestreamv2.core.interact.statistic;

import com.ss.avframework.livestreamv2.core.interact.statistic.LocalUserStatistics;
import com.ss.avframework.livestreamv2.core.interact.statistic.ProcInfoStatistics;
import com.ss.avframework.livestreamv2.core.interact.statistic.RemoteUserStatistics;
import com.ss.bytertc.engine.data.RemoteAudioPropertiesInfo;
import com.ss.bytertc.engine.type.LocalAudioStats;
import com.ss.bytertc.engine.type.LocalVideoStats;
import com.ss.bytertc.engine.type.RTCRoomStats;
import com.ss.bytertc.engine.type.RemoteStreamStats;
import com.ss.bytertc.engine.type.RemoteVideoState;
import com.ss.bytertc.engine.type.RemoteVideoStateChangeReason;
import com.ss.ttlivestreamer.livestreamv2.core.LiveCore;
import java.util.List;
import java.util.Map;

/* loaded from: classes12.dex */
public interface IInteractStatics {
    void addRemoteUser(String str);

    void calcDurationFromInteractToLive();

    void calcDurationFromLiveToInteract();

    void getInteractConnectDurationInfo(long[] jArr);

    LocalUserStatistics.LocalUserStatisticInfo getLocalStatisticResult(LiveCore liveCore);

    ProcInfoStatistics.ProcInfo getProcInfo();

    Map<String, RemoteUserStatistics.RemoteUserInfo> getRemoteStatisticResult();

    Map<String, List<RemoteUserStatistics.VideoFrozenInfo>> getRemoteVideoFrozenInfo();

    Map<String, Integer> getVideoE2EDelayMSec();

    void onLocalAudioStats(LocalAudioStats localAudioStats);

    void onLocalNetworkQuality(int i);

    void onLocalRtcStats(RTCRoomStats rTCRoomStats);

    void onLocalVideoSourceFrame(int i, int i2);

    void onLocalVideoStats(LocalVideoStats localVideoStats);

    void onRemoteAudioStats(RemoteStreamStats remoteStreamStats);

    void onRemoteAudioVolumeIndication(RemoteAudioPropertiesInfo[] remoteAudioPropertiesInfoArr, int i);

    void onRemoteVideoRendered(String str);

    void onRemoteVideoStateChanged(String str, RemoteVideoState remoteVideoState, RemoteVideoStateChangeReason remoteVideoStateChangeReason);

    void onRemoteVideoStats(RemoteStreamStats remoteStreamStats);

    void onVideoE2EDelayInfo(String str, long j, long j2);

    void removeRemoteUser(String str);

    void setInteractStartTime();

    void setInteractStopTime();
}
