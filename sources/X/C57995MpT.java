package X;

import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.relation.usercard.ability.AuthCardListScopeAbility;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.relation.usercard.ability.AuthCardListScopeAbility$tryRouteFindFriendsPage$ffpVM$1", f = "AuthCardListScopeAbility.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.MpT, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57995MpT extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super InterfaceC58008Mpg>, Object> {
    public final /* synthetic */ AuthCardListScopeAbility LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57995MpT(AuthCardListScopeAbility authCardListScopeAbility, InterfaceC67352kd<? super C57995MpT> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = authCardListScopeAbility;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C57995MpT(this.LJLIL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        C58018Mpq c58018Mpq = InterfaceC58008Mpg.LJJZZIII;
        LifecycleOwner LIZLLL = C57898Mnu.LIZLLL(this.LJLIL.getConfig());
        c58018Mpq.getClass();
        return C77266UUc.LIZIZ.LJIIIIZZ(LIZLLL, "shared_from_ffp");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super InterfaceC58008Mpg> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
