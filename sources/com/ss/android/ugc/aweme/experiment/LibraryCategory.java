package com.ss.android.ugc.aweme.experiment;

import X.C79062V1e;
import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class LibraryCategory {

    @InterfaceC65349Pkn("image")
    public final String image;

    @InterfaceC65349Pkn("query")
    public final String query;

    @InterfaceC65349Pkn("title")
    public final String title;

    /* JADX WARN: Multi-variable type inference failed */
    public LibraryCategory() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ LibraryCategory copy$default(LibraryCategory libraryCategory, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = libraryCategory.title;
        }
        if ((i & 2) != 0) {
            str2 = libraryCategory.query;
        }
        if ((i & 4) != 0) {
            str3 = libraryCategory.image;
        }
        return libraryCategory.copy(str, str2, str3);
    }

    public final LibraryCategory copy(String title, String query, String str) {
        o.LJIIIZ(title, "title");
        o.LJIIIZ(query, "query");
        return new LibraryCategory(title, query, str);
    }

    public int hashCode() {
        int i;
        int LJ = C79062V1e.LJ(this.query, this.title.hashCode() * 31, 31);
        String str = this.image;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        return LJ + i;
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("LibraryCategory(title=");
        LIZ.append(this.title);
        LIZ.append(", query=");
        LIZ.append(this.query);
        LIZ.append(", image=");
        return q.LIZIZ(LIZ, this.image, ')', LIZ);
    }

    public final String getImage() {
        return this.image;
    }

    public final String getQuery() {
        return this.query;
    }

    public final String getTitle() {
        return this.title;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LibraryCategory)) {
            return false;
        }
        LibraryCategory libraryCategory = (LibraryCategory) obj;
        if (o.LJ(this.title, libraryCategory.title) && o.LJ(this.query, libraryCategory.query)) {
            return true;
        }
        return false;
    }

    public LibraryCategory(String title, String query, String str) {
        o.LJIIIZ(title, "title");
        o.LJIIIZ(query, "query");
        this.title = title;
        this.query = query;
        this.image = str;
    }

    public /* synthetic */ LibraryCategory(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3);
    }
}
