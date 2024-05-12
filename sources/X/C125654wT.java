package X;

import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegment;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.ss.ugc.android.editor.core.EditorProContext;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import kotlin.jvm.internal.o;

/* renamed from: X.4wT, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C125654wT {
    public final EditorProContext LIZ;

    public C125654wT(EditorProContext editorContext) {
        o.LJIIIZ(editorContext, "editorContext");
        this.LIZ = editorContext;
    }

    public static int LIZ(long j, NLEModel nLEModel, boolean z) {
        EnumC123874tb enumC123874tb;
        NLEResourceNode LIZIZ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        VecNLETrackSPtr tracks = nLEModel.getTracks();
        ArrayList LIZ = C07080Po.LIZ(tracks, "nleModel.tracks");
        Iterator<NLETrack> it = tracks.iterator();
        while (true) {
            boolean z2 = true;
            if (!it.hasNext()) {
                break;
            }
            NLETrack next = it.next();
            NLETrack nLETrack = next;
            if (nLETrack.LJIIJ() || !C124574uj.LJJJJLI(true, nLETrack)) {
                z2 = false;
            }
            if (z) {
                z2 = C124574uj.LJJIJIL(nLETrack);
            }
            if (z2) {
                LIZ.add(next);
            }
        }
        Iterator it2 = LIZ.iterator();
        while (it2.hasNext()) {
            NLETrack nLETrack2 = (NLETrack) it2.next();
            if (linkedHashMap.get(Integer.valueOf(nLETrack2.getLayer())) == null) {
                linkedHashMap.put(Integer.valueOf(nLETrack2.getLayer()), new ArrayList());
            }
            List list = (List) linkedHashMap.get(Integer.valueOf(nLETrack2.getLayer()));
            if (list != null) {
                list.addAll(nLETrack2.LJIILLIIL());
            }
        }
        TreeMap treeMap = new TreeMap(new Comparator() { // from class: X.4wU
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                Integer o2 = (Integer) obj2;
                int intValue = ((Integer) obj).intValue();
                o.LJIIIIZZ(o2, "o2");
                return intValue - o2.intValue();
            }
        });
        treeMap.putAll(linkedHashMap);
        Iterator it3 = treeMap.entrySet().iterator();
        int i = 0;
        while (it3.hasNext()) {
            Object value = ((Map.Entry) it3.next()).getValue();
            o.LJIIIIZZ(value, "it.value");
            boolean z3 = true;
            for (NLETrackSlot nLETrackSlot : (Iterable) value) {
                NLESegment LJI = nLETrackSlot.LJI();
                if (LJI != null && (LIZIZ = LJI.LIZIZ()) != null) {
                    enumC123874tb = LIZIZ.LJFF();
                } else {
                    enumC123874tb = null;
                }
                if (enumC123874tb != EnumC123874tb.RECORD || nLETrackSlot.getStartTime() >= j || nLETrackSlot.getEndTime() > j) {
                    z3 = false;
                }
            }
            if (z3) {
                break;
            }
            i++;
        }
        return Math.max(0, i);
    }
}
