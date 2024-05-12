package X;

import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegmentTransition;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import kotlin.jvm.internal.o;

/* renamed from: X.4p6, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C121084p6 {
    public static C122864ry LIZ(NLETrackSlot slot, NLESegmentVideo nLESegmentVideo) {
        long j;
        EnumC123874tb enumC123874tb;
        boolean z;
        o.LJIIIZ(slot, "slot");
        long LJIILIIL = nLESegmentVideo.LJIILIIL();
        long duration = nLESegmentVideo.getDuration();
        float LIZ = C124574uj.LIZ(nLESegmentVideo);
        NLESegmentTransition LIZLLL = slot.LIZLLL();
        if (LIZLLL != null && LIZLLL.LJ()) {
            j = LIZLLL.LJFF();
        } else {
            j = 0;
        }
        String LIZJ = C5DZ.LIZJ(slot);
        long startTime = slot.getStartTime();
        long endTime = slot.getEndTime();
        NLEResourceNode LIZIZ = nLESegmentVideo.LIZIZ();
        if (LIZIZ != null) {
            enumC123874tb = LIZIZ.LJFF();
        } else {
            enumC123874tb = null;
        }
        if (enumC123874tb == EnumC123874tb.IMAGE) {
            z = true;
        } else {
            z = false;
        }
        return new C122864ry(nLESegmentVideo, LJIILIIL, duration, LIZJ, LIZ, j, startTime, endTime, z);
    }
}
