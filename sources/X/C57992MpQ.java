package X;

import com.ss.android.ugc.aweme.relation.usercard.ability.AuthCardListScopeAbility;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.relation.usercard.ability.AuthCardListScopeAbility$syncAuthDataByMyself$1", f = "AuthCardListScopeAbility.kt", l = {393, 394}, m = "invokeSuspend")
/* renamed from: X.MpQ, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57992MpQ extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ EnumC58046MqI LJLILLLLZI;
    public final /* synthetic */ AuthCardListScopeAbility LJLJI;
    public final /* synthetic */ boolean LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57992MpQ(EnumC58046MqI enumC58046MqI, AuthCardListScopeAbility authCardListScopeAbility, boolean z, InterfaceC67352kd<? super C57992MpQ> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = enumC58046MqI;
        this.LJLJI = authCardListScopeAbility;
        this.LJLJJI = z;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C57992MpQ(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        try {
            try {
            } catch (Throwable th) {
                C3C5.m7constructorimpl(C141335gf.LIZ(th));
            }
        } catch (Throwable th2) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th2));
        }
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C141335gf.LIZJ(obj);
                C3C5.m7constructorimpl(Boolean.valueOf(((Boolean) obj).booleanValue()));
                this.LJLJI.LJ(this.LJLILLLLZI, false, this.LJLJJI);
                return C76800UCe.LIZ;
            }
            C141335gf.LIZJ(obj);
            C3C5.m7constructorimpl(Boolean.valueOf(((Boolean) obj).booleanValue()));
            this.LJLJI.LJ(this.LJLILLLLZI, false, this.LJLJJI);
            return C76800UCe.LIZ;
        }
        C141335gf.LIZJ(obj);
        int i2 = C58002Mpa.LIZ[this.LJLILLLLZI.ordinal()];
        if (i2 != 1) {
            if (i2 == 2) {
                InterfaceC237529Tw interfaceC237529Tw = (InterfaceC237529Tw) this.LJLJI.LJLLL.getValue();
                EnumC58085Mqv LIZ = C58084Mqu.LIZ(this.LJLJI.getConfig().getTrackerConfig().LIZ);
                this.LJLIL = 2;
                obj = interfaceC237529Tw.LIZ(LIZ, this);
                if (obj == enumC58928NAu) {
                    return enumC58928NAu;
                }
                C3C5.m7constructorimpl(Boolean.valueOf(((Boolean) obj).booleanValue()));
            }
            this.LJLJI.LJ(this.LJLILLLLZI, false, this.LJLJJI);
            return C76800UCe.LIZ;
        }
        InterfaceC237509Tu interfaceC237509Tu = (InterfaceC237509Tu) this.LJLJI.LJLLJ.getValue();
        EnumC58085Mqv LIZ2 = C58084Mqu.LIZ(this.LJLJI.getConfig().getTrackerConfig().LIZ);
        this.LJLIL = 1;
        obj = interfaceC237509Tu.LIZ(LIZ2, this);
        if (obj == enumC58928NAu) {
            return enumC58928NAu;
        }
        C3C5.m7constructorimpl(Boolean.valueOf(((Boolean) obj).booleanValue()));
        this.LJLJI.LJ(this.LJLILLLLZI, false, this.LJLJJI);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
