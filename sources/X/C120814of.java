package X;

import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLESegmentTimeEffect;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* renamed from: X.4of, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C120814of extends AbstractC121974qX {
    @Override // X.AbstractC121974qX
    public final void LIZ(InterfaceC126684y8 nleSession) {
        o.LJIIIZ(nleSession, "nleSession");
        nleSession.V8().prepare();
    }

    @Override // X.AbstractC121974qX
    public final void LIZJ(NLEEditor nleEditor) {
        NLETrack nLETrack;
        o.LJIIIZ(nleEditor, "nleEditor");
        NLEModel LJ = nleEditor.LJ();
        o.LJIIIIZZ(LJ, "nleEditor.model");
        VecNLETrackSPtr tracks = LJ.getTracks();
        o.LJIIIIZZ(tracks, "nleEditor.model.tracks");
        Iterator<NLETrack> it = tracks.iterator();
        loop0: while (true) {
            if (it.hasNext()) {
                nLETrack = it.next();
                NLETrack it2 = nLETrack;
                o.LJIIIIZZ(it2, "it");
                if (it2.LJII() == EnumC123864ta.EFFECT) {
                    VecNLETrackSlotSPtr LJIILL = it2.LJIILL();
                    if (LJIILL.isEmpty()) {
                        continue;
                    } else {
                        Iterator<NLETrackSlot> it3 = LJIILL.iterator();
                        while (it3.hasNext()) {
                            NLETrackSlot it4 = it3.next();
                            o.LJIIIIZZ(it4, "it");
                            if (NLESegmentTimeEffect.LIZLLL(it4.LJI()) != null) {
                                break loop0;
                            }
                        }
                    }
                }
            } else {
                nLETrack = null;
                break;
            }
        }
        nleEditor.LJ().removeTrack(nLETrack);
    }
}
