package com.byted.cast.common.api;

import android.text.TextUtils;

/* loaded from: classes29.dex */
public class UrlConfig {
    public String iv;
    public String key;
    public String path;
    public String remoteIp;
    public String token;
    public String url;
    public int urlType;

    /* loaded from: classes29.dex */
    public static class LocalUrlBuilder extends BaseUrlBuilder {
        @Override // com.byted.cast.common.api.UrlConfig.BaseUrlBuilder
        public UrlConfig build() {
            if (!TextUtils.isEmpty(this.urlConfig.path)) {
                return super.build();
            }
            throw new RuntimeException("Please use the setPath method to set the file path");
        }

        public LocalUrlBuilder() {
            this.urlConfig.urlType = 6;
        }

        public LocalUrlBuilder setPath(String str) {
            this.urlConfig.path = str;
            return this;
        }

        public LocalUrlBuilder setParams(String str, String str2) {
            UrlConfig urlConfig = this.urlConfig;
            urlConfig.path = str;
            urlConfig.remoteIp = str2;
            return this;
        }
    }

    /* loaded from: classes29.dex */
    public static class ProxyBuilder extends BaseUrlBuilder {
        @Override // com.byted.cast.common.api.UrlConfig.BaseUrlBuilder
        public UrlConfig build() {
            if (!TextUtils.isEmpty(this.urlConfig.remoteIp) && !TextUtils.isEmpty(this.urlConfig.url)) {
                return super.build();
            }
            throw new RuntimeException("Please use the setParams method to set proxy parameters");
        }

        public ProxyBuilder setParams(String str, String str2, String str3) {
            UrlConfig urlConfig = this.urlConfig;
            urlConfig.urlType = 4;
            urlConfig.remoteIp = str;
            urlConfig.url = str2;
            urlConfig.token = str3;
            return this;
        }

        public ProxyBuilder setParams(String str, String str2, String str3, String str4) {
            UrlConfig urlConfig = this.urlConfig;
            urlConfig.urlType = 5;
            urlConfig.remoteIp = str;
            urlConfig.url = str2;
            urlConfig.key = str3;
            urlConfig.iv = str4;
            return this;
        }
    }

    /* loaded from: classes29.dex */
    public static class BaseUrlBuilder {
        public UrlConfig urlConfig;

        public BaseUrlBuilder() {
            this.urlConfig = new UrlConfig();
        }

        public UrlConfig build() {
            return this.urlConfig;
        }
    }

    /* loaded from: classes29.dex */
    public static class FlvBuilder extends BaseUrlBuilder {
        public FlvBuilder() {
            this.urlConfig.urlType = 2;
        }

        @Override // com.byted.cast.common.api.UrlConfig.BaseUrlBuilder
        public /* bridge */ /* synthetic */ UrlConfig build() {
            return super.build();
        }
    }

    /* loaded from: classes29.dex */
    public static class HttpBuilder extends BaseUrlBuilder {
        public HttpBuilder() {
            this.urlConfig.urlType = 3;
        }

        @Override // com.byted.cast.common.api.UrlConfig.BaseUrlBuilder
        public /* bridge */ /* synthetic */ UrlConfig build() {
            return super.build();
        }
    }

    /* loaded from: classes29.dex */
    public static class RtmpBuilder extends BaseUrlBuilder {
        public RtmpBuilder() {
            this.urlConfig.urlType = 1;
        }

        @Override // com.byted.cast.common.api.UrlConfig.BaseUrlBuilder
        public /* bridge */ /* synthetic */ UrlConfig build() {
            return super.build();
        }
    }

    public UrlConfig() {
    }

    public String getIv() {
        return this.iv;
    }

    public String getKey() {
        return this.key;
    }

    public String getPath() {
        return this.path;
    }

    public String getRemoteIp() {
        return this.remoteIp;
    }

    public String getToken() {
        return this.token;
    }

    public String getUrl() {
        return this.url;
    }

    public int getUrlType() {
        return this.urlType;
    }
}
