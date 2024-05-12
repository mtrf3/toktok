package com.bytedance.android.livesdk.livesetting.performance.degrade;

import X.BCW;
import X.C30134BsA;
import X.EnumC30098Bra;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.dataChannel.LowDevicePerfScalableChannel;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdk.livesetting.performance.degrade.hotroom.ScalableDowngradeSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.o;

@SettingsKey("live_like_degrade")
/* loaded from: classes6.dex */
public final class LiveLikeDegradeSettings {
    public static final LiveLikeDegradeSettings INSTANCE = new LiveLikeDegradeSettings();

    @Group(isDefault = true, value = "default group")
    public static final LiveLikeDegrade DEFAULT = new LiveLikeDegrade();

    public final LiveLikeDegrade getValue() {
        LiveLikeDegrade liveLikeDegrade = (LiveLikeDegrade) SettingsManager.INSTANCE.getValueSafely(LiveLikeDegradeSettings.class);
        if (liveLikeDegrade == null) {
            return DEFAULT;
        }
        return liveLikeDegrade;
    }

    public final LiveLikeDegrade getDEFAULT() {
        return DEFAULT;
    }

    private final boolean userIsAudience(DataChannel dataChannel) {
        boolean z;
        Boolean bool;
        if (dataChannel != null && (bool = (Boolean) dataChannel.kv0(UserIsAnchorChannel.class)) != null) {
            z = bool.booleanValue();
        } else {
            z = false;
        }
        return !z;
    }

    public final boolean disableAvatarAnim(DataChannel dataChannel) {
        if (userIsAudience(dataChannel) && !getValue().enableAvatarAnim) {
            return true;
        }
        return false;
    }

    public final boolean disableBottomView(DataChannel dataChannel) {
        boolean z;
        if (dataChannel != null) {
            z = o.LJ(dataChannel.kv0(BCW.class), Boolean.TRUE);
        } else {
            z = false;
        }
        return !z;
    }

    public final boolean disableEasterEggs(DataChannel dataChannel) {
        if (userIsAudience(dataChannel) && !getValue().enableEasterEggs) {
            return true;
        }
        return false;
    }

    public final boolean disableLikeFunc(DataChannel dataChannel) {
        if (disableOtherLike(dataChannel) && disableSelfLike(dataChannel)) {
            return true;
        }
        return false;
    }

    public final boolean disableLottieAnim(DataChannel dataChannel) {
        if ((userIsAudience(dataChannel) && !getValue().enableLottieAnim) || LiveLikePerformanceOptimizeSettings.INSTANCE.enableFunctionRemove()) {
            return true;
        }
        return false;
    }

    public final boolean disableOtherLike(DataChannel dataChannel) {
        if ((userIsAudience(dataChannel) && !getValue().enableOtherlike) || LiveLikePerformanceOptimizeSettings.INSTANCE.enableFunctionRemove() || isScalableDowngrade(dataChannel) || (userIsAudience(dataChannel) && LiveHotDegradeSetting.INSTANCE.disableOtherLike())) {
            return true;
        }
        return false;
    }

    public final boolean disableSelfLike(DataChannel dataChannel) {
        if (userIsAudience(dataChannel) && !getValue().enableSelflike) {
            return true;
        }
        return false;
    }

    public final boolean isScalableDowngrade(DataChannel dataChannel) {
        C30134BsA c30134BsA;
        EnumC30098Bra enumC30098Bra;
        if (dataChannel == null || (c30134BsA = (C30134BsA) dataChannel.kv0(LowDevicePerfScalableChannel.class)) == null || (enumC30098Bra = c30134BsA.LIZIZ) == null) {
            return false;
        }
        int ordinal = enumC30098Bra.ordinal();
        if (!ScalableDowngradeSetting.disableOtherLikeAnim() || ordinal >= EnumC30098Bra.LEVEL_HIGH.ordinal()) {
            return false;
        }
        return true;
    }
}
