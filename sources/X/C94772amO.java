package X;

import com.bytedance.effectcreatormobile.resource.ep.impl.DefaultResourceProvider;
import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.bytedance.effectcreatormobile.resource.ep.impl.DefaultResourceProvider$downloadRes$3", f = "DefaultResourceProvider.kt", l = {312, 317}, m = "invokeSuspend")
/* renamed from: X.amO, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94772amO extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ DefaultResourceProvider LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ InterfaceC93663aUV LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C94772amO(DefaultResourceProvider defaultResourceProvider, String str, InterfaceC93663aUV interfaceC93663aUV, InterfaceC67352kd interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = defaultResourceProvider;
        this.LJLJI = str;
        this.LJLJJI = interfaceC93663aUV;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> completion) {
        o.LJIIIZ(completion, "completion");
        return new C94772amO(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, completion);
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            X.NAu r3 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r5.LJLIL
            r4 = 2
            r2 = 1
            if (r0 == 0) goto L36
            if (r0 == r2) goto L63
            if (r0 != r4) goto L4e
            X.C141335gf.LIZJ(r6)
        Lf:
            java.lang.String r6 = (java.lang.String) r6
            r3 = 0
            if (r6 == 0) goto L26
            com.bytedance.effectcreatormobile.resource.ep.impl.DefaultResourceProvider r0 = r5.LJLILLLLZI
            X.2pa r2 = r0.scope
            X.UtN r1 = X.C36636EZk.LIZ
            X.amN r0 = new X.amN
            r0.<init>(r6, r3, r5)
            X.XKX.LIZLLL(r2, r1, r3, r0, r4)
        L23:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L26:
            com.bytedance.effectcreatormobile.resource.ep.impl.DefaultResourceProvider r0 = r5.LJLILLLLZI
            X.2pa r2 = r0.scope
            X.UtN r1 = X.C36636EZk.LIZ
            X.amM r0 = new X.amM
            r0.<init>(r5, r3)
            X.XKX.LIZLLL(r2, r1, r3, r0, r4)
            goto L23
        L36:
            X.C141335gf.LIZJ(r6)
            com.bytedance.effectcreatormobile.resource.ep.impl.DefaultResourceProvider r1 = r5.LJLILLLLZI
            java.lang.String r0 = r5.LJLJI
            com.ss.android.ugc.effectmanager.effect.model.Effect r1 = r1.extraToEffect(r0)
            if (r1 == 0) goto L56
            com.bytedance.effectcreatormobile.resource.ep.impl.DefaultResourceProvider r0 = r5.LJLILLLLZI
            r5.LJLIL = r4
            java.lang.Object r6 = r0.downloadRes(r1, r5)
            if (r6 != r3) goto Lf
            return r3
        L4e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L56:
            com.bytedance.effectcreatormobile.resource.ep.impl.DefaultResourceProvider r1 = r5.LJLILLLLZI
            java.lang.String r0 = r5.LJLJI
            r5.LJLIL = r2
            java.lang.Object r6 = r1.downloadEffectById(r0, r5)
            if (r6 != r3) goto L66
            return r3
        L63:
            X.C141335gf.LIZJ(r6)
        L66:
            com.ss.ugc.effectplatform.model.Effect r6 = (com.ss.ugc.effectplatform.model.Effect) r6
            if (r6 == 0) goto L76
            X.aUV r1 = r5.LJLJJI
            java.lang.String r0 = r6.getUnzipPath()
            r1.onSuccess(r0)
        L73:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L76:
            X.aUV r0 = r5.LJLJJI
            r0.onFail()
            goto L73
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C94772amO.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
