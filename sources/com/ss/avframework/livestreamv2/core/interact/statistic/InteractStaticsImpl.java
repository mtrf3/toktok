package com.ss.avframework.livestreamv2.core.interact.statistic;

import android.content.Context;
import com.ss.avframework.livestreamv2.core.interact.model.Config;
import com.ss.avframework.livestreamv2.core.interact.model.InteractConfig;
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
public class InteractStaticsImpl implements IInteractStatics {
    public final boolean mEnableInteractDurationCheck;
    public final boolean mEnableProcStatics;
    public final boolean mEnableRemoteUserStatics;
    public LocalUserStatistics mLocalUserStatistics;
    public ProcInfoStatistics mProcInfoStatistics;
    public RemoteUserStatistics mRemoteUserStatistics;

    private LocalUserInteractConnectionStatisticInfo getInteractConnectionStatistic() {
        if (!this.mEnableInteractDurationCheck) {
            return null;
        }
        return this.mLocalUserStatistics.getInteractConnectionStatistic();
    }

    @Override // com.ss.avframework.livestreamv2.core.interact.statistic.IInteractStatics
    public ProcInfoStatistics.ProcInfo getProcInfo() {
        ProcInfoStatistics procInfoStatistics = this.mProcInfoStatistics;
        if (procInfoStatistics != null) {
            return procInfoStatistics.getProcInfo();
        }
        return null;
    }

    @Override // com.ss.avframework.livestreamv2.core.interact.statistic.IInteractStatics
    public Map<String, RemoteUserStatistics.RemoteUserInfo> getRemoteStatisticResult() {
        RemoteUserStatistics remoteUserStatistics = this.mRemoteUserStatistics;
        if (remoteUserStatistics != null) {
            return remoteUserStatistics.getStatisticResult();
        }
        return null;
    }

    @Override // com.ss.avframework.livestreamv2.core.interact.statistic.IInteractStatics
    public Map<String, List<RemoteUserStatistics.VideoFrozenInfo>> getRemoteVideoFrozenInfo() {
        RemoteUserStatistics remoteUserStatistics = this.mRemoteUserStatistics;
        if (remoteUserStatistics != null) {
            return remoteUserStatistics.getVideoFrozenInfo();
        }
        return null;
    }

    @Override // com.ss.avframework.livestreamv2.core.interact.statistic.IInteractStatics
    public Map<String, Integer> getVideoE2EDelayMSec() {
        RemoteUserStatistics remoteUserStatistics = this.mRemoteUserStatistics;
        if (remoteUserStatistics != null) {
            return remoteUserStatistics.getVideoDelayAvgMSec();
        }
        return null;
    }

    @Override // com.ss.avframework.livestreamv2.core.interact.statistic.IInteractStatics
    public void calcDurationFromInteractToLive() {
        LocalUserInteractConnectionStatisticInfo interactConnectionStatistic = getInteractConnectionStatistic();
        if (interactConnectionStatistic != null) {
            interactConnectionStatistic.calcDurationFromInteractToLive();
        }
    }

    @Override // com.ss.avframework.livestreamv2.core.interact.statistic.IInteractStatics
    public void calcDurationFromLiveToInteract() {
        LocalUserInteractConnectionStatisticInfo interactConnectionStatistic = getInteractConnectionStatistic();
        if (interactConnectionStatistic != null) {
            interactConnectionStatistic.calcDurationFromLiveToInteract();
        }
    }

    @Override // com.ss.avframework.livestreamv2.core.interact.statistic.IInteractStatics
    public void setInteractStartTime() {
        LocalUserInteractConnectionStatisticInfo interactConnectionStatistic = getInteractConnectionStatistic();
        if (interactConnectionStatistic != null) {
            interactConnectionStatistic.setInteractStartTime();
        }
    }

    @Override // com.ss.avframework.livestreamv2.core.interact.statistic.IInteractStatics
    public void setInteractStopTime() {
        LocalUserInteractConnectionStatisticInfo interactConnectionStatistic = getInteractConnectionStatistic();
        if (interactConnectionStatistic != null) {
            interactConnectionStatistic.setInteractStopTime();
        }
    }

    @Override // com.ss.avframework.livestreamv2.core.interact.statistic.IInteractStatics
    public void addRemoteUser(String str) {
        RemoteUserStatistics remoteUserStatistics = this.mRemoteUserStatistics;
        if (remoteUserStatistics != null) {
            remoteUserStatistics.addUser(str);
        }
    }

    @Override // com.ss.avframework.livestreamv2.core.interact.statistic.IInteractStatics
    public void getInteractConnectDurationInfo(long[] jArr) {
        LocalUserInteractConnectionStatisticInfo interactConnectionStatistic = getInteractConnectionStatistic();
        if (interactConnectionStatistic != null) {
            jArr[0] = interactConnectionStatistic.switchFromLiveToInteract;
            jArr[1] = interactConnectionStatistic.switchFromInteractToLive;
        }
    }

    @Override // com.ss.avframework.livestreamv2.core.interact.statistic.IInteractStatics
    public LocalUserStatistics.LocalUserStatisticInfo getLocalStatisticResult(LiveCore liveCore) {
        LocalUserStatistics localUserStatistics = this.mLocalUserStatistics;
        if (localUserStatistics != null) {
            return localUserStatistics.getStatisticResult(liveCore);
        }
        return null;
    }

    @Override // com.ss.avframework.livestreamv2.core.interact.statistic.IInteractStatics
    public void onLocalAudioStats(LocalAudioStats localAudioStats) {
        LocalUserStatistics localUserStatistics = this.mLocalUserStatistics;
        if (localUserStatistics != null) {
            localUserStatistics.onLocalAudioStats(localAudioStats);
        }
    }

