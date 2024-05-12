package X;

import Y.AfS59S0100000_7;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;

/* renamed from: X.HlX, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final /* synthetic */ class C45011HlX extends TBS implements InterfaceC65784Pro<C76800UCe> {
    public final /* synthetic */ C68322mC<InterfaceC92693kP> LJLIL;
    public final /* synthetic */ VideoPublishEditModel LJLILLLLZI;
    public final /* synthetic */ C45005HlR LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C45011HlX(VideoPublishEditModel videoPublishEditModel, C45005HlR c45005HlR, C68322mC c68322mC) {
        super(0, C43383H0x.class, "realStart", "tryInitData$realStart(Lkotlin/jvm/internal/Ref$ObjectRef;Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;Lcom/ss/android/ugc/aweme/shortvideo/publish/CompileProbeV2;)V", 0);
        this.LJLIL = c68322mC;
        this.LJLILLLLZI = videoPublishEditModel;
        this.LJLJI = c45005HlR;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [T, X.3kP] */
    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        C68322mC<InterfaceC92693kP> c68322mC = this.LJLIL;
        VideoPublishEditModel videoPublishEditModel = this.LJLILLLLZI;
        C45005HlR c45005HlR = this.LJLJI;
        C5Z5.LIZ("HWCompileProbe ; Start");
        c68322mC.element = AbstractC73638SvC.LJI(new C45013HlZ(new C72242sW(), videoPublishEditModel, c45005HlR)).LJJIIJ(T16.LIZ()).LJIJJ(C73969T1h.LIZIZ()).LJJII(new AfS59S0100000_7(c45005HlR, 40), new AfS59S0100000_7(c45005HlR, 35));
        return C76800UCe.LIZ;
    }
}
