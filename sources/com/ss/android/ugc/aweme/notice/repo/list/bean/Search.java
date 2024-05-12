package com.ss.android.ugc.aweme.notice.repo.list.bean;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class Search extends F9E {

    @InterfaceC65349Pkn("display_keyword")
    public String displayKeyword;

    @InterfaceC65349Pkn("keyword")
    public String keyword;

    /* JADX WARN: Multi-variable type inference failed */
    public Search() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ Search copy$default(Search search, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = search.keyword;
        }
        if ((i & 2) != 0) {
            str2 = search.displayKeyword;
        }
        return search.copy(str, str2);
    }

    public final Search copy(String keyword, String displayKeyword) {
        o.LJIIIZ(keyword, "keyword");
        o.LJIIIZ(displayKeyword, "displayKeyword");
        return new Search(keyword, displayKeyword);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.keyword, this.displayKeyword};
    }

    public final String getDisplayKeyword() {
        return this.displayKeyword;
    }

    public final String getKeyword() {
        return this.keyword;
    }

    public final void setDisplayKeyword(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.displayKeyword = str;
    }

    public final void setKeyword(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.keyword = str;
    }

    public Search(String keyword, String displayKeyword) {
        o.LJIIIZ(keyword, "keyword");
        o.LJIIIZ(displayKeyword, "displayKeyword");
        this.keyword = keyword;
        this.displayKeyword = displayKeyword;
    }

    public /* synthetic */ Search(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
    }
}
