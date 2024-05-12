package X;

import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEEditorJniJNI;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLEResourceAV;
import com.bytedance.ies.nle.editor_jni.NLESegmentImageVideoAnimation;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.NLEVideoAnimation;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* renamed from: X.4oa, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C120764oa extends AbstractC121974qX {
    public final C122104qk LIZIZ;

    public C120764oa(C122104qk c122104qk) {
        this.LIZIZ = c122104qk;
    }

    @Override // X.AbstractC121974qX
    public final void LIZJ(NLEEditor nleEditor) {
        NLETrack nLETrack;
        o.LJIIIZ(nleEditor, "nleEditor");
        NLEModel LJ = nleEditor.LJ();
        if (LJ != null) {
            nLETrack = LJ.getMainTrack();
        } else {
            nLETrack = null;
        }
        LJII(nLETrack);
    }

    public final void LJII(NLETrack nLETrack) {
        if (nLETrack != null) {
            Iterator<NLETrackSlot> it = nLETrack.LJIILLIIL().iterator();
            while (it.hasNext()) {
                NLETrackSlot slot = it.next();
                Iterator<C5K9> it2 = this.LIZIZ.LIZ.iterator();
                while (it2.hasNext()) {
                    C5K9 next = it2.next();
                    C120774ob c120774ob = next.LJIILL;
                    if (c120774ob != null) {
                        o.LJIIIIZZ(slot, "slot");
                        if (!o.LJ(slot.getName(), next.LIZ)) {
                            NLESegmentVideo LJJ = NLESegmentVideo.LJJ(slot.LJI());
                            if (LJJ != null) {
                                NLEResourceAV LJ = LJJ.LJ();
                                o.LJIIIIZZ(LJ, "it.avFile");
                                if (LJ.LIZJ().equals(next.LJIILIIL)) {
                                }
                            }
                        }
                        NLEVideoAnimation nLEVideoAnimation = new NLEVideoAnimation();
                        nLEVideoAnimation.setStartTime(c120774ob.LIZ * 1000);
                        nLEVideoAnimation.setEndTime(c120774ob.LIZIZ * 1000);
                        NLESegmentImageVideoAnimation nLESegmentImageVideoAnimation = new NLESegmentImageVideoAnimation();
                        NLEEditorJniJNI.NLESegmentImageVideoAnimation_setBeginScale(nLESegmentImageVideoAnimation.LJ, nLESegmentImageVideoAnimation, c120774ob.LIZJ);
                        NLEEditorJniJNI.NLESegmentImageVideoAnimation_setEndScale(nLESegmentImageVideoAnimation.LJ, nLESegmentImageVideoAnimation, c120774ob.LIZLLL);
                        NLEEditorJniJNI.NLEVideoAnimation_setSegment(nLEVideoAnimation.LIZ, nLEVideoAnimation, nLESegmentImageVideoAnimation.LIZJ, nLESegmentImageVideoAnimation);
                        NLEEditorJniJNI.NLETrackSlot_addVideoAnim(slot.LIZ, slot, NLEVideoAnimation.LIZ(nLEVideoAnimation), nLEVideoAnimation);
                    }
                }
            }
        }
    }
}
