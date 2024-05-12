package com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.model;

import X.C1FL;
import X.C27372Aoi;
import X.C27373Aoj;
import X.C279017q;
import X.C48339Iy7;
import X.C76800UCe;
import X.InterfaceC65349Pkn;
import X.X1D;
import X.XJL;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class District implements Parcelable {

    @InterfaceC65349Pkn("code")
    public String code;
    public transient XJL<? super C76800UCe> continuation;

    @InterfaceC65349Pkn("district_key")
    public final String districtKey;

    @InterfaceC65349Pkn("geoname_id")
    public final String geoNameId;

    @InterfaceC65349Pkn("has_next")
    public final Boolean hasNextLevel;

    @InterfaceC65349Pkn("index")
    public String index;

    @InterfaceC65349Pkn("latitude")
    public final String latitude;

    @InterfaceC65349Pkn("longitude")
    public final String longitude;
    public transient List<District> multilevelDistricts;

    @InterfaceC65349Pkn("name")
    public final String name;

    @InterfaceC65349Pkn("par_regions")
    public final List<District> parRegions;
    public transient DistrictData response;
    public transient boolean showIndex;
    public static final C27373Aoj Companion = new C27373Aoj();
    public static final Parcelable.Creator<District> CREATOR = new C27372Aoi();

    /* JADX WARN: Multi-variable type inference failed */
    public District() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 511, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("District(name=");
        LIZ.append(this.name);
        LIZ.append(", code=");
        LIZ.append(this.code);
        LIZ.append(", geoNameId=");
        LIZ.append(this.geoNameId);
        LIZ.append(", index=");
        LIZ.append(this.index);
        LIZ.append(", showIndex=");
        return C48339Iy7.LIZJ(LIZ, this.showIndex, ')', LIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.name);
        out.writeString(this.geoNameId);
        out.writeString(this.code);
        out.writeString(this.index);
        out.writeString(this.districtKey);
        List<District> list = this.parRegions;
        if (list == null) {
            out.writeInt(0);
        } else {
            Iterator LIZIZ = C279017q.LIZIZ(out, 1, list);
            while (LIZIZ.hasNext()) {
                ((District) LIZIZ.next()).writeToParcel(out, i);
            }
        }
        Boolean bool = this.hasNextLevel;
        if (bool == null) {
            out.writeInt(0);
        } else {
            C1FL.LJ(out, 1, bool);
        }
        out.writeString(this.longitude);
        out.writeString(this.latitude);
    }

    public District(String str, String str2, String str3, String str4, String str5, List<District> list, Boolean bool, String str6, String str7) {
        this.name = str;
        this.geoNameId = str2;
        this.code = str3;
        this.index = str4;
        this.districtKey = str5;
        this.parRegions = list;
        this.hasNextLevel = bool;
        this.longitude = str6;
        this.latitude = str7;
    }

    public /* synthetic */ District(String str, String str2, String str3, String str4, String str5, List list, Boolean bool, String str6, String str7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : str3, (i & 8) == 0 ? str4 : "", (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : list, (i & 64) != 0 ? null : bool, (i & 128) != 0 ? null : str6, (i & 256) == 0 ? str7 : null);
    }
}
