package X;

import fjb.a;
import java.io.File;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.bytedance.effectcreatormobile.draft.DraftImpl$cleanCache$1", f = "DraftImpl.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.am8, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94756am8 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public C94756am8(InterfaceC67352kd interfaceC67352kd) {
        super(2, interfaceC67352kd);
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> completion) {
        o.LJIIIZ(completion, "completion");
        return new C94756am8(completion);
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        String str;
        C141335gf.LIZJ(obj);
        try {
            str = C93965aZN.LIZJ;
        } catch (Exception unused) {
        }
        if (str != null) {
            File file = new File(str);
            if (file.exists()) {
                OR7.LLLIIL(file);
            }
            return C76800UCe.LIZ;
        }
        o.LJIJI("oldDraftDir");
        throw null;
    }
}
