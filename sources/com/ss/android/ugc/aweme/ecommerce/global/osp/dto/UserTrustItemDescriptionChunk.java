package com.ss.android.ugc.aweme.ecommerce.global.osp.dto;

import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.LinkRichText;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class UserTrustItemDescriptionChunk {

    @InterfaceC65349Pkn("text_with_image")
    public final ImageRichText textWithImage;

    @InterfaceC65349Pkn("text_with_link")
    public final LinkRichText textWithLink;

    @InterfaceC65349Pkn("type")
    public final Integer type;

    /* JADX WARN: Multi-variable type inference failed */
    public UserTrustItemDescriptionChunk() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserTrustItemDescriptionChunk)) {
            return false;
        }
        UserTrustItemDescriptionChunk userTrustItemDescriptionChunk = (UserTrustItemDescriptionChunk) obj;
        return o.LJ(this.type, userTrustItemDescriptionChunk.type) && o.LJ(this.textWithLink, userTrustItemDescriptionChunk.textWithLink) && o.LJ(this.textWithImage, userTrustItemDescriptionChunk.textWithImage);
    }

    public final int hashCode() {
        Integer num = this.type;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        LinkRichText linkRichText = this.textWithLink;
        int hashCode2 = (hashCode + (linkRichText == null ? 0 : linkRichText.hashCode())) * 31;
        ImageRichText imageRichText = this.textWithImage;
        return hashCode2 + (imageRichText != null ? imageRichText.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("UserTrustItemDescriptionChunk(type=");
        LIZ.append(this.type);
        LIZ.append(", textWithLink=");
        LIZ.append(this.textWithLink);
        LIZ.append(", textWithImage=");
        LIZ.append(this.textWithImage);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public UserTrustItemDescriptionChunk(Integer num, LinkRichText linkRichText, ImageRichText imageRichText) {
        this.type = num;
        this.textWithLink = linkRichText;
        this.textWithImage = imageRichText;
    }

    public /* synthetic */ UserTrustItemDescriptionChunk(Integer num, LinkRichText linkRichText, ImageRichText imageRichText, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : linkRichText, (i & 4) != 0 ? null : imageRichText);
    }
}
