package X;

import com.ss.android.ugc.aweme.relation.usercard.ability.AuthCardListScopeAbility;
import fjb.a;
import java.util.Iterator;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.relation.usercard.ability.AuthCardListScopeAbility$onAuthSynced$1", f = "AuthCardListScopeAbility.kt", l = {220, 222}, m = "invokeSuspend")
/* renamed from: X.MpP, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57991MpP extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ AuthCardListScopeAbility LJLILLLLZI;
    public final /* synthetic */ EnumC58046MqI LJLJI;
    public final /* synthetic */ boolean LJLJJI;
    public final /* synthetic */ boolean LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57991MpP(AuthCardListScopeAbility authCardListScopeAbility, EnumC58046MqI enumC58046MqI, boolean z, boolean z2, InterfaceC67352kd<? super C57991MpP> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = authCardListScopeAbility;
        this.LJLJI = enumC58046MqI;
        this.LJLJJI = z;
        this.LJLJJL = z2;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C57991MpP(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        int i;
        Object obj2;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i2 = this.LJLIL;
        if (i2 != 0) {
            if (i2 == 1 || i2 == 2) {
                C141335gf.LIZJ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj);
            AbstractC57896Mns LIZ = this.LJLILLLLZI.LIZ();
            if (!(LIZ instanceof MSJ)) {
                if ((LIZ instanceof C57873MnV) || (LIZ instanceof MLO)) {
                    this.LJLILLLLZI.LJII(this.LJLJI, this.LJLJJI);
                } else if (LIZ instanceof C58017Mpp) {
                    AuthCardListScopeAbility authCardListScopeAbility = this.LJLILLLLZI;
                    boolean z = this.LJLJJI;
                    boolean z2 = this.LJLJJL;
                    EnumC58046MqI enumC58046MqI = this.LJLJI;
                    this.LJLIL = 1;
                    if (authCardListScopeAbility.LJIIIIZZ(z, z2, enumC58046MqI, this) == enumC58928NAu) {
                        return enumC58928NAu;
                    }
                } else if ((LIZ instanceof C57888Mnk) || (LIZ instanceof C57889Mnl)) {
                    AuthCardListScopeAbility authCardListScopeAbility2 = this.LJLILLLLZI;
                    EnumC58046MqI enumC58046MqI2 = this.LJLJI;
                    boolean z3 = this.LJLJJI;
                    this.LJLIL = 2;
                    Integer remove = authCardListScopeAbility2.LJLLLL.remove(enumC58046MqI2);
                    if (remove != null) {
                        i = remove.intValue();
                    } else {
                        Iterator<InterfaceC57927MoN> it = authCardListScopeAbility2.LJLJI.LJIILLIIL().iterator();
                        i = 0;
                        while (true) {
                            if (it.hasNext()) {
                                InterfaceC57927MoN next = it.next();
                                if ((next instanceof C57900Mnw) && ((C57900Mnw) next).LJLIL == enumC58046MqI2) {
                                    break;
                                }
                                i++;
                            } else {
                                i = -1;
                                break;
                            }
                        }
                    }
                    if (z3 && i >= 0 && i <= authCardListScopeAbility2.LJLJI.LJII()) {
                        obj2 = authCardListScopeAbility2.LIZIZ(i, enumC58046MqI2, this);
                        if (obj2 != EnumC58928NAu.COROUTINE_SUSPENDED) {
                            obj2 = C76800UCe.LIZ;
                        }
                    } else {
                        authCardListScopeAbility2.LJII(enumC58046MqI2, z3);
                        obj2 = C76800UCe.LIZ;
                    }
                    if (obj2 == enumC58928NAu) {
                        return enumC58928NAu;
                    }
                } else if (LIZ instanceof C57845Mn3) {
                    AuthCardListScopeAbility authCardListScopeAbility3 = this.LJLILLLLZI;
                    boolean z4 = this.LJLJJI;
                    EnumC58046MqI enumC58046MqI3 = this.LJLJI;
                    if (!z4) {
                        authCardListScopeAbility3.getClass();
                    } else {
                        authCardListScopeAbility3.LJLJL.invoke();
                        authCardListScopeAbility3.LJII(enumC58046MqI3, true);
                    }
                }
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
