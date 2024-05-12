package com.ss.android.ugc.aweme.experiment;

import X.C79062V1e;
import X.HH1;
import X.InterfaceC65349Pkn;
import X.X1D;
import com.bytedance.ies.abmock.SettingsManager;
import defpackage.q;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class AnalyticsSDUISetting {

    /* loaded from: classes5.dex */
    public static final class H5AnalyticsInfoStructJsonModel {

        @InterfaceC65349Pkn("analytics_creator_tools_entrance_url_android")
        public final String creatorToolEntryURL;

        @InterfaceC65349Pkn("analytics_video_detail_entrance_url_android")
        public final String detailEntryURL;

        @InterfaceC65349Pkn("query_params_android")
        public final String queryParams;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof H5AnalyticsInfoStructJsonModel)) {
                return false;
            }
            H5AnalyticsInfoStructJsonModel h5AnalyticsInfoStructJsonModel = (H5AnalyticsInfoStructJsonModel) obj;
            return o.LJ(this.creatorToolEntryURL, h5AnalyticsInfoStructJsonModel.creatorToolEntryURL) && o.LJ(this.detailEntryURL, h5AnalyticsInfoStructJsonModel.detailEntryURL) && o.LJ(this.queryParams, h5AnalyticsInfoStructJsonModel.queryParams);
        }

        public final int hashCode() {
            return this.queryParams.hashCode() + C79062V1e.LJ(this.detailEntryURL, this.creatorToolEntryURL.hashCode() * 31, 31);
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("H5AnalyticsInfoStructJsonModel(creatorToolEntryURL=");
            LIZ.append(this.creatorToolEntryURL);
            LIZ.append(", detailEntryURL=");
            LIZ.append(this.detailEntryURL);
            LIZ.append(", queryParams=");
            return q.LIZIZ(LIZ, this.queryParams, ')', LIZ);
        }

        public H5AnalyticsInfoStructJsonModel(String str, String str2, String str3) {
            HH1.LIZ(str, "creatorToolEntryURL", str2, "detailEntryURL", str3, "queryParams");
            this.creatorToolEntryURL = str;
            this.detailEntryURL = str2;
            this.queryParams = str3;
        }
    }

    public static final H5AnalyticsInfoStructJsonModel LIZ() {
        return (H5AnalyticsInfoStructJsonModel) SettingsManager.LIZLLL().LJIIIIZZ("h5_analytics_info_struct_json", H5AnalyticsInfoStructJsonModel.class, null);
    }
}
