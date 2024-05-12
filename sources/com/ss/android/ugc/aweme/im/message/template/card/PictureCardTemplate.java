package com.ss.android.ugc.aweme.im.message.template.card;

import X.C64528PUe;
import X.C64537PUn;
import X.C79120V3k;
import X.C79127V3r;
import X.C79128V3s;
import X.V3J;
import X.V3X;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.wire.ProtoAdapter;
import com.ss.android.ugc.aweme.im.message.template.component.ActionLinkComponent;
import com.ss.android.ugc.aweme.im.message.template.component.BaseRequestComponent;
import com.ss.android.ugc.aweme.im.message.template.component.BaseResponseComponent;
import com.ss.android.ugc.aweme.im.message.template.component.ImageComponent;
import com.ss.android.ugc.aweme.im.message.template.component.PictureCardFallbackInfoComponent;
import com.ss.android.ugc.aweme.im.message.template.component.PreviewHintComponent;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class PictureCardTemplate implements BaseTemplate {
    public static final Parcelable.Creator<PictureCardTemplate> CREATOR = new V3J();
    public final BaseRequestComponent baseRequestComponent;
    public final BaseResponseComponent baseResponseComponent;
    public final PictureCardFallbackInfoComponent fallbackInfo;
    public final ImageComponent imageComponent;
    public final ActionLinkComponent linkInfo;
    public final int messageType;
    public final PreviewHintComponent previewHintComponent;
    public final ImageComponent thumbnailComponent;

    public PictureCardTemplate() {
        this(null, null, null, 127);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        this.imageComponent.writeToParcel(out, i);
        this.thumbnailComponent.writeToParcel(out, i);
        this.fallbackInfo.writeToParcel(out, i);
        this.linkInfo.writeToParcel(out, i);
        this.previewHintComponent.writeToParcel(out, i);
        this.baseRequestComponent.writeToParcel(out, i);
        this.baseResponseComponent.writeToParcel(out, i);
    }

    @Override // com.ss.android.ugc.aweme.im.message.template.card.BaseTemplate
    public final C64537PUn encode() {
        C64528PUe c64528PUe = C64537PUn.Companion;
        ProtoAdapter<C79128V3s> protoAdapter = C79128V3s.ADAPTER;
        V3X v3x = new V3X();
        C79127V3r c79127V3r = new C79127V3r();
        c79127V3r.LIZLLL = this.imageComponent.LIZIZ();
        c79127V3r.LJ = this.thumbnailComponent.LIZIZ();
        PictureCardFallbackInfoComponent pictureCardFallbackInfoComponent = this.fallbackInfo;
        pictureCardFallbackInfoComponent.getClass();
        C79120V3k c79120V3k = new C79120V3k();
        c79120V3k.LIZLLL = pictureCardFallbackInfoComponent.image.LIZIZ();
        c79120V3k.LJ = pictureCardFallbackInfoComponent.text.L();
        c79120V3k.LJFF = pictureCardFallbackInfoComponent.linkInfo.M();
        c79127V3r.LJII = c79120V3k.build();
        c79127V3r.LJFF = this.previewHintComponent.LIZ();
        c79127V3r.LJIIJ = this.baseRequestComponent.L();
        c79127V3r.LJI = this.linkInfo.M();
        v3x.LJ = c79127V3r.build();
        byte[] encode = protoAdapter.encode(v3x.build());
        o.LJIIIIZZ(encode, "ADAPTER\n            .enc…   .build()\n            )");
        return C64528PUe.LIZJ(c64528PUe, encode);
    }

    public final int hashCode() {
        return this.baseResponseComponent.hashCode() + ((this.baseRequestComponent.hashCode() + ((this.previewHintComponent.hashCode() + ((this.linkInfo.hashCode() + ((this.fallbackInfo.hashCode() + ((this.thumbnailComponent.hashCode() + (this.imageComponent.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PictureCardTemplate(imageComponent=");
        LIZ.append(this.imageComponent);
        LIZ.append(", thumbnailComponent=");
        LIZ.append(this.thumbnailComponent);
        LIZ.append(", fallbackInfo=");
        LIZ.append(this.fallbackInfo);
        LIZ.append(", linkInfo=");
        LIZ.append(this.linkInfo);
        LIZ.append(", previewHintComponent=");
        LIZ.append(this.previewHintComponent);
        LIZ.append(", baseRequestComponent=");
        LIZ.append(this.baseRequestComponent);
        LIZ.append(", baseResponseComponent=");
        LIZ.append(this.baseResponseComponent);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    @Override // com.ss.android.ugc.aweme.im.message.template.card.BaseTemplate
    public final BaseResponseComponent LLILLJJLI() {
        return this.baseResponseComponent;
    }

    @Override // com.ss.android.ugc.aweme.im.message.template.card.BaseTemplate
    public final BaseRequestComponent LLLL() {
        return this.baseRequestComponent;
    }

    @Override // com.ss.android.ugc.aweme.im.message.template.card.BaseTemplate
    public final PreviewHintComponent LLZLL() {
        return this.previewHintComponent;
    }

    @Override // com.ss.android.ugc.aweme.im.message.template.card.BaseTemplate
    public final int getMessageType() {
        return this.messageType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PictureCardTemplate)) {
            return false;
        }
        PictureCardTemplate pictureCardTemplate = (PictureCardTemplate) obj;
        if (o.LJ(this.imageComponent, pictureCardTemplate.imageComponent) && o.LJ(this.thumbnailComponent, pictureCardTemplate.thumbnailComponent) && o.LJ(this.fallbackInfo, pictureCardTemplate.fallbackInfo) && o.LJ(this.linkInfo, pictureCardTemplate.linkInfo) && o.LJ(this.previewHintComponent, pictureCardTemplate.previewHintComponent) && o.LJ(this.baseRequestComponent, pictureCardTemplate.baseRequestComponent) && o.LJ(this.baseResponseComponent, pictureCardTemplate.baseResponseComponent)) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.im.message.template.card.BaseTemplate
    public final BaseTemplate LLLLZLLLI(PreviewHintComponent preview, BaseRequestComponent request, BaseResponseComponent response) {
        o.LJIIIZ(preview, "preview");
        o.LJIIIZ(request, "request");
        o.LJIIIZ(response, "response");
        return LIZ(this, null, preview, request, response, 15);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public PictureCardTemplate(com.ss.android.ugc.aweme.im.message.template.component.ImageComponent r11, com.ss.android.ugc.aweme.im.message.template.component.PreviewHintComponent r12, com.ss.android.ugc.aweme.im.message.template.component.BaseRequestComponent r13, int r14) {
        /*
            r10 = this;
            r8 = r13
            r3 = r11
            r7 = r12
            r0 = r14 & 1
            if (r0 == 0) goto L10
            X.V2l r0 = com.ss.android.ugc.aweme.im.message.template.component.ImageComponent.Companion
            r0.getClass()
            com.ss.android.ugc.aweme.im.message.template.component.ImageComponent r3 = X.C79095V2l.LIZ()
        L10:
            r0 = r14 & 2
            r9 = 0
            if (r0 == 0) goto L66
            X.V2l r0 = com.ss.android.ugc.aweme.im.message.template.component.ImageComponent.Companion
            r0.getClass()
            com.ss.android.ugc.aweme.im.message.template.component.ImageComponent r4 = X.C79095V2l.LIZ()
        L1e:
            r0 = r14 & 4
            if (r0 == 0) goto L64
            X.RoE r0 = com.ss.android.ugc.aweme.im.message.template.component.PictureCardFallbackInfoComponent.Companion
            r0.getClass()
            com.ss.android.ugc.aweme.im.message.template.component.PictureCardFallbackInfoComponent r5 = com.ss.android.ugc.aweme.im.message.template.component.PictureCardFallbackInfoComponent.EMPTY_FALLBACK
        L29:
            r0 = r14 & 8
            if (r0 == 0) goto L62
            X.OzX r0 = com.ss.android.ugc.aweme.im.message.template.component.ActionLinkComponent.Companion
            r0.getClass()
            com.ss.android.ugc.aweme.im.message.template.component.ActionLinkComponent r6 = X.C63715OzX.LIZ()
        L36:
            r0 = r14 & 16
            if (r0 == 0) goto L43
            X.V2d r0 = com.ss.android.ugc.aweme.im.message.template.component.PreviewHintComponent.Companion
            r0.getClass()
            com.ss.android.ugc.aweme.im.message.template.component.PreviewHintComponent r7 = X.C79087V2d.LIZ()
        L43:
            r0 = r14 & 32
            if (r0 == 0) goto L50
            X.RVe r0 = com.ss.android.ugc.aweme.im.message.template.component.BaseRequestComponent.Companion
            r0.getClass()
            com.ss.android.ugc.aweme.im.message.template.component.BaseRequestComponent r8 = X.C69650RVe.LIZ()
        L50:
            r0 = r14 & 64
            if (r0 == 0) goto L5d
            com.ss.android.ugc.aweme.im.message.template.component.BaseResponseComponent r9 = new com.ss.android.ugc.aweme.im.message.template.component.BaseResponseComponent
            r0 = 0
            r2 = 15
            r9.<init>(r0, r2)
        L5d:
            r2 = r10
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            return
        L62:
            r6 = r9
            goto L36
        L64:
            r5 = r9
            goto L29
        L66:
            r4 = r9
            goto L1e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.message.template.card.PictureCardTemplate.<init>(com.ss.android.ugc.aweme.im.message.template.component.ImageComponent, com.ss.android.ugc.aweme.im.message.template.component.PreviewHintComponent, com.ss.android.ugc.aweme.im.message.template.component.BaseRequestComponent, int):void");
    }

    public static PictureCardTemplate LIZ(PictureCardTemplate pictureCardTemplate, ActionLinkComponent actionLinkComponent, PreviewHintComponent previewHintComponent, BaseRequestComponent baseRequestComponent, BaseResponseComponent baseResponseComponent, int i) {
        ImageComponent imageComponent;
        ImageComponent thumbnailComponent;
        BaseResponseComponent baseResponseComponent2 = baseResponseComponent;
        BaseRequestComponent baseRequestComponent2 = baseRequestComponent;
        ActionLinkComponent linkInfo = actionLinkComponent;
        PreviewHintComponent previewHintComponent2 = previewHintComponent;
        PictureCardFallbackInfoComponent fallbackInfo = null;
        if ((i & 1) != 0) {
            imageComponent = pictureCardTemplate.imageComponent;
        } else {
            imageComponent = null;
        }
        if ((i & 2) != 0) {
            thumbnailComponent = pictureCardTemplate.thumbnailComponent;
        } else {
            thumbnailComponent = null;
        }
        if ((i & 4) != 0) {
            fallbackInfo = pictureCardTemplate.fallbackInfo;
        }
        if ((i & 8) != 0) {
            linkInfo = pictureCardTemplate.linkInfo;
        }
        if ((i & 16) != 0) {
            previewHintComponent2 = pictureCardTemplate.previewHintComponent;
        }
        if ((i & 32) != 0) {
            baseRequestComponent2 = pictureCardTemplate.baseRequestComponent;
        }
        if ((i & 64) != 0) {
            baseResponseComponent2 = pictureCardTemplate.baseResponseComponent;
        }
        pictureCardTemplate.getClass();
        o.LJIIIZ(imageComponent, "imageComponent");
        o.LJIIIZ(thumbnailComponent, "thumbnailComponent");
        o.LJIIIZ(fallbackInfo, "fallbackInfo");
        o.LJIIIZ(linkInfo, "linkInfo");
        o.LJIIIZ(previewHintComponent2, "previewHintComponent");
        o.LJIIIZ(baseRequestComponent2, "baseRequestComponent");
        o.LJIIIZ(baseResponseComponent2, "baseResponseComponent");
        return new PictureCardTemplate(imageComponent, thumbnailComponent, fallbackInfo, linkInfo, previewHintComponent2, baseRequestComponent2, baseResponseComponent2);
    }

    public PictureCardTemplate(ImageComponent imageComponent, ImageComponent thumbnailComponent, PictureCardFallbackInfoComponent fallbackInfo, ActionLinkComponent linkInfo, PreviewHintComponent previewHintComponent, BaseRequestComponent baseRequestComponent, BaseResponseComponent baseResponseComponent) {
        o.LJIIIZ(imageComponent, "imageComponent");
        o.LJIIIZ(thumbnailComponent, "thumbnailComponent");
        o.LJIIIZ(fallbackInfo, "fallbackInfo");
        o.LJIIIZ(linkInfo, "linkInfo");
        o.LJIIIZ(previewHintComponent, "previewHintComponent");
        o.LJIIIZ(baseRequestComponent, "baseRequestComponent");
        o.LJIIIZ(baseResponseComponent, "baseResponseComponent");
        this.imageComponent = imageComponent;
        this.thumbnailComponent = thumbnailComponent;
        this.fallbackInfo = fallbackInfo;
        this.linkInfo = linkInfo;
        this.previewHintComponent = previewHintComponent;
        this.baseRequestComponent = baseRequestComponent;
        this.baseResponseComponent = baseResponseComponent;
        this.messageType = 1802;
    }
}
