package X;

import com.bytedance.ies.nle.editor_jni.NLEEditorJniJNI;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLESegmentAudio;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* renamed from: X.4oY, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C120744oY {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(NLEModel nLEModel) {
        VecNLETrackSPtr tracks = nLEModel.getTracks();
        if (tracks != null) {
            ArrayList arrayList = new ArrayList();
            Iterator<NLETrack> it = tracks.iterator();
            while (it.hasNext()) {
                NLETrack next = it.next();
                NLETrack it2 = next;
                o.LJIIIIZZ(it2, "it");
                if (it2.LJIIZILJ() == EnumC123864ta.AUDIO) {
                    arrayList.add(next);
                }
            }
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                NLETrack track = (NLETrack) it3.next();
                o.LJIIIIZZ(track, "track");
                if (new VecNLETrackSlotSPtr(NLEEditorJniJNI.NLETrack_getKeyframeSlots(track.LIZ, track)).size() > 0) {
                    NLEEditorJniJNI.NLETrack_clearKeyframeSlot(track.LIZ, track);
                    Iterator<NLETrackSlot> it4 = track.LJIILL().iterator();
                    while (it4.hasNext()) {
                        NLESegmentAudio LIZLLL = C62850Ola.LIZLLL(it4.next(), "slot");
                        if (LIZLLL != null) {
                            LIZLLL.LJIL(1.0f);
                        }
                    }
                }
            }
        }
    }
}
