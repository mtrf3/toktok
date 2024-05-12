package X;

import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEEditorJniJNI;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegmentSticker;
import com.bytedance.ies.nle.editor_jni.NLEStyStickerAnim;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import kotlin.jvm.internal.o;

/* renamed from: X.4pF, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C121174pF extends AbstractC121974qX {
    public final C122024qc LIZIZ;

    public C121174pF(C122024qc params) {
        o.LJIIIZ(params, "params");
        this.LIZIZ = params;
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
        int i;
        nLETrackSlot.setLayer(this.LIZIZ.LIZIZ);
        nLETrackSlot.setStartTime(this.LIZIZ.LIZJ * 1000);
        long j = this.LIZIZ.LIZLLL;
        long j2 = -2;
        if (j != -2) {
            j2 = j * 1000;
        }
        nLETrackSlot.setEndTime(j2);
        float f = 2;
        nLETrackSlot.setTransformX((this.LIZIZ.LJ - 0.5f) * f);
        nLETrackSlot.setTransformY((0.5f - this.LIZIZ.LJFF) * f);
        nLETrackSlot.setRotation(this.LIZIZ.LJI);
        nLETrackSlot.setScale(this.LIZIZ.LJIIIIZZ);
        NLESegmentSticker LIZLLL = NLESegmentSticker.LIZLLL(nLETrackSlot.LJI());
        if (LIZLLL != null) {
            NLEEditorJniJNI.NLESegmentSticker_setAlpha(LIZLLL.LIZJ, LIZLLL, this.LIZIZ.LJII);
            C121194pH c121194pH = this.LIZIZ.LJIIIZ;
            if (c121194pH == null) {
                NLEEditorJniJNI.NLESegmentSticker_setAnimation(LIZLLL.LIZJ, LIZLLL, 0L, null);
                return;
            }
            if (LIZLLL.LJ() == null) {
                NLEStyStickerAnim nLEStyStickerAnim = new NLEStyStickerAnim();
                NLEEditorJniJNI.NLESegmentSticker_setAnimation(LIZLLL.LIZJ, LIZLLL, nLEStyStickerAnim.LIZ, nLEStyStickerAnim);
            }
            NLEStyStickerAnim sAnim = LIZLLL.LJ();
            o.LJIIIIZZ(sAnim, "sAnim");
            int i2 = 0;
            if (c121194pH.LIZJ != null) {
                i = (int) (r0.intValue() * 1000);
            } else {
                i = 0;
            }
            NLEEditorJniJNI.NLEStyStickerAnim_setInDuration(sAnim.LIZ, sAnim, i);
            if (c121194pH.LJ != null) {
                i2 = (int) (r0.intValue() * 1000);
            }
            NLEEditorJniJNI.NLEStyStickerAnim_setOutDuration(sAnim.LIZ, sAnim, i2);
            NLEEditorJniJNI.NLEStyStickerAnim_setLoop(sAnim.LIZ, sAnim, c121194pH.LIZ);
            String str = c121194pH.LIZIZ;
            if (str != null) {
                if (sAnim.LIZ() == null) {
                    NLEResourceNode nLEResourceNode = new NLEResourceNode();
                    NLEEditorJniJNI.NLEStyStickerAnim_setInAnim(sAnim.LIZ, sAnim, NLEResourceNode.LIZ(nLEResourceNode), nLEResourceNode);
                }
                NLEResourceNode LIZ = sAnim.LIZ();
                o.LJIIIIZZ(LIZ, "sAnim.inAnim");
                LIZ.LJIIIZ(str);
            }
            String str2 = c121194pH.LIZLLL;
            if (str2 == null) {
                return;
            }
            if (sAnim.LIZLLL() == null) {
                NLEResourceNode nLEResourceNode2 = new NLEResourceNode();
                NLEEditorJniJNI.NLEStyStickerAnim_setOutAnim(sAnim.LIZ, sAnim, NLEResourceNode.LIZ(nLEResourceNode2), nLEResourceNode2);
            }
            NLEResourceNode LIZLLL2 = sAnim.LIZLLL();
            o.LJIIIIZZ(LIZLLL2, "sAnim.outAnim");
            LIZLLL2.LJIIIZ(str2);
        }
    }
}
