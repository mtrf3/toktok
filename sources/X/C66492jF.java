package X;

import com.ss.android.ugc.aweme.rss.link.ui.RssIntroAssem;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.rss.link.ui.RssIntroAssem$startNoVideoAnimation$1$1", f = "RssIntroAssem.kt", l = {220}, m = "invokeSuspend")
/* renamed from: X.2jF, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C66492jF extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public int LJLILLLLZI;
    public int LJLJI;
    public RssIntroAssem LJLJJI;
    public int LJLJJL;
    public final /* synthetic */ RssIntroAssem LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C66492jF(RssIntroAssem rssIntroAssem, InterfaceC67352kd<? super C66492jF> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJJLL = rssIntroAssem;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C66492jF(this.LJLJJLL, interfaceC67352kd);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0019, code lost:
    
        if (r4 >= r3) goto L13;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x002e -> B:5:0x0014). Please report as a decompilation issue!!! */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            X.NAu r6 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r7.LJLJJL
            r5 = 1
            if (r0 == 0) goto L30
            if (r0 != r5) goto L38
            int r4 = r7.LJLJI
            int r1 = r7.LJLILLLLZI
            int r3 = r7.LJLIL
            com.ss.android.ugc.aweme.rss.link.ui.RssIntroAssem r0 = r7.LJLJJI
            X.C141335gf.LIZJ(r8)
        L14:
            r0.v3(r4)
            int r4 = r1 + 1
            if (r4 >= r3) goto L33
        L1b:
            r7.LJLJJI = r0
            r7.LJLIL = r3
            r7.LJLILLLLZI = r4
            r7.LJLJI = r4
            r7.LJLJJL = r5
            r1 = 2000(0x7d0, double:9.88E-321)
            java.lang.Object r1 = X.C1JD.LIZJ(r1, r7)
            if (r1 != r6) goto L2e
            return r6
        L2e:
            r1 = r4
            goto L14
        L30:
            X.C141335gf.LIZJ(r8)
        L33:
            com.ss.android.ugc.aweme.rss.link.ui.RssIntroAssem r0 = r7.LJLJJLL
            r3 = 3
            r4 = 0
            goto L1b
        L38:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66492jF.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
