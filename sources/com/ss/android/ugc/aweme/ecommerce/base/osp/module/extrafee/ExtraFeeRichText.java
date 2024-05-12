package com.ss.android.ugc.aweme.ecommerce.base.osp.module.extrafee;

import X.C78920UyC;
import X.InterfaceC65349Pkn;
import X.X1D;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class ExtraFeeRichText {

    @InterfaceC65349Pkn("popup")
    public final ExtraFeeDialog dialog;

    @InterfaceC65349Pkn("is_third_party_link")
    public final Boolean isThirdPartyLink;

    @InterfaceC65349Pkn("link")
    public final String link;

    @InterfaceC65349Pkn("text")
    public final String text;

    @InterfaceC65349Pkn("type")
    public final Integer type;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExtraFeeRichText)) {
            return false;
        }
        ExtraFeeRichText extraFeeRichText = (ExtraFeeRichText) obj;
        return o.LJ(this.type, extraFeeRichText.type) && o.LJ(this.text, extraFeeRichText.text) && o.LJ(this.dialog, extraFeeRichText.dialog) && o.LJ(this.link, extraFeeRichText.link) && o.LJ(this.isThirdPartyLink, extraFeeRichText.isThirdPartyLink);
    }

    public final int hashCode() {
        Integer num = this.type;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.text;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        ExtraFeeDialog extraFeeDialog = this.dialog;
        int hashCode3 = (hashCode2 + (extraFeeDialog == null ? 0 : extraFeeDialog.hashCode())) * 31;
        String str2 = this.link;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.isThirdPartyLink;
        return hashCode4 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ExtraFeeRichText(type=");
        LIZ.append(this.type);
        LIZ.append(", text=");
        LIZ.append(this.text);
        LIZ.append(", dialog=");
        LIZ.append(this.dialog);
        LIZ.append(", link=");
        LIZ.append(this.link);
        LIZ.append(", isThirdPartyLink=");
        return C78920UyC.LIZIZ(LIZ, this.isThirdPartyLink, ')', LIZ);
    }

    public ExtraFeeRichText(Integer num, String str, ExtraFeeDialog extraFeeDialog, String str2, Boolean bool) {
        this.type = num;
        this.text = str;
        this.dialog = extraFeeDialog;
        this.link = str2;
        this.isThirdPartyLink = bool;
    }
}
