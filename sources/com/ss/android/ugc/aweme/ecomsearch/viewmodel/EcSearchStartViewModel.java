package com.ss.android.ugc.aweme.ecomsearch.viewmodel;

import X.C51193K7h;
import X.C51195K7j;
import X.C51196K7k;
import X.C51197K7l;
import X.C51198K7m;
import X.C51199K7n;
import X.C51200K7o;
import X.C51207K7v;
import X.C51209K7x;
import X.C51222K8k;
import X.C5H3;
import X.C76800UCe;
import X.C78866UxK;
import X.InterfaceC51158K5y;
import X.K7V;
import X.K7X;
import androidx.lifecycle.ViewModel;
import com.ss.android.ugc.aweme.arch.widgets.base.NextLiveData;
import java.util.HashMap;

/* loaded from: classes9.dex */
public final class EcSearchStartViewModel extends ViewModel {
    public static final /* synthetic */ int LL = 0;
    public boolean LJLILLLLZI;
    public boolean LJLJI;
    public boolean LJLJJI;
    public boolean LJLJJL;
    public K7V LJLLL;
    public K7X LJLLLL;
    public C51207K7v LJLLLLLL;
    public InterfaceC51158K5y LJLZ;
    public C51193K7h LJZ;
    public boolean LJLIL = true;
    public final C51209K7x LJLJJLL = C51209K7x.LJLIL;
    public final C5H3 LJLJL = C78866UxK.LJJLIIIJLJLI(C51195K7j.LJLIL);
    public final C5H3 LJLJLJ = C78866UxK.LJJLIIIJLJLI(C51199K7n.LJLIL);
    public final C5H3 LJLJLLL = C78866UxK.LJJLIIIJLJLI(C51196K7k.LJLIL);
    public final C5H3 LJLL = C78866UxK.LJJLIIIJLJLI(C51200K7o.LJLIL);
    public final C5H3 LJLLI = C78866UxK.LJJLIIIJLJLI(C51197K7l.LJLIL);
    public final C5H3 LJLLILLLL = C78866UxK.LJJLIIIJLJLI(C51198K7m.LJLIL);
    public String LJLLJ = "";
    public final HashMap<String, Long> LJZI = new HashMap<>();
    public int LJZL = -1;

    public final NextLiveData<Boolean> gv0() {
        return (NextLiveData) this.LJLJL.getValue();
    }

    public final NextLiveData<Integer> hv0() {
        return (NextLiveData) this.LJLLILLLL.getValue();
    }

    public final NextLiveData<Boolean> iv0() {
        return (NextLiveData) this.LJLJLJ.getValue();
    }

    public final void VT(String str, String str2) {
        C51222K8k c51222K8k = null;
        if (str != null && str2 != null) {
            c51222K8k = new C51222K8k(str, str2);
        }
        C51193K7h c51193K7h = this.LJZ;
        if (c51193K7h != null) {
            c51193K7h.LIZ = c51222K8k;
            if (C76800UCe.LIZ != null) {
                return;
            }
        }
        this.LJZ = new C51193K7h(c51222K8k);
    }
}
