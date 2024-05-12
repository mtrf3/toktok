package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.gamora.editor.audiometrics.AudioMetricsHelper$checkAndDetectOriginVideoAudioMetrics$1", f = "AudioMetricsHelper.kt", l = {65, 82}, m = "invokeSuspend")
/* renamed from: X.6jX, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C168596jX extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public Object LJLIL;
    public VideoPublishEditModel LJLILLLLZI;
    public Object LJLJI;
    public long LJLJJI;
    public int LJLJJL;
    public final /* synthetic */ VideoPublishEditModel LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C168596jX(VideoPublishEditModel videoPublishEditModel, InterfaceC67352kd<? super C168596jX> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJJLL = videoPublishEditModel;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C168596jX(this.LJLJJLL, interfaceC67352kd);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0097 -> B:6:0x001b). Please report as a decompilation issue!!! */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            X.NAu r9 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r10.LJLJJL
            r8 = 2
            r7 = 1
            if (r0 == 0) goto L26
            if (r0 == r7) goto L36
            if (r0 != r8) goto L9a
            long r2 = r10.LJLJJI
            java.lang.Object r6 = r10.LJLJI
            java.util.Iterator r6 = (java.util.Iterator) r6
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r4 = r10.LJLILLLLZI
            java.lang.Object r5 = r10.LJLIL
            java.lang.String r5 = (java.lang.String) r5
            X.C141335gf.LIZJ(r11)
        L1b:
            java.lang.String r11 = (java.lang.String) r11
            int r0 = r11.length()
            if (r0 != 0) goto L56
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L26:
            X.C141335gf.LIZJ(r11)
            r10.LJLJJL = r7
            java.lang.String r1 = ""
            java.lang.String r0 = "audio_metrics"
            java.lang.Object r11 = X.C141865hW.LIZ(r1, r0, r10)
            if (r11 != r9) goto L39
            return r9
        L36:
            X.C141335gf.LIZJ(r11)
        L39:
            java.lang.String r11 = (java.lang.String) r11
            int r0 = r11.length()
            if (r0 != 0) goto L44
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L44:
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r10.LJLJJLL
            com.ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo r0 = r0.getPreviewInfo()
            java.util.List r0 = r0.getVideoList()
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r4 = r10.LJLJJLL
            java.util.Iterator r6 = r0.iterator()
            r5 = r11
            goto L59
        L56:
            X.C168636jb.LIZJ(r7, r2, r4, r11)
        L59:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto La2
            java.lang.Object r1 = r6.next()
            com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment r1 = (com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment) r1
            boolean r0 = r4.realHasOriginalSound()
            if (r0 == 0) goto L72
            java.lang.String r1 = r1.getAudioPath()
        L6f:
            if (r1 != 0) goto L81
            goto L59
        L72:
            boolean r0 = r4.isFastImport
            if (r0 != 0) goto L7c
            boolean r0 = r4.isCutSameVideoType()
            if (r0 == 0) goto L59
        L7c:
            java.lang.String r1 = r1.getVideoPath()
            goto L6f
        L81:
            long r2 = java.lang.System.currentTimeMillis()
            java.lang.String r0 = X.C168626ja.LIZJ()
            r10.LJLIL = r5
            r10.LJLILLLLZI = r4
            r10.LJLJI = r6
            r10.LJLJJI = r2
            r10.LJLJJL = r8
            java.lang.Object r11 = X.C169616lB.LIZIZ(r1, r5, r0, r10)
            if (r11 != r9) goto L1b
            return r9
        L9a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        La2:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C168596jX.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
