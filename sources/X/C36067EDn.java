package X;

import com.ss.android.ugc.aweme.ecommerce.smartcheck.core.roma.RomaPattern;
import java.util.List;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.smartcheck.core.roma.RomaApiFetcher$fetchRemote$2", f = "RomaApiFetcher.kt", l = {35}, m = "invokeSuspend")
/* renamed from: X.EDn, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36067EDn extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super OSZ<? extends String, ? extends List<? extends RomaPattern>>>, Object> {
    public int LJLIL;

    public C36067EDn(InterfaceC67352kd<? super C36067EDn> interfaceC67352kd) {
        super(2, interfaceC67352kd);
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C36067EDn(interfaceC67352kd);
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
            C36068EDo c36068EDo = new C36068EDo(null);
            this.LJLIL = 1;
            obj = C74209TAn.LIZIZ(30000L, c36068EDo, this);
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return obj;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super OSZ<? extends String, ? extends List<? extends RomaPattern>>> interfaceC67352kd) {
        return new C36067EDn(interfaceC67352kd).invokeSuspend(C76800UCe.LIZ);
    }
}