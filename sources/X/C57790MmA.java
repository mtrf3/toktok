package X;

import com.ss.android.ugc.aweme.relation.model.RecUser;
import com.ss.android.ugc.aweme.relation.usercard.ability.UserCardListAbility;
import fjb.a;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.relation.usercard.ability.UserCardListAbility$onFollowUser$1", f = "UserCardListAbility.kt", l = {137}, m = "invokeSuspend")
/* renamed from: X.MmA, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57790MmA extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ UserCardListAbility LJLILLLLZI;
    public final /* synthetic */ RecUser LJLJI;
    public final /* synthetic */ ConcurrentHashMap<RecUser, AbstractC72932td<C76800UCe>> LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57790MmA(UserCardListAbility userCardListAbility, RecUser recUser, ConcurrentHashMap<RecUser, AbstractC72932td<C76800UCe>> concurrentHashMap, InterfaceC67352kd<? super C57790MmA> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = userCardListAbility;
        this.LJLJI = recUser;
        this.LJLJJI = concurrentHashMap;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C57790MmA(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, interfaceC67352kd);
    }

    /* JADX WARN: Multi-variable type inference failed */
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
                C57962Mow value = this.LJLILLLLZI.LJLJI.getValue();
                RecUser recUser = this.LJLJI;
                boolean z = this.LJLILLLLZI.LJLJJI;
                this.LJLIL = 1;
                obj = value.LJIILJJIL(recUser, z, this);
                if (obj == enumC58928NAu) {
                    return enumC58928NAu;
                }
            }
            LIZ = (List) obj;
            C3C5.m7constructorimpl(LIZ);
        } catch (Throwable th) {
            LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
        }
        ConcurrentHashMap<RecUser, AbstractC72932td<C76800UCe>> concurrentHashMap = this.LJLJJI;
        RecUser recUser2 = this.LJLJI;
        UserCardListAbility userCardListAbility = this.LJLILLLLZI;
        if (C3C5.m13isSuccessimpl(LIZ)) {
            concurrentHashMap.put(recUser2, new C72912tb(C76800UCe.LIZ));
            InterfaceC88471Ynr<RecUser, List<RecUser>, C76800UCe> interfaceC88471Ynr = userCardListAbility.LJLJJLL;
            if (interfaceC88471Ynr != 0) {
                interfaceC88471Ynr.invoke(recUser2, LIZ);
            }
        }
        RecUser recUser3 = this.LJLJI;
        Throwable m10exceptionOrNullimpl = C3C5.m10exceptionOrNullimpl(LIZ);
        if (m10exceptionOrNullimpl != null) {
            AYY ayy = AYY.LIZ;
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("insert the ");
            LIZ2.append(recUser3.getUid());
            LIZ2.append(" related user error");
            String LIZIZ = X1D.LIZIZ(LIZ2);
            ayy.getClass();
            AYY.LIZ("ListAbility", LIZIZ, m10exceptionOrNullimpl);
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
