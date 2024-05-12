package X;

import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLESegment;
import com.bytedance.ies.nle.editor_jni.NLESegmentAudio;
import com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.ss.android.ttve.nativePort.TEVideoUtils;
import defpackage.t1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.4rr, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C122794rr {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(NLEEditor nLEEditor) {
        long j;
        NLEModel LJ = nLEEditor.LJ();
        if (LJ.getMainTrack() == null || ORZ.LJLLLL(LJ.getMainTrack().LJIILL()) == null) {
            return;
        }
        NLETrack mainTrack = LJ.getMainTrack();
        if (mainTrack != null) {
            j = mainTrack.LJIIJJI();
        } else {
            j = 0;
        }
        VecNLETrackSPtr tracks = LJ.getTracks();
        ArrayList LIZ2 = C07080Po.LIZ(tracks, "nleModel.tracks");
        Iterator<NLETrack> it = tracks.iterator();
        while (it.hasNext()) {
            NLETrack next = it.next();
            if (!next.LJIIJ()) {
                LIZ2.add(next);
            }
        }
        Iterator it2 = LIZ2.iterator();
        while (it2.hasNext()) {
            NLETrack nLETrack = (NLETrack) it2.next();
            Iterator<T> it3 = ORS.LJJLIIIJL(nLETrack.LJIILL()).iterator();
            while (it3.hasNext()) {
                NLETimeSpaceNode nLETimeSpaceNode = (NLETimeSpaceNode) it3.next();
                if (((int) nLETimeSpaceNode.getEndTime()) != -2 || nLETimeSpaceNode.hasExtra("extra_sts_original_end_time")) {
                    if (nLETimeSpaceNode.hasExtra("extra_sts_original_end_time") && nLETimeSpaceNode.hasExtra("extra_sts_original_end_time")) {
                        String extra = nLETimeSpaceNode.getExtra("extra_sts_original_end_time");
                        o.LJIIIIZZ(extra, "slot.getExtra(STS_ADJUST_END_TIME)");
                        nLETimeSpaceNode.setEndTime(CastLongProtector.parseLong(extra));
                        nLETimeSpaceNode.removeExtraWithKey("extra_sts_original_end_time");
                    }
                    if (nLETimeSpaceNode.getEndTime() > j) {
                        if (nLETimeSpaceNode.getStartTime() > j) {
                            nLETimeSpaceNode.setExtra("extra_sts_original_end_time", String.valueOf(nLETimeSpaceNode.getEndTime()));
                            nLETimeSpaceNode.setEndTime(nLETimeSpaceNode.getStartTime());
                        } else {
                            nLETimeSpaceNode.setExtra("extra_sts_original_end_time", String.valueOf(nLETimeSpaceNode.getEndTime()));
                            nLETimeSpaceNode.setEndTime(j);
                        }
                    } else if (o.LJ(nLETrack.getExtra("AudioTrackType"), EnumC122254qz.ORIGIN.name()) && o.LJ(ORZ.LLFF(nLETrack.LJIILL()), nLETimeSpaceNode)) {
                        nLETimeSpaceNode.setExtra("extra_sts_original_end_time", String.valueOf(nLETimeSpaceNode.getEndTime()));
                        nLETimeSpaceNode.setEndTime(j);
                    }
                }
            }
        }
    }

    public static NLETrack LIZIZ(NLEModel nLEModel) {
        Object obj;
        Iterator LIZJ = t1.LIZJ(nLEModel, "tracks");
        while (true) {
            if (LIZJ.hasNext()) {
                obj = LIZJ.next();
                if (o.LJ(((NLENode) obj).getExtra("AudioTrackType"), EnumC122254qz.AUDIO_RECORD.name())) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        return (NLETrack) obj;
    }

    public static NLETrack LIZJ(NLEModel nLEModel) {
        Object obj;
        Iterator LIZJ = t1.LIZJ(nLEModel, "tracks");
        while (true) {
            if (LIZJ.hasNext()) {
                obj = LIZJ.next();
                if (o.LJ(((NLENode) obj).getExtra("AudioTrackType"), EnumC122254qz.DUB.name())) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        return (NLETrack) obj;
    }

    public static List LIZLLL(NLEModel model) {
        o.LJIIIZ(model, "model");
        ArrayList arrayList = new ArrayList();
        NLETrack mainTrack = model.getMainTrack();
        if (mainTrack != null) {
            arrayList.add(mainTrack);
        }
        VecNLETrackSPtr tracks = model.getTracks();
        ArrayList LIZ2 = C07080Po.LIZ(tracks, "model.tracks");
        Iterator<NLETrack> it = tracks.iterator();
        while (it.hasNext()) {
            NLETrack next = it.next();
            if (o.LJ(next.getExtra("AudioTrackType"), EnumC122254qz.ORIGIN.name())) {
                LIZ2.add(next);
            }
        }
        Iterator it2 = LIZ2.iterator();
        while (it2.hasNext()) {
            Object it3 = it2.next();
            o.LJIIIIZZ(it3, "it");
            arrayList.add(it3);
        }
        VecNLETrackSPtr tracks2 = model.getTracks();
        ArrayList LIZ3 = C07080Po.LIZ(tracks2, "model.tracks");
        Iterator<NLETrack> it4 = tracks2.iterator();
        while (it4.hasNext()) {
            NLETrack next2 = it4.next();
            if (o.LJ(next2.getExtra("AudioTrackType"), EnumC122254qz.DUB.name())) {
                LIZ3.add(next2);
            }
        }
        Iterator it5 = LIZ3.iterator();
        while (it5.hasNext()) {
            Object it6 = it5.next();
            o.LJIIIIZZ(it6, "it");
            arrayList.add(it6);
        }
        return arrayList;
    }

    public static boolean LJ(NLEModel filteredModel) {
        o.LJIIIZ(filteredModel, "filteredModel");
        ArrayList arrayList = (ArrayList) LIZLLL(filteredModel);
        if (arrayList.isEmpty()) {
            return true;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (!((NLETrack) it.next()).LJIILL().isEmpty()) {
                return false;
            }
        }
        return true;
    }

    public static NLEModel LJFF(NLEModel model) {
        o.LJIIIZ(model, "model");
        NLEModel cloneModel = NLEModel.dynamicCast(model.deepClone(false));
        o.LJIIIIZZ(cloneModel, "cloneModel");
        C122784rq.LJ(cloneModel);
        VecNLETrackSPtr tracks = cloneModel.getTracks();
        o.LJIIIIZZ(tracks, "cloneModel.tracks");
        ArrayList arrayList = new ArrayList();
        Iterator<NLETrack> it = tracks.iterator();
        while (it.hasNext()) {
            NLETrack next = it.next();
            NLETrack nLETrack = next;
            if (!nLETrack.LJIIJ() && !o.LJ(nLETrack.getExtra("AudioTrackType"), EnumC122254qz.ORIGIN.name()) && !o.LJ(nLETrack.getExtra("AudioTrackType"), EnumC122254qz.DUB.name())) {
                arrayList.add(next);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            cloneModel.removeTrack((NLETrack) it2.next());
        }
        NLETrack mainTrack = cloneModel.getMainTrack();
        if (mainTrack != null) {
            Iterator<NLETrackSlot> it3 = mainTrack.LJIILL().iterator();
            while (it3.hasNext()) {
                NLETrackSlot it4 = it3.next();
                o.LJIIIIZZ(it4, "it");
                LJI(it4);
            }
        }
        NLETrack LIZIZ = C141335gf.LIZIZ(cloneModel);
        if (LIZIZ != null) {
            Iterator<NLETrackSlot> it5 = LIZIZ.LJIILL().iterator();
            while (it5.hasNext()) {
                NLETrackSlot it6 = it5.next();
                o.LJIIIIZZ(it6, "it");
                LJI(it6);
            }
        }
        NLETrack LIZJ = LIZJ(cloneModel);
        if (LIZJ != null) {
            Iterator<NLETrackSlot> it7 = LIZJ.LJIILL().iterator();
            while (it7.hasNext()) {
                NLETrackSlot it8 = it7.next();
                o.LJIIIIZZ(it8, "it");
                LJI(it8);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator LIZJ2 = t1.LIZJ(cloneModel, "cloneModel.tracks");
        while (LIZJ2.hasNext()) {
            NLETrack nLETrack2 = (NLETrack) LIZJ2.next();
            VecNLETrackSlotSPtr LJIILLIIL = nLETrack2.LJIILLIIL();
            ArrayList arrayList3 = new ArrayList();
            Iterator<NLETrackSlot> it9 = LJIILLIIL.iterator();
            while (it9.hasNext()) {
                NLETrackSlot next2 = it9.next();
                NLETrackSlot nLETrackSlot = next2;
                NLESegmentAudio LIZLLL = NLESegmentAudio.LIZLLL(nLETrackSlot.LJI());
                if (C124574uj.LJJJJI(nLETrackSlot) || TEVideoUtils.nativeCheckAudioFile(LIZLLL.LIZIZ().LIZJ()) != 0) {
                    arrayList3.add(next2);
                }
            }
            Iterator it10 = arrayList3.iterator();
            while (it10.hasNext()) {
                nLETrack2.LJIJJLI((NLETrackSlot) it10.next());
                if (nLETrack2.LJIILL().isEmpty()) {
                    arrayList2.add(nLETrack2);
                }
            }
        }
        Iterator it11 = arrayList2.iterator();
        while (it11.hasNext()) {
            cloneModel.removeTrack((NLETrack) it11.next());
        }
        return cloneModel;
    }

    public static void LJI(NLETrackSlot nLETrackSlot) {
        String extra;
        Float LJJIJLIJ;
        if (nLETrackSlot.hasExtra("extra_sts_original_volume") && (extra = nLETrackSlot.getExtra("extra_sts_original_volume")) != null && (LJJIJLIJ = C38350F3i.LJJIJLIJ(extra)) != null) {
            float floatValue = LJJIJLIJ.floatValue();
            NLESegment LJI = nLETrackSlot.LJI();
            if (LJI != null) {
                C124574uj.LJJLIIIJJI(LJI, floatValue);
            }
        }
    }

    public static void LJII(NLETrackSlot nLETrackSlot) {
        NLESegment LJI;
        Float valueOf;
        if (!nLETrackSlot.hasExtra("extra_sts_original_volume") && (LJI = nLETrackSlot.LJI()) != null && (valueOf = Float.valueOf(C124574uj.LJJIIZI(LJI))) != null) {
            nLETrackSlot.setExtra("extra_sts_original_volume", String.valueOf(valueOf.floatValue()));
        }
    }
}
