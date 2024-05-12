package X;

import android.view.ScaleGestureDetector;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class WUX extends WXA {
    public boolean LJLIL = true;
    public boolean LJLILLLLZI = true;
    public final /* synthetic */ WUU LJLJI;

    public WUX(WUU wuu) {
        this.LJLJI = wuu;
    }

    @Override // X.WXB, X.WXG
    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        Boolean isRecording = this.LJLJI.getRecordControlApi().isRecording().LIZ();
        o.LJIIIIZZ(isRecording, "isRecording");
        if ((isRecording.booleanValue() && this.LJLILLLLZI) || (!isRecording.booleanValue() && this.LJLIL)) {
            G8U.LIZ(isRecording.booleanValue() ? 1 : 0, this.LJLJI.getShortVideoContext().LJI(), this.LJLJI.getShortVideoContext().shootWay, "pinch");
            if (isRecording.booleanValue()) {
                this.LJLILLLLZI = false;
            } else {
                this.LJLIL = false;
            }
        }
        return this instanceof W17;
    }
}
