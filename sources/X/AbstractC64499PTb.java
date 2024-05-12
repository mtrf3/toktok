package X;

import com.bytedance.ies.nle.editor_jni.NLESegment;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.vega.nletodraft.model.Text;

/* renamed from: X.PTb, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract class AbstractC64499PTb extends AbstractC64500PTc<Text> {
    public final NLETrack LIZ;
    public final NLETrackSlot LIZIZ;
    public final NLESegment LIZJ;

    public abstract int LIZ();

    public abstract double LIZIZ();

    public abstract String LIZJ();

    public abstract String LIZLLL();

    public abstract int LJ();

    public abstract String LJFF();

    public abstract String LJI();

    public AbstractC64499PTb(NLETrack nLETrack, NLETrackSlot nLETrackSlot, NLESegment nLESegment) {
        super(nLETrack, nLETrackSlot, nLESegment);
        this.LIZ = nLETrack;
        this.LIZIZ = nLETrackSlot;
        this.LIZJ = nLESegment;
    }
}
