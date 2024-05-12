package com.google.android.material.timepicker;

import X.C16880lQ;
import X.C80518Vis;
import X.Q94;
import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import java.util.Arrays;

/* loaded from: classes15.dex */
public class TimeModel implements Parcelable {
    public static final Parcelable.Creator<TimeModel> CREATOR = new C80518Vis();
    public final int LJLIL;
    public int LJLILLLLZI;
    public int LJLJI;
    public int LJLJJI;
    public int LJLJJL;
    public final Q94 hourInputValidator;
    public final Q94 minuteInputValidator;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.LJLIL), Integer.valueOf(this.LJLILLLLZI), Integer.valueOf(this.LJLJI), Integer.valueOf(this.LJLJJI)});
    }

    public TimeModel() {
        this(0, 0, 10, 0);
    }

    public final int LIZIZ() {
        if (this.LJLIL == 1) {
            return this.LJLILLLLZI % 24;
        }
        int i = this.LJLILLLLZI;
        if (i % 12 == 0) {
            return 12;
        }
        if (this.LJLJJL == 1) {
            return i - 12;
        }
        return i;
    }

    public final void LIZLLL(int i) {
        if (this.LJLIL == 1) {
            this.LJLILLLLZI = i;
            return;
        }
        int i2 = 12;
        int i3 = i % 12;
        if (this.LJLJJL != 1) {
            i2 = 0;
        }
        this.LJLILLLLZI = i3 + i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TimeModel)) {
            return false;
        }
        TimeModel timeModel = (TimeModel) obj;
        if (this.LJLILLLLZI == timeModel.LJLILLLLZI && this.LJLJI == timeModel.LJLJI && this.LJLIL == timeModel.LJLIL && this.LJLJJI == timeModel.LJLJJI) {
            return true;
        }
        return false;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.LJLILLLLZI);
        parcel.writeInt(this.LJLJI);
        parcel.writeInt(this.LJLJJI);
        parcel.writeInt(this.LJLIL);
    }

    public static String LIZ(Resources resources, CharSequence charSequence, String str) {
        return C16880lQ.LLLZI(resources.getConfiguration().locale, str, new Object[]{Integer.valueOf(CastIntegerProtector.parseInt(String.valueOf(charSequence)))});
    }

    public TimeModel(int i, int i2, int i3, int i4) {
        int i5;
        this.LJLILLLLZI = i;
        this.LJLJI = i2;
        this.LJLJJI = i3;
        this.LJLIL = i4;
        if (i >= 12) {
            i5 = 1;
        } else {
            i5 = 0;
        }
        this.LJLJJL = i5;
        this.minuteInputValidator = new Q94(59);
        this.hourInputValidator = new Q94(i4 == 1 ? 24 : 12);
    }
}
