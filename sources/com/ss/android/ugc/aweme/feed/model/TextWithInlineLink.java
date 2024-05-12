package com.ss.android.ugc.aweme.feed.model;

import X.C1NE;
import X.C61878OQg;
import X.InterfaceC65349Pkn;
import X.X1D;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class TextWithInlineLink implements Serializable {

    @InterfaceC65349Pkn("links")
    public List<InlineLink> links;

    @InterfaceC65349Pkn("text")
    public String text;

    public TextWithInlineLink() {
        this(null, null, 3, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TextWithInlineLink copy$default(TextWithInlineLink textWithInlineLink, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = textWithInlineLink.text;
        }
        if ((i & 2) != 0) {
            list = textWithInlineLink.links;
        }
        return textWithInlineLink.copy(str, list);
    }

    public final TextWithInlineLink copy(String str, List<InlineLink> list) {
        return new TextWithInlineLink(str, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextWithInlineLink)) {
            return false;
        }
        TextWithInlineLink textWithInlineLink = (TextWithInlineLink) obj;
        return o.LJ(this.text, textWithInlineLink.text) && o.LJ(this.links, textWithInlineLink.links);
    }

    public int hashCode() {
        String str = this.text;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<InlineLink> list = this.links;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("TextWithInlineLink(text=");
        LIZ.append(this.text);
        LIZ.append(", links=");
        return C1NE.LIZIZ(LIZ, this.links, ')', LIZ);
    }

    public final List<InlineLink> getLinks() {
        return this.links;
    }

    public final String getText() {
        return this.text;
    }

    public TextWithInlineLink(String str, List<InlineLink> list) {
        this.text = str;
        this.links = list;
    }

    public TextWithInlineLink(String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? C61878OQg.INSTANCE : list);
    }
}
