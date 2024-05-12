package com.ss.android.ugc.aweme.topic.movie.favorite;

import X.A2G;
import X.C182337Dp;
import X.C184817Nd;
import X.C2050482y;
import X.C214188as;
import X.C33Q;
import X.C78404Ups;
import X.C7IA;
import X.C8HZ;
import X.InterfaceC67352kd;
import com.bytedance.ext_power_list.AssemListViewModel;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class MovieFavoriteListVM extends AssemListViewModel<C182337Dp, C184817Nd, Long> {
    public final C214188as LJLIL = C78404Ups.LIZJ(this, C7IA.LJLIL);

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C33Q defaultState() {
        return new C182337Dp(0);
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void newState(C8HZ<C184817Nd> newListState) {
        o.LJIIIZ(newListState, "newListState");
        setState(new AqS169S0100000_3(newListState, (C8HZ<C2050482y>) 494));
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onRefresh(InterfaceC67352kd<? super A2G<Long>> interfaceC67352kd) {
        return gv0(0L, interfaceC67352kd);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0068 A[Catch: Exception -> 0x00e6, LOOP:0: B:15:0x0062->B:17:0x0068, LOOP_END, TryCatch #0 {Exception -> 0x00e6, blocks: (B:13:0x004c, B:14:0x004f, B:15:0x0062, B:17:0x0068, B:19:0x00c9, B:21:0x00cd, B:23:0x00dc, B:26:0x0033), top: B:7:0x001d }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00cd A[Catch: Exception -> 0x00e6, TryCatch #0 {Exception -> 0x00e6, blocks: (B:13:0x004c, B:14:0x004f, B:15:0x0062, B:17:0x0068, B:19:0x00c9, B:21:0x00cd, B:23:0x00dc, B:26:0x0033), top: B:7:0x001d }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00dc A[Catch: Exception -> 0x00e6, TRY_LEAVE, TryCatch #0 {Exception -> 0x00e6, blocks: (B:13:0x004c, B:14:0x004f, B:15:0x0062, B:17:0x0068, B:19:0x00c9, B:21:0x00cd, B:23:0x00dc, B:26:0x0033), top: B:7:0x001d }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object gv0(long r17, X.InterfaceC67352kd<? super X.A2G<java.lang.Long>> r19) {
        /*
            Method dump skipped, instructions count: 241
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.topic.movie.favorite.MovieFavoriteListVM.gv0(long, X.2kd):java.lang.Object");
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final /* bridge */ /* synthetic */ Object onLoadMore(Long l, InterfaceC67352kd<? super A2G<Long>> interfaceC67352kd) {
        return gv0(l.longValue(), interfaceC67352kd);
    }
}
