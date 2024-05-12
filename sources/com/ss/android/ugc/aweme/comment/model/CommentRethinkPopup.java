package com.ss.android.ugc.aweme.comment.model;

import X.C43588H8u;
import X.InterfaceC65349Pkn;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class CommentRethinkPopup implements Serializable {

    @InterfaceC65349Pkn("body")
    public String body;

    @InterfaceC65349Pkn("highlight")
    public String highlight;

    @InterfaceC65349Pkn("link")
    public final String link;

    @InterfaceC65349Pkn("title")
    public String title;

    /* JADX WARN: Multi-variable type inference failed */
    public CommentRethinkPopup() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 15, 0 == true ? 1 : 0);
    }

    public final String getBody() {
        return this.body;
    }

    public final String getHighlight() {
        return this.highlight;
    }

    public final String getLink() {
        return this.link;
    }

    public final String getTitle() {
        return this.title;
    }

    public final void setBody(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.body = str;
    }

    public final void setHighlight(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.highlight = str;
    }

    public final void setTitle(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.title = str;
    }

    public CommentRethinkPopup(String str, String str2, String str3, String str4) {
        C43588H8u.LIZLLL(str, "title", str2, "body", str3, "highlight", str4, "link");
        this.title = str;
        this.body = str2;
        this.highlight = str3;
        this.link = str4;
    }

    public /* synthetic */ CommentRethinkPopup(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4);
    }
}
