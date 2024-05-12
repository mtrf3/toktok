package com.ss.android.ugc.aweme.ecommerce.base.address.dto;

import X.InterfaceC65349Pkn;
import X.X1D;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class CandInputDataOptions {

    @InterfaceC65349Pkn("header")
    public final CandiHeader candHeader;

    @InterfaceC65349Pkn("options")
    public final List<CandInputData> candInputOptions;

    @InterfaceC65349Pkn("report")
    public final String report;

    @InterfaceC65349Pkn("session_key")
    public final String sessionKey;

    @InterfaceC65349Pkn("view_style")
    public final ViewStyle viewStyle;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CandInputDataOptions)) {
            return false;
        }
        CandInputDataOptions candInputDataOptions = (CandInputDataOptions) obj;
        return o.LJ(this.candInputOptions, candInputDataOptions.candInputOptions) && o.LJ(this.candHeader, candInputDataOptions.candHeader) && o.LJ(this.sessionKey, candInputDataOptions.sessionKey) && o.LJ(this.report, candInputDataOptions.report) && o.LJ(this.viewStyle, candInputDataOptions.viewStyle);
    }

    public final int hashCode() {
        List<CandInputData> list = this.candInputOptions;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        CandiHeader candiHeader = this.candHeader;
        int hashCode2 = (hashCode + (candiHeader == null ? 0 : candiHeader.hashCode())) * 31;
        String str = this.sessionKey;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.report;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        ViewStyle viewStyle = this.viewStyle;
        return hashCode4 + (viewStyle != null ? viewStyle.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CandInputDataOptions(candInputOptions=");
        LIZ.append(this.candInputOptions);
        LIZ.append(", candHeader=");
        LIZ.append(this.candHeader);
        LIZ.append(", sessionKey=");
        LIZ.append(this.sessionKey);
        LIZ.append(", report=");
        LIZ.append(this.report);
        LIZ.append(", viewStyle=");
        LIZ.append(this.viewStyle);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public CandInputDataOptions(List<CandInputData> list, CandiHeader candiHeader, String str, String str2, ViewStyle viewStyle) {
        this.candInputOptions = list;
        this.candHeader = candiHeader;
        this.sessionKey = str;
        this.report = str2;
        this.viewStyle = viewStyle;
    }
}
