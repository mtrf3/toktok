package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C69629RUj;
import X.InterfaceC65349Pkn;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class ThirdParty implements Parcelable {
    public static final Parcelable.Creator<ThirdParty> CREATOR = new C69629RUj();

    @InterfaceC65349Pkn("pkg_name")
    public final String appPackageName;

    @InterfaceC65349Pkn("btn_text")
    public final String buttonText;

    @InterfaceC65349Pkn("first_notice")
    public final FirstNotice firstNoticeData;

    @InterfaceC65349Pkn("product_links_h5")
    public final String linkH5;

    @InterfaceC65349Pkn("product_links_native")
    public final String linkNative;

    @InterfaceC65349Pkn("source")
    public final String source;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.appPackageName);
        out.writeString(this.linkH5);
        out.writeString(this.linkNative);
        out.writeString(this.buttonText);
        out.writeString(this.source);
        FirstNotice firstNotice = this.firstNoticeData;
        if (firstNotice == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            firstNotice.writeToParcel(out, i);
        }
    }

    public ThirdParty(String str, String str2, String str3, String str4, String str5, FirstNotice firstNotice) {
        this.appPackageName = str;
        this.linkH5 = str2;
        this.linkNative = str3;
        this.buttonText = str4;
        this.source = str5;
        this.firstNoticeData = firstNotice;
    }
}
