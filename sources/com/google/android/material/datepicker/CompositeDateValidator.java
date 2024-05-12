package com.google.android.material.datepicker;

import X.YPE;
import X.YPF;
import X.YPG;
import X.YPH;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.datepicker.CalendarConstraints;
import java.util.List;

/* loaded from: classes16.dex */
public final class CompositeDateValidator implements CalendarConstraints.DateValidator {
    public final YPH operator;
    public final List<CalendarConstraints.DateValidator> validators;
    public static final YPH ANY_OPERATOR = new YPF();
    public static final YPH ALL_OPERATOR = new YPG();
    public static final Parcelable.Creator<CompositeDateValidator> CREATOR = new YPE();

    public CompositeDateValidator() {
        throw null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int hashCode() {
        return this.validators.hashCode();
    }

    @Override // com.google.android.material.datepicker.CalendarConstraints.DateValidator
    public final boolean LLLILZJ(long j) {
        return this.operator.LIZ(j, this.validators);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CompositeDateValidator)) {
            return false;
        }
        CompositeDateValidator compositeDateValidator = (CompositeDateValidator) obj;
        if (this.validators.equals(compositeDateValidator.validators) && this.operator.getId() == compositeDateValidator.operator.getId()) {
            return true;
        }
        return false;
    }

    public CompositeDateValidator(List list, YPH yph) {
        this.validators = list;
        this.operator = yph;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeList(this.validators);
        parcel.writeInt(this.operator.getId());
    }
}
