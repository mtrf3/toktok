package X;

import com.ss.android.ugc.aweme.im.service.model.IMUser;
import fjb.a;
import java.util.List;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.relations.data.manager.IMUserMentionPrivacyUpdateManager$updateIMUserMentionPrivacyForWarmStart$5", f = "IMUserMentionPrivacyUpdateManager.kt", l = {90}, m = "invokeSuspend")
/* renamed from: X.3Dx, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C80493Dx extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public int LJLILLLLZI;
    public final /* synthetic */ List<IMUser> LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C80493Dx(List<? extends IMUser> list, InterfaceC67352kd<? super C80493Dx> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = list;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C80493Dx(this.LJLJI, interfaceC67352kd);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0053, code lost:
    
        if (r5 >= 2) goto L24;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0046 -> B:7:0x004c). Please report as a decompilation issue!!! */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            X.NAu r7 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r8.LJLILLLLZI
            r6 = 1
            if (r0 == 0) goto L14
            if (r0 != r6) goto Lc
            int r5 = r8.LJLIL
            goto L49
        Lc:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L14:
            X.C141335gf.LIZJ(r9)
            r5 = 0
        L18:
            X.3Fk r4 = X.C80853Fh.LJ()     // Catch: java.lang.Throwable -> L50
            java.util.List<com.ss.android.ugc.aweme.im.service.model.IMUser> r0 = r8.LJLJI     // Catch: java.lang.Throwable -> L50
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L50
            r3.<init>()     // Catch: java.lang.Throwable -> L50
            java.util.Iterator r2 = r0.iterator()     // Catch: java.lang.Throwable -> L50
        L27:
            boolean r0 = r2.hasNext()     // Catch: java.lang.Throwable -> L50
            if (r0 == 0) goto L3e
            java.lang.Object r1 = r2.next()     // Catch: java.lang.Throwable -> L50
            r0 = r1
            com.ss.android.ugc.aweme.im.service.model.IMUser r0 = (com.ss.android.ugc.aweme.im.service.model.IMUser) r0     // Catch: java.lang.Throwable -> L50
            boolean r0 = X.C76917UGr.LJJJJJL(r0)     // Catch: java.lang.Throwable -> L50
            if (r0 != 0) goto L27
            r3.add(r1)     // Catch: java.lang.Throwable -> L50
            goto L27
        L3e:
            r8.LJLIL = r5     // Catch: java.lang.Throwable -> L50
            r8.LJLILLLLZI = r6     // Catch: java.lang.Throwable -> L50
            java.lang.Object r0 = r4.LJIIIIZZ(r3, r8)     // Catch: java.lang.Throwable -> L50
            if (r0 != r7) goto L4c
            goto L56
        L49:
            X.C141335gf.LIZJ(r9)     // Catch: java.lang.Throwable -> L50
        L4c:
            X.C3E0.LIZJ(r6)     // Catch: java.lang.Throwable -> L50
            goto L57
        L50:
            int r5 = r5 + 1
            r0 = 2
            if (r5 >= r0) goto L57
            goto L18
        L56:
            return r7
        L57:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C80493Dx.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
