package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.shortvideo.eventtrack.ToolsFluencyEventReport$start$1", f = "ToolsFluencyEventReport.kt", l = {53, 54}, m = "invokeSuspend")
/* renamed from: X.2lU, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C67882lU extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC64672gJ<? super C76800UCe>, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public /* synthetic */ Object LJLILLLLZI;

    public C67882lU(InterfaceC67352kd<? super C67882lU> interfaceC67352kd) {
        super(2, interfaceC67352kd);
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C67882lU c67882lU = new C67882lU(interfaceC67352kd);
        c67882lU.LJLILLLLZI = obj;
        return c67882lU;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x004a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0048 -> B:6:0x0013). Please report as a decompilation issue!!! */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            X.NAu r5 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r6.LJLIL
            r4 = 2
            r3 = 1
            if (r0 == 0) goto L4b
            if (r0 == r3) goto L28
            if (r0 != r4) goto L56
            java.lang.Object r0 = r6.LJLILLLLZI
            X.2gJ r0 = (X.InterfaceC64672gJ) r0
            X.C141335gf.LIZJ(r7)
        L13:
            java.util.concurrent.atomic.AtomicBoolean r1 = X.C3B0.LIZIZ
            boolean r1 = r1.get()
            if (r1 == 0) goto L53
            X.UCe r1 = X.C76800UCe.LIZ
            r6.LJLILLLLZI = r0
            r6.LJLIL = r3
            java.lang.Object r1 = r0.emit(r1, r6)
            if (r1 != r5) goto L2f
            return r5
        L28:
            java.lang.Object r0 = r6.LJLILLLLZI
            X.2gJ r0 = (X.InterfaceC64672gJ) r0
            X.C141335gf.LIZJ(r7)
        L2f:
            X.Ol8 r1 = X.C78547UsB.LIZJ
            java.lang.Object r2 = r1.getValue()
            com.ss.android.ugc.aweme.setting.performance.ToolsBaseInfoConfig r2 = (com.ss.android.ugc.aweme.setting.performance.ToolsBaseInfoConfig) r2
            java.lang.String r1 = "value"
            kotlin.jvm.internal.o.LJIIIIZZ(r2, r1)
            long r1 = r2.getCollectDuration()
            r6.LJLILLLLZI = r0
            r6.LJLIL = r4
            java.lang.Object r1 = X.C1JD.LIZJ(r1, r6)
            if (r1 != r5) goto L13
            return r5
        L4b:
            X.C141335gf.LIZJ(r7)
            java.lang.Object r0 = r6.LJLILLLLZI
            X.2gJ r0 = (X.InterfaceC64672gJ) r0
            goto L13
        L53:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L56:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67882lU.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC64672gJ<? super C76800UCe> interfaceC64672gJ, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC64672gJ, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
