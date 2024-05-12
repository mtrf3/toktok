package com.ss.android.ugc.aweme.following.ui.viewmodel;

import X.C34K;
import X.C52991Kqx;
import X.C53837LAz;
import X.C68322mC;
import X.C72896SjE;
import X.C72901SjJ;
import X.C72909SjR;
import X.C73411SrX;
import X.C77275UUl;
import X.EnumC56185M3h;
import X.EnumC72903SjL;
import X.HG3;
import X.LB2;
import X.TBT;
import X.TC3;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.ext.list.ListMiddleware;
import com.ss.android.ugc.aweme.following.model.FollowingItemList;
import com.ss.android.ugc.aweme.following.ui.viewmodel.FollowingRelationState;
import kotlin.jvm.internal.AqS116S0300000_12;
import kotlin.jvm.internal.AqS143S0200000_12;
import kotlin.jvm.internal.AqS175S0100000_9;
import kotlin.jvm.internal.AqS178S0100000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class FollowingRelationViewModel extends JediViewModel<FollowingRelationState> {
    public final TC3 LJLJJLL = new TC3();
    public boolean LJLJL = true;
    public final int LJLJLJ;
    public final ListMiddleware<FollowingRelationState, Object, C72909SjR> LJLJLLL;
    public int LJLL;

    @Override // com.bytedance.jedi.arch.JediViewModel
    public final FollowingRelationState kv0() {
        return new FollowingRelationState(null, null, false, null, null, false, 0, null, null, null, null, null, 0, 8191, null);
    }

    @Override // com.bytedance.jedi.arch.JediViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        setState(C72901SjJ.LJLIL);
        super.onCleared();
        C73411SrX c73411SrX = this.LJLJJLL.LJLJJLL;
        if (c73411SrX != null) {
            c73411SrX.dispose();
        }
        this.LJLJJLL.release();
    }

    public FollowingRelationViewModel() {
        this.LJLJLJ = HG3.LJIILL().isUidContactPermisioned() ? 1 : 2;
        this.LJLJLLL = new ListMiddleware<>(new AqS178S0100000_12(this, 204), new AqS178S0100000_12(this, 205), LB2.LJLIL, C53837LAz.LJLIL);
    }

    @Override // com.bytedance.jedi.arch.JediViewModel
    public final void onStart() {
        super.onStart();
        ListMiddleware<FollowingRelationState, Object, C72909SjR> listMiddleware = this.LJLJLLL;
        listMiddleware.LJ(new TBT() { // from class: X.SjM
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((FollowingRelationState) obj).getListState();
            }
        }, C72896SjE.LJLIL);
        iv0(listMiddleware);
        withState(new AqS175S0100000_9(this, 84));
    }

    public final int Hv0(boolean z) {
        if (!z && C77275UUl.LJIIIIZZ(2, 3).contains(Integer.valueOf(((Number) C52991Kqx.LIZ.getValue()).intValue()))) {
            return EnumC72903SjL.SOURCE_TYPE_BY_MAF_TOP.getValue();
        }
        return EnumC72903SjL.SOURCE_TYPE_BY_CREATE_TIME.getValue();
    }

    public final void Iv0(FollowingItemList followingItemList) {
        C34K c34k = new C34K();
        C68322mC c68322mC = new C68322mC();
        c68322mC.element = "";
        withState(new AqS143S0200000_12(c34k, (C34K) c68322mC, (C68322mC<String>) 44));
        setState(new AqS116S0300000_12(c34k, (C34K) followingItemList, (FollowingItemList) c68322mC, (C68322mC<String>) 12));
    }

    public final void Jv0(EnumC56185M3h reason) {
        o.LJIIIZ(reason, "reason");
        withState(new AqS178S0100000_12(reason, 206));
    }
}
