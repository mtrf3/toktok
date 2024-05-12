package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C26833Ag1;
import X.C279017q;
import X.InterfaceC65349Pkn;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Icon;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class ShopPolicy implements Parcelable {
    public static final Parcelable.Creator<ShopPolicy> CREATOR = new C26833Ag1();

    @InterfaceC65349Pkn("description")
    public final String description;

    @InterfaceC65349Pkn("logo")
    public final Icon icon;

    @InterfaceC65349Pkn("name")
    public final String name;

    @InterfaceC65349Pkn("privacy_policy")
    public final List<PrivacyPolicy> privacyPolicy;

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
        List<PrivacyPolicy> list = this.privacyPolicy;
        if (list == null) {
            out.writeInt(0);
            return;
        }
        Iterator LIZIZ = C279017q.LIZIZ(out, 1, list);
        while (LIZIZ.hasNext()) {
            ((PrivacyPolicy) LIZIZ.next()).writeToParcel(out, i);
        }
    }

    public ShopPolicy(String str, String str2, Icon icon, Icon icon2, List<PrivacyPolicy> list) {
        this.name = str;
        this.description = str2;
        this.icon = icon;
        this.smallIcon = icon2;
        this.privacyPolicy = list;
    }
}
