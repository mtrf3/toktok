package X;

import fjb.a;
import kotlin.jvm.internal.AqS55S0110000_13;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.setting.unit.privacy.SyncFBFriendsUnit$newAuthFlow$1", f = "SyncFBFriendsUnit.kt", l = {166}, m = "invokeSuspend")
/* renamed from: X.UTx, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77261UTx extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ UUC LJLJI;
    public final /* synthetic */ boolean LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C77261UTx(UUC uuc, boolean z, InterfaceC67352kd<? super C77261UTx> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = uuc;
        this.LJLJJI = z;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C77261UTx c77261UTx = new C77261UTx(this.LJLJI, this.LJLJJI, interfaceC67352kd);
        c77261UTx.LJLILLLLZI = obj;
        return c77261UTx;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        if (i != 0) {
            if (i == 1) {
                C141335gf.LIZJ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj);
            C3C3 LIZ = ((USE) C77125UOr.LJIIIIZZ(this.LJLJI.LJLJJL, new AqS55S0110000_13((InterfaceC70422pa) this.LJLILLLLZI, this.LJLJJI, 3))).LIZ();
            UU0 uu0 = new UU0(this.LJLJJI, this.LJLJI);
            this.LJLIL = 1;
            if (LIZ.collect(uu0, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
