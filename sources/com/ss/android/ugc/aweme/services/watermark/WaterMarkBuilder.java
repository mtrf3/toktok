package com.ss.android.ugc.aweme.services.watermark;

import X.InterfaceC45930I0w;
import com.ss.android.ugc.aweme.feed.model.Video;
import java.util.List;

/* loaded from: classes8.dex */
public class WaterMarkBuilder {
    public boolean addEndMark;
    public boolean addInterMark;
    public int aigcLabelType;
    public InterfaceC45930I0w author;
    public ViralEffectInfo effectInfo;
    public boolean forceInputResolution;
    public String inputPath;
    public boolean is1To1;
    public boolean isForce16To9;
    public boolean isInstagram;
    public WaterMarkListener listener;
    public long mDownloadDuration;
    public long mDownloadRate;
    public String mUrl;
    public String outPath;
    public boolean richEndMode;
    public int saveType;
    public List<String> ttsCreatorIdList;
    public String ttsVoiceCreatorDesc;
    public List<String> vcCreatorIdList;
    public Video video;
    public String waterPicDir = "";

    public ViralEffectInfo getEffectInfo() {
        return this.effectInfo;
    }

    public WaterMarkBuilder setActivityWaterMark(String str) {
        this.waterPicDir = str;
        return this;
    }

    public WaterMarkBuilder setAddEndMark(boolean z) {
        this.addEndMark = z;
        return this;
    }

    public WaterMarkBuilder setAddInterMark(boolean z) {
        this.addInterMark = z;
        return this;
    }

    public WaterMarkBuilder setDownloadDuration(long j) {
        this.mDownloadDuration = j;
        return this;
    }

    public WaterMarkBuilder setDownloadRate(long j) {
        this.mDownloadRate = j;
        return this;
    }

    public void setEffectInfo(ViralEffectInfo viralEffectInfo) {
        this.effectInfo = viralEffectInfo;
    }

    public WaterMarkBuilder setForce16To9Ratio(boolean z) {
        this.isForce16To9 = z;
        return this;
    }

    public WaterMarkBuilder setForceInputResolution(boolean z) {
        this.forceInputResolution = z;
        return this;
    }

    public WaterMarkBuilder setInputPath(String str) {
        this.inputPath = str;
        return this;
    }

    public WaterMarkBuilder setIs1To1(boolean z) {
        this.is1To1 = z;
        return this;
    }

    public WaterMarkBuilder setIsInstagram(boolean z) {
        this.isInstagram = z;
        return this;
    }

    public WaterMarkBuilder setIsRichEndMode(boolean z) {
        this.richEndMode = z;
        return this;
    }

    public WaterMarkBuilder setListener(WaterMarkListener waterMarkListener) {
        this.listener = waterMarkListener;
        return this;
    }

    public WaterMarkBuilder setOutPath(String str) {
        this.outPath = str;
        return this;
    }

    public WaterMarkBuilder setSaveType(int i) {
        this.saveType = i;
        return this;
    }

    public void setTTSVoiceCreatorDesc(String str) {
        this.ttsVoiceCreatorDesc = str;
    }

    public void setTtsCreatorIdList(List<String> list) {
        this.ttsCreatorIdList = list;
    }

    public WaterMarkBuilder setUrl(String str) {
        this.mUrl = str;
        return this;
    }

    public void setVcCreatorIdList(List<String> list) {
        this.vcCreatorIdList = list;
    }

    public WaterMarkBuilder setWaterParams(InterfaceC45930I0w interfaceC45930I0w, Video video) {
        this.author = interfaceC45930I0w;
        this.video = video;
        return this;
    }
}
