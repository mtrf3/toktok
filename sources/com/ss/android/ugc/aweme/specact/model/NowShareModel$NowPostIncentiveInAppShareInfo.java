package com.ss.android.ugc.aweme.specact.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class NowShareModel$NowPostIncentiveInAppShareInfo {

    @InterfaceC65349Pkn("card_desc")
    public final NowShareModel$TextItem cardDesc;

    @InterfaceC65349Pkn("card_title")
    public final NowShareModel$TextItem cardTitle;

    @InterfaceC65349Pkn("image")
    public final String image;

    @InterfaceC65349Pkn("link")
    public final String link;

    @InterfaceC65349Pkn("link_type")
    public final Integer linkType;

    @InterfaceC65349Pkn("send_message_scene")
    public final Integer messageScene;

    @InterfaceC65349Pkn("quote_text")
    public final NowShareModel$TextItem quotoText;

    @InterfaceC65349Pkn("receiver_text")
    public final NowShareModel$TextItem receiverText;

    @InterfaceC65349Pkn("send_scene")
    public final String sendScene;

    @InterfaceC65349Pkn("sender_text")
    public final NowShareModel$TextItem senderText;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NowShareModel$NowPostIncentiveInAppShareInfo)) {
            return false;
        }
        NowShareModel$NowPostIncentiveInAppShareInfo nowShareModel$NowPostIncentiveInAppShareInfo = (NowShareModel$NowPostIncentiveInAppShareInfo) obj;
        return o.LJ(this.messageScene, nowShareModel$NowPostIncentiveInAppShareInfo.messageScene) && o.LJ(this.sendScene, nowShareModel$NowPostIncentiveInAppShareInfo.sendScene) && o.LJ(this.link, nowShareModel$NowPostIncentiveInAppShareInfo.link) && o.LJ(this.linkType, nowShareModel$NowPostIncentiveInAppShareInfo.linkType) && o.LJ(this.image, nowShareModel$NowPostIncentiveInAppShareInfo.image) && o.LJ(this.cardTitle, nowShareModel$NowPostIncentiveInAppShareInfo.cardTitle) && o.LJ(this.cardDesc, nowShareModel$NowPostIncentiveInAppShareInfo.cardDesc) && o.LJ(this.senderText, nowShareModel$NowPostIncentiveInAppShareInfo.senderText) && o.LJ(this.receiverText, nowShareModel$NowPostIncentiveInAppShareInfo.receiverText) && o.LJ(this.quotoText, nowShareModel$NowPostIncentiveInAppShareInfo.quotoText);
    }

    public final int hashCode() {
        Integer num = this.messageScene;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.sendScene;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.link;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num2 = this.linkType;
        int hashCode4 = (hashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str3 = this.image;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        NowShareModel$TextItem nowShareModel$TextItem = this.cardTitle;
        int hashCode6 = (hashCode5 + (nowShareModel$TextItem == null ? 0 : nowShareModel$TextItem.hashCode())) * 31;
        NowShareModel$TextItem nowShareModel$TextItem2 = this.cardDesc;
        int hashCode7 = (hashCode6 + (nowShareModel$TextItem2 == null ? 0 : nowShareModel$TextItem2.hashCode())) * 31;
        NowShareModel$TextItem nowShareModel$TextItem3 = this.senderText;
        int hashCode8 = (hashCode7 + (nowShareModel$TextItem3 == null ? 0 : nowShareModel$TextItem3.hashCode())) * 31;
        NowShareModel$TextItem nowShareModel$TextItem4 = this.receiverText;
        int hashCode9 = (hashCode8 + (nowShareModel$TextItem4 == null ? 0 : nowShareModel$TextItem4.hashCode())) * 31;
        NowShareModel$TextItem nowShareModel$TextItem5 = this.quotoText;
        return hashCode9 + (nowShareModel$TextItem5 != null ? nowShareModel$TextItem5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("NowPostIncentiveInAppShareInfo(messageScene=");
        LIZ.append(this.messageScene);
        LIZ.append(", sendScene=");
        LIZ.append(this.sendScene);
        LIZ.append(", link=");
        LIZ.append(this.link);
        LIZ.append(", linkType=");
        LIZ.append(this.linkType);
        LIZ.append(", image=");
        LIZ.append(this.image);
        LIZ.append(", cardTitle=");
        LIZ.append(this.cardTitle);
        LIZ.append(", cardDesc=");
        LIZ.append(this.cardDesc);
        LIZ.append(", senderText=");
        LIZ.append(this.senderText);
        LIZ.append(", receiverText=");
        LIZ.append(this.receiverText);
        LIZ.append(", quotoText=");
        LIZ.append(this.quotoText);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public NowShareModel$NowPostIncentiveInAppShareInfo(Integer num, String str, String str2, Integer num2, String str3, NowShareModel$TextItem nowShareModel$TextItem, NowShareModel$TextItem nowShareModel$TextItem2, NowShareModel$TextItem nowShareModel$TextItem3, NowShareModel$TextItem nowShareModel$TextItem4, NowShareModel$TextItem nowShareModel$TextItem5) {
        this.messageScene = num;
        this.sendScene = str;
        this.link = str2;
        this.linkType = num2;
        this.image = str3;
        this.cardTitle = nowShareModel$TextItem;
        this.cardDesc = nowShareModel$TextItem2;
        this.senderText = nowShareModel$TextItem3;
        this.receiverText = nowShareModel$TextItem4;
        this.quotoText = nowShareModel$TextItem5;
    }
}
