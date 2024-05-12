package com.ss.android.ugc.aweme.im.sdk.chat.data.model;

import X.C08880Wm;
import X.C117824jq;
import X.C2UW;
import X.C32H;
import X.C46R;
import X.C64537PUn;
import X.C79062V1e;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class MessageState {
    public final List<C117824jq> attachments;
    public final String cardClickableState;
    public final int chatRedesignState;
    public final String coverInfo;
    public final boolean forceMask;
    public final boolean hasStickerInline;
    public final boolean isLastReceivedMsg;
    public final boolean isMsgSelected;
    public final boolean isNonFakeTopMessage;
    public final boolean isRefreshing;
    public final boolean isShowUnreadTip;
    public final boolean isViolation;
    public final String jsonContent;
    public final int msgStatus;
    public final boolean msgStatusIsLast;
    public final C46R nudeFilterDiff;
    public final C64537PUn pbContent;
    public final Map<String, List<C32H>> propertyItemListMap;
    public final String quoteReferenceHint;
    public final Integer quoteReferenceStatus;
    public final String quotedPreview;
    public final C2UW suggestedReplyState;
    public final String timestamp;

    public static /* synthetic */ MessageState copy$default(MessageState messageState, Map map, String str, C64537PUn c64537PUn, Integer num, String str2, int i, boolean z, boolean z2, boolean z3, boolean z4, int i2, String str3, boolean z5, String str4, List list, boolean z6, String str5, boolean z7, String str6, boolean z8, C2UW c2uw, C46R c46r, boolean z9, int i3, Object obj) {
        Integer num2 = num;
        C64537PUn c64537PUn2 = c64537PUn;
        Map map2 = map;
        String str7 = str;
        String str8 = str4;
        boolean z10 = z5;
        String str9 = str3;
        int i4 = i2;
        int i5 = i;
        String str10 = str2;
        boolean z11 = z;
        boolean z12 = z2;
        boolean z13 = z3;
        boolean z14 = z4;
        boolean z15 = z9;
        C2UW c2uw2 = c2uw;
        boolean z16 = z6;
        C46R c46r2 = c46r;
        List list2 = list;
        String str11 = str5;
        boolean z17 = z7;
        String str12 = str6;
        boolean z18 = z8;
        if ((i3 & 1) != 0) {
            map2 = messageState.propertyItemListMap;
        }
        if ((i3 & 2) != 0) {
            str7 = messageState.jsonContent;
        }
        if ((i3 & 4) != 0) {
            c64537PUn2 = messageState.pbContent;
        }
        if ((i3 & 8) != 0) {
            num2 = messageState.quoteReferenceStatus;
        }
        if ((i3 & 16) != 0) {
            str10 = messageState.quoteReferenceHint;
        }
        if ((i3 & 32) != 0) {
            i5 = messageState.msgStatus;
        }
        if ((i3 & 64) != 0) {
            z11 = messageState.msgStatusIsLast;
        }
        if ((i3 & 128) != 0) {
            z12 = messageState.isMsgSelected;
        }
        if ((i3 & 256) != 0) {
            z13 = messageState.isLastReceivedMsg;
        }
        if ((i3 & 512) != 0) {
            z14 = messageState.isNonFakeTopMessage;
        }
        if ((i3 & 1024) != 0) {
            i4 = messageState.chatRedesignState;
        }
        if ((i3 & 2048) != 0) {
            str9 = messageState.cardClickableState;
        }
        if ((i3 & 4096) != 0) {
            z10 = messageState.isRefreshing;
        }
        if ((i3 & FileUtils.BUFFER_SIZE) != 0) {
            str8 = messageState.coverInfo;
        }
        if ((i3 & 16384) != 0) {
            list2 = messageState.attachments;
        }
        if ((32768 & i3) != 0) {
            z16 = messageState.forceMask;
        }
        if ((65536 & i3) != 0) {
            str11 = messageState.timestamp;
        }
        if ((131072 & i3) != 0) {
            z17 = messageState.isShowUnreadTip;
        }
        if ((262144 & i3) != 0) {
            str12 = messageState.quotedPreview;
        }
        if ((524288 & i3) != 0) {
            z18 = messageState.isViolation;
        }
        if ((1048576 & i3) != 0) {
            c2uw2 = messageState.suggestedReplyState;
        }
        if ((2097152 & i3) != 0) {
            c46r2 = messageState.nudeFilterDiff;
        }
        if ((i3 & 4194304) != 0) {
            z15 = messageState.hasStickerInline;
        }
        int i6 = i4;
        String str13 = str9;
        boolean z19 = z10;
        return messageState.copy(map2, str7, c64537PUn2, num2, str10, i5, z11, z12, z13, z14, i6, str13, z19, str8, list2, z16, str11, z17, str12, z18, c2uw2, c46r2, z15);
    }

    public final MessageState copy(Map<String, ? extends List<? extends C32H>> map, String str, C64537PUn c64537PUn, Integer num, String str2, int i, boolean z, boolean z2, boolean z3, boolean z4, int i2, String str3, boolean z5, String coverInfo, List<? extends C117824jq> list, boolean z6, String str4, boolean z7, String str5, boolean z8, C2UW suggestedReplyState, C46R nudeFilterDiff, boolean z9) {
        o.LJIIIZ(coverInfo, "coverInfo");
        o.LJIIIZ(suggestedReplyState, "suggestedReplyState");
        o.LJIIIZ(nudeFilterDiff, "nudeFilterDiff");
        return new MessageState(map, str, c64537PUn, num, str2, i, z, z2, z3, z4, i2, str3, z5, coverInfo, list, z6, str4, z7, str5, z8, suggestedReplyState, nudeFilterDiff, z9);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessageState)) {
            return false;
        }
        MessageState messageState = (MessageState) obj;
        return o.LJ(this.propertyItemListMap, messageState.propertyItemListMap) && o.LJ(this.jsonContent, messageState.jsonContent) && o.LJ(this.pbContent, messageState.pbContent) && o.LJ(this.quoteReferenceStatus, messageState.quoteReferenceStatus) && o.LJ(this.quoteReferenceHint, messageState.quoteReferenceHint) && this.msgStatus == messageState.msgStatus && this.msgStatusIsLast == messageState.msgStatusIsLast && this.isMsgSelected == messageState.isMsgSelected && this.isLastReceivedMsg == messageState.isLastReceivedMsg && this.isNonFakeTopMessage == messageState.isNonFakeTopMessage && this.chatRedesignState == messageState.chatRedesignState && o.LJ(this.cardClickableState, messageState.cardClickableState) && this.isRefreshing == messageState.isRefreshing && o.LJ(this.coverInfo, messageState.coverInfo) && o.LJ(this.attachments, messageState.attachments) && this.forceMask == messageState.forceMask && o.LJ(this.timestamp, messageState.timestamp) && this.isShowUnreadTip == messageState.isShowUnreadTip && o.LJ(this.quotedPreview, messageState.quotedPreview) && this.isViolation == messageState.isViolation && o.LJ(this.suggestedReplyState, messageState.suggestedReplyState) && o.LJ(this.nudeFilterDiff, messageState.nudeFilterDiff) && this.hasStickerInline == messageState.hasStickerInline;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        int hashCode8;
        Map<String, List<C32H>> map = this.propertyItemListMap;
        int i = 0;
        if (map == null) {
            hashCode = 0;
        } else {
            hashCode = map.hashCode();
        }
        int i2 = hashCode * 31;
        String str = this.jsonContent;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        C64537PUn c64537PUn = this.pbContent;
        if (c64537PUn == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = c64537PUn.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        Integer num = this.quoteReferenceStatus;
        if (num == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = num.hashCode();
        }
        int i5 = (i4 + hashCode4) * 31;
        String str2 = this.quoteReferenceHint;
        if (str2 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str2.hashCode();
        }
        int i6 = (((i5 + hashCode5) * 31) + this.msgStatus) * 31;
        boolean z = this.msgStatusIsLast;
        int i7 = 1;
        int i8 = z;
        if (z != 0) {
            i8 = 1;
        }
        int i9 = (i6 + i8) * 31;
        boolean z2 = this.isMsgSelected;
        int i10 = z2;
        if (z2 != 0) {
            i10 = 1;
        }
        int i11 = (i9 + i10) * 31;
        boolean z3 = this.isLastReceivedMsg;
        int i12 = z3;
        if (z3 != 0) {
            i12 = 1;
        }
        int i13 = (i11 + i12) * 31;
        boolean z4 = this.isNonFakeTopMessage;
        int i14 = z4;
        if (z4 != 0) {
            i14 = 1;
        }
        int i15 = (((i13 + i14) * 31) + this.chatRedesignState) * 31;
        String str3 = this.cardClickableState;
        if (str3 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = str3.hashCode();
        }
        int i16 = (i15 + hashCode6) * 31;
        boolean z5 = this.isRefreshing;
        int i17 = z5;
        if (z5 != 0) {
            i17 = 1;
        }
        int LJ = C79062V1e.LJ(this.coverInfo, (i16 + i17) * 31, 31);
        List<C117824jq> list = this.attachments;
        if (list == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = list.hashCode();
        }
        int i18 = (LJ + hashCode7) * 31;
        boolean z6 = this.forceMask;
        int i19 = z6;
        if (z6 != 0) {
            i19 = 1;
        }
        int i20 = (i18 + i19) * 31;
        String str4 = this.timestamp;
        if (str4 == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = str4.hashCode();
        }
        int i21 = (i20 + hashCode8) * 31;
        boolean z7 = this.isShowUnreadTip;
        int i22 = z7;
        if (z7 != 0) {
            i22 = 1;
        }
        int i23 = (i21 + i22) * 31;
        String str5 = this.quotedPreview;
        if (str5 != null) {
            i = str5.hashCode();
        }
        int i24 = (i23 + i) * 31;
        boolean z8 = this.isViolation;
        int i25 = z8;
        if (z8 != 0) {
            i25 = 1;
        }
        int hashCode9 = (hashCode() + ((this.suggestedReplyState.hashCode() + ((i24 + i25) * 31)) * 31)) * 31;
        if (!this.hasStickerInline) {
            i7 = 0;
        }
        return hashCode9 + i7;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("MessageState(propertyItemListMap=");
        sb.append(this.propertyItemListMap);
        sb.append(", jsonContent=");
        sb.append(this.jsonContent);
        sb.append(", pbContent=");
        sb.append(this.pbContent);
        sb.append(", quoteReferenceStatus=");
        sb.append(this.quoteReferenceStatus);
        sb.append(", quoteReferenceHint=");
        sb.append(this.quoteReferenceHint);
        sb.append(", msgStatus=");
        sb.append(this.msgStatus);
        sb.append(", msgStatusIsLast=");
        sb.append(this.msgStatusIsLast);
        sb.append(", isMsgSelected=");
        sb.append(this.isMsgSelected);
        sb.append(", isLastReceivedMsg=");
        sb.append(this.isLastReceivedMsg);
        sb.append(", isNonFakeTopMessage=");
        sb.append(this.isNonFakeTopMessage);
        sb.append(", chatRedesignState=");
        sb.append(this.chatRedesignState);
        sb.append(", cardClickableState=");
        sb.append(this.cardClickableState);
        sb.append(", isRefreshing=");
        sb.append(this.isRefreshing);
        sb.append(", coverInfo=");
        sb.append(this.coverInfo);
        sb.append(", attachments=");
        sb.append(this.attachments);
        sb.append(", forceMask=");
        sb.append(this.forceMask);
        sb.append(", timestamp=");
        sb.append(this.timestamp);
        sb.append(", isShowUnreadTip=");
        sb.append(this.isShowUnreadTip);
        sb.append(", quotedPreview=");
        sb.append(this.quotedPreview);
        sb.append(", isViolation=");
        sb.append(this.isViolation);
        sb.append(", suggestedReplyState=");
        sb.append(this.suggestedReplyState);
        sb.append(", nudeFilterDiff=");
        sb.append(this.nudeFilterDiff);
        sb.append(", hasStickerInline=");
        return C08880Wm.LIZJ(sb, this.hasStickerInline, ')');
    }

    public final List<C117824jq> getAttachments() {
        return this.attachments;
    }

    public final String getCardClickableState() {
        return this.cardClickableState;
    }

    public final int getChatRedesignState() {
        return this.chatRedesignState;
    }

    public final String getCoverInfo() {
        return this.coverInfo;
    }

    public final boolean getForceMask() {
        return this.forceMask;
    }

    public final boolean getHasStickerInline() {
        return this.hasStickerInline;
    }

    public final String getJsonContent() {
        return this.jsonContent;
    }

    public final int getMsgStatus() {
        return this.msgStatus;
    }

    public final boolean getMsgStatusIsLast() {
        return this.msgStatusIsLast;
    }

    public final C46R getNudeFilterDiff() {
        return this.nudeFilterDiff;
    }

    public final C64537PUn getPbContent() {
        return this.pbContent;
    }

    public final Map<String, List<C32H>> getPropertyItemListMap() {
        return this.propertyItemListMap;
    }

    public final String getQuoteReferenceHint() {
        return this.quoteReferenceHint;
    }

    public final Integer getQuoteReferenceStatus() {
        return this.quoteReferenceStatus;
    }

    public final String getQuotedPreview() {
        return this.quotedPreview;
    }

    public final C2UW getSuggestedReplyState() {
        return this.suggestedReplyState;
    }

    public final String getTimestamp() {
        return this.timestamp;
    }

    public final boolean isLastReceivedMsg() {
        return this.isLastReceivedMsg;
    }

    public final boolean isMsgSelected() {
        return this.isMsgSelected;
    }

    public final boolean isNonFakeTopMessage() {
        return this.isNonFakeTopMessage;
    }

    public final boolean isRefreshing() {
        return this.isRefreshing;
    }

    public final boolean isShowUnreadTip() {
        return this.isShowUnreadTip;
    }

    public final boolean isViolation() {
        return this.isViolation;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MessageState(Map<String, ? extends List<? extends C32H>> map, String str, C64537PUn c64537PUn, Integer num, String str2, int i, boolean z, boolean z2, boolean z3, boolean z4, int i2, String str3, boolean z5, String coverInfo, List<? extends C117824jq> list, boolean z6, String str4, boolean z7, String str5, boolean z8, C2UW suggestedReplyState, C46R nudeFilterDiff, boolean z9) {
        o.LJIIIZ(coverInfo, "coverInfo");
        o.LJIIIZ(suggestedReplyState, "suggestedReplyState");
        o.LJIIIZ(nudeFilterDiff, "nudeFilterDiff");
        this.propertyItemListMap = map;
        this.jsonContent = str;
        this.pbContent = c64537PUn;
        this.quoteReferenceStatus = num;
        this.quoteReferenceHint = str2;
        this.msgStatus = i;
        this.msgStatusIsLast = z;
        this.isMsgSelected = z2;
        this.isLastReceivedMsg = z3;
        this.isNonFakeTopMessage = z4;
        this.chatRedesignState = i2;
        this.cardClickableState = str3;
        this.isRefreshing = z5;
        this.coverInfo = coverInfo;
        this.attachments = list;
        this.forceMask = z6;
        this.timestamp = str4;
        this.isShowUnreadTip = z7;
        this.quotedPreview = str5;
        this.isViolation = z8;
        this.suggestedReplyState = suggestedReplyState;
        this.nudeFilterDiff = nudeFilterDiff;
        this.hasStickerInline = z9;
    }
}
