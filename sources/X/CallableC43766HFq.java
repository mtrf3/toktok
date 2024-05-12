package X;

import com.ss.android.ugc.aweme.shortvideo.model.ExtractFramesModel;
import com.ss.android.ugc.aweme.shortvideo.model.FrameItem;
import java.util.concurrent.Callable;

/* renamed from: X.HFq, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class CallableC43766HFq<V> implements Callable<Object> {
    public final /* synthetic */ C43786HGk LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ long LJLJI;
    public final /* synthetic */ int LJLJJI;
    public final /* synthetic */ String LJLJJL;

    public CallableC43766HFq(C43786HGk c43786HGk, String str, long j, int i, String str2) {
        this.LJLIL = c43786HGk;
        this.LJLILLLLZI = str;
        this.LJLJI = j;
        this.LJLJJI = i;
        this.LJLJJL = str2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        if (this.LJLILLLLZI != null) {
            ExtractFramesModel extractFramesModel = this.LJLIL.LIZ;
            FrameItem frameItem = new FrameItem(this.LJLILLLLZI, 0, 0, false, null, null, 62, null);
            frameItem.getTimeStamp();
            extractFramesModel.addEffectFrameAtLastSegment(frameItem);
        }
        if (this.LJLJJI == 0) {
            this.LJLIL.LJIIJ = true;
            ExtractFramesModel extractFramesModel2 = this.LJLIL.LIZ;
            FrameItem frameItem2 = new FrameItem(this.LJLJJL, 0, 0, false, null, null, 62, null);
            frameItem2.setTimeStamp(this.LJLJI);
            extractFramesModel2.addFrameAtLastSegment(frameItem2);
            return null;
        }
        C5NP LIZLLL = C82891Wg3.LIZLLL();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Default Frame Extractor Fail : ret ");
        LIZ.append(this.LJLJJI);
        LIZLLL.LIZ(X1D.LIZIZ(LIZ));
        return null;
    }
}
