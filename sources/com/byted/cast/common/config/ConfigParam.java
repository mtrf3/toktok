package com.byted.cast.common.config;

import X.X1D;
import android.text.TextUtils;
import com.byted.cast.common.config.pojo.CollectInfo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes29.dex */
public final class ConfigParam {
    public Map<String, String> mCastParamsMap;
    public List<CollectInfo> mGrayCollectInfos;
    public List<String> mGrayFeatureKeys;

    /* loaded from: classes29.dex */
    public static class CastConfigBuilder extends BaseBuilder {
        @Override // com.byted.cast.common.config.ConfigParam.BaseBuilder
        public ConfigParam build() {
            ConfigParam configParam = new ConfigParam();
            Map<String, Object> map = this.mParamsMap;
            if (map != null && map.size() != 0) {
                for (Map.Entry<String, Object> entry : this.mParamsMap.entrySet()) {
                    if (entry != null && !TextUtils.isEmpty(entry.getKey()) && (entry.getValue() instanceof String)) {
                        configParam.appendCastConfigParam(entry.getKey(), (String) entry.getValue());
                    }
                }
            }
            return configParam;
        }

        @Override // com.byted.cast.common.config.ConfigParam.BaseBuilder
        public /* bridge */ /* synthetic */ BaseBuilder appendParams(Map map) {
            appendParams((Map<String, Object>) map);
            return this;
        }

        @Override // com.byted.cast.common.config.ConfigParam.BaseBuilder
        public CastConfigBuilder appendParams(Map<String, Object> map) {
            super.appendParams(map);
            return this;
        }

        @Override // com.byted.cast.common.config.ConfigParam.BaseBuilder
        public /* bridge */ /* synthetic */ BaseBuilder appendParam(String str, Object obj) {
            appendParam(str, obj);
            return this;
        }

        @Override // com.byted.cast.common.config.ConfigParam.BaseBuilder
        public CastConfigBuilder appendParam(String str, Object obj) {
            super.appendParam(str, obj);
            return this;
        }
    }

    /* loaded from: classes29.dex */
    public static class GrayConfigBuilder extends BaseBuilder {
        @Override // com.byted.cast.common.config.ConfigParam.BaseBuilder
        public ConfigParam build() {
            ConfigParam configParam = new ConfigParam();
            Map<String, Object> map = this.mParamsMap;
            if (map != null && map.size() != 0) {
                for (Map.Entry<String, Object> entry : this.mParamsMap.entrySet()) {
                    if (entry != null) {
                        String key = entry.getKey();
                        if (!TextUtils.isEmpty(key)) {
                            Object value = entry.getValue();
                            if (key.startsWith("GRAY_CONFIG_FEATURE_KEY") && (value instanceof String)) {
                                configParam.appendGrayConfigFeatureKey((String) value);
                            } else {
                                configParam.appendGrayConfigCollectInfo(key, value);
                            }
                        }
                    }
                }
            }
            return configParam;
        }

        public GrayConfigBuilder appendFeatureKey(String str) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("GRAY_CONFIG_FEATURE_KEY_");
            LIZ.append(this.mParamsMap.size());
            appendParam(X1D.LIZIZ(LIZ), (Object) str);
            return this;
        }

        public GrayConfigBuilder appendFeatureKeys(List<String> list) {
            if (list != null && list.size() > 0) {
                for (String str : list) {
                    if (!TextUtils.isEmpty(str)) {
                        appendFeatureKey(str);
                    }
                }
            }
            return this;
        }

        @Override // com.byted.cast.common.config.ConfigParam.BaseBuilder
        public /* bridge */ /* synthetic */ BaseBuilder appendParams(Map map) {
            appendParams((Map<String, Object>) map);
            return this;
        }

        @Override // com.byted.cast.common.config.ConfigParam.BaseBuilder
        public GrayConfigBuilder appendParams(Map<String, Object> map) {
            super.appendParams(map);
            return this;
        }

        @Override // com.byted.cast.common.config.ConfigParam.BaseBuilder
        public /* bridge */ /* synthetic */ BaseBuilder appendParam(String str, Object obj) {
            appendParam(str, obj);
            return this;
        }

        @Override // com.byted.cast.common.config.ConfigParam.BaseBuilder
        public GrayConfigBuilder appendParam(String str, Object obj) {
            super.appendParam(str, obj);
            return this;
        }
    }

    /* loaded from: classes29.dex */
    public static abstract class BaseBuilder {
        public Map<String, Object> mParamsMap;

        public abstract ConfigParam build();

        public BaseBuilder() {
            this.mParamsMap = new HashMap();
        }

        public BaseBuilder appendParams(Map<String, Object> map) {
            if (map != null && map.size() != 0) {
                this.mParamsMap.putAll(map);
            }
            return this;
        }

        public BaseBuilder appendParam(String str, Object obj) {
            if (!TextUtils.isEmpty(str)) {
                this.mParamsMap.put(str, obj);
            }
            return this;
        }
    }

    public ConfigParam() {
    }

    public Map<String, String> getCastConfigParams() {
        return this.mCastParamsMap;
    }

    public List<CollectInfo> getGrayConfigCollectInfos() {
        return this.mGrayCollectInfos;
    }

    public List<String> getGrayConfigFeatureKeys() {
        return this.mGrayFeatureKeys;
    }

    public void appendGrayConfigFeatureKey(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (this.mGrayFeatureKeys == null) {
            this.mGrayFeatureKeys = new ArrayList();
        }
        this.mGrayFeatureKeys.add(str);
    }

    public void appendCastConfigParam(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (this.mCastParamsMap == null) {
            this.mCastParamsMap = new HashMap();
        }
        this.mCastParamsMap.put(str, str2);
    }

    public void appendGrayConfigCollectInfo(String str, Object obj) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (this.mGrayCollectInfos == null) {
            this.mGrayCollectInfos = new ArrayList();
        }
        this.mGrayCollectInfos.add(new CollectInfo(str, obj));
    }
}
