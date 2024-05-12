package X;

import com.ss.android.ugc.aweme.bnpl.biz.entry.BNPLEntryViewModel;
import com.ss.android.ugc.aweme.bnpl.network.BNPLApi;
import fjb.a;
import kotlin.jvm.internal.IDqS418S0100000_31;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.bnpl.biz.entry.BNPLEntryViewModel$load$3", f = "BNPLEntryViewModel.kt", l = {68}, m = "invokeSuspend")
/* renamed from: X.aM2, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C93138aM2 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ BNPLEntryViewModel LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C93138aM2(BNPLEntryViewModel bNPLEntryViewModel, InterfaceC67352kd<? super C93138aM2> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = bNPLEntryViewModel;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C93138aM2(this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
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
                String str = C91824a0q.LJFF;
                String str2 = C91826a0s.LIZJ;
                String str3 = C91826a0s.LIZIZ;
                this.LJLIL = 1;
                BNPLApi.LIZ();
                BNPLApi.IBNPLApi iBNPLApi = BNPLApi.LIZ;
                if (iBNPLApi != null) {
                    obj = iBNPLApi.fetchEntry(str, str3, str2, this);
                    if (obj == enumC58928NAu) {
                        return enumC58928NAu;
                    }
                } else {
                    o.LJIJI("api");
                    throw null;
                }
            }
            XKX.LIZLLL(this.LJLILLLLZI.getAssemVMScope(), C36636EZk.LIZ, null, new C93137aM1((C64797Pbt) obj, this.LJLILLLLZI, null), 2);
        } catch (Exception e) {
            this.LJLILLLLZI.setState(new IDqS418S0100000_31(e, 102));
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
