package com.ss.android.ugc.aweme.im.message.template.card;

import X.C63714OzW;
import X.C64528PUe;
import X.C64537PUn;
import X.C79100V2q;
import X.C79110V3a;
import X.C79128V3s;
import X.C79129V3t;
import X.C79135V3z;
import X.RUF;
import X.V3X;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.wire.ProtoAdapter;
import com.ss.android.ugc.aweme.im.message.template.component.ActionLinkComponent;
import com.ss.android.ugc.aweme.im.message.template.component.BaseRequestComponent;
import com.ss.android.ugc.aweme.im.message.template.component.BaseResponseComponent;
import com.ss.android.ugc.aweme.im.message.template.component.BaseUserComponent;
import com.ss.android.ugc.aweme.im.message.template.component.ImageComponent;
import com.ss.android.ugc.aweme.im.message.template.component.PreviewHintComponent;
import com.ss.android.ugc.aweme.im.message.template.component.TextComponent;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class PortraitCardTemplate implements BaseTemplate {
    public static final Parcelable.Creator<PortraitCardTemplate> CREATOR = new C79100V2q();
    public final BaseRequestComponent baseRequestComponent;
    public final BaseResponseComponent baseResponseComponent;
    public final TextComponent hintTitleComponent;
    public final ImageComponent imageComponent;
    public final ActionLinkComponent linkComponent;
    public final int messageType;
    public final PreviewHintComponent previewHintComponent;
    public final TextComponent subTitleComponent;
    public final TextComponent titleComponent;
    public final BaseUserComponent userInfoComponent;

    public PortraitCardTemplate() {
        this(null, null, null, null, null, null, 511);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        ImageComponent imageComponent = this.imageComponent;
        if (imageComponent == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            imageComponent.writeToParcel(out, i);
        }
        BaseUserComponent baseUserComponent = this.userInfoComponent;
        if (baseUserComponent == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            baseUserComponent.writeToParcel(out, i);
        }
        TextComponent textComponent = this.titleComponent;
        if (textComponent == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            textComponent.writeToParcel(out, i);
        }
        TextComponent textComponent2 = this.subTitleComponent;
        if (textComponent2 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            textComponent2.writeToParcel(out, i);
        }
        TextComponent textComponent3 = this.hintTitleComponent;
        if (textComponent3 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            textComponent3.writeToParcel(out, i);
        }
        ActionLinkComponent actionLinkComponent = this.linkComponent;
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
    public final C64537PUn encode() {
        RUF ruf;
        RUF ruf2;
        RUF ruf3;
        C79135V3z c79135V3z;
        C79129V3t c79129V3t;
        C64528PUe c64528PUe = C64537PUn.Companion;
        ProtoAdapter<C79128V3s> protoAdapter = C79128V3s.ADAPTER;
        V3X v3x = new V3X();
        C79110V3a c79110V3a = new C79110V3a();
        TextComponent textComponent = this.titleComponent;
        C63714OzW c63714OzW = null;
        if (textComponent != null) {
            ruf = textComponent.L();
        } else {
            ruf = null;
        }
        c79110V3a.LJFF = ruf;
        TextComponent textComponent2 = this.subTitleComponent;
        if (textComponent2 != null) {
            ruf2 = textComponent2.L();
        } else {
            ruf2 = null;
        }
        c79110V3a.LJI = ruf2;
        TextComponent textComponent3 = this.hintTitleComponent;
        if (textComponent3 != null) {
            ruf3 = textComponent3.L();
        } else {
            ruf3 = null;
        }
        c79110V3a.LJII = ruf3;
        ImageComponent imageComponent = this.imageComponent;
        if (imageComponent != null) {
            c79135V3z = imageComponent.LIZIZ();
        } else {
            c79135V3z = null;
        }
        c79110V3a.LIZLLL = c79135V3z;
        BaseUserComponent baseUserComponent = this.userInfoComponent;
        if (baseUserComponent != null) {
            c79129V3t = baseUserComponent.LIZ();
        } else {
            c79129V3t = null;
        }
        c79110V3a.LJ = c79129V3t;
        ActionLinkComponent actionLinkComponent = this.linkComponent;
        if (actionLinkComponent != null) {
            c63714OzW = actionLinkComponent.M();
        }
        c79110V3a.LJIIIIZZ = c63714OzW;
        c79110V3a.LJIIIZ = this.previewHintComponent.LIZ();
        c79110V3a.LJIIJ = this.baseRequestComponent.L();
        c79110V3a.LJIIJJI = this.baseResponseComponent.L();
        v3x.LJIIIIZZ = c79110V3a.build();
        byte[] encode = protoAdapter.encode(v3x.build());
        o.LJIIIIZZ(encode, "ADAPTER\n            .enc…   .build()\n            )");
        return C64528PUe.LIZJ(c64528PUe, encode);
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        ImageComponent imageComponent = this.imageComponent;
        int i = 0;
        if (imageComponent == null) {
            hashCode = 0;
        } else {
            hashCode = imageComponent.hashCode();
        }
        int i2 = hashCode * 31;
        BaseUserComponent baseUserComponent = this.userInfoComponent;
        if (baseUserComponent == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = baseUserComponent.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        TextComponent textComponent = this.titleComponent;
        if (textComponent == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = textComponent.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        TextComponent textComponent2 = this.subTitleComponent;
        if (textComponent2 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = textComponent2.hashCode();
        }
        int i5 = (i4 + hashCode4) * 31;
        TextComponent textComponent3 = this.hintTitleComponent;
        if (textComponent3 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = textComponent3.hashCode();
        }
        int i6 = (i5 + hashCode5) * 31;
        ActionLinkComponent actionLinkComponent = this.linkComponent;
        if (actionLinkComponent != null) {
            i = actionLinkComponent.hashCode();
        }
        return this.baseRequestComponent.hashCode() + ((this.baseResponseComponent.hashCode() + ((this.previewHintComponent.hashCode() + ((i6 + i) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PortraitCardTemplate(imageComponent=");
        LIZ.append(this.imageComponent);
        LIZ.append(", userInfoComponent=");
        LIZ.append(this.userInfoComponent);
        LIZ.append(", titleComponent=");
        LIZ.append(this.titleComponent);
        LIZ.append(", subTitleComponent=");
        LIZ.append(this.subTitleComponent);
        LIZ.append(", hintTitleComponent=");
        LIZ.append(this.hintTitleComponent);
        LIZ.append(", linkComponent=");
        LIZ.append(this.linkComponent);
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
        if (!(obj instanceof PortraitCardTemplate)) {
            return false;
        }
        PortraitCardTemplate portraitCardTemplate = (PortraitCardTemplate) obj;
        if (o.LJ(this.imageComponent, portraitCardTemplate.imageComponent) && o.LJ(this.userInfoComponent, portraitCardTemplate.userInfoComponent) && o.LJ(this.titleComponent, portraitCardTemplate.titleComponent) && o.LJ(this.subTitleComponent, portraitCardTemplate.subTitleComponent) && o.LJ(this.hintTitleComponent, portraitCardTemplate.hintTitleComponent) && o.LJ(this.linkComponent, portraitCardTemplate.linkComponent) && o.LJ(this.previewHintComponent, portraitCardTemplate.previewHintComponent) && o.LJ(this.baseResponseComponent, portraitCardTemplate.baseResponseComponent) && o.LJ(this.baseRequestComponent, portraitCardTemplate.baseRequestComponent)) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.im.message.template.card.BaseTemplate
    public final BaseTemplate LLLLZLLLI(PreviewHintComponent preview, BaseRequestComponent request, BaseResponseComponent response) {
        o.LJIIIZ(preview, "preview");
        o.LJIIIZ(request, "request");
        o.LJIIIZ(response, "response");
        return new PortraitCardTemplate(this.imageComponent, this.userInfoComponent, this.titleComponent, this.subTitleComponent, this.hintTitleComponent, this.linkComponent, preview, response, request);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public PortraitCardTemplate(com.ss.android.ugc.aweme.im.message.template.component.ImageComponent r14, com.ss.android.ugc.aweme.im.message.template.component.BaseUserComponent r15, com.ss.android.ugc.aweme.im.message.template.component.TextComponent r16, com.ss.android.ugc.aweme.im.message.template.component.ActionLinkComponent r17, com.ss.android.ugc.aweme.im.message.template.component.PreviewHintComponent r18, com.ss.android.ugc.aweme.im.message.template.component.BaseRequestComponent r19, int r20) {
        /*
            r13 = this;
            r3 = r20
            r5 = r15
            r4 = r14
            r9 = r17
            r12 = r19
            r6 = r16
            r10 = r18
            r0 = r3 & 1
            if (r0 == 0) goto L19
            X.V2l r0 = com.ss.android.ugc.aweme.im.message.template.component.ImageComponent.Companion
            r0.getClass()
            com.ss.android.ugc.aweme.im.message.template.component.ImageComponent r4 = X.C79095V2l.LIZ()
        L19:
            r0 = r3 & 2
            if (r0 == 0) goto L2a
            X.OlZ r0 = com.ss.android.ugc.aweme.im.message.template.component.BaseUserComponent.Companion
            r0.getClass()
            X.5H3<com.ss.android.ugc.aweme.im.message.template.component.BaseUserComponent> r0 = com.ss.android.ugc.aweme.im.message.template.component.BaseUserComponent.EMPTY_USER_INFO$delegate
            java.lang.Object r5 = r0.getValue()
            com.ss.android.ugc.aweme.im.message.template.component.BaseUserComponent r5 = (com.ss.android.ugc.aweme.im.message.template.component.BaseUserComponent) r5
        L2a:
            r0 = r3 & 4
            if (r0 == 0) goto L37
            X.V2z r0 = com.ss.android.ugc.aweme.im.message.template.component.TextComponent.Companion
            r0.getClass()
            com.ss.android.ugc.aweme.im.message.template.component.TextComponent r6 = X.C79109V2z.LIZ()
        L37:
            r0 = r3 & 8
            r11 = 0
            if (r0 == 0) goto L8d
            X.V2z r0 = com.ss.android.ugc.aweme.im.message.template.component.TextComponent.Companion
            r0.getClass()
            com.ss.android.ugc.aweme.im.message.template.component.TextComponent r7 = X.C79109V2z.LIZ()
        L45:
            r0 = r3 & 16
            if (r0 == 0) goto L8b
            X.V2z r0 = com.ss.android.ugc.aweme.im.message.template.component.TextComponent.Companion
            r0.getClass()
            com.ss.android.ugc.aweme.im.message.template.component.TextComponent r8 = X.C79109V2z.LIZ()
        L52:
            r0 = r3 & 32
            if (r0 == 0) goto L5f
            X.OzX r0 = com.ss.android.ugc.aweme.im.message.template.component.ActionLinkComponent.Companion
            r0.getClass()
            com.ss.android.ugc.aweme.im.message.template.component.ActionLinkComponent r9 = X.C63715OzX.LIZ()
        L5f:
            r0 = r3 & 64
            if (r0 == 0) goto L6c
            X.V2d r0 = com.ss.android.ugc.aweme.im.message.template.component.PreviewHintComponent.Companion
            r0.getClass()
            com.ss.android.ugc.aweme.im.message.template.component.PreviewHintComponent r10 = X.C79087V2d.LIZ()
        L6c:
            r0 = r3 & 128(0x80, float:1.8E-43)
            if (r0 == 0) goto L79
            com.ss.android.ugc.aweme.im.message.template.component.BaseResponseComponent r11 = new com.ss.android.ugc.aweme.im.message.template.component.BaseResponseComponent
            r0 = 0
            r2 = 15
            r11.<init>(r0, r2)
        L79:
            r0 = r3 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L86
            X.RVe r0 = com.ss.android.ugc.aweme.im.message.template.component.BaseRequestComponent.Companion
            r0.getClass()
            com.ss.android.ugc.aweme.im.message.template.component.BaseRequestComponent r12 = X.C69650RVe.LIZ()
        L86:
            r3 = r13
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return
        L8b:
            r8 = r11
            goto L52
        L8d:
            r7 = r11
            goto L45
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.message.template.card.PortraitCardTemplate.<init>(com.ss.android.ugc.aweme.im.message.template.component.ImageComponent, com.ss.android.ugc.aweme.im.message.template.component.BaseUserComponent, com.ss.android.ugc.aweme.im.message.template.component.TextComponent, com.ss.android.ugc.aweme.im.message.template.component.ActionLinkComponent, com.ss.android.ugc.aweme.im.message.template.component.PreviewHintComponent, com.ss.android.ugc.aweme.im.message.template.component.BaseRequestComponent, int):void");
    }

    public PortraitCardTemplate(ImageComponent imageComponent, BaseUserComponent baseUserComponent, TextComponent textComponent, TextComponent textComponent2, TextComponent textComponent3, ActionLinkComponent actionLinkComponent, PreviewHintComponent previewHintComponent, BaseResponseComponent baseResponseComponent, BaseRequestComponent baseRequestComponent) {
        o.LJIIIZ(previewHintComponent, "previewHintComponent");
        o.LJIIIZ(baseResponseComponent, "baseResponseComponent");
        o.LJIIIZ(baseRequestComponent, "baseRequestComponent");
        this.imageComponent = imageComponent;
        this.userInfoComponent = baseUserComponent;
        this.titleComponent = textComponent;
        this.subTitleComponent = textComponent2;
        this.hintTitleComponent = textComponent3;
        this.linkComponent = actionLinkComponent;
        this.previewHintComponent = previewHintComponent;
        this.baseResponseComponent = baseResponseComponent;
        this.baseRequestComponent = baseRequestComponent;
        this.messageType = 1806;
    }
}