    @Override // com.ss.avframework.livestreamv2.core.interact.statistic.IInteractStatics
    public void onLocalNetworkQuality(int i) {
        LocalUserStatistics localUserStatistics = this.mLocalUserStatistics;
        if (localUserStatistics != null) {
            localUserStatistics.onLocalNetworkQuality(i);
        }
    }

    @Override // com.ss.avframework.livestreamv2.core.interact.statistic.IInteractStatics
    public void onLocalRtcStats(RTCRoomStats rTCRoomStats) {
        LocalUserStatistics localUserStatistics = this.mLocalUserStatistics;
        if (localUserStatistics != null) {
            localUserStatistics.onRtcStats(rTCRoomStats);
        }
    }

    @Override // com.ss.avframework.livestreamv2.core.interact.statistic.IInteractStatics
    public void onLocalVideoStats(LocalVideoStats localVideoStats) {
        LocalUserStatistics localUserStatistics = this.mLocalUserStatistics;
        if (localUserStatistics != null) {
            localUserStatistics.onLocalVideoStats(localVideoStats);
        }
    }

    @Override // com.ss.avframework.livestreamv2.core.interact.statistic.IInteractStatics
    public void onRemoteAudioStats(RemoteStreamStats remoteStreamStats) {
        RemoteUserStatistics remoteUserStatistics = this.mRemoteUserStatistics;
        if (remoteUserStatistics != null) {
            remoteUserStatistics.onRemoteAudioStats(remoteStreamStats);
        }
    }

    @Override // com.ss.avframework.livestreamv2.core.interact.statistic.IInteractStatics
    public void onRemoteVideoRendered(String str) {
        RemoteUserStatistics remoteUserStatistics = this.mRemoteUserStatistics;
        if (remoteUserStatistics != null) {
            remoteUserStatistics.onRemoteVideoRendered(str);
        }
    }

    @Override // com.ss.avframework.livestreamv2.core.interact.statistic.IInteractStatics
    public void onRemoteVideoStats(RemoteStreamStats remoteStreamStats) {
        RemoteUserStatistics remoteUserStatistics = this.mRemoteUserStatistics;
        if (remoteUserStatistics != null) {
            remoteUserStatistics.onRemoteVideoStats(remoteStreamStats);
        }
    }

    @Override // com.ss.avframework.livestreamv2.core.interact.statistic.IInteractStatics
    public void removeRemoteUser(String str) {
        RemoteUserStatistics remoteUserStatistics = this.mRemoteUserStatistics;
        if (remoteUserStatistics != null) {
            remoteUserStatistics.removeUser(str);
        }
    }

    public InteractStaticsImpl(Context context, InteractConfig interactConfig) {
        boolean z;
        this.mEnableInteractDurationCheck = interactConfig.isEnableInteractConnectionStatics();
        boolean isEnableRemoteUserStatics = interactConfig.isEnableRemoteUserStatics();
        this.mEnableRemoteUserStatics = isEnableRemoteUserStatics;
        boolean isEnableProcStatics = interactConfig.isEnableProcStatics();
        this.mEnableProcStatics = isEnableProcStatics;
        if (interactConfig.getMixStreamType() == Config.MixStreamType.SERVER_MIX || interactConfig.getMixStreamType() == Config.MixStreamType.NONE) {
            z = true;
        } else {
            z = false;
        }
        this.mLocalUserStatistics = new LocalUserStatistics(z);
        if (isEnableRemoteUserStatics) {
            RemoteUserStatistics remoteUserStatistics = new RemoteUserStatistics();
            this.mRemoteUserStatistics = remoteUserStatistics;
            remoteUserStatistics.setVideoFrozenLimitMSec(interactConfig.getVideoFrozenLimitMSec());
        }
        if (isEnableProcStatics) {
            this.mProcInfoStatistics = new ProcInfoStatistics(context);
        }
    }

    @Override // com.ss.avframework.livestreamv2.core.interact.statistic.IInteractStatics
    public void onLocalVideoSourceFrame(int i, int i2) {
        LocalUserStatistics localUserStatistics = this.mLocalUserStatistics;
        if (localUserStatistics != null) {
            localUserStatistics.onVideoSourceFrame(i, i2, 0L);
        }
    }

    @Override // com.ss.avframework.livestreamv2.core.interact.statistic.IInteractStatics
    public void onRemoteAudioVolumeIndication(RemoteAudioPropertiesInfo[] remoteAudioPropertiesInfoArr, int i) {
        RemoteUserStatistics remoteUserStatistics = this.mRemoteUserStatistics;
        if (remoteUserStatistics != null) {
            remoteUserStatistics.onAudioVolumeIndication(remoteAudioPropertiesInfoArr, i);
        }
    }

    @Override // com.ss.avframework.livestreamv2.core.interact.statistic.IInteractStatics
    public void onRemoteVideoStateChanged(String str, RemoteVideoState remoteVideoState, RemoteVideoStateChangeReason remoteVideoStateChangeReason) {
        RemoteUserStatistics remoteUserStatistics = this.mRemoteUserStatistics;
        if (remoteUserStatistics != null) {
            remoteUserStatistics.onRemoteVideoStateChanged(str, remoteVideoState, remoteVideoStateChangeReason);
        }
    }

    @Override // com.ss.avframework.livestreamv2.core.interact.statistic.IInteractStatics
    public void onVideoE2EDelayInfo(String str, long j, long j2) {
        RemoteUserStatistics remoteUserStatistics = this.mRemoteUserStatistics;
        if (remoteUserStatistics != null) {
            remoteUserStatistics.onVideoDelayInfo(str, (int) (j2 - j));
        }
    }
}
