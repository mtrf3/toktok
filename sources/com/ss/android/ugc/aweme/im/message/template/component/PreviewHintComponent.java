package com.ss.android.ugc.aweme.im.message.template.component;

import X.C221108m2;
import X.C5H3;
import X.C63714OzW;
import X.C79087V2d;
import X.C79135V3z;
import X.EnumC79088V2e;
import X.EnumC79091V2h;
import X.RU9;
import X.RUA;
import X.V2T;
import X.V2U;
import X.V2W;
import X.V31;
import X.V34;
import X.V40;
import X.V4L;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class PreviewHintComponent implements BaseComponent<V4L> {
    public final QuotePicturePreviewComponent quotePicturePreview;
    public final TextComponent quotePreviewText;
    public final QuotePreviewTypeComponent quotePreviewType;
    public final TextComponent receiverPreviewText;
    public final TextComponent senderPreviewText;
    public static final C79087V2d Companion = new C79087V2d();
    public static final Parcelable.Creator<PreviewHintComponent> CREATOR = new V2U();
    public static final C5H3<PreviewHintComponent> DEFAULT_PREVIEW_HINT$delegate = C221108m2.LIZIZ(V2W.LJLIL);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PreviewHintComponent)) {
            return false;
        }
        PreviewHintComponent previewHintComponent = (PreviewHintComponent) obj;
        return o.LJ(this.senderPreviewText, previewHintComponent.senderPreviewText) && o.LJ(this.receiverPreviewText, previewHintComponent.receiverPreviewText) && o.LJ(this.quotePreviewText, previewHintComponent.quotePreviewText) && this.quotePreviewType == previewHintComponent.quotePreviewType && o.LJ(this.quotePicturePreview, previewHintComponent.quotePicturePreview);
    }

    public final int hashCode() {
        int hashCode = (this.quotePreviewText.hashCode() + ((this.receiverPreviewText.hashCode() + (this.senderPreviewText.hashCode() * 31)) * 31)) * 31;
        QuotePreviewTypeComponent quotePreviewTypeComponent = this.quotePreviewType;
        int hashCode2 = (hashCode + (quotePreviewTypeComponent == null ? 0 : quotePreviewTypeComponent.hashCode())) * 31;
        QuotePicturePreviewComponent quotePicturePreviewComponent = this.quotePicturePreview;
        return hashCode2 + (quotePicturePreviewComponent != null ? quotePicturePreviewComponent.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PreviewHintComponent(senderPreviewText=");
        LIZ.append(this.senderPreviewText);
        LIZ.append(", receiverPreviewText=");
        LIZ.append(this.receiverPreviewText);
        LIZ.append(", quotePreviewText=");
        LIZ.append(this.quotePreviewText);
        LIZ.append(", quotePreviewType=");
        LIZ.append(this.quotePreviewType);
        LIZ.append(", quotePicturePreview=");
        LIZ.append(this.quotePicturePreview);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        this.senderPreviewText.writeToParcel(out, i);
        this.receiverPreviewText.writeToParcel(out, i);
        this.quotePreviewText.writeToParcel(out, i);
        QuotePreviewTypeComponent quotePreviewTypeComponent = this.quotePreviewType;
        if (quotePreviewTypeComponent == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            quotePreviewTypeComponent.writeToParcel(out, i);
        }
        QuotePicturePreviewComponent quotePicturePreviewComponent = this.quotePicturePreview;
        if (quotePicturePreviewComponent == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            quotePicturePreviewComponent.writeToParcel(out, i);
        }
    }

    public final V4L LIZ() {
        V2T v2t;
        C79135V3z c79135V3z;
        EnumC79091V2h enumC79091V2h;
        EnumC79088V2e enumC79088V2e;
        C63714OzW c63714OzW;
        V34 v34 = new V34();
        v34.LIZLLL = this.senderPreviewText.L();
        v34.LJ = this.receiverPreviewText.L();
        v34.LJFF = this.quotePreviewText.L();
        QuotePreviewTypeComponent quotePreviewTypeComponent = this.quotePreviewType;
        V40 v40 = null;
        RU9 ru9 = null;
        if (quotePreviewTypeComponent != null) {
            v2t = quotePreviewTypeComponent.m132toProto();
        } else {
            v2t = null;
        }
        v34.LJI = v2t;
        QuotePicturePreviewComponent quotePicturePreviewComponent = this.quotePicturePreview;
        if (quotePicturePreviewComponent != null) {
            V31 v31 = new V31();
            v31.LIZLLL = quotePicturePreviewComponent.resourceId;
            v31.LJ = quotePicturePreviewComponent.senderUid;
            ImageComponent imageComponent = quotePicturePreviewComponent.previewImage;
            if (imageComponent != null) {
                c79135V3z = imageComponent.LIZIZ();
            } else {
                c79135V3z = null;
            }
            v31.LJFF = c79135V3z;
            IconTypeComponent iconTypeComponent = quotePicturePreviewComponent.fallbackIcon;
            if (iconTypeComponent != null) {
                enumC79091V2h = iconTypeComponent.m130toProto();
            } else {
                enumC79091V2h = null;
            }
            v31.LJI = enumC79091V2h;
            PreviewIconTypeComponent previewIconTypeComponent = quotePicturePreviewComponent.quotePreviewIcon;
            if (previewIconTypeComponent != null) {
                enumC79088V2e = previewIconTypeComponent.m131toProto();
            } else {
                enumC79088V2e = null;
            }
            v31.LJII = enumC79088V2e;
            ActionLinkComponent actionLinkComponent = quotePicturePreviewComponent.linkInfo;
            if (actionLinkComponent != null) {
                c63714OzW = actionLinkComponent.M();
            } else {
                c63714OzW = null;
            }
            v31.LJIIIIZZ = c63714OzW;
            TTLComponent tTLComponent = quotePicturePreviewComponent.ttl;
            if (tTLComponent != null) {
                RUA rua = new RUA();
                rua.LIZLLL = Long.valueOf(tTLComponent.expiredAt);
                ru9 = rua.build();
            }
            v31.LJIIIZ = ru9;
            v40 = v31.build();
        }
        v34.LJII = v40;
        return v34.build();
    }

    public /* synthetic */ PreviewHintComponent(TextComponent textComponent, TextComponent textComponent2, TextComponent textComponent3) {
        this(textComponent, textComponent2, textComponent3, null, null);
    }

    public PreviewHintComponent(TextComponent senderPreviewText, TextComponent receiverPreviewText, TextComponent quotePreviewText, QuotePreviewTypeComponent quotePreviewTypeComponent, QuotePicturePreviewComponent quotePicturePreviewComponent) {
        o.LJIIIZ(senderPreviewText, "senderPreviewText");
        o.LJIIIZ(receiverPreviewText, "receiverPreviewText");
        o.LJIIIZ(quotePreviewText, "quotePreviewText");
        this.senderPreviewText = senderPreviewText;
        this.receiverPreviewText = receiverPreviewText;
        this.quotePreviewText = quotePreviewText;
        this.quotePreviewType = quotePreviewTypeComponent;
        this.quotePicturePreview = quotePicturePreviewComponent;
    }
}
