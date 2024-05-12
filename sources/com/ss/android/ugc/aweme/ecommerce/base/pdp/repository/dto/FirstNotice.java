package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C69628RUi;
import X.InterfaceC65349Pkn;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class FirstNotice implements Parcelable {
    public static final Parcelable.Creator<FirstNotice> CREATOR = new C69628RUi();

    @InterfaceC65349Pkn("btn_txt")
    public final String buttonText;

    @InterfaceC65349Pkn("description")
    public final String description;

    @InterfaceC65349Pkn("icon")
    public final Image icon;

    @InterfaceC65349Pkn("title")
    public final String title;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeParcelable(this.icon, i);
        out.writeString(this.title);
        out.writeString(this.description);
        out.writeString(this.buttonText);
    }

    public FirstNotice(Image image, String str, String str2, String str3) {
        this.icon = image;
        this.title = str;
        this.description = str2;
        this.buttonText = str3;
    }
}
