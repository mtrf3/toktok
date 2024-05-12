package com.bytedance.android.livesdk.livesetting.performance.degrade.hotroom;

import X.InterfaceC65349Pkn;
import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveHurryTimeSetting;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class ScalableDowngradeConfig {

    @InterfaceC65349Pkn("disable_alog")
    public boolean disableAlog;

    @InterfaceC65349Pkn("disable_apm_log")
    public boolean disableApmLog;

    @InterfaceC65349Pkn("disable_banner")
    public boolean disableBanner;

    @InterfaceC65349Pkn("disable_gift_notify_anim")
    public boolean disableGiftNotifyAnim;

    @InterfaceC65349Pkn("disable_gift_tray_anim")
    public boolean disableGiftTrayAnim;

    @InterfaceC65349Pkn("disable_other_like_anim")
    public boolean disableOtherLikeAnim;

    @InterfaceC65349Pkn("disable_public_screen_avatar_preload")
    public boolean disablePublicAvatarPreload;

    @InterfaceC65349Pkn("disable_public_screen_anim")
    public boolean disablePublicScreenAnim;

    @InterfaceC65349Pkn("hot_temperature")
    public int hotTemperature;

    @InterfaceC65349Pkn("is_enabled")
    public boolean isEnabled;

    @InterfaceC65349Pkn("level_serious_fps")
    public int levelSeriousFps;

    @InterfaceC65349Pkn("level_serious_fps_end")
    public int levelSeriousFpsEnd;

    @InterfaceC65349Pkn("level_serious_fps_start")
    public int levelSeriousFpsStart;

    @InterfaceC65349Pkn("msg_qps_heavy")
    public int msgQpsHeavy;

    @InterfaceC65349Pkn("online_audience_refresh_interval")
    public long onlineAudienceRefreshInterval;

    @InterfaceC65349Pkn("public_screen_refresh_interval")
    public int publicScreenRefreshInterval;

    /* JADX WARN: Multi-variable type inference failed */
    public ScalableDowngradeConfig() {
        this(false, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0L, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 65535, null);
    }

    public final boolean getDisableAlog() {
        return this.disableAlog;
    }

    public final boolean getDisableApmLog() {
        return this.disableApmLog;
    }

    public final boolean getDisableBanner() {
        return this.disableBanner;
    }

    public final boolean getDisableGiftNotifyAnim() {
        return this.disableGiftNotifyAnim;
    }

    public final boolean getDisableGiftTrayAnim() {
        return this.disableGiftTrayAnim;
    }

    public final boolean getDisableOtherLikeAnim() {
        return this.disableOtherLikeAnim;
    }

    public final boolean getDisablePublicAvatarPreload() {
        return this.disablePublicAvatarPreload;
    }

    public final boolean getDisablePublicScreenAnim() {
        return this.disablePublicScreenAnim;
    }

    public final int getHotTemperature() {
        return this.hotTemperature;
    }

    public final int getLevelSeriousFps() {
        return this.levelSeriousFps;
    }

    public final int getLevelSeriousFpsEnd() {
        return this.levelSeriousFpsEnd;
    }

    public final int getLevelSeriousFpsStart() {
        return this.levelSeriousFpsStart;
    }

    public final int getMsgQpsHeavy() {
        return this.msgQpsHeavy;
    }

    public final long getOnlineAudienceRefreshInterval() {
        return this.onlineAudienceRefreshInterval;
    }

    public final int getPublicScreenRefreshInterval() {
        return this.publicScreenRefreshInterval;
    }

    public final boolean isEnabled() {
        return this.isEnabled;
    }

    public final void setDisableAlog(boolean z) {
        this.disableAlog = z;
    }

    public final void setDisableApmLog(boolean z) {
        this.disableApmLog = z;
    }

    public final void setDisableBanner(boolean z) {
        this.disableBanner = z;
    }

    public final void setDisableGiftNotifyAnim(boolean z) {
        this.disableGiftNotifyAnim = z;
    }

    public final void setDisableGiftTrayAnim(boolean z) {
        this.disableGiftTrayAnim = z;
    }

    public final void setDisableOtherLikeAnim(boolean z) {
        this.disableOtherLikeAnim = z;
    }

    public final void setDisablePublicAvatarPreload(boolean z) {
        this.disablePublicAvatarPreload = z;
    }

    public final void setDisablePublicScreenAnim(boolean z) {
        this.disablePublicScreenAnim = z;
    }

    public final void setEnabled(boolean z) {
        this.isEnabled = z;
    }

    public final void setHotTemperature(int i) {
        this.hotTemperature = i;
    }

    public final void setLevelSeriousFps(int i) {
        this.levelSeriousFps = i;
    }

    public final void setLevelSeriousFpsEnd(int i) {
        this.levelSeriousFpsEnd = i;
    }

    public final void setLevelSeriousFpsStart(int i) {
        this.levelSeriousFpsStart = i;
    }

    public final void setMsgQpsHeavy(int i) {
        this.msgQpsHeavy = i;
    }

    public final void setOnlineAudienceRefreshInterval(long j) {
        this.onlineAudienceRefreshInterval = j;
    }

    public final void setPublicScreenRefreshInterval(int i) {
        this.publicScreenRefreshInterval = i;
    }

    public ScalableDowngradeConfig(boolean z, boolean z2, int i, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, long j, int i2, int i3, int i4, int i5, int i6) {
        this.isEnabled = z;
        this.disablePublicScreenAnim = z2;
        this.publicScreenRefreshInterval = i;
        this.disablePublicAvatarPreload = z3;
        this.disableOtherLikeAnim = z4;
        this.disableBanner = z5;
        this.disableAlog = z6;
        this.disableApmLog = z7;
        this.disableGiftTrayAnim = z8;
        this.disableGiftNotifyAnim = z9;
        this.onlineAudienceRefreshInterval = j;
        this.hotTemperature = i2;
        this.levelSeriousFpsStart = i3;
        this.levelSeriousFpsEnd = i4;
        this.levelSeriousFps = i5;
        this.msgQpsHeavy = i6;
    }

    public /* synthetic */ ScalableDowngradeConfig(boolean z, boolean z2, int i, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, long j, int i2, int i3, int i4, int i5, int i6, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? false : z, (i7 & 2) != 0 ? false : z2, (i7 & 4) != 0 ? LiveNetAdaptiveHurryTimeSetting.DEFAULT : i, (i7 & 8) != 0 ? false : z3, (i7 & 16) != 0 ? false : z4, (i7 & 32) != 0 ? false : z5, (i7 & 64) != 0 ? false : z6, (i7 & 128) != 0 ? false : z7, (i7 & 256) != 0 ? false : z8, (i7 & 512) == 0 ? z9 : false, (i7 & 1024) != 0 ? 2L : j, (i7 & 2048) != 0 ? 43 : i2, (i7 & 4096) != 0 ? 21 : i3, (i7 & FileUtils.BUFFER_SIZE) != 0 ? 30 : i4, (i7 & 16384) != 0 ? 10 : i5, (i7 & 32768) == 0 ? i6 : 10);
    }
}
