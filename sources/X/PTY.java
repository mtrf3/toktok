package X;

import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegment;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.vega.nletodraft.model.TimeRange;
import com.vega.nletodraft.model.Video;
import kotlin.jvm.internal.AqS161S0100000_11;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public abstract class PTY extends AbstractC64500PTc<Video> {
    public final NLETrack LIZ;
    public final NLETrackSlot LIZIZ;
    public final NLESegment LIZJ;
    public final boolean LIZLLL;
    public final NLEModel LJ;
    public final C62822Ol8 LJFF;

    public abstract TimeRange LIZJ();

    public abstract float LIZLLL();

    public abstract float LJ();

    public final NLEResourceNode LIZ() {
        return (NLEResourceNode) this.LJFF.getValue();
    }

    public static final float LIZIZ(PTY pty, long j, long j2) {
        float canvasRatio = pty.LJ.getCanvasRatio();
        if (canvasRatio == 0.0f) {
            canvasRatio = 0.5625f;
        }
        float f = ((float) j) / ((float) j2);
        if (f > canvasRatio) {
            if (1.0f / f > canvasRatio) {
                return f;
            }
            return 1.0f / canvasRatio;
        }
        if (f >= canvasRatio) {
            return canvasRatio;
        }
        float f2 = 1.0f / f;
        if (f2 >= canvasRatio) {
            return canvasRatio;
        }
        return f2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PTY(NLETrack nLETrack, NLETrackSlot nLETrackSlot, NLESegment nLESegment, boolean z, NLEModel nleModel) {
        super(nLETrack, nLETrackSlot, nLESegment);
        o.LJIIIZ(nleModel, "nleModel");
        this.LIZ = nLETrack;
        this.LIZIZ = nLETrackSlot;
        this.LIZJ = nLESegment;
        this.LIZLLL = z;
        this.LJ = nleModel;
        this.LJFF = C221108m2.LIZIZ(new AqS161S0100000_11(this, 105));
    }
}
