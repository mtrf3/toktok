package com.ss.android.ugc.aweme.im.message.template.card.infocard;

import X.V3C;
import X.V4N;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.im.message.template.component.ActionLinkComponent;
import com.ss.android.ugc.aweme.im.message.template.component.BaseComponent;
import com.ss.android.ugc.aweme.im.message.template.component.TextComponent;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class InfoCardButtonComponent implements BaseComponent<V4N> {
    public static final Parcelable.Creator<InfoCardButtonComponent> CREATOR = new V3C();
    public final CardButtonType buttonType;
    public final TextComponent cardText;
    public final TextComponent hint;
    public final ActionLinkComponent linkInfo;

    /* JADX WARN: Multi-variable type inference failed */
    public InfoCardButtonComponent() {
        this((TextComponent) null, (ActionLinkComponent) (0 == true ? 1 : 0), (CardButtonType) (0 == true ? 1 : 0), 15);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InfoCardButtonComponent)) {
            return false;
        }
        InfoCardButtonComponent infoCardButtonComponent = (InfoCardButtonComponent) obj;
        return o.LJ(this.cardText, infoCardButtonComponent.cardText) && o.LJ(this.hint, infoCardButtonComponent.hint) && o.LJ(this.linkInfo, infoCardButtonComponent.linkInfo) && this.buttonType == infoCardButtonComponent.buttonType;
    }

    public final int hashCode() {
        int hashCode = this.cardText.hashCode() * 31;
        TextComponent textComponent = this.hint;
        int hashCode2 = (this.linkInfo.hashCode() + ((hashCode + (textComponent == null ? 0 : textComponent.hashCode())) * 31)) * 31;
        CardButtonType cardButtonType = this.buttonType;
        return hashCode2 + (cardButtonType != null ? cardButtonType.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("InfoCardButtonComponent(cardText=");
        LIZ.append(this.cardText);
        LIZ.append(", hint=");
        LIZ.append(this.hint);
        LIZ.append(", linkInfo=");
        LIZ.append(this.linkInfo);
        LIZ.append(", buttonType=");
        LIZ.append(this.buttonType);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        this.cardText.writeToParcel(out, i);
        TextComponent textComponent = this.hint;
        if (textComponent == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            textComponent.writeToParcel(out, i);
        }
        this.linkInfo.writeToParcel(out, i);
        CardButtonType cardButtonType = this.buttonType;
        if (cardButtonType == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            cardButtonType.writeToParcel(out, i);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ InfoCardButtonComponent(com.ss.android.ugc.aweme.im.message.template.component.TextComponent r3, com.ss.android.ugc.aweme.im.message.template.component.ActionLinkComponent r4, com.ss.android.ugc.aweme.im.message.template.card.infocard.CardButtonType r5, int r6) {
        /*
            r2 = this;
            r0 = r6 & 1
            if (r0 == 0) goto Ld
            X.V2z r0 = com.ss.android.ugc.aweme.im.message.template.component.TextComponent.Companion
            r0.getClass()
            com.ss.android.ugc.aweme.im.message.template.component.TextComponent r3 = X.C79109V2z.LIZ()
        Ld:
            r0 = r6 & 2
            if (r0 == 0) goto L31
            X.V2z r0 = com.ss.android.ugc.aweme.im.message.template.component.TextComponent.Companion
            r0.getClass()
            com.ss.android.ugc.aweme.im.message.template.component.TextComponent r1 = X.C79109V2z.LIZ()
        L1a:
            r0 = r6 & 4
            if (r0 == 0) goto L27
            X.OzX r0 = com.ss.android.ugc.aweme.im.message.template.component.ActionLinkComponent.Companion
            r0.getClass()
            com.ss.android.ugc.aweme.im.message.template.component.ActionLinkComponent r4 = X.C63715OzX.LIZ()
        L27:
            r0 = r6 & 8
            if (r0 == 0) goto L2d
            com.ss.android.ugc.aweme.im.message.template.card.infocard.CardButtonType r5 = com.ss.android.ugc.aweme.im.message.template.card.infocard.CardButtonType.DEFAULT
        L2d:
            r2.<init>(r3, r1, r4, r5)
            return
        L31:
            r1 = 0
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.message.template.card.infocard.InfoCardButtonComponent.<init>(com.ss.android.ugc.aweme.im.message.template.component.TextComponent, com.ss.android.ugc.aweme.im.message.template.component.ActionLinkComponent, com.ss.android.ugc.aweme.im.message.template.card.infocard.CardButtonType, int):void");
    }

    public InfoCardButtonComponent(TextComponent cardText, TextComponent textComponent, ActionLinkComponent linkInfo, CardButtonType cardButtonType) {
        o.LJIIIZ(cardText, "cardText");
        o.LJIIIZ(linkInfo, "linkInfo");
        this.cardText = cardText;
        this.hint = textComponent;
        this.linkInfo = linkInfo;
        this.buttonType = cardButtonType;
    }
}
