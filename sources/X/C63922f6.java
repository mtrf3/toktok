package X;

import fjb.a;
import java.util.List;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.photo.PhotoAsyncTaskRecorder$waitTaskDone$1", f = "PhotoAsyncTaskRecorder.kt", l = {51}, m = "invokeSuspend")
/* renamed from: X.2f6, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C63922f6 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public Object LJLIL;
    public Object LJLILLLLZI;
    public int LJLJI;
    public final /* synthetic */ List<String> LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C63922f6(List<String> list, InterfaceC67352kd<? super C63922f6> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJJI = list;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C63922f6(this.LJLJJI, interfaceC67352kd);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x003c -> B:5:0x0014). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:9:0x0030 -> B:5:0x0014). Please report as a decompilation issue!!! */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            X.NAu r7 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r8.LJLJI
            r6 = 1
            if (r0 == 0) goto L3f
            if (r0 != r6) goto L87
            java.lang.Object r2 = r8.LJLILLLLZI
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r1 = r8.LJLIL
            java.util.Iterator r1 = (java.util.Iterator) r1
            X.C141335gf.LIZJ(r9)
        L14:
            java.lang.Object r0 = r2.getKey()
            java.lang.String r0 = (java.lang.String) r0
            X.C65282hI.LIZLLL(r0)
        L1e:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L84
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r0 = r2.getValue()
            X.2mE r0 = (X.InterfaceC68342mE) r0
            if (r0 == 0) goto L14
            r8.LJLIL = r1
            r8.LJLILLLLZI = r2
            r8.LJLJI = r6
            java.lang.Object r0 = r0.LJI(r8)
            if (r0 != r7) goto L14
            return r7
        L3f:
            X.C141335gf.LIZJ(r9)
            X.Ol8 r0 = X.C65282hI.LIZ
            java.lang.Object r0 = r0.getValue()
            java.util.concurrent.ConcurrentHashMap r0 = (java.util.concurrent.ConcurrentHashMap) r0
            java.util.List<java.lang.String> r5 = r8.LJLJJI
            java.util.LinkedHashMap r4 = new java.util.LinkedHashMap
            r4.<init>()
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r3 = r0.iterator()
        L59:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L7b
            java.lang.Object r2 = r3.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r0 = r2.getKey()
            boolean r0 = r5.contains(r0)
            if (r0 == 0) goto L59
            java.lang.Object r1 = r2.getKey()
            java.lang.Object r0 = r2.getValue()
            r4.put(r1, r0)
            goto L59
        L7b:
            java.util.Set r0 = r4.entrySet()
            java.util.Iterator r1 = r0.iterator()
            goto L1e
        L84:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L87:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63922f6.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
