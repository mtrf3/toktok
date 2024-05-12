package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C1FJ;
import X.C27080Ak0;
import X.C27081Ak1;
import X.InterfaceC65349Pkn;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Icon;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class BottomTip implements Parcelable {

    @InterfaceC65349Pkn("icon")
    public final Icon icon;

    @InterfaceC65349Pkn("link")
    public final String link;

    @InterfaceC65349Pkn("name")
    public final String name;

    @InterfaceC65349Pkn("text")
    public final String text;

    @InterfaceC65349Pkn("type")
    public final Integer type;
    public static final C27081Ak1 Companion = new C27081Ak1();
    public static final Parcelable.Creator<BottomTip> CREATOR = new C27080Ak0();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BottomTip)) {
            return false;
        }
        BottomTip bottomTip = (BottomTip) obj;
        return o.LJ(this.type, bottomTip.type) && o.LJ(this.name, bottomTip.name) && o.LJ(this.text, bottomTip.text) && o.LJ(this.link, bottomTip.link) && o.LJ(this.icon, bottomTip.icon);
    }

    public final int hashCode() {
        Integer num = this.type;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.name;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.text;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.link;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Icon icon = this.icon;
        return hashCode4 + (icon != null ? icon.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("BottomTip(type=");
        LIZ.append(this.type);
        LIZ.append(", name=");
        LIZ.append(this.name);
        LIZ.append(", text=");
        LIZ.append(this.text);
        LIZ.append(", link=");
        LIZ.append(this.link);
        LIZ.append(", icon=");
        LIZ.append(this.icon);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        Integer num = this.type;
        if (num == null) {
            out.writeInt(0);
        } else {
            C1FJ.LJ(out, 1, num);
        }
        out.writeString(this.name);
        out.writeString(this.text);
        out.writeString(this.link);
        Icon icon = this.icon;
        if (icon == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            icon.writeToParcel(out, i);
        }
    }

    public BottomTip(Integer num, String str, String str2, String str3, Icon icon) {
        this.type = num;
        this.name = str;
        this.text = str2;
        this.link = str3;
        this.icon = icon;
    }
}
