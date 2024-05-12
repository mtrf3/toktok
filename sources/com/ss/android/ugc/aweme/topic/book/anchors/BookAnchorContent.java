package com.ss.android.ugc.aweme.topic.book.anchors;

import X.InterfaceC65349Pkn;
import X.X1D;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class BookAnchorContent {
    public static final /* synthetic */ int LIZ = 0;

    @InterfaceC65349Pkn("author_name")
    public final String bookAuthor;

    @InterfaceC65349Pkn("book_cover_uri")
    public final String bookCoverUri;

    @InterfaceC65349Pkn("third_id")
    public final String bookId;

    @InterfaceC65349Pkn("title")
    public final String bookName;

    @InterfaceC65349Pkn("category")
    public final String category;

    @InterfaceC65349Pkn("topic_rating")
    public final Float rating;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BookAnchorContent)) {
            return false;
        }
        BookAnchorContent bookAnchorContent = (BookAnchorContent) obj;
        return o.LJ(this.bookId, bookAnchorContent.bookId) && o.LJ(this.bookName, bookAnchorContent.bookName) && o.LJ(this.bookCoverUri, bookAnchorContent.bookCoverUri) && o.LJ(this.bookAuthor, bookAnchorContent.bookAuthor) && o.LJ(this.category, bookAnchorContent.category) && o.LJ(this.rating, bookAnchorContent.rating);
    }

    public final int hashCode() {
        String str = this.bookId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.bookName;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.bookCoverUri;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.bookAuthor;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.category;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Float f = this.rating;
        return hashCode5 + (f != null ? f.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("BookAnchorContent(bookId=");
        LIZ2.append(this.bookId);
        LIZ2.append(", bookName=");
        LIZ2.append(this.bookName);
        LIZ2.append(", bookCoverUri=");
        LIZ2.append(this.bookCoverUri);
        LIZ2.append(", bookAuthor=");
        LIZ2.append(this.bookAuthor);
        LIZ2.append(", category=");
        LIZ2.append(this.category);
        LIZ2.append(", rating=");
        LIZ2.append(this.rating);
        LIZ2.append(')');
        return X1D.LIZIZ(LIZ2);
    }

    public BookAnchorContent(String str, String str2, String str3, String str4, String str5, Float f) {
        this.bookId = str;
        this.bookName = str2;
        this.bookCoverUri = str3;
        this.bookAuthor = str4;
        this.category = str5;
        this.rating = f;
    }

    public /* synthetic */ BookAnchorContent(String str, String str2, String str3, String str4, String str5, Float f, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, (i & 16) != 0 ? null : str5, f);
    }
}
