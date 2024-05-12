package X;

import com.ss.android.ugc.aweme.utils.ActivityStack;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.relation.follow.logic.RelationViewVM$followWithOfflineWrite$1$1$1", f = "RelationViewVM.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.Me8, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57292Me8 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ XGX<C57311MeR> LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57292Me8(XGX<C57311MeR> xgx, InterfaceC67352kd<? super C57292Me8> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = xgx;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C57292Me8(this.LJLIL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        C57293Me9.LIZ(ActivityStack.getTopActivity(), ((XGV) this.LJLIL).LIZLLL);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
