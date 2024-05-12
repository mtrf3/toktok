package com.ss.android.ugc.aweme.poi_api.experiment;

import X.C16880lQ;
import X.C47135Ieh;
import X.C47959Irz;
import X.C51556KLg;
import X.C64707PaR;
import X.InterfaceC65349Pkn;
import X.JBR;
import X.X1D;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.agilelogger.ALog;
import defpackage.b0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class PoiEnableExperiment {

    /* loaded from: classes4.dex */
    public static final class Config {

        @InterfaceC65349Pkn("enable")
        public final boolean enable;

        @InterfaceC65349Pkn("location_cache_time")
        public final int locationCacheTime;

        @InterfaceC65349Pkn("location_map_settings")
        public final String mapKey;

        @InterfaceC65349Pkn("map_size_scale")
        public final float mapSizeScale;

        @InterfaceC65349Pkn("poi_aweme_cache_count")
        public final long poiAwemeCacheCount;

        @InterfaceC65349Pkn("poi_service_settings")
        public final String poiKey;

        @InterfaceC65349Pkn("poi_sdk_config")
        public PoiSdkConfig poiSdkConfig;

        @InterfaceC65349Pkn("static_map_url")
        public final String staticMapUrl;

        @InterfaceC65349Pkn("waze_url")
        public final String wazeUrl;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Config)) {
                return false;
            }
            Config config = (Config) obj;
            return this.enable == config.enable && o.LJ(this.poiKey, config.poiKey) && o.LJ(this.mapKey, config.mapKey) && this.locationCacheTime == config.locationCacheTime && o.LJ(this.wazeUrl, config.wazeUrl) && o.LJ(this.staticMapUrl, config.staticMapUrl) && Float.compare(this.mapSizeScale, config.mapSizeScale) == 0 && this.poiAwemeCacheCount == config.poiAwemeCacheCount && o.LJ(this.poiSdkConfig, config.poiSdkConfig);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [int] */
        /* JADX WARN: Type inference failed for: r0v21 */
        /* JADX WARN: Type inference failed for: r0v22 */
        public final int hashCode() {
            int hashCode;
            int hashCode2;
            int hashCode3;
            boolean z = this.enable;
            ?? r0 = z;
            if (z) {
                r0 = 1;
            }
            int i = r0 * 31;
            String str = this.poiKey;
            int i2 = 0;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            int i3 = (i + hashCode) * 31;
            String str2 = this.mapKey;
            if (str2 == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = str2.hashCode();
            }
            int i4 = (((i3 + hashCode2) * 31) + this.locationCacheTime) * 31;
            String str3 = this.wazeUrl;
            if (str3 == null) {
                hashCode3 = 0;
            } else {
                hashCode3 = str3.hashCode();
            }
            int i5 = (i4 + hashCode3) * 31;
            String str4 = this.staticMapUrl;
            if (str4 != null) {
                i2 = str4.hashCode();
            }
            return this.poiSdkConfig.hashCode() + JBR.LIZJ(this.poiAwemeCacheCount, C47959Irz.LIZIZ(this.mapSizeScale, (i5 + i2) * 31, 31), 31);
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Config(enable=");
            LIZ.append(this.enable);
            LIZ.append(", poiKey=");
            LIZ.append(this.poiKey);
            LIZ.append(", mapKey=");
            LIZ.append(this.mapKey);
            LIZ.append(", locationCacheTime=");
            return b0.LIZJ(LIZ, this.locationCacheTime, ')', LIZ);
        }

        public Config(boolean z, String str, String str2, int i, String str3, String str4, float f, long j, PoiSdkConfig poiSdkConfig) {
            o.LJIIIZ(poiSdkConfig, "poiSdkConfig");
            this.enable = z;
            this.poiKey = str;
            this.mapKey = str2;
            this.locationCacheTime = i;
            this.wazeUrl = str3;
            this.staticMapUrl = str4;
            this.mapSizeScale = f;
            this.poiAwemeCacheCount = j;
            this.poiSdkConfig = poiSdkConfig;
        }

        public /* synthetic */ Config(boolean z, String str, String str2, int i, String str3, String str4, float f, long j, PoiSdkConfig poiSdkConfig, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(z, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? null : str2, (i2 & 8) != 0 ? 3600000 : i, (i2 & 16) != 0 ? null : str3, (i2 & 32) != 0 ? null : str4, (i2 & 64) != 0 ? 1.0f : f, (i2 & 128) != 0 ? 1L : j, (i2 & 256) != 0 ? new PoiSdkConfig(0L, 1, null) : poiSdkConfig);
        }
    }

    /* loaded from: classes4.dex */
    public static final class PoiSdkConfig {

        @InterfaceC65349Pkn("poi_cache_valid_time")
        public long poiCacheValidTime;

        public PoiSdkConfig() {
            this(0L, 1, null);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PoiSdkConfig) && this.poiCacheValidTime == ((PoiSdkConfig) obj).poiCacheValidTime;
        }

        public final int hashCode() {
            return C16880lQ.LLJIJIL(this.poiCacheValidTime);
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("PoiSdkConfig(poiCacheValidTime=");
            return C47135Ieh.LIZIZ(LIZ, this.poiCacheValidTime, ')', LIZ);
        }

        public PoiSdkConfig(long j) {
            this.poiCacheValidTime = j;
        }

        public /* synthetic */ PoiSdkConfig(long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? 86400L : j);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Config LIZ() {
        Config config = (Config) SettingsManager.LIZLLL().LJIIIIZZ("poi_config", Config.class, null);
        if (config == null) {
            Object[] objArr = 0 == true ? 1 : 0;
            return new Config(false, null, 0 == true ? 1 : 0, objArr, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0.0f, 0L, 0 == true ? 1 : 0, 510, 0 == true ? 1 : 0);
        }
        return config;
    }

    public static boolean LIZIZ() {
        String str;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("poi_config enable:");
        LIZ.append(LIZ().enable);
        LIZ.append(" ; regionCode = ");
        C51556KLg.LIZ.getClass();
        String str2 = C64707PaR.LIZJ;
        if (str2 != null) {
            str = str2.toLowerCase();
            o.LJIIIIZZ(str, "this as java.lang.String).toLowerCase()");
        } else {
            str = "";
        }
        LIZ.append(str);
        ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogI("poi", X1D.LIZIZ(LIZ));
        return LIZ().enable;
    }
}
