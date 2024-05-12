package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C27557Arh;
import X.InterfaceC65349Pkn;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Icon;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class PhoneContact implements Parcelable {
    public static final Parcelable.Creator<PhoneContact> CREATOR = new C27557Arh();

    @InterfaceC65349Pkn("button_text")
    public final String buttonText;

    @InterfaceC65349Pkn("copy_icon")
    public final Icon copyIcon;

    @InterfaceC65349Pkn("message")
    public final String message;

    @InterfaceC65349Pkn("phone_num")
    public final String phoneNum;

    @InterfaceC65349Pkn("title")
    public final String title;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PhoneContact)) {
            return false;
        }
        PhoneContact phoneContact = (PhoneContact) obj;
        return o.LJ(this.title, phoneContact.title) && o.LJ(this.message, phoneContact.message) && o.LJ(this.phoneNum, phoneContact.phoneNum) && o.LJ(this.buttonText, phoneContact.buttonText) && o.LJ(this.copyIcon, phoneContact.copyIcon);
    }

    public final int hashCode() {
        String str = this.title;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.message;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.phoneNum;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.buttonText;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Icon icon = this.copyIcon;
        return hashCode4 + (icon != null ? icon.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PhoneContact(title=");
        LIZ.append(this.title);
        LIZ.append(", message=");
        LIZ.append(this.message);
        LIZ.append(", phoneNum=");
        LIZ.append(this.phoneNum);
        LIZ.append(", buttonText=");
        LIZ.append(this.buttonText);
        LIZ.append(", copyIcon=");
        LIZ.append(this.copyIcon);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.title);
        out.writeString(this.message);
        out.writeString(this.phoneNum);
        out.writeString(this.buttonText);
        Icon icon = this.copyIcon;
        if (icon == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            icon.writeToParcel(out, i);
        }
    }

    public PhoneContact(String str, String str2, String str3, String str4, Icon icon) {
        this.title = str;
        this.message = str2;
        this.phoneNum = str3;
        this.buttonText = str4;
        this.copyIcon = icon;
    }
}
