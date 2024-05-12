package com.ss.android.ugc.aweme.services;

import X.C44531Hdn;
import X.InterfaceC43721HDx;
import com.bytedance.android.livesdk.livesetting.performance.LivePlayEnforceIntervalSetting;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.jsbopenrecord.RecordBottomTabConfig;
import com.ss.android.ugc.aweme.shortvideo.jsbopenrecord.RecordPageOptionalConfig;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class InternalMaxDurationResolverImpl implements InterfaceC43721HDx {
    @Override // X.InterfaceC43721HDx
    public long resolveMaxDurationFor3MinWithMusic(ShortVideoContext shortVideoContext, long j) {
        o.LJIIIZ(shortVideoContext, "shortVideoContext");
        return j;
    }

    @Override // X.InterfaceC43721HDx
    public long getMaxShootingDuration() {
        return MaxShootingDuration.INSTANCE.getMaxDuration();
    }

    @Override // X.InterfaceC43721HDx
    public long getMaxShootingDuration(int i) {
        if (i != 10) {
            if (i != 11) {
                if (i != 14) {
                    if (i != 18) {
                        return MaxShootingDuration.INSTANCE.getMaxDuration();
                    }
                    return MaxShootingDuration.INSTANCE.get10MinDuration();
                }
                return MaxShootingDuration.INSTANCE.get3MinDuration();
            }
            return C44531Hdn.LIZ();
        }
        return LivePlayEnforceIntervalSetting.DEFAULT;
    }

    @Override // X.InterfaceC43721HDx
    public long getMaxShootingDuration(boolean z, ShortVideoContext context) {
        RecordBottomTabConfig recordBottomTabConfig;
        Long l;
        o.LJIIIZ(context, "context");
        if (context.LJJIJIIJIL()) {
            return context.cameraComponentModel.mMaxDuration;
        }
        if (z) {
            RecordPageOptionalConfig recordPageOptionalConfig = context.creativeModel.initialModel.recordPageOptionalConfig;
            if (recordPageOptionalConfig != null && (recordBottomTabConfig = recordPageOptionalConfig.recordBottomTabConfig) != null && (l = recordBottomTabConfig.maxVideoDuration) != null) {
                return l.longValue();
            }
            return LivePlayEnforceIntervalSetting.DEFAULT;
        }
        int i = context.shootMode;
        if (i != 11) {
            if (i != 14) {
                if (i != 18) {
                    return MaxShootingDuration.INSTANCE.getMaxDuration();
                }
                return MaxShootingDuration.INSTANCE.get10MinDuration();
            }
            return MaxShootingDuration.INSTANCE.get3MinDuration();
        }
        return C44531Hdn.LIZ();
    }
}
