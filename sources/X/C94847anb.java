package X;

import com.ss.android.ugc.aweme.search.pages.voice.musicsearch.ui.assem.MusicRecognitionStatusTextAssem;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.search.pages.voice.musicsearch.ui.assem.MusicRecognitionStatusTextAssem$startDotUpdateJob$1", f = "MusicRecognitionStatusTextAssem.kt", l = {90}, m = "invokeSuspend")
/* renamed from: X.anb, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94847anb extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ MusicRecognitionStatusTextAssem LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C94847anb(MusicRecognitionStatusTextAssem musicRecognitionStatusTextAssem, InterfaceC67352kd<? super C94847anb> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = musicRecognitionStatusTextAssem;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C94847anb(this.LJLILLLLZI, interfaceC67352kd);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:8:0x0022 -> B:5:0x000c). Please report as a decompilation issue!!! */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            X.NAu r5 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r7.LJLIL
            r4 = 1
            if (r0 == 0) goto L4b
            if (r0 != r4) goto L4f
            X.C141335gf.LIZJ(r8)
        Lc:
            com.ss.android.ugc.aweme.search.pages.voice.musicsearch.ui.assem.MusicRecognitionStatusTextAssem r1 = r7.LJLILLLLZI
            int r0 = r1.LJLJI
            int r0 = r0 + 1
            int r0 = r0 % 4
            r1.LJLJI = r0
            com.bytedance.tux.input.TuxTextView r6 = r1.LJLJJLL
            if (r6 != 0) goto L25
        L1a:
            r7.LJLIL = r4
            r0 = 500(0x1f4, double:2.47E-321)
            java.lang.Object r0 = X.C1JD.LIZJ(r0, r7)
            if (r0 != r5) goto Lc
            return r5
        L25:
            android.content.Context r1 = r1.getContext()
            if (r1 == 0) goto L49
            r0 = 2131848812(0x7f116e6c, float:1.933114E38)
            java.lang.String r3 = r1.getString(r0)
            if (r3 == 0) goto L49
            com.ss.android.ugc.aweme.search.pages.voice.musicsearch.ui.assem.MusicRecognitionStatusTextAssem r0 = r7.LJLILLLLZI
            int r1 = r0.LJLJI
            java.lang.String r0 = "."
            java.lang.String r2 = ujb.o.LJJJJLI(r1, r0)
            r1 = 0
            java.lang.String r0 = "..."
            java.lang.String r0 = ujb.o.LJJJJZ(r3, r0, r2, r1)
        L45:
            r6.setText(r0)
            goto L1a
        L49:
            r0 = 0
            goto L45
        L4b:
            X.C141335gf.LIZJ(r8)
            goto L1a
        L4f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C94847anb.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
