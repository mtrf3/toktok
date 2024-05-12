package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.AnonymousClass057;
import X.C03720Cq;
import X.C07730Sb;
import X.C09330Yf;
import X.C0YW;
import X.C11850dJ;
import X.C16880lQ;
import X.C1HU;
import X.C24440xc;
import X.C24830yF;
import X.C32371Ov;
import X.C40431iJ;
import X.C46041rM;
import X.C56509MFt;
import X.C76800UCe;
import X.C78841Uwv;
import X.C78929UyL;
import X.C91671ZyN;
import X.C91856a1M;
import X.C91860a1Q;
import X.C91863a1T;
import X.C91864a1U;
import X.C91865a1V;
import X.C91901a25;
import X.C92054a4Y;
import X.C92145a61;
import X.C92795aGV;
import X.C92797aGX;
import X.C92805aGf;
import X.C92807aGh;
import X.C92818aGs;
import X.C93167aMV;
import X.InterfaceC03730Cr;
import X.InterfaceC06520Nk;
import X.InterfaceC07760Se;
import X.InterfaceC07790Sh;
import X.InterfaceC10180ac;
import X.InterfaceC24420xa;
import X.InterfaceC24520xk;
import X.InterfaceC24760y8;
import X.InterfaceC273215k;
import X.InterfaceC35811ar;
import X.InterfaceC88472Yns;
import X.InterfaceC88474Ynu;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.navigation.NavBackStackEntry;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.pipo.checkout.sdk.viewmodel.CheckoutUiState;
import com.bytedance.pipo.checkout.sdk.viewmodel.CheckoutViewModel;
import java.util.List;

