package X;

import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLESegment;
import com.bytedance.ies.nle.editor_jni.NLESegmentAudio;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.4su, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C123444su {
    public static void LIZ(NLEModel nLEModel, VideoPublishEditModel videoPublishEditModel) {
        boolean z;
        String str;
        boolean z2;
        float f;
        float f2;
        float LJIILJJIL;
        float LJIILJJIL2;
        if (videoPublishEditModel == null) {
            return;
        }
        VecNLETrackSPtr tracks = nLEModel.getTracks();
        ArrayList LIZ = C07080Po.LIZ(tracks, "nleModel.tracks");
        Iterator<NLETrack> it = tracks.iterator();
        while (it.hasNext()) {
            NLETrack next = it.next();
            NLETrack nLETrack = next;
            if (nLETrack.LJIIJ() || o.LJ(nLETrack.getExtra("AudioTrackType"), EnumC122254qz.ORIGIN.name()) || o.LJ(nLETrack.getExtra("AudioTrackType"), EnumC122254qz.REVERSE_AUDIO.name())) {
                LIZ.add(next);
            }
        }
        ArrayList arrayList = new ArrayList();
        Iterator it2 = LIZ.iterator();
        while (it2.hasNext()) {
            ORS.LJJLIIIJILLIZJL(((NLETrack) it2.next()).LJIILL(), arrayList);
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            Object next2 = it3.next();
            if (NLESegmentAudio.LIZLLL(((NLETrackSlot) next2).LJI()) != null) {
                arrayList2.add(next2);
            }
        }
        List<NLETrack> LJIJI = C124574uj.LJIJI(nLEModel);
        ArrayList arrayList3 = new ArrayList();
        Iterator<NLETrack> it4 = LJIJI.iterator();
        while (it4.hasNext()) {
            ORS.LJJLIIIJILLIZJL(it4.next().LJIILL(), arrayList3);
        }
        Iterator it5 = arrayList3.iterator();
        while (true) {
            if (it5.hasNext()) {
                NLESegmentAudio LIZLLL = NLESegmentAudio.LIZLLL(((NLETrackSlot) it5.next()).LJI());
                if (LIZLLL != null && LIZLLL.LJIILJJIL() != 0.0f) {
                    z = false;
                    break;
                }
            } else {
                z = true;
                break;
            }
        }
        NLETrack mainTrack = nLEModel.getMainTrack();
        if (mainTrack != null) {
            str = mainTrack.getExtra("is_maintrack_mute");
        } else {
            str = null;
        }
        boolean parseBoolean = Boolean.parseBoolean(str);
        if (z && parseBoolean) {
            z2 = true;
        } else {
            z2 = false;
        }
        Iterator it6 = arrayList2.iterator();
        float f3 = 0.0f;
        while (it6.hasNext()) {
            NLETrackSlot nLETrackSlot = (NLETrackSlot) it6.next();
            NLESegmentAudio LIZLLL2 = NLESegmentAudio.LIZLLL(nLETrackSlot.LJI());
            if (LIZLLL2 != null) {
                if (z2) {
                    String extra = nLETrackSlot.getExtra("slot_mute_volume");
                    o.LJIIIIZZ(extra, "slot.getExtra(SLOT_MUTE_VOLUME_KEY)");
                    Float LJJIJLIJ = C38350F3i.LJJIJLIJ(extra);
                    if (LJJIJLIJ != null) {
                        LJIILJJIL2 = LJJIJLIJ.floatValue();
                    } else {
                        LJIILJJIL2 = 0.0f;
                    }
                } else {
                    LJIILJJIL2 = LIZLLL2.LJIILJJIL();
                }
                if (LJIILJJIL2 > f3) {
                    f3 = LJIILJJIL2;
                }
            }
        }
        Iterator it7 = arrayList3.iterator();
        while (it7.hasNext()) {
            NLESegmentAudio LIZLLL3 = NLESegmentAudio.LIZLLL(((NLETrackSlot) it7.next()).LJI());
            if (LIZLLL3 != null && LIZLLL3.LJIILJJIL() > f3) {
                f3 = LIZLLL3.LJIILJJIL();
            }
        }
        if (z2) {
            f = 0.0f;
        } else {
            f = f3;
        }
        videoPublishEditModel.voiceVolume = f;
        NLETrack mainTrack2 = nLEModel.getMainTrack();
        if (mainTrack2 != null) {
            mainTrack2.setExtra("slot_mute_volume", String.valueOf(f3));
        }
        Iterator it8 = arrayList2.iterator();
        while (true) {
            float f4 = 1.0f;
            if (!it8.hasNext()) {
                break;
            }
            NLETrackSlot nLETrackSlot2 = (NLETrackSlot) it8.next();
            NLESegmentAudio LIZLLL4 = NLESegmentAudio.LIZLLL(nLETrackSlot2.LJI());
            if (LIZLLL4 != null) {
                if (z2) {
                    String extra2 = nLETrackSlot2.getExtra("slot_mute_volume");
                    o.LJIIIIZZ(extra2, "slot.getExtra(SLOT_MUTE_VOLUME_KEY)");
                    Float LJJIJLIJ2 = C38350F3i.LJJIJLIJ(extra2);
                    if (LJJIJLIJ2 != null) {
                        LJIILJJIL = LJJIJLIJ2.floatValue();
                    } else {
                        LJIILJJIL = 0.0f;
                    }
                } else {
                    LJIILJJIL = LIZLLL4.LJIILJJIL();
                }
                if (f3 != 0.0f) {
                    f4 = LJIILJJIL / f3;
                }
                nLETrackSlot2.setExtra("multi_original_voice_rate", String.valueOf(f4));
            }
        }
        Iterator it9 = arrayList3.iterator();
        while (it9.hasNext()) {
            NLETrackSlot nLETrackSlot3 = (NLETrackSlot) it9.next();
            NLESegmentAudio LIZLLL5 = NLESegmentAudio.LIZLLL(nLETrackSlot3.LJI());
            if (LIZLLL5 != null) {
                float LJIILJJIL3 = LIZLLL5.LJIILJJIL();
                if (f3 == 0.0f) {
                    f2 = 1.0f;
                } else {
                    f2 = LJIILJJIL3 / f3;
                }
                nLETrackSlot3.setExtra("multi_original_voice_rate", String.valueOf(f2));
            }
        }
        if (C120994ox.LIZ(nLEModel) != null) {
            Iterator<NLETrackSlot> it10 = nLEModel.getMainTrack().LJIILL().iterator();
            while (it10.hasNext()) {
                NLETrackSlot next3 = it10.next();
                if (next3.hasExtra("extra_associated_vc_slot_id")) {
                    NLESegmentVideo LJJ = NLESegmentVideo.LJJ(next3.LJI());
                    if (LJJ != null) {
                        LJJ.LJJIIJZLJL(true);
                    }
                    NLESegment LJI = next3.LJI();
                    if (LJI != null) {
                        C124574uj.LJJLIIIJJI(LJI, 0.0f);
                    }
                }
            }
        }
    }

    public static void LIZIZ(NLEModel nLEModel, boolean z) {
        Float f;
        NLETrack LIZ;
        NLETrackSlot nLETrackSlot;
        NLESegment LJI;
        C34K c34k = new C34K();
        boolean z2 = true;
        c34k.element = true;
        VecNLETrackSlotSPtr LJIILL = nLEModel.getMainTrack().LJIILL();
        ArrayList arrayList = new ArrayList();
        Iterator<NLETrackSlot> it = LJIILL.iterator();
        while (it.hasNext()) {
            NLETrackSlot next = it.next();
            NLETrackSlot it2 = next;
            o.LJIIIIZZ(it2, "it");
            if (C124574uj.LJJIJIIJI(it2)) {
                arrayList.add(next);
            }
        }
        boolean z3 = !arrayList.isEmpty();
        c34k.element = z3;
        if (z3) {
            if (z && (LIZ = C120994ox.LIZ(nLEModel)) != null) {
                Iterator<NLETrackSlot> it3 = nLEModel.getMainTrack().LJIILL().iterator();
                while (it3.hasNext()) {
                    NLETrackSlot next2 = it3.next();
                    if (next2.hasExtra("extra_associated_vc_slot_id")) {
                        NLESegmentVideo LJJ = NLESegmentVideo.LJJ(next2.LJI());
                        if (LJJ != null) {
                            LJJ.LJJIIJZLJL(false);
                        }
                        String extra = next2.getExtra("extra_associated_vc_slot_id");
                        Iterator<NLETrackSlot> it4 = LIZ.LJIILL().iterator();
                        while (true) {
                            if (it4.hasNext()) {
                                nLETrackSlot = it4.next();
                                if (o.LJ(nLETrackSlot.getUUID(), extra)) {
                                    break;
                                }
                            } else {
                                nLETrackSlot = null;
                                break;
                            }
                        }
                        NLETrackSlot nLETrackSlot2 = nLETrackSlot;
                        if (nLETrackSlot2 != null && (LJI = nLETrackSlot2.LJI()) != null) {
                            float LJJIIZI = C124574uj.LJJIIZI(LJI);
                            NLESegment LJI2 = next2.LJI();
                            o.LJIIIIZZ(LJI2, "it.mainSegment");
                            C124574uj.LJJLIIIJJI(LJI2, LJJIIZI);
                        }
                    }
                }
            }
            Iterator<NLETrackSlot> it5 = nLEModel.getMainTrack().LJIILL().iterator();
            while (it5.hasNext()) {
                NLETrackSlot it6 = it5.next();
                o.LJIIIIZZ(it6, "it");
                if (C124574uj.LJJIJIIJI(it6)) {
                    NLESegmentAudio nLESegmentAudio = (NLESegmentAudio) NLESegmentAudio.class.getMethod("LIZLLL", NLENode.class).invoke(null, it6.LJI());
                    if (nLESegmentAudio != null) {
                        f = Float.valueOf(nLESegmentAudio.LJIILJJIL());
                    } else {
                        f = null;
                    }
                    if (!o.LIZJ(f, 0.0f)) {
                    }
                }
            }
            nLEModel.getMainTrack().setExtra("is_maintrack_mute", String.valueOf(z2));
            nLEModel.getMainTrack().setExtra("is_maintrack_mute_enable", String.valueOf(c34k.element));
        }
        z2 = false;
        nLEModel.getMainTrack().setExtra("is_maintrack_mute", String.valueOf(z2));
        nLEModel.getMainTrack().setExtra("is_maintrack_mute_enable", String.valueOf(c34k.element));
    }
}
