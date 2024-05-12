package com.bytedance.android.livesdk.livesetting.watchlive;

import X.BPW;
import X.C221108m2;
import X.C5H3;
import X.InterfaceC65349Pkn;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;

@SettingsKey("live_pull_pure_audio_opt")
/* loaded from: classes6.dex */
public final class LivePullPureAudioSetting {
    public static final LivePullPureAudioSetting INSTANCE = new LivePullPureAudioSetting();

    @Group(isDefault = true, value = "default")
    public static final PullPureAudioConfig DEFAULT = new PullPureAudioConfig(false, 0 == true ? 1 : 0, 0, 7, null);
    public static final C5H3 currentValue$delegate = C221108m2.LIZIZ(BPW.LJLIL);

    public final PullPureAudioConfig getCurrentValue() {
        return (PullPureAudioConfig) currentValue$delegate.getValue();
    }

    /* loaded from: classes6.dex */
    public static final class PullPureAudioConfig implements Serializable {

        @InterfaceC65349Pkn("enable")
        public boolean enable;

        @InterfaceC65349Pkn("retry_count")
        public int retryCount;

        @InterfaceC65349Pkn("retry_delay")
        public long retryDelay;

        /* JADX WARN: Multi-variable type inference failed */
        public PullPureAudioConfig() {
            this(false, 0 == true ? 1 : 0, 0L, 7, null);
        }

        public final boolean getEnable() {
            return this.enable;
        }

        public final int getRetryCount() {
            return this.retryCount;
        }

        public final long getRetryDelay() {
            return this.retryDelay;
        }

        public final void setEnable(boolean z) {
            this.enable = z;
        }

        public final void setRetryCount(int i) {
            this.retryCount = i;
        }

        public final void setRetryDelay(long j) {
            this.retryDelay = j;
        }

        public PullPureAudioConfig(boolean z, int i, long j) {
            this.enable = z;
            this.retryCount = i;
            this.retryDelay = j;
        }

        public /* synthetic */ PullPureAudioConfig(boolean z, int i, long j, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? false : z, (i2 & 2) != 0 ? 20 : i, (i2 & 4) != 0 ? 2000L : j);
        }
    }
}
