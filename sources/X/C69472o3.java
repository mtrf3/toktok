package X;

import djb.IDaS66S0100000_1;
import fjb.a;
import java.util.List;
import kotlinx.coroutines.CoroutineExceptionHandler;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chat.controller.utils.AwemeFetchManager$getBatchAwemeCacheItem$3$fetchJob$1", f = "AwemeFetchManager.kt", l = {116}, m = "invokeSuspend")
/* renamed from: X.2o3, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C69472o3 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ List<String> LJLILLLLZI;
    public final /* synthetic */ XKW LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C69472o3(List<String> list, XKW xkw, InterfaceC67352kd<? super C69472o3> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = list;
        this.LJLJI = xkw;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C69472o3(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        Object obj2 = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        if (i != 0) {
            if (i == 1) {
                C141335gf.LIZJ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj);
            List<String> list = this.LJLILLLLZI;
            XKW xkw = this.LJLJI;
            this.LJLIL = 1;
            Object LJI = XKX.LJI(xkw.plus(new IDaS66S0100000_1(CoroutineExceptionHandler.LJJJJIZL, list, 2)), new C69692oP(list, null), this);
            if (LJI != obj2) {
                LJI = C76800UCe.LIZ;
            }
            if (LJI == obj2) {
                return obj2;
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
