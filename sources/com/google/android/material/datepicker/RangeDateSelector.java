package com.google.android.material.datepicker;

import X.AbstractC80535Vj9;
import X.C15070iV;
import X.C16880lQ;
import X.C78972Uz2;
import X.C78996UzQ;
import X.C80315Vfb;
import X.C80534Vj8;
import X.C80552VjQ;
import X.C80561VjZ;
import X.C80563Vjb;
import X.C80565Vjd;
import X.C80566Vje;
import X.RunnableC248379ov;
import android.content.Context;
import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import com.zhiliaoapp.musically.R;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Locale;

/* loaded from: classes15.dex */
public class RangeDateSelector implements DateSelector<C15070iV<Long, Long>> {
    public static final Parcelable.Creator<RangeDateSelector> CREATOR = new C80563Vjb();
    public final String invalidRangeEndError = " ";
    public String invalidRangeStartError;
    public Long proposedTextEnd;
    public Long proposedTextStart;
    public Long selectedEndItem;
    public Long selectedStartItem;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public final Collection<Long> LJLLILLLL() {
        ArrayList arrayList = new ArrayList();
        Long l = this.selectedStartItem;
        if (l != null) {
            arrayList.add(l);
        }
        Long l2 = this.selectedEndItem;
        if (l2 != null) {
            arrayList.add(l2);
        }
        return arrayList;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public final boolean LLLLLLL() {
        Long l = this.selectedStartItem;
        if (l == null || this.selectedEndItem == null || l.longValue() > this.selectedEndItem.longValue()) {
            return false;
        }
        return true;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public final C15070iV<Long, Long> LLLLLLZZ() {
        return new C15070iV<>(this.selectedStartItem, this.selectedEndItem);
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public final Collection<C15070iV<Long, Long>> e() {
        if (this.selectedStartItem == null || this.selectedEndItem == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C15070iV(this.selectedStartItem, this.selectedEndItem));
        return arrayList;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public final int LJJLIIIJJIZ(Context context) {
        int i;
        Resources resources = context.getResources();
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        if (Math.min(displayMetrics.widthPixels, displayMetrics.heightPixels) > resources.getDimensionPixelSize(R.dimen.a16)) {
            i = R.attr.azz;
        } else {
            i = R.attr.azo;
        }
        return C78972Uz2.LIZIZ(context, i, C16880lQ.LJLLILLLL(MaterialDatePicker.class));
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public final String LLILZ(Context context) {
        C15070iV c15070iV;
        Resources resources = context.getResources();
        Long l = this.selectedStartItem;
        if (l == null && this.selectedEndItem == null) {
            return resources.getString(R.string.i__);
        }
        Long l2 = this.selectedEndItem;
        if (l2 == null) {
            return resources.getString(R.string.i_7, C80552VjQ.LIZ(l.longValue()));
        }
        if (l == null) {
            return resources.getString(R.string.i_6, C80552VjQ.LIZ(l2.longValue()));
        }
        Calendar LJII = C80561VjZ.LJII();
        Calendar LJIIIIZZ = C80561VjZ.LJIIIIZZ(null);
        LJIIIIZZ.setTimeInMillis(l.longValue());
        Calendar LJIIIIZZ2 = C80561VjZ.LJIIIIZZ(null);
        LJIIIIZZ2.setTimeInMillis(l2.longValue());
        if (LJIIIIZZ.get(1) == LJIIIIZZ2.get(1)) {
            if (LJIIIIZZ.get(1) == LJII.get(1)) {
                c15070iV = new C15070iV(C80552VjQ.LIZIZ(l.longValue(), Locale.getDefault()), C80552VjQ.LIZIZ(l2.longValue(), Locale.getDefault()));
            } else {
                c15070iV = new C15070iV(C80552VjQ.LIZIZ(l.longValue(), Locale.getDefault()), C80552VjQ.LIZJ(l2.longValue(), Locale.getDefault()));
            }
        } else {
            c15070iV = new C15070iV(C80552VjQ.LIZJ(l.longValue(), Locale.getDefault()), C80552VjQ.LIZJ(l2.longValue(), Locale.getDefault()));
        }
        return resources.getString(R.string.i_8, c15070iV.LIZ, c15070iV.LIZIZ);
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public final void LLLLLZIL(long j) {
        Long l = this.selectedStartItem;
        if (l == null) {
            this.selectedStartItem = Long.valueOf(j);
        } else if (this.selectedEndItem == null && l.longValue() <= j) {
            this.selectedEndItem = Long.valueOf(j);
        } else {
            this.selectedEndItem = null;
            this.selectedStartItem = Long.valueOf(j);
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeValue(this.selectedStartItem);
        parcel.writeValue(this.selectedEndItem);
    }

    public final void LIZ(C80315Vfb c80315Vfb, C80315Vfb c80315Vfb2, AbstractC80535Vj9<C15070iV<Long, Long>> abstractC80535Vj9) {
        Long l = this.proposedTextStart;
        if (l == null || this.proposedTextEnd == null) {
            if (c80315Vfb.getError() != null && this.invalidRangeStartError.contentEquals(c80315Vfb.getError())) {
                c80315Vfb.setError(null);
            }
            if (c80315Vfb2.getError() != null && " ".contentEquals(c80315Vfb2.getError())) {
                c80315Vfb2.setError(null);
            }
            abstractC80535Vj9.LIZ();
            return;
        }
        if (l.longValue() <= this.proposedTextEnd.longValue()) {
            Long l2 = this.proposedTextStart;
            this.selectedStartItem = l2;
            Long l3 = this.proposedTextEnd;
            this.selectedEndItem = l3;
            abstractC80535Vj9.LIZIZ(new C15070iV<>(l2, l3));
            return;
        }
        c80315Vfb.setError(this.invalidRangeStartError);
        c80315Vfb2.setError(" ");
        abstractC80535Vj9.LIZ();
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public final View LJLILLLLZI(LayoutInflater layoutInflater, ViewGroup viewGroup, CalendarConstraints calendarConstraints, C80534Vj8 c80534Vj8) {
        View LLLLIILL = C16880lQ.LLLLIILL(layoutInflater, R.layout.buc, viewGroup, false);
        C80315Vfb c80315Vfb = (C80315Vfb) LLLLIILL.findViewById(R.id.goj);
        C80315Vfb c80315Vfb2 = (C80315Vfb) LLLLIILL.findViewById(R.id.goi);
        EditText editText = c80315Vfb.getEditText();
        EditText editText2 = c80315Vfb2.getEditText();
        if (C78996UzQ.LJJIII()) {
            editText.setInputType(17);
            editText2.setInputType(17);
        }
        this.invalidRangeStartError = LLLLIILL.getResources().getString(R.string.i_3);
        SimpleDateFormat LJFF = C80561VjZ.LJFF();
        Long l = this.selectedStartItem;
        if (l != null) {
            editText.setText(LJFF.format(l));
            this.proposedTextStart = this.selectedStartItem;
        }
        Long l2 = this.selectedEndItem;
        if (l2 != null) {
            editText2.setText(LJFF.format(l2));
            this.proposedTextEnd = this.selectedEndItem;
        }
        String LJI = C80561VjZ.LJI(LLLLIILL.getResources(), LJFF);
        c80315Vfb.setPlaceholderText(LJI);
        c80315Vfb2.setPlaceholderText(LJI);
        editText.addTextChangedListener(new C80565Vjd(this, LJI, LJFF, c80315Vfb, calendarConstraints, c80315Vfb, c80315Vfb2, c80534Vj8));
        editText2.addTextChangedListener(new C80566Vje(this, LJI, LJFF, c80315Vfb2, calendarConstraints, c80315Vfb, c80315Vfb2, c80534Vj8));
        editText.requestFocus();
        editText.post(new RunnableC248379ov(editText));
        return LLLLIILL;
    }
}
