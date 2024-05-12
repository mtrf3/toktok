package X;

import com.ss.android.ugc.aweme.mix.mixdetail.viewmodel.MixVideosViewModel;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.mix.mixdetail.viewmodel.MixVideosViewModel$doRefresh$2$1$1", f = "MixVideosViewModel.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.8zX, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C229478zX extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ MixVideosViewModel LJLIL;
    public final /* synthetic */ XGX<C229538zd> LJLILLLLZI;
    public final /* synthetic */ C76732zl LJLJI;
    public final /* synthetic */ long LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C229478zX(MixVideosViewModel mixVideosViewModel, XGX<C229538zd> xgx, C76732zl c76732zl, long j, InterfaceC67352kd<? super C229478zX> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = mixVideosViewModel;
        this.LJLILLLLZI = xgx;
        this.LJLJI = c76732zl;
        this.LJLJJI = j;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C229478zX(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        this.LJLIL.qv0(((C229538zd) ((XGW) this.LJLILLLLZI).LJ).LIZ, this.LJLJI.element, new Long(this.LJLJJI));
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
