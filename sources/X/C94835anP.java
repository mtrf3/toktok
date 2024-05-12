package X;

import com.bytedance.effectcreatormobile.objectselect.prefab.PrefabViewModel;
import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.bytedance.effectcreatormobile.objectselect.prefab.PrefabViewModel$loadEffectList$1", f = "PrefabViewModel.kt", l = {77, 78, 79}, m = "invokeSuspend")
/* renamed from: X.anP, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94835anP extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ PrefabViewModel LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C94835anP(PrefabViewModel prefabViewModel, boolean z, InterfaceC67352kd interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = prefabViewModel;
        this.LJLJI = z;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> completion) {
        o.LJIIIZ(completion, "completion");
        return new C94835anP(this.LJLILLLLZI, this.LJLJI, completion);
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004e A[RETURN] */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            X.NAu r6 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r7.LJLIL
            r5 = 3
            r4 = 2
            r3 = 0
            r2 = 1
            if (r0 == 0) goto L16
            if (r0 == r2) goto L2c
            if (r0 == r4) goto L3c
            if (r0 != r5) goto L4f
            X.C141335gf.LIZJ(r8)
        L13:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L16:
            X.C141335gf.LIZJ(r8)
            com.bytedance.effectcreatormobile.objectselect.prefab.PrefabViewModel r0 = r7.LJLILLLLZI
            X.XLM r1 = r0.LJLIL
            X.aat r0 = new X.aat
            r0.<init>(r3)
            r7.LJLIL = r2
            r1.setValue(r0)
            X.UCe r0 = X.C76800UCe.LIZ
            if (r0 != r6) goto L2f
            return r6
        L2c:
            X.C141335gf.LIZJ(r8)
        L2f:
            com.bytedance.effectcreatormobile.objectselect.prefab.PrefabViewModel r1 = r7.LJLILLLLZI
            boolean r0 = r7.LJLJI
            r7.LJLIL = r4
            java.lang.Object r0 = r1.kv0(r0, r7)
            if (r0 != r6) goto L3f
            return r6
        L3c:
            X.C141335gf.LIZJ(r8)
        L3f:
            X.XIA r1 = X.C78613UtF.LIZJ
            X.anO r0 = new X.anO
            r0.<init>(r7, r3)
            r7.LJLIL = r5
            java.lang.Object r0 = X.XKX.LJI(r1, r0, r7)
            if (r0 != r6) goto L13
            return r6
        L4f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C94835anP.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
