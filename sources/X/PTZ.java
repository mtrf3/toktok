package X;

import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.vega.nletodraft.model.TimeRange;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class PTZ extends PTY {
    public final float LJI;
    public final float LJII;
    public final TimeRange LJIIIIZZ;

    @Override // X.PTY
    public final TimeRange LIZJ() {
        return this.LJIIIIZZ;
    }

    @Override // X.PTY
    public final float LIZLLL() {
        return this.LJI;
    }

    @Override // X.PTY
    public final float LJ() {
        return this.LJII;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PTZ(NLETrack nLETrack, NLETrackSlot nLETrackSlot, NLESegmentVideo nLESegmentVideo, boolean z, NLEModel nleModel) {
        super(nLETrack, nLETrackSlot, nLESegmentVideo, z, nleModel);
        boolean z2;
        float f;
        o.LJIIIZ(nleModel, "nleModel");
        Float valueOf = Float.valueOf(Math.abs(nLESegmentVideo.getSpeed()));
        if (valueOf.floatValue() > 0.0f) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            f = valueOf.floatValue();
        } else {
            f = 1.0f;
        }
        this.LJI = f;
        this.LJII = nLESegmentVideo.LJIILJJIL();
        Long valueOf2 = Long.valueOf(nLESegmentVideo.LJIILIIL());
        this.LJIIIIZZ = new TimeRange(valueOf2.longValue() >= 0 ? valueOf2.longValue() : 0L, ((float) this.LIZIZ.getDuration()) * f);
    }
}
