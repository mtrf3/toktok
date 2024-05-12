package com.ss.android.ugc.aweme.ecommerce.api.model;

import X.B29;
import X.C1FJ;
import X.C79062V1e;
import X.InterfaceC65349Pkn;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class ToastContent implements Parcelable {
    public static final Parcelable.Creator<ToastContent> CREATOR = new B29();

    @InterfaceC65349Pkn("duration")
    public final Integer duration;

    @InterfaceC65349Pkn("icon")
    public final String iconRes;

    @InterfaceC65349Pkn("message")
    public final String message;

    @InterfaceC65349Pkn("toast_type")
    public final Integer toastType;

    public static /* synthetic */ ToastContent copy$default(ToastContent toastContent, Integer num, Integer num2, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            num = toastContent.toastType;
        }
        if ((i & 2) != 0) {
            num2 = toastContent.duration;
        }
        if ((i & 4) != 0) {
            str = toastContent.message;
        }
        if ((i & 8) != 0) {
            str2 = toastContent.iconRes;
        }
        return toastContent.copy(num, num2, str, str2);
    }

    public final ToastContent copy(Integer num, Integer num2, String message, String str) {
        o.LJIIIZ(message, "message");
        return new ToastContent(num, num2, message, str);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ToastContent)) {
            return false;
        }
        ToastContent toastContent = (ToastContent) obj;
        return o.LJ(this.toastType, toastContent.toastType) && o.LJ(this.duration, toastContent.duration) && o.LJ(this.message, toastContent.message) && o.LJ(this.iconRes, toastContent.iconRes);
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        Integer num = this.toastType;
        int i = 0;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int i2 = hashCode * 31;
        Integer num2 = this.duration;
        if (num2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = num2.hashCode();
        }
        int LJ = C79062V1e.LJ(this.message, (i2 + hashCode2) * 31, 31);
        String str = this.iconRes;
        if (str != null) {
            i = str.hashCode();
        }
        return LJ + i;
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ToastContent(toastType=");
        LIZ.append(this.toastType);
        LIZ.append(", duration=");
        LIZ.append(this.duration);
        LIZ.append(", message=");
        LIZ.append(this.message);
        LIZ.append(", iconRes=");
        return q.LIZIZ(LIZ, this.iconRes, ')', LIZ);
    }

    public final Integer getDuration() {
        return this.duration;
    }

    public final String getIconRes() {
        return this.iconRes;
    }

    public final String getMessage() {
        return this.message;
    }

    public final Integer getToastType() {
        return this.toastType;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        Integer num = this.toastType;
        if (num == null) {
            out.writeInt(0);
        } else {
            C1FJ.LJ(out, 1, num);
        }
        Integer num2 = this.duration;
        if (num2 == null) {
            out.writeInt(0);
        } else {
            C1FJ.LJ(out, 1, num2);
        }
        out.writeString(this.message);
        out.writeString(this.iconRes);
    }

    public ToastContent(Integer num, Integer num2, String message, String str) {
        o.LJIIIZ(message, "message");
        this.toastType = num;
        this.duration = num2;
        this.message = message;
        this.iconRes = str;
    }

    public /* synthetic */ ToastContent(Integer num, Integer num2, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0 : num, num2, str, str2);
    }
}
