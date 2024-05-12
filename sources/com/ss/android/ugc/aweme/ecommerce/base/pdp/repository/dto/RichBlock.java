package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C1FJ;
import X.C27617Asf;
import X.InterfaceC65349Pkn;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class RichBlock implements Parcelable {
    public static final Parcelable.Creator<RichBlock> CREATOR = new C27617Asf();

    @InterfaceC65349Pkn("image")
    public final Image image;

    @InterfaceC65349Pkn("link_rich_text")
    public final LogisticLinkRichText linkRichText;

    @InterfaceC65349Pkn("rich_block_type")
    public final Integer richBlockType;

    @InterfaceC65349Pkn("xl_link_rich_text")
    public final XLLinkRichText xlLinkRichText;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RichBlock)) {
            return false;
        }
        RichBlock richBlock = (RichBlock) obj;
        return o.LJ(this.richBlockType, richBlock.richBlockType) && o.LJ(this.linkRichText, richBlock.linkRichText) && o.LJ(this.image, richBlock.image) && o.LJ(this.xlLinkRichText, richBlock.xlLinkRichText);
    }

    public final int hashCode() {
        Integer num = this.richBlockType;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        LogisticLinkRichText logisticLinkRichText = this.linkRichText;
        int hashCode2 = (hashCode + (logisticLinkRichText == null ? 0 : logisticLinkRichText.hashCode())) * 31;
        Image image = this.image;
        int hashCode3 = (hashCode2 + (image == null ? 0 : image.hashCode())) * 31;
        XLLinkRichText xLLinkRichText = this.xlLinkRichText;
        return hashCode3 + (xLLinkRichText != null ? xLLinkRichText.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("RichBlock(richBlockType=");
        LIZ.append(this.richBlockType);
        LIZ.append(", linkRichText=");
        LIZ.append(this.linkRichText);
        LIZ.append(", image=");
        LIZ.append(this.image);
        LIZ.append(", xlLinkRichText=");
        LIZ.append(this.xlLinkRichText);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        Integer num = this.richBlockType;
        if (num == null) {
            out.writeInt(0);
        } else {
            C1FJ.LJ(out, 1, num);
        }
        LogisticLinkRichText logisticLinkRichText = this.linkRichText;
        if (logisticLinkRichText == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            logisticLinkRichText.writeToParcel(out, i);
        }
        out.writeParcelable(this.image, i);
        XLLinkRichText xLLinkRichText = this.xlLinkRichText;
        if (xLLinkRichText == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            xLLinkRichText.writeToParcel(out, i);
        }
    }

    public RichBlock(Integer num, LogisticLinkRichText logisticLinkRichText, Image image, XLLinkRichText xLLinkRichText) {
        this.richBlockType = num;
        this.linkRichText = logisticLinkRichText;
        this.image = image;
        this.xlLinkRichText = xLLinkRichText;
    }

    public /* synthetic */ RichBlock(Integer num, LogisticLinkRichText logisticLinkRichText, Image image, XLLinkRichText xLLinkRichText, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(num, (i & 2) != 0 ? null : logisticLinkRichText, (i & 4) != 0 ? null : image, (i & 8) != 0 ? null : xLLinkRichText);
    }
}
