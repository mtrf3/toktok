package com.ss.avframework.livestreamv2.core.interact.model;

import X.C16880lQ;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.ss.avframework.livestreamv2.core.interact.Client;

/* loaded from: classes12.dex */
public class InteractConfig extends Config {
    public String mBackgroundColor;
    public String mCreateClientStack;
    public boolean mEnableInteractConnectionStatics;
    public boolean mEnableProcStatics;
    public boolean mMixStreamConfigIndependent;
    public String mMixStreamUrl;
    public Client.StreamMixer mMixer;
    public String mRtcABTestConfig;
    public boolean mRtcClientMixUseOriginStream;
    public int mRtcSyncClientAudioMixLengthMs;
    public int mRtcSyncQueueLengthMs;
    public boolean mRtcUseVideoRangeDefault;
    public UrlDispatcher mUrlDispatcher;
    public boolean mEnableRemoteUserStatics = true;
    public int mVideoFrozenLimitMSec = 200;
    public boolean mEnableVideoBFrameOnMixStream = true;

    /* loaded from: classes12.dex */
    public interface UrlDispatcher {
        String urlDispatch(String str);

        String userRegion();
    }

    public int getBackgroundColorValue() {
        if (!TextUtils.isEmpty(this.mBackgroundColor)) {
            if (this.mBackgroundColor.startsWith("#")) {
                this.mBackgroundColor = this.mBackgroundColor.substring(1);
            }
            try {
                return CastIntegerProtector.valueOf(this.mBackgroundColor, 16).intValue();
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
            }
        }
        return 0;
    }

    public String getBackgroundColor() {
        return this.mBackgroundColor;
    }

    public String getCreateClientStack() {
        return this.mCreateClientStack;
    }

    public String getMixStreamRtmpUrl() {
        return this.mMixStreamUrl;
    }

    public String getRtcABTestConfig() {
        return this.mRtcABTestConfig;
    }

    public boolean getRtcClientMixUseOriginStream() {
        return this.mRtcClientMixUseOriginStream;
    }

    public Client.StreamMixer getStreamMixer() {
        return this.mMixer;
    }

    public UrlDispatcher getUrlDispatcher() {
        return this.mUrlDispatcher;
    }

    public boolean getUseVideoRangeDefault() {
        return this.mRtcUseVideoRangeDefault;
    }

    public int getVideoFrozenLimitMSec() {
        return this.mVideoFrozenLimitMSec;
    }

    public boolean isEnableInteractConnectionStatics() {
        return this.mEnableInteractConnectionStatics;
    }

    public boolean isEnableProcStatics() {
        return this.mEnableProcStatics;
    }

    public boolean isEnableRemoteUserStatics() {
        return this.mEnableRemoteUserStatics;
    }

    public boolean isEnableVideoBFrameOnMixStream() {
        return this.mEnableVideoBFrameOnMixStream;
    }

    public boolean isMixStreamConfigIndependent() {
        return this.mMixStreamConfigIndependent;
    }

    public int syncClientAudioMixLengthMs() {
        return this.mRtcSyncClientAudioMixLengthMs;
    }

    public int syncQueueLengthMs() {
        return this.mRtcSyncQueueLengthMs;
    }

    public void enableVideoBFrameOnMixStream(boolean z) {
        this.mEnableVideoBFrameOnMixStream = z;
    }

    public InteractConfig setBackgroundColor(String str) {
        this.mBackgroundColor = str;
        return this;
    }

    public void setCreateClientStack(String str) {
        this.mCreateClientStack = str;
    }

    public void setEnableInteractConnectionStatics(boolean z) {
        this.mEnableInteractConnectionStatics = z;
    }

    public void setEnableProcStatics(boolean z) {
        this.mEnableProcStatics = z;
    }

    public void setEnableRemoteUserStatics(boolean z) {
        this.mEnableRemoteUserStatics = z;
    }

    public InteractConfig setMixStreamConfigIndependent(boolean z) {
        this.mMixStreamConfigIndependent = z;
        return this;
    }

    public InteractConfig setMixStreamRtmpUrl(String str) {
        this.mMixStreamUrl = str;
        return this;
    }

    public InteractConfig setRtcABTestConfig(String str) {
        this.mRtcABTestConfig = str;
        return this;
    }

    public InteractConfig setRtcClientMixUseOriginStream(boolean z) {
        this.mRtcClientMixUseOriginStream = z;
        return this;
    }

    public InteractConfig setStreamMixer(Client.StreamMixer streamMixer) {
        this.mMixer = streamMixer;
        return this;
    }

    public InteractConfig setSyncClientAudioMixLengthMs(int i) {
        this.mRtcSyncClientAudioMixLengthMs = i;
        return this;
    }

    public InteractConfig setSyncQueueLengthMs(int i) {
        this.mRtcSyncQueueLengthMs = i;
        return this;
    }

    public void setUrlDispatcher(UrlDispatcher urlDispatcher) {
        this.mUrlDispatcher = urlDispatcher;
    }

    public InteractConfig setUseVideoRangeDefault(boolean z) {
        this.mRtcUseVideoRangeDefault = z;
        return this;
    }

    public void setVideoFrozenLimitMSec(int i) {
        this.mVideoFrozenLimitMSec = i;
    }
}
