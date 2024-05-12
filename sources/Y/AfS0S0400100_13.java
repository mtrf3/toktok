package Y;

import X.C276516r;
import X.C38393F4z;
import X.C77626UdK;
import X.C77661Udt;
import X.C77744UfE;
import X.CN1;
import X.ED5;
import X.EnumC77641UdZ;
import X.EnumC77742UfC;
import X.InterfaceC64592gB;
import X.InterfaceC76768UAy;
import X.InterfaceC77663Udv;
import X.InterfaceC77664Udw;
import X.InterfaceC77746UfG;
import X.U6Y;
import X.U7F;
import X.U7V;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser;
import com.bytedance.android.livesdk.wallet.Diamond;
import com.bytedance.android.livesdk.wallet.DiamondPackageExtra;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public class AfS0S0400100_13 implements InterfaceC64592gB {
    public final int $t;
    public long j4;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                return;
            case 1:
                accept$1(this, obj);
                return;
            case 2:
                accept$2(this, obj);
                return;
            case 3:
                accept$3(this, obj);
                return;
            default:
                return;
        }
    }

    public static final void accept$0(AfS0S0400100_13 afS0S0400100_13, Object obj) {
        Integer num;
        Diamond next;
        C77626UdK c77626UdK = (C77626UdK) obj;
        ((HashMap) afS0S0400100_13.l0).put("cost", Long.valueOf(System.currentTimeMillis() - afS0S0400100_13.j4));
        ((HashMap) afS0S0400100_13.l0).put("hit_cache", Integer.valueOf(c77626UdK.LJLJJI ? 1 : 0));
        ((HashMap) afS0S0400100_13.l0).put("cache_policy", ((EnumC77641UdZ) afS0S0400100_13.l1).toString());
        C77661Udt c77661Udt = (C77661Udt) afS0S0400100_13.l2;
        CompletionBlock completionBlock = (CompletionBlock) afS0S0400100_13.l3;
        List<Diamond> list = c77626UdK.LJLIL;
        DiamondPackageExtra diamondPackageExtra = c77626UdK.LJLILLLLZI;
        HashMap hashMap = (HashMap) afS0S0400100_13.l0;
        c77661Udt.getClass();
        if (list == null || list.isEmpty()) {
            C77661Udt.LJII(completionBlock, new Exception("product list is empty"), hashMap);
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<Diamond> it = list.iterator();
        while (true) {
            num = null;
            if (!it.hasNext()) {
                break;
            }
            Diamond next2 = it.next();
            InterfaceC77664Udw interfaceC77664Udw = (InterfaceC77664Udw) ED5.LIZJ(InterfaceC77664Udw.class, null);
            interfaceC77664Udw.setPrice(next2.price);
            interfaceC77664Udw.setDiamondId(Integer.valueOf(next2.id));
            interfaceC77664Udw.setIapId(next2.iapId);
            interfaceC77664Udw.setDiamondCount(Integer.valueOf(next2.count));
            interfaceC77664Udw.setGivingCount(Integer.valueOf(next2.givingCount));
            arrayList.add(interfaceC77664Udw);
        }
        if (diamondPackageExtra != null) {
            Iterator<Diamond> it2 = list.iterator();
            while (it2.hasNext()) {
                next = it2.next();
                if (diamondPackageExtra.RecommendedPacketId == next.id && next.LJLIL == 0) {
                    break;
                }
            }
        }
        next = null;
        InterfaceC77663Udv interfaceC77663Udv = (InterfaceC77663Udv) ED5.LIZJ(InterfaceC77663Udv.class, null);
        interfaceC77663Udv.setPackageInfo(arrayList);
        if (next != null) {
            num = Integer.valueOf(next.id);
        }
        interfaceC77663Udv.setRecommendId(num);
        InterfaceC77746UfG walletMonitorService = ((IWalletService) CN1.LIZ(IWalletService.class)).getWalletMonitorService();
        o.LJIIIIZZ(walletMonitorService, "getService(IWalletServic…ava).walletMonitorService");
        C77744UfE.LIZ(walletMonitorService, EnumC77742UfC.BOTH, "livesdk_wallet_recharge_panel_load_package_success", C38393F4z.LIZLLL(hashMap), 56);
        completionBlock.onSuccess(interfaceC77663Udv, "");
    }

    public static final void accept$1(AfS0S0400100_13 afS0S0400100_13, Object obj) {
        Throwable it = (Throwable) obj;
        ((HashMap) afS0S0400100_13.l0).put("cost", Long.valueOf(System.currentTimeMillis() - afS0S0400100_13.j4));
        ((HashMap) afS0S0400100_13.l0).put("cache_policy", ((EnumC77641UdZ) afS0S0400100_13.l1).toString());
        C77661Udt c77661Udt = (C77661Udt) afS0S0400100_13.l2;
        CompletionBlock completionBlock = (CompletionBlock) afS0S0400100_13.l3;
        o.LJIIIIZZ(it, "it");
        HashMap hashMap = (HashMap) afS0S0400100_13.l0;
        c77661Udt.getClass();
        C77661Udt.LJII(completionBlock, it, hashMap);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0054, code lost:
    
        if (r1 != null) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void accept$2(Y.AfS0S0400100_13 r5, java.lang.Object r6) {
        /*
            X.UBW r6 = (X.UBW) r6
            java.lang.Object r0 = r5.l0
            X.U7F r0 = (X.U7F) r0
            X.U7H r1 = r0.LJJIIJZLJL()
            java.lang.Object r0 = r5.l1
            com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser r0 = (com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser) r0
            r1.LJJLIIIJJIZ(r0)
            java.lang.Object r0 = r5.l0
            X.U7F r0 = (X.U7F) r0
            X.U7H r1 = r0.LJJIIJZLJL()
            java.lang.Object r0 = r5.l2
            com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser r0 = (com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser) r0
            r1.LJJLIIIJJI(r0)
            java.lang.Object r4 = r5.l3
            X.UAy r4 = (X.InterfaceC76768UAy) r4
            if (r4 == 0) goto L60
            java.lang.Object r0 = r5.l0
            X.U7F r0 = (X.U7F) r0
            long r2 = r5.j4
            r0.LJJIIJ(r2)
            java.util.concurrent.CopyOnWriteArrayList<X.U6Y> r0 = r0.LJIIZILJ
            java.util.Iterator r1 = r0.iterator()
        L35:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L45
            java.lang.Object r0 = r1.next()
            X.U6Y r0 = (X.U6Y) r0
            r0.LJJJJI(r2)
            goto L35
        L45:
            java.lang.Object r1 = r6.LIZ
            boolean r0 = r1 instanceof X.C28467BFf
            r2 = 0
            if (r0 == 0) goto L56
            if (r1 == 0) goto L61
            com.bytedance.android.live.network.response.BaseResponse r1 = (com.bytedance.android.live.network.response.BaseResponse) r1
            if (r1 == 0) goto L56
            java.lang.String r1 = r1.LIZIZ
            if (r1 != 0) goto L58
        L56:
            java.lang.String r1 = ""
        L58:
            com.bytedance.android.livesdk.comp.api.linkcore.model.CancelApplyResult r0 = new com.bytedance.android.livesdk.comp.api.linkcore.model.CancelApplyResult
            r0.<init>(r2, r1)
            r4.LIZIZ(r0)
        L60:
            return
        L61:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r0 = "null cannot be cast to non-null type com.bytedance.android.live.network.response.Response<com.bytedance.android.livesdk.chatroom.model.interact.CancelResponse?>"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AfS0S0400100_13.accept$2(Y.AfS0S0400100_13, java.lang.Object):void");
    }

    public static final void accept$3(AfS0S0400100_13 afS0S0400100_13, Object obj) {
        Throwable throwable = (Throwable) obj;
        if (!(throwable instanceof C276516r) || ((C276516r) throwable).getErrorCode() != 4004255) {
            ((U7F) afS0S0400100_13.l0).LJJIIJZLJL().LJJLIIIJJIZ((LinkUser) afS0S0400100_13.l1);
            ((U7F) afS0S0400100_13.l0).LJJIIJZLJL().LJJLIIIJJI((LinkUser) afS0S0400100_13.l2);
            if (((InterfaceC76768UAy) afS0S0400100_13.l3) != null) {
                U7F u7f = (U7F) afS0S0400100_13.l0;
                long j = afS0S0400100_13.j4;
                u7f.LJJIIJ(j);
                Iterator<U6Y> it = u7f.LJIIZILJ.iterator();
                while (it.hasNext()) {
                    it.next().LJJJJI(j);
                }
            }
        }
        o.LJIIIIZZ(throwable, "throwable");
        U7V.LJIIJJI(throwable, (InterfaceC76768UAy) afS0S0400100_13.l3);
    }

    public AfS0S0400100_13(Object obj, long j, Object obj2, Object obj3, Object obj4, int i) {
        this.$t = i;
        this.l0 = obj;
        this.j4 = j;
        this.l1 = obj2;
        this.l2 = obj3;
        this.l3 = obj4;
    }
}
