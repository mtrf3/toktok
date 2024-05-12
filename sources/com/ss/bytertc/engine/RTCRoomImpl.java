package com.ss.bytertc.engine;

import X.X1D;
import com.ss.bytertc.engine.audio.IRangeAudio;
import com.ss.bytertc.engine.audio.ISpatialAudio;
import com.ss.bytertc.engine.data.ForwardStreamInfo;
import com.ss.bytertc.engine.data.RemoteVideoConfig;
import com.ss.bytertc.engine.data.ReturnStatus;
import com.ss.bytertc.engine.data.StreamIndex;
import com.ss.bytertc.engine.engineimpl.RTCEngineImpl;
import com.ss.bytertc.engine.handler.IRTCRoomEventHandler;
import com.ss.bytertc.engine.handler.RTCRoomEventHandler;
import com.ss.bytertc.engine.live.ILiveTranscodingObserver;
import com.ss.bytertc.engine.live.LiveTranscoding;
import com.ss.bytertc.engine.live.LiveTranscodingObserver;
import com.ss.bytertc.engine.publicstream.PublicStreaming;
import com.ss.bytertc.engine.type.AudioSelectionPriority;
import com.ss.bytertc.engine.type.MediaStreamType;
import com.ss.bytertc.engine.type.MessageConfig;
import com.ss.bytertc.engine.type.PauseResumeControlMediaType;
import com.ss.bytertc.engine.type.SubscribeMediaType;
import com.ss.bytertc.engine.type.SubtitleConfig;
import com.ss.bytertc.engine.utils.LogUtil;
import com.ss.bytertc.engine.video.IPanoramicVideo;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* loaded from: classes33.dex */
public class RTCRoomImpl extends RTCRoom {
    public boolean mEnableTranscode;
    public final ReentrantReadWriteLock.ReadLock mJniReadLock;
    public final ReentrantReadWriteLock.WriteLock mJniWriteLock;
    public LiveTranscodingObserver mLiveJniObserver;
    public LiveTranscoding mLiveTranscoding;
    public ILiveTranscodingObserver mLiveTranscodingObserver;
    public long mNativeRtcRoom;
    public long mNativeRtcRoomEventHandler;
    public NativePanoramicVideo mPanoramicVideo;
    public PublicStreaming mPublicStreaming;
    public NativeRangeAudio mRangeAudio;
    public final ReentrantReadWriteLock mReadWriteLock;
    public String mRoom;
    public RTCRoomEventHandler mRtcRoomEventHandler;
    public IRTCRoomEventHandler mRtcRoomHandler;
    public NativeSpatialAudio mSpatialAudio;
    public String mUser;

