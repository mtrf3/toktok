package com.ss.android.ugc.aweme.topic.movie.model;

import X.C78920UyC;
import X.C7PR;
import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.topic.common.model.TopicRawInfo;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class MovieDetail {

    @InterfaceC65349Pkn("cover")
    public final UrlModel cover;

    @InterfaceC65349Pkn("description")
    public final String desc;

    @InterfaceC65349Pkn("topic_id")
    public final String id;

    @InterfaceC65349Pkn("is_collected")
    public final Boolean isCollected;

    @InterfaceC65349Pkn("external_rating")
    public final Double rating;

    @InterfaceC65349Pkn("title")
    public final String title;

    @InterfaceC65349Pkn("year")
    public final Integer year;

    /* JADX WARN: Multi-variable type inference failed */
    public MovieDetail() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 127, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MovieDetail)) {
            return false;
        }
        MovieDetail movieDetail = (MovieDetail) obj;
        return o.LJ(this.id, movieDetail.id) && o.LJ(this.title, movieDetail.title) && o.LJ(this.year, movieDetail.year) && o.LJ(this.rating, movieDetail.rating) && o.LJ(this.desc, movieDetail.desc) && o.LJ(this.cover, movieDetail.cover) && o.LJ(this.isCollected, movieDetail.isCollected);
    }

    public final int hashCode() {
        String str = this.id;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.title;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.year;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Double d = this.rating;
        int hashCode4 = (hashCode3 + (d == null ? 0 : d.hashCode())) * 31;
        String str3 = this.desc;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        UrlModel urlModel = this.cover;
        int hashCode6 = (hashCode5 + (urlModel == null ? 0 : urlModel.hashCode())) * 31;
        Boolean bool = this.isCollected;
        return hashCode6 + (bool != null ? bool.hashCode() : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final TopicRawInfo LIZ() {
        int type = C7PR.MOVIE.getType();
        String str = this.id;
        UrlModel urlModel = this.cover;
        String str2 = this.title;
        Double d = this.rating;
        Boolean bool = this.isCollected;
        return new TopicRawInfo(Integer.valueOf(type), str, str2, urlModel, null, d, this.year, 0 == true ? 1 : 0, bool, 144, 0 == true ? 1 : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("MovieDetail(id=");
        LIZ.append(this.id);
        LIZ.append(", title=");
        LIZ.append(this.title);
        LIZ.append(", year=");
        LIZ.append(this.year);
        LIZ.append(", rating=");
        LIZ.append(this.rating);
        LIZ.append(", desc=");
        LIZ.append(this.desc);
        LIZ.append(", cover=");
        LIZ.append(this.cover);
        LIZ.append(", isCollected=");
        return C78920UyC.LIZIZ(LIZ, this.isCollected, ')', LIZ);
    }

    public MovieDetail(String str, String str2, Integer num, Double d, String str3, UrlModel urlModel, Boolean bool) {
        this.id = str;
        this.title = str2;
        this.year = num;
        this.rating = d;
        this.desc = str3;
        this.cover = urlModel;
        this.isCollected = bool;
    }

    public /* synthetic */ MovieDetail(String str, String str2, Integer num, Double d, String str3, UrlModel urlModel, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : d, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : urlModel, (i & 64) == 0 ? bool : null);
    }
}
