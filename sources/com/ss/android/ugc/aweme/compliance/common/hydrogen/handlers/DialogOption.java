package com.ss.android.ugc.aweme.compliance.common.hydrogen.handlers;

import X.EnumC253529xE;
import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class DialogOption {

    @InterfaceC65349Pkn("option_content")
    public final String optionContent;

    @InterfaceC65349Pkn("option_id")
    public final String optionId;

    @InterfaceC65349Pkn("option_style")
    public final EnumC253529xE optionStyle;

    @InterfaceC65349Pkn("option_url")
    public final String optionUrl;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DialogOption)) {
            return false;
        }
        DialogOption dialogOption = (DialogOption) obj;
        return o.LJ(this.optionContent, dialogOption.optionContent) && this.optionStyle == dialogOption.optionStyle && o.LJ(this.optionId, dialogOption.optionId) && o.LJ(this.optionUrl, dialogOption.optionUrl);
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
        LIZ.append("DialogOption(optionContent=");
        LIZ.append(this.optionContent);
        LIZ.append(", optionStyle=");
        LIZ.append(this.optionStyle);
        LIZ.append(", optionId=");
        LIZ.append(this.optionId);
        LIZ.append(", optionUrl=");
        return q.LIZIZ(LIZ, this.optionUrl, ')', LIZ);
    }

    public DialogOption(String optionContent, EnumC253529xE optionStyle, String str, String str2) {
        o.LJIIIZ(optionContent, "optionContent");
        o.LJIIIZ(optionStyle, "optionStyle");
        this.optionContent = optionContent;
        this.optionStyle = optionStyle;
        this.optionId = str;
        this.optionUrl = str2;
    }

    public /* synthetic */ DialogOption(String str, EnumC253529xE enumC253529xE, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? EnumC253529xE.PRIMARY : enumC253529xE, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3);
    }
}
