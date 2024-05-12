package com.ss.avframework.livestreamv2.core.interact;

import android.content.Context;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.avframework.livestreamv2.core.interact.model.Config;
import com.ss.ttlivestreamer.livestreamv2.core.LiveCore;
import com.ss.ttlivestreamer.livestreamv2.sdkparams.VPassInteractCfg;
import java.lang.ref.WeakReference;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public class InteractEngineBuilder {
    public int mAudioChannelCount;
    public int mAudioSampleHz;
    public boolean mByteAudioEnabled = false;
    public Context mContext;
    public JSONObject mDumpFrameParams;
    public WeakReference<LiveCore> mLiveCore;
    public Config.MixStreamType mMixStreamType;
    public String mOriginUrl;
    public String mUUID;
    public VPassInteractCfg mVPassInteractCfg;

    public LiveCore getLiveCore() {
        return this.mLiveCore.get();
    }

    public void updateOriginUrl() {
        List<String> urls;
        if (getLiveCore() != null && (urls = getLiveCore().getUrls()) != null && urls.size() >= 1) {
            this.mOriginUrl = (String) ListProtector.get(urls, 0);
        }
    }

    public int getAudioChannelCount() {
        return this.mAudioChannelCount;
    }

    public int getAudioSampleHz() {
        return this.mAudioSampleHz;
    }

    public Context getContext() {
        return this.mContext;
    }

    public JSONObject getDumpFrameParams() {
        return this.mDumpFrameParams;
    }

    public Config.MixStreamType getMixStreamType() {
        return this.mMixStreamType;
    }

    public VPassInteractCfg getVPassInteractCfg() {
        return this.mVPassInteractCfg;
    }

    public boolean isByteAudioEnabled() {
        return this.mByteAudioEnabled;
    }

    public InteractEngineBuilder(LiveCore liveCore) {
        this.mLiveCore = new WeakReference<>(null);
        this.mAudioChannelCount = 2;
        this.mAudioSampleHz = 44100;
        this.mVPassInteractCfg = liveCore.getBuilder().getInteract();
        LiveCore.Builder builder = liveCore.getBuilder();
        this.mLiveCore = new WeakReference<>(liveCore);
        this.mContext = builder.getContext();
        this.mAudioChannelCount = builder.getAudioChannel();
        this.mAudioSampleHz = builder.getAudioSampleHZ();
        this.mDumpFrameParams = builder.getDumpFrameParams();
        this.mUUID = liveCore.getBuilder().getStreamId();
        this.mOriginUrl = "";
        updateOriginUrl();
    }

    public InteractEngineBuilder setByteAudioEnabled(boolean z) {
        this.mByteAudioEnabled = z;
        return this;
    }

    public InteractEngineBuilder setMixStreamType(Config.MixStreamType mixStreamType) {
        this.mMixStreamType = mixStreamType;
        return this;
    }
}
