package X;

import Y.AgS110S0200000_7;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.model.ExtractFramesModel;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.HFo, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43764HFo extends AbstractC43762HFm {
    public final HG7 LIZLLL;
    public final VideoPublishEditModel LJ;

    @Override // X.HGP
    public final String LIZ() {
        return "extract_diy_prop_video";
    }

    @Override // X.AbstractC43762HFm
    public final boolean LIZLLL() {
        return false;
    }

    @Override // X.AbstractC43762HFm
    public final List<HFD> LIZIZ() {
        return HFQ.LIZ(this.LJ);
    }

    public final ExtractFramesModel LJI() {
        ExtractFramesModel extractFramesModel;
        InterfaceC65784Pro<ExtractFramesModel> interfaceC65784Pro = this.LIZLLL.LIZIZ;
        if ((interfaceC65784Pro != null && (extractFramesModel = interfaceC65784Pro.invoke()) != null) || (extractFramesModel = this.LJ.extractFramesModel) != null) {
            int i = HGG.LIZ[this.LIZLLL.LIZ.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    extractFramesModel = this.LJ.extractFramesModel;
                    if (extractFramesModel == null) {
                        "Required value was null.".toString();
                        throw new IllegalArgumentException("Required value was null.");
                    }
                } else {
                    throw new C162476Zf();
                }
            }
            return extractFramesModel;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    @Override // X.AbstractC43762HFm
    public final void LJFF(HGQ hgq) {
        super.LJFF(hgq);
        if (!AbstractC43762HFm.LIZJ()) {
            return;
        }
        C10K.LIZJ(new CallableC43759HFj(this)).LIZLLL(new AgS110S0200000_7((HGD) hgq, this, 21));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C43764HFo(HG7 hg7, VideoPublishEditModel videoPublishEditModel) {
        super(videoPublishEditModel.creativeInfo);
        o.LJIIIZ(videoPublishEditModel, "videoPublishEditModel");
        this.LIZLLL = hg7;
        this.LJ = videoPublishEditModel;
    }
}
