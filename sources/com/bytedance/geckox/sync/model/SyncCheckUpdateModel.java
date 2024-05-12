package com.bytedance.geckox.sync.model;

import X.InterfaceC65349Pkn;
import java.util.List;
import java.util.Map;

/* loaded from: classes9.dex */
public class SyncCheckUpdateModel {

    @InterfaceC65349Pkn("config")
    public Map<String, SyncChannelModel> config;

    /* loaded from: classes9.dex */
    public static class SyncChannelModel {

        @InterfaceC65349Pkn("custom_keys")
        public List<String> customKeys;

        @InterfaceC65349Pkn("group")
        public String group;

        @InterfaceC65349Pkn("target_chs")
        public List<String> targetChannel;

        public List<String> getCustomKeys() {
            return this.customKeys;
        }

        public String getGroup() {
            return this.group;
        }

        public List<String> getTargetChannel() {
            return this.targetChannel;
        }

        public void setCustomKeys(List<String> list) {
            this.customKeys = list;
        }

        public void setGroup(String str) {
            this.group = str;
        }

        public void setTargetChannel(List<String> list) {
            this.targetChannel = list;
        }
    }

    public Map<String, SyncChannelModel> getConfig() {
        return this.config;
    }

    public void setConfig(Map<String, SyncChannelModel> map) {
        this.config = map;
    }
}
