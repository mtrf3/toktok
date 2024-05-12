package com.ss.android.ugc.aweme.shortvideo.cut.viewmodel;

import X.C157756Hb;
import X.C221108m2;
import X.C62822Ol8;
import X.C6HV;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class VEVideoCutterViewModel extends ViewModel {
    public final C62822Ol8 LJLIL = C221108m2.LIZIZ(C157756Hb.LJLIL);

    public final MutableLiveData<C6HV> gv0() {
        return (MutableLiveData) this.LJLIL.getValue();
    }

    public final void hv0(C6HV value) {
        o.LJIIIZ(value, "value");
        gv0().setValue(value);
    }
}
