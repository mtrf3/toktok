package com.ss.android.ugc.aweme.compliance.business.banappeal.popup.model;

import X.C07670Rv;
import X.InterfaceC65349Pkn;
import X.JBR;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.TextWithInlineLink;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class AppealStatusResponse extends BaseResponse implements Serializable {
    public static final int $stable = 8;

    @InterfaceC65349Pkn("appeal_type")
    public final int appealType;

    @InterfaceC65349Pkn("appeal_url")
    public final String appealUrl;

    @InterfaceC65349Pkn("ban_time")
    public final long banTime;

    @InterfaceC65349Pkn("ban_type")
    public final int banType;

    @InterfaceC65349Pkn("button_list")
    public final List<PopButton> buttonList;

    @InterfaceC65349Pkn("popup_accessory")
    public final PopAccessory popAccessory;

    @InterfaceC65349Pkn("pop_content")
    public final String popContent;

    @InterfaceC65349Pkn("pop_content_with_url")
    public final TextWithInlineLink popContentWithUrl;

    @InterfaceC65349Pkn("pop_title")
    public final String popTitle;

    @InterfaceC65349Pkn("punish_log_id")
    public final String punishId;

    @InterfaceC65349Pkn("status")
    public final int status;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public AppealStatusResponse() {
        /*
            r15 = this;
            r1 = 0
            r3 = 0
            r6 = 0
            r13 = 2047(0x7ff, float:2.868E-42)
            r0 = r15
            r2 = r1
            r5 = r1
            r7 = r6
            r8 = r6
            r9 = r6
            r10 = r6
            r11 = r6
            r12 = r6
            r14 = r6
            r0.<init>(r1, r2, r3, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.compliance.business.banappeal.popup.model.AppealStatusResponse.<init>():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AppealStatusResponse copy$default(AppealStatusResponse appealStatusResponse, int i, int i2, long j, int i3, String str, String str2, TextWithInlineLink textWithInlineLink, String str3, List list, PopAccessory popAccessory, String str4, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = appealStatusResponse.status;
        }
        if ((i4 & 2) != 0) {
            i2 = appealStatusResponse.banType;
        }
        if ((i4 & 4) != 0) {
            j = appealStatusResponse.banTime;
        }
        if ((i4 & 8) != 0) {
            i3 = appealStatusResponse.appealType;
        }
        if ((i4 & 16) != 0) {
            str = appealStatusResponse.popTitle;
        }
        if ((i4 & 32) != 0) {
            str2 = appealStatusResponse.popContent;
        }
        if ((i4 & 64) != 0) {
            textWithInlineLink = appealStatusResponse.popContentWithUrl;
        }
        if ((i4 & 128) != 0) {
            str3 = appealStatusResponse.appealUrl;
        }
        if ((i4 & 256) != 0) {
            list = appealStatusResponse.buttonList;
        }
        if ((i4 & 512) != 0) {
            popAccessory = appealStatusResponse.popAccessory;
        }
        if ((i4 & 1024) != 0) {
            str4 = appealStatusResponse.punishId;
        }
        return appealStatusResponse.copy(i, i2, j, i3, str, str2, textWithInlineLink, str3, list, popAccessory, str4);
    }

    public final AppealStatusResponse copy(int i, int i2, long j, int i3, String str, String str2, TextWithInlineLink textWithInlineLink, String str3, List<PopButton> list, PopAccessory popAccessory, String punishId) {
        o.LJIIIZ(punishId, "punishId");
        return new AppealStatusResponse(i, i2, j, i3, str, str2, textWithInlineLink, str3, list, popAccessory, punishId);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppealStatusResponse)) {
            return false;
        }
        AppealStatusResponse appealStatusResponse = (AppealStatusResponse) obj;
        return this.status == appealStatusResponse.status && this.banType == appealStatusResponse.banType && this.banTime == appealStatusResponse.banTime && this.appealType == appealStatusResponse.appealType && o.LJ(this.popTitle, appealStatusResponse.popTitle) && o.LJ(this.popContent, appealStatusResponse.popContent) && o.LJ(this.popContentWithUrl, appealStatusResponse.popContentWithUrl) && o.LJ(this.appealUrl, appealStatusResponse.appealUrl) && o.LJ(this.buttonList, appealStatusResponse.buttonList) && o.LJ(this.popAccessory, appealStatusResponse.popAccessory) && o.LJ(this.punishId, appealStatusResponse.punishId);
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int LIZJ = (JBR.LIZJ(this.banTime, ((this.status * 31) + this.banType) * 31, 31) + this.appealType) * 31;
        String str = this.popTitle;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (LIZJ + hashCode) * 31;
        String str2 = this.popContent;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        TextWithInlineLink textWithInlineLink = this.popContentWithUrl;
        if (textWithInlineLink == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = textWithInlineLink.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        String str3 = this.appealUrl;
        if (str3 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str3.hashCode();
        }
        int i5 = (i4 + hashCode4) * 31;
        List<PopButton> list = this.buttonList;
        if (list == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = list.hashCode();
        }
        int i6 = (i5 + hashCode5) * 31;
        PopAccessory popAccessory = this.popAccessory;
        if (popAccessory != null) {
            i = popAccessory.hashCode();
        }
        return this.punishId.hashCode() + ((i6 + i) * 31);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        StringBuilder sb = new StringBuilder("AppealStatusResponse(status=");
        sb.append(this.status);
        sb.append(", banType=");
        sb.append(this.banType);
        sb.append(", banTime=");
        sb.append(this.banTime);
        sb.append(", appealType=");
        sb.append(this.appealType);
        sb.append(", popTitle=");
        sb.append(this.popTitle);
        sb.append(", popContent=");
        sb.append(this.popContent);
        sb.append(", popContentWithUrl=");
        sb.append(this.popContentWithUrl);
        sb.append(", appealUrl=");
        sb.append(this.appealUrl);
        sb.append(", buttonList=");
        sb.append(this.buttonList);
        sb.append(", popAccessory=");
        sb.append(this.popAccessory);
        sb.append(", punishId=");
        return C07670Rv.LIZIZ(sb, this.punishId, ')');
    }

    public final int getAppealType() {
        return this.appealType;
    }

    public final String getAppealUrl() {
        return this.appealUrl;
    }

    public final long getBanTime() {
        return this.banTime;
    }

    public final int getBanType() {
        return this.banType;
    }

    public final List<PopButton> getButtonList() {
        return this.buttonList;
    }

    public final PopAccessory getPopAccessory() {
        return this.popAccessory;
    }

    public final String getPopContent() {
        return this.popContent;
    }

    public final TextWithInlineLink getPopContentWithUrl() {
        return this.popContentWithUrl;
    }

    public final String getPopTitle() {
        return this.popTitle;
    }

    public final String getPunishId() {
        return this.punishId;
    }

    public final int getStatus() {
        return this.status;
    }

    public AppealStatusResponse(int i, int i2, long j, int i3, String str, String str2, TextWithInlineLink textWithInlineLink, String str3, List<PopButton> list, PopAccessory popAccessory, String punishId) {
        o.LJIIIZ(punishId, "punishId");
        this.status = i;
        this.banType = i2;
        this.banTime = j;
        this.appealType = i3;
        this.popTitle = str;
        this.popContent = str2;
        this.popContentWithUrl = textWithInlineLink;
        this.appealUrl = str3;
        this.buttonList = list;
        this.popAccessory = popAccessory;
        this.punishId = punishId;
    }

    public /* synthetic */ AppealStatusResponse(int i, int i2, long j, int i3, String str, String str2, TextWithInlineLink textWithInlineLink, String str3, List list, PopAccessory popAccessory, String str4, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? -1 : i, (i4 & 2) != 0 ? -1 : i2, (i4 & 4) != 0 ? 0L : j, (i4 & 8) == 0 ? i3 : -1, (i4 & 16) != 0 ? null : str, (i4 & 32) != 0 ? null : str2, (i4 & 64) != 0 ? null : textWithInlineLink, (i4 & 128) != 0 ? null : str3, (i4 & 256) != 0 ? null : list, (i4 & 512) == 0 ? popAccessory : null, (i4 & 1024) != 0 ? "" : str4);
    }
}
