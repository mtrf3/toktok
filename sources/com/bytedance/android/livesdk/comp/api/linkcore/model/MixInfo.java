package com.bytedance.android.livesdk.comp.api.linkcore.model;

import X.C76800UCe;
import X.InterfaceC88472Yns;
import X.X1D;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class MixInfo {
    public static final Companion Companion = new Companion();
    public final LiveStreamMixer streamMixer;
    public final String streamUrl;

    /* loaded from: classes14.dex */
    public static final class Builder {
        public LiveStreamMixer streamMixer;
        public String streamUrl;

        public final MixInfo build() {
            return new MixInfo(this);
        }

        public final LiveStreamMixer getStreamMixer() {
            return this.streamMixer;
        }

        public final String getStreamUrl() {
            return this.streamUrl;
        }

        public final void setStreamMixer(LiveStreamMixer liveStreamMixer) {
            this.streamMixer = liveStreamMixer;
        }

        public final void setStreamUrl(String str) {
            this.streamUrl = str;
        }
    }

    public /* synthetic */ MixInfo(Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
        this(builder);
    }

    public static /* synthetic */ MixInfo copy$default(MixInfo mixInfo, String str, LiveStreamMixer liveStreamMixer, int i, Object obj) {
        if ((i & 1) != 0) {
            str = mixInfo.streamUrl;
        }
        if ((i & 2) != 0) {
            liveStreamMixer = mixInfo.streamMixer;
        }
        return mixInfo.copy(str, liveStreamMixer);
    }

    public final MixInfo copy(String str, LiveStreamMixer liveStreamMixer) {
        return new MixInfo(str, liveStreamMixer);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MixInfo)) {
            return false;
        }
        MixInfo mixInfo = (MixInfo) obj;
        return o.LJ(this.streamUrl, mixInfo.streamUrl) && o.LJ(this.streamMixer, mixInfo.streamMixer);
    }

    public int hashCode() {
        String str = this.streamUrl;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        LiveStreamMixer liveStreamMixer = this.streamMixer;
        return hashCode + (liveStreamMixer != null ? liveStreamMixer.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("MixInfo(streamUrl=");
        LIZ.append(this.streamUrl);
        LIZ.append(", streamMixer=");
        LIZ.append(this.streamMixer);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    /* loaded from: classes14.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public final MixInfo build(InterfaceC88472Yns<? super Builder, C76800UCe> block) {
            o.LJIIIZ(block, "block");
            Builder builder = new Builder();
            block.invoke(builder);
            return builder.build();
        }
    }

    public final LiveStreamMixer getStreamMixer() {
        return this.streamMixer;
    }

    public final String getStreamUrl() {
        return this.streamUrl;
    }

    public MixInfo(Builder builder) {
        this(builder.getStreamUrl(), builder.getStreamMixer());
    }

    public MixInfo(String str, LiveStreamMixer liveStreamMixer) {
        this.streamUrl = str;
        this.streamMixer = liveStreamMixer;
    }
}
