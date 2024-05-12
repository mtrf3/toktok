package X;

import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEEditorJniJNI;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegmentComposerFilter;
import com.bytedance.ies.nle.editor_jni.NLESegmentEffect;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.bytedance.ies.nle.editor_jni.VecString;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.4r8, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C122344r8 extends AbstractC121964qW<List<? extends C122334r7>> {
    public static List LIZIZ(NLEEditor nleEditor) {
        o.LJIIIZ(nleEditor, "nleEditor");
        ArrayList arrayList = new ArrayList();
        NLEModel LJ = nleEditor.LJ();
        o.LJIIIIZZ(LJ, "nleEditor.model");
        VecNLETrackSPtr tracks = LJ.getTracks();
        o.LJIIIIZZ(tracks, "nleEditor.model.tracks");
        ArrayList arrayList2 = new ArrayList();
        Iterator<NLETrack> it = tracks.iterator();
        while (it.hasNext()) {
            NLETrack next = it.next();
            NLETrack it2 = next;
            o.LJIIIIZZ(it2, "it");
            if (o.LJ(C77357UXp.LJIILLIIL(it2), "NORMAL")) {
                arrayList2.add(next);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            NLETrack it4 = (NLETrack) it3.next();
            o.LJIIIIZZ(it4, "it");
            ORS.LJJLIIIJILLIZJL(it4.LJIILLIIL(), arrayList3);
        }
        Iterator it5 = arrayList3.iterator();
        while (it5.hasNext()) {
            NLETrackSlot it6 = (NLETrackSlot) it5.next();
            o.LJIIIIZZ(it6, "it");
            NLESegmentEffect LIZLLL = NLESegmentEffect.LIZLLL(it6.LJI());
            if (LIZLLL != null) {
                C122334r7 c122334r7 = new C122334r7();
                NLEResourceNode LJ2 = LIZLLL.LJ();
                o.LJIIIIZZ(LJ2, "segment.effectSDKEffect");
                c122334r7.LIZLLL = LJ2.LIZJ();
                c122334r7.LJ = NLEEditorJniJNI.NLESegmentEffect_getEffectTag(LIZLLL.LIZJ, LIZLLL);
                LIZJ(c122334r7, LIZLLL, it6);
                arrayList.add(c122334r7);
            }
            NLESegmentComposerFilter LJIIIIZZ = NLESegmentComposerFilter.LJIIIIZZ(it6.LJI());
            if (LJIIIIZZ != null) {
                C122334r7 c122334r72 = new C122334r7();
                NLEResourceNode LJ3 = LJIIIIZZ.LJ();
                o.LJIIIIZZ(LJ3, "segment.effectSDKFilter");
                c122334r72.LIZLLL = LJ3.LIZJ();
                String str = (String) ORZ.LJLLLLLL(0, new VecString(NLEEditorJniJNI.NLESegmentComposerFilter_getEffectTags(LJIIIIZZ.LJ, LJIIIIZZ), true));
                if (str == null) {
                    str = "";
                }
                c122334r72.LJ = str;
                LIZJ(c122334r72, LJIIIIZZ, it6);
                arrayList.add(c122334r72);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x0163 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x018b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZJ(X.C122334r7 r9, com.bytedance.ies.nle.editor_jni.NLESegment r10, com.bytedance.ies.nle.editor_jni.NLETrackSlot r11) {
        /*
            Method dump skipped, instructions count: 532
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C122344r8.LIZJ(X.4r7, com.bytedance.ies.nle.editor_jni.NLESegment, com.bytedance.ies.nle.editor_jni.NLETrackSlot):void");
    }
}
