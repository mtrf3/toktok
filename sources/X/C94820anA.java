package X;

import com.ugc.effectcreator.effectcore.sdk.behaviour.BehaviourIconManager;
import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ugc.effectcreator.effectcore.sdk.behaviour.BehaviourIconManager$query$2", f = "BehaviourIconManager.kt", l = {55, 56}, m = "invokeSuspend")
/* renamed from: X.anA, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94820anA extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super String>, Object> {
    public InterfaceC79150V4o LJLIL;
    public int LJLILLLLZI;
    public final /* synthetic */ BehaviourIconManager LJLJI;
    public final /* synthetic */ String LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C94820anA(BehaviourIconManager behaviourIconManager, String str, InterfaceC67352kd interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = behaviourIconManager;
        this.LJLJJI = str;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> completion) {
        o.LJIIIZ(completion, "completion");
        return new C94820anA(this.LJLJI, this.LJLJJI, completion);
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super String> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0024, code lost:
    
        if (r0 != null) goto L7;
     */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            X.NAu r4 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r5.LJLILLLLZI
            r3 = 2
            r2 = 1
            if (r0 == 0) goto L27
            if (r0 == r2) goto L1f
            if (r0 != r3) goto L60
            X.C141335gf.LIZJ(r6)
        Lf:
            com.ugc.effectcreator.effectcore.sdk.behaviour.BehaviourIconManager r0 = r5.LJLJI
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.String> r1 = r0.iconQueryMap
            java.lang.String r0 = r5.LJLJJI
            java.lang.Object r1 = r1.get(r0)
            if (r1 == 0) goto L1c
        L1b:
            return r1
        L1c:
            java.lang.String r1 = ""
            goto L1b
        L1f:
            X.V4o r0 = r5.LJLIL
            X.C141335gf.LIZJ(r6)
            if (r0 == 0) goto L4f
            goto Lf
        L27:
            X.C141335gf.LIZJ(r6)
            com.ugc.effectcreator.effectcore.sdk.behaviour.BehaviourIconManager r0 = r5.LJLJI
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.String> r1 = r0.iconQueryMap
            java.lang.String r0 = r5.LJLJJI
            java.lang.Object r1 = r1.get(r0)
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto L3e
            int r0 = r1.length()
            if (r0 != 0) goto L1b
        L3e:
            com.ugc.effectcreator.effectcore.sdk.behaviour.BehaviourIconManager r0 = r5.LJLJI
            X.V4o r0 = r0.queryFetchJob
            if (r0 == 0) goto L4f
            r5.LJLIL = r0
            r5.LJLILLLLZI = r2
            java.lang.Object r0 = r0.LJJJJ(r5)
            if (r0 != r4) goto Lf
            return r4
        L4f:
            X.an9 r1 = new X.an9
            r0 = 0
            r1.<init>(r5, r0)
            r5.LJLIL = r0
            r5.LJLILLLLZI = r3
            java.lang.Object r0 = X.C48841JEv.LJI(r1, r5)
            if (r0 != r4) goto Lf
            return r4
        L60:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C94820anA.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
