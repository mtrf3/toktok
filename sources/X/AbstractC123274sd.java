package X;

import Y.IDComparatorS30S0000000_2;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import com.ss.ugc.android.editor.core.EditorProContext;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* renamed from: X.4sd, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC123274sd implements InterfaceC123284se {
    public final ArrayList<EnumC123874tb> LIZ;
    public final C62822Ol8 LIZIZ;

    public final EditorProContext LIZJ() {
        return (EditorProContext) this.LIZIZ.getValue();
    }

    public AbstractC123274sd(ActivityC45651qj activity) {
        o.LJIIIZ(activity, "activity");
        this.LIZ = C47261Igj.LJII(EnumC123874tb.VIDEO, EnumC123874tb.IMAGE, EnumC123874tb.TEXT_STICKER, EnumC123874tb.AUTOSUBTITLE_STICKER, EnumC123874tb.EFFECT, EnumC123874tb.COMPOSER);
        this.LIZIZ = C221108m2.LIZIZ(C123394sp.LJLIL);
    }

    public final void LIZIZ(java.util.Map<String, ? extends ArrayList<NLETrackSlot>> map, ArrayList<NLETrackSlot> arrayList, NLETrack nLETrack, List<? extends NLETrack> list) {
        int i;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = ((LinkedHashMap) map).values().iterator();
        while (it.hasNext()) {
            arrayList2.addAll((ArrayList) it.next());
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        NLEModel LJJI = C79057V0z.LJJI(LIZJ());
        VecNLETrackSPtr tracks = LJJI.getTracks();
        ArrayList LIZ = C07080Po.LIZ(tracks, "afterActionNLEModel.tracks");
        Iterator<NLETrack> it2 = tracks.iterator();
        while (it2.hasNext()) {
            NLETrack next = it2.next();
            NLETrack it3 = next;
            o.LJIIIIZZ(it3, "it");
            if (!it3.LJIIJ() && this.LIZ.contains(it3.LJIIL())) {
                LIZ.add(next);
            }
        }
        Iterator it4 = LIZ.iterator();
        while (it4.hasNext()) {
            NLETrack nLETrack2 = (NLETrack) it4.next();
            ArrayList arrayList3 = new ArrayList();
            VecNLETrackSlotSPtr LJIILL = nLETrack2.LJIILL();
            ArrayList arrayList4 = new ArrayList();
            Iterator<NLETrackSlot> it5 = LJIILL.iterator();
            while (it5.hasNext()) {
                NLETrackSlot next2 = it5.next();
                if (!arrayList2.contains(next2)) {
                    arrayList4.add(next2);
                }
            }
            VecNLETrackSlotSPtr LJIILL2 = nLETrack2.LJIILL();
            ArrayList arrayList5 = new ArrayList();
            Iterator<NLETrackSlot> it6 = LJIILL2.iterator();
            while (it6.hasNext()) {
                NLETrackSlot next3 = it6.next();
                if (arrayList.contains(next3)) {
                    arrayList5.add(next3);
                }
            }
            Iterator it7 = arrayList4.iterator();
            while (it7.hasNext()) {
                NLETimeSpaceNode freeSlot = (NLETimeSpaceNode) it7.next();
                Iterator it8 = arrayList5.iterator();
                while (it8.hasNext()) {
                    NLETrackSlot linkageSlot = (NLETrackSlot) it8.next();
                    o.LJIIIIZZ(freeSlot, "freeSlot");
                    o.LJIIIIZZ(linkageSlot, "linkageSlot");
                    if (freeSlot.getStartTime() < linkageSlot.getEndTime() && linkageSlot.getStartTime() < freeSlot.getEndTime() && !arrayList3.contains(linkageSlot)) {
                        nLETrack2.LJIJJLI(linkageSlot);
                        arrayList3.add(linkageSlot);
                    }
                }
            }
            if (!arrayList3.isEmpty()) {
                if (nLETrack2.LJIIL() == EnumC123874tb.AUTOSUBTITLE_STICKER) {
                    if (nLETrack != null) {
                        LJJI.removeTrack(nLETrack2);
                        LJJI.addTrack(nLETrack);
                    }
                } else {
                    if (arrayList3.size() > 1) {
                        C40675Fxn.LJJLIIIJ(arrayList3, new IDComparatorS30S0000000_2(34));
                    }
                    if (C124574uj.LJJJJJL(nLETrack2)) {
                        linkedHashMap.put(nLETrack2, arrayList3);
                    } else {
                        C122504rO.LIZ(nLETrack2, arrayList3, LJJI);
                        if (C124574uj.LJJJIL(nLETrack2)) {
                            NLETimeSpaceNode nLETimeSpaceNode = (NLETimeSpaceNode) ORZ.LLFII(C124574uj.LJIILIIL(C79057V0z.LJJI(LIZJ())));
                            if (nLETimeSpaceNode != null) {
                                i = nLETimeSpaceNode.getLayer();
                            } else {
                                i = -1;
                            }
                            int i2 = i + 1;
                            if (i2 > C123254sb.LIZ) {
                                C123254sb.LIZ = i2;
                            }
                        }
                    }
                }
            }
        }
        if (!linkedHashMap.isEmpty()) {
            if (linkedHashMap.size() + C124574uj.LJIJI(LJJI).size() > ((Number) C5BA.LIZ(EnumC127484zQ.MAX_PIP_TRACK_COUNT, Integer.MAX_VALUE)).intValue()) {
                Iterator<NLETrack> it9 = C124574uj.LJIJI(LJJI).iterator();
                while (it9.hasNext()) {
                    LJJI.removeTrack(it9.next());
                }
                Iterator it10 = ((ArrayList) list).iterator();
                while (it10.hasNext()) {
                    LJJI.addTrack((NLETrack) it10.next());
                }
                return;
            }
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                C122504rO.LIZ((NLETrack) entry.getKey(), (ArrayList) entry.getValue(), LJJI);
            }
        }
    }

    public final void LIZLLL(C40517FvF affectedIndexRange, long j, ArrayList<NLETrackSlot> arrayList, java.util.Map<String, ? extends ArrayList<NLETrackSlot>> map, InterfaceC88472Yns<? super NLETrackSlot, Boolean> interfaceC88472Yns) {
        String uuid;
        o.LJIIIZ(affectedIndexRange, "affectedIndexRange");
        NLEModel LJJI = C79057V0z.LJJI(LIZJ());
        int i = affectedIndexRange.LJLIL;
        int i2 = affectedIndexRange.LJLILLLLZI;
        if (i > i2) {
            return;
        }
        while (true) {
            NLENode nLENode = (NLENode) ORZ.LJLLLLLL(i, LJJI.getMainTrack().LJIILLIIL());
            if (nLENode == null || (uuid = nLENode.getUUID()) == null) {
                return;
            }
            ArrayList arrayList2 = (ArrayList) ((LinkedHashMap) map).get(uuid);
            if (arrayList2 != null) {
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    NLETrackSlot nLETrackSlot = (NLETrackSlot) it.next();
                    if (interfaceC88472Yns == null || interfaceC88472Yns.invoke(nLETrackSlot).booleanValue()) {
                        nLETrackSlot.setStartTime(nLETrackSlot.getStartTime() + j);
                        nLETrackSlot.setEndTime(nLETrackSlot.getEndTime() + j);
                        arrayList.add(nLETrackSlot);
                        if (nLETrackSlot.LJI().LIZJ() == EnumC123874tb.TEXT_STICKER) {
                            C134215On.LIZ.LIZ(nLETrackSlot, LIZJ());
                        }
                    }
                }
            }
            if (i != i2) {
                i++;
            } else {
                return;
            }
        }
    }
}
