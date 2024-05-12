package X;

import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegmentInfoSticker;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import kotlin.jvm.internal.o;

/* renamed from: X.4pM, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C121244pM extends AbstractC121974qX {
    public final C121514pn LIZIZ;

    public C121244pM(C121514pn params) {
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
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(" 1.executeNLE ");
        LIZ.append(this.LIZIZ);
        LJFF(X1D.LIZIZ(LIZ));
        NLEModel LJ = nleEditor.LJ();
        o.LJIIIIZZ(LJ, "nleEditor.model");
        String str = this.LIZIZ.LIZ;
        o.LJI(str);
        NLETrackSlot LJIIL = C1DF.LJIIL(LJ, str);
        if (LJIIL != null) {
            LJII(LJIIL);
        }
    }

    public final void LJII(NLETrackSlot nLETrackSlot) {
        if (NLESegmentInfoSticker.LJFF(nLETrackSlot.LJI()) != null) {
            if (this.LIZIZ.LJIJ != null) {
                if (nLETrackSlot.LJII() == null) {
                    nLETrackSlot.LJIILIIL(new NLEResourceNode());
                }
                NLEResourceNode LJII = nLETrackSlot.LJII();
                o.LJIIIIZZ(LJII, "slot.pinAlgorithmFile");
                LJII.LJIIIZ(this.LIZIZ.LJIJ);
            } else {
                nLETrackSlot.LJIILIIL(null);
            }
        }
        new C121174pF(this.LIZIZ).LJII(nLETrackSlot);
    }
}
