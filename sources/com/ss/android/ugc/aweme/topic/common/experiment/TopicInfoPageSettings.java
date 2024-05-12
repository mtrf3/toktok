package com.ss.android.ugc.aweme.topic.common.experiment;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class TopicInfoPageSettings {
    public static final DiscoveryTopicCdnSettingModel LIZ = new DiscoveryTopicCdnSettingModel("aweme://lynxview/?hide_nav_bar=1&channel=discovery_topic_book_info&bundle=pages%2Fbook_info%2Ftemplate.js&dynamic=1&group=discovery_topic_book_info", "aweme://lynxview/?hide_nav_bar=1&channel=discovery_topic_info&bundle=pages%2Ftopic_info%2Ftemplate.js&dynamic=1&group=discovery_topic_info");

    /* loaded from: classes7.dex */
    public static final class DiscoveryTopicCdnSettingModel {

        @InterfaceC65349Pkn("book_info_with_cdn_url")
        public final String bookCdnUrl;

        @InterfaceC65349Pkn("movie_info_with_cdn_url")
        public final String movieCdnUrl;

        /* JADX WARN: Multi-variable type inference failed */
        public DiscoveryTopicCdnSettingModel() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DiscoveryTopicCdnSettingModel)) {
                return false;
            }
            DiscoveryTopicCdnSettingModel discoveryTopicCdnSettingModel = (DiscoveryTopicCdnSettingModel) obj;
            return o.LJ(this.bookCdnUrl, discoveryTopicCdnSettingModel.bookCdnUrl) && o.LJ(this.movieCdnUrl, discoveryTopicCdnSettingModel.movieCdnUrl);
        }

        public final int hashCode() {
            String str = this.bookCdnUrl;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.movieCdnUrl;
            return hashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("DiscoveryTopicCdnSettingModel(bookCdnUrl=");
            LIZ.append(this.bookCdnUrl);
            LIZ.append(", movieCdnUrl=");
            return q.LIZIZ(LIZ, this.movieCdnUrl, ')', LIZ);
        }

        public DiscoveryTopicCdnSettingModel(String str, String str2) {
            this.bookCdnUrl = str;
            this.movieCdnUrl = str2;
        }

        public /* synthetic */ DiscoveryTopicCdnSettingModel(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
        }
    }
}
