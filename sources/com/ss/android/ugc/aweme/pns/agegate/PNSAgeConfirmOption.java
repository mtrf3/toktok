package com.ss.android.ugc.aweme.pns.agegate;

import X.EnumC86061Xq5;
import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.b0;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class PNSAgeConfirmOption implements Serializable {

    @InterfaceC65349Pkn("option_content")
    public final String optionContent;

    @InterfaceC65349Pkn("option_type")
    public final int optionType;

    @InterfaceC65349Pkn("option_url")
    public final String optionUrl;

    /* JADX WARN: Multi-variable type inference failed */
    public PNSAgeConfirmOption() {
        this(null, 0 == true ? 1 : 0, 0, 7, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ PNSAgeConfirmOption copy$default(PNSAgeConfirmOption pNSAgeConfirmOption, String str, String str2, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = pNSAgeConfirmOption.optionContent;
        }
        if ((i2 & 2) != 0) {
            str2 = pNSAgeConfirmOption.optionUrl;
        }
        if ((i2 & 4) != 0) {
            i = pNSAgeConfirmOption.optionType;
        }
        return pNSAgeConfirmOption.copy(str, str2, i);
    }

    public final PNSAgeConfirmOption copy(String optionContent, String str, int i) {
        o.LJIIIZ(optionContent, "optionContent");
        return new PNSAgeConfirmOption(optionContent, str, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PNSAgeConfirmOption)) {
            return false;
        }
        PNSAgeConfirmOption pNSAgeConfirmOption = (PNSAgeConfirmOption) obj;
        return o.LJ(this.optionContent, pNSAgeConfirmOption.optionContent) && o.LJ(this.optionUrl, pNSAgeConfirmOption.optionUrl) && this.optionType == pNSAgeConfirmOption.optionType;
    }

    public int hashCode() {
        int hashCode = this.optionContent.hashCode() * 31;
        String str = this.optionUrl;
        return ((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.optionType;
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PNSAgeConfirmOption(optionContent=");
        LIZ.append(this.optionContent);
        LIZ.append(", optionUrl=");
        LIZ.append((Object) this.optionUrl);
        LIZ.append(", optionType=");
        return b0.LIZJ(LIZ, this.optionType, ')', LIZ);
    }

    public final String getOptionContent() {
        return this.optionContent;
    }

    public final int getOptionType() {
        return this.optionType;
    }

    public final String getOptionUrl() {
        return this.optionUrl;
    }

    public PNSAgeConfirmOption(String optionContent, String str, int i) {
        o.LJIIIZ(optionContent, "optionContent");
        this.optionContent = optionContent;
        this.optionUrl = str;
        this.optionType = i;
    }

    public /* synthetic */ PNSAgeConfirmOption(String str, String str2, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? null : str2, (i2 & 4) != 0 ? EnumC86061Xq5.DISMISS.getType() : i);
    }
}
