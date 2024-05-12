package X;

import Y.AfS64S0100000_12;
import com.ss.android.ugc.effectmanager.effect.model.CategoryEffectModel;
import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.sticker.repository.internals.main.DefaultStickerSource$2$1$1$1", f = "DefaultStickerSource.kt", l = {127}, m = "invokeSuspend")
/* renamed from: X.TIk, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C74414TIk extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ CategoryEffectModel LJLILLLLZI;
    public final /* synthetic */ AfS64S0100000_12 LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C74414TIk(CategoryEffectModel categoryEffectModel, InterfaceC67352kd interfaceC67352kd, AfS64S0100000_12 afS64S0100000_12) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = categoryEffectModel;
        this.LJLJI = afS64S0100000_12;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> completion) {
        o.LJIIIZ(completion, "completion");
        return new C74414TIk(this.LJLILLLLZI, completion, this.LJLJI);
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
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
            C74418TIo c74418TIo = (C74418TIo) this.LJLJI.l0;
            CategoryEffectModel categoryEffectModel = this.LJLILLLLZI;
            this.LJLIL = 1;
            if (c74418TIo.LJIJI(categoryEffectModel, false, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return C76800UCe.LIZ;
    }
}
