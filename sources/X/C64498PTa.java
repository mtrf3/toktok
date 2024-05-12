package X;

import com.bytedance.ies.nle.editor_jni.NLESegmentAudio;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.vega.nletodraft.model.TimeRange;

/* renamed from: X.PTa, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64498PTa extends PTX {
    public final float LJ;
    public final float LJFF;
    public final TimeRange LJI;

    @Override // X.PTX
    public final TimeRange LIZ() {
        return this.LJI;
    }

    @Override // X.PTX
    public final float LIZIZ() {
        return this.LJ;
    }

    @Override // X.PTX
    public final float LIZLLL() {
        return this.LJFF;
    }

    public C64498PTa(NLETrack nLETrack, NLETrackSlot nLETrackSlot, NLESegmentAudio nLESegmentAudio) {
        super(nLETrack, nLETrackSlot, nLESegmentAudio);
        boolean z;
        float f;
        Float valueOf = Float.valueOf(Math.abs(nLESegmentAudio.getSpeed()));
        if (valueOf.floatValue() > 0.0f) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            f = valueOf.floatValue();
        } else {
            f = 1.0f;
        }
        this.LJ = f;
        this.LJFF = nLESegmentAudio.LJIILJJIL();
        Long valueOf2 = Long.valueOf(nLESegmentAudio.LJIILIIL());
        this.LJI = new TimeRange(valueOf2.longValue() >= 0 ? valueOf2.longValue() : 0L, ((float) this.LIZIZ.getDuration()) * f);
    }
}
