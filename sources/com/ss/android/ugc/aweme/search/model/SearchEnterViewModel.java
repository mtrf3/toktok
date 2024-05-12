package com.ss.android.ugc.aweme.search.model;

import X.ActivityC45651qj;
import X.C50948Jz6;
import androidx.lifecycle.ViewModel;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class SearchEnterViewModel extends ViewModel {
    public static final Map<Integer, C50948Jz6> LJLILLLLZI = new LinkedHashMap();
    public C50948Jz6 LJLIL;

    public final C50948Jz6 hv0() {
        C50948Jz6 c50948Jz6 = this.LJLIL;
        if (c50948Jz6 == null) {
            return new C50948Jz6();
        }
        o.LJI(c50948Jz6);
        return c50948Jz6;
    }

    public final boolean kv0() {
        C50948Jz6 c50948Jz6 = this.LJLIL;
        if (c50948Jz6 != null) {
            o.LJI(c50948Jz6);
            if (c50948Jz6.isSetHintBySugWord()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void jv0(ActivityC45651qj activityC45651qj, C50948Jz6 c50948Jz6) {
        if (c50948Jz6 == null || activityC45651qj == null) {
            return;
        }
        this.LJLIL = c50948Jz6;
        LJLILLLLZI.put(Integer.valueOf(activityC45651qj.hashCode()), c50948Jz6);
    }
}
