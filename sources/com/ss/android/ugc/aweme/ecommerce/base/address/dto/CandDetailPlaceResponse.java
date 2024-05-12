package com.ss.android.ugc.aweme.ecommerce.base.address.dto;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class CandDetailPlaceResponse {

    @InterfaceC65349Pkn("option")
    public final CandInputData candDetailPlaceOption;

    @InterfaceC65349Pkn("region_autofill_hint_message")
    public final String regionAutofillHintMessage;

    @InterfaceC65349Pkn("report")
    public final String report;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CandDetailPlaceResponse)) {
            return false;
        }
        CandDetailPlaceResponse candDetailPlaceResponse = (CandDetailPlaceResponse) obj;
        return o.LJ(this.regionAutofillHintMessage, candDetailPlaceResponse.regionAutofillHintMessage) && o.LJ(this.candDetailPlaceOption, candDetailPlaceResponse.candDetailPlaceOption) && o.LJ(this.report, candDetailPlaceResponse.report);
    }

    public final int hashCode() {
        String str = this.regionAutofillHintMessage;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        CandInputData candInputData = this.candDetailPlaceOption;
        int hashCode2 = (hashCode + (candInputData == null ? 0 : candInputData.hashCode())) * 31;
        String str2 = this.report;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CandDetailPlaceResponse(regionAutofillHintMessage=");
        LIZ.append(this.regionAutofillHintMessage);
        LIZ.append(", candDetailPlaceOption=");
        LIZ.append(this.candDetailPlaceOption);
        LIZ.append(", report=");
        return q.LIZIZ(LIZ, this.report, ')', LIZ);
    }

    public CandDetailPlaceResponse(String str, CandInputData candInputData, String str2) {
        this.regionAutofillHintMessage = str;
        this.candDetailPlaceOption = candInputData;
        this.report = str2;
    }
}
