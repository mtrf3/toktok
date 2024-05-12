package com.ss.android.ugc.aweme.topic.movie.anchors;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class MovieAnchorContent {
    public static final /* synthetic */ int LIZ = 0;

    @InterfaceC65349Pkn("category")
    public final String category;

    @InterfaceC65349Pkn("movie_cover_uri")
    public final String cover;

    @InterfaceC65349Pkn("third_id")
    public final String id;

    @InterfaceC65349Pkn("imdb_rating")
    public final Double imdbRating;

    @InterfaceC65349Pkn("title")
    public final String title;

    @InterfaceC65349Pkn("year")
    public final Integer year;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MovieAnchorContent)) {
            return false;
        }
        MovieAnchorContent movieAnchorContent = (MovieAnchorContent) obj;
        return o.LJ(this.id, movieAnchorContent.id) && o.LJ(this.title, movieAnchorContent.title) && o.LJ(this.year, movieAnchorContent.year) && o.LJ(this.imdbRating, movieAnchorContent.imdbRating) && o.LJ(this.cover, movieAnchorContent.cover) && o.LJ(this.category, movieAnchorContent.category);
    }

    public final int hashCode() {
        String str = this.id;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.title;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.year;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Double d = this.imdbRating;
        int hashCode4 = (hashCode3 + (d == null ? 0 : d.hashCode())) * 31;
        String str3 = this.cover;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.category;
        return hashCode5 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("MovieAnchorContent(id=");
        LIZ2.append(this.id);
        LIZ2.append(", title=");
        LIZ2.append(this.title);
        LIZ2.append(", year=");
        LIZ2.append(this.year);
        LIZ2.append(", imdbRating=");
        LIZ2.append(this.imdbRating);
        LIZ2.append(", cover=");
        LIZ2.append(this.cover);
        LIZ2.append(", category=");
        return q.LIZIZ(LIZ2, this.category, ')', LIZ2);
    }

    public MovieAnchorContent(String str, String str2, Integer num, Double d, String str3, String str4) {
        this.id = str;
        this.title = str2;
        this.year = num;
        this.imdbRating = d;
        this.cover = str3;
        this.category = str4;
    }

    public /* synthetic */ MovieAnchorContent(String str, String str2, Integer num, Double d, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, num, d, str3, (i & 32) != 0 ? null : str4);
    }
}
