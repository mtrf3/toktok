package com.bytedance.vast.model;

import X.InterfaceC65349Pkn;
import java.io.Serializable;

/* loaded from: classes11.dex */
public class AdVerification implements Serializable, Cloneable {

    @InterfaceC65349Pkn("javaScriptResource")
    public String javascriptResource;

    @InterfaceC65349Pkn("vendorKey")
    public String vender;

    @InterfaceC65349Pkn("verificationParameters")
    public String verificationParameters;

    public boolean valid() {
        String str = this.javascriptResource;
        if (str != null && !str.isEmpty()) {
            return true;
        }
        return false;
    }
}
