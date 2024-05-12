package X;

import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegment;
import com.bytedance.ies.nle.editor_jni.NLESegmentComposerFilter;
import com.bytedance.ies.nle.editor_jni.NLESegmentEffect;
import com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.ss.android.ugc.aweme.effect.EffectModel;
import com.ss.android.ugc.aweme.effect.EffectPointModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.o;

/* renamed from: X.4sb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C123254sb {
    public static int LIZ = C142125hw.LIZ();

    public static int LIZIZ(NLETrackSlot slot) {
        o.LJIIIZ(slot, "slot");
        String extra = slot.getExtra("original_effect_order");
        if (extra == null || extra.length() == 0) {
            return -1;
        }
        o.LJIIIIZZ(extra, "extra");
        return CastIntegerProtector.parseInt(extra);
    }

    public static boolean LIZJ(NLEModel nLEModel) {
        NLETrackSlot LJIILIIL;
        List<NLETrack> LJIILIIL2 = C124574uj.LJIILIIL(nLEModel);
        ArrayList arrayList = new ArrayList();
        Iterator<NLETrack> it = LJIILIIL2.iterator();
        while (it.hasNext()) {
            ORS.LJJLIIIJILLIZJL(it.next().LJIILL(), arrayList);
        }
        List LLJILJILJ = ORZ.LLJILJILJ(arrayList);
        NLETrack LJJIJIIJI = C17J.LJJIJIIJI(nLEModel);
        if (LJJIJIIJI != null && (LJIILIIL = LJJIJIIJI.LJIILIIL(0)) != null) {
            ((ArrayList) LLJILJILJ).add(LJIILIIL);
        }
        ArrayList arrayList2 = (ArrayList) LLJILJILJ;
        if (arrayList2.isEmpty()) {
            return false;
        }
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            if (Boolean.parseBoolean(((NLENode) it2.next()).getExtra("is_edit_effect_duration"))) {
                return true;
            }
        }
        return false;
    }

    public static NLETrack LIZ(List trackList, OSZ osz) {
        o.LJIIIZ(trackList, "trackList");
        NLETrack nLETrack = null;
        for (NLETrack nLETrack2 : ORZ.LLIILII(trackList)) {
            VecNLETrackSlotSPtr LJIILLIIL = nLETrack2.LJIILLIIL();
            if (!LJIILLIIL.isEmpty()) {
                Iterator<NLETrackSlot> it = LJIILLIIL.iterator();
                while (it.hasNext()) {
                    NLETrackSlot next = it.next();
                    if (next.getStartTime() < ((Number) osz.getSecond()).longValue() && ((Number) osz.getFirst()).longValue() < next.getEndTime()) {
                        return nLETrack;
                    }
                }
            }
            nLETrack = nLETrack2;
        }
        return (NLETrack) ORZ.LJLLLLLL(0, trackList);
    }

    public static void LIZLLL(NLEModel nLEModel, ArrayList arrayList) {
        String LJIJJ;
        List<NLETrack> LJIILIIL = C124574uj.LJIILIIL(nLEModel);
        ArrayList arrayList2 = new ArrayList();
        Iterator<NLETrack> it = LJIILIIL.iterator();
        while (it.hasNext()) {
            ORS.LJJLIIIJILLIZJL(it.next().LJIILL(), arrayList2);
        }
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            NLETrackSlot slot = (NLETrackSlot) it2.next();
            o.LJIIIIZZ(slot, "slot");
            EffectPointModel effectPointModel = (EffectPointModel) ORZ.LJLLLLLL(LJFF(slot, arrayList), arrayList);
            if (effectPointModel != null && ((LJIJJ = C124574uj.LJIJJ(slot)) == null || LJIJJ.length() == 0)) {
                NLESegmentEffect LIZLLL = NLESegmentEffect.LIZLLL(slot.LJI());
                if (LIZLLL != null) {
                    NLEResourceNode LJ = LIZLLL.LJ();
                    LJ.LJIIJ(effectPointModel.getKey());
                    LJ.LJIIJJI(effectPointModel.getName());
                }
                NLESegmentComposerFilter LJIIIIZZ = NLESegmentComposerFilter.LJIIIIZZ(slot.LJI());
                if (LJIIIIZZ != null) {
                    NLEResourceNode LJ2 = LJIIIIZZ.LJ();
                    LJ2.LJIIJ(effectPointModel.getKey());
                    LJ2.LJIIJJI(effectPointModel.getName());
                }
            }
        }
    }

    public static int LJFF(NLETrackSlot nLETrackSlot, ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (o.LJ(((EffectPointModel) it.next()).getUuid(), nLETrackSlot.getUUID())) {
                if (i > 0 && i < arrayList.size() && !nLETrackSlot.hasExtra("original_effect_order")) {
                    nLETrackSlot.setExtra("original_effect_order", String.valueOf(i));
                    return i;
                }
                return i;
            }
            i++;
        }
        return -1;
    }

    public static void LJI(NLETrack track, List effectTracks) {
        o.LJIIIZ(track, "track");
        o.LJIIIZ(effectTracks, "effectTracks");
        int indexOf = effectTracks.indexOf(track);
        if (indexOf < 0) {
            Iterator it = effectTracks.iterator();
            if (it.hasNext()) {
                Integer valueOf = Integer.valueOf(((NLETimeSpaceNode) it.next()).getLayer());
                while (it.hasNext()) {
                    Integer valueOf2 = Integer.valueOf(((NLETimeSpaceNode) it.next()).getLayer());
                    if (valueOf.compareTo(valueOf2) < 0) {
                        valueOf = valueOf2;
                    }
                }
                indexOf = valueOf.intValue() + 1;
            } else {
                throw new NoSuchElementException();
            }
        }
        track.setLayer(indexOf);
        track.setExtra("EffectTrackType", "NORMAL");
        C124574uj.LJJLIIIJILLIZJL(track, "video_effect");
        C124574uj.LJJLI(track);
    }

    public static void LJ(NLETrackSlot nLETrackSlot, EffectModel effectModel, NLEModel nLEModel, EnumC126794yJ effectSource) {
        NLEResourceNode LJ;
        NLEResourceNode LJ2;
        o.LJIIIZ(effectSource, "effectSource");
        NLESegment LJI = nLETrackSlot.LJI();
        if (LJI != null && effectModel != null) {
            LJI.setExtra("nleExtraEffectSelectedColor", String.valueOf(effectModel.color));
            LJI.setExtra("nleExtraEffectKey", effectModel.key);
            LJI.setExtra("nleExtraEffectType", String.valueOf(effectModel.type));
            LJI.setExtra("nleExtraEffectCategory", effectModel.category);
            LJI.setExtra("nleExtraEffectIndex", String.valueOf(effectModel.index));
            LJI.setExtra("nleExtraIsEditPro", String.valueOf(effectModel.isFromEditPro));
            LJI.setExtra("nleExtraEffectSelectFrom", effectModel.selectFrom);
            LJI.setExtra("nle_extra_resource_id", effectModel.resourceId);
            String str = effectModel.challenge;
            if (str == null) {
                str = "";
            }
            LJI.setExtra("nleExtraEffectChallenge", str);
            NLESegmentEffect LIZLLL = NLESegmentEffect.LIZLLL(LJI);
            if (LIZLLL != null && (LJ2 = LIZLLL.LJ()) != null) {
                LJ2.setExtra("biz_res_id", C134305Ow.LIZ(effectModel.resId, C139905eM.LIZ("normal_effect")));
            }
            NLESegmentComposerFilter LJIIIIZZ = NLESegmentComposerFilter.LJIIIIZZ(LJI);
            if (LJIIIIZZ != null && (LJ = LJIIIIZZ.LJ()) != null) {
                LJ.setExtra("biz_res_id", C134305Ow.LIZ(effectModel.resId, C139905eM.LIZ("normal_effect")));
            }
        }
        nLETrackSlot.setExtra("original_effect_order", String.valueOf(C122364rA.LIZ(nLEModel) + 1));
        nLETrackSlot.setExtra("extra_video_effect_source", String.valueOf(effectSource.getValue()));
    }
}
