package com.ss.android.ugc.aweme.ecommerce.mall.settings;

import X.C36746EbW;
import X.C79062V1e;
import X.InterfaceC65349Pkn;
import X.X1D;
import com.bytedance.ies.abmock.SettingsManager;
import defpackage.q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class EcMallConfigSettings {
    public static final EcMallConfigModel DEFAULT_GROUP;
    public static final EcMallConfigSettings INSTANCE = new EcMallConfigSettings();

    /* loaded from: classes9.dex */
    public static final class EcMallConfigModel {

        @InterfaceC65349Pkn("enable_prefetch")
        public final boolean enablePrefetch;

        @InterfaceC65349Pkn("full_page_card_schema")
        public final String fullPageCardSchema;

        @InterfaceC65349Pkn("unity_card_schema")
        public final String homeSchema;

        @InterfaceC65349Pkn("marketing_card_schema")
        public final String marketingCardSchema;

        @InterfaceC65349Pkn("recommend_card_schema")
        public final String recommendCardSchema;

        @InterfaceC65349Pkn("use_unity_cache")
        public final Boolean useCache;

        @InterfaceC65349Pkn("use_marketing_cache")
        public final boolean useMarketingCache;

        @InterfaceC65349Pkn("use_recommend_cache")
        public final boolean useRecommendCache;

        @InterfaceC65349Pkn("recommend_video_scene")
        public final String videoScene;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof EcMallConfigModel)) {
                return false;
            }
            EcMallConfigModel ecMallConfigModel = (EcMallConfigModel) obj;
            return o.LJ(this.recommendCardSchema, ecMallConfigModel.recommendCardSchema) && o.LJ(this.marketingCardSchema, ecMallConfigModel.marketingCardSchema) && this.enablePrefetch == ecMallConfigModel.enablePrefetch && this.useRecommendCache == ecMallConfigModel.useRecommendCache && this.useMarketingCache == ecMallConfigModel.useMarketingCache && o.LJ(this.useCache, ecMallConfigModel.useCache) && o.LJ(this.homeSchema, ecMallConfigModel.homeSchema) && o.LJ(this.videoScene, ecMallConfigModel.videoScene) && o.LJ(this.fullPageCardSchema, ecMallConfigModel.fullPageCardSchema);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final int hashCode() {
            int hashCode;
            int hashCode2;
            int hashCode3;
            int LJ = C79062V1e.LJ(this.marketingCardSchema, this.recommendCardSchema.hashCode() * 31, 31);
            boolean z = this.enablePrefetch;
            int i = 1;
            int i2 = z;
            if (z != 0) {
                i2 = 1;
            }
            int i3 = (LJ + i2) * 31;
            boolean z2 = this.useRecommendCache;
            int i4 = z2;
            if (z2 != 0) {
                i4 = 1;
            }
            int i5 = (i3 + i4) * 31;
            if (!this.useMarketingCache) {
                i = 0;
            }
            int i6 = (i5 + i) * 31;
            Boolean bool = this.useCache;
            int i7 = 0;
            if (bool == null) {
                hashCode = 0;
            } else {
                hashCode = bool.hashCode();
            }
            int i8 = (i6 + hashCode) * 31;
            String str = this.homeSchema;
            if (str == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = str.hashCode();
            }
            int i9 = (i8 + hashCode2) * 31;
            String str2 = this.videoScene;
            if (str2 == null) {
                hashCode3 = 0;
            } else {
                hashCode3 = str2.hashCode();
            }
            int i10 = (i9 + hashCode3) * 31;
            String str3 = this.fullPageCardSchema;
            if (str3 != null) {
                i7 = str3.hashCode();
            }
            return i10 + i7;
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("EcMallConfigModel(recommendCardSchema=");
            LIZ.append(this.recommendCardSchema);
            LIZ.append(", marketingCardSchema=");
            LIZ.append(this.marketingCardSchema);
            LIZ.append(", enablePrefetch=");
            LIZ.append(this.enablePrefetch);
            LIZ.append(", useRecommendCache=");
            LIZ.append(this.useRecommendCache);
            LIZ.append(", useMarketingCache=");
            LIZ.append(this.useMarketingCache);
            LIZ.append(", useCache=");
            LIZ.append(this.useCache);
            LIZ.append(", homeSchema=");
            LIZ.append(this.homeSchema);
            LIZ.append(", videoScene=");
            LIZ.append(this.videoScene);
            LIZ.append(", fullPageCardSchema=");
            return q.LIZIZ(LIZ, this.fullPageCardSchema, ')', LIZ);
        }

        public EcMallConfigModel(String recommendCardSchema, String marketingCardSchema, boolean z, boolean z2, boolean z3, Boolean bool, String str, String str2, String str3) {
            o.LJIIIZ(recommendCardSchema, "recommendCardSchema");
            o.LJIIIZ(marketingCardSchema, "marketingCardSchema");
            this.recommendCardSchema = recommendCardSchema;
            this.marketingCardSchema = marketingCardSchema;
            this.enablePrefetch = z;
            this.useRecommendCache = z2;
            this.useMarketingCache = z3;
            this.useCache = bool;
            this.homeSchema = str;
            this.videoScene = str2;
            this.fullPageCardSchema = str3;
        }

        public /* synthetic */ EcMallConfigModel(String str, String str2, boolean z, boolean z2, boolean z3, Boolean bool, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, z, z2, z3, (i & 32) != 0 ? Boolean.TRUE : bool, (i & 64) != 0 ? "sslocal://lynxview?use_new_container=1&url=https%3A%2F%2Flf16-gecko-source.tiktokcdn.com%2Fobj%2Fbyte-gurd-source-sg%2Ftiktok%2Ffe%2Flive%2Ftiktok_live_ecommerce_ttmall%2Fpages%2Fhome.js&use_spark=1&__live_platform__=webcast&trans_status_bar=1&hide_nav_bar=1&previous_page=mall&enter_from=mall&business_from=ecom&target_handler=webcast" : str3, (i & 128) != 0 ? "" : str4, (i & 256) == 0 ? str5 : "");
        }
    }

    public static /* synthetic */ void getMARKETING_SCHEMA$annotations() {
    }

    public static /* synthetic */ void getRECOMMEND_SCHEMA$annotations() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        boolean z = false;
        DEFAULT_GROUP = new EcMallConfigModel("sslocal://lynxview?url=https%3A%2F%2Flf16-gecko-source.tiktokcdn.com%2Fobj%2Fbyte-gurd-source-sg%2Ftiktok%2Ffe%2Flive%2Ftiktok_live_ecommerce_mall%2Fpages%2Frecommend.js&use_spark=1&__live_platform__=webcast&thread_strategy=2&business_from=ecom&target_handler=webcast", "sslocal://lynxview?use_new_container=1&url=https%3A%2F%2Flf21-gecko-source.tiktokcdn.com%2Fobj%2Fbyte-gurd-source-sg%2Ftiktok%2Ffe%2Flive%2Ftiktok_live_ecommerce_mall%2Fpages%2Foperation.js&use_spark=1&__live_platform__=webcast&trans_status_bar=1&hide_nav_bar=1&previous_page=mall&enter_from=mall&business_from=ecom&target_handler=webcast", z, z, z, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 480, 0 == true ? 1 : 0);
    }

    public static final EcMallConfigModel getValue() {
        SettingsManager LIZLLL = SettingsManager.LIZLLL();
        EcMallConfigModel ecMallConfigModel = DEFAULT_GROUP;
        EcMallConfigModel ecMallConfigModel2 = (EcMallConfigModel) LIZLLL.LJIIIIZZ("ec_mall_config", EcMallConfigModel.class, ecMallConfigModel);
        C36746EbW.LIZ(3, "mall settings = " + ecMallConfigModel2);
        if (ecMallConfigModel2 == null) {
            return ecMallConfigModel;
        }
        return ecMallConfigModel2;
    }
}
