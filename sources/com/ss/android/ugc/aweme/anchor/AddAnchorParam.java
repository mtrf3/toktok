package com.ss.android.ugc.aweme.anchor;

import X.A6W;
import X.InterfaceC87283bg;
import X.X1D;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.router.annotation.IRouteArg;
import com.bytedance.router.arg.RouteParser;
import defpackage.q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class AddAnchorParam implements IRouteArg, InterfaceC87283bg {
    public static final Parcelable.Creator<AddAnchorParam> CREATOR = new A6W();
    public final String creationId;
    public final String enterFrom;
    public final String shootWay;

    /* JADX WARN: Multi-variable type inference failed */
    public AddAnchorParam() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
    }

    public static AddAnchorParam __fromBundle(Bundle bundle) {
        int i;
        String str;
        String str2;
        String str3 = null;
        if (bundle == null) {
            return null;
        }
        if (bundle.containsKey("enter_from")) {
            str = (String) RouteParser.INSTANCE.parse(bundle.get("enter_from"), String.class);
            i = 0;
        } else {
            i = 1;
            str = null;
        }
        if (bundle.containsKey("shoot_way")) {
            str2 = (String) RouteParser.INSTANCE.parse(bundle.get("shoot_way"), String.class);
        } else {
            i += 2;
            str2 = null;
        }
        if (bundle.containsKey("creation_id")) {
            str3 = (String) RouteParser.INSTANCE.parse(bundle.get("creation_id"), String.class);
        } else {
            i += 4;
        }
        return new AddAnchorParam(str, str2, str3, i, null);
    }

    public static /* synthetic */ AddAnchorParam copy$default(AddAnchorParam addAnchorParam, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = addAnchorParam.enterFrom;
        }
        if ((i & 2) != 0) {
            str2 = addAnchorParam.shootWay;
        }
        if ((i & 4) != 0) {
            str3 = addAnchorParam.creationId;
        }
        return addAnchorParam.copy(str, str2, str3);
    }

    public final AddAnchorParam copy(String str, String str2, String str3) {
        return new AddAnchorParam(str, str2, str3);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AddAnchorParam)) {
            return false;
        }
        AddAnchorParam addAnchorParam = (AddAnchorParam) obj;
        return o.LJ(this.enterFrom, addAnchorParam.enterFrom) && o.LJ(this.shootWay, addAnchorParam.shootWay) && o.LJ(this.creationId, addAnchorParam.creationId);
    }

    public int hashCode() {
        String str = this.enterFrom;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.shootWay;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.creationId;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.enterFrom);
        out.writeString(this.shootWay);
        out.writeString(this.creationId);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AddAnchorParam(enterFrom=");
        LIZ.append(this.enterFrom);
        LIZ.append(", shootWay=");
        LIZ.append(this.shootWay);
        LIZ.append(", creationId=");
        return q.LIZIZ(LIZ, this.creationId, ')', LIZ);
    }

    public final String getCreationId() {
        return this.creationId;
    }

    public final String getEnterFrom() {
        return this.enterFrom;
    }

    public final String getShootWay() {
        return this.shootWay;
    }

    public AddAnchorParam(String str, String str2, String str3) {
        this.enterFrom = str;
        this.shootWay = str2;
        this.creationId = str3;
    }

    public /* synthetic */ AddAnchorParam(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }
}
