package X;

import android.view.View;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.search.pages.voice.core.ui.VoiceSearchContainerFragment$onViewCreated$1", f = "VoiceSearchContainerFragment.kt", l = {83}, m = "invokeSuspend")
/* renamed from: X.an3, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94813an3 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public int LJLILLLLZI;
    public Object LJLJI;
    public int LJLJJI;
    public final /* synthetic */ View LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C94813an3(View view, InterfaceC67352kd<? super C94813an3> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJJL = view;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C94813an3(this.LJLJJL, interfaceC67352kd);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002b A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:8:0x0029 -> B:5:0x0014). Please report as a decompilation issue!!! */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            X.NAu r6 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r7.LJLJJI
            r5 = 1
            if (r0 == 0) goto L2c
            if (r0 != r5) goto L37
            int r4 = r7.LJLILLLLZI
            int r3 = r7.LJLIL
            java.lang.Object r2 = r7.LJLJI
            android.view.View r2 = (android.view.View) r2
            X.C141335gf.LIZJ(r8)
        L14:
            com.ss.android.ugc.aweme.base.utils.KeyboardUtils.LIZIZ(r2)
            int r4 = r4 + 1
            if (r4 >= r3) goto L34
        L1b:
            r7.LJLJI = r2
            r7.LJLIL = r3
            r7.LJLILLLLZI = r4
            r7.LJLJJI = r5
            r0 = 300(0x12c, double:1.48E-321)
            java.lang.Object r0 = X.C1JD.LIZJ(r0, r7)
            if (r0 != r6) goto L14
            return r6
        L2c:
            X.C141335gf.LIZJ(r8)
            android.view.View r2 = r7.LJLJJL
            r4 = 0
            r3 = 2
            goto L1b
        L34:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L37:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C94813an3.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
