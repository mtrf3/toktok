package X;

import android.view.View;
import com.zhiliaoapp.musically.R;
import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.base.pdpv2.viewmodel.PdpMainViewModel$favoriteProduct$1$6", f = "PdpMainViewModel.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.2sR, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C72192sR extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ boolean LJLIL;
    public final /* synthetic */ View LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C72192sR(View view, InterfaceC67352kd interfaceC67352kd, boolean z) {
        super(2, interfaceC67352kd);
        this.LJLIL = z;
        this.LJLILLLLZI = view;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C72192sR(this.LJLILLLLZI, interfaceC67352kd, this.LJLIL);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        String string;
        C141335gf.LIZJ(obj);
        if (this.LJLIL) {
            string = this.LJLILLLLZI.getContext().getString(R.string.f9m);
        } else {
            string = this.LJLILLLLZI.getContext().getString(R.string.f9q);
        }
        o.LJIIIIZZ(string, "if (isFavorite) {\n      …il)\n                    }");
        C26045AKb c26045AKb = new C26045AKb(this.LJLILLLLZI);
        c26045AKb.LJIIIZ(string);
        c26045AKb.LJIIJ();
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
