package com.google.android.material.datepicker;

import X.C15070iV;
import X.C16880lQ;
import X.C78972Uz2;
import X.C78996UzQ;
import X.C80315Vfb;
import X.C80534Vj8;
import X.C80552VjQ;
import X.C80561VjZ;
import X.C80562Vja;
import X.C80564Vjc;
import X.RunnableC248379ov;
import android.content.Context;
import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import com.zhiliaoapp.musically.R;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Locale;

/* loaded from: classes15.dex */
public class SingleDateSelector implements DateSelector<Long> {
    public static final Parcelable.Creator<SingleDateSelector> CREATOR = new C80564Vjc();
    public Long selectedItem;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public final Collection<Long> LJLLILLLL() {
        ArrayList arrayList = new ArrayList();
        Long l = this.selectedItem;
        if (l != null) {
            arrayList.add(l);
        }
        return arrayList;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public final boolean LLLLLLL() {
        if (this.selectedItem != null) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public final Collection<C15070iV<Long, Long>> e() {
        return new ArrayList();
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public final /* bridge */ /* synthetic */ Long LLLLLLZZ() {
        return this.selectedItem;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public final int LJJLIIIJJIZ(Context context) {
        return C78972Uz2.LIZIZ(context, R.attr.azz, C16880lQ.LJLLILLLL(MaterialDatePicker.class));
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public final String LLILZ(Context context) {
        Resources resources = context.getResources();
        Long l = this.selectedItem;
        if (l == null) {
            return resources.getString(R.string.i9y);
        }
        return resources.getString(R.string.i9w, C80552VjQ.LIZJ(l.longValue(), Locale.getDefault()));
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public final void LLLLLZIL(long j) {
        this.selectedItem = Long.valueOf(j);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeValue(this.selectedItem);
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public final View LJLILLLLZI(LayoutInflater layoutInflater, ViewGroup viewGroup, CalendarConstraints calendarConstraints, C80534Vj8 c80534Vj8) {
        View LLLLIILL = C16880lQ.LLLLIILL(layoutInflater, R.layout.bub, viewGroup, false);
        C80315Vfb c80315Vfb = (C80315Vfb) LLLLIILL.findViewById(R.id.goh);
        EditText editText = c80315Vfb.getEditText();
        if (C78996UzQ.LJJIII()) {
            editText.setInputType(17);
        }
        SimpleDateFormat LJFF = C80561VjZ.LJFF();
        String LJI = C80561VjZ.LJI(LLLLIILL.getResources(), LJFF);
        c80315Vfb.setPlaceholderText(LJI);
        Long l = this.selectedItem;
        if (l != null) {
            editText.setText(LJFF.format(l));
        }
        editText.addTextChangedListener(new C80562Vja(this, LJI, LJFF, c80315Vfb, calendarConstraints, c80534Vj8));
        editText.requestFocus();
        editText.post(new RunnableC248379ov(editText));
        return LLLLIILL;
    }
}
