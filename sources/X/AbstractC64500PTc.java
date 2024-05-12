package X;

import com.bytedance.ies.nle.editor_jni.NLESegment;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.vega.nletodraft.model.TimeRange;

/* renamed from: X.PTc, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract class AbstractC64500PTc<T> {
    public AbstractC64500PTc(NLETrack nLETrack, NLETrackSlot nLETrackSlot, NLESegment nLESegment) {
        new TimeRange(nLETrackSlot.getStartTime(), nLETrackSlot.getDuration());
    }
}
