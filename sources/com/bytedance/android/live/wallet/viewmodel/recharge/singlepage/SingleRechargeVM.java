package com.bytedance.android.live.wallet.viewmodel.recharge.singlepage;

import X.C32537Cpp;
import X.C73039SlX;
import X.C75861Tpx;
import X.C77541Ubx;
import X.C77588Uci;
import X.C77591Ucl;
import X.C77626UdK;
import X.C77679UeB;
import X.CN1;
import X.InterfaceC77676Ue8;
import X.InterfaceC77748UfI;
import X.UIM;
import X.UIO;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.live.wallet.WalletCenter;
import com.bytedance.android.live.walletnew.BaseRechargeViewModel;
import com.bytedance.android.livesdk.wallet.Diamond;
import com.bytedance.android.livesdk.wallet.DiamondPackageExtra;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class SingleRechargeVM extends BaseRechargeViewModel {
    public final C77591Ucl LJLLL;
    public final DataChannel LJLLLL;
    public final DataChannel LJLLLLLL;
    public InterfaceC77676Ue8 LJLZ;
    public Diamond LJZ;
    public InterfaceC77748UfI LJZI;

    public final Diamond rv0() {
        Diamond diamond = this.LJZ;
        if (diamond != null) {
            return diamond;
        }
        o.LJIJI("recPackage");
        throw null;
    }

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        this.LJLZ = null;
    }

    @Override // com.bytedance.android.live.walletnew.BaseRechargeViewModel
    public final InterfaceC77748UfI jv0() {
        return this.LJZI;
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [X.UdK, O] */
    @Override // com.bytedance.android.live.walletnew.BaseRechargeViewModel
    public final void nv0(DiamondPackageExtra diamondPackageExtra, List<? extends Diamond> productList) {
        o.LJIIIZ(productList, "productList");
        if (diamondPackageExtra == null) {
            diamondPackageExtra = new DiamondPackageExtra();
        }
        ?? c77626UdK = new C77626UdK(diamondPackageExtra, productList);
        DataChannel dataChannel = this.LJLLLLLL;
        if (dataChannel != null) {
            ((C32537Cpp) dataChannel.gv0(C75861Tpx.class)).LIZ = c77626UdK;
        }
        long LIZ = ((WalletCenter) ((IWalletService) CN1.LIZ(IWalletService.class)).walletCenter()).LIZ();
        List<Diamond> list = c77626UdK.LJLIL;
        DiamondPackageExtra diamondPackageExtra2 = c77626UdK.LJLILLLLZI;
        C77591Ucl c77591Ucl = this.LJLLL;
        Diamond LIZJ = C77588Uci.LIZJ(list, diamondPackageExtra2, c77591Ucl.LJFF, c77591Ucl);
        if (LIZJ == null) {
            UIO.LIZIZ("ttlive_wallet_recharge_single_rec_package", new UIM("can't find recommend package"));
            InterfaceC77676Ue8 interfaceC77676Ue8 = this.LJLZ;
            if (interfaceC77676Ue8 != null) {
                interfaceC77676Ue8.df(0, 0, new C77679UeB("recommend package empty", 0));
                return;
            }
            return;
        }
        this.LJZ = LIZJ;
        C77541Ubx.LJIJJLI(this.LJLLL, this.LJLLLL, rv0(), true, this.LJLJL, false, false);
        InterfaceC77676Ue8 interfaceC77676Ue82 = this.LJLZ;
        if (interfaceC77676Ue82 == null) {
            return;
        }
        interfaceC77676Ue82.fb(new C73039SlX(rv0(), c77626UdK, LIZ));
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0043, code lost:
    
        if (r10 != null) goto L7;
     */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public SingleRechargeVM(X.C77591Ucl r9, com.bytedance.ies.sdk.datachannel.DataChannel r10, com.bytedance.ies.sdk.datachannel.DataChannel r11, X.InterfaceC77676Ue8 r12) {
        /*
            r8 = this;
            java.lang.String r0 = "rechargeConfig"
            kotlin.jvm.internal.o.LJIIIZ(r9, r0)
            r5 = 0
            if (r10 == 0) goto L41
            java.lang.Class<X.BCN> r0 = X.BCN.class
            java.lang.Object r0 = r10.kv0(r0)
            java.lang.Long r0 = (java.lang.Long) r0
            if (r0 == 0) goto L41
            long r3 = r0.longValue()
        L17:
            java.lang.Class<com.bytedance.android.livesdk.dataChannel.RoomChannel> r0 = com.bytedance.android.livesdk.dataChannel.RoomChannel.class
            java.lang.Object r0 = r10.kv0(r0)
            com.bytedance.android.livesdkapi.depend.model.live.Room r0 = (com.bytedance.android.livesdkapi.depend.model.live.Room) r0
            if (r0 == 0) goto L25
            long r5 = r0.getOwnerUserId()
        L25:
            int r7 = r9.LIZLLL
            r1 = r8
            r2 = r12
            r1.<init>(r2, r3, r5, r7)
            r1.LJLLL = r9
            r1.LJLLLL = r10
            r1.LJLLLLLL = r11
            r1.LJLZ = r2
            X.Udq r0 = X.C77658Udq.LJLIL
            X.C221108m2.LIZIZ(r0)
            X.Uco r0 = new X.Uco
            r0.<init>(r1)
            r1.LJZI = r0
            return
        L41:
            r3 = 0
            if (r10 == 0) goto L25
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.wallet.viewmodel.recharge.singlepage.SingleRechargeVM.<init>(X.Ucl, com.bytedance.ies.sdk.datachannel.DataChannel, com.bytedance.ies.sdk.datachannel.DataChannel, X.Ue8):void");
    }
}
