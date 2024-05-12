package X;

import android.widget.TextSwitcher;
import com.ss.android.ugc.aweme.ecommerce.fashionmall.ui.MallToolBarAssem;
import com.zhiliaoapp.musically.R;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.fashionmall.ui.MallToolBarAssem$startSearchWordAnimation$1$1", f = "MallToolBarAssem.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes9.dex */
public final class KHB extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ MallToolBarAssem LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KHB(MallToolBarAssem mallToolBarAssem, InterfaceC67352kd<? super KHB> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = mallToolBarAssem;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new KHB(this.LJLIL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        ((TextSwitcher) this.LJLIL._$_findCachedViewById(R.id.lly)).setText(this.LJLIL.LJLL);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
