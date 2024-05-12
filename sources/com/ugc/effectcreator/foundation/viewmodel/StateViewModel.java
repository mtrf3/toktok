package com.ugc.effectcreator.foundation.viewmodel;

import X.C93624aTs;
import androidx.lifecycle.ViewModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes34.dex */
public class StateViewModel extends ViewModel {
    public final List<Object> LJLIL = new ArrayList();

    public static void gv0(C93624aTs postState, Object value) {
        o.LJIIIZ(postState, "$this$postState");
        o.LJIIIZ(value, "value");
        postState.LIZ.postValue(value);
    }

    public static void hv0(C93624aTs setState, Object value) {
        o.LJIIIZ(setState, "$this$setState");
        o.LJIIIZ(value, "value");
        setState.LIZ.setValue(value);
    }
}
