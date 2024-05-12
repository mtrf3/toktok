package com.ss.android.ugc.aweme.im.message.template.card;

import X.AnonymousClass391;
import X.C32I;
import X.C63685Oz3;
import X.C63714OzW;
import X.C64528PUe;
import X.C64537PUn;
import X.C79106V2w;
import X.C79117V3h;
import X.C79122V3m;
import X.C79128V3s;
import X.C79135V3z;
import X.RUF;
import X.RUV;
import X.RUX;
import X.UC7;
import X.V3D;
import X.V3X;
import X.V3Y;
import X.V43;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.wire.ProtoAdapter;
import com.ss.android.ugc.aweme.im.message.template.card.infocard.CardButtonType;
import com.ss.android.ugc.aweme.im.message.template.card.infocard.InfoCardButtonComponent;
import com.ss.android.ugc.aweme.im.message.template.card.infocard.InfoCardContentComponent;
import com.ss.android.ugc.aweme.im.message.template.card.infocard.InfoCardTitleBarComponent;
import com.ss.android.ugc.aweme.im.message.template.component.ActionLinkComponent;
import com.ss.android.ugc.aweme.im.message.template.component.BaseRequestComponent;
import com.ss.android.ugc.aweme.im.message.template.component.BaseResponseComponent;
import com.ss.android.ugc.aweme.im.message.template.component.ImageComponent;
import com.ss.android.ugc.aweme.im.message.template.component.PreviewHintComponent;
import com.ss.android.ugc.aweme.im.message.template.component.TextComponent;
import com.ss.android.ugc.aweme.im.message.template.component.VideoCoverComponent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class InfoCardTemplate implements BaseTemplate {
    public static final Parcelable.Creator<InfoCardTemplate> CREATOR = new C79106V2w();
    public final BaseRequestComponent baseRequestComponent;
    public final BaseResponseComponent baseResponseComponent;
    public final VideoCoverComponent baseVideo;
    public final InfoCardContentComponent cardContent;
    public final InfoCardTitleBarComponent cardTitle;
    public final List<InfoCardButtonComponent> infoCardButtons;
    public final ActionLinkComponent linkInfo;
    public final int messageType;
    public final PreviewHintComponent previewHintComponent;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public InfoCardTemplate() {
        /*
            r11 = this;
            com.ss.android.ugc.aweme.im.message.template.card.infocard.InfoCardTitleBarComponent r3 = new com.ss.android.ugc.aweme.im.message.template.card.infocard.InfoCardTitleBarComponent
            r0 = 0
            r3.<init>(r0)
            r4 = 0
            X.OQg r6 = X.C61878OQg.INSTANCE
            X.V2d r0 = com.ss.android.ugc.aweme.im.message.template.component.PreviewHintComponent.Companion
            r0.getClass()
            com.ss.android.ugc.aweme.im.message.template.component.PreviewHintComponent r8 = X.C79087V2d.LIZ()
            com.ss.android.ugc.aweme.im.message.template.component.BaseResponseComponent r9 = new com.ss.android.ugc.aweme.im.message.template.component.BaseResponseComponent
            r0 = 0
            r2 = 15
            r9.<init>(r0, r2)
            X.RVe r0 = com.ss.android.ugc.aweme.im.message.template.component.BaseRequestComponent.Companion
            r0.getClass()
            com.ss.android.ugc.aweme.im.message.template.component.BaseRequestComponent r10 = X.C69650RVe.LIZ()
            r2 = r11
            r5 = r4
            r7 = r4
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.message.template.card.InfoCardTemplate.<init>():void");
    }

    @Override // com.ss.android.ugc.aweme.im.message.template.card.BaseTemplate
    public final C64537PUn encode() {
        C79135V3z c79135V3z;
        RUV ruv;
        V43 v43;
        RUF ruf;
        V3D v3d;
        C64528PUe c64528PUe = C64537PUn.Companion;
        ProtoAdapter<C79128V3s> protoAdapter = C79128V3s.ADAPTER;
        V3X v3x = new V3X();
        V3Y v3y = new V3Y();
        InfoCardTitleBarComponent infoCardTitleBarComponent = this.cardTitle;
        infoCardTitleBarComponent.getClass();
        C79122V3m c79122V3m = new C79122V3m();
        c79122V3m.LIZLLL = infoCardTitleBarComponent.title.L();
        ImageComponent imageComponent = infoCardTitleBarComponent.image;
        C63714OzW c63714OzW = null;
        if (imageComponent != null) {
            c79135V3z = imageComponent.LIZIZ();
        } else {
            c79135V3z = null;
        }
        c79122V3m.LJ = c79135V3z;
        v3y.LIZLLL = c79122V3m.build();
        InfoCardContentComponent infoCardContentComponent = this.cardContent;
        if (infoCardContentComponent != null) {
            RUX rux = new RUX();
            rux.LIZLLL = infoCardContentComponent.description.L();
            List<TextComponent> list = infoCardContentComponent.contentList;
            ArrayList arrayList = new ArrayList(C32I.LJJL(list, 10));
            Iterator<TextComponent> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().L());
            }
            C63685Oz3.LIZ(arrayList);
            rux.LJ = arrayList;
            ruv = rux.build();
        } else {
            ruv = null;
        }
        v3y.LJ = ruv;
        VideoCoverComponent videoCoverComponent = this.baseVideo;
        if (videoCoverComponent != null) {
            v43 = videoCoverComponent.LIZ();
        } else {
            v43 = null;
        }
        v3y.LJFF = v43;
        List<InfoCardButtonComponent> list2 = this.infoCardButtons;
        ArrayList arrayList2 = new ArrayList(C32I.LJJL(list2, 10));
        for (InfoCardButtonComponent infoCardButtonComponent : list2) {
            infoCardButtonComponent.getClass();
            C79117V3h c79117V3h = new C79117V3h();
            c79117V3h.LIZLLL = infoCardButtonComponent.cardText.L();
            TextComponent textComponent = infoCardButtonComponent.hint;
            if (textComponent != null) {
                ruf = textComponent.L();
            } else {
                ruf = null;
            }
            c79117V3h.LJ = ruf;
            c79117V3h.LJFF = infoCardButtonComponent.linkInfo.M();
            CardButtonType cardButtonType = infoCardButtonComponent.buttonType;
            if (cardButtonType != null) {
                v3d = cardButtonType.m128toProto();
            } else {
                v3d = null;
            }
            c79117V3h.LJI = v3d;
            arrayList2.add(c79117V3h.build());
        }
        C63685Oz3.LIZ(arrayList2);
        v3y.LJI = arrayList2;
        ActionLinkComponent actionLinkComponent = this.linkInfo;
        if (actionLinkComponent != null) {
            c63714OzW = actionLinkComponent.M();
        }
        v3y.LJII = c63714OzW;
        v3y.LJIIIIZZ = this.baseRequestComponent.L();
        v3y.LJIIIZ = this.baseResponseComponent.L();
        v3x.LJI = v3y.build();
        byte[] encode = protoAdapter.encode(v3x.build());
        o.LJIIIIZZ(encode, "ADAPTER\n            .enc…   .build()\n            )");
        return C64528PUe.LIZJ(c64528PUe, encode);
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3 = this.cardTitle.hashCode() * 31;
        InfoCardContentComponent infoCardContentComponent = this.cardContent;
        int i = 0;
        if (infoCardContentComponent == null) {
            hashCode = 0;
        } else {
            hashCode = infoCardContentComponent.hashCode();
        }
        int i2 = (hashCode3 + hashCode) * 31;
        VideoCoverComponent videoCoverComponent = this.baseVideo;
        if (videoCoverComponent == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = videoCoverComponent.hashCode();
        }
        int LIZIZ = AnonymousClass391.LIZIZ(this.infoCardButtons, (i2 + hashCode2) * 31, 31);
        ActionLinkComponent actionLinkComponent = this.linkInfo;
        if (actionLinkComponent != null) {
            i = actionLinkComponent.hashCode();
        }
        return this.baseRequestComponent.hashCode() + ((this.baseResponseComponent.hashCode() + ((this.previewHintComponent.hashCode() + ((LIZIZ + i) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("InfoCardTemplate(cardTitle=");
        LIZ.append(this.cardTitle);
        LIZ.append(", cardContent=");
        LIZ.append(this.cardContent);
        LIZ.append(", baseVideo=");
        LIZ.append(this.baseVideo);
        LIZ.append(", infoCardButtons=");
        LIZ.append(this.infoCardButtons);
        LIZ.append(", linkInfo=");
        LIZ.append(this.linkInfo);
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
        if (!(obj instanceof InfoCardTemplate)) {
            return false;
        }
        InfoCardTemplate infoCardTemplate = (InfoCardTemplate) obj;
        if (o.LJ(this.cardTitle, infoCardTemplate.cardTitle) && o.LJ(this.cardContent, infoCardTemplate.cardContent) && o.LJ(this.baseVideo, infoCardTemplate.baseVideo) && o.LJ(this.infoCardButtons, infoCardTemplate.infoCardButtons) && o.LJ(this.linkInfo, infoCardTemplate.linkInfo) && o.LJ(this.previewHintComponent, infoCardTemplate.previewHintComponent) && o.LJ(this.baseResponseComponent, infoCardTemplate.baseResponseComponent) && o.LJ(this.baseRequestComponent, infoCardTemplate.baseRequestComponent)) {
            return true;
        }
        return false;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        this.cardTitle.writeToParcel(out, i);
        InfoCardContentComponent infoCardContentComponent = this.cardContent;
        if (infoCardContentComponent == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            infoCardContentComponent.writeToParcel(out, i);
        }
        VideoCoverComponent videoCoverComponent = this.baseVideo;
        if (videoCoverComponent == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            videoCoverComponent.writeToParcel(out, i);
        }
        Iterator LIZJ = UC7.LIZJ(this.infoCardButtons, out);
        while (LIZJ.hasNext()) {
            ((InfoCardButtonComponent) LIZJ.next()).writeToParcel(out, i);
        }
        ActionLinkComponent actionLinkComponent = this.linkInfo;
        if (actionLinkComponent == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            actionLinkComponent.writeToParcel(out, i);
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
        return LIZ(this, null, preview, response, request, 31);
    }

    public static InfoCardTemplate LIZ(InfoCardTemplate infoCardTemplate, ActionLinkComponent actionLinkComponent, PreviewHintComponent previewHintComponent, BaseResponseComponent baseResponseComponent, BaseRequestComponent baseRequestComponent, int i) {
        InfoCardTitleBarComponent cardTitle;
        InfoCardContentComponent infoCardContentComponent;
        VideoCoverComponent videoCoverComponent;
        BaseRequestComponent baseRequestComponent2 = baseRequestComponent;
        BaseResponseComponent baseResponseComponent2 = baseResponseComponent;
        ActionLinkComponent actionLinkComponent2 = actionLinkComponent;
        PreviewHintComponent previewHintComponent2 = previewHintComponent;
        List<InfoCardButtonComponent> infoCardButtons = null;
        if ((i & 1) != 0) {
            cardTitle = infoCardTemplate.cardTitle;
        } else {
            cardTitle = null;
        }
        if ((i & 2) != 0) {
            infoCardContentComponent = infoCardTemplate.cardContent;
        } else {
            infoCardContentComponent = null;
        }
        if ((i & 4) != 0) {
            videoCoverComponent = infoCardTemplate.baseVideo;
        } else {
            videoCoverComponent = null;
        }
        if ((i & 8) != 0) {
            infoCardButtons = infoCardTemplate.infoCardButtons;
        }
        if ((i & 16) != 0) {
            actionLinkComponent2 = infoCardTemplate.linkInfo;
        }
        if ((i & 32) != 0) {
            previewHintComponent2 = infoCardTemplate.previewHintComponent;
        }
        if ((i & 64) != 0) {
            baseResponseComponent2 = infoCardTemplate.baseResponseComponent;
        }
        if ((i & 128) != 0) {
            baseRequestComponent2 = infoCardTemplate.baseRequestComponent;
        }
        infoCardTemplate.getClass();
        o.LJIIIZ(cardTitle, "cardTitle");
        o.LJIIIZ(infoCardButtons, "infoCardButtons");
        o.LJIIIZ(previewHintComponent2, "previewHintComponent");
        o.LJIIIZ(baseResponseComponent2, "baseResponseComponent");
        o.LJIIIZ(baseRequestComponent2, "baseRequestComponent");
        return new InfoCardTemplate(cardTitle, infoCardContentComponent, videoCoverComponent, infoCardButtons, actionLinkComponent2, previewHintComponent2, baseResponseComponent2, baseRequestComponent2);
    }

    public InfoCardTemplate(InfoCardTitleBarComponent cardTitle, InfoCardContentComponent infoCardContentComponent, VideoCoverComponent videoCoverComponent, List<InfoCardButtonComponent> infoCardButtons, ActionLinkComponent actionLinkComponent, PreviewHintComponent previewHintComponent, BaseResponseComponent baseResponseComponent, BaseRequestComponent baseRequestComponent) {
        o.LJIIIZ(cardTitle, "cardTitle");
        o.LJIIIZ(infoCardButtons, "infoCardButtons");
        o.LJIIIZ(previewHintComponent, "previewHintComponent");
        o.LJIIIZ(baseResponseComponent, "baseResponseComponent");
        o.LJIIIZ(baseRequestComponent, "baseRequestComponent");
        this.cardTitle = cardTitle;
        this.cardContent = infoCardContentComponent;
        this.baseVideo = videoCoverComponent;
        this.infoCardButtons = infoCardButtons;
        this.linkInfo = actionLinkComponent;
        this.previewHintComponent = previewHintComponent;
        this.baseResponseComponent = baseResponseComponent;
        this.baseRequestComponent = baseRequestComponent;
        this.messageType = 1804;
    }
}
