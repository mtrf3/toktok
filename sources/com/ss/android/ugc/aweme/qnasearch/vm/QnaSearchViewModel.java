package com.ss.android.ugc.aweme.qnasearch.vm;

import X.C48841JEv;
import X.C74100T6i;
import X.C74125T7h;
import X.C76800UCe;
import X.C78613UtF;
import X.KKC;
import X.KKF;
import X.KKL;
import X.KKM;
import X.KKR;
import X.OSZ;
import X.T8G;
import X.XKQ;
import X.XKX;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import java.util.List;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes9.dex */
public final class QnaSearchViewModel extends ViewModel implements T8G {
    public final KKL LJLIL;
    public final MutableLiveData<C74100T6i<List<C74125T7h>>> LJLILLLLZI;
    public final MutableLiveData LJLJI;
    public final MutableLiveData<C74100T6i<C76800UCe>> LJLJJI;
    public final MutableLiveData LJLJJL;
    public final MutableLiveData<C74100T6i<C76800UCe>> LJLJJLL;
    public final MutableLiveData LJLJL;
    public final MutableLiveData<C74100T6i<String>> LJLJLJ;
    public final MutableLiveData LJLJLLL;
    public final MutableLiveData<C74100T6i<C76800UCe>> LJLL;
    public final MutableLiveData LJLLI;
    public final MutableLiveData<C74100T6i<KKF>> LJLLILLLL;
    public final MutableLiveData LJLLJ;
    public final MutableLiveData<C74100T6i<C76800UCe>> LJLLL;
    public final MutableLiveData LJLLLL;
    public final MutableLiveData LJLLLLLL;
    public final MutableLiveData LJLZ;
    public final MutableLiveData LJZ;
    public final MutableLiveData LJZI;

    @Override // X.T8G
    public final void HB() {
        this.LJLLL.setValue(new C74100T6i<>(C76800UCe.LIZ));
    }

    @Override // X.T8G
    public final void RM() {
        this.LJLILLLLZI.setValue(new C74100T6i<>(this.LJLIL.LIZIZ(false)));
    }

    @Override // X.T8G
    public final void clearAll() {
        this.LJLIL.LIZ.LJFF();
        this.LJLL.setValue(new C74100T6i<>(C76800UCe.LIZ));
    }

    @Override // X.T8G
    public final void onCancel() {
        this.LJLJJI.setValue(new C74100T6i<>(C76800UCe.LIZ));
    }

    @Override // X.T8G
    public final void wW() {
        this.LJLJJLL.setValue(new C74100T6i<>(C76800UCe.LIZ));
    }

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        this.LJLIL.LJI.LIZLLL();
    }

    public QnaSearchViewModel(KKL kkl) {
        this.LJLIL = kkl;
        MutableLiveData<C74100T6i<List<C74125T7h>>> mutableLiveData = new MutableLiveData<>();
        this.LJLILLLLZI = mutableLiveData;
        this.LJLJI = mutableLiveData;
        MutableLiveData<C74100T6i<C76800UCe>> mutableLiveData2 = new MutableLiveData<>();
        this.LJLJJI = mutableLiveData2;
        this.LJLJJL = mutableLiveData2;
        MutableLiveData<C74100T6i<C76800UCe>> mutableLiveData3 = new MutableLiveData<>();
        this.LJLJJLL = mutableLiveData3;
        this.LJLJL = mutableLiveData3;
        MutableLiveData<C74100T6i<String>> mutableLiveData4 = new MutableLiveData<>();
        this.LJLJLJ = mutableLiveData4;
        this.LJLJLLL = mutableLiveData4;
        MutableLiveData<C74100T6i<C76800UCe>> mutableLiveData5 = new MutableLiveData<>();
        this.LJLL = mutableLiveData5;
        this.LJLLI = mutableLiveData5;
        MutableLiveData<C74100T6i<KKF>> mutableLiveData6 = new MutableLiveData<>();
        this.LJLLILLLL = mutableLiveData6;
        this.LJLLJ = mutableLiveData6;
        MutableLiveData<C74100T6i<C76800UCe>> mutableLiveData7 = new MutableLiveData<>();
        this.LJLLL = mutableLiveData7;
        this.LJLLLL = mutableLiveData7;
        this.LJLLLLLL = kkl.LIZJ;
        this.LJLZ = kkl.LIZIZ;
        this.LJZ = kkl.LIZLLL;
        this.LJZI = kkl.LJ;
    }

    @Override // X.T8G
    public final void KN(KKF kkf) {
        this.LJLLILLLL.setValue(new C74100T6i<>(kkf));
    }

    @Override // X.T8G
    public final void LLIIIL(String str) {
        boolean z;
        String newText = s.LLD(s.LJZL(str).toString()).toString();
        KKL kkl = this.LJLIL;
        kkl.getClass();
        o.LJIIIZ(newText, "newText");
        if (newText.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            kkl.LIZJ.setValue(new C74100T6i<>(kkl.LIZIZ(false)));
            XKQ xkq = kkl.LJIIIIZZ;
            if (xkq != null) {
                xkq.LIZIZ(null);
                return;
            }
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        kkl.LJFF = currentTimeMillis;
        List<KKM> list = kkl.LJII.get(newText);
        if (list != null) {
            try {
                kkl.LJ.postValue(new C74100T6i<>(new OSZ(KKR.SUCCESS, newText)));
                kkl.LIZ(new C74100T6i<>(new OSZ(list, newText)));
                return;
            } catch (Exception unused) {
                kkl.LIZJ(newText, KKR.FAILURE);
                return;
            }
        }
        XKX.LIZLLL(C48841JEv.LIZ(C78613UtF.LIZJ), null, null, new KKC(newText, kkl, currentTimeMillis, null), 3);
    }

    @Override // X.T8G
    public final void e50(String newText) {
        o.LJIIIZ(newText, "newText");
        this.LJLJLJ.setValue(new C74100T6i<>(newText));
    }

    @Override // X.T8G
    public final void ju0(String query) {
        o.LJIIIZ(query, "query");
        KKL kkl = this.LJLIL;
        kkl.getClass();
        kkl.LIZ.LIZIZ(query);
        kkl.LIZJ.setValue(new C74100T6i<>(kkl.LIZIZ(false)));
        XKQ xkq = kkl.LJIIIIZZ;
        if (xkq != null) {
            xkq.LIZIZ(null);
        }
    }
}
