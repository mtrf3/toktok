package X;

import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.pdp.repository.dto.PdpAddToShowcaseResponse;
import com.zhiliaoapp.musically.R;
import fjb.a;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel$addToShowcase$1$2", f = "PdpViewModel.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.Rcu, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69956Rcu extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ PdpViewModel LJLIL;
    public final /* synthetic */ C68322mC<PdpAddToShowcaseResponse> LJLILLLLZI;
    public final /* synthetic */ View LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C69956Rcu(PdpViewModel pdpViewModel, C68322mC<PdpAddToShowcaseResponse> c68322mC, View view, InterfaceC67352kd<? super C69956Rcu> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = pdpViewModel;
        this.LJLILLLLZI = c68322mC;
        this.LJLJI = view;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C69956Rcu(this.LJLIL, this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        Integer num;
        C141335gf.LIZJ(obj);
        this.LJLIL.setState(RWU.LJLIL);
        PdpAddToShowcaseResponse pdpAddToShowcaseResponse = this.LJLILLLLZI.element;
        if (pdpAddToShowcaseResponse == null || (num = pdpAddToShowcaseResponse.statusCode) == null || num.intValue() != 0) {
            this.LJLIL.Ew0(this.LJLJI);
        } else {
            C26045AKb c26045AKb = new C26045AKb(this.LJLJI);
            c26045AKb.LJFF(R.raw.icon_tick_fill_small);
            Context context = this.LJLJI.getContext();
            o.LJIIIIZZ(context, "view.context");
            c26045AKb.LJI(AnonymousClass636.LJIIIIZZ(R.attr.e8, context));
            c26045AKb.LJIIIIZZ(R.string.bg0);
            c26045AKb.LJIIJ();
            C70414RkI c70414RkI = this.LJLIL.LLFII;
            if (c70414RkI != null) {
                C70014Rdq c70014Rdq = new C70014Rdq();
                ConcurrentHashMap<String, Object> commonParams = c70414RkI.LIZIZ;
                o.LJIIIZ(commonParams, "commonParams");
                c70014Rdq.LIZIZ.putAll(commonParams);
                c70014Rdq.LIZIZ();
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
