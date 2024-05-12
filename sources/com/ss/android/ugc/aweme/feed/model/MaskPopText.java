package com.ss.android.ugc.aweme.feed.model;

import X.C48339Iy7;
import X.InterfaceC65349Pkn;
import X.X1D;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class MaskPopText implements Serializable {

    @InterfaceC65349Pkn("is_list_item")
    public boolean isListItem;

    @InterfaceC65349Pkn("text")
    public TextWithInlineLink linkText;

    public MaskPopText() {
    }

    public static /* synthetic */ MaskPopText copy$default(MaskPopText maskPopText, TextWithInlineLink textWithInlineLink, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            textWithInlineLink = maskPopText.linkText;
        }
        if ((i & 2) != 0) {
            z = maskPopText.isListItem;
        }
        return maskPopText.copy(textWithInlineLink, z);
    }

    public final MaskPopText copy(TextWithInlineLink textWithInlineLink, boolean z) {
        return new MaskPopText(textWithInlineLink, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MaskPopText)) {
            return false;
        }
        MaskPopText maskPopText = (MaskPopText) obj;
        return o.LJ(this.linkText, maskPopText.linkText) && this.isListItem == maskPopText.isListItem;
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
        LIZ.append("MaskPopText(linkText=");
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

    public MaskPopText(TextWithInlineLink textWithInlineLink, boolean z) {
        this.linkText = textWithInlineLink;
        this.isListItem = z;
    }

    public /* synthetic */ MaskPopText(TextWithInlineLink textWithInlineLink, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(textWithInlineLink, (i & 2) != 0 ? false : z);
    }
}
