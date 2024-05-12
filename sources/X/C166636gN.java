package X;

import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegment;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import defpackage.e1;
import java.util.Iterator;

/* renamed from: X.6gN, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C166636gN {
    public static long LIZ;
    public static final /* synthetic */ int LIZIZ = 0;

    public static boolean LIZIZ() {
        if (e1.LIZ(31744, "enable_voice_conversion_effect", true, false) && !C1DG.LJIIIIZZ() && ((Number) C166656gP.LIZ.getValue()).intValue() == 2 && LIZ <= ((Number) C166676gR.LIZ.getValue()).intValue() * 1000) {
            return true;
        }
        return false;
    }

    public static void LIZ(NLEModel nLEModel) {
        NLETrack mainTrack;
        long j;
        NLEResourceNode LIZIZ2;
        long j2;
        long j3;
        NLEResourceNode LIZIZ3;
        long j4 = 0;
        if (e1.LIZ(31744, "vc_calculate_max_duration", true, false)) {
            LIZ = 0L;
            if (nLEModel != null) {
                j2 = nLEModel.getDuration() / 1000;
                NLETrack mainTrack2 = nLEModel.getMainTrack();
                if (mainTrack2 != null) {
                    Iterator<NLETrackSlot> it = mainTrack2.LJIILL().iterator();
                    j4 = 0;
                    while (it.hasNext()) {
                        NLESegment LJI = it.next().LJI();
                        if (LJI != null && (LIZIZ3 = LJI.LIZIZ()) != null) {
                            j3 = LIZIZ3.getDuration() / 1000;
                        } else {
                            j3 = 0;
                        }
                        if (j4 < j3) {
                            j4 = j3;
                        }
                    }
                }
                if (j2 < j4) {
                    j2 = j4;
                }
            } else {
                j2 = 0;
            }
            LIZ = j2;
            return;
        }
        LIZ = 0L;
        if (nLEModel != null && (mainTrack = nLEModel.getMainTrack()) != null) {
            Iterator<NLETrackSlot> it2 = mainTrack.LJIILL().iterator();
            while (it2.hasNext()) {
                NLETrackSlot next = it2.next();
                long j5 = LIZ;
                NLESegment LJI2 = next.LJI();
                if (LJI2 != null && (LIZIZ2 = LJI2.LIZIZ()) != null) {
                    j = LIZIZ2.getDuration() / 1000;
                } else {
                    j = 0;
                }
                LIZ = j5 + j;
            }
        }
    }
}
