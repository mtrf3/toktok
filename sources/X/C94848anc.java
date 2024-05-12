package X;

import com.ss.android.ugc.aweme.search.pages.voice.musicsearch.ui.assem.MusicRecognitionStatusTextAssem;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.search.pages.voice.musicsearch.ui.assem.MusicRecognitionStatusTextAssem$startTimerJob$1", f = "MusicRecognitionStatusTextAssem.kt", l = {70}, m = "invokeSuspend")
/* renamed from: X.anc, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94848anc extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ MusicRecognitionStatusTextAssem LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C94848anc(MusicRecognitionStatusTextAssem musicRecognitionStatusTextAssem, InterfaceC67352kd<? super C94848anc> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = musicRecognitionStatusTextAssem;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C94848anc(this.LJLILLLLZI, interfaceC67352kd);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:8:0x0020 -> B:5:0x000c). Please report as a decompilation issue!!! */
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
            r5 = 1
            if (r0 == 0) goto L44
            if (r0 != r5) goto L48
            X.C141335gf.LIZJ(r8)
        Lc:
            com.ss.android.ugc.aweme.search.pages.voice.musicsearch.ui.assem.MusicRecognitionStatusTextAssem r1 = r7.LJLILLLLZI
            int r0 = r1.LJLJJL
            int r0 = r0 + 1
            r1.LJLJJL = r0
            com.bytedance.tux.input.TuxTextView r4 = r1.LJLJJLL
            if (r4 != 0) goto L23
        L18:
            r7.LJLIL = r5
            r0 = 1000(0x3e8, double:4.94E-321)
            java.lang.Object r0 = X.C1JD.LIZJ(r0, r7)
            if (r0 != r6) goto Lc
            return r6
        L23:
            android.content.Context r3 = r1.getContext()
            if (r3 == 0) goto L42
            java.lang.Object[] r2 = new java.lang.Object[r5]
            com.ss.android.ugc.aweme.search.pages.voice.musicsearch.ui.assem.MusicRecognitionStatusTextAssem r0 = r7.LJLILLLLZI
            int r0 = r0.LJLJJL
            java.lang.Integer r1 = new java.lang.Integer
            r1.<init>(r0)
            r0 = 0
            r2[r0] = r1
            r0 = 2131848810(0x7f116e6a, float:1.9331136E38)
            java.lang.String r0 = r3.getString(r0, r2)
        L3e:
            r4.setText(r0)
            goto L18
        L42:
            r0 = 0
            goto L3e
        L44:
            X.C141335gf.LIZJ(r8)
            goto L18
        L48:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C94848anc.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
