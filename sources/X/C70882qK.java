package X;

import Y.IDfS21S0200000_1;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import fjb.a;
import kotlin.jvm.internal.AqS167S0100000_1;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.casting.manager.core.CastingManager$startBrowseService$1", f = "CastingManager.kt", l = {715}, m = "invokeSuspend")
/* renamed from: X.2qK, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C70882qK extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ C71052qb LJLILLLLZI;
    public final /* synthetic */ Aweme LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C70882qK(C71052qb c71052qb, Aweme aweme, InterfaceC67352kd<? super C70882qK> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c71052qb;
        this.LJLJI = aweme;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C70882qK(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        XLM xlm;
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
            C71052qb c71052qb = this.LJLILLLLZI;
            if (c71052qb.LIZJ) {
                XKX.LIZLLL(c71052qb.LJFF(), null, null, new C70872qJ(c71052qb, true, null), 3);
                xlm = c71052qb.LJIIIZ;
            } else {
                F6I.LIZJ(new AqS167S0100000_1(c71052qb, 34));
                xlm = c71052qb.LJIIIZ;
            }
            IDfS21S0200000_1 iDfS21S0200000_1 = new IDfS21S0200000_1(this.LJLILLLLZI, this.LJLJI, 0);
            this.LJLIL = 1;
            if (xlm.collect(iDfS21S0200000_1, this) == enumC58928NAu) {
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
