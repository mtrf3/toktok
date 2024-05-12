package com.ss.android.ugc.aweme.specact.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class NowShareModel$NowPostIncentiveSharePanelData {

    @InterfaceC65349Pkn("description")
    public final String description;

    @InterfaceC65349Pkn("inapp_share_info")
    public final NowShareModel$NowPostIncentiveInAppShareInfo inAppShareInfo;

    @InterfaceC65349Pkn("share_link")
    public final String shareLink;

    @InterfaceC65349Pkn("title")
    public final String title;

    @InterfaceC65349Pkn("top_image")
    public final String topImage;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NowShareModel$NowPostIncentiveSharePanelData)) {
            return false;
        }
        NowShareModel$NowPostIncentiveSharePanelData nowShareModel$NowPostIncentiveSharePanelData = (NowShareModel$NowPostIncentiveSharePanelData) obj;
        return o.LJ(this.inAppShareInfo, nowShareModel$NowPostIncentiveSharePanelData.inAppShareInfo) && o.LJ(this.shareLink, nowShareModel$NowPostIncentiveSharePanelData.shareLink) && o.LJ(this.topImage, nowShareModel$NowPostIncentiveSharePanelData.topImage) && o.LJ(this.title, nowShareModel$NowPostIncentiveSharePanelData.title) && o.LJ(this.description, nowShareModel$NowPostIncentiveSharePanelData.description);
    }

    public final int hashCode() {
        NowShareModel$NowPostIncentiveInAppShareInfo nowShareModel$NowPostIncentiveInAppShareInfo = this.inAppShareInfo;
        int hashCode = (nowShareModel$NowPostIncentiveInAppShareInfo == null ? 0 : nowShareModel$NowPostIncentiveInAppShareInfo.hashCode()) * 31;
        String str = this.shareLink;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.topImage;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.title;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.description;
        return hashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("NowPostIncentiveSharePanelData(inAppShareInfo=");
        LIZ.append(this.inAppShareInfo);
        LIZ.append(", shareLink=");
        LIZ.append(this.shareLink);
        LIZ.append(", topImage=");
        LIZ.append(this.topImage);
        LIZ.append(", title=");
        LIZ.append(this.title);
        LIZ.append(", description=");
        return q.LIZIZ(LIZ, this.description, ')', LIZ);
    }

    public NowShareModel$NowPostIncentiveSharePanelData(NowShareModel$NowPostIncentiveInAppShareInfo nowShareModel$NowPostIncentiveInAppShareInfo, String str, String str2, String str3, String str4) {
        this.inAppShareInfo = nowShareModel$NowPostIncentiveInAppShareInfo;
        this.shareLink = str;
        this.topImage = str2;
        this.title = str3;
        this.description = str4;
    }
}
