package X;

import com.ss.android.ugc.aweme.relation.api.MafUserApiService;
import com.ss.android.ugc.aweme.relation.model.RecUser;
import com.ss.android.ugc.aweme.relation.usercard.ability.UserCardListAbility;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.relation.usercard.ability.UserCardListAbility$removeItem$1", f = "UserCardListAbility.kt", l = {102}, m = "invokeSuspend")
/* renamed from: X.Mm7, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57787Mm7 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ InterfaceC57927MoN LJLILLLLZI;
    public final /* synthetic */ UserCardListAbility LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57787Mm7(InterfaceC57927MoN interfaceC57927MoN, UserCardListAbility userCardListAbility, InterfaceC67352kd<? super C57787Mm7> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = interfaceC57927MoN;
        this.LJLJI = userCardListAbility;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C57787Mm7(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        Object LIZ;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C141335gf.LIZJ(obj);
            } else {
                C141335gf.LIZJ(obj);
                RecUser recUser = (RecUser) this.LJLILLLLZI;
                MafUserApiService mafUserApiService = MafUserApiService.LIZIZ;
                this.LJLIL = 1;
                if (mafUserApiService.LIZ(recUser, null, EnumC46514INi.SCENE_CARD.getValue(), EnumC57697Mkf.DISLIKE_USER.getValue(), this) == enumC58928NAu) {
                    return enumC58928NAu;
                }
            }
            LIZ = C76800UCe.LIZ;
            C3C5.m7constructorimpl(LIZ);
        } catch (Throwable th) {
            LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
        }
        UserCardListAbility userCardListAbility = this.LJLJI;
        InterfaceC57927MoN interfaceC57927MoN = this.LJLILLLLZI;
        if (C3C5.m13isSuccessimpl(LIZ)) {
            userCardListAbility.mz((RecUser) interfaceC57927MoN);
        }
        Throwable m10exceptionOrNullimpl = C3C5.m10exceptionOrNullimpl(LIZ);
        if (m10exceptionOrNullimpl != null) {
            AYY.LIZ.getClass();
            AYY.LIZ("ListAbility", "dislike error", m10exceptionOrNullimpl);
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
