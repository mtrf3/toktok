package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C69661RVp;
import X.InterfaceC65349Pkn;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Icon;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class ReturnPolicy implements Parcelable {
    public static final Parcelable.Creator<ReturnPolicy> CREATOR = new C69661RVp();

    @InterfaceC65349Pkn("description")
    public final String description;

    @InterfaceC65349Pkn("logo")
    public final Icon icon;

    @InterfaceC65349Pkn("name")
    public final String name;

    @InterfaceC65349Pkn("small_logo")
    public final Icon smallIcon;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.name);
        out.writeString(this.description);
        Icon icon = this.icon;
        if (icon == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            icon.writeToParcel(out, i);
        }
        Icon icon2 = this.smallIcon;
        if (icon2 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            icon2.writeToParcel(out, i);
        }
    }

    public ReturnPolicy(String str, String str2, Icon icon, Icon icon2) {
        this.name = str;
        this.description = str2;
        this.icon = icon;
        this.smallIcon = icon2;
    }
}
