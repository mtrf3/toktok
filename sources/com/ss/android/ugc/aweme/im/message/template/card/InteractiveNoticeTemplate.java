package com.ss.android.ugc.aweme.im.message.template.card;

import X.C64528PUe;
import X.C64537PUn;
import X.C79099V2p;
import X.C79115V3f;
import X.C79125V3p;
import X.C79128V3s;
import X.RUF;
import X.V3X;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.wire.ProtoAdapter;
import com.ss.android.ugc.aweme.im.message.template.component.BaseRequestComponent;
import com.ss.android.ugc.aweme.im.message.template.component.BaseResponseComponent;
import com.ss.android.ugc.aweme.im.message.template.component.PreviewHintComponent;
import com.ss.android.ugc.aweme.im.message.template.component.TextComponent;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class InteractiveNoticeTemplate implements BaseTemplate {
    public final BaseRequestComponent baseRequestComponent;
    public final BaseResponseComponent baseResponseComponent;
    public final TextComponent interactiveNotice;
    public final int messageType;
    public final TextComponent plainNotice;
    public final PreviewHintComponent previewHintComponent;
    public final TextComponent queryContent;
    public final String queryMessageId;
    public static final C79125V3p Companion = new C79125V3p();
    public static final Parcelable.Creator<InteractiveNoticeTemplate> CREATOR = new C79099V2p();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        TextComponent textComponent = this.plainNotice;
        if (textComponent == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            textComponent.writeToParcel(out, i);
        }
        TextComponent textComponent2 = this.interactiveNotice;
        if (textComponent2 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            textComponent2.writeToParcel(out, i);
        }
        TextComponent textComponent3 = this.queryContent;
        if (textComponent3 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            textComponent3.writeToParcel(out, i);
        }
        out.writeString(this.queryMessageId);
        this.previewHintComponent.writeToParcel(out, i);
        this.baseRequestComponent.writeToParcel(out, i);
        this.baseResponseComponent.writeToParcel(out, i);
    }

    @Override // com.ss.android.ugc.aweme.im.message.template.card.BaseTemplate
    public final C64537PUn encode() {
        RUF ruf;
        RUF ruf2;
        C64528PUe c64528PUe = C64537PUn.Companion;
        ProtoAdapter<C79128V3s> protoAdapter = C79128V3s.ADAPTER;
        V3X v3x = new V3X();
        C79115V3f c79115V3f = new C79115V3f();
        TextComponent textComponent = this.plainNotice;
        RUF ruf3 = null;
        if (textComponent != null) {
            ruf = textComponent.L();
        } else {
            ruf = null;
        }
        c79115V3f.LIZLLL = ruf;
        TextComponent textComponent2 = this.interactiveNotice;
        if (textComponent2 != null) {
            ruf2 = textComponent2.L();
        } else {
            ruf2 = null;
        }
        c79115V3f.LJ = ruf2;
        TextComponent textComponent3 = this.queryContent;
        if (textComponent3 != null) {
            ruf3 = textComponent3.L();
        }
        c79115V3f.LJI = ruf3;
        c79115V3f.LJFF = this.queryMessageId;
        c79115V3f.LJIIIIZZ = this.baseRequestComponent.L();
        c79115V3f.LJIIIZ = this.baseResponseComponent.L();
        v3x.LJIIJ = c79115V3f.build();
        byte[] encode = protoAdapter.encode(v3x.build());
        o.LJIIIIZZ(encode, "ADAPTER\n            .enc…  .build(),\n            )");
        return C64528PUe.LIZJ(c64528PUe, encode);
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        TextComponent textComponent = this.plainNotice;
        int i = 0;
        if (textComponent == null) {
            hashCode = 0;
        } else {
            hashCode = textComponent.hashCode();
        }
        int i2 = hashCode * 31;
        TextComponent textComponent2 = this.interactiveNotice;
        if (textComponent2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = textComponent2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        TextComponent textComponent3 = this.queryContent;
        if (textComponent3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = textComponent3.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        String str = this.queryMessageId;
        if (str != null) {
            i = str.hashCode();
        }
        return this.baseResponseComponent.hashCode() + ((this.baseRequestComponent.hashCode() + ((this.previewHintComponent.hashCode() + ((i4 + i) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("InteractiveNoticeTemplate(plainNotice=");
        LIZ.append(this.plainNotice);
        LIZ.append(", interactiveNotice=");
        LIZ.append(this.interactiveNotice);
        LIZ.append(", queryContent=");
        LIZ.append(this.queryContent);
        LIZ.append(", queryMessageId=");
        LIZ.append(this.queryMessageId);
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
        if (!(obj instanceof InteractiveNoticeTemplate)) {
            return false;
        }
        InteractiveNoticeTemplate interactiveNoticeTemplate = (InteractiveNoticeTemplate) obj;
        if (o.LJ(this.plainNotice, interactiveNoticeTemplate.plainNotice) && o.LJ(this.interactiveNotice, interactiveNoticeTemplate.interactiveNotice) && o.LJ(this.queryContent, interactiveNoticeTemplate.queryContent) && o.LJ(this.queryMessageId, interactiveNoticeTemplate.queryMessageId) && o.LJ(this.previewHintComponent, interactiveNoticeTemplate.previewHintComponent) && o.LJ(this.baseRequestComponent, interactiveNoticeTemplate.baseRequestComponent) && o.LJ(this.baseResponseComponent, interactiveNoticeTemplate.baseResponseComponent)) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.im.message.template.card.BaseTemplate
    public final BaseTemplate LLLLZLLLI(PreviewHintComponent preview, BaseRequestComponent request, BaseResponseComponent response) {
        o.LJIIIZ(preview, "preview");
        o.LJIIIZ(request, "request");
        o.LJIIIZ(response, "response");
        return new InteractiveNoticeTemplate(this.plainNotice, this.interactiveNotice, this.queryContent, this.queryMessageId, preview, request, response);
    }

    public InteractiveNoticeTemplate(TextComponent textComponent, TextComponent textComponent2, TextComponent textComponent3, String str, PreviewHintComponent previewHintComponent, BaseRequestComponent baseRequestComponent, BaseResponseComponent baseResponseComponent) {
        o.LJIIIZ(previewHintComponent, "previewHintComponent");
        o.LJIIIZ(baseRequestComponent, "baseRequestComponent");
        o.LJIIIZ(baseResponseComponent, "baseResponseComponent");
        this.plainNotice = textComponent;
        this.interactiveNotice = textComponent2;
        this.queryContent = textComponent3;
        this.queryMessageId = str;
        this.previewHintComponent = previewHintComponent;
        this.baseRequestComponent = baseRequestComponent;
        this.baseResponseComponent = baseResponseComponent;
        this.messageType = 1808;
    }
}
