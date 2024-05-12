package com.ss.avframework.livestreamv2.core.interact.statistic;

import com.ss.bytertc.engine.data.RemoteAudioPropertiesInfo;
import com.ss.bytertc.engine.type.RemoteAudioStats;
import com.ss.bytertc.engine.type.RemoteStreamStats;
import com.ss.bytertc.engine.type.RemoteVideoState;
import com.ss.bytertc.engine.type.RemoteVideoStateChangeReason;
import com.ss.bytertc.engine.type.RemoteVideoStats;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes12.dex */
public class RemoteUserStatistics extends HashMap<String, RemoteUserInfo> {
    public int mVideoFrozenLimitMSec = 200;

    /* loaded from: classes12.dex */
    public class RemoteUserInfo {
        public int audioBitrate;
        public int audioDelay;
        public int audioLossRate;
        public int audioVoiceVolume;
        public long lastStatTimestamp;
        public long lastVfRenderedTimeMSec;
        public int videoBitrate;
        public int videoDecodeFps;
        public boolean videoDisabled;
        public int videoHeight;
        public int videoLossRate;
        public int videoRenderFps;
        public int videoRenderFrameCount;
        public int videoWidth;
        public List<VideoFrozenInfo> videoFrozenInfoList = new ArrayList();
        public List<Integer> videoDelayListMSec = new ArrayList();

        /* renamed from: clone, reason: merged with bridge method [inline-methods] */
        public RemoteUserInfo m199clone() {
            List<Integer> list;
            RemoteUserInfo remoteUserInfo = new RemoteUserInfo();
            remoteUserInfo.videoWidth = this.videoWidth;
            remoteUserInfo.videoHeight = this.videoHeight;
            remoteUserInfo.videoBitrate = this.videoBitrate;
            remoteUserInfo.videoDecodeFps = this.videoDecodeFps;
            remoteUserInfo.videoRenderFps = this.videoRenderFps;
            remoteUserInfo.videoLossRate = this.videoLossRate;
            remoteUserInfo.audioBitrate = this.audioBitrate;
            remoteUserInfo.audioDelay = this.audioDelay;
            remoteUserInfo.audioLossRate = this.audioLossRate;
            remoteUserInfo.audioVoiceVolume = this.audioVoiceVolume;
            remoteUserInfo.lastStatTimestamp = this.lastStatTimestamp;
            remoteUserInfo.videoRenderFrameCount = this.videoRenderFrameCount;
            remoteUserInfo.videoDisabled = this.videoDisabled;
            List<VideoFrozenInfo> list2 = this.videoFrozenInfoList;
            if (list2 != null && remoteUserInfo.videoFrozenInfoList != null) {
                for (VideoFrozenInfo videoFrozenInfo : list2) {
                    remoteUserInfo.videoFrozenInfoList.add(new VideoFrozenInfo(videoFrozenInfo.getDurationMSec(), videoFrozenInfo.getReason()));
                }
            }
            List<Integer> list3 = this.videoDelayListMSec;
            if (list3 != null && (list = remoteUserInfo.videoDelayListMSec) != null) {
                list.addAll(list3);
            }
            return remoteUserInfo;
        }

        public RemoteUserInfo() {
        }
    }

    public synchronized Map<String, RemoteUserInfo> getStatisticResult() {
        HashMap hashMap;
        long j;
        int i;
        hashMap = new HashMap();
        long currentTimeMillis = System.currentTimeMillis();
        for (Map.Entry<String, RemoteUserInfo> entry : entrySet()) {
            String key = entry.getKey();
            RemoteUserInfo value = entry.getValue();
            long j2 = value.lastStatTimestamp;
            if (j2 != 0 && currentTimeMillis > j2) {
                j = currentTimeMillis - j2;
            } else {
                j = 0;
            }
            if (j <= 0) {
                i = 0;
            } else {
                i = (int) ((value.videoRenderFrameCount * 1000.0d) / j);
            }
            value.videoRenderFps = i;
            hashMap.put(key, value.m199clone());
            value.videoBitrate = 0;
            value.videoDecodeFps = 0;
            value.videoRenderFps = 0;
            value.videoLossRate = 0;
            value.audioBitrate = 0;
            value.audioDelay = 0;
            value.audioLossRate = 0;
            value.audioVoiceVolume = 0;
            value.lastStatTimestamp = currentTimeMillis;
            value.videoRenderFrameCount = 0;
            value.videoDisabled = false;
        }
        return hashMap;
    }

    public synchronized Map<String, Integer> getVideoDelayAvgMSec() {
        HashMap hashMap;
        int i;
        hashMap = new HashMap();
        for (Map.Entry<String, RemoteUserInfo> entry : entrySet()) {
            String key = entry.getKey();
            RemoteUserInfo value = entry.getValue();
            Iterator<Integer> it = value.videoDelayListMSec.iterator();
            int i2 = 0;
            while (it.hasNext()) {
                i2 += it.next().intValue();
            }
            if (value.videoDelayListMSec.size() > 0) {
                i = i2 / value.videoDelayListMSec.size();
            } else {
                i = -1;
            }
            hashMap.put(key, Integer.valueOf(i));
            value.videoDelayListMSec.clear();
        }
        return hashMap;
    }