    @Override // com.ss.bytertc.engine.RTCRoom
    public void destroy() {
        LogUtil.d("RtcRoom", "Destroy ");
        this.mJniWriteLock.lock();
        try {
            long j = this.mNativeRtcRoom;
            if (j == 0) {
                LogUtil.e("RtcRoom", "native rtcroom is invalid, Destroy failed.");
                return;
            }
            this.mNativeRtcRoom = 0L;
            this.mJniWriteLock.unlock();
            NativeRTCRoomFunctions.nativeDestory(j);
            NativeRTCRoomFunctions.nativeReleaseRTCRoomEventHandler(this.mNativeRtcRoomEventHandler);
            this.mNativeRtcRoomEventHandler = 0L;
        } finally {
            this.mJniWriteLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCRoom
    public IPanoramicVideo getPanoramicVideo() {
        LogUtil.d("RtcRoom", "getPanoramicVideo...");
        this.mJniReadLock.lock();
        try {
            long j = this.mNativeRtcRoom;
            NativePanoramicVideo nativePanoramicVideo = null;
            if (j == 0) {
                LogUtil.e("RtcRoom", "native rtcroom is invalid, getPanoramicVideo failed.");
            } else {
                NativePanoramicVideo nativePanoramicVideo2 = this.mPanoramicVideo;
                if (nativePanoramicVideo2 != null) {
                    return nativePanoramicVideo2;
                }
                long nativeGetPanoramicVideo = NativeRTCRoomFunctions.nativeGetPanoramicVideo(j);
                if (nativeGetPanoramicVideo == 0) {
                    LogUtil.e("RtcRoom", "getPanoramicVideo failed");
                } else {
                    nativePanoramicVideo = new NativePanoramicVideo(nativeGetPanoramicVideo);
                    this.mPanoramicVideo = nativePanoramicVideo;
                }
            }
            return nativePanoramicVideo;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCRoom
    public IRangeAudio getRangeAudio() {
        LogUtil.d("RtcRoom", "getRangeAudio...");
        this.mJniReadLock.lock();
        try {
            long j = this.mNativeRtcRoom;
            NativeRangeAudio nativeRangeAudio = null;
            if (j == 0) {
                LogUtil.e("RtcRoom", "native rtcroom is invalid, getRangeAudio failed.");
            } else {
                NativeRangeAudio nativeRangeAudio2 = this.mRangeAudio;
                if (nativeRangeAudio2 != null) {
                    return nativeRangeAudio2;
                }
                long nativeGetRangeAudio = NativeRTCRoomFunctions.nativeGetRangeAudio(j);
                if (nativeGetRangeAudio == 0) {
                    LogUtil.e("RtcRoom", "getRangeAudio failed");
                } else {
                    nativeRangeAudio = new NativeRangeAudio(nativeGetRangeAudio);
                    this.mRangeAudio = nativeRangeAudio;
                }
            }
            return nativeRangeAudio;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCRoom
    public String getRoomId() {
        String nativeGetRoomId;
        LogUtil.d("RtcRoom", "getRoomId");
        this.mJniReadLock.lock();
        try {
            long j = this.mNativeRtcRoom;
            if (j == 0) {
                LogUtil.e("RtcRoom", "native rtcroom is invalid, getRoomId failed.");
                nativeGetRoomId = "";
            } else {
                nativeGetRoomId = NativeRTCRoomFunctions.nativeGetRoomId(j);
            }
            return nativeGetRoomId;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCRoom
    public ISpatialAudio getSpatialAudio() {
        LogUtil.d("RtcRoom", "getSpatialAudio...");
        this.mJniReadLock.lock();
        try {
            long j = this.mNativeRtcRoom;
            NativeSpatialAudio nativeSpatialAudio = null;
            if (j == 0) {
                LogUtil.e("RtcRoom", "native rtcroom is invalid, getSpatialAudio failed.");
            } else {
                NativeSpatialAudio nativeSpatialAudio2 = this.mSpatialAudio;
                if (nativeSpatialAudio2 != null) {
                    return nativeSpatialAudio2;
                }
                long nativeGetSpatialAudio = NativeRTCRoomFunctions.nativeGetSpatialAudio(j);
                if (nativeGetSpatialAudio == 0) {
                    LogUtil.e("RtcRoom", "getSpatialAudio failed");
                } else {
                    nativeSpatialAudio = new NativeSpatialAudio(nativeGetSpatialAudio);
                    this.mSpatialAudio = nativeSpatialAudio;
                }
            }
            return nativeSpatialAudio;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCRoom
    public int leaveRoom() {
        int nativeLeaveRoom;
        LogUtil.d("RtcRoom", "leaveChannel");
        this.mJniReadLock.lock();
        try {
            long j = this.mNativeRtcRoom;
            if (j == 0) {
                LogUtil.e("RtcRoom", "native rtcroom is invalid, leaveChannel failed.");
                nativeLeaveRoom = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                this.mRoom = "";
                this.mUser = "";
                nativeLeaveRoom = NativeRTCRoomFunctions.nativeLeaveRoom(j);
            }
            return nativeLeaveRoom;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCRoom
    public int pauseForwardStreamToAllRooms() {
        int nativePauseForwardStreamToAllRooms;
        this.mJniReadLock.lock();
        try {
            long j = this.mNativeRtcRoom;
            if (j == 0) {
                LogUtil.e("RtcRoom", "native rtcroom is invalid, pauseForwardStreamToAllRooms failed.");
                nativePauseForwardStreamToAllRooms = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                nativePauseForwardStreamToAllRooms = NativeRTCRoomFunctions.nativePauseForwardStreamToAllRooms(j);
            }
            return nativePauseForwardStreamToAllRooms;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCRoom
    public int resumeForwardStreamToAllRooms() {
        int nativeResumeForwardStreamToAllRooms;
        this.mJniReadLock.lock();
        try {
            long j = this.mNativeRtcRoom;
            if (j == 0) {
                LogUtil.e("RtcRoom", "native rtcroom is invalid, resumeForwardStreamToAllRooms failed.");
                nativeResumeForwardStreamToAllRooms = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                nativeResumeForwardStreamToAllRooms = NativeRTCRoomFunctions.nativeResumeForwardStreamToAllRooms(j);
            }
            return nativeResumeForwardStreamToAllRooms;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCRoom
    public int stopCloudRendering() {
        this.mJniReadLock.lock();
        try {
            if (this.mNativeRtcRoom == 0) {
                LogUtil.e("RtcRoom", "native rtcroom is invalid, stopCloudRendering failed.");
                return ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            }
            String cloudRenderingInfo = RTCEngineImpl.getCloudRenderingInfo("stopped", "");
            if (cloudRenderingInfo == null) {
                this.mJniReadLock.unlock();
                return -1;
            }
            return NativeRTCRoomFunctions.nativeUpdateCloudRending(this.mNativeRtcRoom, cloudRenderingInfo);
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCRoom
    public int stopForwardStreamToRooms() {
        int nativeStopForwardStreamToRooms;
        this.mJniReadLock.lock();
        try {
            long j = this.mNativeRtcRoom;
            if (j == 0) {
                LogUtil.e("RtcRoom", "native rtcroom is invalid, stopForwardStreamToRooms failed.");
                nativeStopForwardStreamToRooms = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                nativeStopForwardStreamToRooms = NativeRTCRoomFunctions.nativeStopForwardStreamToRooms(j);
            }
            return nativeStopForwardStreamToRooms;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCRoom
    public int stopSubtitle() {
        LogUtil.d("RtcRoom", "stopSubtitle");
        long j = this.mNativeRtcRoom;
        if (j == 0) {
            LogUtil.e("RtcRoom", "native rtcroom is invalid, stopSubtitle failed.");
            return ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
        }
        return NativeRTCRoomFunctions.nativeStopSubtitle(j);
    }

    public long getNativeHandle() {
        return this.mNativeRtcRoom;
    }

    public IRTCRoomEventHandler getRtcRoomHandler() {
        return this.mRtcRoomHandler;
    }

    public String getmRoom() {
        return this.mRoom;
    }

    public String getmUser() {
        return this.mUser;
    }

    @Override // com.ss.bytertc.engine.RTCRoom
    public int enableSubscribeLocalStream(boolean z) {
        int nativeEnableSubscribeLocalStream;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("enableSubscribeLocalStream: ");
        LIZ.append(z);
        LogUtil.d("RtcRoom", X1D.LIZIZ(LIZ));
        this.mJniReadLock.lock();
        try {
            long j = this.mNativeRtcRoom;
            if (j == 0) {
                LogUtil.e("RtcRoom", "native rtcroom is invalid, EnableSubscribeLocalStream failed.");
                nativeEnableSubscribeLocalStream = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                nativeEnableSubscribeLocalStream = NativeRTCRoomFunctions.nativeEnableSubscribeLocalStream(j, z);
            }
            return nativeEnableSubscribeLocalStream;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCRoom
    public int pauseAllSubscribedStream(PauseResumeControlMediaType pauseResumeControlMediaType) {
        int nativePauseAllSubscribedStream;
        LogUtil.d("RtcRoom", "pauseAllSubscribedStream...");
        this.mJniReadLock.lock();
        try {
            long j = this.mNativeRtcRoom;
            if (j == 0) {
                LogUtil.e("RtcRoom", "native rtcroom is invalid, pauseAllSubscribedStream failed.");
                nativePauseAllSubscribedStream = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                nativePauseAllSubscribedStream = NativeRTCRoomFunctions.nativePauseAllSubscribedStream(j, pauseResumeControlMediaType.value());
            }
            return nativePauseAllSubscribedStream;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCRoom
    public int publishScreen(MediaStreamType mediaStreamType) {
        int nativePublishScreenWithMediaStreamType;
        LogUtil.d("RtcRoom", "publishScreen");
        this.mJniReadLock.lock();
        try {
            long j = this.mNativeRtcRoom;
            if (j == 0) {
                LogUtil.e("RtcRoom", "native rtcroom is invalid, publishScreen failed.");
                nativePublishScreenWithMediaStreamType = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                nativePublishScreenWithMediaStreamType = NativeRTCRoomFunctions.nativePublishScreenWithMediaStreamType(j, mediaStreamType.value);
            }
            return nativePublishScreenWithMediaStreamType;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCRoom
    public int publishStream(MediaStreamType mediaStreamType) {
        int nativePublishStream;
        LogUtil.d("RtcRoom", "publishStream");
        this.mJniReadLock.lock();
        try {
            long j = this.mNativeRtcRoom;
            if (j == 0) {
                LogUtil.e("RtcRoom", "native rtcroom is invalid, publishStream failed.\"");
                nativePublishStream = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                nativePublishStream = NativeRTCRoomFunctions.nativePublishStream(j, mediaStreamType.value);
            }
            return nativePublishStream;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCRoom
    public int resumeAllSubscribedStream(PauseResumeControlMediaType pauseResumeControlMediaType) {
        int nativeResumeAllSubscribedStream;
        LogUtil.d("RtcRoom", "resumeAllSubscribedStream...");
        this.mJniReadLock.lock();
        try {
            long j = this.mNativeRtcRoom;
            if (j == 0) {
                LogUtil.e("RtcRoom", "native rtcroom is invalid, resumeAllSubscribedStream failed.");
                nativeResumeAllSubscribedStream = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                nativeResumeAllSubscribedStream = NativeRTCRoomFunctions.nativeResumeAllSubscribedStream(j, pauseResumeControlMediaType.value());
            }
            return nativeResumeAllSubscribedStream;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCRoom
    public long sendRoomBinaryMessage(byte[] bArr) {
        LogUtil.d("RtcRoom", "SendRoomBinaryMessage ");
        this.mJniReadLock.lock();
        try {
            long j = this.mNativeRtcRoom;
            if (j == 0) {
                LogUtil.e("RtcRoom", "native rtcroom is invalid, SendRoomBinaryMessage failed.");
                this.mJniReadLock.unlock();
                return -1L;
            }
            return NativeRTCRoomFunctions.nativeSendRoomBinaryMessage(j, bArr);
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCRoom
    public long sendRoomMessage(String str) {
        LogUtil.d("RtcRoom", "SendRoomMessage ");
        this.mJniReadLock.lock();
        try {
            long j = this.mNativeRtcRoom;
            if (j == 0) {
                LogUtil.e("RtcRoom", "native rtcroom is invalid, SendRoomMessage failed.");
                this.mJniReadLock.unlock();
                return -1L;
            }
            return NativeRTCRoomFunctions.nativeSendRoomMessage(j, str);
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCRoom
    public int setAudioSelectionConfig(AudioSelectionPriority audioSelectionPriority) {
        long j = this.mNativeRtcRoom;
        if (j == 0) {
            LogUtil.e("RtcRoom", "native rtcroom is invalid, setAudioSelectionConfig failed.");
            return ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
        }
        return NativeRTCRoomFunctions.nativeSetAudioSelectionConfig(j, audioSelectionPriority.value());
    }

    @Override // com.ss.bytertc.engine.RTCRoom
    public int setMultiDeviceAVSync(String str) {
        int nativeSetMultiDeviceAVSync;
        LogUtil.d("RtcRoom", "setMultiDeviceAVSync ");
        this.mJniReadLock.lock();
        try {
            long j = this.mNativeRtcRoom;
            if (j == 0) {
                LogUtil.e("RtcRoom", "native rtcroom is invalid, setMultiDeviceAVSync failed.");
                nativeSetMultiDeviceAVSync = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                nativeSetMultiDeviceAVSync = NativeRTCRoomFunctions.nativeSetMultiDeviceAVSync(j, str);
            }
            return nativeSetMultiDeviceAVSync;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCRoom
    public int setRTCRoomEventHandler(IRTCRoomEventHandler iRTCRoomEventHandler) {
        this.mJniReadLock.lock();
        try {
            if (this.mNativeRtcRoom == 0) {
                LogUtil.e("RtcRoom", "native room is invalid, setRTCRoomEventHandler failed.");
                return ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            }
            this.mRtcRoomHandler = iRTCRoomEventHandler;
            RTCRoomEventHandler rTCRoomEventHandler = new RTCRoomEventHandler(this);
            this.mRtcRoomEventHandler = rTCRoomEventHandler;
            long j = this.mNativeRtcRoomEventHandler;
            this.mNativeRtcRoomEventHandler = NativeRTCRoomFunctions.nativeSetRTCRoomEventHandler(this.mNativeRtcRoom, rTCRoomEventHandler);
            if (j != 0) {
                NativeRTCRoomFunctions.nativeReleaseRTCRoomEventHandler(j);
            }
            this.mJniReadLock.unlock();
            return 0;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCRoom
    public int setRemoteRoomAudioPlaybackVolume(int i) {
        int nativeSetRemoteRoomAudioPlaybackVolume;
        this.mJniReadLock.lock();
        try {
            long j = this.mNativeRtcRoom;
            if (j == 0) {
                LogUtil.e("RtcRoom", "native rtcroom is invalid, setRemoteRoomAudioPlaybackVolume failed.");
                nativeSetRemoteRoomAudioPlaybackVolume = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                nativeSetRemoteRoomAudioPlaybackVolume = NativeRTCRoomFunctions.nativeSetRemoteRoomAudioPlaybackVolume(j, i);
            }
            return nativeSetRemoteRoomAudioPlaybackVolume;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCRoom
    public int setUserVisibility(boolean z) {
        int nativeSetUserVisibility;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setUserVisibility. enable : ");
        LIZ.append(z);
        LogUtil.d("RtcRoom", X1D.LIZIZ(LIZ));
        this.mJniReadLock.lock();
        try {
            long j = this.mNativeRtcRoom;
            if (j == 0) {
                LogUtil.e("RtcRoom", "native engine is invalid, setUserVisibility failed.");
                nativeSetUserVisibility = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                nativeSetUserVisibility = NativeRTCRoomFunctions.nativeSetUserVisibility(j, z);
            }
            return nativeSetUserVisibility;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCRoom
    public int startCloudRendering(String str) {
        this.mJniReadLock.lock();
        try {
            if (this.mNativeRtcRoom == 0) {
                LogUtil.e("RtcRoom", "native rtcroom is invalid, startCloudRendering failed.");
                return ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            }
            String cloudRenderingInfo = RTCEngineImpl.getCloudRenderingInfo("started", str);
            if (cloudRenderingInfo == null) {
                this.mJniReadLock.unlock();
                return -1;
            }
            return NativeRTCRoomFunctions.nativeUpdateCloudRending(this.mNativeRtcRoom, cloudRenderingInfo);
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCRoom
    public int startForwardStreamToRooms(List<ForwardStreamInfo> list) {
        int nativeStartForwardStreamToRooms;
        this.mJniReadLock.lock();
        try {
            if (this.mNativeRtcRoom == 0) {
                LogUtil.e("RtcRoom", "native rtcroom is invalid, startForwardStreamToRooms failed.");
                nativeStartForwardStreamToRooms = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else if (list == null) {
                nativeStartForwardStreamToRooms = ReturnStatus.RETURN_STATUS_PARAMETER_ERR.value();
            } else {
                LinkedList linkedList = new LinkedList();
                Iterator<ForwardStreamInfo> it = list.iterator();
                while (it.hasNext()) {
                    linkedList.add(new InternalForwardStreamInfo(it.next()));
                }
                nativeStartForwardStreamToRooms = NativeRTCRoomFunctions.nativeStartForwardStreamToRooms(this.mNativeRtcRoom, linkedList);
            }
            return nativeStartForwardStreamToRooms;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCRoom
    public int startSubtitle(SubtitleConfig subtitleConfig) {
        LogUtil.d("RtcRoom", "startSubtitle");
        long j = this.mNativeRtcRoom;
        if (j == 0 || subtitleConfig == null) {
            LogUtil.e("RtcRoom", "native rtcroom or config is invalid, startSubtitle failed.");
            return ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
        }
        return NativeRTCRoomFunctions.nativeStartSubtitle(j, subtitleConfig.mode.value(), subtitleConfig.targetLanguage);
    }

    @Override // com.ss.bytertc.engine.RTCRoom
    public int subscribeAllStreams(MediaStreamType mediaStreamType) {
        int nativeSubscribeAllStreamsWithMediaStreamType;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("subscribeStream, MediaStreamType:");
        LIZ.append(mediaStreamType);
        LogUtil.d("RtcRoom", X1D.LIZIZ(LIZ));
        this.mJniReadLock.lock();
        try {
            long j = this.mNativeRtcRoom;
            if (j == 0) {
                LogUtil.e("RtcRoom", "native engine is invalid, subscribeAllStreams failed.");
                nativeSubscribeAllStreamsWithMediaStreamType = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                nativeSubscribeAllStreamsWithMediaStreamType = NativeRTCRoomFunctions.nativeSubscribeAllStreamsWithMediaStreamType(j, mediaStreamType.value);
            }
            return nativeSubscribeAllStreamsWithMediaStreamType;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCRoom
    public int unpublishScreen(MediaStreamType mediaStreamType) {
        int nativeUnpublishScreenWithMediaStreamType;
        this.mJniReadLock.lock();
        try {
            long j = this.mNativeRtcRoom;
            if (j == 0) {
                LogUtil.e("RtcRoom", "native rtcroom is invalid, unpublishScreen failed.");
                nativeUnpublishScreenWithMediaStreamType = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                nativeUnpublishScreenWithMediaStreamType = NativeRTCRoomFunctions.nativeUnpublishScreenWithMediaStreamType(j, mediaStreamType.value);
            }
            return nativeUnpublishScreenWithMediaStreamType;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCRoom
    public int unpublishStream(MediaStreamType mediaStreamType) {
        int nativeUnpublishStream;
        LogUtil.d("RtcRoom", "unpublishStream");
        this.mJniReadLock.lock();
        try {
            long j = this.mNativeRtcRoom;
            if (j == 0) {
                LogUtil.e("RtcRoom", "native unpublishStream is invalid");
                nativeUnpublishStream = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                nativeUnpublishStream = NativeRTCRoomFunctions.nativeUnpublishStream(j, mediaStreamType.value);
            }
            return nativeUnpublishStream;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCRoom
    public int unsubscribeAllStreams(MediaStreamType mediaStreamType) {
        int nativeUnsubscribeAllStreamsWithMediaStreamType;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("unsubscribeAllStreams MediaStreamType:");
        LIZ.append(mediaStreamType);
        LogUtil.d("RtcRoom", X1D.LIZIZ(LIZ));
        this.mJniReadLock.lock();
        try {
            long j = this.mNativeRtcRoom;
            if (j == 0) {
                LogUtil.e("RtcRoom", "native engine is invalid, subscribeStream failed.");
                nativeUnsubscribeAllStreamsWithMediaStreamType = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                nativeUnsubscribeAllStreamsWithMediaStreamType = NativeRTCRoomFunctions.nativeUnsubscribeAllStreamsWithMediaStreamType(j, mediaStreamType.value);
            }
            return nativeUnsubscribeAllStreamsWithMediaStreamType;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCRoom
    public int updateCloudRendering(String str) {
        this.mJniReadLock.lock();
        try {
            if (this.mNativeRtcRoom == 0) {
                LogUtil.e("RtcRoom", "native rtcroom is invalid, updateCloudRendering failed.");
                return ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            }
            String cloudRenderingInfo = RTCEngineImpl.getCloudRenderingInfo("changed", str);
            if (cloudRenderingInfo == null) {
                this.mJniReadLock.unlock();
                return -1;
            }
            return NativeRTCRoomFunctions.nativeUpdateCloudRending(this.mNativeRtcRoom, cloudRenderingInfo);
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCRoom
    public int updateForwardStreamToRooms(List<ForwardStreamInfo> list) {
        int nativeUpdateForwardStreamToRooms;
        this.mJniReadLock.lock();
        try {
            if (this.mNativeRtcRoom == 0) {
                LogUtil.e("RtcRoom", "native rtcroom is invalid, updateForwardStreamToRooms failed.");
                nativeUpdateForwardStreamToRooms = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else if (list == null) {
                nativeUpdateForwardStreamToRooms = ReturnStatus.RETURN_STATUS_PARAMETER_ERR.value();
            } else {
                LinkedList linkedList = new LinkedList();
                Iterator<ForwardStreamInfo> it = list.iterator();
                while (it.hasNext()) {
                    linkedList.add(new InternalForwardStreamInfo(it.next()));
                }
                nativeUpdateForwardStreamToRooms = NativeRTCRoomFunctions.nativeUpdateForwardStreamToRooms(this.mNativeRtcRoom, linkedList);
            }
            return nativeUpdateForwardStreamToRooms;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCRoom
    public int updateToken(String str) {
        int nativeUpdateToken;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("updateToken. token : ");
        LIZ.append(str);
        LogUtil.d("RtcRoom", X1D.LIZIZ(LIZ));
        this.mJniReadLock.lock();
        try {
            long j = this.mNativeRtcRoom;
            if (j == 0) {
                LogUtil.e("RtcRoom", "native rtcroom is invalid, updateToken failed.");
                nativeUpdateToken = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                nativeUpdateToken = NativeRTCRoomFunctions.nativeUpdateToken(j, str);
            }
            return nativeUpdateToken;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public RTCRoomImpl(String str, long j) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.mReadWriteLock = reentrantReadWriteLock;
        this.mJniReadLock = reentrantReadWriteLock.readLock();
        this.mJniWriteLock = reentrantReadWriteLock.writeLock();
        this.mNativeRtcRoom = j;
        this.mRoom = str;
        this.mLiveJniObserver = new LiveTranscodingObserver();
    }

    @Override // com.ss.bytertc.engine.RTCRoom
    public int setRemoteVideoConfig(String str, RemoteVideoConfig remoteVideoConfig) {
        int nativeSetRemoteVideoConfig;
        LogUtil.d("RtcRoom", "setRemoteVideoConfig");
        this.mJniReadLock.lock();
        try {
            long j = this.mNativeRtcRoom;
            if (j == 0) {
                LogUtil.e("RtcRoom", "native rtcroom is invalid,setRemoteVideoConfig failed.\"");
                nativeSetRemoteVideoConfig = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                nativeSetRemoteVideoConfig = NativeRTCRoomFunctions.nativeSetRemoteVideoConfig(j, str, remoteVideoConfig.getWidth(), remoteVideoConfig.getHeight(), remoteVideoConfig.getFrameRate());
            }
            return nativeSetRemoteVideoConfig;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCRoom
    public long setRoomExtraInfo(String str, String str2) {
        if (str == null) {
            return -2L;
        }
        if (str2 == null) {
            return -3L;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setRoomExtraInfo,key : ");
        LIZ.append(str);
        LIZ.append(", value");
        LIZ.append(str2);
        LogUtil.d("RtcRoom", X1D.LIZIZ(LIZ));
        long j = this.mNativeRtcRoom;
        if (j == 0) {
            LogUtil.e("RtcRoom", "native rtcroom is invalid, setRoomExtraInfo failed.");
            return -1L;
        }
        return NativeRTCRoomFunctions.nativeSetRoomExtraInfo(j, str, str2);
    }

    @Override // com.ss.bytertc.engine.RTCRoom
    public int subscribeScreen(String str, MediaStreamType mediaStreamType) {
        int nativeSubscribeScreenWithMediaStreamType;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("subscribeScreen: ");
        LIZ.append(str);
        LIZ.append(", MediaStreamType:");
        LIZ.append(mediaStreamType);
        LogUtil.d("RtcRoom", X1D.LIZIZ(LIZ));
        this.mJniReadLock.lock();
        try {
            long j = this.mNativeRtcRoom;
            if (j == 0) {
                LogUtil.e("RtcRoom", "native engine is invalid, subscribeScreen failed.");
                nativeSubscribeScreenWithMediaStreamType = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                nativeSubscribeScreenWithMediaStreamType = NativeRTCRoomFunctions.nativeSubscribeScreenWithMediaStreamType(j, str, mediaStreamType.value);
            }
            return nativeSubscribeScreenWithMediaStreamType;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCRoom
    public int subscribeStream(String str, MediaStreamType mediaStreamType) {
        int nativeSubscribeStreamWithMediaStreamType;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("subscribeStream: ");
        LIZ.append(str);
        LIZ.append(", MediaStreamType:");
        LIZ.append(mediaStreamType);
        LogUtil.d("RtcRoom", X1D.LIZIZ(LIZ));
        this.mJniReadLock.lock();
        try {
            long j = this.mNativeRtcRoom;
            if (j == 0) {
                LogUtil.e("RtcRoom", "native engine is invalid, subscribeStream failed.");
                nativeSubscribeStreamWithMediaStreamType = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                nativeSubscribeStreamWithMediaStreamType = NativeRTCRoomFunctions.nativeSubscribeStreamWithMediaStreamType(j, str, mediaStreamType.value);
            }
            return nativeSubscribeStreamWithMediaStreamType;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCRoom
    public int unsubscribeScreen(String str, MediaStreamType mediaStreamType) {
        int nativeUnsubscribeScreenWithMediaStreamType;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("unsubscribeScreen: ");
        LIZ.append(str);
        LIZ.append(", MediaStreamType:");
        LIZ.append(mediaStreamType);
        LogUtil.d("RtcRoom", X1D.LIZIZ(LIZ));
        this.mJniReadLock.lock();
        try {
            long j = this.mNativeRtcRoom;
            if (j == 0) {
                LogUtil.e("RtcRoom", "native engine is invalid, subscribeStream failed.");
                nativeUnsubscribeScreenWithMediaStreamType = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                nativeUnsubscribeScreenWithMediaStreamType = NativeRTCRoomFunctions.nativeUnsubscribeScreenWithMediaStreamType(j, str, mediaStreamType.value);
            }
            return nativeUnsubscribeScreenWithMediaStreamType;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCRoom
    public int unsubscribeStream(String str, MediaStreamType mediaStreamType) {
        int nativeUnsubscribeStreamWithMediaStreamType;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("unsubscribeStream: ");
        LIZ.append(str);
        LIZ.append(", MediaStreamType:");
        LIZ.append(mediaStreamType);
        LogUtil.d("RtcRoom", X1D.LIZIZ(LIZ));
        this.mJniReadLock.lock();
        try {
            long j = this.mNativeRtcRoom;
            if (j == 0) {
                LogUtil.e("RtcRoom", "native engine is invalid, subscribeStream failed.");
                nativeUnsubscribeStreamWithMediaStreamType = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                nativeUnsubscribeStreamWithMediaStreamType = NativeRTCRoomFunctions.nativeUnsubscribeStreamWithMediaStreamType(j, str, mediaStreamType.value);
            }
            return nativeUnsubscribeStreamWithMediaStreamType;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCRoom
    public int joinRoom(String str, UserInfo userInfo, RTCRoomConfig rTCRoomConfig) {
        String uid;
        int nativeJoinRoomWithRoomConfig;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("joinRoom with token: ");
        LIZ.append(str);
        LIZ.append(",room");
        LIZ.append(this.mRoom);
        LIZ.append(" and uid: ");
        if (userInfo == null) {
            uid = "";
        } else {
            uid = userInfo.getUid();
        }
        LIZ.append(uid);
        LogUtil.d("RtcRoom", X1D.LIZIZ(LIZ));
        this.mJniReadLock.lock();
        try {
            if (this.mNativeRtcRoom == 0) {
                LogUtil.e("RtcRoom", "native room is invalid, joinRoom failed.");
                nativeJoinRoomWithRoomConfig = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else if (userInfo == null) {
                nativeJoinRoomWithRoomConfig = ReturnStatus.RETURN_STATUS_PARAMETER_ERR.value();
            } else if (str == null) {
                nativeJoinRoomWithRoomConfig = ReturnStatus.RETURN_STATUS_PARAMETER_ERR.value();
            } else {
                this.mUser = userInfo.getUid();
                nativeJoinRoomWithRoomConfig = NativeRTCRoomFunctions.nativeJoinRoomWithRoomConfig(this.mNativeRtcRoom, str, userInfo, rTCRoomConfig);
            }
            return nativeJoinRoomWithRoomConfig;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCRoom
    public long sendUserBinaryMessage(String str, byte[] bArr, MessageConfig messageConfig) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SendUserBinaryMessage. uid : ");
        LIZ.append(str);
        LIZ.append(", message length:");
        LIZ.append(bArr.length);
        LogUtil.d("RtcRoom", X1D.LIZIZ(LIZ));
        this.mJniReadLock.lock();
        try {
            long j = this.mNativeRtcRoom;
            if (j == 0) {
                LogUtil.e("RtcRoom", "native rtcroom is invalid, SendUserBinaryMessage failed.");
                this.mJniReadLock.unlock();
                return -1L;
            }
            return NativeRTCRoomFunctions.nativeSendUserBinaryMessage(j, str, bArr, messageConfig.value());
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCRoom
    public long sendUserMessage(String str, String str2, MessageConfig messageConfig) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SendUserMessage. uid : ");
        LIZ.append(str);
        LIZ.append(", message");
        LIZ.append(str2);
        LogUtil.d("RtcRoom", X1D.LIZIZ(LIZ));
        this.mJniReadLock.lock();
        try {
            long j = this.mNativeRtcRoom;
            if (j == 0) {
                LogUtil.e("RtcRoom", "native rtcroom is invalid, SendUserMessage failed.");
                this.mJniReadLock.unlock();
                return -1L;
            }
            return NativeRTCRoomFunctions.nativeSendUserMessage(j, str, str2, messageConfig.value());
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCRoom
    public int subscribeUserStream(String str, StreamIndex streamIndex, SubscribeMediaType subscribeMediaType, SubscribeVideoConfig subscribeVideoConfig) {
        boolean z;
        int value;
        this.mJniReadLock.lock();
        try {
            if (streamIndex == StreamIndex.STREAM_INDEX_SCREEN) {
                z = true;
            } else {
                z = false;
            }
            long j = this.mNativeRtcRoom;
            if (j == 0) {
                LogUtil.e("RtcRoom", "native engine is invalid, subscribeStream failed.");
                value = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else if (subscribeVideoConfig != null) {
                value = NativeRTCRoomFunctions.nativeSubscribeUserStream(j, str, z, subscribeMediaType.value(), subscribeVideoConfig.getVideoIndex(), subscribeVideoConfig.getPriority());
            } else {
                value = ReturnStatus.RETURN_STATUS_PARAMETER_ERR.value();
            }
            return value;
        } finally {
            this.mJniReadLock.unlock();
        }
    }
}
