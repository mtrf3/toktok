package X;

import android.text.TextUtils;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEEditorJniJNI;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegmentHDRFilter;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import java.util.Iterator;
import kotlin.jvm.internal.AqS133S0200000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.4pg, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C121444pg extends AbstractC121974qX {
    public final C121464pi LIZIZ;

    public C121444pg(C121464pi c121464pi) {
        this.LIZIZ = c121464pi;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v1, types: [T, com.bytedance.ies.nle.editor_jni.NLETrackSlot, java.lang.Object] */
    @Override // X.AbstractC121974qX
    public final void LIZJ(NLEEditor nleEditor) {
        Object obj;
        boolean z;
        String str;
        String str2;
        NLETrackSlot it;
        o.LJIIIZ(nleEditor, "nleEditor");
        C68322mC c68322mC = new C68322mC();
        c68322mC.element = null;
        Iterator LIZ = C0FS.LIZ(nleEditor, "nleEditor.model", "nleEditor.model.tracks");
        while (true) {
            if (LIZ.hasNext()) {
                obj = LIZ.next();
                NLETrack it2 = (NLETrack) obj;
                o.LJIIIIZZ(it2, "it");
                if (o.LJ(C77357UXp.LJIIZILJ(it2), EnumC121544pq.HDR.name())) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        NLETrack nLETrack = (NLETrack) obj;
        boolean z2 = true;
        if (nLETrack != null) {
            Iterator<NLETrackSlot> it3 = nLETrack.LJIILL().iterator();
            loop1: while (true) {
                z = false;
                while (it3.hasNext()) {
                    it = it3.next();
                    o.LJIIIIZZ(it, "it");
                    NLESegmentHDRFilter LJIIIIZZ = NLESegmentHDRFilter.LJIIIIZZ(it.LJI());
                    if (LJIIIIZZ != null) {
                        if (o.LJ(LJIIIIZZ.LJFF(), NLEEditorJniJNI.NLEFilterName_getVIDEO_LENS_HDR())) {
                            c68322mC.element = it;
                            z = true;
                        } else if (o.LJ(LJIIIIZZ.LJFF(), NLEEditorJniJNI.NLEFilterName_getLENS_HDR())) {
                            break;
                        }
                    }
                }
                c68322mC.element = it;
            }
        } else {
            z = false;
            nLETrack = null;
        }
        StringBuilder sb = new StringBuilder(" 1.find track ");
        if (nLETrack != null) {
            str = nLETrack.getName();
        } else {
            str = null;
        }
        sb.append(str);
        sb.append(" theSlot ");
        NLENode nLENode = (NLENode) c68322mC.element;
        if (nLENode != null) {
            str2 = nLENode.getName();
        } else {
            str2 = null;
        }
        sb.append(str2);
        sb.append(" isSingle ");
        sb.append(z);
        LJFF(sb.toString());
        if (c68322mC.element != 0) {
            if (z != (this.LIZIZ instanceof C121454ph)) {
                z2 = false;
            } else {
                LJFF(" 1.isTypeMatch yes");
            }
        }
        if (!this.LIZIZ.LIZ || !z2) {
            if (nLETrack != null) {
                c68322mC.element = null;
                NLEModel LJ = nleEditor.LJ();
                if (LJ != null) {
                    LJ.removeTrack(nLETrack);
                }
                LJFF(" 2.close remove track");
            } else {
                LJFF(" 2.close do nothing");
            }
        }
        C121464pi c121464pi = this.LIZIZ;
        if (c121464pi.LIZ) {
            if (TextUtils.isEmpty(c121464pi.LIZIZ)) {
                LJI(" 2.hdrParams.lens isEmpty");
                return;
            }
            if (nLETrack == null) {
                nLETrack = new NLETrack();
                C77357UXp.LJJJJLI(nLETrack, EnumC121544pq.HDR.name());
                NLEModel LJ2 = nleEditor.LJ();
                if (LJ2 != null) {
                    LJ2.addTrack(nLETrack);
                }
                LJFF(" 2.open add track");
            } else {
                LJFF(" 2.open track good");
            }
            NLETrackSlot nLETrackSlot = (NLETrackSlot) c68322mC.element;
            if (nLETrackSlot != null) {
                if (this.LIZIZ instanceof C121454ph) {
                    o.LJI(nLETrackSlot);
                    LJII(nLETrackSlot, (C121454ph) this.LIZIZ);
                    return;
                }
                o.LJI(nLETrackSlot);
                C121464pi c121464pi2 = this.LIZIZ;
                NLESegmentHDRFilter LJIIIIZZ2 = NLESegmentHDRFilter.LJIIIIZZ(nLETrackSlot.LJI());
                if (LJIIIIZZ2 == null) {
                    return;
                }
                NLEResourceNode LJ3 = LJIIIIZZ2.LJ();
                o.LJIIIIZZ(LJ3, "it.effectSDKFilter");
                LJ3.LJIIIZ(c121464pi2.LIZIZ);
                return;
            }
            if (this.LIZIZ instanceof C121454ph) {
                AqS133S0200000_2 aqS133S0200000_2 = new AqS133S0200000_2(this, c68322mC, 115);
                NLETrackSlot nLETrackSlot2 = new NLETrackSlot();
                NLESegmentHDRFilter nLESegmentHDRFilter = new NLESegmentHDRFilter();
                NLEResourceNode nLEResourceNode = new NLEResourceNode();
                nLEResourceNode.LJIILIIL(EnumC123874tb.FILTER);
                nLESegmentHDRFilter.LJI(nLEResourceNode);
                NLEEditorJniJNI.NLESegmentFilter_setIntensity(nLESegmentHDRFilter.LIZJ, nLESegmentHDRFilter, 1.0f);
                nLESegmentHDRFilter.LJII(NLEEditorJniJNI.NLEFilterName_getVIDEO_LENS_HDR());
                nLETrackSlot2.LJIIL(nLESegmentHDRFilter);
                nLETrack.LIZIZ(nLETrackSlot2);
                aqS133S0200000_2.invoke(nLETrackSlot2);
                return;
            }
            AqS133S0200000_2 aqS133S0200000_22 = new AqS133S0200000_2(this, c68322mC, 116);
            NLETrackSlot nLETrackSlot3 = new NLETrackSlot();
            NLESegmentHDRFilter nLESegmentHDRFilter2 = new NLESegmentHDRFilter();
            NLEResourceNode nLEResourceNode2 = new NLEResourceNode();
            nLEResourceNode2.LJIILIIL(EnumC123874tb.FILTER);
            nLESegmentHDRFilter2.LJI(nLEResourceNode2);
            NLEEditorJniJNI.NLESegmentFilter_setIntensity(nLESegmentHDRFilter2.LIZJ, nLESegmentHDRFilter2, 1.0f);
            nLESegmentHDRFilter2.LJII(NLEEditorJniJNI.NLEFilterName_getLENS_HDR());
            nLETrackSlot3.LJIIL(nLESegmentHDRFilter2);
            nLETrack.LIZIZ(nLETrackSlot3);
            aqS133S0200000_22.invoke(nLETrackSlot3);
        }
    }

    public static void LJII(NLETrackSlot nLETrackSlot, C121454ph c121454ph) {
        NLESegmentHDRFilter LJIIIIZZ = NLESegmentHDRFilter.LJIIIIZZ(nLETrackSlot.LJI());
        if (LJIIIIZZ != null) {
            NLEResourceNode LJ = LJIIIIZZ.LJ();
            o.LJIIIIZZ(LJ, "seg.effectSDKFilter");
            LJ.LJIIIZ(c121454ph.LIZIZ);
            NLEEditorJniJNI.NLESegmentHDRFilter_setFrameType(LJIIIIZZ.LJ, LJIIIIZZ, c121454ph.LIZJ);
            NLEEditorJniJNI.NLESegmentHDRFilter_setFilePath(LJIIIIZZ.LJ, LJIIIIZZ, c121454ph.LIZLLL);
            NLEEditorJniJNI.NLESegmentHDRFilter_setDenoise(LJIIIIZZ.LJ, LJIIIIZZ, !c121454ph.LJ);
            Integer num = c121454ph.LJFF;
            if (num != null) {
                NLEEditorJniJNI.NLESegmentHDRFilter_setAsfMode(LJIIIIZZ.LJ, LJIIIIZZ, num.intValue());
            }
            Integer num2 = c121454ph.LJI;
            if (num2 != null) {
                NLEEditorJniJNI.NLESegmentHDRFilter_setHdrMode(LJIIIIZZ.LJ, LJIIIIZZ, num2.intValue());
            }
        }
    }
}
