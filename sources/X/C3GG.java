package X;

import java.util.concurrent.CopyOnWriteArraySet;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.contact.helper.IMContactManager$clearAllData$1", f = "IMContactManager.kt", l = {156, 157}, m = "invokeSuspend")
/* renamed from: X.3GG, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3GG extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;

    public C3GG(InterfaceC67352kd<? super C3GG> interfaceC67352kd) {
        super(2, interfaceC67352kd);
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C3GG(interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C141335gf.LIZJ(obj);
                    C85913Yt.LIZ.getClass();
                    ((CopyOnWriteArraySet) C85913Yt.LJIIIZ).clear();
                    C85913Yt.LJIIJ.clear();
                    return C76800UCe.LIZ;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C141335gf.LIZJ(obj);
        } else {
            C141335gf.LIZJ(obj);
            C3Z2 LIZ = C3GK.LIZ();
            this.LJLIL = 1;
            if (LIZ.LIZ(this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        C3ZA LIZ2 = C3GL.LIZ();
        this.LJLIL = 2;
        if (LIZ2.LIZ(this) == enumC58928NAu) {
            return enumC58928NAu;
        }
        C85913Yt.LIZ.getClass();
        ((CopyOnWriteArraySet) C85913Yt.LJIIIZ).clear();
        C85913Yt.LJIIJ.clear();
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return new C3GG(interfaceC67352kd).invokeSuspend(C76800UCe.LIZ);
    }
}
