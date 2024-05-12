package com.bytedance.helios.api.config;

import X.C47261Igj;
import X.C51029K0z;
import X.C61878OQg;
import X.C77275UUl;
import X.InterfaceC65349Pkn;
import X.OQY;
import X.OSZ;
import X.X1D;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.bytedance.pumbaa.base.settings.FrequencyConfig;
import com.google.gson.m;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class SettingsModel {

    @InterfaceC65349Pkn("ab_tag")
    public final String abTag;

    @InterfaceC65349Pkn("alog_duration")
    public final long alogDuration;

    @InterfaceC65349Pkn("alog_enabled")
    public final boolean alogEnabled;

    @InterfaceC65349Pkn("anchor_configs")
    public final List<AnchorInfoModel> anchorConfigs;

    @InterfaceC65349Pkn("api_statistics_configs")
    public final List<ApiStatistics> apiStatisticsConfigs;

    @InterfaceC65349Pkn("api_time_out_duration")
    public final long apiTimeOutDuration;

    @InterfaceC65349Pkn("api_white_list")
    public volatile List<String> apiWhiteList;

    @InterfaceC65349Pkn("appops_ignore_known_api")
    public final boolean appOpsIgnoreKnownApi;

    @InterfaceC65349Pkn("background_freeze_duration")
    public final long backgroundFreezeDuration;

    @InterfaceC65349Pkn("binder_config")
    public final BinderConfig binderConfig;

    @InterfaceC65349Pkn("cache_config")
    public final m cacheConfig;

    @InterfaceC65349Pkn("check_app_scenes")
    public final Set<String> checkAppScenes;

    @InterfaceC65349Pkn("crp_config")
    public final CrpConfig crpConfig;

    @InterfaceC65349Pkn("CustomAnchor")
    public final CustomAnchorConfig customAnchor;

    @InterfaceC65349Pkn("enabled")
    public final boolean enabled;

    @InterfaceC65349Pkn("engine_type")
    public final String engineType;

    @InterfaceC65349Pkn("error_warning_types")
    public final Set<String> errorWarningTypes;

    @InterfaceC65349Pkn("frequency_configs")
    public final List<FrequencyConfig> frequencyConfigs;

    @InterfaceC65349Pkn("ignore_api_ids")
    public volatile Set<Integer> ignoreApiIds;

    @InterfaceC65349Pkn("ignore_classes")
    public final List<String> ignoreClasses;

    @InterfaceC65349Pkn("intercept_ignore_api_ids")
    public final List<Integer> interceptIgnoreApiIds;

    @InterfaceC65349Pkn("interested_appops")
    public final List<String> interestedAppOps;

    @InterfaceC65349Pkn("network_config")
    public final NetworkConfig networkConfig;

    @InterfaceC65349Pkn("permission_check")
    public final boolean permissionCheck;

    @InterfaceC65349Pkn("sample_rate_config")
    public final SampleRateConfig sampleRateConfig;

    @InterfaceC65349Pkn("signal_config")
    public final SignalConfig signalConfig;

    @InterfaceC65349Pkn("storage_config")
    public final StorageConfig storageConfig;

    @InterfaceC65349Pkn("strict_mode_config")
    public final Map<String, StrictModeConfig> strictModeConfigs;

    @InterfaceC65349Pkn("test_env_channels")
    public final List<String> testEnvChannels;

    @InterfaceC65349Pkn("version")
    public final String version;

    public SettingsModel() {
        this(null, null, false, false, false, 0L, 0L, null, null, null, null, null, 0L, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, 1073741823, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SettingsModel)) {
            return false;
        }
        SettingsModel settingsModel = (SettingsModel) obj;
        return o.LJ(this.version, settingsModel.version) && o.LJ(this.abTag, settingsModel.abTag) && this.enabled == settingsModel.enabled && this.alogEnabled == settingsModel.alogEnabled && this.permissionCheck == settingsModel.permissionCheck && this.alogDuration == settingsModel.alogDuration && this.apiTimeOutDuration == settingsModel.apiTimeOutDuration && o.LJ(this.anchorConfigs, settingsModel.anchorConfigs) && o.LJ(this.testEnvChannels, settingsModel.testEnvChannels) && o.LJ(this.frequencyConfigs, settingsModel.frequencyConfigs) && o.LJ(this.interestedAppOps, settingsModel.interestedAppOps) && o.LJ(this.sampleRateConfig, settingsModel.sampleRateConfig) && this.backgroundFreezeDuration == settingsModel.backgroundFreezeDuration && o.LJ(this.binderConfig, settingsModel.binderConfig) && o.LJ(this.apiStatisticsConfigs, settingsModel.apiStatisticsConfigs) && o.LJ(this.interceptIgnoreApiIds, settingsModel.interceptIgnoreApiIds) && o.LJ(this.ignoreApiIds, settingsModel.ignoreApiIds) && o.LJ(this.ignoreClasses, settingsModel.ignoreClasses) && o.LJ(this.crpConfig, settingsModel.crpConfig) && this.appOpsIgnoreKnownApi == settingsModel.appOpsIgnoreKnownApi && o.LJ(this.customAnchor, settingsModel.customAnchor) && o.LJ(this.engineType, settingsModel.engineType) && o.LJ(this.errorWarningTypes, settingsModel.errorWarningTypes) && o.LJ(this.cacheConfig, settingsModel.cacheConfig) && o.LJ(this.checkAppScenes, settingsModel.checkAppScenes) && o.LJ(this.networkConfig, settingsModel.networkConfig) && o.LJ(this.storageConfig, settingsModel.storageConfig) && o.LJ(this.signalConfig, settingsModel.signalConfig) && o.LJ(this.strictModeConfigs, settingsModel.strictModeConfigs) && o.LJ(this.apiWhiteList, settingsModel.apiWhiteList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        String str = this.version;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.abTag;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        boolean z = this.enabled;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode2 + i) * 31;
        boolean z2 = this.alogEnabled;
        int i3 = z2;
        if (z2 != 0) {
            i3 = 1;
        }
        int i4 = (i2 + i3) * 31;
        boolean z3 = this.permissionCheck;
        int i5 = z3;
        if (z3 != 0) {
            i5 = 1;
        }
        long j = this.alogDuration;
        int i6 = (((i4 + i5) * 31) + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.apiTimeOutDuration;
        int i7 = (i6 + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        List<AnchorInfoModel> list = this.anchorConfigs;
        int hashCode3 = (i7 + (list != null ? list.hashCode() : 0)) * 31;
        List<String> list2 = this.testEnvChannels;
        int hashCode4 = (hashCode3 + (list2 != null ? list2.hashCode() : 0)) * 31;
        List<FrequencyConfig> list3 = this.frequencyConfigs;
        int hashCode5 = (hashCode4 + (list3 != null ? list3.hashCode() : 0)) * 31;
        List<String> list4 = this.interestedAppOps;
        int hashCode6 = (hashCode5 + (list4 != null ? list4.hashCode() : 0)) * 31;
        SampleRateConfig sampleRateConfig = this.sampleRateConfig;
        int hashCode7 = sampleRateConfig != null ? sampleRateConfig.hashCode() : 0;
        long j3 = this.backgroundFreezeDuration;
        int i8 = (((hashCode6 + hashCode7) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31;
        BinderConfig binderConfig = this.binderConfig;
        int hashCode8 = (i8 + (binderConfig != null ? binderConfig.hashCode() : 0)) * 31;
        List<ApiStatistics> list5 = this.apiStatisticsConfigs;
        int hashCode9 = (hashCode8 + (list5 != null ? list5.hashCode() : 0)) * 31;
        List<Integer> list6 = this.interceptIgnoreApiIds;
        int hashCode10 = (hashCode9 + (list6 != null ? list6.hashCode() : 0)) * 31;
        Set<Integer> set = this.ignoreApiIds;
        int hashCode11 = (hashCode10 + (set != null ? set.hashCode() : 0)) * 31;
        List<String> list7 = this.ignoreClasses;
        int hashCode12 = (hashCode11 + (list7 != null ? list7.hashCode() : 0)) * 31;
        CrpConfig crpConfig = this.crpConfig;
        int hashCode13 = (((hashCode12 + (crpConfig != null ? crpConfig.hashCode() : 0)) * 31) + (this.appOpsIgnoreKnownApi ? 1 : 0)) * 31;
        CustomAnchorConfig customAnchorConfig = this.customAnchor;
        int hashCode14 = (hashCode13 + (customAnchorConfig != null ? customAnchorConfig.hashCode() : 0)) * 31;
        String str3 = this.engineType;
        int hashCode15 = (hashCode14 + (str3 != null ? str3.hashCode() : 0)) * 31;
        Set<String> set2 = this.errorWarningTypes;
        int hashCode16 = (hashCode15 + (set2 != null ? set2.hashCode() : 0)) * 31;
        m mVar = this.cacheConfig;
        int hashCode17 = (hashCode16 + (mVar != null ? mVar.hashCode() : 0)) * 31;
        Set<String> set3 = this.checkAppScenes;
        int hashCode18 = (hashCode17 + (set3 != null ? set3.hashCode() : 0)) * 31;
        NetworkConfig networkConfig = this.networkConfig;
        int hashCode19 = (hashCode18 + (networkConfig != null ? networkConfig.hashCode() : 0)) * 31;
        StorageConfig storageConfig = this.storageConfig;
        int hashCode20 = (hashCode19 + (storageConfig != null ? storageConfig.hashCode() : 0)) * 31;
        SignalConfig signalConfig = this.signalConfig;
        int hashCode21 = (hashCode20 + (signalConfig != null ? signalConfig.hashCode() : 0)) * 31;
        Map<String, StrictModeConfig> map = this.strictModeConfigs;
        int hashCode22 = (hashCode21 + (map != null ? map.hashCode() : 0)) * 31;
        List<String> list8 = this.apiWhiteList;
        return hashCode22 + (list8 != null ? list8.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("EnvSettings(enabled=");
        LIZ.append(this.enabled);
        LIZ.append(", alogEnabled=");
        LIZ.append(this.alogEnabled);
        LIZ.append(", ");
        LIZ.append(", alogDuration=");
        LIZ.append(this.alogDuration);
        LIZ.append(", apiTimeOutDuration=");
        LIZ.append(this.apiTimeOutDuration);
        LIZ.append(", backgroundFreezeDuration=");
        LIZ.append(this.backgroundFreezeDuration);
        LIZ.append(", testEnvChannels=");
        LIZ.append(this.testEnvChannels);
        LIZ.append(", interestedAppOps=");
        LIZ.append(this.interestedAppOps);
        LIZ.append(", appOpsIgnoreKnownApi=");
        LIZ.append(this.appOpsIgnoreKnownApi);
        LIZ.append(", sampleRateConfig=");
        LIZ.append(this.sampleRateConfig);
        LIZ.append(", frequencyConfigs=");
        LIZ.append(this.frequencyConfigs);
        LIZ.append(", anchorConfigs=");
        LIZ.append(this.anchorConfigs);
        LIZ.append(", crpConfig=");
        LIZ.append(this.crpConfig);
        LIZ.append(", appOpsIgnoreKnownApi=");
        LIZ.append(this.appOpsIgnoreKnownApi);
        LIZ.append(", binderConfig=");
        LIZ.append(this.binderConfig);
        LIZ.append(", apiStatistics=");
        LIZ.append(this.apiStatisticsConfigs);
        LIZ.append(", customAnchor=");
        LIZ.append(this.customAnchor);
        LIZ.append(", engineType=");
        LIZ.append(this.engineType);
        LIZ.append(", errorWarningTypes=");
        LIZ.append(this.errorWarningTypes);
        LIZ.append(", strictModeConfigs=");
        LIZ.append(this.strictModeConfigs);
        LIZ.append(", networkConfig=");
        LIZ.append(this.networkConfig);
        LIZ.append(")");
        return X1D.LIZIZ(LIZ);
    }

    public SettingsModel(String version, String str, boolean z, boolean z2, boolean z3, long j, long j2, List<AnchorInfoModel> anchorConfigs, List<String> testEnvChannels, List<FrequencyConfig> frequencyConfigs, List<String> interestedAppOps, SampleRateConfig sampleRateConfig, long j3, BinderConfig binderConfig, List<ApiStatistics> apiStatisticsConfigs, List<Integer> interceptIgnoreApiIds, Set<Integer> ignoreApiIds, List<String> ignoreClasses, CrpConfig crpConfig, boolean z4, CustomAnchorConfig customAnchor, String engineType, Set<String> errorWarningTypes, m cacheConfig, Set<String> checkAppScenes, NetworkConfig networkConfig, StorageConfig storageConfig, SignalConfig signalConfig, Map<String, StrictModeConfig> strictModeConfigs, List<String> apiWhiteList) {
        o.LJIIIZ(version, "version");
        o.LJIIIZ(anchorConfigs, "anchorConfigs");
        o.LJIIIZ(testEnvChannels, "testEnvChannels");
        o.LJIIIZ(frequencyConfigs, "frequencyConfigs");
        o.LJIIIZ(interestedAppOps, "interestedAppOps");
        o.LJIIIZ(sampleRateConfig, "sampleRateConfig");
        o.LJIIIZ(binderConfig, "binderConfig");
        o.LJIIIZ(apiStatisticsConfigs, "apiStatisticsConfigs");
        o.LJIIIZ(interceptIgnoreApiIds, "interceptIgnoreApiIds");
        o.LJIIIZ(ignoreApiIds, "ignoreApiIds");
        o.LJIIIZ(ignoreClasses, "ignoreClasses");
        o.LJIIIZ(crpConfig, "crpConfig");
        o.LJIIIZ(customAnchor, "customAnchor");
        o.LJIIIZ(engineType, "engineType");
        o.LJIIIZ(errorWarningTypes, "errorWarningTypes");
        o.LJIIIZ(cacheConfig, "cacheConfig");
        o.LJIIIZ(checkAppScenes, "checkAppScenes");
        o.LJIIIZ(networkConfig, "networkConfig");
        o.LJIIIZ(storageConfig, "storageConfig");
        o.LJIIIZ(signalConfig, "signalConfig");
        o.LJIIIZ(strictModeConfigs, "strictModeConfigs");
        o.LJIIIZ(apiWhiteList, "apiWhiteList");
        this.version = version;
        this.abTag = str;
        this.enabled = z;
        this.alogEnabled = z2;
        this.permissionCheck = z3;
        this.alogDuration = j;
        this.apiTimeOutDuration = j2;
        this.anchorConfigs = anchorConfigs;
        this.testEnvChannels = testEnvChannels;
        this.frequencyConfigs = frequencyConfigs;
        this.interestedAppOps = interestedAppOps;
        this.sampleRateConfig = sampleRateConfig;
        this.backgroundFreezeDuration = j3;
        this.binderConfig = binderConfig;
        this.apiStatisticsConfigs = apiStatisticsConfigs;
        this.interceptIgnoreApiIds = interceptIgnoreApiIds;
        this.ignoreApiIds = ignoreApiIds;
        this.ignoreClasses = ignoreClasses;
        this.crpConfig = crpConfig;
        this.appOpsIgnoreKnownApi = z4;
        this.customAnchor = customAnchor;
        this.engineType = engineType;
        this.errorWarningTypes = errorWarningTypes;
        this.cacheConfig = cacheConfig;
        this.checkAppScenes = checkAppScenes;
        this.networkConfig = networkConfig;
        this.storageConfig = storageConfig;
        this.signalConfig = signalConfig;
        this.strictModeConfigs = strictModeConfigs;
        this.apiWhiteList = apiWhiteList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SettingsModel(String str, String str2, boolean z, boolean z2, boolean z3, long j, long j2, List list, List list2, List list3, List list4, SampleRateConfig sampleRateConfig, long j3, BinderConfig binderConfig, List list5, List list6, Set set, List list7, CrpConfig crpConfig, boolean z4, CustomAnchorConfig customAnchorConfig, String str3, Set set2, m mVar, Set set3, NetworkConfig networkConfig, StorageConfig storageConfig, SignalConfig signalConfig, Map map, List list8, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "default" : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? false : z, (i & 8) != 0 ? false : z2, (i & 16) != 0 ? false : z3, (i & 32) != 0 ? TimeUnit.HOURS.toMillis(2L) : j, (i & 64) != 0 ? TimeUnit.SECONDS.toMillis(6L) : j2, (i & 128) != 0 ? C61878OQg.INSTANCE : list, (i & 256) != 0 ? C47261Igj.LJJIJIIJI("snpqa_permission_test", "tools_autotest", "local_test", "autotest", "monkey", "qtp") : list2, (i & 512) != 0 ? C61878OQg.INSTANCE : list3, (i & 1024) != 0 ? C61878OQg.INSTANCE : list4, (i & 2048) != 0 ? new SampleRateConfig(false, LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, null, null, null, 2047, null) : sampleRateConfig, (i & 4096) != 0 ? TimeUnit.SECONDS.toMillis(2L) : j3, (i & FileUtils.BUFFER_SIZE) != 0 ? new BinderConfig(false, null, null, null, 15, null) : binderConfig, (i & 16384) != 0 ? C61878OQg.INSTANCE : list5, (32768 & i) != 0 ? C61878OQg.INSTANCE : list6, (65536 & i) != 0 ? OQY.INSTANCE : set, (131072 & i) != 0 ? C61878OQg.INSTANCE : list7, (262144 & i) != 0 ? new CrpConfig(0L, 0L, 3, null) : crpConfig, (524288 & i) != 0 ? false : z4, (1048576 & i) != 0 ? new CustomAnchorConfig(false, 0L, null, 7, null == true ? 1 : 0) : customAnchorConfig, (2097152 & i) != 0 ? "rule_engine" : str3, (4194304 & i) != 0 ? C77275UUl.LJ("pair_not_close", "pair_delay_close", "CustomAnchor", "no_permission") : set2, (8388608 & i) != 0 ? new m() : mVar, (16777216 & i) != 0 ? new LinkedHashSet() : set3, (33554432 & i) != 0 ? new NetworkConfig(false, false, 0L, 0L, null, null, null, null, null, 0L, 0L, LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, null, null, null, LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, null, false, false, LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, null, null, null, 8388607, null) : networkConfig, (67108864 & i) != 0 ? new StorageConfig(LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, 0, null == true ? 1 : 0, null == true ? 1 : 0, null, null == true ? 1 : 0, 63, null == true ? 1 : 0) : storageConfig, (134217728 & i) != 0 ? new SignalConfig(false, 0, null, false, null, null, 63, null) : signalConfig, (268435456 & i) != 0 ? C51029K0z.LJJIIZI(new OSZ("kids_mode_overseas_scene", new StrictModeConfig(C47261Igj.LJJIJIIJI(102003, 102004, 103000), null, 2, null))) : map, (i & 536870912) != 0 ? C61878OQg.INSTANCE : list8);
    }
}
