package com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.viewmodel;

import X.AnonymousClass391;
import X.C61878OQg;
import X.C79062V1e;
import X.InterfaceC61312at;
import X.X1D;
import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.model.District;
import defpackage.b0;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class DistrictPickerState implements InterfaceC61312at {
    public final List<Object> districtList;
    public final District selectedDistrict;
    public final int status;
    public final String title;
    public final String titleEn;

    public DistrictPickerState() {
        this(null, null, null, null, 0, 31, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DistrictPickerState copy$default(DistrictPickerState districtPickerState, String str, String str2, List list, District district, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = districtPickerState.title;
        }
        if ((i2 & 2) != 0) {
            str2 = districtPickerState.titleEn;
        }
        if ((i2 & 4) != 0) {
            list = districtPickerState.districtList;
        }
        if ((i2 & 8) != 0) {
            district = districtPickerState.selectedDistrict;
        }
        if ((i2 & 16) != 0) {
            i = districtPickerState.status;
        }
        return districtPickerState.copy(str, str2, list, district, i);
    }

    public final DistrictPickerState copy(String title, String titleEn, List<? extends Object> districtList, District district, int i) {
        o.LJIIIZ(title, "title");
        o.LJIIIZ(titleEn, "titleEn");
        o.LJIIIZ(districtList, "districtList");
        return new DistrictPickerState(title, titleEn, districtList, district, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DistrictPickerState)) {
            return false;
        }
        DistrictPickerState districtPickerState = (DistrictPickerState) obj;
        return o.LJ(this.title, districtPickerState.title) && o.LJ(this.titleEn, districtPickerState.titleEn) && o.LJ(this.districtList, districtPickerState.districtList) && o.LJ(this.selectedDistrict, districtPickerState.selectedDistrict) && this.status == districtPickerState.status;
    }

    public int hashCode() {
        int hashCode;
        int LIZIZ = AnonymousClass391.LIZIZ(this.districtList, C79062V1e.LJ(this.titleEn, this.title.hashCode() * 31, 31), 31);
        District district = this.selectedDistrict;
        if (district == null) {
            hashCode = 0;
        } else {
            hashCode = district.hashCode();
        }
        return ((LIZIZ + hashCode) * 31) + this.status;
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("DistrictPickerState(title=");
        LIZ.append(this.title);
        LIZ.append(", titleEn=");
        LIZ.append(this.titleEn);
        LIZ.append(", districtList=");
        LIZ.append(this.districtList);
        LIZ.append(", selectedDistrict=");
        LIZ.append(this.selectedDistrict);
        LIZ.append(", status=");
        return b0.LIZJ(LIZ, this.status, ')', LIZ);
    }

    public final List<Object> getDistrictList() {
        return this.districtList;
    }

    public final District getSelectedDistrict() {
        return this.selectedDistrict;
    }

    public final int getStatus() {
        return this.status;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getTitleEn() {
        return this.titleEn;
    }

    public DistrictPickerState(String title, String titleEn, List<? extends Object> districtList, District district, int i) {
        o.LJIIIZ(title, "title");
        o.LJIIIZ(titleEn, "titleEn");
        o.LJIIIZ(districtList, "districtList");
        this.title = title;
        this.titleEn = titleEn;
        this.districtList = districtList;
        this.selectedDistrict = district;
        this.status = i;
    }

    public DistrictPickerState(String str, String str2, List list, District district, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) == 0 ? str2 : "", (i2 & 4) != 0 ? C61878OQg.INSTANCE : list, (i2 & 8) != 0 ? null : district, (i2 & 16) != 0 ? -1 : i);
    }
}