    public synchronized Map<String, List<VideoFrozenInfo>> getVideoFrozenInfo() {
        HashMap hashMap;
        hashMap = new HashMap();
        for (Map.Entry<String, RemoteUserInfo> entry : entrySet()) {
            String key = entry.getKey();
            RemoteUserInfo value = entry.getValue();
            ArrayList arrayList = new ArrayList();
            for (VideoFrozenInfo videoFrozenInfo : value.videoFrozenInfoList) {
                arrayList.add(new VideoFrozenInfo(videoFrozenInfo.getDurationMSec(), videoFrozenInfo.getReason()));
            }
            hashMap.put(key, arrayList);
            value.videoFrozenInfoList.clear();
        }
        return hashMap;
    }

    /* loaded from: classes12.dex */
    public class VideoFrozenInfo {
        public int durationMSec;
        public int reason;

        public int getDurationMSec() {
            return this.durationMSec;
        }

        public int getReason() {
            return this.reason;
        }

        public void setDurationMSec(int i) {
            this.durationMSec = i;
        }

        public void setReason(int i) {
            this.reason = i;
        }

        public VideoFrozenInfo(int i, int i2) {
            this.durationMSec = i;
            this.reason = i2;
        }
    }

    public synchronized void addUser(String str) {
        super.put(str, new RemoteUserInfo());
    }

    public synchronized void onRemoteAudioStats(RemoteStreamStats remoteStreamStats) {
        if (remoteStreamStats != null) {
            RemoteUserInfo remoteUserInfo = get(remoteStreamStats.uid);
            if (remoteUserInfo != null) {
                RemoteAudioStats remoteAudioStats = remoteStreamStats.audioStats;
                remoteUserInfo.audioBitrate = (int) remoteAudioStats.receivedKBitrate;
                remoteUserInfo.audioDelay = (int) remoteAudioStats.e2eDelay;
                remoteUserInfo.audioLossRate = (int) (remoteAudioStats.audioLossRate * 100.0f);
            }
        }
    }

    public synchronized void onRemoteVideoRendered(String str) {
        RemoteUserInfo remoteUserInfo = get(str);
        if (remoteUserInfo != null) {
            remoteUserInfo.videoRenderFrameCount++;
            long currentTimeMillis = System.currentTimeMillis();
            long j = remoteUserInfo.lastVfRenderedTimeMSec;
            int i = (int) (currentTimeMillis - j);
            if (j > 0 && i > this.mVideoFrozenLimitMSec) {
                remoteUserInfo.videoFrozenInfoList.add(new VideoFrozenInfo(i, 0));
            }
            if (!remoteUserInfo.videoDisabled) {
                remoteUserInfo.lastVfRenderedTimeMSec = currentTimeMillis;
            }
        }
    }

    public synchronized void onRemoteVideoStats(RemoteStreamStats remoteStreamStats) {
        if (remoteStreamStats != null) {
            RemoteUserInfo remoteUserInfo = get(remoteStreamStats.uid);
            if (remoteUserInfo != null) {
                RemoteVideoStats remoteVideoStats = remoteStreamStats.videoStats;
                remoteUserInfo.videoWidth = remoteVideoStats.width;
                remoteUserInfo.videoHeight = remoteVideoStats.height;
                remoteUserInfo.videoBitrate = (int) remoteVideoStats.receivedKBitrate;
                remoteUserInfo.videoDecodeFps = remoteVideoStats.decoderOutputFrameRate;
                remoteUserInfo.videoLossRate = (int) (remoteVideoStats.videoLossRate * 100.0f);
            }
        }
    }

    public synchronized void removeUser(String str) {
        super.remove(str);
    }

    public void setVideoFrozenLimitMSec(int i) {
        this.mVideoFrozenLimitMSec = i;
    }

    public synchronized void onAudioVolumeIndication(RemoteAudioPropertiesInfo[] remoteAudioPropertiesInfoArr, int i) {
        if (remoteAudioPropertiesInfoArr != null) {
            for (RemoteAudioPropertiesInfo remoteAudioPropertiesInfo : remoteAudioPropertiesInfoArr) {
                RemoteUserInfo remoteUserInfo = get(remoteAudioPropertiesInfo.streamKey.getUserId());
                if (remoteUserInfo != null) {
                    remoteUserInfo.audioVoiceVolume = remoteAudioPropertiesInfo.audioPropertiesInfo.linearVolume;
                }
            }
        }
    }

    public synchronized void onVideoDelayInfo(String str, int i) {
        RemoteUserInfo remoteUserInfo = get(str);
        if (remoteUserInfo != null) {
            remoteUserInfo.videoDelayListMSec.add(Integer.valueOf(i));
        }
    }

    public synchronized void onRemoteVideoStateChanged(String str, RemoteVideoState remoteVideoState, RemoteVideoStateChangeReason remoteVideoStateChangeReason) {
        RemoteUserInfo remoteUserInfo = get(str);
        if (remoteUserInfo != null) {
            if (RemoteVideoState.REMOTE_VIDEO_STATE_STOPPED == remoteVideoState) {
                long currentTimeMillis = System.currentTimeMillis();
                long j = remoteUserInfo.lastVfRenderedTimeMSec;
                int i = (int) (currentTimeMillis - j);
                if (j > 0 && i > this.mVideoFrozenLimitMSec) {
                    remoteUserInfo.videoFrozenInfoList.add(new VideoFrozenInfo(i, 1));
                }
                remoteUserInfo.lastVfRenderedTimeMSec = -1L;
                remoteUserInfo.videoDisabled = true;
            } else {
                remoteUserInfo.videoDisabled = false;
            }
        }
    }

    public synchronized void onRemoteAudioTransportStats(String str, int i, int i2, int i3) {
    }

    public synchronized void onRemoteVideoTransportStats(String str, int i, int i2, int i3) {
    }
}
