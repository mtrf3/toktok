package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.profile.shared.UserProfileVideoLruCache$checkCapacity$1", f = "UserProfileVideoLruCache.kt", l = {55}, m = "invokeSuspend")
/* renamed from: X.2f8, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C63942f8 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public Object LJLIL;
    public int LJLILLLLZI;
    public final /* synthetic */ C63972fB LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C63942f8(C63972fB c63972fB, InterfaceC67352kd<? super C63942f8> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = c63972fB;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C63942f8(this.LJLJI, interfaceC67352kd);
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x007d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0069 -> B:7:0x0072). Please report as a decompilation issue!!! */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            X.NAu r4 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r6.LJLILLLLZI
            r3 = 1
            if (r0 == 0) goto L17
            if (r0 != r3) goto Lf
            java.lang.Object r5 = r6.LJLIL
            X.C141335gf.LIZJ(r7)     // Catch: java.lang.Exception -> L6e
            goto L72
        Lf:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L17:
            X.C141335gf.LIZJ(r7)
        L1a:
            X.2fB r0 = r6.LJLJI
            java.util.LinkedHashMap r0 = r0.LIZIZ()
            int r1 = r0.size()
            X.2fB r0 = r6.LJLJI
            X.Ol8 r0 = r0.LIZ
            java.lang.Object r0 = r0.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            if (r1 <= r0) goto L7d
            X.2fB r0 = r6.LJLJI
            java.util.LinkedHashMap r0 = r0.LIZIZ()
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
            java.lang.Object r2 = r0.next()
            java.lang.String r0 = "cacheMap.entries.iterator().next()"
            kotlin.jvm.internal.o.LJIIIIZZ(r2, r0)
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r5 = r2.getKey()
            java.lang.String r0 = "oldestEntry.key"
            kotlin.jvm.internal.o.LJIIIIZZ(r5, r0)
            X.2fB r1 = r6.LJLJI     // Catch: java.lang.Exception -> L6c
            java.lang.Object r0 = r2.getValue()     // Catch: java.lang.Exception -> L6c
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Exception -> L6c
            r6.LJLIL = r5     // Catch: java.lang.Exception -> L6c
            r6.LJLILLLLZI = r3     // Catch: java.lang.Exception -> L6c
            r1.getClass()     // Catch: java.lang.Exception -> L6c
            java.lang.Object r0 = X.C63972fB.LIZ(r0, r6)     // Catch: java.lang.Exception -> L6c
            if (r0 != r4) goto L72
            goto L7c
        L6c:
            r0 = move-exception
            goto L6f
        L6e:
            r0 = move-exception
        L6f:
            X.C16880lQ.LLLLIIL(r0)
        L72:
            X.2fB r0 = r6.LJLJI
            java.util.LinkedHashMap r0 = r0.LIZIZ()
            r0.remove(r5)
            goto L1a
        L7c:
            return r4
        L7d:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63942f8.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
