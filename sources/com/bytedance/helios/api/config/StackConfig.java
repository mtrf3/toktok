package com.bytedance.helios.api.config;

import X.C61878OQg;
import X.F9E;
import X.InterfaceC65349Pkn;
import com.bytedance.pumbaa.base.settings.FrequencyConfig;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class StackConfig extends F9E {

    @InterfaceC65349Pkn("cache_config")
    public final CacheConfig cacheConfig;

    @InterfaceC65349Pkn("enabled")
    public final boolean enabled;

    @InterfaceC65349Pkn("frequency_config")
    public final FrequencyConfig frequencyConfig;

    @InterfaceC65349Pkn("scene_configs")
    public final List<SceneConfig> sceneConfigs;

    public StackConfig() {
        this(false, null, null, null, 15, null);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.enabled), this.sceneConfigs, this.frequencyConfig, this.cacheConfig};
    }

    public StackConfig(boolean z, List<SceneConfig> sceneConfigs, FrequencyConfig frequencyConfig, CacheConfig cacheConfig) {
        o.LJIIIZ(sceneConfigs, "sceneConfigs");
        o.LJIIIZ(frequencyConfig, "frequencyConfig");
        o.LJIIIZ(cacheConfig, "cacheConfig");
        this.enabled = z;
        this.sceneConfigs = sceneConfigs;
        this.frequencyConfig = frequencyConfig;
        this.cacheConfig = cacheConfig;
    }

    public StackConfig(boolean z, List list, FrequencyConfig frequencyConfig, CacheConfig cacheConfig, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z, (i & 2) != 0 ? C61878OQg.INSTANCE : list, (i & 4) != 0 ? new FrequencyConfig(20, TimeUnit.MINUTES.toMillis(1L), 50, "network_stack_frequency", null, 16, null) : frequencyConfig, (i & 8) != 0 ? new CacheConfig(0, 0L, 3, null) : cacheConfig);
    }
}
