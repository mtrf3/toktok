package dmt.av.video;

import X.AbstractC45018Hle;
import X.C44792Hi0;
import X.C45004HlQ;
import X.C45005HlR;
import X.C45008HlU;
import X.C45009HlV;
import X.H7B;
import X.InterfaceC140165em;
import androidx.lifecycle.ViewModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class CompileProbeViewModel extends ViewModel {
    public AbstractC45018Hle LJLIL;

    public final InterfaceC140165em gv0(VideoPublishEditModel model) {
        AbstractC45018Hle c45004HlQ;
        o.LJIIIZ(model, "model");
        AbstractC45018Hle abstractC45018Hle = this.LJLIL;
        if (abstractC45018Hle != null) {
            return abstractC45018Hle;
        }
        H7B.LIZJ("CompileProbeViewModel -> init");
        if (C44792Hi0.LIZ() != null) {
            H7B.LIZJ("CompileProbeViewModel -> CompileProbeV2");
            c45004HlQ = new C45005HlR(C45008HlU.LJLIL);
        } else {
            H7B.LIZJ("CompileProbeViewModel -> CompileProbe");
            c45004HlQ = new C45004HlQ(C45009HlV.LJLIL);
        }
        this.LJLIL = c45004HlQ;
        return c45004HlQ;
    }
}
