package X;

import com.bytedance.effectcreatormobile.resource.ep.impl.GifRepositoryImpl;
import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.bytedance.effectcreatormobile.resource.ep.impl.GifRepositoryImpl$isAvailable$2", f = "GifRepositoryImpl.kt", l = {108}, m = "invokeSuspend")
/* renamed from: X.amW, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94780amW extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super Boolean>, Object> {
    public int LJLIL;
    public final /* synthetic */ GifRepositoryImpl LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C94780amW(GifRepositoryImpl gifRepositoryImpl, InterfaceC67352kd interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = gifRepositoryImpl;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> completion) {
        o.LJIIIZ(completion, "completion");
        return new C94780amW(this.LJLILLLLZI, completion);
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super Boolean> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
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
                GifRepositoryImpl gifRepositoryImpl = this.LJLILLLLZI;
                this.LJLIL = 1;
                obj = gifRepositoryImpl.fetchGiphyAvailableFromCache(this);
                if (obj == enumC58928NAu) {
                    return enumC58928NAu;
                }
            }
            z = ((Boolean) obj).booleanValue();
        } catch (Exception unused) {
            z = false;
        }
        XKX.LIZLLL(C48841JEv.LIZ(C78613UtF.LIZJ), null, null, new C94779amV(this, null), 3);
        return Boolean.valueOf(z);
    }
}
