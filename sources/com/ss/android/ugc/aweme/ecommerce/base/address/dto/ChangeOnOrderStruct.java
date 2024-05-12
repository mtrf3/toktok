package com.ss.android.ugc.aweme.ecommerce.base.address.dto;

import X.C26761Aer;
import X.C26762Aes;
import X.InterfaceC65349Pkn;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.q;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class ChangeOnOrderStruct implements Parcelable {

    @InterfaceC65349Pkn("code")
    public final Integer code;

    @InterfaceC65349Pkn("toast_message")
    public final String toast_message;
    public static final C26761Aer Companion = new C26761Aer();
    public static final Parcelable.Creator<ChangeOnOrderStruct> CREATOR = new C26762Aes();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChangeOnOrderStruct)) {
            return false;
        }
        ChangeOnOrderStruct changeOnOrderStruct = (ChangeOnOrderStruct) obj;
        return o.LJ(this.code, changeOnOrderStruct.code) && o.LJ(this.toast_message, changeOnOrderStruct.toast_message);
    }

    public final int hashCode() {
        Integer num = this.code;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.toast_message;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        int intValue;
        o.LJIIIZ(out, "out");
        Integer num = this.code;
        if (num == null) {
            intValue = 0;
        } else {
            out.writeInt(1);
            intValue = num.intValue();
        }
        out.writeInt(intValue);
        out.writeString(this.toast_message);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ChangeOnOrderStruct(code=");
        LIZ.append(this.code);
        LIZ.append(", toast_message=");
        return q.LIZIZ(LIZ, this.toast_message, ')', LIZ);
    }

    public ChangeOnOrderStruct(Integer num, String str) {
        this.code = num;
        this.toast_message = str;
    }
}
