package com.ss.android.ugc.aweme.im.message.template.card;

import X.AnonymousClass391;
import X.C32I;
import X.C63685Oz3;
import X.C64528PUe;
import X.C64537PUn;
import X.C79105V2v;
import X.C79116V3g;
import X.C79128V3s;
import X.C79141V4f;
import X.C79151V4p;
import X.UC7;
import X.V3X;
import X.V3Z;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.wire.ProtoAdapter;
import com.ss.android.ugc.aweme.im.message.template.card.imagecard.ImageCardTitleBar;
import com.ss.android.ugc.aweme.im.message.template.component.ActionLinkComponent;
import com.ss.android.ugc.aweme.im.message.template.component.BaseRequestComponent;
import com.ss.android.ugc.aweme.im.message.template.component.BaseResponseComponent;
import com.ss.android.ugc.aweme.im.message.template.component.ButtonComponent;
import com.ss.android.ugc.aweme.im.message.template.component.PreviewHintComponent;
import com.ss.android.ugc.aweme.im.message.template.component.VideoCoverComponent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class ImageCardTemplate implements BaseTemplate {
    public static final Parcelable.Creator<ImageCardTemplate> CREATOR = new C79105V2v();
    public final ActionLinkComponent actionLinkComponent;
    public final BaseRequestComponent baseRequestComponent;
    public final BaseResponseComponent baseResponseComponent;
    public final int messageType;
    public final PreviewHintComponent previewHintComponent;
    public final ImageCardTitleBar titleBar;
    public final List<VideoCoverComponent> videoCoversComponentList;

    public ImageCardTemplate() {
        this((ImageCardTitleBar) null, (ActionLinkComponent) null, (List) null, (PreviewHintComponent) null, (BaseRequestComponent) null, 63);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.im.message.template.card.BaseTemplate
    public final C64537PUn encode() {
        C79141V4f c79141V4f;
        C64528PUe c64528PUe = C64537PUn.Companion;
        ProtoAdapter<C79128V3s> protoAdapter = C79128V3s.ADAPTER;
        V3X v3x = new V3X();
        V3Z v3z = new V3Z();
        ImageCardTitleBar imageCardTitleBar = this.titleBar;
        imageCardTitleBar.getClass();
        C79116V3g c79116V3g = new C79116V3g();
        c79116V3g.LIZLLL = imageCardTitleBar.leftImage.LIZIZ();
        c79116V3g.LJ = imageCardTitleBar.title.L();
        c79116V3g.LJFF = imageCardTitleBar.subtitle.L();
        ButtonComponent buttonComponent = imageCardTitleBar.rightButton;
        if (buttonComponent != null) {
            C79151V4p c79151V4p = new C79151V4p();
            c79151V4p.LIZLLL = buttonComponent.text.L();
            c79151V4p.LJFF = buttonComponent.linkComponent.M();
            c79141V4f = c79151V4p.build();
        } else {
            c79141V4f = null;
        }
        c79116V3g.LJI = c79141V4f;
        v3z.LIZLLL = c79116V3g.build();
        List<VideoCoverComponent> list = this.videoCoversComponentList;
        ArrayList arrayList = new ArrayList(C32I.LJJL(list, 10));
        Iterator<VideoCoverComponent> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().LIZ());
        }
        C63685Oz3.LIZ(arrayList);
        v3z.LJ = arrayList;
        v3z.LJFF = this.actionLinkComponent.M();
        v3z.LJI = this.previewHintComponent.LIZ();
        v3z.LJII = this.baseRequestComponent.L();
        v3z.LJIIIIZZ = this.baseResponseComponent.L();
        v3x.LIZLLL = v3z.build();
        byte[] encode = protoAdapter.encode(v3x.build());
        o.LJIIIIZZ(encode, "ADAPTER\n            .enc…   .build()\n            )");
        return C64528PUe.LIZJ(c64528PUe, encode);
    }

    public final int hashCode() {
        return this.baseRequestComponent.hashCode() + ((this.baseResponseComponent.hashCode() + ((this.previewHintComponent.hashCode() + AnonymousClass391.LIZIZ(this.videoCoversComponentList, (this.actionLinkComponent.hashCode() + (this.titleBar.hashCode() * 31)) * 31, 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ImageCardTemplate(titleBar=");
        LIZ.append(this.titleBar);
        LIZ.append(", actionLinkComponent=");
        LIZ.append(this.actionLinkComponent);
        LIZ.append(", videoCoversComponentList=");
        LIZ.append(this.videoCoversComponentList);
        LIZ.append(", previewHintComponent=");
        LIZ.append(this.previewHintComponent);
        LIZ.append(", baseResponseComponent=");
        LIZ.append(this.baseResponseComponent);
        LIZ.append(", baseRequestComponent=");
        LIZ.append(this.baseRequestComponent);
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
        if (!(obj instanceof ImageCardTemplate)) {
            return false;
        }
        ImageCardTemplate imageCardTemplate = (ImageCardTemplate) obj;
        if (o.LJ(this.titleBar, imageCardTemplate.titleBar) && o.LJ(this.actionLinkComponent, imageCardTemplate.actionLinkComponent) && o.LJ(this.videoCoversComponentList, imageCardTemplate.videoCoversComponentList) && o.LJ(this.previewHintComponent, imageCardTemplate.previewHintComponent) && o.LJ(this.baseResponseComponent, imageCardTemplate.baseResponseComponent) && o.LJ(this.baseRequestComponent, imageCardTemplate.baseRequestComponent)) {
            return true;
        }
        return false;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        this.titleBar.writeToParcel(out, i);
        this.actionLinkComponent.writeToParcel(out, i);
        Iterator LIZJ = UC7.LIZJ(this.videoCoversComponentList, out);
        while (LIZJ.hasNext()) {
            ((VideoCoverComponent) LIZJ.next()).writeToParcel(out, i);
        }
        this.previewHintComponent.writeToParcel(out, i);
        this.baseResponseComponent.writeToParcel(out, i);
        this.baseRequestComponent.writeToParcel(out, i);
    }

    @Override // com.ss.android.ugc.aweme.im.message.template.card.BaseTemplate
    public final BaseTemplate LLLLZLLLI(PreviewHintComponent preview, BaseRequestComponent request, BaseResponseComponent response) {
        o.LJIIIZ(preview, "preview");
        o.LJIIIZ(request, "request");
        o.LJIIIZ(response, "response");
        return LIZ(this, null, preview, response, request, 7);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ImageCardTemplate(com.ss.android.ugc.aweme.im.message.template.card.imagecard.ImageCardTitleBar r10, com.ss.android.ugc.aweme.im.message.template.component.ActionLinkComponent r11, java.util.List r12, com.ss.android.ugc.aweme.im.message.template.component.PreviewHintComponent r13, com.ss.android.ugc.aweme.im.message.template.component.BaseRequestComponent r14, int r15) {
        /*
            r9 = this;
            r8 = r14
            r6 = r13
            r5 = r12
            r3 = r10
            r4 = r11
            r0 = r15 & 1
            if (r0 == 0) goto L16
            X.UzS r0 = com.ss.android.ugc.aweme.im.message.template.card.imagecard.ImageCardTitleBar.Companion
            r0.getClass()
            X.5H3<com.ss.android.ugc.aweme.im.message.template.card.imagecard.ImageCardTitleBar> r0 = com.ss.android.ugc.aweme.im.message.template.card.imagecard.ImageCardTitleBar.EMPTY_IMAGE_CARD_TITLE_BAR$delegate
            java.lang.Object r3 = r0.getValue()
            com.ss.android.ugc.aweme.im.message.template.card.imagecard.ImageCardTitleBar r3 = (com.ss.android.ugc.aweme.im.message.template.card.imagecard.ImageCardTitleBar) r3
        L16:
            r0 = r15 & 2
            if (r0 == 0) goto L23
            X.OzX r0 = com.ss.android.ugc.aweme.im.message.template.component.ActionLinkComponent.Companion
            r0.getClass()
            com.ss.android.ugc.aweme.im.message.template.component.ActionLinkComponent r4 = X.C63715OzX.LIZ()
        L23:
            r0 = r15 & 4
            if (r0 == 0) goto L29
            X.OQg r5 = X.C61878OQg.INSTANCE
        L29:
            r0 = r15 & 8
            if (r0 == 0) goto L36
            X.V2d r0 = com.ss.android.ugc.aweme.im.message.template.component.PreviewHintComponent.Companion
            r0.getClass()
            com.ss.android.ugc.aweme.im.message.template.component.PreviewHintComponent r6 = X.C79087V2d.LIZ()
        L36:
            r0 = r15 & 16
            if (r0 == 0) goto L55
            com.ss.android.ugc.aweme.im.message.template.component.BaseResponseComponent r7 = new com.ss.android.ugc.aweme.im.message.template.component.BaseResponseComponent
            r0 = 0
            r2 = 15
            r7.<init>(r0, r2)
        L43:
            r0 = r15 & 32
            if (r0 == 0) goto L50
            X.RVe r0 = com.ss.android.ugc.aweme.im.message.template.component.BaseRequestComponent.Companion
            r0.getClass()
            com.ss.android.ugc.aweme.im.message.template.component.BaseRequestComponent r8 = X.C69650RVe.LIZ()
        L50:
            r2 = r9
            r2.<init>(r3, r4, r5, r6, r7, r8)
            return
        L55:
            r7 = 0
            goto L43
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.message.template.card.ImageCardTemplate.<init>(com.ss.android.ugc.aweme.im.message.template.card.imagecard.ImageCardTitleBar, com.ss.android.ugc.aweme.im.message.template.component.ActionLinkComponent, java.util.List, com.ss.android.ugc.aweme.im.message.template.component.PreviewHintComponent, com.ss.android.ugc.aweme.im.message.template.component.BaseRequestComponent, int):void");
    }

    public static ImageCardTemplate LIZ(ImageCardTemplate imageCardTemplate, ActionLinkComponent actionLinkComponent, PreviewHintComponent previewHintComponent, BaseResponseComponent baseResponseComponent, BaseRequestComponent baseRequestComponent, int i) {
        ImageCardTitleBar titleBar;
        BaseRequestComponent baseRequestComponent2 = baseRequestComponent;
        BaseResponseComponent baseResponseComponent2 = baseResponseComponent;
        ActionLinkComponent actionLinkComponent2 = actionLinkComponent;
        PreviewHintComponent previewHintComponent2 = previewHintComponent;
        List<VideoCoverComponent> videoCoversComponentList = null;
        if ((i & 1) != 0) {
            titleBar = imageCardTemplate.titleBar;
        } else {
            titleBar = null;
        }
        if ((i & 2) != 0) {
            actionLinkComponent2 = imageCardTemplate.actionLinkComponent;
        }
        if ((i & 4) != 0) {
            videoCoversComponentList = imageCardTemplate.videoCoversComponentList;
        }
        if ((i & 8) != 0) {
            previewHintComponent2 = imageCardTemplate.previewHintComponent;
        }
        if ((i & 16) != 0) {
            baseResponseComponent2 = imageCardTemplate.baseResponseComponent;
        }
        if ((i & 32) != 0) {
            baseRequestComponent2 = imageCardTemplate.baseRequestComponent;
        }
        imageCardTemplate.getClass();
        o.LJIIIZ(titleBar, "titleBar");
        o.LJIIIZ(actionLinkComponent2, "actionLinkComponent");
        o.LJIIIZ(videoCoversComponentList, "videoCoversComponentList");
        o.LJIIIZ(previewHintComponent2, "previewHintComponent");
        o.LJIIIZ(baseResponseComponent2, "baseResponseComponent");
        o.LJIIIZ(baseRequestComponent2, "baseRequestComponent");
        return new ImageCardTemplate(titleBar, actionLinkComponent2, videoCoversComponentList, previewHintComponent2, baseResponseComponent2, baseRequestComponent2);
    }

    public ImageCardTemplate(ImageCardTitleBar titleBar, ActionLinkComponent actionLinkComponent, List<VideoCoverComponent> videoCoversComponentList, PreviewHintComponent previewHintComponent, BaseResponseComponent baseResponseComponent, BaseRequestComponent baseRequestComponent) {
        o.LJIIIZ(titleBar, "titleBar");
        o.LJIIIZ(actionLinkComponent, "actionLinkComponent");
        o.LJIIIZ(videoCoversComponentList, "videoCoversComponentList");
        o.LJIIIZ(previewHintComponent, "previewHintComponent");
        o.LJIIIZ(baseResponseComponent, "baseResponseComponent");
        o.LJIIIZ(baseRequestComponent, "baseRequestComponent");
        this.titleBar = titleBar;
        this.actionLinkComponent = actionLinkComponent;
        this.videoCoversComponentList = videoCoversComponentList;
        this.previewHintComponent = previewHintComponent;
        this.baseResponseComponent = baseResponseComponent;
        this.baseRequestComponent = baseRequestComponent;
        this.messageType = 1801;
    }
}
