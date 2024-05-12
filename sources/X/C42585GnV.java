package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.zhiliaoapp.musically.R;
import fjb.a;
import kotlin.jvm.internal.AqS138S0200000_7;
import kotlin.jvm.internal.AqS173S0100000_7;
import kotlin.jvm.internal.AqS33S1000000_10;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.anchor.service.ECommerceVideoService$checkECommerceToggleResult$1$2", f = "ECommerceVideoService.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.GnV, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42585GnV extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ Fragment LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C42585GnV(Fragment fragment, InterfaceC67352kd<? super C42585GnV> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = fragment;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C42585GnV(this.LJLIL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        C34K c34k = new C34K();
        Context requireContext = this.LJLIL.requireContext();
        o.LJIIIIZZ(requireContext, "fragment.requireContext()");
        C26227ARb c26227ARb = new C26227ARb(requireContext);
        c26227ARb.LJFF(this.LJLIL.getResources().getString(R.string.f7t));
        c26227ARb.LIZIZ(this.LJLIL.getResources().getString(R.string.f7s));
        UC0.LIZJ(c26227ARb, new AqS138S0200000_7(this.LJLIL, c34k, 59));
        c26227ARb.LIZJ(new AqS173S0100000_7(c34k, 234));
        c26227ARb.LJI().LIZLLL();
        C76542zS.LIZJ("tiktokec_popup_show", new AqS33S1000000_10("video_brand_organic_toggle", 4));
        LCW.LIZ().storeBoolean("key_ec_video_bo_tip_show", true);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
