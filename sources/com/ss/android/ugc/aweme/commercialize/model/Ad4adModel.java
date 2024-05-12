package com.ss.android.ugc.aweme.commercialize.model;

import X.C48339Iy7;
import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class Ad4adModel implements Serializable {
    public boolean LJLIL;

    @InterfaceC65349Pkn("is_promote_new")
    public final boolean isPromoteNew;

    @InterfaceC65349Pkn("not_interested_button_text")
    public final String notInterestedButtonText;

    @InterfaceC65349Pkn("promote_button_text")
    public final String promoteButtonText;

    @InterfaceC65349Pkn("promotion_label")
    public final String promotionLabel;

    @InterfaceC65349Pkn("not_interested_toast_text")
    public final String toast;

    @InterfaceC65349Pkn("web_url")
    public final String webUrl;

    @InterfaceC65349Pkn("why_this_ad")
    public final String whyThisAd;

    public static /* synthetic */ Ad4adModel copy$default(Ad4adModel ad4adModel, String str, String str2, String str3, String str4, String str5, String str6, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = ad4adModel.promotionLabel;
        }
        if ((i & 2) != 0) {
            str2 = ad4adModel.promoteButtonText;
        }
        if ((i & 4) != 0) {
            str3 = ad4adModel.notInterestedButtonText;
        }
        if ((i & 8) != 0) {
            str4 = ad4adModel.whyThisAd;
        }
        if ((i & 16) != 0) {
            str5 = ad4adModel.webUrl;
        }
        if ((i & 32) != 0) {
            str6 = ad4adModel.toast;
        }
        if ((i & 64) != 0) {
            z = ad4adModel.isPromoteNew;
        }
        if ((i & 128) != 0) {
            z2 = ad4adModel.LJLIL;
        }
        return ad4adModel.copy(str, str2, str3, str4, str5, str6, z, z2);
    }

    public final Ad4adModel copy(String str, String str2, String str3, String str4, String str5, String str6, boolean z, boolean z2) {
        return new Ad4adModel(str, str2, str3, str4, str5, str6, z, z2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Ad4adModel)) {
            return false;
        }
        Ad4adModel ad4adModel = (Ad4adModel) obj;
        return o.LJ(this.promotionLabel, ad4adModel.promotionLabel) && o.LJ(this.promoteButtonText, ad4adModel.promoteButtonText) && o.LJ(this.notInterestedButtonText, ad4adModel.notInterestedButtonText) && o.LJ(this.whyThisAd, ad4adModel.whyThisAd) && o.LJ(this.webUrl, ad4adModel.webUrl) && o.LJ(this.toast, ad4adModel.toast) && this.isPromoteNew == ad4adModel.isPromoteNew && this.LJLIL == ad4adModel.LJLIL;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        String str = this.promotionLabel;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.promoteButtonText;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.notInterestedButtonText;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.whyThisAd;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.webUrl;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.toast;
        int hashCode6 = (hashCode5 + (str6 != null ? str6.hashCode() : 0)) * 31;
        boolean z = this.isPromoteNew;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return ((hashCode6 + i) * 31) + (this.LJLIL ? 1 : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Ad4adModel(promotionLabel=");
        LIZ.append(this.promotionLabel);
        LIZ.append(", promoteButtonText=");
        LIZ.append(this.promoteButtonText);
        LIZ.append(", notInterestedButtonText=");
        LIZ.append(this.notInterestedButtonText);
        LIZ.append(", whyThisAd=");
        LIZ.append(this.whyThisAd);
        LIZ.append(", webUrl=");
        LIZ.append(this.webUrl);
        LIZ.append(", toast=");
        LIZ.append(this.toast);
        LIZ.append(", isPromoteNew=");
        LIZ.append(this.isPromoteNew);
        LIZ.append(", banButton=");
        return C48339Iy7.LIZJ(LIZ, this.LJLIL, ')', LIZ);
    }

    public final boolean getBanButton() {
        return this.LJLIL;
    }

    public final String getNotInterestedButtonText() {
        return this.notInterestedButtonText;
    }

    public final String getPromoteButtonText() {
        return this.promoteButtonText;
    }

    public final String getPromotionLabel() {
        return this.promotionLabel;
    }

    public final String getToast() {
        return this.toast;
    }

    public final String getWebUrl() {
        return this.webUrl;
    }

    public final String getWhyThisAd() {
        return this.whyThisAd;
    }

    public final boolean isPromoteNew() {
        return this.isPromoteNew;
    }

    public final int getPromoteUserType(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        if (!this.isPromoteNew) {
            return 1;
        }
        if (aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null && awemeRawAd.getAdvId() != null) {
            return 2;
        }
        return 3;
    }

    public final void setBanButton(boolean z) {
        this.LJLIL = z;
    }

    public Ad4adModel(String str, String str2, String str3, String str4, String str5, String str6, boolean z, boolean z2) {
        this.promotionLabel = str;
        this.promoteButtonText = str2;
        this.notInterestedButtonText = str3;
        this.whyThisAd = str4;
        this.webUrl = str5;
        this.toast = str6;
        this.isPromoteNew = z;
        this.LJLIL = z2;
    }

    public /* synthetic */ Ad4adModel(String str, String str2, String str3, String str4, String str5, String str6, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, str6, (i & 64) != 0 ? true : z, (i & 128) != 0 ? false : z2);
    }
}
