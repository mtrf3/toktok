package com.ss.android.ugc.aweme.im.message.template.card;

import X.AnonymousClass391;
import X.C1FJ;
import X.C279017q;
import X.C32I;
import X.C63685Oz3;
import X.C64528PUe;
import X.C64537PUn;
import X.C79119V3j;
import X.C79124V3o;
import X.C79128V3s;
import X.RUF;
import X.UC7;
import X.V38;
import X.V3W;
import X.V3X;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.wire.ProtoAdapter;
import com.ss.android.ugc.aweme.im.message.template.card.botanswercard.BotAnswerCardItemComponent;
import com.ss.android.ugc.aweme.im.message.template.component.ActionLinkComponent;
import com.ss.android.ugc.aweme.im.message.template.component.BaseRequestComponent;
import com.ss.android.ugc.aweme.im.message.template.component.BaseResponseComponent;
import com.ss.android.ugc.aweme.im.message.template.component.BaseUserComponent;
import com.ss.android.ugc.aweme.im.message.template.component.PreviewHintComponent;
import com.ss.android.ugc.aweme.im.message.template.component.TextComponent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class BotAnswerCardTemplate implements BaseTemplate {
    public final AnswerStatusComponent answerStatus;
    public final TextComponent answerText;
    public final BaseRequestComponent baseRequestComponent;
    public final BaseResponseComponent baseResponseComponent;
    public final Integer cardType;
    public final List<Integer> contentTypes;
    public final List<ActionLinkComponent> linkInfoItems;
    public final int messageType;
    public final PreviewHintComponent previewHintComponent;
    public final List<BotAnswerCardItemComponent> recommendItems;
    public final List<BaseUserComponent> recommendUsers;
    public static final C79124V3o Companion = new C79124V3o();
    public static final Parcelable.Creator<BotAnswerCardTemplate> CREATOR = new V38();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.im.message.template.card.BaseTemplate
    public final C64537PUn encode() {
        ArrayList arrayList;
        RUF ruf;
        ArrayList arrayList2;
        C64528PUe c64528PUe = C64537PUn.Companion;
        ProtoAdapter<C79128V3s> protoAdapter = C79128V3s.ADAPTER;
        V3X v3x = new V3X();
        V3W v3w = new V3W();
        v3w.LJIIIZ = this.cardType;
        List<Integer> list = this.contentTypes;
        C63685Oz3.LIZ(list);
        v3w.LJIIJ = list;
        List<ActionLinkComponent> list2 = this.linkInfoItems;
        ArrayList arrayList3 = null;
        if (list2 != null) {
            arrayList = new ArrayList(C32I.LJJL(list2, 10));
            Iterator<ActionLinkComponent> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().M());
            }
        } else {
            arrayList = null;
        }
        C63685Oz3.LIZ(arrayList);
        v3w.LJIIIIZZ = arrayList;
        TextComponent textComponent = this.answerText;
        if (textComponent != null) {
            ruf = textComponent.L();
        } else {
            ruf = null;
        }
        v3w.LIZLLL = ruf;
        v3w.LJFF = this.answerStatus.m126toProto();
        List<BotAnswerCardItemComponent> list3 = this.recommendItems;
        if (list3 != null) {
            arrayList2 = new ArrayList(C32I.LJJL(list3, 10));
            for (BotAnswerCardItemComponent botAnswerCardItemComponent : list3) {
                botAnswerCardItemComponent.getClass();
                C79119V3j c79119V3j = new C79119V3j();
                c79119V3j.LIZLLL = Long.valueOf(botAnswerCardItemComponent.itemId);
                c79119V3j.LJ = Long.valueOf(botAnswerCardItemComponent.diggCount);
                c79119V3j.LJFF = botAnswerCardItemComponent.cover.LIZIZ();
                c79119V3j.LJI = botAnswerCardItemComponent.fallback.LIZIZ();
                arrayList2.add(c79119V3j.build());
            }
        } else {
            arrayList2 = null;
        }
        C63685Oz3.LIZ(arrayList2);
        v3w.LJ = arrayList2;
        v3w.LJI = this.previewHintComponent.LIZ();
        List<BaseUserComponent> list4 = this.recommendUsers;
        if (list4 != null) {
            arrayList3 = new ArrayList(C32I.LJJL(list4, 10));
            Iterator<BaseUserComponent> it2 = list4.iterator();
            while (it2.hasNext()) {
                arrayList3.add(it2.next().LIZ());
            }
        }
        C63685Oz3.LIZ(arrayList3);
        v3w.LJII = arrayList3;
        v3w.LJIIJJI = this.baseRequestComponent.L();
        v3w.LJIIL = this.baseResponseComponent.L();
        v3x.LJIIIZ = v3w.build();
        byte[] encode = protoAdapter.encode(v3x.build());
        o.LJIIIIZZ(encode, "ADAPTER\n            .enc…  .build(),\n            )");
        return C64528PUe.LIZJ(c64528PUe, encode);
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        Integer num = this.cardType;
        int i = 0;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int LIZIZ = AnonymousClass391.LIZIZ(this.contentTypes, hashCode * 31, 31);
        List<ActionLinkComponent> list = this.linkInfoItems;
        if (list == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = list.hashCode();
        }
        int i2 = (LIZIZ + hashCode2) * 31;
        TextComponent textComponent = this.answerText;
        if (textComponent == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = textComponent.hashCode();
        }
        int i3 = (i2 + hashCode3) * 31;
        List<BotAnswerCardItemComponent> list2 = this.recommendItems;
        if (list2 != null) {
            i = list2.hashCode();
        }
        return this.baseResponseComponent.hashCode() + ((this.baseRequestComponent.hashCode() + ((this.previewHintComponent.hashCode() + AnonymousClass391.LIZIZ(this.recommendUsers, (this.answerStatus.hashCode() + ((i3 + i) * 31)) * 31, 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("BotAnswerCardTemplate(cardType=");
        LIZ.append(this.cardType);
        LIZ.append(", contentTypes=");
        LIZ.append(this.contentTypes);
        LIZ.append(", linkInfoItems=");
        LIZ.append(this.linkInfoItems);
        LIZ.append(", answerText=");
        LIZ.append(this.answerText);
        LIZ.append(", recommendItems=");
        LIZ.append(this.recommendItems);
        LIZ.append(", answerStatus=");
        LIZ.append(this.answerStatus);
        LIZ.append(", recommendUsers=");
        LIZ.append(this.recommendUsers);
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
        if (!(obj instanceof BotAnswerCardTemplate)) {
            return false;
        }
        BotAnswerCardTemplate botAnswerCardTemplate = (BotAnswerCardTemplate) obj;
        if (o.LJ(this.cardType, botAnswerCardTemplate.cardType) && o.LJ(this.contentTypes, botAnswerCardTemplate.contentTypes) && o.LJ(this.linkInfoItems, botAnswerCardTemplate.linkInfoItems) && o.LJ(this.answerText, botAnswerCardTemplate.answerText) && o.LJ(this.recommendItems, botAnswerCardTemplate.recommendItems) && this.answerStatus == botAnswerCardTemplate.answerStatus && o.LJ(this.recommendUsers, botAnswerCardTemplate.recommendUsers) && o.LJ(this.previewHintComponent, botAnswerCardTemplate.previewHintComponent) && o.LJ(this.baseRequestComponent, botAnswerCardTemplate.baseRequestComponent) && o.LJ(this.baseResponseComponent, botAnswerCardTemplate.baseResponseComponent)) {
            return true;
        }
        return false;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        Integer num = this.cardType;
        if (num == null) {
            out.writeInt(0);
        } else {
            C1FJ.LJ(out, 1, num);
        }
        Iterator LIZJ = UC7.LIZJ(this.contentTypes, out);
        while (LIZJ.hasNext()) {
            out.writeInt(((Number) LIZJ.next()).intValue());
        }
        List<ActionLinkComponent> list = this.linkInfoItems;
        if (list == null) {
            out.writeInt(0);
        } else {
            Iterator LIZIZ = C279017q.LIZIZ(out, 1, list);
            while (LIZIZ.hasNext()) {
                ((ActionLinkComponent) LIZIZ.next()).writeToParcel(out, i);
            }
        }
        TextComponent textComponent = this.answerText;
        if (textComponent == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            textComponent.writeToParcel(out, i);
        }
        List<BotAnswerCardItemComponent> list2 = this.recommendItems;
        if (list2 == null) {
            out.writeInt(0);
        } else {
            Iterator LIZIZ2 = C279017q.LIZIZ(out, 1, list2);
            while (LIZIZ2.hasNext()) {
                ((BotAnswerCardItemComponent) LIZIZ2.next()).writeToParcel(out, i);
            }
        }
        this.answerStatus.writeToParcel(out, i);
        Iterator LIZJ2 = UC7.LIZJ(this.recommendUsers, out);
        while (LIZJ2.hasNext()) {
            ((BaseUserComponent) LIZJ2.next()).writeToParcel(out, i);
        }
        this.previewHintComponent.writeToParcel(out, i);
        this.baseRequestComponent.writeToParcel(out, i);
        this.baseResponseComponent.writeToParcel(out, i);
    }

    @Override // com.ss.android.ugc.aweme.im.message.template.card.BaseTemplate
    public final BaseTemplate LLLLZLLLI(PreviewHintComponent preview, BaseRequestComponent request, BaseResponseComponent response) {
        o.LJIIIZ(preview, "preview");
        o.LJIIIZ(request, "request");
        o.LJIIIZ(response, "response");
        Integer num = this.cardType;
        List<Integer> contentTypes = this.contentTypes;
        List<ActionLinkComponent> list = this.linkInfoItems;
        TextComponent textComponent = this.answerText;
        List<BotAnswerCardItemComponent> list2 = this.recommendItems;
        AnswerStatusComponent answerStatus = this.answerStatus;
        List<BaseUserComponent> recommendUsers = this.recommendUsers;
        o.LJIIIZ(contentTypes, "contentTypes");
        o.LJIIIZ(answerStatus, "answerStatus");
        o.LJIIIZ(recommendUsers, "recommendUsers");
        return new BotAnswerCardTemplate(num, contentTypes, list, textComponent, list2, answerStatus, recommendUsers, preview, request, response);
    }

    public BotAnswerCardTemplate(Integer num, List<Integer> contentTypes, List<ActionLinkComponent> list, TextComponent textComponent, List<BotAnswerCardItemComponent> list2, AnswerStatusComponent answerStatus, List<BaseUserComponent> recommendUsers, PreviewHintComponent previewHintComponent, BaseRequestComponent baseRequestComponent, BaseResponseComponent baseResponseComponent) {
        o.LJIIIZ(contentTypes, "contentTypes");
        o.LJIIIZ(answerStatus, "answerStatus");
        o.LJIIIZ(recommendUsers, "recommendUsers");
        o.LJIIIZ(previewHintComponent, "previewHintComponent");
        o.LJIIIZ(baseRequestComponent, "baseRequestComponent");
        o.LJIIIZ(baseResponseComponent, "baseResponseComponent");
        this.cardType = num;
        this.contentTypes = contentTypes;
        this.linkInfoItems = list;
        this.answerText = textComponent;
        this.recommendItems = list2;
        this.answerStatus = answerStatus;
        this.recommendUsers = recommendUsers;
        this.previewHintComponent = previewHintComponent;
        this.baseRequestComponent = baseRequestComponent;
        this.baseResponseComponent = baseResponseComponent;
        this.messageType = 1807;
    }
}
