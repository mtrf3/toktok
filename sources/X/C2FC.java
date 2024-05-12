package X;

import com.bytedance.android.live.effect.filter.composerfilter.ComposerFilterViewModel;
import fjb.a;

@InterfaceC65848Psq(c = "com.bytedance.android.live.effect.filter.composerfilter.ComposerFilterViewModel$fetchDataOld$1", f = "ComposerFilterViewModel.kt", l = {C61447O9r.LJIIJ, 51, 53, 55, 56, 59}, m = "invokeSuspend")
/* renamed from: X.2FC, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2FC extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ ComposerFilterViewModel LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2FC(ComposerFilterViewModel composerFilterViewModel, InterfaceC67352kd<? super C2FC> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = composerFilterViewModel;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C2FC(this.LJLILLLLZI, interfaceC67352kd);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0005. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0038 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0046 A[Catch: Exception -> 0x007f, TryCatch #0 {Exception -> 0x007f, blocks: (B:7:0x0010, B:11:0x002b, B:14:0x003c, B:16:0x0046, B:19:0x0059, B:22:0x006a, B:28:0x0039, B:29:0x0067), top: B:2:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0059 A[Catch: Exception -> 0x007f, TryCatch #0 {Exception -> 0x007f, blocks: (B:7:0x0010, B:11:0x002b, B:14:0x003c, B:16:0x0046, B:19:0x0059, B:22:0x006a, B:28:0x0039, B:29:0x0067), top: B:2:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007e A[RETURN] */
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
            r4 = 1
            switch(r0) {
                case 0: goto L19;
                case 1: goto L15;
                case 2: goto L39;
                case 3: goto L10;
                case 4: goto L67;
                case 5: goto L10;
                case 6: goto L94;
                default: goto L8;
            }
        L8:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L10:
            X.C141335gf.LIZJ(r6)     // Catch: java.lang.Exception -> L7f
            goto L97
        L15:
            X.C141335gf.LIZJ(r6)
            goto L2b
        L19:
            X.C141335gf.LIZJ(r6)
            com.bytedance.android.live.effect.filter.composerfilter.ComposerFilterViewModel r0 = r5.LJLILLLLZI
            X.XLL r1 = r0.LJLJI
            X.1d3 r0 = X.C37171d3.LIZ
            r5.LJLIL = r4
            java.lang.Object r0 = r1.emit(r0, r5)
            if (r0 != r3) goto L2b
            return r3
        L2b:
            com.bytedance.android.live.effect.filter.composerfilter.ComposerFilterViewModel r0 = r5.LJLILLLLZI     // Catch: java.lang.Exception -> L7f
            X.1VF r1 = r0.LJLJJI     // Catch: java.lang.Exception -> L7f
            r0 = 2
            r5.LJLIL = r0     // Catch: java.lang.Exception -> L7f
            java.lang.Object r6 = r1.LIZ(r5)     // Catch: java.lang.Exception -> L7f
            if (r6 != r3) goto L3c
            return r3
        L39:
            X.C141335gf.LIZJ(r6)     // Catch: java.lang.Exception -> L7f
        L3c:
            java.util.List r6 = (java.util.List) r6     // Catch: java.lang.Exception -> L7f
            boolean r0 = r6.isEmpty()     // Catch: java.lang.Exception -> L7f
            r0 = r0 ^ 1
            if (r0 == 0) goto L59
            com.bytedance.android.live.effect.filter.composerfilter.ComposerFilterViewModel r0 = r5.LJLILLLLZI     // Catch: java.lang.Exception -> L7f
            X.XLL r2 = r0.LJLJI     // Catch: java.lang.Exception -> L7f
            X.1d2 r1 = new X.1d2     // Catch: java.lang.Exception -> L7f
            r1.<init>(r6)     // Catch: java.lang.Exception -> L7f
            r0 = 3
            r5.LJLIL = r0     // Catch: java.lang.Exception -> L7f
            java.lang.Object r0 = r2.emit(r1, r5)     // Catch: java.lang.Exception -> L7f
            if (r0 != r3) goto L97
            return r3
        L59:
            com.bytedance.android.live.effect.filter.composerfilter.ComposerFilterViewModel r0 = r5.LJLILLLLZI     // Catch: java.lang.Exception -> L7f
            X.1VF r1 = r0.LJLJJI     // Catch: java.lang.Exception -> L7f
            r0 = 4
            r5.LJLIL = r0     // Catch: java.lang.Exception -> L7f
            java.lang.Object r6 = r1.LIZJ(r5)     // Catch: java.lang.Exception -> L7f
            if (r6 != r3) goto L6a
            return r3
        L67:
            X.C141335gf.LIZJ(r6)     // Catch: java.lang.Exception -> L7f
        L6a:
            java.util.List r6 = (java.util.List) r6     // Catch: java.lang.Exception -> L7f
            com.bytedance.android.live.effect.filter.composerfilter.ComposerFilterViewModel r0 = r5.LJLILLLLZI     // Catch: java.lang.Exception -> L7f
            X.XLL r2 = r0.LJLJI     // Catch: java.lang.Exception -> L7f
            X.1d2 r1 = new X.1d2     // Catch: java.lang.Exception -> L7f
            r1.<init>(r6)     // Catch: java.lang.Exception -> L7f
            r0 = 5
            r5.LJLIL = r0     // Catch: java.lang.Exception -> L7f
            java.lang.Object r0 = r2.emit(r1, r5)     // Catch: java.lang.Exception -> L7f
            if (r0 != r3) goto L97
            return r3
        L7f:
            com.bytedance.android.live.effect.filter.composerfilter.ComposerFilterViewModel r0 = r5.LJLILLLLZI
            X.XLL r2 = r0.LJLJI
            X.1cq r1 = new X.1cq
            java.lang.String r0 = "ERROR"
            r1.<init>(r4, r0)
            r0 = 6
            r5.LJLIL = r0
            java.lang.Object r0 = r2.emit(r1, r5)
            if (r0 != r3) goto L97
            return r3
        L94:
            X.C141335gf.LIZJ(r6)
        L97:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2FC.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
