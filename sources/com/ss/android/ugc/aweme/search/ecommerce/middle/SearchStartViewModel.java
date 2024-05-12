package com.ss.android.ugc.aweme.search.ecommerce.middle;

import X.C51145K5l;
import X.C51146K5m;
import X.C51147K5n;
import X.C51148K5o;
import X.C51149K5p;
import X.C51150K5q;
import X.C51151K5r;
import X.C5H3;
import X.InterfaceC178696zp;
import X.InterfaceC50547Jsd;
import X.InterfaceC50548Jse;
import X.InterfaceC51113K4f;
import X.InterfaceC51158K5y;
import X.K69;
import X.V16;
import androidx.lifecycle.ViewModel;
import com.ss.android.ugc.aweme.arch.widgets.base.NextLiveData;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import java.util.HashMap;

/* loaded from: classes9.dex */
public final class SearchStartViewModel extends ViewModel {
    public int LJLILLLLZI;
    public boolean LJLJI;
    public boolean LJLJJI;
    public boolean LJLJJL;
    public boolean LJLJJLL;
    public InterfaceC51113K4f LJLLLLLL;
    public InterfaceC50548Jse LJLZ;
    public InterfaceC50547Jsd LJZ;
    public InterfaceC51158K5y LJZI;
    public InterfaceC51158K5y LJZL;
    public InterfaceC178696zp LL;
    public SearchResultParam LLD;
    public boolean LJLIL = true;
    public final K69 LJLJL = K69.LJLIL;
    public final C5H3 LJLJLJ = V16.LJJJJLL(C51145K5l.LJLIL);
    public final C5H3 LJLJLLL = V16.LJJJJLL(C51150K5q.LJLIL);
    public final C5H3 LJLL = V16.LJJJJLL(C51147K5n.LJLIL);
    public final C5H3 LJLLI = V16.LJJJJLL(C51146K5m.LJLIL);
    public final C5H3 LJLLILLLL = V16.LJJJJLL(C51151K5r.LJLIL);
    public final C5H3 LJLLJ = V16.LJJJJLL(C51148K5o.LJLIL);
    public final C5H3 LJLLL = V16.LJJJJLL(C51149K5p.LJLIL);
    public String LJLLLL = "";
    public int LLF = -1;
    public final HashMap<String, Long> LLFF = new HashMap<>();

    public final NextLiveData<Boolean> gv0() {
        return (NextLiveData) this.LJLJLJ.getValue();
    }

    public final NextLiveData<Integer> hv0() {
        return (NextLiveData) this.LJLLJ.getValue();
    }

    public final NextLiveData<Integer> iv0() {
        return (NextLiveData) this.LJLLL.getValue();
    }

    public final NextLiveData<Boolean> jv0() {
        return (NextLiveData) this.LJLJLLL.getValue();
    }
}
