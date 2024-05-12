package X;

import Y.AfS59S0100000_7;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;

/* renamed from: X.HlW, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final /* synthetic */ class C45010HlW extends TBS implements InterfaceC65784Pro<C76800UCe> {
    public final /* synthetic */ C68322mC<InterfaceC92693kP> LJLIL;
    public final /* synthetic */ C45004HlQ LJLILLLLZI;
    public final /* synthetic */ VideoPublishEditModel LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C45010HlW(VideoPublishEditModel videoPublishEditModel, C45004HlQ c45004HlQ, C68322mC c68322mC) {
        super(0, C43383H0x.class, "realStart", "tryInitData$realStart(Lkotlin/jvm/internal/Ref$ObjectRef;Lcom/ss/android/ugc/aweme/shortvideo/publish/CompileProbeV1;Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;)V", 0);
        this.LJLIL = c68322mC;
        this.LJLILLLLZI = c45004HlQ;
        this.LJLJI = videoPublishEditModel;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [T, X.3kP] */
    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        C68322mC<InterfaceC92693kP> c68322mC = this.LJLIL;
        C45004HlQ c45004HlQ = this.LJLILLLLZI;
        VideoPublishEditModel videoPublishEditModel = this.LJLJI;
        C5Z5.LIZ("SWCompileProbe ; Start");
        c68322mC.element = AbstractC73638SvC.LJI(new C45012HlY(c45004HlQ, videoPublishEditModel, new C72242sW())).LJJIIJ(T16.LIZ()).LJIJJ(C73969T1h.LIZIZ()).LJJII(new AfS59S0100000_7(c45004HlQ, 38), new AfS59S0100000_7(c45004HlQ, 39));
        return C76800UCe.LIZ;
    }
}
