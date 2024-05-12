package com.ss.android.ugc.aweme.topic.common.model;

import X.C78920UyC;
import X.InterfaceC65349Pkn;
import X.O6R;
import X.X1D;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class TopicRawInfo {

    @InterfaceC65349Pkn("author_name")
    public final String authorName;

    @InterfaceC65349Pkn("cover")
    public final UrlModel cover;

    @InterfaceC65349Pkn(alternate = {"imdb_rating"}, value = "external_rating")
    public final Double externalRating;

    @InterfaceC65349Pkn(alternate = {"id"}, value = "topic_id")
    public final String id;

    @InterfaceC65349Pkn("is_collected")
    public final Boolean isCollected;

    @InterfaceC65349Pkn("title")
    public final String title;

    @InterfaceC65349Pkn("topic_rating")
    public final Float topicRating;

    @InterfaceC65349Pkn("topic_type")
    public final Integer type;

    @InterfaceC65349Pkn("year")
    public final Integer year;

    /* JADX WARN: Multi-variable type inference failed */
    public TopicRawInfo() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 511, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TopicRawInfo)) {
            return false;
        }
        TopicRawInfo topicRawInfo = (TopicRawInfo) obj;
        return o.LJ(this.type, topicRawInfo.type) && o.LJ(this.id, topicRawInfo.id) && o.LJ(this.title, topicRawInfo.title) && o.LJ(this.cover, topicRawInfo.cover) && o.LJ(this.authorName, topicRawInfo.authorName) && o.LJ(this.externalRating, topicRawInfo.externalRating) && o.LJ(this.year, topicRawInfo.year) && o.LJ(this.topicRating, topicRawInfo.topicRating) && o.LJ(this.isCollected, topicRawInfo.isCollected);
    }

    public final int hashCode() {
        Integer num = this.type;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.id;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.title;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        UrlModel urlModel = this.cover;
        int hashCode4 = (hashCode3 + (urlModel == null ? 0 : urlModel.hashCode())) * 31;
        String str3 = this.authorName;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Double d = this.externalRating;
        int hashCode6 = (hashCode5 + (d == null ? 0 : d.hashCode())) * 31;
        Integer num2 = this.year;
        int hashCode7 = (hashCode6 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Float f = this.topicRating;
        int hashCode8 = (hashCode7 + (f == null ? 0 : f.hashCode())) * 31;
        Boolean bool = this.isCollected;
        return hashCode8 + (bool != null ? bool.hashCode() : 0);
    }

    public final Double LIZIZ() {
        Float f = this.topicRating;
        if (f == null) {
            return null;
        }
        float floatValue = f.floatValue();
        if (Float.isNaN(floatValue) || floatValue == 0.0f) {
            return null;
        }
        return Double.valueOf(O6R.LJJIIZ(f.floatValue() * 10) / 10.0d);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("TopicRawInfo(type=");
        LIZ.append(this.type);
        LIZ.append(", id=");
        LIZ.append(this.id);
        LIZ.append(", title=");
        LIZ.append(this.title);
        LIZ.append(", cover=");
        LIZ.append(this.cover);
        LIZ.append(", authorName=");
        LIZ.append(this.authorName);
        LIZ.append(", externalRating=");
        LIZ.append(this.externalRating);
        LIZ.append(", year=");
        LIZ.append(this.year);
        LIZ.append(", topicRating=");
        LIZ.append(this.topicRating);
        LIZ.append(", isCollected=");
        return C78920UyC.LIZIZ(LIZ, this.isCollected, ')', LIZ);
    }

    public static TopicRawInfo LIZ(TopicRawInfo topicRawInfo, Integer num) {
        String str = topicRawInfo.id;
        String str2 = topicRawInfo.title;
        UrlModel urlModel = topicRawInfo.cover;
        String str3 = topicRawInfo.authorName;
        Double d = topicRawInfo.externalRating;
        Integer num2 = topicRawInfo.year;
        Float f = topicRawInfo.topicRating;
        Boolean bool = topicRawInfo.isCollected;
        topicRawInfo.getClass();
        return new TopicRawInfo(num, str, str2, urlModel, str3, d, num2, f, bool);
    }

    public TopicRawInfo(Integer num, String str, String str2, UrlModel urlModel, String str3, Double d, Integer num2, Float f, Boolean bool) {
        this.type = num;
        this.id = str;
        this.title = str2;
        this.cover = urlModel;
        this.authorName = str3;
        this.externalRating = d;
        this.year = num2;
        this.topicRating = f;
        this.isCollected = bool;
    }

    public /* synthetic */ TopicRawInfo(Integer num, String str, String str2, UrlModel urlModel, String str3, Double d, Integer num2, Float f, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : urlModel, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : d, (i & 64) != 0 ? null : num2, (i & 128) != 0 ? null : f, (i & 256) == 0 ? bool : null);
    }
}
