package com.ss.android.ugc.aweme.paidcontent.viewmodel;

import X.A1P;
import X.A22;
import X.A2G;
import X.C33Q;
import X.C47704Ins;
import X.C55749LuL;
import X.C8HZ;
import X.InterfaceC57784Mm4;
import X.InterfaceC67352kd;
import com.bytedance.ext_power_list.AssemListViewModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class SeriesListViewModel extends AssemListViewModel<A1P, SeriesItem, Integer> {
    public final C55749LuL LJLIL = new C55749LuL(C47704Ins.LIZLLL(this, A22.class, null), true);
    public List<SeriesItem> LJLILLLLZI = new ArrayList();
    public int LJLJI;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C33Q defaultState() {
        return new A1P(0);
    }

    public final A22 gv0() {
        return (A22) this.LJLIL.getValue();
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void newState(C8HZ<SeriesItem> newListState) {
        o.LJIIIZ(newListState, "newListState");
        setState(new AqS170S0100000_4(newListState, (C8HZ<InterfaceC57784Mm4>) 518));
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onRefresh(InterfaceC67352kd<? super A2G<Integer>> interfaceC67352kd) {
        return hv0(0, interfaceC67352kd);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00f9 A[Catch: ExecutionException -> 0x014d, TryCatch #0 {ExecutionException -> 0x014d, blocks: (B:11:0x007d, B:12:0x0080, B:14:0x0084, B:16:0x0088, B:17:0x0091, B:19:0x0097, B:22:0x00a4, B:25:0x00b7, B:31:0x00c2, B:32:0x00db, B:34:0x00f9, B:37:0x00ff, B:38:0x0109, B:40:0x0117, B:43:0x012d, B:45:0x00bd, B:50:0x0036, B:52:0x0042, B:53:0x006c), top: B:7:0x001c }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0117 A[Catch: ExecutionException -> 0x014d, TryCatch #0 {ExecutionException -> 0x014d, blocks: (B:11:0x007d, B:12:0x0080, B:14:0x0084, B:16:0x0088, B:17:0x0091, B:19:0x0097, B:22:0x00a4, B:25:0x00b7, B:31:0x00c2, B:32:0x00db, B:34:0x00f9, B:37:0x00ff, B:38:0x0109, B:40:0x0117, B:43:0x012d, B:45:0x00bd, B:50:0x0036, B:52:0x0042, B:53:0x006c), top: B:7:0x001c }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x012d A[Catch: ExecutionException -> 0x014d, TRY_LEAVE, TryCatch #0 {ExecutionException -> 0x014d, blocks: (B:11:0x007d, B:12:0x0080, B:14:0x0084, B:16:0x0088, B:17:0x0091, B:19:0x0097, B:22:0x00a4, B:25:0x00b7, B:31:0x00c2, B:32:0x00db, B:34:0x00f9, B:37:0x00ff, B:38:0x0109, B:40:0x0117, B:43:0x012d, B:45:0x00bd, B:50:0x0036, B:52:0x0042, B:53:0x006c), top: B:7:0x001c }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object hv0(int r15, X.InterfaceC67352kd<? super X.A2G<java.lang.Integer>> r16) {
        /*
            Method dump skipped, instructions count: 344
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.paidcontent.viewmodel.SeriesListViewModel.hv0(int, X.2kd):java.lang.Object");
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onLoadMore(Integer num, InterfaceC67352kd<? super A2G<Integer>> interfaceC67352kd) {
        return hv0(num.intValue(), interfaceC67352kd);
    }
}
