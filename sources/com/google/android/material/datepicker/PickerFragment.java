package com.google.android.material.datepicker;

import X.AbstractC80535Vj9;
import X.C80532Vj6;
import androidx.fragment.app.Fragment;
import java.util.LinkedHashSet;

/* loaded from: classes15.dex */
public abstract class PickerFragment<S> extends Fragment {
    public final LinkedHashSet<AbstractC80535Vj9<S>> LJLIL = new LinkedHashSet<>();

    public boolean vl(C80532Vj6 c80532Vj6) {
        return this.LJLIL.add(c80532Vj6);
    }
}
