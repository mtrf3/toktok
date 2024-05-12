package X;

import com.ss.android.ugc.aweme.search.pages.voice.voicesearch.core.viewmodel.VoiceSearchViewModel;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.search.pages.voice.voicesearch.core.viewmodel.VoiceSearchViewModel$startDotUpdateJob$1", f = "VoiceSearchViewModel.kt", l = {178}, m = "invokeSuspend")
/* renamed from: X.apD, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94947apD extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ VoiceSearchViewModel LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C94947apD(VoiceSearchViewModel voiceSearchViewModel, InterfaceC67352kd<? super C94947apD> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = voiceSearchViewModel;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C94947apD(this.LJLILLLLZI, interfaceC67352kd);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0040 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0026  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x003e -> B:5:0x000c). Please report as a decompilation issue!!! */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            X.NAu r4 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r5.LJLIL
            r3 = 1
            if (r0 == 0) goto L41
            if (r0 != r3) goto L45
            X.C141335gf.LIZJ(r6)
        Lc:
            com.ss.android.ugc.aweme.search.pages.voice.voicesearch.core.viewmodel.VoiceSearchViewModel r1 = r5.LJLILLLLZI
            int r0 = r1.LJLJI
            int r0 = r0 + 1
            int r0 = r0 % 4
            r1.LJLJI = r0
            X.33Q r1 = r1.getState()
            X.afa r1 = (X.C94350afa) r1
            X.aev r0 = r1.LJLILLLLZI
            java.lang.String r0 = r0.LJLIL
            int r0 = r0.length()
            if (r0 != 0) goto L36
            int r0 = r1.LJLIL
            if (r0 != 0) goto L36
            com.ss.android.ugc.aweme.search.pages.voice.voicesearch.core.viewmodel.VoiceSearchViewModel r2 = r5.LJLILLLLZI
            kotlin.jvm.internal.IDqS419S0100000_42 r1 = new kotlin.jvm.internal.IDqS419S0100000_42
            r0 = 113(0x71, float:1.58E-43)
            r1.<init>(r2, r0)
            r2.setState(r1)
        L36:
            r5.LJLIL = r3
            r0 = 500(0x1f4, double:2.47E-321)
            java.lang.Object r0 = X.C1JD.LIZJ(r0, r5)
            if (r0 != r4) goto Lc
            return r4
        L41:
            X.C141335gf.LIZJ(r6)
            goto L36
        L45:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C94947apD.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
