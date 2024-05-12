package com.ss.android.ugc.aweme.prop.fragment.featurevideo.viewmodel;

import X.A2F;
import X.A2G;
import X.C243369gq;
import X.C243479h1;
import X.C33Q;
import X.C47704Ins;
import X.C55749LuL;
import X.C8HZ;
import X.EnumC243389gs;
import X.InterfaceC57784Mm4;
import X.InterfaceC67352kd;
import com.bytedance.ext_power_list.AssemListViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.ArrayList;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class FeaturedVideoAwemeListViewModel extends AssemListViewModel<C243479h1, InterfaceC57784Mm4, Long> {
    public final ArrayList<InterfaceC57784Mm4> LJLIL = new ArrayList<>();
    public final C55749LuL LJLILLLLZI;
    public Aweme LJLJI;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C33Q defaultState() {
        Aweme aweme;
        EnumC243389gs enumC243389gs = EnumC243389gs.DEFAULT;
        C243369gq c243369gq = (C243369gq) this.LJLILLLLZI.getValue();
        if (c243369gq != null) {
            aweme = c243369gq.LJLILLLLZI;
        } else {
            aweme = null;
        }
        return new C243479h1(enumC243389gs, aweme, 12);
    }

    public FeaturedVideoAwemeListViewModel() {
        Aweme aweme;
        C55749LuL c55749LuL = new C55749LuL(C47704Ins.LJFF(this, C243369gq.class, "hierarchy_data_feature_video"), true);
        this.LJLILLLLZI = c55749LuL;
        C243369gq c243369gq = (C243369gq) c55749LuL.getValue();
        if (c243369gq != null) {
            aweme = c243369gq.LJLILLLLZI;
        } else {
            aweme = null;
        }
        this.LJLJI = aweme;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0076 A[Catch: Exception -> 0x00d2, TryCatch #0 {Exception -> 0x00d2, blocks: (B:11:0x005b, B:12:0x005e, B:13:0x0060, B:15:0x0076, B:16:0x007c, B:18:0x0082, B:20:0x0094, B:22:0x0096, B:26:0x00aa), top: B:10:0x005b }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object gv0(X.InterfaceC67352kd<? super X.A2G<java.lang.Long>> r10) {
        /*
            Method dump skipped, instructions count: 257
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.prop.fragment.featurevideo.viewmodel.FeaturedVideoAwemeListViewModel.gv0(X.2kd):java.lang.Object");
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void newState(C8HZ<InterfaceC57784Mm4> newListState) {
        o.LJIIIZ(newListState, "newListState");
        setState(new AqS170S0100000_4(newListState, (C8HZ<InterfaceC57784Mm4>) 765));
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onRefresh(InterfaceC67352kd<? super A2G<Long>> interfaceC67352kd) {
        Aweme aweme;
        C243369gq c243369gq = (C243369gq) this.LJLILLLLZI.getValue();
        if (c243369gq != null && (aweme = c243369gq.LJLILLLLZI) != null) {
            setState(new AqS170S0100000_4(aweme, 1645));
            this.LJLJI = aweme;
        }
        return gv0(interfaceC67352kd);
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onLoadMore(Long l, InterfaceC67352kd<? super A2G<Long>> interfaceC67352kd) {
        l.longValue();
        return A2F.LIZIZ(A2G.LIZ);
    }
}
