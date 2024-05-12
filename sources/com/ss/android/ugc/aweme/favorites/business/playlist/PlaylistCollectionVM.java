package com.ss.android.ugc.aweme.favorites.business.playlist;

import X.A2G;
import X.AnonymousClass880;
import X.AnonymousClass886;
import X.AnonymousClass889;
import X.C186897Vd;
import X.C2050482y;
import X.C33Q;
import X.C8HZ;
import X.InterfaceC67352kd;
import X.XKX;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.ext_power_list.AssemListViewModel;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class PlaylistCollectionVM extends AssemListViewModel<C186897Vd, AnonymousClass886, Integer> {
    public final AnonymousClass889 LJLIL = new AnonymousClass889();

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C33Q defaultState() {
        return new C186897Vd(0);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final void onPrepared() {
        super.onPrepared();
        XKX.LIZLLL(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass880(this, null), 3);
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void newState(C8HZ<AnonymousClass886> newListState) {
        o.LJIIIZ(newListState, "newListState");
        setState(new AqS169S0100000_3(newListState, (C8HZ<C2050482y>) 148));
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onRefresh(InterfaceC67352kd<? super A2G<Integer>> interfaceC67352kd) {
        return gv0(0, interfaceC67352kd);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object gv0(int r9, X.InterfaceC67352kd<? super X.A2G<java.lang.Integer>> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof X.AnonymousClass888
            if (r0 == 0) goto L90
            r6 = r10
            X.888 r6 = (X.AnonymousClass888) r6
            int r2 = r6.LJLJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L90
            int r2 = r2 - r1
            r6.LJLJI = r2
        L12:
            java.lang.Object r5 = r6.LJLIL
            X.NAu r4 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r6.LJLJI
            r3 = 1
            r2 = 2
            if (r0 == 0) goto L62
            if (r0 == r3) goto L82
            if (r0 != r2) goto Lcc
            X.C141335gf.LIZJ(r5)
        L23:
            X.XGX r5 = (X.XGX) r5
            boolean r0 = r5 instanceof X.XGW
            if (r0 == 0) goto Lb4
            X.XGW r5 = (X.XGW) r5
            D extends X.MfB r0 = r5.LJ
            X.88A r0 = (X.C88A) r0
            com.ss.android.ugc.aweme.favorites.business.playlist.model.GetPlaylistCollectionListResp r7 = r0.LIZ
            X.88E r6 = com.ss.android.ugc.aweme.favorites.business.playlist.PlaylistCollectionStateAgent.LJIJ()
            java.util.List<com.ss.android.ugc.aweme.favorites.business.playlist.model.MixInfo> r1 = r7.mixInfoList
            java.util.ArrayList r5 = new java.util.ArrayList
            r0 = 10
            int r0 = X.C32I.LJJL(r1, r0)
            r5.<init>(r0)
            java.util.Iterator r4 = r1.iterator()
        L46:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L97
            java.lang.Object r2 = r4.next()
            com.ss.android.ugc.aweme.favorites.business.playlist.model.MixInfo r2 = (com.ss.android.ugc.aweme.favorites.business.playlist.model.MixInfo) r2
            java.lang.String r1 = r2.id
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r6.LJIIJ(r0, r1)
            X.886 r0 = new X.886
            r0.<init>(r2)
            r5.add(r0)
            goto L46
        L62:
            X.C141335gf.LIZJ(r5)
            X.889 r0 = r8.LJLIL
            X.88D r0 = r0.LIZ
            r6.LJLJI = r3
            r0.getClass()
            X.XGL r1 = X.XGJ.LIZ()
            X.88B r0 = new X.88B
            r0.<init>(r9)
            X.XGR r0 = r1.LIZIZ(r0)
            X.2ha r5 = r0.LIZIZ()
            if (r5 != r4) goto L85
            return r4
        L82:
            X.C141335gf.LIZJ(r5)
        L85:
            X.2ha r5 = (X.InterfaceC65462ha) r5
            r6.LJLJI = r2
            java.lang.Object r5 = X.V1M.LJJJJJL(r5, r6)
            if (r5 != r4) goto L23
            return r4
        L90:
            X.888 r6 = new X.888
            r6.<init>(r8, r10)
            goto L12
        L97:
            boolean r0 = r7.hasMore
            if (r0 == 0) goto Laa
            X.A2F r2 = X.A2G.LIZ
            int r0 = r7.cursor
            java.lang.Integer r1 = new java.lang.Integer
            r1.<init>(r0)
            r0 = 0
            X.A2V r0 = X.A2F.LJ(r2, r0, r1, r5, r3)
            goto Lc5
        Laa:
            X.A2F r0 = X.A2G.LIZ
            r0.getClass()
            X.A2H r0 = X.A2F.LIZ(r5)
            goto Lc5
        Lb4:
            boolean r0 = r5 instanceof X.XGV
            if (r0 == 0) goto Lc6
            X.A2F r1 = X.A2G.LIZ
            X.XGV r5 = (X.XGV) r5
            X.MeH r0 = r5.LIZLLL
            r1.getClass()
            X.A2I r0 = X.A2F.LIZJ(r0)
        Lc5:
            return r0
        Lc6:
            X.6Zf r0 = new X.6Zf
            r0.<init>()
            throw r0
        Lcc:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.favorites.business.playlist.PlaylistCollectionVM.gv0(int, X.2kd):java.lang.Object");
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final /* bridge */ /* synthetic */ Object onLoadMore(Integer num, InterfaceC67352kd<? super A2G<Integer>> interfaceC67352kd) {
        return gv0(num.intValue(), interfaceC67352kd);
    }
}
