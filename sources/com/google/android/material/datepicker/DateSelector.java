package com.google.android.material.datepicker;

import X.C15070iV;
import X.C80534Vj8;
import android.content.Context;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.Collection;

/* loaded from: classes15.dex */
public interface DateSelector<S> extends Parcelable {
    int LJJLIIIJJIZ(Context context);

    View LJLILLLLZI(LayoutInflater layoutInflater, ViewGroup viewGroup, CalendarConstraints calendarConstraints, C80534Vj8 c80534Vj8);

    Collection<Long> LJLLILLLL();

    String LLILZ(Context context);

    boolean LLLLLLL();

    S LLLLLLZZ();

    void LLLLLZIL(long j);

    Collection<C15070iV<Long, Long>> e();
}
