package X;

import com.ss.android.ugc.aweme.shortvideo.edit.CompileProbeConfigV2;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.jvm.internal.o;

/* renamed from: X.HlR, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45005HlR extends AbstractC45018Hle {
    public final InterfaceC88472Yns<VideoPublishEditModel, InterfaceC147355qN> LIZIZ;
    public CompileProbeConfigV2 LIZJ;

    public C45005HlR(C45008HlU getVideoSizeProvider) {
        o.LJIIIZ(getVideoSizeProvider, "getVideoSizeProvider");
        this.LIZIZ = getVideoSizeProvider;
    }

    @Override // X.AbstractC45018Hle
    public final boolean LIZIZ(VideoPublishEditModel model) {
        o.LJIIIZ(model, "model");
        CompileProbeConfigV2 LIZ = C44792Hi0.LIZ();
        this.LIZJ = LIZ;
        if (LIZ == null) {
            return false;
        }
        return H7R.LJJLIIIJ(model);
    }

    @Override // X.AbstractC45018Hle
    public final void LIZJ(VideoPublishEditModel model) {
        o.LJIIIZ(model, "model");
        C68322mC c68322mC = new C68322mC();
        if (this.LIZ == null) {
            this.LIZ = new C45017Hld(new C45011HlX(model, this, c68322mC), new C45006HlS(c68322mC), new C45002HlO(model));
        }
    }
}
