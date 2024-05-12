package X;

import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.ecommerce.base.pdpv2.viewmodel.PdpMainViewModel;
import com.ss.android.ugc.aweme.ecommerce.service.IEventCenter;
import com.zhiliaoapp.musically.R;
import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.base.pdpv2.viewmodel.PdpMainViewModel$favoriteProduct$1$5", f = "PdpMainViewModel.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.AuH, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27717AuH extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ boolean LJLIL;
    public final /* synthetic */ PdpMainViewModel LJLILLLLZI;
    public final /* synthetic */ View LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27717AuH(boolean z, PdpMainViewModel pdpMainViewModel, View view, InterfaceC67352kd<? super C27717AuH> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = z;
        this.LJLILLLLZI = pdpMainViewModel;
        this.LJLJI = view;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C27717AuH(this.LJLIL, this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        String string;
        C141335gf.LIZJ(obj);
        IEventCenter LIZ = C26059AKp.LIZ();
        String LIZJ = C75792yF.LIZJ(C113554cx.LJJL(new OSZ("saved", new Integer(this.LJLIL ? 1 : 0)), new OSZ("pid", this.LJLILLLLZI.iv0().LIZIZ())));
        o.LJIIIIZZ(LIZJ, "toJson(mapOf(\n          …                       ))");
        LIZ.LIZ("pdp_save_product", LIZJ);
        if (this.LJLIL) {
            string = this.LJLJI.getContext().getString(R.string.f9n);
        } else {
            string = this.LJLJI.getContext().getString(R.string.f9r);
        }
        o.LJIIIIZZ(string, "if (isFavorite) {\n      …ss)\n                    }");
        C26045AKb c26045AKb = new C26045AKb(this.LJLJI);
        c26045AKb.LJIIIZ(string);
        boolean z = this.LJLIL;
        View view = this.LJLJI;
        if (z) {
            c26045AKb.LJFF(R.raw.icon_tick_fill);
            Context context = view.getContext();
            o.LJIIIIZZ(context, "view.context");
            c26045AKb.LJI(AnonymousClass636.LJIIIIZZ(R.attr.e8, context));
        }
        c26045AKb.LIZLLL(1000L);
        c26045AKb.LJIIJ();
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
