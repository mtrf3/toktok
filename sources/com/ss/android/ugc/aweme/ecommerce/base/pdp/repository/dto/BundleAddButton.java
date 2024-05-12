package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class BundleAddButton {

    @InterfaceC65349Pkn("action")
    public final Integer action;

    @InterfaceC65349Pkn("button_text")
    public final String buttonText;

    @InterfaceC65349Pkn("secondary_page_schema")
    public final String schema;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BundleAddButton)) {
            return false;
        }
        BundleAddButton bundleAddButton = (BundleAddButton) obj;
        return o.LJ(this.buttonText, bundleAddButton.buttonText) && o.LJ(this.action, bundleAddButton.action) && o.LJ(this.schema, bundleAddButton.schema);
    }

    public final int hashCode() {
        String str = this.buttonText;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.action;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.schema;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("BundleAddButton(buttonText=");
        LIZ.append(this.buttonText);
        LIZ.append(", action=");
        LIZ.append(this.action);
        LIZ.append(", schema=");
        return q.LIZIZ(LIZ, this.schema, ')', LIZ);
    }

    public BundleAddButton(String str, Integer num, String str2) {
        this.buttonText = str;
        this.action = num;
        this.schema = str2;
    }
}
