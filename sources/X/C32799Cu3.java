package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Cu3, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32799Cu3 extends AbstractC32132CjI implements InterfaceC77303UVn {
    public final String LIZLLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32799Cu3(InterfaceC32124CjA requireRef) {
        super(requireRef);
        o.LJIIIZ(requireRef, "requireRef");
        this.LIZLLL = "PreRequestSendGiftProcessor";
    }

    @Override // X.InterfaceC77303UVn
    public final Object LIZ(C32816CuK c32816CuK, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        if (this.LIZJ) {
            Object LJIIIZ = LJIIIZ(c32816CuK, interfaceC67352kd);
            if (LJIIIZ == EnumC58928NAu.COROUTINE_SUSPENDED) {
                return LJIIIZ;
            }
            return C76800UCe.LIZ;
        }
        C0NB.LJ(this.LIZLLL, "request process on invalid processor!");
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIIZ(X.C32816CuK r14, X.InterfaceC67352kd<? super X.C76800UCe> r15) {
        /*
            Method dump skipped, instructions count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32799Cu3.LJIIIZ(X.CuK, X.2kd):java.lang.Object");
    }
}
