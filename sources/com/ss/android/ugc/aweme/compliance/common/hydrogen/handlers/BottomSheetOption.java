package com.ss.android.ugc.aweme.compliance.common.hydrogen.handlers;

import X.EnumC253499xB;
import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class BottomSheetOption {

    @InterfaceC65349Pkn("option_content")
    public final String optionContent;

    @InterfaceC65349Pkn("option_id")
    public final String optionId;

    @InterfaceC65349Pkn("option_style")
    public final EnumC253499xB optionStyle;

    @InterfaceC65349Pkn("option_url")
    public final String optionUrl;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BottomSheetOption)) {
            return false;
        }
        BottomSheetOption bottomSheetOption = (BottomSheetOption) obj;
        return o.LJ(this.optionContent, bottomSheetOption.optionContent) && this.optionStyle == bottomSheetOption.optionStyle && o.LJ(this.optionId, bottomSheetOption.optionId) && o.LJ(this.optionUrl, bottomSheetOption.optionUrl);
    }

    public final int hashCode() {
        int hashCode = (this.optionStyle.hashCode() + (this.optionContent.hashCode() * 31)) * 31;
        String str = this.optionId;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.optionUrl;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("BottomSheetOption(optionContent=");
        LIZ.append(this.optionContent);
        LIZ.append(", optionStyle=");
        LIZ.append(this.optionStyle);
        LIZ.append(", optionId=");
        LIZ.append(this.optionId);
        LIZ.append(", optionUrl=");
        return q.LIZIZ(LIZ, this.optionUrl, ')', LIZ);
    }

    public BottomSheetOption(String optionContent, EnumC253499xB optionStyle, String str, String str2) {
        o.LJIIIZ(optionContent, "optionContent");
        o.LJIIIZ(optionStyle, "optionStyle");
        this.optionContent = optionContent;
        this.optionStyle = optionStyle;
        this.optionId = str;
        this.optionUrl = str2;
    }

    public /* synthetic */ BottomSheetOption(String str, EnumC253499xB enumC253499xB, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? EnumC253499xB.PRIMARY : enumC253499xB, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3);
    }
}
