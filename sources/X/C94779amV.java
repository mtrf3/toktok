package X;

import com.bytedance.effectcreatormobile.resource.ep.impl.GifRepositoryImpl;
import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.bytedance.effectcreatormobile.resource.ep.impl.GifRepositoryImpl$isAvailable$2$1", f = "GifRepositoryImpl.kt", l = {115}, m = "invokeSuspend")
/* renamed from: X.amV, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94779amV extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ C94780amW LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C94779amV(C94780amW c94780amW, InterfaceC67352kd interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c94780amW;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> completion) {
        o.LJIIIZ(completion, "completion");
        return new C94779amV(this.LJLILLLLZI, completion);
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
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
                GifRepositoryImpl gifRepositoryImpl = this.LJLILLLLZI.LJLILLLLZI;
                this.LJLIL = 1;
                if (gifRepositoryImpl.fetchGiphyAvailableFromRemote(this) == enumC58928NAu) {
                    return enumC58928NAu;
                }
            }
        } catch (Exception unused) {
        }
        return C76800UCe.LIZ;
    }
}