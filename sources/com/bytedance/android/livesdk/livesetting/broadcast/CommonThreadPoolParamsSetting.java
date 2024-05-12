package com.bytedance.android.livesdk.livesetting.broadcast;

import X.C221108m2;
import X.C5H3;
import X.YKP;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;

@SettingsKey("common_thread_pool_config")
/* loaded from: classes16.dex */
public final class CommonThreadPoolParamsSetting {
    public static final CommonThreadPoolParamsSetting INSTANCE = new CommonThreadPoolParamsSetting();

    @Group(isDefault = true, value = "default group")
    public static final ThreadPoolConfig DEFAULT = new ThreadPoolConfig(0, 0, 0, 0, 15, null);
    public static final C5H3 config$delegate = C221108m2.LIZIZ(YKP.LJLIL);

    private final ThreadPoolConfig getConfig() {
        return (ThreadPoolConfig) config$delegate.getValue();
    }

    public final int corePoolSize() {
        return getConfig().getCorePoolSize();
    }

    public final long keepAliveTime() {
        return getConfig().getKeepAliveTime();
    }

    public final int maximumPoolSize() {
        return getConfig().getMaximumPoolSize();
    }

    public final int threadPriority() {
        return getConfig().getThreadPriority();
    }
}
