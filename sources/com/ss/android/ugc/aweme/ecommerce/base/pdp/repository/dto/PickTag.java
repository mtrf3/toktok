package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.InterfaceC65349Pkn;
import X.RV9;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import defpackage.q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class PickTag implements Parcelable {
    public static final Parcelable.Creator<PickTag> CREATOR = new RV9();

    @InterfaceC65349Pkn("activity_id")
    public final String activityId;

    @InterfaceC65349Pkn("icon")
    public final Image icon;

    @InterfaceC65349Pkn("log_extra")
    public final String logExtra;

    @InterfaceC65349Pkn("name")
    public final String name;

    /* JADX WARN: Multi-variable type inference failed */
    public PickTag() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 15, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PickTag)) {
            return false;
        }
        PickTag pickTag = (PickTag) obj;
        return o.LJ(this.activityId, pickTag.activityId) && o.LJ(this.name, pickTag.name) && o.LJ(this.icon, pickTag.icon) && o.LJ(this.logExtra, pickTag.logExtra);
    }

    public final int hashCode() {
        String str = this.activityId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.name;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Image image = this.icon;
        int hashCode3 = (hashCode2 + (image == null ? 0 : image.hashCode())) * 31;
        String str3 = this.logExtra;
        return hashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.activityId);
        out.writeString(this.name);
        out.writeParcelable(this.icon, i);
        out.writeString(this.logExtra);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PickTag(activityId=");
        LIZ.append(this.activityId);
        LIZ.append(", name=");
        LIZ.append(this.name);
        LIZ.append(", icon=");
        LIZ.append(this.icon);
        LIZ.append(", logExtra=");
        return q.LIZIZ(LIZ, this.logExtra, ')', LIZ);
    }

    public PickTag(String str, String str2, Image image, String str3) {
        this.activityId = str;
        this.name = str2;
        this.icon = image;
        this.logExtra = str3;
    }

    public /* synthetic */ PickTag(String str, String str2, Image image, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : image, (i & 8) != 0 ? null : str3);
    }
}
