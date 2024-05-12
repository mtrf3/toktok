package com.bytedance.geckox.settings.model;

import X.InterfaceC65349Pkn;
import X.V0N;
import java.util.List;
import java.util.Map;

/* loaded from: classes11.dex */
public class GlobalConfigSettings {

    @InterfaceC65349Pkn("settings_config")
    public GlobalConfig globalConfig;

    @InterfaceC65349Pkn("req_meta")
    public ReqMeta reqMeta;

    @InterfaceC65349Pkn("resource_meta")
    public ResourceMeta resourceMeta;

    @InterfaceC65349Pkn("version")
    public int version;

    /* loaded from: classes11.dex */
    public static class AccessKeyMetaInfo {

        @InterfaceC65349Pkn("channels")
        public Map<String, ChannelMetaInfo> channels;

        @InterfaceC65349Pkn("config")
        public CurrentLevelConfig config;

        public Map<String, ChannelMetaInfo> getChannels() {
            return this.channels;
        }

        public CurrentLevelConfig getConfig() {
            return this.config;
        }
    }

    /* loaded from: classes11.dex */
    public static class CDNFallBackConfig {

        @InterfaceC65349Pkn("domains")
        public List<String> domains;

        @InterfaceC65349Pkn("max_attempts")
        public int maxAttempts;

        @InterfaceC65349Pkn("shuffle")
        public int shuffle;

        public List<String> getDomains() {
            return this.domains;
        }

        public int getMaxAttempts() {
            return this.maxAttempts;
        }

        public int getShuffle() {
            return this.shuffle;
        }
    }

    /* loaded from: classes11.dex */
    public static class CDNMultiVersion {

        @InterfaceC65349Pkn("domains")
        public List<String> domains;

        public List<String> getDomains() {
            return this.domains;
        }
    }

    /* loaded from: classes11.dex */
    public static class ChannelMetaInfo {

        @InterfaceC65349Pkn("config")
        public CurrentLevelConfig config;

        public CurrentLevelConfig getConfig() {
            return this.config;
        }
    }

    /* loaded from: classes11.dex */
    public static class CurrentLevelConfig {

        @InterfaceC65349Pkn("cdn_fallback")
        public CDNFallBackConfig cdnFallback;

        @InterfaceC65349Pkn("cdn_multi_version")
        public CDNMultiVersion cdnMultiVersion;

        @InterfaceC65349Pkn("pipeline")
        public List<PipelineStep> pipeline;

        @InterfaceC65349Pkn("prefix_2_ak")
        public Map<String, String> prefix2AccessKey;

        public CDNMultiVersion getCDNMultiVersion() {
            return this.cdnMultiVersion;
        }

        public CDNFallBackConfig getCdnFallback() {
            return this.cdnFallback;
        }

        public List<PipelineStep> getPipeline() {
            return this.pipeline;
        }

        public Map<String, String> getPrefix2AccessKey() {
            return this.prefix2AccessKey;
        }
    }

    /* loaded from: classes11.dex */
    public static class GeckoPollingConfig {

        @InterfaceC65349Pkn("combine")
        public List<SyncItem> combine;

        @InterfaceC65349Pkn("interval")
        public int interval;

        public List<SyncItem> getCombine() {
            return this.combine;
        }

        public int getInterval() {
            return this.interval;
        }
    }

    /* loaded from: classes11.dex */
    public static class GlobalConfig {

        @InterfaceC65349Pkn("check_update")
        public SettingsPollingConfig checkUpdate;

        @InterfaceC65349Pkn("host_app_id")
        public List<String> hostAppId;

        @InterfaceC65349Pkn("poll_enable")
        public int pollEnable;

        public SettingsPollingConfig getCheckUpdate() {
            return this.checkUpdate;
        }

        public List<String> getHostAppId() {
            return this.hostAppId;
        }

        public int getPollEnable() {
            return this.pollEnable;
        }
    }

    /* loaded from: classes11.dex */
    public static class LazyItem {

        @InterfaceC65349Pkn("channels")
        public List<String> channels;

        @InterfaceC65349Pkn("groups")
        public List<String> groups;

