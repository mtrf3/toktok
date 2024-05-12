package X;

import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEEditorJniJNI;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLEResourceAV;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegment;
import com.bytedance.ies.nle.editor_jni.NLESegmentAudio;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import defpackage.t1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.4rq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C122784rq {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZLLL(NLEModel nLEModel) {
        NLETrack mainTrack = nLEModel.getMainTrack();
        if (mainTrack != null) {
            Iterator<NLETrackSlot> it = mainTrack.LJIILL().iterator();
            while (it.hasNext()) {
                NLETrackSlot it2 = it.next();
                o.LJIIIIZZ(it2, "it");
                C122384rC.LIZ(it2, nLEModel, true);
            }
        }
        Iterator it3 = ((ArrayList) LJII(nLEModel)).iterator();
        while (it3.hasNext()) {
            LJFF((NLETrackSlot) it3.next());
        }
        LJIIIZ(nLEModel);
    }

    public static void LJ(NLEModel nLEModel) {
        NLETrack mainTrack = nLEModel.getMainTrack();
        if (mainTrack != null) {
            Iterator<NLETrackSlot> it = mainTrack.LJIILL().iterator();
            while (it.hasNext()) {
                NLETrackSlot it2 = it.next();
                o.LJIIIIZZ(it2, "it");
                C122384rC.LIZ(it2, nLEModel, false);
            }
        }
        Iterator it3 = ((ArrayList) LJI(nLEModel)).iterator();
        while (it3.hasNext()) {
            LJFF((NLETrackSlot) it3.next());
        }
        Iterator it4 = ((ArrayList) LJII(nLEModel)).iterator();
        while (it4.hasNext()) {
            LJFF((NLETrackSlot) it4.next());
        }
        LJIIIZ(nLEModel);
    }

    public static void LJFF(NLETrackSlot slot) {
        NLEResourceNode LIZIZ;
        o.LJIIIZ(slot, "slot");
        if (slot.hasExtra("extra_origin_voice_file_path")) {
            String extra = slot.getExtra("extra_origin_voice_file_path");
            NLESegment LJI = slot.LJI();
            if (LJI != null && (LIZIZ = LJI.LIZIZ()) != null) {
                LIZIZ.LJIIIZ(extra);
            }
            slot.removeExtraWithKey("extra_origin_voice_file_path");
            slot.removeExtraWithKey("extra_voice_change_effect_name");
            slot.removeExtraWithKey("extra_voice_chang_effect_id");
            slot.removeExtraWithKey("extra_voice_chang_effect_anchor_name");
            slot.removeExtraWithKey("extra_voice_chang_effect_icon_url");
            slot.removeExtraWithKey("extra_voice_chang_effect_resource_id");
            slot.removeExtraWithKey("extra_voice_change_creator_id");
            slot.removeExtraWithKey("extra_voice_change_creator_username");
        }
    }

    public static List LJI(NLEModel nleModel) {
        o.LJIIIZ(nleModel, "nleModel");
        VecNLETrackSPtr sortedTracks = nleModel.getSortedTracks();
        o.LJIIIIZZ(sortedTracks, "nleModel.sortedTracks");
        ArrayList arrayList = new ArrayList();
        Iterator<NLETrack> it = sortedTracks.iterator();
        while (it.hasNext()) {
            NLETrack next = it.next();
            if (o.LJ(next.getExtra("AudioTrackType"), EnumC122254qz.DUB.name())) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ORS.LJJLIIIJILLIZJL(((NLETrack) it2.next()).LJIILLIIL(), arrayList2);
        }
        return arrayList2;
    }

    public static List LJII(NLEModel nleModel) {
        o.LJIIIZ(nleModel, "nleModel");
        VecNLETrackSPtr sortedTracks = nleModel.getSortedTracks();
        o.LJIIIIZZ(sortedTracks, "nleModel.sortedTracks");
        ArrayList arrayList = new ArrayList();
        Iterator<NLETrack> it = sortedTracks.iterator();
        while (it.hasNext()) {
            NLETrack next = it.next();
            NLETrack it2 = next;
            o.LJIIIIZZ(it2, "it");
            if (C124574uj.LJJIJIL(it2)) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            ORS.LJJLIIIJILLIZJL(((NLETrack) it3.next()).LJIILLIIL(), arrayList2);
        }
        return arrayList2;
    }

    public static List LJIIIIZZ(NLEModel nleModel) {
        o.LJIIIZ(nleModel, "nleModel");
        ArrayList arrayList = new ArrayList();
        Iterator it = ((ArrayList) LJI(nleModel)).iterator();
        while (true) {
            String str = "";
            if (!it.hasNext()) {
                break;
            }
            String extra = ((NLENode) it.next()).getExtra("extra_voice_chang_effect_id");
            if (extra != null) {
                str = extra;
            }
            if (str.length() > 0 && !arrayList.contains(str)) {
                arrayList.add(str);
            }
        }
        Iterator it2 = ((ArrayList) LJII(nleModel)).iterator();
        while (it2.hasNext()) {
            String extra2 = ((NLENode) it2.next()).getExtra("extra_voice_chang_effect_id");
            if (extra2 == null) {
                extra2 = "";
            }
            if (extra2.length() > 0 && !arrayList.contains(extra2)) {
                arrayList.add(extra2);
            }
        }
        NLETrack mainTrack = nleModel.getMainTrack();
        if (mainTrack != null) {
            Iterator<NLETrackSlot> it3 = mainTrack.LJIILL().iterator();
            while (it3.hasNext()) {
                String extra3 = it3.next().getExtra("extra_voice_chang_effect_id");
                if (extra3 == null) {
                    extra3 = "";
                }
                if (extra3.length() > 0 && !arrayList.contains(extra3)) {
                    arrayList.add(extra3);
                }
            }
        }
        return arrayList;
    }

    public static void LJIIIZ(NLEModel nLEModel) {
        Object obj;
        Object obj2;
        if (C17J.LJJIJL(nLEModel)) {
            NLETrack mainTrack = nLEModel.getMainTrack();
            Iterator LIZJ = t1.LIZJ(nLEModel, "tracks");
            while (true) {
                obj = null;
                if (LIZJ.hasNext()) {
                    obj2 = LIZJ.next();
                    NLETrack it = (NLETrack) obj2;
                    o.LJIIIIZZ(it, "it");
                    if (o.LJ(C77357UXp.LJIL(it), EnumC121854qL.VIDEO.name()) && NLEEditorJniJNI.NLETrack_hasMainTrack(it.LIZ, it)) {
                        break;
                    }
                } else {
                    obj2 = null;
                    break;
                }
            }
            LJIIJ(mainTrack, (NLETrack) obj2);
            NLETrack LIZIZ = C141335gf.LIZIZ(nLEModel);
            Iterator LIZJ2 = t1.LIZJ(nLEModel, "tracks");
            while (true) {
                if (!LIZJ2.hasNext()) {
                    break;
                }
                Object next = LIZJ2.next();
                NLETrack it2 = (NLETrack) next;
                o.LJIIIIZZ(it2, "it");
                if (o.LJ(C77357UXp.LJIL(it2), EnumC121854qL.AUDIO.name()) && o.LJ(it2.getExtra("AudioTrackType"), EnumC122254qz.REVERSE_AUDIO.name())) {
                    obj = next;
                    break;
                }
            }
            LJIIJ(LIZIZ, (NLETrack) obj);
        }
    }

    public static void LIZ(NLETrackSlot nLETrackSlot, C166116fX c166116fX) {
        NLESegmentAudio LIZLLL;
        if (nLETrackSlot.LJI() == null || (LIZLLL = NLESegmentAudio.LIZLLL(nLETrackSlot.LJI())) == null) {
            return;
        }
        float f = c166116fX.LJI;
        LIZLLL.setSpeed(f);
        LIZLLL.LJIJJ(LIZLLL.LJIILIIL() + (((float) (LIZLLL.LJIIL() - LIZLLL.LJIILIIL())) * f));
        nLETrackSlot.setExtra("extra_svc_speed", String.valueOf(f));
    }

    public static void LIZIZ(C166116fX model, NLEEditor nleEditor) {
        NLEResourceNode LIZIZ;
        NLEResourceNode LIZIZ2;
        String LIZJ;
        o.LJIIIZ(model, "model");
        o.LJIIIZ(nleEditor, "nleEditor");
        NLETrackSlot nLETrackSlot = model.LIZ;
        if (nLETrackSlot == null) {
            return;
        }
        if (!nLETrackSlot.hasExtra("extra_origin_voice_file_path")) {
            NLESegment LJI = model.LIZ.LJI();
            if (LJI == null || (LIZIZ2 = LJI.LIZIZ()) == null || (LIZJ = LIZIZ2.LIZJ()) == null) {
                return;
            } else {
                nLETrackSlot.setExtra("extra_origin_voice_file_path", LIZJ);
            }
        }
        NLESegment LJI2 = nLETrackSlot.LJI();
        if (LJI2 != null && (LIZIZ = LJI2.LIZIZ()) != null) {
            LIZIZ.LJIIIZ(model.LJ);
        }
        LIZ(nLETrackSlot, model);
        nLETrackSlot.setExtra("extra_voice_chang_effect_id", model.LIZJ.getEffectId());
        nLETrackSlot.setExtra("extra_voice_change_effect_name", model.LIZJ.getName());
        List<String> urlList = model.LIZJ.getIconUrl().getUrlList();
        if (urlList != null && !urlList.isEmpty()) {
            nLETrackSlot.setExtra("extra_voice_chang_effect_icon_url", (String) ListProtector.get(model.LIZJ.getIconUrl().getUrlList(), 0));
        }
        nLETrackSlot.setExtra("extra_voice_chang_effect_resource_id", model.LIZJ.getResource_id());
        nLETrackSlot.setExtra("extra_voice_chang_effect_anchor_name", OUP.LJJL(model.LIZJ));
        nLETrackSlot.setExtra("extra_voice_change_creator_id", OUP.LJJLI(model.LIZJ));
        nLETrackSlot.setExtra("extra_voice_change_creator_username", OUP.LJJLIIIIJ(model.LIZJ));
    }

    public static void LJIIJ(NLETrack nLETrack, NLETrack nLETrack2) {
        NLESegment LJI;
        NLESegment LJI2;
        if (nLETrack == null || nLETrack2 == null || nLETrack.LJIILL().size() != nLETrack2.LJIILL().size()) {
            return;
        }
        VecNLETrackSlotSPtr LJIILL = nLETrack2.LJIILL();
        Iterator<NLETrackSlot> it = nLETrack.LJIILL().iterator();
        int i = 0;
        while (it.hasNext()) {
            NLETrackSlot next = it.next();
            int i2 = i + 1;
            if (i >= 0) {
                NLETrackSlot nLETrackSlot = next;
                if (nLETrackSlot != null && (LJI = nLETrackSlot.LJI()) != null) {
                    float LJJIIZI = C124574uj.LJJIIZI(LJI);
                    NLETrackSlot nLETrackSlot2 = (NLETrackSlot) ORZ.LJLLLLLL(i, LJIILL);
                    if (nLETrackSlot2 != null && (LJI2 = nLETrackSlot2.LJI()) != null) {
                        C124574uj.LJJLIIIJJI(LJI2, LJJIIZI);
                    }
                }
                i = i2;
            } else {
                C47261Igj.LJJJJJ();
                throw null;
            }
        }
    }

    public static void LIZJ(C166116fX model, NLEEditor nleEditor, boolean z) {
        VecNLETrackSPtr tracks;
        NLETrack nLETrack;
        NLETrackSlot nLETrackSlot;
        EnumC123874tb enumC123874tb;
        NLETrackSlot LIZIZ;
        EnumC123874tb enumC123874tb2;
        Object obj;
        NLETrackSlot nLETrackSlot2;
        NLEResourceNode LIZIZ2;
        NLEResourceNode LIZIZ3;
        NLEResourceNode LIZIZ4;
        NLEResourceNode LIZIZ5;
        o.LJIIIZ(model, "model");
        o.LJIIIZ(nleEditor, "nleEditor");
        NLEModel nLEModel = model.LIZIZ;
        if (nLEModel == null || (tracks = nLEModel.getTracks()) == null || (nLETrack = (NLETrack) ORZ.LJLLLLLL(0, tracks)) == null || (nLETrackSlot = (NLETrackSlot) ORZ.LJLLLLLL(0, nLETrack.LJIILL())) == null) {
            return;
        }
        NLESegment LJI = nLETrackSlot.LJI();
        NLETrackSlot nLETrackSlot3 = null;
        if (LJI != null && (LIZIZ5 = LJI.LIZIZ()) != null) {
            enumC123874tb = LIZIZ5.LJFF();
        } else {
            enumC123874tb = null;
        }
        EnumC123874tb enumC123874tb3 = EnumC123874tb.AUDIO;
        if (enumC123874tb == enumC123874tb3) {
            NLEModel LJ = nleEditor.LJ();
            o.LJIIIIZZ(LJ, "nleEditor.model");
            LIZIZ = C122384rC.LIZJ(LJ, nLETrackSlot);
            if (LIZIZ == null) {
                return;
            }
        } else {
            NLEModel LJ2 = nleEditor.LJ();
            o.LJIIIIZZ(LJ2, "nleEditor.model");
            LIZIZ = C122384rC.LIZIZ(LJ2, nLETrackSlot);
            if (LIZIZ == null) {
                return;
            }
        }
        NLESegment LJI2 = LIZIZ.LJI();
        if (LJI2 != null && (LIZIZ4 = LJI2.LIZIZ()) != null) {
            enumC123874tb2 = LIZIZ4.LJFF();
        } else {
            enumC123874tb2 = null;
        }
        if (enumC123874tb2 == enumC123874tb3) {
            NLESegment LJI3 = LIZIZ.LJI();
            if (LJI3 != null) {
                C124574uj.LJJLIIIJJI(LJI3, 0.0f);
            }
            NLEModel LJ3 = nleEditor.LJ();
            o.LJIIIIZZ(LJ3, "nleEditor.model");
            LIZIZ = C122384rC.LIZIZ(LJ3, LIZIZ);
            if (LIZIZ == null) {
                return;
            }
        }
        Iterator LIZJ = C141415gn.LIZJ(nleEditor, "nleEditor.model.tracks");
        while (true) {
            if (LIZJ.hasNext()) {
                obj = LIZJ.next();
                if (o.LJ(((NLENode) obj).getExtra("AudioTrackType"), EnumC122254qz.ORIGIN_VOICE_CONVERSION.name())) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        NLETrack nLETrack2 = (NLETrack) obj;
        long j = 0;
        if (nLETrack2 == null) {
            nLETrack2 = new NLETrack();
            nLETrack2.setExtra("AudioTrackType", EnumC122254qz.ORIGIN_VOICE_CONVERSION.name());
            nLETrack2.setStartTime(0L);
            nLETrack2.setEndTime(-2L);
            nleEditor.LJ().addTrack(nLETrack2);
        }
        String associatedId = LIZIZ.getExtra("extra_associated_vc_slot_id");
        o.LJIIIIZZ(associatedId, "associatedId");
        if (associatedId.length() == 0) {
            String str = model.LJ;
            if (str != null) {
                NLESegment LJI4 = LIZIZ.LJI();
                if (LJI4 != null && (LIZIZ3 = LJI4.LIZIZ()) != null) {
                    j = LIZIZ3.getDuration();
                }
                NLESegmentVideo LJJ = NLESegmentVideo.LJJ(LIZIZ.LJI());
                if (LJJ != null) {
                    nLETrackSlot3 = new NLETrackSlot();
                    NLESegmentAudio nLESegmentAudio = new NLESegmentAudio();
                    NLEResourceAV nLEResourceAV = new NLEResourceAV();
                    nLEResourceAV.LJIILIIL(EnumC123874tb.AUDIO);
                    nLEResourceAV.setDuration(j);
                    nLEResourceAV.LJIIIZ(str);
                    nLESegmentAudio.LJIILL(nLEResourceAV);
                    nLESegmentAudio.LJIJJLI(LJJ.LJIILIIL());
                    nLESegmentAudio.LJIJJ(LJJ.LJIIL());
                    nLESegmentAudio.LJIL(LJJ.LJIILJJIL());
                    nLESegmentAudio.LJIJI(true);
                    nLESegmentAudio.setSpeed(LJJ.getSpeed());
                    nLETrackSlot3.LJIIL(nLESegmentAudio);
                    nLETrackSlot3.setStartTime(LIZIZ.getStartTime());
                    nLETrackSlot3.setEndTime(LIZIZ.getEndTime());
                    LIZIZ.setExtra("extra_associated_vc_slot_id", nLETrackSlot3.getUUID());
                    LIZ(nLETrackSlot3, model);
                }
                nLETrack2.LIZIZ(nLETrackSlot3);
            }
        } else {
            Iterator<NLETrackSlot> it = nLETrack2.LJIILL().iterator();
            while (true) {
                if (it.hasNext()) {
                    nLETrackSlot2 = it.next();
                    if (o.LJ(nLETrackSlot2.getUUID(), associatedId)) {
                        break;
                    }
                } else {
                    nLETrackSlot2 = null;
                    break;
                }
            }
            NLETrackSlot nLETrackSlot4 = nLETrackSlot2;
            if (nLETrackSlot4 != null) {
                NLESegment LJI5 = nLETrackSlot4.LJI();
                if (LJI5 != null && (LIZIZ2 = LJI5.LIZIZ()) != null) {
                    LIZIZ2.LJIIIZ(model.LJ);
                }
                LIZ(nLETrackSlot4, model);
            }
        }
        LIZIZ.setExtra("extra_voice_change_effect_name", model.LIZJ.getName());
        LIZIZ.setExtra("extra_voice_chang_effect_id", model.LIZJ.getEffectId());
        List<String> urlList = model.LIZJ.getIconUrl().getUrlList();
        if (urlList != null && !urlList.isEmpty()) {
            LIZIZ.setExtra("extra_voice_chang_effect_icon_url", (String) ListProtector.get(model.LIZJ.getIconUrl().getUrlList(), 0));
        }
        LIZIZ.setExtra("extra_voice_chang_effect_resource_id", model.LIZJ.getResource_id());
        LIZIZ.setExtra("extra_voice_chang_effect_anchor_name", OUP.LJJL(model.LIZJ));
        LIZIZ.setExtra("extra_voice_change_creator_id", OUP.LJJLI(model.LIZJ));
        LIZIZ.setExtra("extra_voice_change_creator_username", OUP.LJJLIIIIJ(model.LIZJ));
        if (z) {
            NLESegmentVideo.LJJ(LIZIZ.LJI()).LJJIIJZLJL(false);
            return;
        }
        NLESegment LJI6 = LIZIZ.LJI();
        if (LJI6 == null) {
            return;
        }
        C124574uj.LJJLIIIJJI(LJI6, 0.0f);
    }
}
