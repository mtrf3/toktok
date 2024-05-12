package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.InterfaceC65349Pkn;
import X.RSX;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class BlockPageInfo implements Parcelable {
    public static final Parcelable.Creator<BlockPageInfo> CREATOR = new RSX();

    @InterfaceC65349Pkn("block_code")
    public final Integer code;

    @InterfaceC65349Pkn("first_title")
    public final String firstTitle;

    @InterfaceC65349Pkn("block_reason")
    public final String message;

    @InterfaceC65349Pkn("second_title")
    public final String secondTitle;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BlockPageInfo)) {
            return false;
        }
        BlockPageInfo blockPageInfo = (BlockPageInfo) obj;
        return o.LJ(this.code, blockPageInfo.code) && o.LJ(this.message, blockPageInfo.message) && o.LJ(this.firstTitle, blockPageInfo.firstTitle) && o.LJ(this.secondTitle, blockPageInfo.secondTitle);
    }

    public final int hashCode() {
        Integer num = this.code;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.message;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.firstTitle;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.secondTitle;
        return hashCode3 + (str3 != null ? str3.hashCode() : 0);
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
        out.writeString(this.message);
        out.writeString(this.firstTitle);
        out.writeString(this.secondTitle);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("BlockPageInfo(code=");
        LIZ.append(this.code);
        LIZ.append(", message=");
        LIZ.append(this.message);
        LIZ.append(", firstTitle=");
        LIZ.append(this.firstTitle);
        LIZ.append(", secondTitle=");
        return q.LIZIZ(LIZ, this.secondTitle, ')', LIZ);
    }

    public BlockPageInfo(Integer num, String str, String str2, String str3) {
        this.code = num;
        this.message = str;
        this.firstTitle = str2;
        this.secondTitle = str3;
    }

    public /* synthetic */ BlockPageInfo(Integer num, String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(num, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3);
    }
}