/* loaded from: classes20.dex */
public class IDqS42S0300000_31 extends AbstractC65781Prl implements InterfaceC88474Ynu {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // X.InterfaceC88474Ynu
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2, obj3, obj4);
            case 1:
                return invoke$1(this, obj, obj2, obj3, obj4);
            case 2:
                return invoke$2(this, obj, obj2, obj3, obj4);
            case 3:
                return invoke$3(this, obj, obj2, obj3, obj4);
            case 4:
                return invoke$4(this, obj, obj2, obj3, obj4);
            case 5:
                return invoke$5(this, obj, obj2, obj3, obj4);
            case 6:
                return invoke$6(this, obj, obj2, obj3, obj4);
            default:
                return null;
        }
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public IDqS42S0300000_31(X.C92145a61 r3, com.bytedance.pipo.checkout.sdk.viewmodel.CheckoutUiState r4, com.bytedance.pipo.checkout.sdk.viewmodel.CheckoutViewModel r5, int r6) {
        /*
            r2 = this;
            r2.$t = r6
            switch(r6) {
                case 3: goto L11;
                case 4: goto L5;
                case 5: goto L11;
                default: goto L5;
            }
        L5:
            r1 = r2
            r1.l0 = r5
            r1.l1 = r4
            r1.l2 = r3
            r0 = 4
        Ld:
            r1.<init>(r0)
            return
        L11:
            r1 = r2
            r1.l0 = r4
            r1.l1 = r3
            r1.l2 = r5
            r0 = 4
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.IDqS42S0300000_31.<init>(X.a61, com.bytedance.pipo.checkout.sdk.viewmodel.CheckoutUiState, com.bytedance.pipo.checkout.sdk.viewmodel.CheckoutViewModel, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x0098, code lost:
    
        if (r6 == X.C24500xi.LIZIZ) goto L41;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void invoke$0(X.InterfaceC10180ac r9, int r10, X.InterfaceC24520xk r11, int r12) {
        /*
            r8 = this;
            java.lang.String r0 = "$this$items"
            kotlin.jvm.internal.o.LJIIIZ(r9, r0)
            r0 = r12 & 14
            r4 = r11
            if (r0 != 0) goto Lca
            boolean r0 = r4.LJIJJ(r9)
            if (r0 == 0) goto Lc7
            r3 = 4
        L11:
            r3 = r3 | r12
        L12:
            r0 = r12 & 112(0x70, float:1.57E-43)
            r2 = 16
            if (r0 != 0) goto L21
            boolean r0 = r4.LJIIIZ(r10)
            if (r0 == 0) goto Lc3
            r0 = 32
        L20:
            r3 = r3 | r0
        L21:
            r1 = r3 & 731(0x2db, float:1.024E-42)
            r0 = 146(0x92, float:2.05E-43)
            if (r1 != r0) goto L2d
            boolean r0 = r4.LIZ()
            if (r0 != 0) goto Lbf
        L2d:
            java.lang.Object r0 = r8.l0
            java.util.List r0 = (java.util.List) r0
            java.lang.Object r5 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r0, r10)
            r0 = r3 & 14
            r1 = r3 & 112(0x70, float:1.57E-43)
            r1 = r1 | r0
            java.lang.String r5 = (java.lang.String) r5
            r0 = r1 & 112(0x70, float:1.57E-43)
            if (r0 != 0) goto Lbd
            boolean r0 = r4.LJIIIZ(r10)
            if (r0 == 0) goto L48
            r2 = 32
        L48:
            r3 = r1 | r2
        L4a:
            r0 = r1 & 896(0x380, float:1.256E-42)
            if (r0 != 0) goto L57
            boolean r0 = r4.LJIJJ(r5)
            if (r0 == 0) goto Lba
            r0 = 256(0x100, float:3.59E-43)
        L56:
            r3 = r3 | r0
        L57:
            r0 = r3 & 5841(0x16d1, float:8.185E-42)
            r0 = r0 ^ 1168(0x490, float:1.637E-42)
            if (r0 != 0) goto L63
            boolean r0 = r4.LIZ()
            if (r0 != 0) goto Lb6
        L63:
            java.lang.Object r0 = r8.l1
            X.0y8 r0 = (X.InterfaceC24760y8) r0
            java.lang.Object r0 = r0.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            if (r10 != r0) goto Lb4
            r7 = 1
        L74:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r10)
            r0 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            r4.LJJIIJ(r0)
            java.lang.Object r0 = r8.l2
            X.Yns r0 = (X.InterfaceC88472Yns) r0
            boolean r1 = r4.LJIJJ(r0)
            boolean r0 = r4.LJIJJ(r2)
            r0 = r0 | r1
            java.lang.Object r6 = r4.LJIILL()
            if (r0 != 0) goto L9a
            X.0xi r0 = X.InterfaceC24520xk.LIZ
            r0.getClass()
            X.0xh r0 = X.C24500xi.LIZIZ
            if (r6 != r0) goto La6
        L9a:
            X.aAQ r6 = new X.aAQ
            java.lang.Object r0 = r8.l2
            X.Yns r0 = (X.InterfaceC88472Yns) r0
            r6.<init>(r0, r10)
            r4.LJJIII(r6)
        La6:
            r4.LJJIJIIJIL()
            X.Pro r6 = (X.InterfaceC65784Pro) r6
            int r0 = r3 >> 6
            r2 = r0 & 14
            r3 = 0
            X.C91736ZzQ.LIZ(r2, r3, r4, r5, r6, r7)
        Lb3:
            return
        Lb4:
            r7 = 0
            goto L74
        Lb6:
            r4.LIZLLL()
            goto Lb3
        Lba:
            r0 = 128(0x80, float:1.8E-43)
            goto L56
        Lbd:
            r3 = r1
            goto L4a
        Lbf:
            r4.LIZLLL()
            goto Lb3
        Lc3:
            r0 = 16
            goto L20
        Lc7:
            r3 = 2
            goto L11
        Lca:
            r3 = r12
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.IDqS42S0300000_31.invoke$0(X.0ac, int, X.0xk, int):void");
    }

    public final void invoke$1(InterfaceC06520Nk checkoutRoutePage, NavBackStackEntry it, InterfaceC24520xk interfaceC24520xk, int i) {
        Object LLJJIII;
        Intent intent;
        Uri data;
        o.LJIIIZ(checkoutRoutePage, "$this$checkoutRoutePage");
        o.LJIIIZ(it, "it");
        String str = null;
        try {
            Bundle bundle = it.LJLJI;
            if (bundle == null) {
                LLJJIII = null;
            } else {
                LLJJIII = C16880lQ.LLJJIII(bundle, "android-support-nav:controller:deepLinkIntent");
            }
            if ((LLJJIII instanceof Intent) && (intent = (Intent) LLJJIII) != null && (data = intent.getData()) != null) {
                str = UriProtector.getQueryParameter(data, "url");
            }
        } catch (Throwable unused) {
        }
        boolean displayDialogOnBack = ((CheckoutViewModel) this.l0).getUiState().getNavBarState().getDisplayDialogOnBack();
        String redirectUrl = ((CheckoutViewModel) this.l0).getRedirectUrl();
        boolean hideLoading = ((CheckoutViewModel) this.l0).getUiState().getNavBarState().getHideLoading();
        if (str != null) {
            redirectUrl = str;
        }
        C91860a1Q.LIZ(new C11850dJ(C91671ZyN.LIZ(interfaceC24520xk).LIZIZ), Boolean.TRUE, redirectUrl, hideLoading, new IDqS30S0300000_31((CheckoutViewModel) this.l0, (Context) this.l1, (C92145a61) this.l2, 4), new C93167aMV((CheckoutViewModel) this.l0), new IDqS174S0200000_31((C92145a61) this.l2, (CheckoutViewModel) this.l0, 15), interfaceC24520xk, 48, 0);
        C91863a1T.LIZ(displayDialogOnBack, ((CheckoutViewModel) this.l0).getEventSender(), new IDqS178S0200000_31((Context) this.l1, (CheckoutViewModel) this.l0, 13), interfaceC24520xk, 64);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS42S0300000_31(C1HU c1hu, InterfaceC35811ar interfaceC35811ar, InterfaceC35811ar interfaceC35811ar2, int i) {
        super(4);
        this.$t = i;
        this.l0 = c1hu;
        this.l1 = interfaceC35811ar;
        this.l2 = interfaceC35811ar2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS42S0300000_31(CheckoutUiState checkoutUiState, CheckoutViewModel checkoutViewModel, Context context, int i) {
        super(4);
        this.$t = i;
        this.l0 = checkoutUiState;
        this.l1 = checkoutViewModel;
        this.l2 = context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS42S0300000_31(CheckoutViewModel checkoutViewModel, Context context, C92145a61 c92145a61, int i) {
        super(4);
        this.$t = i;
        this.l0 = checkoutViewModel;
        this.l1 = context;
        this.l2 = c92145a61;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS42S0300000_31(List list, InterfaceC24760y8 interfaceC24760y8, InterfaceC88472Yns interfaceC88472Yns, int i, int i2) {
        super(4);
        this.$t = i2;
        this.l0 = list;
        this.l1 = interfaceC24760y8;
        this.l2 = interfaceC88472Yns;
    }

    public static /* bridge */ /* synthetic */ Object invoke$0(IDqS42S0300000_31 iDqS42S0300000_31, Object obj, Object obj2, Object obj3, Object obj4) {
        iDqS42S0300000_31.invoke$0((InterfaceC10180ac) obj, ((Number) obj2).intValue(), (InterfaceC24520xk) obj3, ((Number) obj4).intValue());
        return C76800UCe.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$1(IDqS42S0300000_31 iDqS42S0300000_31, Object obj, Object obj2, Object obj3, Object obj4) {
        iDqS42S0300000_31.invoke$1((InterfaceC06520Nk) obj, (NavBackStackEntry) obj2, (InterfaceC24520xk) obj3, ((Number) obj4).intValue());
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(IDqS42S0300000_31 iDqS42S0300000_31, Object checkoutRoutePage, Object it, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        o.LJIIIZ(checkoutRoutePage, "$this$checkoutRoutePage");
        o.LJIIIZ(it, "it");
        C91856a1M.LIZJ(((CheckoutUiState) iDqS42S0300000_31.l0).getPayResult(), ((CheckoutViewModel) iDqS42S0300000_31.l1).getEventSender(), ((CheckoutViewModel) iDqS42S0300000_31.l1).getConfiguration().LJIIIZ, new IDqS178S0200000_31((Context) iDqS42S0300000_31.l2, (CheckoutViewModel) iDqS42S0300000_31.l1, 15), (InterfaceC24520xk) obj, 64, 0);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$3(IDqS42S0300000_31 iDqS42S0300000_31, Object checkoutRoutePage, Object it, Object obj, Object obj2) {
        InterfaceC24520xk interfaceC24520xk = (InterfaceC24520xk) obj;
        ((Number) obj2).intValue();
        o.LJIIIZ(checkoutRoutePage, "$this$checkoutRoutePage");
        o.LJIIIZ(it, "it");
        InterfaceC07790Sh LJJJJLI = C78841Uwv.LJJJJLI(InterfaceC07790Sh.LJJJI, C78841Uwv.LJJIJIIJI(interfaceC24520xk));
        CheckoutUiState checkoutUiState = (CheckoutUiState) iDqS42S0300000_31.l0;
        C92145a61 c92145a61 = (C92145a61) iDqS42S0300000_31.l1;
        CheckoutViewModel checkoutViewModel = (CheckoutViewModel) iDqS42S0300000_31.l2;
        interfaceC24520xk.LJJIIJ(-483455358);
        C32371Ov c32371Ov = C0YW.LIZJ;
        InterfaceC07760Se.LJJJ.getClass();
        InterfaceC273215k LIZ = C09330Yf.LIZ(c32371Ov, C07730Sb.LJIILIIL, interfaceC24520xk);
        interfaceC24520xk.LJJIIJ(-1323940314);
        Object LJIILLIIL = interfaceC24520xk.LJIILLIIL(AnonymousClass057.LJ);
        Object LJIILLIIL2 = interfaceC24520xk.LJIILLIIL(AnonymousClass057.LJIIJ);
        Object LJIILLIIL3 = interfaceC24520xk.LJIILLIIL(AnonymousClass057.LJIILJJIL);
        InterfaceC03730Cr.LJ.getClass();
        C46041rM c46041rM = C03720Cq.LIZIZ;
        C40431iJ LJIIL = C56509MFt.LJIIL(LJJJJLI);
        if (interfaceC24520xk.LJJ() instanceof InterfaceC24420xa) {
            interfaceC24520xk.LJIJI();
            if (interfaceC24520xk.LJIJJLI()) {
                interfaceC24520xk.LJJI(c46041rM);
            } else {
                interfaceC24520xk.LIZIZ();
            }
            interfaceC24520xk.LJJIIZI();
            C24830yF.LIZ(interfaceC24520xk, LIZ, C03720Cq.LJ);
            C24830yF.LIZ(interfaceC24520xk, LJIILLIIL, C03720Cq.LIZLLL);
            C24830yF.LIZ(interfaceC24520xk, LJIILLIIL2, C03720Cq.LJFF);
            C24830yF.LIZ(interfaceC24520xk, LJIILLIIL3, C03720Cq.LJI);
            interfaceC24520xk.LJIIIIZZ();
            LJIIL.invoke(new C24440xc(interfaceC24520xk), interfaceC24520xk, 0);
            interfaceC24520xk.LJJIIJ(2058660585);
            interfaceC24520xk.LJJIIJ(-1163856341);
            C91865a1V.LIZ(checkoutUiState.getBizData().LJLJJL, checkoutUiState.getBizData().LJLJJLL, checkoutUiState.getBizData().LJLJJI, checkoutUiState.getSelectedMethod(), new C92795aGV(c92145a61), new C92797aGX(c92145a61), checkoutViewModel.getEventSender(), new IDqS441S0100000_31(checkoutViewModel, 5), interfaceC24520xk, 2101832);
            interfaceC24520xk.LJJIJIIJIL();
            interfaceC24520xk.LJJIJIIJIL();
            interfaceC24520xk.LJIJ();
            interfaceC24520xk.LJJIJIIJIL();
            interfaceC24520xk.LJJIJIIJIL();
            return C76800UCe.LIZ;
        }
        C78929UyL.LJIILJJIL();
        throw null;
    }

    public static final Object invoke$4(IDqS42S0300000_31 iDqS42S0300000_31, Object checkoutRoutePage, Object it, Object obj, Object obj2) {
        InterfaceC24520xk interfaceC24520xk = (InterfaceC24520xk) obj;
        ((Number) obj2).intValue();
        o.LJIIIZ(checkoutRoutePage, "$this$checkoutRoutePage");
        o.LJIIIZ(it, "it");
        InterfaceC07790Sh LJJJJLI = C78841Uwv.LJJJJLI(InterfaceC07790Sh.LJJJI, C78841Uwv.LJJIJIIJI(interfaceC24520xk));
        CheckoutViewModel checkoutViewModel = (CheckoutViewModel) iDqS42S0300000_31.l0;
        CheckoutUiState checkoutUiState = (CheckoutUiState) iDqS42S0300000_31.l1;
        C92145a61 c92145a61 = (C92145a61) iDqS42S0300000_31.l2;
        interfaceC24520xk.LJJIIJ(-483455358);
        C32371Ov c32371Ov = C0YW.LIZJ;
        InterfaceC07760Se.LJJJ.getClass();
        InterfaceC273215k LIZ = C09330Yf.LIZ(c32371Ov, C07730Sb.LJIILIIL, interfaceC24520xk);
        interfaceC24520xk.LJJIIJ(-1323940314);
        Object LJIILLIIL = interfaceC24520xk.LJIILLIIL(AnonymousClass057.LJ);
        Object LJIILLIIL2 = interfaceC24520xk.LJIILLIIL(AnonymousClass057.LJIIJ);
        Object LJIILLIIL3 = interfaceC24520xk.LJIILLIIL(AnonymousClass057.LJIILJJIL);
        InterfaceC03730Cr.LJ.getClass();
        C46041rM c46041rM = C03720Cq.LIZIZ;
        C40431iJ LJIIL = C56509MFt.LJIIL(LJJJJLI);
        if (interfaceC24520xk.LJJ() instanceof InterfaceC24420xa) {
            interfaceC24520xk.LJIJI();
            if (interfaceC24520xk.LJIJJLI()) {
                interfaceC24520xk.LJJI(c46041rM);
            } else {
                interfaceC24520xk.LIZIZ();
            }
            interfaceC24520xk.LJJIIZI();
            C24830yF.LIZ(interfaceC24520xk, LIZ, C03720Cq.LJ);
            C24830yF.LIZ(interfaceC24520xk, LJIILLIIL, C03720Cq.LIZLLL);
            C24830yF.LIZ(interfaceC24520xk, LJIILLIIL2, C03720Cq.LJFF);
            C24830yF.LIZ(interfaceC24520xk, LJIILLIIL3, C03720Cq.LJI);
            interfaceC24520xk.LJIIIIZZ();
            LJIIL.invoke(new C24440xc(interfaceC24520xk), interfaceC24520xk, 0);
            interfaceC24520xk.LJJIIJ(2058660585);
            interfaceC24520xk.LJJIIJ(-1163856341);
            C91901a25.LIZJ(C92054a4Y.LIZ("pipo_payin_total_amount_title", new String[0]), checkoutViewModel.formattedAmount(), false, interfaceC24520xk, 0, 4);
            C91865a1V.LIZ(checkoutUiState.getBizData().LJLJJL, checkoutUiState.getBizData().LJLJJLL, checkoutUiState.getBizData().LJLJJI, checkoutUiState.getSelectedMethod(), new C92805aGf(c92145a61), new C92807aGh(c92145a61), checkoutViewModel.getEventSender(), new IDqS441S0100000_31(checkoutViewModel, 6), interfaceC24520xk, 2101832);
            interfaceC24520xk.LJJIJIIJIL();
            interfaceC24520xk.LJJIJIIJIL();
            interfaceC24520xk.LJIJ();
            interfaceC24520xk.LJJIJIIJIL();
            interfaceC24520xk.LJJIJIIJIL();
            return C76800UCe.LIZ;
        }
        C78929UyL.LJIILJJIL();
        throw null;
    }

    public static final Object invoke$5(IDqS42S0300000_31 iDqS42S0300000_31, Object checkoutRoutePage, Object it, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        o.LJIIIZ(checkoutRoutePage, "$this$checkoutRoutePage");
        o.LJIIIZ(it, "it");
        C91864a1U.LIZJ(((CheckoutUiState) iDqS42S0300000_31.l0).getAssembleMethods(), ((CheckoutUiState) iDqS42S0300000_31.l0).getSelectedMethod(), new C92818aGs((C92145a61) iDqS42S0300000_31.l1), ((CheckoutViewModel) iDqS42S0300000_31.l2).getEventSender(), new IDqS418S0100000_31((CheckoutViewModel) iDqS42S0300000_31.l2, 76), (InterfaceC24520xk) obj, 4168);
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x005f, code lost:
    
        if (r3 == null) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$6(kotlin.jvm.internal.IDqS42S0300000_31 r5, java.lang.Object r6, java.lang.Object r7, java.lang.Object r8, java.lang.Object r9) {
        /*
            X.0Nk r6 = (X.InterfaceC06520Nk) r6
            X.0xk r8 = (X.InterfaceC24520xk) r8
            java.lang.Number r9 = (java.lang.Number) r9
            r9.intValue()
            java.lang.String r0 = "$this$AnimatedContent"
            kotlin.jvm.internal.o.LJIIIZ(r6, r0)
            java.lang.String r0 = "it"
            kotlin.jvm.internal.o.LJIIIZ(r7, r0)
            java.lang.Object r0 = r5.l1
            X.0y8 r0 = (X.InterfaceC24760y8) r0
            java.lang.Object r0 = r0.getValue()
            java.util.Set r0 = (java.util.Set) r0
            java.util.Iterator r2 = r0.iterator()
            r4 = 0
            r3 = r4
        L23:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L35
            java.lang.Object r1 = r2.next()
            boolean r0 = kotlin.jvm.internal.o.LJ(r7, r1)
            if (r0 == 0) goto L23
            r3 = r1
            goto L23
        L35:
            androidx.navigation.NavBackStackEntry r3 = (androidx.navigation.NavBackStackEntry) r3
            if (r3 != 0) goto L64
            java.lang.Object r0 = r5.l2
            X.0y8 r0 = (X.InterfaceC24760y8) r0
            java.lang.Object r1 = r0.getValue()
            java.util.List r1 = (java.util.List) r1
            int r0 = r1.size()
            java.util.ListIterator r2 = r1.listIterator(r0)
        L4b:
            boolean r0 = r2.hasPrevious()
            if (r0 == 0) goto L5c
            java.lang.Object r1 = r2.previous()
            boolean r0 = kotlin.jvm.internal.o.LJ(r7, r1)
            if (r0 == 0) goto L4b
            r4 = r1
        L5c:
            r3 = r4
            androidx.navigation.NavBackStackEntry r3 = (androidx.navigation.NavBackStackEntry) r3
            if (r3 != 0) goto L64
        L61:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L64:
            java.lang.Object r2 = r5.l0
            X.0MC r2 = (X.C0MC) r2
            kotlin.jvm.internal.IDqS190S0200000_31 r1 = new kotlin.jvm.internal.IDqS190S0200000_31
            r0 = 5
            r1.<init>(r3, r6, r0)
            r0 = -819904280(0xffffffffcf2140e8, float:-2.7053855E9)
            X.1iJ r1 = X.C1DJ.LJ(r8, r0, r1)
            r0 = 456(0x1c8, float:6.39E-43)
            X.C92019a3z.LIZ(r3, r2, r1, r8, r0)
            goto L61
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.IDqS42S0300000_31.invoke$6(kotlin.jvm.internal.IDqS42S0300000_31, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
