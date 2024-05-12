package X;

import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegment;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.4oh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C120834oh {
    public static final /* synthetic */ int LIZ = 0;

    public static List LIZ(NLEModel nLEModel) {
        String extra;
        NLEResourceNode LIZIZ;
        ArrayList arrayList = new ArrayList();
        VecNLETrackSPtr tracks = nLEModel.getTracks();
        ArrayList LIZ2 = C07080Po.LIZ(tracks, "nleModel.tracks");
        Iterator<NLETrack> it = tracks.iterator();
        while (it.hasNext()) {
            NLETrack next = it.next();
            NLETrack it2 = next;
            o.LJIIIIZZ(it2, "it");
            if (C124574uj.LJJIJIL(it2)) {
                LIZ2.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it3 = LIZ2.iterator();
        while (it3.hasNext()) {
            ORS.LJJLIIIJILLIZJL(((NLETrack) it3.next()).LJIILL(), arrayList2);
        }
        Iterator it4 = arrayList2.iterator();
        while (it4.hasNext()) {
            NLETrackSlot nLETrackSlot = (NLETrackSlot) it4.next();
            if (nLETrackSlot.hasExtra("extra_origin_voice_file_path")) {
                extra = nLETrackSlot.getExtra("extra_origin_voice_file_path");
            } else {
                NLESegment LJI = nLETrackSlot.LJI();
                if (LJI != null && (LIZIZ = LJI.LIZIZ()) != null) {
                    extra = LIZIZ.LIZJ();
                }
            }
            if (extra != null) {
                arrayList.add(extra);
            }
        }
        return arrayList;
    }
}
