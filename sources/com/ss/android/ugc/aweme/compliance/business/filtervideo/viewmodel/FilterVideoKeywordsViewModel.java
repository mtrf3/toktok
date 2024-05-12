package com.ss.android.ugc.aweme.compliance.business.filtervideo.viewmodel;

import X.C221108m2;
import X.C234129Gu;
import X.C234139Gv;
import X.C62822Ol8;
import X.C73969T1h;
import X.C76800UCe;
import X.C9G8;
import X.InterfaceC65784Pro;
import X.T16;
import Y.AfS53S0200000_4;
import Y.AfS56S0100000_4;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.ss.android.ugc.aweme.compliance.business.filtervideo.model.Keyword;
import java.util.List;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.AqS93S0300000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class FilterVideoKeywordsViewModel extends ViewModel {
    public final C62822Ol8 LJLIL = C221108m2.LIZIZ(C234139Gv.LJLIL);
    public final C62822Ol8 LJLILLLLZI = C221108m2.LIZIZ(C234129Gu.LJLIL);
    public final MutableLiveData<Integer> LJLJI = new MutableLiveData<>();
    public Keyword LJLJJI;

    public final void hv0() {
        this.LJLJI.setValue(0);
        C9G8 c9g8 = (C9G8) this.LJLIL.getValue();
        AqS170S0100000_4 aqS170S0100000_4 = new AqS170S0100000_4(this, 163);
        AqS154S0100000_4 aqS154S0100000_4 = new AqS154S0100000_4(this, 88);
        c9g8.getClass();
        c9g8.LIZIZ().getFilteredKeywords().LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS53S0200000_4(aqS170S0100000_4, aqS154S0100000_4, 20), new AfS56S0100000_4(aqS154S0100000_4, 84));
    }

    public final MutableLiveData<List<Keyword>> iv0() {
        return (MutableLiveData) this.LJLILLLLZI.getValue();
    }

    public final void gv0(Keyword keyword, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro2) {
        o.LJIIIZ(keyword, "keyword");
        C9G8 c9g8 = (C9G8) this.LJLIL.getValue();
        String text = keyword.text;
        AqS93S0300000_4 aqS93S0300000_4 = new AqS93S0300000_4(this, (FilterVideoKeywordsViewModel) interfaceC65784Pro, (InterfaceC65784Pro<C76800UCe>) keyword, (Keyword) 3);
        AqS154S0100000_4 aqS154S0100000_4 = new AqS154S0100000_4(interfaceC65784Pro2, (InterfaceC65784Pro<C76800UCe>) 87);
        c9g8.getClass();
        o.LJIIIZ(text, "text");
        c9g8.LIZIZ().deleteKeyword(text).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS53S0200000_4(aqS93S0300000_4, aqS154S0100000_4, 19), new AfS56S0100000_4(aqS154S0100000_4, 83));
    }
}
