package X;

import Y.AfS56S0100000_4;
import Y.IDuS75S0200000_4;
import Y.IDxS305S0100000_4;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.api.OrderSubmitApi;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.AddOnWriteImpressionRequest;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoRequest;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoResponse;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.CheckLawfulRequest;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.CreateOrderRequest;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.OrderShopRequestParam;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.SubmitQuitReasonRequest;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Ay6, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27954Ay6 extends AbstractC73313Spx {
    public static final HashMap<String, C27954Ay6> LJLJLJ = new HashMap<>();
    public final C62822Ol8 LJLILLLLZI = C221108m2.LIZIZ(C28028AzI.LJLIL);
    public C73411SrX LJLJI;
    public C84661XKn LJLJJI;
    public C84661XKn LJLJJL;
    public BillInfoRequest LJLJJLL;
    public BillInfoResponse LJLJL;

    public static void LLLLZIL(BillInfoRequest billInfoRequest) {
        if (billInfoRequest.getOrderShop() == null || billInfoRequest.getOrderShop().isEmpty()) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("orderShop is null ");
            LIZ.append(billInfoRequest);
            C78983UzD.LJIIZILJ(new RuntimeException(X1D.LIZIZ(LIZ)));
        }
    }

    public static Object LLLZIL(InterfaceC67352kd interfaceC67352kd) {
        C84654XKg c84654XKg = new C84654XKg(C78555UsJ.LJJII(interfaceC67352kd));
        OrderSubmitApi.LIZ.getClass();
        ((OrderSubmitApi) C27965AyH.LIZIZ.create(OrderSubmitApi.class)).getQuitReason(0).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LIZ(new IDxS305S0100000_4(c84654XKg, 9));
        return c84654XKg.LIZ();
    }

    public static Object LLLLZ(AddOnWriteImpressionRequest addOnWriteImpressionRequest, InterfaceC67352kd interfaceC67352kd) {
        C84654XKg c84654XKg = new C84654XKg(C78555UsJ.LJJII(interfaceC67352kd));
        OrderSubmitApi.LIZ.getClass();
        ((OrderSubmitApi) C27965AyH.LIZIZ.create(OrderSubmitApi.class)).addOnWriteImpression(addOnWriteImpressionRequest).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LIZ(new IDxS305S0100000_4(c84654XKg, 6));
        return c84654XKg.LIZ();
    }

    public static Object LLLLZLLIL(CheckLawfulRequest checkLawfulRequest, InterfaceC67352kd interfaceC67352kd) {
        C84654XKg c84654XKg = new C84654XKg(C78555UsJ.LJJII(interfaceC67352kd));
        OrderSubmitApi.LIZ.getClass();
        ((OrderSubmitApi) C27965AyH.LIZIZ.create(OrderSubmitApi.class)).checkLawful(checkLawfulRequest).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LIZ(new IDxS305S0100000_4(c84654XKg, 7));
        return c84654XKg.LIZ();
    }

    public static Object LLLLZLLLI(CreateOrderRequest createOrderRequest, InterfaceC67352kd interfaceC67352kd) {
        List<OrderShopRequestParam> list = createOrderRequest.orderShop;
        if (list == null || list.isEmpty()) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("orderShop is null ");
            LIZ.append(createOrderRequest);
            C78983UzD.LJIIZILJ(new RuntimeException(X1D.LIZIZ(LIZ)));
        }
        C84654XKg c84654XKg = new C84654XKg(C78555UsJ.LJJII(interfaceC67352kd));
        OrderSubmitApi.LIZ.getClass();
        ((OrderSubmitApi) C27965AyH.LIZIZ.create(OrderSubmitApi.class)).createOrder(createOrderRequest, C27965AyH.LIZIZ(createOrderRequest.LIZ)).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LIZ(new IDxS305S0100000_4(c84654XKg, 8));
        return c84654XKg.LIZ();
    }

    public static Object LLLZZ(SubmitQuitReasonRequest submitQuitReasonRequest, InterfaceC67352kd interfaceC67352kd) {
        C84654XKg c84654XKg = new C84654XKg(C78555UsJ.LJJII(interfaceC67352kd));
        OrderSubmitApi.LIZ.getClass();
        ((OrderSubmitApi) C27965AyH.LIZIZ.create(OrderSubmitApi.class)).submitQuitReason(submitQuitReasonRequest).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LIZ(new IDxS305S0100000_4(c84654XKg, 10));
        return c84654XKg.LIZ();
    }

    public final Object LLLZ(BillInfoRequest billInfoRequest, C27981AyX c27981AyX) {
        C73411SrX c73411SrX;
        if (C27927Axf.LIZ() && (c73411SrX = this.LJLJI) != null) {
            c73411SrX.dispose();
        }
        C84654XKg c84654XKg = new C84654XKg(C78555UsJ.LJJII(c27981AyX));
        this.LJLJI = (C73411SrX) ((R30) this.LJLILLLLZI.getValue()).LIZ(billInfoRequest).LJJL(T16.LIZ()).LJJJLIIL(new AfS56S0100000_4(c84654XKg, 74), new AfS56S0100000_4(c84654XKg, 75));
        return c84654XKg.LIZ();
    }

    public final Object LLLZI(BillInfoRequest req, C27982AyY c27982AyY) {
        C84654XKg c84654XKg = new C84654XKg(C78555UsJ.LJJII(c27982AyY));
        C27966AyI c27966AyI = (C27966AyI) this.LJLILLLLZI.getValue();
        c27966AyI.getClass();
        o.LJIIIZ(req, "req");
        C73428Sro LJJL = AbstractC73672Svk.LJIIJ(new IDuS75S0200000_4(c27966AyI, req, 0)).LJJJ(C73969T1h.LIZIZ()).LJIJJLI(C28016Az6.LJLIL).LJJL(T16.LIZ());
        C3C5.m7constructorimpl(LJJL);
        c84654XKg.resumeWith(LJJL);
        return c84654XKg.LIZ();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001b  */
    /* JADX WARN: Type inference failed for: r7v3, types: [X.Yns] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LLLZLZ(com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoRequest r6, kotlin.jvm.internal.AqS170S0100000_4 r7, X.InterfaceC67352kd r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof X.C27982AyY
            if (r0 == 0) goto L20
            r4 = r8
            X.AyY r4 = (X.C27982AyY) r4
            int r2 = r4.LJLJJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L20
            int r2 = r2 - r1
            r4.LJLJJI = r2
        L12:
            java.lang.Object r3 = r4.LJLILLLLZI
            X.NAu r2 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r1 = r4.LJLJJI
            r0 = 1
            if (r1 == 0) goto L2e
            if (r1 != r0) goto L26
            X.Yns r7 = r4.LJLIL
            goto L3c
        L20:
            X.AyY r4 = new X.AyY
            r4.<init>(r5, r8)
            goto L12
        L26:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2e:
            X.C141335gf.LIZJ(r3)
            r4.LJLIL = r7     // Catch: java.lang.Throwable -> L42
            r4.LJLJJI = r0     // Catch: java.lang.Throwable -> L42
            java.lang.Object r3 = r5.LLLZI(r6, r4)     // Catch: java.lang.Throwable -> L42
            if (r3 != r2) goto L3f
            return r2
        L3c:
            X.C141335gf.LIZJ(r3)     // Catch: java.lang.Throwable -> L42
        L3f:
            X.Svk r3 = (X.AbstractC73672Svk) r3     // Catch: java.lang.Throwable -> L42
            goto L47
        L42:
            r0 = move-exception
            r7.invoke(r0)
            r3 = 0
        L47:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C27954Ay6.LLLZLZ(com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoRequest, kotlin.jvm.internal.AqS170S0100000_4, X.2kd):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x00e7, code lost:
    
        if (r14 != null) goto L62;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LLLZL(java.util.HashMap r13, com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoResponse r14, boolean r15, boolean r16) {
        /*
            Method dump skipped, instructions count: 261
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C27954Ay6.LLLZL(java.util.HashMap, com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoResponse, boolean, boolean):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LLLZLL(com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoRequest r6, X.C28026AzG r7, X.InterfaceC88472Yns r8, X.InterfaceC67352kd r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof X.C27981AyX
            if (r0 == 0) goto L20
            r4 = r9
            X.AyX r4 = (X.C27981AyX) r4
            int r2 = r4.LJLJJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L20
            int r2 = r2 - r1
            r4.LJLJJI = r2
        L12:
            java.lang.Object r3 = r4.LJLILLLLZI
            X.NAu r2 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r1 = r4.LJLJJI
            r0 = 1
            if (r1 == 0) goto L2e
            if (r1 != r0) goto L26
            X.Yns r8 = r4.LJLIL
            goto L41
        L20:
            X.AyX r4 = new X.AyX
            r4.<init>(r5, r9)
            goto L12
        L26:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2e:
            X.C141335gf.LIZJ(r3)
            if (r7 == 0) goto L36
            r7.invoke()     // Catch: java.lang.Throwable -> L47
        L36:
            r4.LJLIL = r8     // Catch: java.lang.Throwable -> L47
            r4.LJLJJI = r0     // Catch: java.lang.Throwable -> L47
            java.lang.Object r3 = r5.LLLZ(r6, r4)     // Catch: java.lang.Throwable -> L47
            if (r3 != r2) goto L44
            return r2
        L41:
            X.C141335gf.LIZJ(r3)     // Catch: java.lang.Throwable -> L47
        L44:
            com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoResponse r3 = (com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoResponse) r3     // Catch: java.lang.Throwable -> L47
            goto L4c
        L47:
            r0 = move-exception
            r8.invoke(r0)
            r3 = 0
        L4c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C27954Ay6.LLLZLL(com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoRequest, X.AzG, X.Yns, X.2kd):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00f4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ec A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LLLZZIL(com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoRequest r16, boolean r17, java.util.HashMap<java.lang.String, java.lang.Object> r18, boolean r19, X.InterfaceC67352kd<? super com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoResponse> r20) {
        /*
            Method dump skipped, instructions count: 381
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C27954Ay6.LLLZZIL(com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoRequest, boolean, java.util.HashMap, boolean, X.2kd):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LLZILL(com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoRequest r12, boolean r13, java.util.HashMap<java.lang.String, java.lang.Object> r14, boolean r15, X.InterfaceC67352kd<? super X.AbstractC73672Svk<com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoResponse>> r16) {
        /*
            r11 = this;
            r3 = r16
            r7 = r14
            r8 = r15
            r9 = r13
            boolean r0 = r3 instanceof X.C27978AyU
            if (r0 == 0) goto La0
            r4 = r3
            X.AyU r4 = (X.C27978AyU) r4
            int r2 = r4.LJLJLJ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto La0
            int r2 = r2 - r1
            r4.LJLJLJ = r2
        L17:
            java.lang.Object r1 = r4.LJLJJLL
            X.NAu r3 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r4.LJLJLJ
            r5 = 0
            r2 = 1
            if (r0 == 0) goto L40
            if (r0 != r2) goto La7
            boolean r8 = r4.LJLJJL
            boolean r9 = r4.LJLJJI
            X.2mC r10 = r4.LJLJI
            java.lang.Object r7 = r4.LJLILLLLZI
            java.util.HashMap r7 = (java.util.HashMap) r7
            X.Ay6 r6 = r4.LJLIL
            X.C141335gf.LIZJ(r1)
        L32:
            X.Svk r1 = (X.AbstractC73672Svk) r1
            if (r1 == 0) goto L3f
            X.AyA r5 = new X.AyA
            r5.<init>(r6, r7, r8, r9, r10)
            X.Sri r5 = r1.LJIJJLI(r5)
        L3f:
            return r5
        L40:
            X.C141335gf.LIZJ(r1)
            LLLLZIL(r12)
            long r0 = android.os.SystemClock.elapsedRealtime()
            X.C27949Ay1.LJI = r0
            int r0 = X.C1DH.LJ(r7)
            X.AzZ r1 = new X.AzZ
            r1.<init>(r0, r7, r8)
            java.lang.String r0 = "rd_page_params_check"
            X.C76542zS.LIZJ(r0, r1)
            if (r9 == 0) goto L95
            java.lang.Integer r1 = new java.lang.Integer
            r0 = 0
            r1.<init>(r0)
            X.C27949Ay1.LJIIIZ(r1)
        L65:
            java.lang.String r0 = "biz_type"
            java.lang.Object r0 = r7.get(r0)
            if (r0 == 0) goto L93
            java.lang.String r0 = r0.toString()
        L71:
            r12.setBizType(r0)
            X.2mC r10 = new X.2mC
            r10.<init>()
            kotlin.jvm.internal.AqS170S0100000_4 r1 = new kotlin.jvm.internal.AqS170S0100000_4
            r0 = 911(0x38f, float:1.277E-42)
            r1.<init>(r10, r0)
            r4.LJLIL = r11
            r4.LJLILLLLZI = r7
            r4.LJLJI = r10
            r4.LJLJJI = r9
            r4.LJLJJL = r8
            r4.LJLJLJ = r2
            java.lang.Object r1 = r11.LLLZLZ(r12, r1, r4)
            if (r1 != r3) goto L9e
            return r3
        L93:
            r0 = r5
            goto L71
        L95:
            java.lang.Integer r0 = new java.lang.Integer
            r0.<init>(r2)
            X.C27949Ay1.LJIIIZ(r0)
            goto L65
        L9e:
            r6 = r11
            goto L32
        La0:
            X.AyU r4 = new X.AyU
            r4.<init>(r11, r3)
            goto L17
        La7:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C27954Ay6.LLZILL(com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoRequest, boolean, java.util.HashMap, boolean, X.2kd):java.lang.Object");
    }
}
