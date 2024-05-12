package com.bytedance.ies.ugc.aweme.network.zstd;

import X.C15890jp;
import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class ZstdDictSetting {
    public static final /* synthetic */ int LIZ = 0;

    /* loaded from: classes2.dex */
    public static final class DictUrl {

        @InterfaceC65349Pkn("checksum")
        public final String checksum;

        @InterfaceC65349Pkn("url")
        public final String url;

        /* JADX WARN: Multi-variable type inference failed */
        public DictUrl() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DictUrl)) {
                return false;
            }
            DictUrl dictUrl = (DictUrl) obj;
            return o.LJ(this.url, dictUrl.url) && o.LJ(this.checksum, dictUrl.checksum);
        }

        public final int hashCode() {
            String str = this.url;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.checksum;
            return hashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("DictUrl(url=");
            LIZ.append(this.url);
            LIZ.append(", checksum=");
            return q.LIZIZ(LIZ, this.checksum, ')', LIZ);
        }

        public DictUrl(String str, String str2) {
            this.url = str;
            this.checksum = str2;
        }

        public /* synthetic */ DictUrl(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
        }
    }

    /* loaded from: classes2.dex */
    public static final class ZstdDictConfig {

        @InterfaceC65349Pkn("path")
        public final Map<String, String> path;

        @InterfaceC65349Pkn("version_url")
        public final Map<String, DictUrl> versionUrl;

        /* JADX WARN: Multi-variable type inference failed */
        public ZstdDictConfig() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ZstdDictConfig)) {
                return false;
            }
            ZstdDictConfig zstdDictConfig = (ZstdDictConfig) obj;
            return o.LJ(this.path, zstdDictConfig.path) && o.LJ(this.versionUrl, zstdDictConfig.versionUrl);
        }

        public final int hashCode() {
            Map<String, String> map = this.path;
            int hashCode = (map == null ? 0 : map.hashCode()) * 31;
            Map<String, DictUrl> map2 = this.versionUrl;
            return hashCode + (map2 != null ? map2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("ZstdDictConfig(path=");
            LIZ.append(this.path);
            LIZ.append(", versionUrl=");
            return C15890jp.LIZ(LIZ, this.versionUrl, ')', LIZ);
        }

        public ZstdDictConfig(Map<String, String> map, Map<String, DictUrl> map2) {
            this.path = map;
            this.versionUrl = map2;
        }

        public /* synthetic */ ZstdDictConfig(Map map, Map map2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : map, (i & 2) != 0 ? null : map2);
        }
    }

    /* loaded from: classes2.dex */
    public static final class ZstdDictConfigWrapper {

        @InterfaceC65349Pkn("zstd_dict")
        public final ZstdDictConfig config;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ZstdDictConfigWrapper) && o.LJ(this.config, ((ZstdDictConfigWrapper) obj).config);
        }

        public final int hashCode() {
            return this.config.hashCode();
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("ZstdDictConfigWrapper(config=");
            LIZ.append(this.config);
            LIZ.append(')');
            return X1D.LIZIZ(LIZ);
        }

        public ZstdDictConfigWrapper(ZstdDictConfig config) {
            o.LJIIIZ(config, "config");
            this.config = config;
        }
    }
}
