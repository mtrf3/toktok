package com.ss.android.ugc.aweme.homepage.landing;

import X.C221108m2;
import X.C3EJ;
import X.C62822Ol8;
import X.C73411SrX;
import X.C73969T1h;
import X.C78613UtF;
import X.C84763XOl;
import X.XIC;
import X.XKQ;
import X.XKW;
import Y.AfS53S0100000_1;
import androidx.lifecycle.ViewModel;
import com.bytedance.hox.Hox;
import com.ss.android.ugc.aweme.homepage.ui.view.tab.HomeTabViewModel;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class ForceBackFYPViewModel extends ViewModel {
    public static final /* synthetic */ int LJLJLJ = 0;
    public final HomeTabViewModel LJLIL;
    public final Hox LJLILLLLZI;
    public final XKW LJLJI;
    public final long LJLJJI;
    public C73411SrX LJLJJL;
    public XKQ LJLJJLL;
    public final C62822Ol8 LJLJL;

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        C73411SrX c73411SrX = this.LJLJJL;
        if (c73411SrX != null) {
            c73411SrX.dispose();
        }
    }

    public ForceBackFYPViewModel(HomeTabViewModel homeTabViewModel, Hox hox) {
        XIC dispatcher = C78613UtF.LIZ;
        long longValue = ((Number) C3EJ.LIZ.getValue()).longValue();
        o.LJIIIZ(homeTabViewModel, "homeTabViewModel");
        o.LJIIIZ(dispatcher, "dispatcher");
        this.LJLIL = homeTabViewModel;
        this.LJLILLLLZI = hox;
        this.LJLJI = dispatcher;
        this.LJLJJI = longValue;
        this.LJLJL = C221108m2.LIZIZ(new AqS151S0100000_1(this, 836));
        this.LJLJJL = (C73411SrX) C84763XOl.LJI().LJJL(C73969T1h.LIZIZ()).LJJJJZI(new AfS53S0100000_1(this, 57));
    }
}
