package com.ss.android.ugc.aweme.services.external.ui;

import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class DuetConfig {
    public Serializable author;
    public String duetChallenge;
    public String duetFrom;
    public Integer duetGameScore;
    public Effect duetLayout;
    public int duetVideoHeight;
    public int duetVideoWidth;
    public final boolean isFromDuetButton;
    public StickerDownloadConfig mStickerDownloadConfig;
    public int minDuration;
    public String mp4Path;
    public String originVideo;
    public final int originVideoAIGCLabelType;
    public String outputDir;
    public float srcLoudness;
    public String wavPath;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DuetConfig(String originVideo, String mp4Path, String wavPath, Serializable author, String duetFrom, int i) {
        this(originVideo, mp4Path, wavPath, author, duetFrom, i, false, 0 == true ? 1 : 0, 192, null);
        o.LJIIIZ(originVideo, "originVideo");
        o.LJIIIZ(mp4Path, "mp4Path");
        o.LJIIIZ(wavPath, "wavPath");
        o.LJIIIZ(author, "author");
        o.LJIIIZ(duetFrom, "duetFrom");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DuetConfig(String originVideo, String mp4Path, String wavPath, Serializable author, String duetFrom, int i, boolean z) {
        this(originVideo, mp4Path, wavPath, author, duetFrom, i, z, 0, 128, null);
        o.LJIIIZ(originVideo, "originVideo");
        o.LJIIIZ(mp4Path, "mp4Path");
        o.LJIIIZ(wavPath, "wavPath");
        o.LJIIIZ(author, "author");
        o.LJIIIZ(duetFrom, "duetFrom");
    }

    /* loaded from: classes8.dex */
    public static final class Builder {
        public DuetConfig config;

        /* JADX WARN: Multi-variable type inference failed */
        public Builder() {
            this.config = new DuetConfig("", "", "", new Serializable() { // from class: com.ss.android.ugc.aweme.services.external.ui.DuetConfig.Builder.1
            }, "", 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 128, null);
        }

        public final DuetConfig build() {
            return this.config;
        }

        public Builder(DuetConfig config) {
            o.LJIIIZ(config, "config");
            this.config = config;
        }

        public final Builder author(Serializable author) {
            o.LJIIIZ(author, "author");
            this.config.setAuthor(author);
            return this;
        }

        public final Builder duetFrom(String duetFrom) {
            o.LJIIIZ(duetFrom, "duetFrom");
            this.config.setDuetFrom(duetFrom);
            return this;
        }

        public final Builder minDuration(int i) {
            this.config.setMinDuration(i);
            return this;
        }

        public final Builder mp4Path(String mp4Path) {
            o.LJIIIZ(mp4Path, "mp4Path");
            this.config.setMp4Path(mp4Path);
            return this;
        }

        public final Builder originalVideo(String originVideo) {
            o.LJIIIZ(originVideo, "originVideo");
            this.config.setOriginVideo(originVideo);
            return this;
        }

        public final Builder outputDir(String outputDir) {
            o.LJIIIZ(outputDir, "outputDir");
            this.config.setOutputDir(outputDir);
            return this;
        }

        public final Builder wavPath(String wavPath) {
            o.LJIIIZ(wavPath, "wavPath");
            this.config.setWavPath(wavPath);
            return this;
        }
    }

    public final String getOutputDir() {
        String str = this.outputDir;
        if (str != null) {
            return str;
        }
        o.LJIJI("outputDir");
        throw null;
    }

    public final Serializable getAuthor() {
        return this.author;
    }

    public final String getDuetChallenge() {
        return this.duetChallenge;
    }

    public final String getDuetFrom() {
        return this.duetFrom;
    }

    public final Integer getDuetGameScore() {
        return this.duetGameScore;
    }

    public final Effect getDuetLayout() {
        return this.duetLayout;
    }

    public final int getDuetVideoHeight() {
        return this.duetVideoHeight;
    }

    public final int getDuetVideoWidth() {
        return this.duetVideoWidth;
    }

    public final StickerDownloadConfig getMStickerDownloadConfig() {
        return this.mStickerDownloadConfig;
    }

    public final int getMinDuration() {
        return this.minDuration;
    }

    public final String getMp4Path() {
        return this.mp4Path;
    }

    public final String getOriginVideo() {
        return this.originVideo;
    }

    public final int getOriginVideoAIGCLabelType() {
        return this.originVideoAIGCLabelType;
    }

    public final float getSrcLoudness() {
        return this.srcLoudness;
    }

    public final String getWavPath() {
        return this.wavPath;
    }

    public final boolean isFromDuetButton() {
        return this.isFromDuetButton;
    }

    public final void setAuthor(Serializable serializable) {
        o.LJIIIZ(serializable, "<set-?>");
        this.author = serializable;
    }

    public final void setDuetChallenge(String str) {
        this.duetChallenge = str;
    }

    public final void setDuetFrom(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.duetFrom = str;
    }

    public final void setDuetGameScore(Integer num) {
        this.duetGameScore = num;
    }

    public final void setDuetLayout(Effect effect) {
        this.duetLayout = effect;
    }

    public final void setDuetVideoHeight(int i) {
        this.duetVideoHeight = i;
    }

    public final void setDuetVideoWidth(int i) {
        this.duetVideoWidth = i;
    }

    public final void setMStickerDownloadConfig(StickerDownloadConfig stickerDownloadConfig) {
        this.mStickerDownloadConfig = stickerDownloadConfig;
    }

    public final void setMinDuration(int i) {
        this.minDuration = i;
    }

    public final void setMp4Path(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.mp4Path = str;
    }

    public final void setOriginVideo(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.originVideo = str;
    }

    public final void setOutputDir(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.outputDir = str;
    }

    public final void setSrcLoudness(float f) {
        this.srcLoudness = f;
    }

    public final void setWavPath(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.wavPath = str;
    }

    public DuetConfig(String originVideo, String mp4Path, String wavPath, Serializable author, String duetFrom, int i, boolean z, int i2) {
        o.LJIIIZ(originVideo, "originVideo");
        o.LJIIIZ(mp4Path, "mp4Path");
        o.LJIIIZ(wavPath, "wavPath");
        o.LJIIIZ(author, "author");
        o.LJIIIZ(duetFrom, "duetFrom");
        this.originVideo = originVideo;
        this.mp4Path = mp4Path;
        this.wavPath = wavPath;
        this.author = author;
        this.duetFrom = duetFrom;
        this.minDuration = i;
        this.isFromDuetButton = z;
        this.originVideoAIGCLabelType = i2;
        this.duetGameScore = 0;
        this.srcLoudness = Float.MIN_VALUE;
    }

    public /* synthetic */ DuetConfig(String str, String str2, String str3, Serializable serializable, String str4, int i, boolean z, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, serializable, str4, i, (i3 & 64) != 0 ? false : z, (i3 & 128) != 0 ? 0 : i2);
    }
}
