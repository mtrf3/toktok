package X;

import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.4oX, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C120734oX {
    public static final /* synthetic */ int LIZ = 0;

    public static List LIZ(NLEModel nLEModel) {
        List<NLETrack> LJIJI;
        ArrayList arrayList = new ArrayList();
        if (nLEModel != null && (LJIJI = C124574uj.LJIJI(nLEModel)) != null) {
            Iterator<NLETrack> it = LJIJI.iterator();
            while (it.hasNext()) {
                Iterator<NLETrackSlot> it2 = it.next().LJIILL().iterator();
                while (it2.hasNext()) {
                    NLETrackSlot next = it2.next();
                    NLESegmentVideo LJJ = NLESegmentVideo.LJJ(next.LJI());
                    if (LJJ != null && LJJ.LJ().LJFF() != EnumC123874tb.IMAGE && LJJ.LJIILJJIL() > 0.0f) {
                        String LIZJ = LJJ.LJ().LIZJ();
                        o.LJIIIIZZ(LIZJ, "it.avFile.resourceFile");
                        long j = 1000;
                        arrayList.add(new C122224qw(next.getStartTime() / j, next.getEndTime() / j, LJJ.LJIILIIL() / j, LJJ.LJIIL() / j, LIZJ));
                    }
                }
            }
        }
        return arrayList;
    }
}
