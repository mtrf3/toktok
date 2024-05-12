package com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto;

import X.C279017q;
import X.InterfaceC65349Pkn;
import X.RV0;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.q;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class SkcInfo implements Parcelable {
    public static final Parcelable.Creator<SkcInfo> CREATOR = new RV0();

    @InterfaceC65349Pkn("mini_panel_schema")
    public final String miniPanelSchema;

    @InterfaceC65349Pkn("skcs")
    public final List<Skc> skcList;

    @InterfaceC65349Pkn("skc_property_id")
    public final String skcPropertyId;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SkcInfo)) {
            return false;
        }
        SkcInfo skcInfo = (SkcInfo) obj;
        return o.LJ(this.skcPropertyId, skcInfo.skcPropertyId) && o.LJ(this.skcList, skcInfo.skcList) && o.LJ(this.miniPanelSchema, skcInfo.miniPanelSchema);
    }

    public final int hashCode() {
        String str = this.skcPropertyId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<Skc> list = this.skcList;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.miniPanelSchema;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SkcInfo(skcPropertyId=");
        LIZ.append(this.skcPropertyId);
        LIZ.append(", skcList=");
        LIZ.append(this.skcList);
        LIZ.append(", miniPanelSchema=");
        return q.LIZIZ(LIZ, this.miniPanelSchema, ')', LIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.skcPropertyId);
        List<Skc> list = this.skcList;
        if (list == null) {
            out.writeInt(0);
        } else {
            Iterator LIZIZ = C279017q.LIZIZ(out, 1, list);
            while (LIZIZ.hasNext()) {
                ((Skc) LIZIZ.next()).writeToParcel(out, i);
            }
        }
        out.writeString(this.miniPanelSchema);
    }

    public SkcInfo(String str, List<Skc> list, String str2) {
        this.skcPropertyId = str;
        this.skcList = list;
        this.miniPanelSchema = str2;
    }
}