        public List<String> getChannels() {
            return this.channels;
        }

        public List<String> getGroups() {
            return this.groups;
        }
    }

    /* loaded from: classes11.dex */
    public static class PipelineStep {

        @InterfaceC65349Pkn("no_cache")
        public int noCache;

        @InterfaceC65349Pkn("type")
        public int type;

        @InterfaceC65349Pkn("update")
        public int update;

        public int getNoCache() {
            return this.noCache;
        }

        public int getType() {
            return this.type;
        }

        public int getUpdate() {
            return this.update;
        }
    }

    /* loaded from: classes11.dex */
    public enum PipelineType {
        GECKO(1),
        CDN(2),
        BUILTIN(3);

        public int val;

        public int getVal() {
            return this.val;
        }

        public static PipelineType valueOf(String str) {
            return (PipelineType) V0N.LJJJ(PipelineType.class, str);
        }

        PipelineType(int i) {
            this.val = i;
        }
    }

    /* loaded from: classes11.dex */
    public static class ReqMeta {

        @InterfaceC65349Pkn("aks")
        public List<String> aks;

        @InterfaceC65349Pkn("check_update")
        public Map<String, GeckoPollingConfig> checkUpdate;

        @InterfaceC65349Pkn("enable")
        public int enable;

        @InterfaceC65349Pkn("fre_control_enable")
        public int freControlEnable;

        @InterfaceC65349Pkn("lazy")
        public Map<String, LazyItem> lazy;

        @InterfaceC65349Pkn("poll_enable")
        public int pollEnable;

        @InterfaceC65349Pkn("queue")
        public List<RequestConfig> queue;

        public List<String> getAks() {
            return this.aks;
        }

        public Map<String, GeckoPollingConfig> getCheckUpdate() {
            return this.checkUpdate;
        }

        public int getEnable() {
            return this.enable;
        }

        public int getFreControlEnable() {
            return this.freControlEnable;
        }

        public Map<String, LazyItem> getLazy() {
            return this.lazy;
        }

        public int getPollEnable() {
            return this.pollEnable;
        }

        public List<RequestConfig> getQueue() {
            return this.queue;
        }
    }

    /* loaded from: classes11.dex */
    public static class RequestConfig {

        @InterfaceC65349Pkn("delay")
        public long delay;

        @InterfaceC65349Pkn("sync")
        public List<SyncItem> sync;

        public long getDelay() {
            return this.delay;
        }

        public List<SyncItem> getSync() {
            return this.sync;
        }
    }

    /* loaded from: classes11.dex */
    public static class ResourceMeta {

        @InterfaceC65349Pkn("access_keys")
        public Map<String, AccessKeyMetaInfo> accessKeys;

        @InterfaceC65349Pkn("config")
        public CurrentLevelConfig config;

        public Map<String, AccessKeyMetaInfo> getAccessKeys() {
            return this.accessKeys;
        }

        public CurrentLevelConfig getConfig() {
            return this.config;
        }
    }

    /* loaded from: classes11.dex */
    public static class SettingsPollingConfig {

        @InterfaceC65349Pkn("interval")
        public long interval;

        public long getInterval() {
            return this.interval;
        }
    }

    /* loaded from: classes11.dex */
    public static class SyncItem {

        @InterfaceC65349Pkn("ak")
        public String ak;

        @InterfaceC65349Pkn("group")
        public List<String> group;

        @InterfaceC65349Pkn("target")
        public List<String> target;

        public SyncItem() {
        }

        public String getAccessKey() {
            return this.ak;
        }

        public List<String> getGroup() {
            return this.group;
        }

        public List<String> getTarget() {
            return this.target;
        }

        public SyncItem(String str, List<String> list, List<String> list2) {
            this.ak = str;
            this.group = list;
            this.target = list2;
        }
    }

    public GlobalConfig getGlobalConfig() {
        return this.globalConfig;
    }

    public ReqMeta getReqMeta() {
        return this.reqMeta;
    }

    public ResourceMeta getResourceMeta() {
        return this.resourceMeta;
    }

    public int getVersion() {
        return this.version;
    }
}
