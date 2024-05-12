package X;

import com.ss.android.ugc.aweme.draft.model.DraftFileRestoreResult;
import fjb.a;
import java.util.List;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.tools.draft.operate.DraftFileRestoreHandlers$restore$2$deferredList$1$1", f = "IDraftFileRestoreHandler.kt", l = {118, 119, 122, 123}, m = "invokeSuspend")
/* renamed from: X.6jg, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C168686jg extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super List<? extends DraftFileRestoreResult>>, Object> {
    public Object LJLIL;
    public int LJLILLLLZI;
    public final /* synthetic */ InterfaceC168706ji LJLJI;
    public final /* synthetic */ C76732zl LJLJJI;
    public final /* synthetic */ int LJLJJL;
    public final /* synthetic */ C6ZN LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C168686jg(InterfaceC168706ji interfaceC168706ji, C76732zl c76732zl, int i, C6ZN c6zn, InterfaceC67352kd<? super C168686jg> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = interfaceC168706ji;
        this.LJLJJI = c76732zl;
        this.LJLJJL = i;
        this.LJLJJLL = c6zn;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C168686jg(this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, interfaceC67352kd);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0074 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0075  */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            X.NAu r5 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r10.LJLILLLLZI
            r6 = 0
            r8 = 4
            r2 = 3
            r1 = 2
            r7 = 1
            if (r0 == 0) goto L19
            if (r0 == r7) goto L27
            if (r0 == r1) goto L82
            if (r0 == r2) goto L58
            if (r0 != r8) goto L7a
            java.lang.Object r0 = r10.LJLIL
            X.C141335gf.LIZJ(r11)
        L18:
            return r0
        L19:
            X.C141335gf.LIZJ(r11)
            X.6ji r0 = r10.LJLJI
            r10.LJLILLLLZI = r7
            java.lang.Object r11 = r0.LIZLLL(r10)
            if (r11 != r5) goto L2a
            return r5
        L27:
            X.C141335gf.LIZJ(r11)
        L2a:
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r0 = r11.booleanValue()
            if (r0 == 0) goto L4d
            X.2zl r4 = r10.LJLJJI
            int r3 = r10.LJLJJL
            X.6ZN r2 = r10.LJLJJLL
            r10.LJLILLLLZI = r1
            X.XIF r1 = X.EXT.LIZ
            X.6ds r0 = new X.6ds
            r0.<init>(r4, r3, r2, r6)
            java.lang.Object r0 = X.XKX.LJI(r1, r0, r10)
            if (r0 != r5) goto L4a
        L47:
            if (r0 != r5) goto L85
            return r5
        L4a:
            X.UCe r0 = X.C76800UCe.LIZ
            goto L47
        L4d:
            X.6ji r0 = r10.LJLJI
            r10.LJLILLLLZI = r2
            java.lang.Object r11 = r0.LIZIZ(r10)
            if (r11 != r5) goto L5b
            return r5
        L58:
            X.C141335gf.LIZJ(r11)
        L5b:
            X.2zl r4 = r10.LJLJJI
            int r3 = r10.LJLJJL
            X.6ZN r2 = r10.LJLJJLL
            r10.LJLIL = r11
            r10.LJLILLLLZI = r8
            X.XIF r1 = X.EXT.LIZ
            X.6ds r0 = new X.6ds
            r0.<init>(r4, r3, r2, r6)
            java.lang.Object r0 = X.XKX.LJI(r1, r0, r10)
            if (r0 != r5) goto L75
        L72:
            if (r0 != r5) goto L78
            return r5
        L75:
            X.UCe r0 = X.C76800UCe.LIZ
            goto L72
        L78:
            r0 = r11
            goto L18
        L7a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L82:
            X.C141335gf.LIZJ(r11)
        L85:
            com.ss.android.ugc.aweme.draft.model.DraftFileRestoreResult[] r1 = new com.ss.android.ugc.aweme.draft.model.DraftFileRestoreResult[r7]
            com.ss.android.ugc.aweme.draft.model.DraftFileRestoreResult r2 = new com.ss.android.ugc.aweme.draft.model.DraftFileRestoreResult
            X.6ji r0 = r10.LJLJI
            int r3 = r0.LIZ()
            X.6ji r0 = r10.LJLJI
            int r4 = r0.getPriority()
            r5 = 0
            r6 = 0
            r8 = 28
            r7 = r5
            r9 = r5
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            r1[r6] = r2
            java.util.ArrayList r0 = X.C47261Igj.LJII(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C168686jg.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super List<? extends DraftFileRestoreResult>> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
