package com.ss.android.ugc.aweme.search.common.viewmodel;

import X.C48339Iy7;
import X.C50948Jz6;
import X.EnumC51281KAr;
import X.KB1;
import X.X1D;
import androidx.lifecycle.ViewModel;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class SearchInfoViewModel extends ViewModel {
    public C50948Jz6 LJLIL;
    public String LJLILLLLZI = "";
    public boolean LJLJI;
    public boolean LJLJJI;

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SharedSearchInfoViewModel(recentEnterSearchWay='");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append("', isSearched=");
        return C48339Iy7.LIZJ(LIZ, this.LJLJI, ')', LIZ);
    }

    public final void gv0(boolean z) {
        int value;
        this.LJLJI = z;
        if (!o.LJ("discovery", this.LJLILLLLZI)) {
            C50948Jz6 c50948Jz6 = this.LJLIL;
            if (c50948Jz6 != null) {
                value = c50948Jz6.getEcSearchEntranceValue();
            } else {
                value = EnumC51281KAr.DEFAULT.getValue();
            }
            if (!KB1.LJII(value) && !o.LJ("homepage_friends", this.LJLILLLLZI)) {
                return;
            }
        }
        if (z) {
            this.LJLJJI = true;
        }
    }
}
