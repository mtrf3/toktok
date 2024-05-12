package X;

import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.4sv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C123454sv {
    public static final java.util.Map<String, C5N5> LIZ = new LinkedHashMap();

    public static void LIZ(NLEEditor nleEditor) {
        o.LJIIIZ(nleEditor, "nleEditor");
        NLEModel LJ = nleEditor.LJ();
        o.LJIIIIZZ(LJ, "nleEditor.model");
        VecNLETrackSPtr tracks = LJ.getTracks();
        o.LJIIIIZZ(tracks, "nleEditor.model.tracks");
        ArrayList arrayList = new ArrayList();
        Iterator<NLETrack> it = tracks.iterator();
        while (it.hasNext()) {
            NLETrack next = it.next();
            NLETrack it2 = next;
            o.LJIIIIZZ(it2, "it");
            if (it2.LJIIJ() || (it2.hasExtra("track_extra_pip") && o.LJ(it2.getExtra("track_extra_pip"), "true"))) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            NLETrack it4 = (NLETrack) it3.next();
            o.LJIIIIZZ(it4, "it");
            ORS.LJJLIIIJILLIZJL(it4.LJIILL(), arrayList2);
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it5 = arrayList2.iterator();
        while (it5.hasNext()) {
            Object next2 = it5.next();
            NLETrackSlot it6 = (NLETrackSlot) next2;
            o.LJIIIIZZ(it6, "it");
            if (NLESegmentVideo.LJJ(it6.LJI()) != null) {
                arrayList3.add(next2);
            }
        }
        Iterator it7 = arrayList3.iterator();
        while (it7.hasNext()) {
            NLETrackSlot it8 = (NLETrackSlot) it7.next();
            o.LJIIIIZZ(it8, "it");
            NLESegmentVideo LJJ = NLESegmentVideo.LJJ(it8.LJI());
            if (LJJ != null) {
                LJJ.LJJIIJZLJL(true);
            }
        }
        nleEditor.LIZIZ();
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0287 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int LIZIZ(com.bytedance.ies.nle.editor_jni.NLEEditor r17, com.ss.android.vesdk.VETimelineParams r18) {
        /*
            Method dump skipped, instructions count: 668
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C123454sv.LIZIZ(com.bytedance.ies.nle.editor_jni.NLEEditor, com.ss.android.vesdk.VETimelineParams):int");
    }
}
