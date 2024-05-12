package X;

import com.ss.android.ugc.aweme.mix.bottom.MixBottomBarVM;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.mix.bottom.MixBottomBarVM$preload$2$2", f = "MixBottomBarVM.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.8zq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C229668zq extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ MixBottomBarVM LJLIL;
    public final /* synthetic */ AbstractC72932td<C229708zu> LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C229668zq(MixBottomBarVM mixBottomBarVM, AbstractC72932td<C229708zu> abstractC72932td, InterfaceC67352kd<? super C229668zq> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = mixBottomBarVM;
        this.LJLILLLLZI = abstractC72932td;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C229668zq(this.LJLIL, this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        this.LJLIL.getClass();
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
