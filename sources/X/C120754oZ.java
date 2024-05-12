package X;

import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLESegmentTimeEffect;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* renamed from: X.4oZ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C120754oZ {
    public static final /* synthetic */ int LIZ = 0;

    public static NLETrackSlot LIZ(NLEEditor nLEEditor) {
        NLEModel LJ = nLEEditor.LJ();
        o.LJIIIIZZ(LJ, "nleEditor.model");
        Iterator<NLETrack> it = LJ.getTracks().iterator();
        while (it.hasNext()) {
            NLETrack track = it.next();
            o.LJIIIIZZ(track, "track");
            if (track.LJIIZILJ() == EnumC123864ta.EFFECT) {
                Iterator<NLETrackSlot> it2 = track.LJIILL().iterator();
                while (it2.hasNext()) {
                    NLETrackSlot slot = it2.next();
                    o.LJIIIIZZ(slot, "slot");
                    if (NLESegmentTimeEffect.LIZLLL(slot.LJI()) != null) {
                        return slot;
                    }
                }
            }
        }
        return null;
    }
}
