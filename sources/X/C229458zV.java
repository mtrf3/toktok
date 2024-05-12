package X;

import com.ss.android.ugc.aweme.mix.mixdetail.viewmodel.MixVideosViewModel;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.mix.mixdetail.viewmodel.MixVideosViewModel$doRefreshOnPowerList$5$1$1", f = "MixVideosViewModel.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.8zV, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C229458zV extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ MixVideosViewModel LJLIL;
    public final /* synthetic */ XGX<C229538zd> LJLILLLLZI;
    public final /* synthetic */ C76732zl LJLJI;
    public final /* synthetic */ InterfaceC67352kd<A2G<Long>> LJLJJI;
    public final /* synthetic */ long LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C229458zV(MixVideosViewModel mixVideosViewModel, XGX<C229538zd> xgx, C76732zl c76732zl, InterfaceC67352kd<? super A2G<Long>> interfaceC67352kd, long j, InterfaceC67352kd<? super C229458zV> interfaceC67352kd2) {
        super(2, interfaceC67352kd2);
        this.LJLIL = mixVideosViewModel;
        this.LJLILLLLZI = xgx;
        this.LJLJI = c76732zl;
        this.LJLJJI = interfaceC67352kd;
        this.LJLJJL = j;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C229458zV(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        this.LJLIL.pv0(((C229538zd) ((XGW) this.LJLILLLLZI).LJ).LIZ, this.LJLJI.element, this.LJLJJI, new Long(this.LJLJJL));
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
