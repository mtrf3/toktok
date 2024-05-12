package com.ss.android.ugc.aweme.im.message.template.component;

import X.C05040Hs;
import X.C221108m2;
import X.C5H3;
import X.V2C;
import X.V2D;
import X.V2E;
import X.V40;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class QuotePicturePreviewComponent implements BaseComponent<V40> {
    public final IconTypeComponent fallbackIcon;
    public final ActionLinkComponent linkInfo;
    public final ImageComponent previewImage;
    public final PreviewIconTypeComponent quotePreviewIcon;
    public final String resourceId;
    public final Long senderUid;
    public final TTLComponent ttl;
    public static final V2C Companion = new V2C();
    public static final Parcelable.Creator<QuotePicturePreviewComponent> CREATOR = new V2E();
    public static final C5H3<QuotePicturePreviewComponent> EMPTY_PICTURE_PREVIEW$delegate = C221108m2.LIZIZ(V2D.LJLIL);

    /* JADX WARN: Multi-variable type inference failed */
    public QuotePicturePreviewComponent() {
        this((String) null, (Long) (0 == true ? 1 : 0), (ImageComponent) (0 == true ? 1 : 0), (IconTypeComponent) (0 == true ? 1 : 0), (PreviewIconTypeComponent) (0 == true ? 1 : 0), (TTLComponent) (0 == true ? 1 : 0), 127);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof QuotePicturePreviewComponent)) {
            return false;
        }
        QuotePicturePreviewComponent quotePicturePreviewComponent = (QuotePicturePreviewComponent) obj;
        return o.LJ(this.resourceId, quotePicturePreviewComponent.resourceId) && o.LJ(this.senderUid, quotePicturePreviewComponent.senderUid) && o.LJ(this.previewImage, quotePicturePreviewComponent.previewImage) && this.fallbackIcon == quotePicturePreviewComponent.fallbackIcon && this.quotePreviewIcon == quotePicturePreviewComponent.quotePreviewIcon && o.LJ(this.linkInfo, quotePicturePreviewComponent.linkInfo) && o.LJ(this.ttl, quotePicturePreviewComponent.ttl);
    }

    public final int hashCode() {
        String str = this.resourceId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l = this.senderUid;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        ImageComponent imageComponent = this.previewImage;
        int hashCode3 = (hashCode2 + (imageComponent == null ? 0 : imageComponent.hashCode())) * 31;
        IconTypeComponent iconTypeComponent = this.fallbackIcon;
        int hashCode4 = (hashCode3 + (iconTypeComponent == null ? 0 : iconTypeComponent.hashCode())) * 31;
        PreviewIconTypeComponent previewIconTypeComponent = this.quotePreviewIcon;
        int hashCode5 = (hashCode4 + (previewIconTypeComponent == null ? 0 : previewIconTypeComponent.hashCode())) * 31;
        ActionLinkComponent actionLinkComponent = this.linkInfo;
        int hashCode6 = (hashCode5 + (actionLinkComponent == null ? 0 : actionLinkComponent.hashCode())) * 31;
        TTLComponent tTLComponent = this.ttl;
        return hashCode6 + (tTLComponent != null ? tTLComponent.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("QuotePicturePreviewComponent(resourceId=");
        LIZ.append(this.resourceId);
        LIZ.append(", senderUid=");
        LIZ.append(this.senderUid);
        LIZ.append(", previewImage=");
        LIZ.append(this.previewImage);
        LIZ.append(", fallbackIcon=");
        LIZ.append(this.fallbackIcon);
        LIZ.append(", quotePreviewIcon=");
        LIZ.append(this.quotePreviewIcon);
        LIZ.append(", linkInfo=");
        LIZ.append(this.linkInfo);
        LIZ.append(", ttl=");
        LIZ.append(this.ttl);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.resourceId);
        Long l = this.senderUid;
        if (l == null) {
            out.writeInt(0);
        } else {
            C05040Hs.LIZLLL(out, 1, l);
        }
        ImageComponent imageComponent = this.previewImage;
        if (imageComponent == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            imageComponent.writeToParcel(out, i);
        }
        IconTypeComponent iconTypeComponent = this.fallbackIcon;
        if (iconTypeComponent == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            iconTypeComponent.writeToParcel(out, i);
        }
        PreviewIconTypeComponent previewIconTypeComponent = this.quotePreviewIcon;
        if (previewIconTypeComponent == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            previewIconTypeComponent.writeToParcel(out, i);
        }
        ActionLinkComponent actionLinkComponent = this.linkInfo;
        if (actionLinkComponent == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            actionLinkComponent.writeToParcel(out, i);
        }
        TTLComponent tTLComponent = this.ttl;
        if (tTLComponent == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            tTLComponent.writeToParcel(out, i);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ QuotePicturePreviewComponent(java.lang.String r9, java.lang.Long r10, com.ss.android.ugc.aweme.im.message.template.component.ImageComponent r11, com.ss.android.ugc.aweme.im.message.template.component.IconTypeComponent r12, com.ss.android.ugc.aweme.im.message.template.component.PreviewIconTypeComponent r13, com.ss.android.ugc.aweme.im.message.template.component.TTLComponent r14, int r15) {
        /*
            r8 = this;
            r2 = r10
            r3 = r11
            r1 = r9
            r4 = r12
            r5 = r13
            r7 = r14
            r0 = r15 & 1
            r6 = 0
            if (r0 == 0) goto Lc
            r1 = r6
        Lc:
            r0 = r15 & 2
            if (r0 == 0) goto L11
            r2 = r6
        L11:
            r0 = r15 & 4
            if (r0 == 0) goto L1e
            X.V2l r0 = com.ss.android.ugc.aweme.im.message.template.component.ImageComponent.Companion
            r0.getClass()
            com.ss.android.ugc.aweme.im.message.template.component.ImageComponent r3 = X.C79095V2l.LIZ()
        L1e:
            r0 = r15 & 8
            if (r0 == 0) goto L24
            com.ss.android.ugc.aweme.im.message.template.component.IconTypeComponent r4 = com.ss.android.ugc.aweme.im.message.template.component.IconTypeComponent.DEFAULT
        L24:
            r0 = r15 & 16
            if (r0 == 0) goto L2a
            com.ss.android.ugc.aweme.im.message.template.component.PreviewIconTypeComponent r5 = com.ss.android.ugc.aweme.im.message.template.component.PreviewIconTypeComponent.NOICON
        L2a:
            r0 = r15 & 32
            if (r0 == 0) goto L37
            X.OzX r0 = com.ss.android.ugc.aweme.im.message.template.component.ActionLinkComponent.Companion
            r0.getClass()
            com.ss.android.ugc.aweme.im.message.template.component.ActionLinkComponent r6 = X.C63715OzX.LIZ()
        L37:
            r0 = r15 & 64
            if (r0 == 0) goto L41
            com.ss.android.ugc.aweme.im.message.template.component.TTLComponent r7 = new com.ss.android.ugc.aweme.im.message.template.component.TTLComponent
            r0 = 0
            r7.<init>(r0)
        L41:
            r0 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.message.template.component.QuotePicturePreviewComponent.<init>(java.lang.String, java.lang.Long, com.ss.android.ugc.aweme.im.message.template.component.ImageComponent, com.ss.android.ugc.aweme.im.message.template.component.IconTypeComponent, com.ss.android.ugc.aweme.im.message.template.component.PreviewIconTypeComponent, com.ss.android.ugc.aweme.im.message.template.component.TTLComponent, int):void");
    }

    public QuotePicturePreviewComponent(String str, Long l, ImageComponent imageComponent, IconTypeComponent iconTypeComponent, PreviewIconTypeComponent previewIconTypeComponent, ActionLinkComponent actionLinkComponent, TTLComponent tTLComponent) {
        this.resourceId = str;
        this.senderUid = l;
        this.previewImage = imageComponent;
        this.fallbackIcon = iconTypeComponent;
        this.quotePreviewIcon = previewIconTypeComponent;
        this.linkInfo = actionLinkComponent;
        this.ttl = tTLComponent;
    }
}
