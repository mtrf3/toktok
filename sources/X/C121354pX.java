package X;

import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEEditorJniJNI;
import com.bytedance.ies.nle.editor_jni.NLEFilter;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLEPoint;
import com.bytedance.ies.nle.editor_jni.NLESegmentAudio;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.4pX, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C121354pX extends AbstractC121974qX {
    public final C122004qa LIZIZ;

    public C121354pX(C122004qa params) {
        o.LJIIIZ(params, "params");
        this.LIZIZ = params;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(" 0.init ");
        LIZ.append(params);
        LJFF(X1D.LIZIZ(LIZ));
    }

    @Override // X.AbstractC121974qX
    public final void LIZJ(NLEEditor nleEditor) {
        o.LJIIIZ(nleEditor, "nleEditor");
        NLEModel LJ = nleEditor.LJ();
        o.LJIIIIZZ(LJ, "nleEditor.model");
        String str = this.LIZIZ.LIZIZ;
        o.LJI(str);
        NLETrackSlot LJIIL = C1DF.LJIIL(LJ, str);
        if (LJIIL != null) {
            LJII(LJIIL, this.LIZIZ);
        }
    }

    public static void LJII(NLETrackSlot nLETrackSlot, C122004qa params) {
        o.LJIIIZ(params, "params");
        NLESegmentAudio LIZLLL = NLESegmentAudio.LIZLLL(nLETrackSlot.LJI());
        if (LIZLLL != null) {
            LIZLLL.LJIJJLI(params.LIZJ * 1000);
            LIZLLL.LJIJJ(params.LIZLLL * 1000);
            double d = params.LJII;
            if (d > 0 && params.LJI <= 1) {
                LIZLLL.LJIILLIIL(d);
            }
            LIZLLL.LJIL(params.LJI);
            LIZLLL.setSpeed(params.LJIIIIZZ);
            LIZLLL.LJIJI(params.LJIIIZ);
            List<NLEPoint> list = params.LJIIJ;
            if (list != null) {
                NLEEditorJniJNI.NLESegmentAudio_clearCurveSpeedPoint(LIZLLL.LIZJ, LIZLLL);
                Iterator it = ((ArrayList) list).iterator();
                while (it.hasNext()) {
                    NLEPoint nLEPoint = (NLEPoint) it.next();
                    NLEEditorJniJNI.NLESegmentAudio_addCurveSpeedPoint(LIZLLL.LIZJ, LIZLLL, NLEPoint.LIZ(nLEPoint), nLEPoint);
                }
            }
        }
        NLEEditorJniJNI.NLETrackSlot_clearFilter(nLETrackSlot.LIZ, nLETrackSlot);
        List<C122014qb> list2 = params.LJIIL;
        if (list2 != null) {
            Iterator it2 = ((ArrayList) list2).iterator();
            while (it2.hasNext()) {
                it2.next().getClass();
                if (!o.LJ(null, NLEEditorJniJNI.NLEFilterName_getAUDIO_VOLUME_FILTER())) {
                    o.LJ(null, "AudioFadeFilter");
                }
                NLEEditorJniJNI.NLETrackSlot_addFilter(nLETrackSlot.LIZ, nLETrackSlot, NLEFilter.LIZ(null), null);
            }
        }
        nLETrackSlot.setStartTime(params.LJ * 1000);
        long j = params.LJFF;
        long j2 = -2;
        if (j != -2) {
            j2 = j * 1000;
        }
        nLETrackSlot.setEndTime(j2);
    }
}
