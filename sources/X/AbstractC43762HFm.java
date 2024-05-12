package X;

import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.shortvideo.model.ExtractFramesModel;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/* renamed from: X.HFm, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC43762HFm implements HGP {
    public final C43771HFv LIZIZ;
    public ExtractFramesModel LIZ = new ExtractFramesModel(LIZ());
    public String LIZJ = UUID.randomUUID().toString();

    public abstract List<HFD> LIZIZ();

    public boolean LIZLLL() {
        return !(this instanceof C43761HFl);
    }

    public static boolean LIZJ() {
        if (Q7K.LIZIZ("close_vframe_upload", 0) != 0) {
            return false;
        }
        return true;
    }

    public void LJ() {
        this.LIZ = new ExtractFramesModel(LIZ());
        this.LIZJ = UUID.randomUUID().toString();
    }

    public AbstractC43762HFm(CreativeInfo creativeInfo) {
        this.LIZIZ = new C43771HFv(creativeInfo);
    }

    public void LJFF(HGQ hgq) {
        C41859Gbn LIZIZ = C1I0.LIZIZ();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("start extract frame for ");
        LIZ.append(LIZ());
        LIZIZ.LIZJ("extract_frame", X1D.LIZIZ(LIZ));
        C44422Hc2.LIZ("extracting_frame", LIZ());
        if (!LIZJ()) {
            hgq.onFinish(false);
            return;
        }
        this.LIZIZ.LIZLLL(LIZ(), this.LIZJ);
        this.LIZ.setExtractFramesDir(this.LIZIZ.LIZIZ);
        C78934UyQ.LJLIL.LJFF().getFrameVerificationService().onExtractFrameContextActive(LIZ(), this.LIZJ, this.LIZIZ.LIZIZ, "creationId not available currently.");
        this.LIZ.addFrameSegment(new ArrayList<>(), null, new ArrayList<>());
    }
}
