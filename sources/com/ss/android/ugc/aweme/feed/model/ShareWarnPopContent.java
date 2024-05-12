package com.ss.android.ugc.aweme.feed.model;

import X.C48339Iy7;
import X.InterfaceC65349Pkn;
import X.X1D;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class ShareWarnPopContent implements Serializable {

    @InterfaceC65349Pkn("is_list_item")
    public final boolean isListItem;

    @InterfaceC65349Pkn("text")
    public final TextWithInlineLink linkText;

    public static /* synthetic */ ShareWarnPopContent copy$default(ShareWarnPopContent shareWarnPopContent, TextWithInlineLink textWithInlineLink, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            textWithInlineLink = shareWarnPopContent.linkText;
        }
        if ((i & 2) != 0) {
            z = shareWarnPopContent.isListItem;
        }
        return shareWarnPopContent.copy(textWithInlineLink, z);
    }

    public final ShareWarnPopContent copy(TextWithInlineLink textWithInlineLink, boolean z) {
        return new ShareWarnPopContent(textWithInlineLink, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShareWarnPopContent)) {
            return false;
        }
        ShareWarnPopContent shareWarnPopContent = (ShareWarnPopContent) obj;
        return o.LJ(this.linkText, shareWarnPopContent.linkText) && this.isListItem == shareWarnPopContent.isListItem;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        TextWithInlineLink textWithInlineLink = this.linkText;
        int hashCode = (textWithInlineLink == null ? 0 : textWithInlineLink.hashCode()) * 31;
        boolean z = this.isListItem;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ShareWarnPopContent(linkText=");
        LIZ.append(this.linkText);
        LIZ.append(", isListItem=");
        return C48339Iy7.LIZJ(LIZ, this.isListItem, ')', LIZ);
    }

    public final TextWithInlineLink getLinkText() {
        return this.linkText;
    }

    public final boolean isListItem() {
        return this.isListItem;
    }

    public ShareWarnPopContent(TextWithInlineLink textWithInlineLink, boolean z) {
        this.linkText = textWithInlineLink;
        this.isListItem = z;
    }

    public /* synthetic */ ShareWarnPopContent(TextWithInlineLink textWithInlineLink, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(textWithInlineLink, (i & 2) != 0 ? false : z);
    }
}
