package com.ss.android.ugc.aweme.ecommerce.fashionmall.tools.vo;

import X.C43588H8u;
import X.C48339Iy7;
import X.C62562cu;
import X.C79062V1e;
import X.X1D;
import com.ss.android.ugc.aweme.ecommerce.mall.common.customdot.Notice;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class ToolEntryVO {
    public final String buttonName;
    public final int cardType;
    public final C62562cu imageUrls;
    public boolean isItemVisible;
    public String link;
    public final String linkTitleText;
    public Notice msgPopupData;
    public boolean notify;
    public final String title;

    public static /* synthetic */ ToolEntryVO copy$default(ToolEntryVO toolEntryVO, int i, String str, String str2, String str3, C62562cu c62562cu, String str4, boolean z, Notice notice, boolean z2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = toolEntryVO.cardType;
        }
        if ((i2 & 2) != 0) {
            str = toolEntryVO.title;
        }
        if ((i2 & 4) != 0) {
            str2 = toolEntryVO.link;
        }
        if ((i2 & 8) != 0) {
            str3 = toolEntryVO.linkTitleText;
        }
        if ((i2 & 16) != 0) {
            c62562cu = toolEntryVO.imageUrls;
        }
        if ((i2 & 32) != 0) {
            str4 = toolEntryVO.buttonName;
        }
        if ((i2 & 64) != 0) {
            z = toolEntryVO.notify;
        }
        if ((i2 & 128) != 0) {
            notice = toolEntryVO.msgPopupData;
        }
        if ((i2 & 256) != 0) {
            z2 = toolEntryVO.isItemVisible;
        }
        return toolEntryVO.copy(i, str, str2, str3, c62562cu, str4, z, notice, z2);
    }

    public final ToolEntryVO copy(int i, String title, String link, String linkTitleText, C62562cu c62562cu, String buttonName, boolean z, Notice notice, boolean z2) {
        o.LJIIIZ(title, "title");
        o.LJIIIZ(link, "link");
        o.LJIIIZ(linkTitleText, "linkTitleText");
        o.LJIIIZ(buttonName, "buttonName");
        return new ToolEntryVO(i, title, link, linkTitleText, c62562cu, buttonName, z, notice, z2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ToolEntryVO)) {
            return false;
        }
        ToolEntryVO toolEntryVO = (ToolEntryVO) obj;
        return this.cardType == toolEntryVO.cardType && o.LJ(this.title, toolEntryVO.title) && o.LJ(this.link, toolEntryVO.link) && o.LJ(this.linkTitleText, toolEntryVO.linkTitleText) && o.LJ(this.imageUrls, toolEntryVO.imageUrls) && o.LJ(this.buttonName, toolEntryVO.buttonName) && this.notify == toolEntryVO.notify && o.LJ(this.msgPopupData, toolEntryVO.msgPopupData) && this.isItemVisible == toolEntryVO.isItemVisible;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode;
        int LJ = C79062V1e.LJ(this.linkTitleText, C79062V1e.LJ(this.link, C79062V1e.LJ(this.title, this.cardType * 31, 31), 31), 31);
        C62562cu c62562cu = this.imageUrls;
        int i = 0;
        if (c62562cu == null) {
            hashCode = 0;
        } else {
            hashCode = c62562cu.hashCode();
        }
        int LJ2 = C79062V1e.LJ(this.buttonName, (LJ + hashCode) * 31, 31);
        boolean z = this.notify;
        int i2 = 1;
        int i3 = z;
        if (z != 0) {
            i3 = 1;
        }
        int i4 = (LJ2 + i3) * 31;
        Notice notice = this.msgPopupData;
        if (notice != null) {
            i = notice.hashCode();
        }
        int i5 = (i4 + i) * 31;
        if (!this.isItemVisible) {
            i2 = 0;
        }
        return i5 + i2;
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ToolEntryVO(cardType=");
        LIZ.append(this.cardType);
        LIZ.append(", title=");
        LIZ.append(this.title);
        LIZ.append(", link=");
        LIZ.append(this.link);
        LIZ.append(", linkTitleText=");
        LIZ.append(this.linkTitleText);
        LIZ.append(", imageUrls=");
        LIZ.append(this.imageUrls);
        LIZ.append(", buttonName=");
        LIZ.append(this.buttonName);
        LIZ.append(", notify=");
        LIZ.append(this.notify);
        LIZ.append(", msgPopupData=");
        LIZ.append(this.msgPopupData);
        LIZ.append(", isItemVisible=");
        return C48339Iy7.LIZJ(LIZ, this.isItemVisible, ')', LIZ);
    }

    public final String getButtonName() {
        return this.buttonName;
    }

    public final int getCardType() {
        return this.cardType;
    }

    public final C62562cu getImageUrls() {
        return this.imageUrls;
    }

    public final String getLink() {
        return this.link;
    }

    public final String getLinkTitleText() {
        return this.linkTitleText;
    }

    public final Notice getMsgPopupData() {
        return this.msgPopupData;
    }

    public final boolean getNotify() {
        return this.notify;
    }

    public final String getTitle() {
        return this.title;
    }

    public final boolean isItemVisible() {
        return this.isItemVisible;
    }

    public final void setItemVisible(boolean z) {
        this.isItemVisible = z;
    }

    public final void setLink(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.link = str;
    }

    public final void setMsgPopupData(Notice notice) {
        this.msgPopupData = notice;
    }

    public final void setNotify(boolean z) {
        this.notify = z;
    }

    public ToolEntryVO(int i, String str, String str2, String str3, C62562cu c62562cu, String str4, boolean z, Notice notice, boolean z2) {
        C43588H8u.LIZLLL(str, "title", str2, "link", str3, "linkTitleText", str4, "buttonName");
        this.cardType = i;
        this.title = str;
        this.link = str2;
        this.linkTitleText = str3;
        this.imageUrls = c62562cu;
        this.buttonName = str4;
        this.notify = z;
        this.msgPopupData = notice;
        this.isItemVisible = z2;
    }

    public /* synthetic */ ToolEntryVO(int i, String str, String str2, String str3, C62562cu c62562cu, String str4, boolean z, Notice notice, boolean z2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? "" : str2, (i2 & 8) != 0 ? "" : str3, (i2 & 16) != 0 ? null : c62562cu, (i2 & 32) == 0 ? str4 : "", (i2 & 64) != 0 ? false : z, (i2 & 128) == 0 ? notice : null, (i2 & 256) != 0 ? true : z2);
    }
}
