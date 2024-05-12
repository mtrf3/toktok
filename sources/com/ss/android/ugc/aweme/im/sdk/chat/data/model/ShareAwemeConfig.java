package com.ss.android.ugc.aweme.im.sdk.chat.data.model;

import X.C17N;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes17.dex */
public final class ShareAwemeConfig {
    public static final Companion Companion = new Companion();
    public boolean autoPlay;
    public boolean enablePlayControl;
    public boolean isLoop;
    public boolean needResize;
    public boolean showMuteBtn;
    public boolean isMute = true;
    public float width = C17N.LJIILL(158.0d);
    public float height = C17N.LJIILL(252.0d);
    public boolean showTitle = true;
    public int borderRadius = C17N.LJIILL(4.0d);

    /* loaded from: classes17.dex */
    public static final class Builder {
        public final ShareAwemeConfig mConfig = new ShareAwemeConfig();

        public final ShareAwemeConfig build() {
            return this.mConfig;
        }

        public final Builder autoPlay(boolean z) {
            this.mConfig.setAutoPlay(z);
            return this;
        }

        public final Builder borderRadius(int i) {
            this.mConfig.setBorderRadius(i);
            return this;
        }

        public final Builder enablePlayControl(boolean z) {
            this.mConfig.setEnablePlayControl(z);
            return this;
        }

        public final Builder height(float f) {
            this.mConfig.setHeight(f);
            return this;
        }

        public final Builder isLoop(boolean z) {
            this.mConfig.setLoop(z);
            return this;
        }

        public final Builder isMute(boolean z) {
            this.mConfig.setMute(z);
            return this;
        }

        public final Builder needResize(boolean z) {
            this.mConfig.setNeedResize(z);
            return this;
        }

        public final Builder showMuteBtn(boolean z) {
            this.mConfig.setShowMuteBtn(z);
            return this;
        }

        public final Builder showTitle(boolean z) {
            this.mConfig.setShowTitle(z);
            return this;
        }

        public final Builder width(float f) {
            this.mConfig.setWidth(f);
            return this;
        }
    }

    /* loaded from: classes17.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    public final boolean getAutoPlay() {
        return this.autoPlay;
    }

    public final int getBorderRadius() {
        return this.borderRadius;
    }

    public final boolean getEnablePlayControl() {
        return this.enablePlayControl;
    }

    public final float getHeight() {
        return this.height;
    }

    public final boolean getNeedResize() {
        return this.needResize;
    }

    public final boolean getShowMuteBtn() {
        return this.showMuteBtn;
    }

    public final boolean getShowTitle() {
        return this.showTitle;
    }

    public final float getWidth() {
        return this.width;
    }

    public final boolean isLoop() {
        return this.isLoop;
    }

    public final boolean isMute() {
        return this.isMute;
    }

    public final void setAutoPlay(boolean z) {
        this.autoPlay = z;
    }

    public final void setBorderRadius(int i) {
        this.borderRadius = i;
    }

    public final void setEnablePlayControl(boolean z) {
        this.enablePlayControl = z;
    }

    public final void setHeight(float f) {
        this.height = f;
    }

    public final void setLoop(boolean z) {
        this.isLoop = z;
    }

    public final void setMute(boolean z) {
        this.isMute = z;
    }

    public final void setNeedResize(boolean z) {
        this.needResize = z;
    }

    public final void setShowMuteBtn(boolean z) {
        this.showMuteBtn = z;
    }

    public final void setShowTitle(boolean z) {
        this.showTitle = z;
    }

    public final void setWidth(float f) {
        this.width = f;
    }
}
