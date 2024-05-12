package com.ss.android.ugc.aweme.topic.movie.detail.vm;

import X.C186007Rs;
import X.C186017Rt;
import X.C199427sA;
import X.C48841JEv;
import X.C76800UCe;
import X.C78613UtF;
import X.C7OG;
import X.C7OJ;
import X.C7PV;
import X.C7RN;
import X.InterfaceC65462ha;
import X.InterfaceC88472Yns;
import X.XIA;
import X.XKX;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.prefab.ability.FavoriteAbility;
import com.ss.android.ugc.aweme.topic.movie.detail.api.MovieDetailApi;
import com.ss.android.ugc.aweme.topic.movie.detail.vm.MovieDetailVM;
import com.ss.android.ugc.aweme.topic.movie.model.MovieDetail;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class MovieDetailVM extends AssemViewModel<C7RN> implements FavoriteAbility {
    public String LJLIL;
    public boolean LJLILLLLZI;
    public boolean LJLJI;
    public C186007Rs LJLJJI;

    @Override // com.ss.android.ugc.aweme.prefab.ability.FavoriteAbility
    public final void Tk0() {
        String str;
        boolean z;
        InterfaceC65462ha LIZIZ;
        MovieDetail LIZ = getState().LJLIL.LIZ();
        if (LIZ == null || (str = LIZ.title) == null) {
            str = "";
        }
        C7PV c7pv = C7PV.MOVIE;
        if (C7OG.LIZIZ(c7pv, gv0()) == null) {
            z = getState().LJLILLLLZI;
        } else {
            Boolean LIZIZ2 = C7OG.LIZIZ(c7pv, gv0());
            if (LIZIZ2 != null) {
                z = LIZIZ2.booleanValue();
            } else {
                z = getState().LJLILLLLZI;
            }
        }
        if (!z) {
            C199427sA c199427sA = MovieDetailApi.LIZ;
            String gv0 = gv0();
            c199427sA.getClass();
            LIZIZ = C199427sA.LIZ(gv0);
        } else {
            C199427sA c199427sA2 = MovieDetailApi.LIZ;
            String gv02 = gv0();
            c199427sA2.getClass();
            LIZIZ = C199427sA.LIZIZ(gv02);
        }
        XIA xia = C78613UtF.LIZJ;
        XKX.LIZLLL(C48841JEv.LIZ(xia), xia, null, new C186017Rt(LIZIZ, this, z, str, null), 2);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C7RN defaultState() {
        return new C7RN(0);
    }

    public final String gv0() {
        String str = this.LJLIL;
        if (str != null) {
            return str;
        }
        o.LJIJI("movieId");
        throw null;
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        C7OG.LIZJ(C7PV.BOOK, this.LJLJJI);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final void onPrepared() {
        super.onPrepared();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.7OJ, X.7Rs] */
    @Override // com.ss.android.ugc.aweme.prefab.ability.FavoriteAbility
    public final void ld(final InterfaceC88472Yns<? super Boolean, C76800UCe> subscriber) {
        o.LJIIIZ(subscriber, "subscriber");
        ?? r0 = new C7OJ() { // from class: X.7Rs
            @Override // X.C7OJ
            public final void LIZ(String id, boolean z) {
                o.LJIIIZ(id, "id");
                if (o.LJ(id, MovieDetailVM.this.gv0())) {
                    subscriber.invoke(Boolean.valueOf(z));
                }
            }
        };
        this.LJLJJI = r0;
        C7PV c7pv = C7PV.MOVIE;
        C7OG.LIZ(c7pv, r0);
        if (C7OG.LIZIZ(c7pv, gv0()) == null) {
            subscriber.invoke(Boolean.valueOf(getState().LJLILLLLZI));
            return;
        }
        Boolean LIZIZ = C7OG.LIZIZ(c7pv, gv0());
        if (LIZIZ == null) {
            return;
        }
        subscriber.invoke(Boolean.valueOf(LIZIZ.booleanValue()));
    }
}
