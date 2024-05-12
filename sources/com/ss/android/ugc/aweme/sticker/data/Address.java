package com.ss.android.ugc.aweme.sticker.data;

import X.InterfaceC65349Pkn;
import java.io.Serializable;

/* loaded from: classes7.dex */
public class Address implements Serializable {

    @InterfaceC65349Pkn("address")
    public String address;

    @InterfaceC65349Pkn("city")
    public String city;

    @InterfaceC65349Pkn("district")
    public String district;

    @InterfaceC65349Pkn("province")
    public String provice;

    @InterfaceC65349Pkn("simple_addr")
    public String simpleAddr;

    public String getAddress() {
        return this.address;
    }

    public String getCity() {
        return this.city;
    }

    public String getDistrict() {
        return this.district;
    }

    public String getProvice() {
        return this.provice;
    }

    public String getSimpleAddr() {
        return this.simpleAddr;
    }

    public void setAddress(String str) {
        this.address = str;
    }

    public void setCity(String str) {
        this.city = str;
    }

    public void setDistrict(String str) {
        this.district = str;
    }

    public void setProvice(String str) {
        this.provice = str;
    }

    public void setSimpleAddr(String str) {
        this.simpleAddr = str;
    }
}
