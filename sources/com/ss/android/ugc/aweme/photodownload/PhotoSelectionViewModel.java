package com.ss.android.ugc.aweme.photodownload;

import X.C221108m2;
import X.C42243Ghz;
import X.C62822Ol8;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes8.dex */
public final class PhotoSelectionViewModel extends ViewModel {
    public final C62822Ol8 LJLIL = C221108m2.LIZIZ(C42243Ghz.LJLIL);

    public final MutableLiveData<Set<Integer>> gv0() {
        return (MutableLiveData) this.LJLIL.getValue();
    }

    public final void hv0(int i) {
        HashSet hashSet = new HashSet();
        for (int i2 = 0; i2 < i; i2++) {
            hashSet.add(Integer.valueOf(i2));
        }
        gv0().setValue(hashSet);
    }

    public final void iv0(int i) {
        Set<Integer> value = gv0().getValue();
        if (value != null) {
            if (value.contains(Integer.valueOf(i))) {
                value.remove(Integer.valueOf(i));
            } else {
                value.add(Integer.valueOf(i));
            }
        }
        gv0().setValue(value);
    }
}
