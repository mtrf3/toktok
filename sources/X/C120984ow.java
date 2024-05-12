package X;

import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.4ow, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C120984ow {
    public static final /* synthetic */ int LIZIZ = 0;
    public final java.util.Map<String, NLETrackSlot> LIZ = new LinkedHashMap();

    public static NLETrackSlot LIZ(NLETrackSlot nLETrackSlot, NLETrack nLETrack) {
        NLETrackSlot nLETrackSlot2 = null;
        if (!nLETrackSlot.hasExtra("extra_associated_vc_slot_id")) {
            return null;
        }
        String extra = nLETrackSlot.getExtra("extra_associated_vc_slot_id");
        Iterator<NLETrackSlot> it = nLETrack.LJIILL().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            NLETrackSlot next = it.next();
            if (o.LJ(next.getUUID(), extra)) {
                nLETrackSlot2 = next;
                break;
            }
        }
        return nLETrackSlot2;
    }
}
