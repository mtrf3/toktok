package X;

import com.bytedance.ies.nle.editor_jni.NLESegment;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.vega.nletodraft.model.Audio;
import com.vega.nletodraft.model.TimeRange;
import kotlin.jvm.internal.AqS161S0100000_11;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public abstract class PTX extends AbstractC64500PTc<Audio> {
    public final NLETrack LIZ;
    public final NLETrackSlot LIZIZ;
    public final NLESegment LIZJ;
    public final C62822Ol8 LIZLLL;

    public abstract TimeRange LIZ();

    public abstract float LIZIZ();

    public abstract float LIZLLL();

    public final String LIZJ(String filePath) {
        o.LJIIIZ(filePath, "filePath");
        String extra = this.LIZ.getExtra("AudioTrackType");
        if (o.LJ(extra, "BGM")) {
            return "music";
        }
        if (o.LJ(extra, "SOUND_EFFECT")) {
            return "sound";
        }
        return "record";
    }

    public PTX(NLETrack nLETrack, NLETrackSlot nLETrackSlot, NLESegment nLESegment) {
        super(nLETrack, nLETrackSlot, nLESegment);
        this.LIZ = nLETrack;
        this.LIZIZ = nLETrackSlot;
        this.LIZJ = nLESegment;
        this.LIZLLL = C221108m2.LIZIZ(new AqS161S0100000_11(this, 104));
    }
}
