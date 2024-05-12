package X;

import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.tts.pdp.us.utils.PdpButtonActionHelper;
import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.tts.pdp.us.utils.PdpButtonActionHelper$addToCart$4$1", f = "PdpButtonActionHelper.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.Reo, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70074Reo extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ boolean LJLIL;
    public final /* synthetic */ View LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ PdpButtonActionHelper LJLJJI;
    public final /* synthetic */ Context LJLJJL;
    public final /* synthetic */ Object LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C70074Reo(boolean z, View view, String str, PdpButtonActionHelper pdpButtonActionHelper, Context context, Object obj, InterfaceC67352kd<? super C70074Reo> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = z;
        this.LJLILLLLZI = view;
        this.LJLJI = str;
        this.LJLJJI = pdpButtonActionHelper;
        this.LJLJJL = context;
        this.LJLJJLL = obj;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C70074Reo(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        if (!this.LJLIL) {
            C26049AKf.LIZ(this.LJLILLLLZI, this.LJLJI);
            return C76800UCe.LIZ;
        }
        PdpViewModel pdpViewModel = this.LJLJJI.LJLIL;
        Context context = this.LJLJJL;
        o.LJIIIIZZ(context, "context");
        pdpViewModel.Pv0(context, this.LJLILLLLZI, this.LJLJI, this.LJLJJLL, null);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
