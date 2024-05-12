package X;

import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.bytedance.ugc.effectcreator.main.EnterProcessor$enter$2", f = "EnterProcessor.kt", l = {44, 45}, m = "invokeSuspend")
/* renamed from: X.aoY, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94906aoY extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C93928aYm>, Object> {
    public /* synthetic */ Object LJLIL;
    public int LJLILLLLZI;
    public final /* synthetic */ C93930aYo LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C94906aoY(C93930aYo c93930aYo, InterfaceC67352kd interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = c93930aYo;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> completion) {
        o.LJIIIZ(completion, "completion");
        C94906aoY c94906aoY = new C94906aoY(this.LJLJI, completion);
        c94906aoY.LJLIL = obj;
        return c94906aoY;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C93928aYm> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
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
            r6 = 2
            r5 = 1
            if (r0 == 0) goto L67
            if (r0 == r5) goto L8d
            if (r0 != r6) goto La5
            java.lang.Object r3 = r8.LJLIL
            java.lang.String r3 = (java.lang.String) r3
            X.C141335gf.LIZJ(r9)
        L13:
            java.lang.String r9 = (java.lang.String) r9
            X.aYo r2 = r8.LJLJI
            int r0 = r9.length()
            if (r0 != 0) goto L65
            r1 = 1
        L1e:
            int r0 = r3.length()
            if (r0 != 0) goto L63
            r0 = 1
        L25:
            r2.getClass()
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>()
            if (r1 == 0) goto L5e
            if (r0 == 0) goto L5b
            java.lang.String r1 = "both_fail"
        L33:
            java.lang.String r0 = "err_msg"
            r2.put(r0, r1)
            com.bytedance.effectcreatormobile.ckeapi.api.foundation.statistic.StatisticReporter r1 = X.C93670aUc.LIZ()
            if (r1 == 0) goto L43
            java.lang.String r0 = "server_launch_fail"
            r1.onEvent(r0, r2)
        L43:
            X.aYm r1 = new X.aYm
            int r0 = r9.length()
            if (r0 != 0) goto L51
        L4b:
            X.aYn r0 = X.EnumC93929aYn.NetworkError
        L4d:
            r1.<init>(r9, r3, r0)
            return r1
        L51:
            int r0 = r3.length()
            if (r0 != 0) goto L58
            goto L4b
        L58:
            X.aYn r0 = X.EnumC93929aYn.Success
            goto L4d
        L5b:
            java.lang.String r1 = "main_effect_fetch_fail"
            goto L33
        L5e:
            if (r0 == 0) goto L43
            java.lang.String r1 = "model_image_fetch_fail"
            goto L33
        L63:
            r0 = 0
            goto L25
        L65:
            r1 = 0
            goto L1e
        L67:
            X.C141335gf.LIZJ(r9)
            java.lang.Object r4 = r8.LJLIL
            X.2pa r4 = (X.InterfaceC70422pa) r4
            X.aoX r0 = new X.aoX
            r3 = 0
            r0.<init>(r8, r3)
            r2 = 3
            X.XKn r1 = X.XKX.LIZIZ(r4, r3, r3, r0, r2)
            X.aoW r0 = new X.aoW
            r0.<init>(r8, r3)
            X.XKn r0 = X.XKX.LIZIZ(r4, r3, r3, r0, r2)
            r8.LJLIL = r0
            r8.LJLILLLLZI = r5
            java.lang.Object r9 = r1.LJJIJ(r8)
            if (r9 != r7) goto L94
            return r7
        L8d:
            java.lang.Object r0 = r8.LJLIL
            X.2mE r0 = (X.InterfaceC68342mE) r0
            X.C141335gf.LIZJ(r9)
        L94:
            java.lang.String r9 = (java.lang.String) r9
            r8.LJLIL = r9
            r8.LJLILLLLZI = r6
            java.lang.Object r0 = r0.LJI(r8)
            if (r0 != r7) goto La1
            return r7
        La1:
            r3 = r9
            r9 = r0
            goto L13
        La5:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C94906aoY.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
