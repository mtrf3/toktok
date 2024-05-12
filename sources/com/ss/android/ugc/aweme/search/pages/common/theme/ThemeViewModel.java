package com.ss.android.ugc.aweme.search.pages.common.theme;

import X.C221108m2;
import X.C50240Jng;
import X.C51152K5s;
import X.C51153K5t;
import X.C51154K5u;
import X.C51155K5v;
import X.C51156K5w;
import X.C62822Ol8;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

/* loaded from: classes9.dex */
public final class ThemeViewModel extends ViewModel {
    public int LJLILLLLZI;
    public int LJLJI;
    public String LJLIL = "";
    public boolean LJLJJI = true;
    public final C62822Ol8 LJLJJL = C221108m2.LIZIZ(C51155K5v.LJLIL);
    public final C62822Ol8 LJLJJLL = C221108m2.LIZIZ(C51152K5s.LJLIL);
    public final C62822Ol8 LJLJL = C221108m2.LIZIZ(C51154K5u.LJLIL);
    public final C62822Ol8 LJLJLJ = C221108m2.LIZIZ(C51153K5t.LJLIL);
    public final C62822Ol8 LJLJLLL = C221108m2.LIZIZ(C51156K5w.LJLIL);

    public final MutableLiveData<C50240Jng> gv0() {
        return (MutableLiveData) this.LJLJLJ.getValue();
    }

    public final MutableLiveData<C50240Jng> hv0() {
        return (MutableLiveData) this.LJLJL.getValue();
    }

    public final MutableLiveData<String> iv0() {
        return (MutableLiveData) this.LJLJLLL.getValue();
    }
}
