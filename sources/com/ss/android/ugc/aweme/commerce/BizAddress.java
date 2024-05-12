package com.ss.android.ugc.aweme.commerce;

import X.InterfaceC65349Pkn;
import java.io.Serializable;

/* loaded from: classes5.dex */
public final class BizAddress implements Serializable {

    @InterfaceC65349Pkn("formatted_address_text")
    public String formattedAddressText;

    @InterfaceC65349Pkn("latitude")
    public String latitude;

    @InterfaceC65349Pkn("longitude")
    public String longitude;

    @InterfaceC65349Pkn("simplified_address_text")
    public String simplifiedAddressText;

    public final String getFormattedAddressText() {
        return this.formattedAddressText;
    }

    public final String getLatitude() {
        return this.latitude;
    }

    public final String getLongitude() {
        return this.longitude;
    }

    public final String getSimplifiedAddressText() {
        return this.simplifiedAddressText;
    }

    public final void setFormattedAddressText(String str) {
        this.formattedAddressText = str;
    }

    public final void setLatitude(String str) {
        this.latitude = str;
    }

    public final void setLongitude(String str) {
        this.longitude = str;
    }

    public final void setSimplifiedAddressText(String str) {
        this.simplifiedAddressText = str;
    }
}