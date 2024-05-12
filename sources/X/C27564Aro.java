package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel;
import com.zhiliaoapp.musically.R;
import fjb.a;
import kotlin.jvm.internal.AqS178S0100000_12;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel$favoriteProduct$1$5", f = "PdpViewModel.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.Aro, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27564Aro extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ PdpViewModel LJLIL;
    public final /* synthetic */ View LJLILLLLZI;
    public final /* synthetic */ Response<Object> LJLJI;
    public final /* synthetic */ boolean LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27564Aro(PdpViewModel pdpViewModel, View view, Response<Object> response, boolean z, InterfaceC67352kd<? super C27564Aro> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = pdpViewModel;
        this.LJLILLLLZI = view;
        this.LJLJI = response;
        this.LJLJJI = z;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C27564Aro(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        String string;
        String string2;
        boolean z2;
        Integer num;
        View view;
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns;
        View view2;
        View findViewById;
        C141335gf.LIZJ(obj);
        PdpViewModel pdpViewModel = this.LJLIL;
        View view3 = this.LJLILLLLZI;
        Response<Object> response = this.LJLJI;
        if (response != null && response.isCodeOK()) {
            z = true;
        } else {
            z = false;
        }
        boolean z3 = this.LJLJJI;
        pdpViewModel.getClass();
        if (z) {
            C26059AKp.LIZ().LIZ("pdp_save_product", C27739Aud.LJI(C113554cx.LJJL(new OSZ("saved", Integer.valueOf(z3 ? 1 : 0)), new OSZ("pid", pdpViewModel.jw0()))));
            if (z3) {
                string2 = view3.getContext().getString(R.string.f9n);
            } else {
                string2 = view3.getContext().getString(R.string.f9r);
            }
            o.LJIIIIZZ(string2, "if (isFavorite) {\n      …ve_success)\n            }");
            if (C27566Arq.LIZ()) {
                if (z3) {
                    Context context = view3.getContext();
                    String Xv0 = pdpViewModel.Xv0();
                    C27565Arp c27565Arp = pdpViewModel.LLJLLL;
                    if (c27565Arp != null && (view2 = c27565Arp.LIZ.getView()) != null && (findViewById = view2.findViewById(R.id.isf)) != null) {
                        z2 = findViewById.canScrollVertically(-1);
                    } else {
                        z2 = false;
                    }
                    C27565Arp c27565Arp2 = pdpViewModel.LLJLLL;
                    if (c27565Arp2 != null) {
                        num = Integer.valueOf(c27565Arp2.LIZ.Kl());
                    } else {
                        num = null;
                    }
                    C27565Arp c27565Arp3 = pdpViewModel.LLJLLL;
                    if (c27565Arp3 != null) {
                        view = c27565Arp3.LIZ.LJLL;
                        viewGroup = c27565Arp3.LIZ();
                    } else {
                        view = null;
                        viewGroup = null;
                    }
                    C27565Arp c27565Arp4 = pdpViewModel.LLJLLL;
                    if (c27565Arp4 != null) {
                        viewGroup2 = c27565Arp4.LIZ();
                    } else {
                        viewGroup2 = null;
                    }
                    C27565Arp c27565Arp5 = pdpViewModel.LLJLLL;
                    if (c27565Arp5 != null) {
                        interfaceC88472Yns = c27565Arp5.LIZ.LJLLILLLL;
                    } else {
                        interfaceC88472Yns = null;
                    }
                    C238629Yc.LIZIZ(context, null, Xv0, z2, num, view, viewGroup, viewGroup2, interfaceC88472Yns);
                } else {
                    C26048AKe c26048AKe = new C26048AKe(view3);
                    c26048AKe.LJI(string2);
                    c26048AKe.LJII();
                }
            } else {
                C26048AKe c26048AKe2 = new C26048AKe(view3);
                c26048AKe2.LJI(string2);
                if (z3) {
                    c26048AKe2.LIZJ(R.raw.icon_tick_fill);
                    Context context2 = view3.getContext();
                    o.LJIIIIZZ(context2, "view.context");
                    c26048AKe2.LIZLLL(AnonymousClass636.LJIIIIZZ(R.attr.e8, context2));
                }
                c26048AKe2.LIZIZ(1000L);
                c26048AKe2.LJII();
            }
        } else {
            if (z3) {
                string = view3.getContext().getString(R.string.f9m);
            } else {
                string = view3.getContext().getString(R.string.f9q);
            }
            o.LJIIIIZZ(string, "if (isFavorite) {\n      …emove_fail)\n            }");
            if (C27566Arq.LIZ()) {
                C26048AKe c26048AKe3 = new C26048AKe(view3);
                c26048AKe3.LJI(string);
                c26048AKe3.LJII();
            } else {
                C26045AKb c26045AKb = new C26045AKb(view3);
                c26045AKb.LJIIIZ(string);
                c26045AKb.LJIIJ();
            }
        }
        Response<Object> response2 = this.LJLJI;
        if (response2 != null && response2.isCodeOK()) {
            this.LJLIL.LLIIZ = Boolean.valueOf(this.LJLJJI);
            PdpViewModel pdpViewModel2 = this.LJLIL;
            pdpViewModel2.setState(new AqS178S0100000_12(pdpViewModel2, 135));
            PdpViewModel pdpViewModel3 = this.LJLIL;
            boolean z4 = this.LJLJJI;
            pdpViewModel3.getClass();
            C78565UsT.LJJIJ(pdpViewModel3, C78613UtF.LIZJ, new C27559Arj(pdpViewModel3, z4, null));
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
