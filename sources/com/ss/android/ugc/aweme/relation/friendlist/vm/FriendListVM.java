package com.ss.android.ugc.aweme.relation.friendlist.vm;

import X.AbstractC57774Mlu;
import X.C162476Zf;
import X.C221108m2;
import X.C33Q;
import X.C57775Mlv;
import X.C57776Mlw;
import X.C57777Mlx;
import X.C57983MpH;
import X.C58761N4j;
import X.C62724OjY;
import X.C62822Ol8;
import X.C87973cn;
import X.C8HZ;
import X.EGV;
import X.InterfaceC57784Mm4;
import X.XKX;
import X.XMV;
import X.XMW;
import X.XMX;
import X.XMZ;
import com.ss.android.ugc.aweme.relation.friendlist.AbsFriendListVM;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AqS165S0100000_15;
import kotlin.jvm.internal.AqS167S0100000_1;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class FriendListVM extends AbsFriendListVM {
    public final C62822Ol8 LJLIL;

    public FriendListVM() {
        o.LJIIIZ(null, "listConfig");
        this.LJLIL = C221108m2.LIZIZ(new AqS165S0100000_15(this, 912));
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C33Q defaultState() {
        return new C87973cn(0);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final void onPrepared() {
        super.onPrepared();
        XKX.LIZLLL(getAssemVMScope(), null, null, new EGV(this, null), 3);
    }

    public final List<XMV<? extends XMZ>> gv0(List<? extends XMZ> list) {
        InterfaceC57784Mm4 xmx;
        ArrayList arrayList = new ArrayList();
        for (XMZ xmz : list) {
            if (xmz instanceof C62724OjY) {
                xmx = new XMX((C62724OjY) xmz);
            } else if (xmz instanceof C58761N4j) {
                xmx = new XMW((C58761N4j) xmz);
            }
            arrayList.add(xmx);
        }
        return arrayList;
    }

    public final AbstractC57774Mlu<InterfaceC57784Mm4> hv0(AbstractC57774Mlu<XMZ> abstractC57774Mlu) {
        if (abstractC57774Mlu instanceof C57983MpH) {
            C57983MpH c57983MpH = (C57983MpH) abstractC57774Mlu;
            return C57775Mlv.LIZLLL(null, c57983MpH.LIZJ, gv0(c57983MpH.LIZLLL));
        }
        if (abstractC57774Mlu instanceof C57776Mlw) {
            return C57775Mlv.LIZ(gv0(((C57776Mlw) abstractC57774Mlu).LIZIZ));
        }
        if (abstractC57774Mlu instanceof C57777Mlx) {
            return C57775Mlv.LIZJ(((C57777Mlx) abstractC57774Mlu).LIZIZ);
        }
        throw new C162476Zf();
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void newState(C8HZ<InterfaceC57784Mm4> newListState) {
        o.LJIIIZ(newListState, "newListState");
        setState(new AqS167S0100000_1(newListState, (C8HZ<InterfaceC57784Mm4>) 190));
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object whenRefresh(X.InterfaceC67352kd<? super X.AbstractC57774Mlu<X.InterfaceC57784Mm4>> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof X.XMS
            if (r0 == 0) goto L3e
            r5 = r7
            X.XMS r5 = (X.XMS) r5
            int r2 = r5.LJLJJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L3e
            int r2 = r2 - r1
            r5.LJLJJI = r2
        L12:
            java.lang.Object r4 = r5.LJLILLLLZI
            X.NAu r3 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r5.LJLJJI
            r2 = 1
            if (r0 == 0) goto L4c
            r1 = 2
            if (r0 == r2) goto L2c
            if (r0 != r1) goto L44
            com.ss.android.ugc.aweme.relation.friendlist.vm.FriendListVM r0 = r5.LJLIL
            X.C141335gf.LIZJ(r4)
        L25:
            X.Mlu r4 = (X.AbstractC57774Mlu) r4
            X.Mlu r0 = r0.hv0(r4)
            return r0
        L2c:
            com.ss.android.ugc.aweme.relation.friendlist.vm.FriendListVM r0 = r5.LJLIL
            X.C141335gf.LIZJ(r4)
            X.2ha r4 = (X.InterfaceC65462ha) r4
            r5.LJLIL = r0
            r5.LJLJJI = r1
            java.lang.Object r4 = X.V1M.LJJJJJL(r4, r5)
            if (r4 != r3) goto L25
            return r3
        L3e:
            X.XMS r5 = new X.XMS
            r5.<init>(r6, r7)
            goto L12
        L44:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L4c:
            X.C141335gf.LIZJ(r4)
            X.Ol8 r0 = r6.LJLIL
            java.lang.Object r0 = r0.getValue()
            r0.getClass()
            r5.LJLIL = r6
            r5.LJLJJI = r2
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.relation.friendlist.vm.FriendListVM.whenRefresh(X.2kd):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    /* renamed from: iv0, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object whenLoadMore(X.C72503Sct r7, X.InterfaceC67352kd<? super X.AbstractC57774Mlu<X.InterfaceC57784Mm4>> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof X.XMT
            if (r0 == 0) goto L3e
            r5 = r8
            X.XMT r5 = (X.XMT) r5
            int r2 = r5.LJLJJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L3e
            int r2 = r2 - r1
            r5.LJLJJI = r2
        L12:
            java.lang.Object r4 = r5.LJLILLLLZI
            X.NAu r3 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r5.LJLJJI
            r2 = 1
            if (r0 == 0) goto L4c
            r1 = 2
            if (r0 == r2) goto L2c
            if (r0 != r1) goto L44
            com.ss.android.ugc.aweme.relation.friendlist.vm.FriendListVM r0 = r5.LJLIL
            X.C141335gf.LIZJ(r4)
        L25:
            X.Mlu r4 = (X.AbstractC57774Mlu) r4
            X.Mlu r0 = r0.hv0(r4)
            return r0
        L2c:
            com.ss.android.ugc.aweme.relation.friendlist.vm.FriendListVM r0 = r5.LJLIL
            X.C141335gf.LIZJ(r4)
            X.2ha r4 = (X.InterfaceC65462ha) r4
            r5.LJLIL = r0
            r5.LJLJJI = r1
            java.lang.Object r4 = X.V1M.LJJJJJL(r4, r5)
            if (r4 != r3) goto L25
            return r3
        L3e:
            X.XMT r5 = new X.XMT
            r5.<init>(r6, r8)
            goto L12
        L44:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L4c:
            X.C141335gf.LIZJ(r4)
            X.Ol8 r0 = r6.LJLIL
            java.lang.Object r0 = r0.getValue()
            r0.getClass()
            r5.LJLIL = r6
            r5.LJLJJI = r2
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.relation.friendlist.vm.FriendListVM.whenLoadMore(X.Sct, X.2kd):java.lang.Object");
    }
}
