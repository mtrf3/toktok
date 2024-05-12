package com.ss.android.ugc.aweme.poi.detail.config;

import X.C1NE;
import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.i0;
import defpackage.q;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class PoiDetailConfig {
    public static final /* synthetic */ int LIZ = 0;

    /* loaded from: classes2.dex */
    public static final class Config {

        @InterfaceC65349Pkn("poi_detail_video_list_config")
        public final List<PoiDetailVideoListConfig> poiDetailVideoListConfig;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Config) && o.LJ(this.poiDetailVideoListConfig, ((Config) obj).poiDetailVideoListConfig);
        }

        public final int hashCode() {
            return this.poiDetailVideoListConfig.hashCode();
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Config(poiDetailVideoListConfig=");
            return C1NE.LIZIZ(LIZ, this.poiDetailVideoListConfig, ')', LIZ);
        }

        public Config(List<PoiDetailVideoListConfig> poiDetailVideoListConfig) {
            o.LJIIIZ(poiDetailVideoListConfig, "poiDetailVideoListConfig");
            this.poiDetailVideoListConfig = poiDetailVideoListConfig;
        }
    }

    /* loaded from: classes4.dex */
    public static final class PoiDetailVideoListConfig {

        @InterfaceC65349Pkn("fetch_count")
        public final int poiDetailVideoFetchCount;

        @InterfaceC65349Pkn("search_api")
        public final String poiDetailVideoSearchApi;

        @InterfaceC65349Pkn("two_column")
        public final int poiDetailVideoTwoColumn;

        @InterfaceC65349Pkn("type_level")
        public final String typeLevel;

        /* JADX WARN: Illegal instructions before constructor call */
        /* JADX WARN: Multi-variable type inference failed */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public PoiDetailVideoListConfig() {
            /*
                r7 = this;
                r1 = 0
                r2 = 0
                r5 = 15
                r0 = r7
                r3 = r1
                r4 = r2
                r6 = r2
                r0.<init>(r1, r2, r3, r4, r5, r6)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.detail.config.PoiDetailConfig.PoiDetailVideoListConfig.<init>():void");
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PoiDetailVideoListConfig)) {
                return false;
            }
            PoiDetailVideoListConfig poiDetailVideoListConfig = (PoiDetailVideoListConfig) obj;
            return this.poiDetailVideoTwoColumn == poiDetailVideoListConfig.poiDetailVideoTwoColumn && o.LJ(this.poiDetailVideoSearchApi, poiDetailVideoListConfig.poiDetailVideoSearchApi) && this.poiDetailVideoFetchCount == poiDetailVideoListConfig.poiDetailVideoFetchCount && o.LJ(this.typeLevel, poiDetailVideoListConfig.typeLevel);
        }

        public final int hashCode() {
            int i = this.poiDetailVideoTwoColumn * 31;
            String str = this.poiDetailVideoSearchApi;
            int hashCode = (((i + (str == null ? 0 : str.hashCode())) * 31) + this.poiDetailVideoFetchCount) * 31;
            String str2 = this.typeLevel;
            return hashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("PoiDetailVideoListConfig(poiDetailVideoTwoColumn=");
            LIZ.append(this.poiDetailVideoTwoColumn);
            LIZ.append(", poiDetailVideoSearchApi=");
            LIZ.append(this.poiDetailVideoSearchApi);
            LIZ.append(", poiDetailVideoFetchCount=");
            LIZ.append(this.poiDetailVideoFetchCount);
            LIZ.append(", typeLevel=");
            return q.LIZIZ(LIZ, this.typeLevel, ')', LIZ);
        }

        public PoiDetailVideoListConfig(int i, String str, int i2, String str2) {
            this.poiDetailVideoTwoColumn = i;
            this.poiDetailVideoSearchApi = str;
            this.poiDetailVideoFetchCount = i2;
            this.typeLevel = str2;
        }

        public /* synthetic */ PoiDetailVideoListConfig(int i, String str, int i2, String str2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? null : str, (i3 & 4) != 0 ? 18 : i2, (i3 & 8) != 0 ? null : str2);
        }
    }

    public static PoiDetailVideoListConfig LIZ(String str) {
        Config config;
        PoiDetailVideoListConfig poiDetailVideoListConfig = null;
        if (str == null || (config = (Config) i0.LJ(false, "poi_detail_config", 31744, Config.class, null)) == null) {
            return null;
        }
        Iterator<PoiDetailVideoListConfig> it = config.poiDetailVideoListConfig.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            PoiDetailVideoListConfig next = it.next();
            if (o.LJ(next.typeLevel, str)) {
                poiDetailVideoListConfig = next;
                break;
            }
        }
        return poiDetailVideoListConfig;
    }
}
