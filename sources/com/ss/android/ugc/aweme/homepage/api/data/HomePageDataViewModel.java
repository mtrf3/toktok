package com.ss.android.ugc.aweme.homepage.api.data;

import X.C108024Lu;
import X.C221108m2;
import X.C39181FZh;
import X.C54067LJv;
import X.C62822Ol8;
import X.C84163Sa;
import X.C84173Sb;
import X.C84183Sc;
import X.LMU;
import android.os.Message;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;

/* loaded from: classes10.dex */
public final class HomePageDataViewModel extends ViewModel {
    public static final /* synthetic */ int LJLZ = 0;
    public String LJLJJI;
    public Aweme LJLJJL;
    public String LJLJLJ;
    public Aweme LJLJLLL;
    public boolean LJLL;
    public final LMU LJLIL = new LMU();
    public final C39181FZh LJLILLLLZI = new C39181FZh();
    public final Message LJLJI = new Message();
    public final MutableLiveData<String> LJLJJLL = new MutableLiveData<>();
    public final MutableLiveData<String> LJLJL = new MutableLiveData<>();
    public int LJLLI = 1;
    public final C62822Ol8 LJLLILLLL = C221108m2.LIZIZ(C84183Sc.LJLIL);
    public final C62822Ol8 LJLLJ = C221108m2.LIZIZ(C108024Lu.LJLIL);
    public final C62822Ol8 LJLLL = C221108m2.LIZIZ(C84163Sa.LJLIL);
    public final C62822Ol8 LJLLLL = C221108m2.LIZIZ(C84173Sb.LJLIL);
    public final MutableLiveData<C54067LJv> LJLLLLLL = new MutableLiveData<>();

    public final String getEventType() {
        return this.LJLJJLL.getValue();
    }

    public final MutableLiveData<Integer> gv0() {
        return (MutableLiveData) this.LJLLL.getValue();
    }

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        ((LiveData) this.LJLLJ.getValue()).setValue(null);
    }

    public final void hv0(String str) {
        this.LJLJJLL.setValue(str);
    }
}
