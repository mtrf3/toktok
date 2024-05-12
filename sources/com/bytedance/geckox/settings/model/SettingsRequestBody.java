package com.bytedance.geckox.settings.model;

import X.InterfaceC65349Pkn;
import com.bytedance.geckox.model.Common;
import java.util.Map;

/* loaded from: classes11.dex */
public class SettingsRequestBody {

    @InterfaceC65349Pkn("common")
    public Common common;

    @InterfaceC65349Pkn("custom")
    public Map<String, Map<String, Object>> custom;

    @InterfaceC65349Pkn("settings")
    public Settings settings;

    /* loaded from: classes11.dex */
    public static class Settings {

        @InterfaceC65349Pkn("env")
        public int env;

        @InterfaceC65349Pkn("version")
        public int version;

        public int getEnv() {
            return this.env;
        }

        public int getVersion() {
            return this.version;
        }

        public Settings(int i, int i2) {
            this.version = i;
            this.env = i2;
        }
    }

    public Common getCommon() {
        return this.common;
    }

    public Map<String, Map<String, Object>> getCustom() {
        return this.custom;
    }

    public Settings getSettings() {
        return this.settings;
    }

    public void setCommon(Common common) {
        this.common = common;
    }

    public void setCustom(Map<String, Map<String, Object>> map) {
        this.custom = map;
    }

    public void setSettings(Settings settings) {
        this.settings = settings;
    }
}
