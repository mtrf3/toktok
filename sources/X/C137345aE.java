package X;

import com.ss.android.ugc.aweme.services.audio.AudioWatermarkInfo;
import com.ss.android.ugc.gamora.editor.audioservice.service.watermark.AudioWatermarkServiceImpl;
import fjb.a;
import java.util.List;

@InterfaceC65848Psq(c = "com.ss.android.ugc.gamora.editor.audioservice.service.watermark.AudioWatermarkServiceImpl$fetchAudioWatermarkInfo$1", f = "AudioWatermarkServiceImpl.kt", l = {53, 54, 55}, m = "invokeSuspend")
/* renamed from: X.5aE, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C137345aE extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ AudioWatermarkServiceImpl LJLJI;
    public final /* synthetic */ List<String> LJLJJI;
    public final /* synthetic */ List<String> LJLJJL;
    public final /* synthetic */ C34K LJLJJLL;
    public final /* synthetic */ C68322mC<List<String>> LJLJL;
    public final /* synthetic */ C68322mC<List<String>> LJLJLJ;
    public final /* synthetic */ C68322mC<String> LJLJLLL;
    public final /* synthetic */ InterfaceC88472Yns<AudioWatermarkInfo, C76800UCe> LJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C137345aE(AudioWatermarkServiceImpl audioWatermarkServiceImpl, List<String> list, List<String> list2, C34K c34k, C68322mC<List<String>> c68322mC, C68322mC<List<String>> c68322mC2, C68322mC<String> c68322mC3, InterfaceC88472Yns<? super AudioWatermarkInfo, C76800UCe> interfaceC88472Yns, InterfaceC67352kd<? super C137345aE> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = audioWatermarkServiceImpl;
        this.LJLJJI = list;
        this.LJLJJL = list2;
        this.LJLJJLL = c34k;
        this.LJLJL = c68322mC;
        this.LJLJLJ = c68322mC2;
        this.LJLJLLL = c68322mC3;
        this.LJLL = interfaceC88472Yns;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C137345aE c137345aE = new C137345aE(this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, this.LJLJL, this.LJLJLJ, this.LJLJLLL, this.LJLL, interfaceC67352kd);
        c137345aE.LJLILLLLZI = obj;
        return c137345aE;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0080 A[RETURN] */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r16) {
        /*
            r15 = this;
            r8 = r16
            X.NAu r4 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            r5 = r15
            int r0 = r5.LJLIL
            r3 = 3
            r9 = 2
            r10 = 1
            r2 = 0
            if (r0 == 0) goto L19
            if (r0 == r10) goto L45
            if (r0 == r9) goto L5a
            if (r0 != r3) goto L81
            X.C141335gf.LIZJ(r8)
        L16:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L19:
            X.C141335gf.LIZJ(r8)
            java.lang.Object r8 = r5.LJLILLLLZI
            X.2pa r8 = (X.InterfaceC70422pa) r8
            X.5aF r6 = new X.5aF
            com.ss.android.ugc.gamora.editor.audioservice.service.watermark.AudioWatermarkServiceImpl r1 = r5.LJLJI
            java.util.List<java.lang.String> r0 = r5.LJLJJI
            r6.<init>(r1, r0, r2)
            X.XKn r7 = X.XKX.LIZIZ(r8, r2, r2, r6, r3)
            X.5aG r6 = new X.5aG
            com.ss.android.ugc.gamora.editor.audioservice.service.watermark.AudioWatermarkServiceImpl r1 = r5.LJLJI
            java.util.List<java.lang.String> r0 = r5.LJLJJL
            r6.<init>(r1, r0, r2)
            X.XKn r0 = X.XKX.LIZIZ(r8, r2, r2, r6, r3)
            r5.LJLILLLLZI = r0
            r5.LJLIL = r10
            java.lang.Object r8 = r7.LJJIJ(r5)
            if (r8 != r4) goto L4c
            return r4
        L45:
            java.lang.Object r0 = r5.LJLILLLLZI
            X.2mE r0 = (X.InterfaceC68342mE) r0
            X.C141335gf.LIZJ(r8)
        L4c:
            r7 = r8
            com.ss.android.ugc.aweme.services.audio.TtsCreatorInfo r7 = (com.ss.android.ugc.aweme.services.audio.TtsCreatorInfo) r7
            r5.LJLILLLLZI = r7
            r5.LJLIL = r9
            java.lang.Object r8 = r0.LJI(r5)
            if (r8 != r4) goto L61
            return r4
        L5a:
            java.lang.Object r7 = r5.LJLILLLLZI
            com.ss.android.ugc.aweme.services.audio.TtsCreatorInfo r7 = (com.ss.android.ugc.aweme.services.audio.TtsCreatorInfo) r7
            X.C141335gf.LIZJ(r8)
        L61:
            com.ss.android.ugc.aweme.services.audio.VcCreatorInfo r8 = (com.ss.android.ugc.aweme.services.audio.VcCreatorInfo) r8
            X.UtN r0 = X.C36636EZk.LIZ
            X.5aD r6 = new X.5aD
            X.34K r9 = r5.LJLJJLL
            X.2mC<java.util.List<java.lang.String>> r10 = r5.LJLJL
            X.2mC<java.util.List<java.lang.String>> r11 = r5.LJLJLJ
            X.2mC<java.lang.String> r12 = r5.LJLJLLL
            X.Yns<com.ss.android.ugc.aweme.services.audio.AudioWatermarkInfo, X.UCe> r13 = r5.LJLL
            r14 = r2
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14)
            r5.LJLILLLLZI = r2
            r5.LJLIL = r3
            java.lang.Object r0 = X.XKX.LJI(r0, r6, r5)
            if (r0 != r4) goto L16
            return r4
        L81:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C137345aE.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
