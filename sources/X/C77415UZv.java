package X;

import fjb.a;
import java.util.concurrent.atomic.AtomicInteger;

@InterfaceC65848Psq(c = "kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1", f = "Combine.kt", l = {147}, m = "invokeSuspend")
/* renamed from: X.UZv, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77415UZv extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ InterfaceC65462ha<Object>[] LJLILLLLZI;
    public final /* synthetic */ int LJLJI;
    public final /* synthetic */ AtomicInteger LJLJJI;
    public final /* synthetic */ InterfaceC78936UyS<C2058786d<Object>> LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C77415UZv(InterfaceC65462ha<Object>[] interfaceC65462haArr, int i, AtomicInteger atomicInteger, InterfaceC78936UyS<C2058786d<Object>> interfaceC78936UyS, InterfaceC67352kd<? super C77415UZv> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = interfaceC65462haArr;
        this.LJLJI = i;
        this.LJLJJI = atomicInteger;
        this.LJLJJL = interfaceC78936UyS;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C77415UZv(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        AtomicInteger atomicInteger;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        try {
            if (i != 0) {
                if (i == 1) {
                    C141335gf.LIZJ(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C141335gf.LIZJ(obj);
                InterfaceC65462ha<Object>[] interfaceC65462haArr = this.LJLILLLLZI;
                int i2 = this.LJLJI;
                InterfaceC65462ha<Object> interfaceC65462ha = interfaceC65462haArr[i2];
                C77417UZx c77417UZx = new C77417UZx(this.LJLJJL, i2);
                this.LJLIL = 1;
                if (interfaceC65462ha.collect(c77417UZx, this) == enumC58928NAu) {
                    return enumC58928NAu;
                }
            }
            if (atomicInteger.decrementAndGet() == 0) {
                this.LJLJJL.LJJIFFI(null);
            }
            return C76800UCe.LIZ;
        } finally {
            if (this.LJLJJI.decrementAndGet() == 0) {
                this.LJLJJL.LJJIFFI(null);
            }
        }
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
