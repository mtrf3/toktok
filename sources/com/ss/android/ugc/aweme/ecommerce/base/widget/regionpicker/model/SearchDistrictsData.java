package com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.model;

import X.C27371Aoh;
import X.C279017q;
import X.InterfaceC65349Pkn;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.api.model.ExceptionUX;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class SearchDistrictsData implements Parcelable {
    public static final Parcelable.Creator<SearchDistrictsData> CREATOR = new C27371Aoh();

    @InterfaceC65349Pkn("districts")
    public final List<District> districts;

    @InterfaceC65349Pkn("exception_ux")
    public final ExceptionUX exceptionUX;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchDistrictsData)) {
            return false;
        }
        SearchDistrictsData searchDistrictsData = (SearchDistrictsData) obj;
        return o.LJ(this.districts, searchDistrictsData.districts) && o.LJ(this.exceptionUX, searchDistrictsData.exceptionUX);
    }

    public final int hashCode() {
        List<District> list = this.districts;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        ExceptionUX exceptionUX = this.exceptionUX;
        return hashCode + (exceptionUX != null ? exceptionUX.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SearchDistrictsData(districts=");
        LIZ.append(this.districts);
        LIZ.append(", exceptionUX=");
        LIZ.append(this.exceptionUX);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public SearchDistrictsData(List<District> list, ExceptionUX exceptionUX) {
        this.districts = list;
        this.exceptionUX = exceptionUX;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        List<District> list = this.districts;
        if (list == null) {
            out.writeInt(0);
        } else {
            Iterator LIZIZ = C279017q.LIZIZ(out, 1, list);
            while (LIZIZ.hasNext()) {
                ((District) LIZIZ.next()).writeToParcel(out, i);
            }
        }
        out.writeParcelable(this.exceptionUX, i);
    }
}
