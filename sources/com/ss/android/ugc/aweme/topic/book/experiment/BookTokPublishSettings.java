package com.ss.android.ugc.aweme.topic.book.experiment;

import X.InterfaceC65349Pkn;
import X.JBR;
import X.X1D;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class BookTokPublishSettings {
    public static final BookTokPublishSettingsModel LIZ = new BookTokPublishSettingsModel(null, null);

    /* loaded from: classes7.dex */
    public static final class BookTokPublishSettingsModel {

        @InterfaceC65349Pkn("keywords")
        public final List<String> keywords;

        @InterfaceC65349Pkn("max_count_guide_show")
        public final Long maxCountGuideShow;

        /* JADX WARN: Multi-variable type inference failed */
        public BookTokPublishSettingsModel() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BookTokPublishSettingsModel)) {
                return false;
            }
            BookTokPublishSettingsModel bookTokPublishSettingsModel = (BookTokPublishSettingsModel) obj;
            return o.LJ(this.keywords, bookTokPublishSettingsModel.keywords) && o.LJ(this.maxCountGuideShow, bookTokPublishSettingsModel.maxCountGuideShow);
        }

        public final int hashCode() {
            List<String> list = this.keywords;
            int hashCode = (list == null ? 0 : list.hashCode()) * 31;
            Long l = this.maxCountGuideShow;
            return hashCode + (l != null ? l.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("BookTokPublishSettingsModel(keywords=");
            LIZ.append(this.keywords);
            LIZ.append(", maxCountGuideShow=");
            return JBR.LJ(LIZ, this.maxCountGuideShow, ')', LIZ);
        }

        public BookTokPublishSettingsModel(List<String> list, Long l) {
            this.keywords = list;
            this.maxCountGuideShow = l;
        }

        public /* synthetic */ BookTokPublishSettingsModel(List list, Long l, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : l);
        }
    }
}
