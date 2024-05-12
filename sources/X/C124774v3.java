package X;

import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegment;
import com.bytedance.ies.nle.editor_jni.NLESegmentAudio;
import com.bytedance.ies.nle.editor_jni.NLESegmentTransition;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.PairSlotSlot;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import com.ss.ugc.android.editor.core.utils.LiveDataBus;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.4v3, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C124774v3 {
    public static boolean LIZIZ(InterfaceC124924vI editorContext, EnumC124724uy enumC124724uy) {
        NLETrackSlot selectedTrackSlot;
        NLEResourceNode LIZIZ;
        char c;
        long j;
        long j2;
        EnumC123874tb enumC123874tb;
        NLESegmentAudio nLESegmentAudio;
        NLESegmentAudio nLESegmentAudio2;
        NLESegmentAudio nLESegmentAudio3;
        NLEResourceNode LIZIZ2;
        NLETrackSlot LIZ;
        NLETrackSlot LJIILIIL;
        o.LJIIIZ(editorContext, "editorContext");
        NLETrack selectedTrack = editorContext.getSelectedTrack();
        if (selectedTrack == null || (selectedTrackSlot = editorContext.getSelectedTrackSlot()) == null) {
            return false;
        }
        long H9 = editorContext.getPlayer().H9();
        EnumC123874tb enumC123874tb2 = null;
        if (selectedTrackSlot.getMeasuredEndTime() - C124574uj.LJJLIIIJJIZ(H9) <= 100000 || C124574uj.LJJLIIIJJIZ(H9) - selectedTrackSlot.getStartTime() <= 100000) {
            NLESegment LJI = selectedTrackSlot.LJI();
            if (LJI != null && (LIZIZ = LJI.LIZIZ()) != null) {
                enumC123874tb2 = LIZIZ.LJFF();
            }
            if (enumC123874tb2 == EnumC123874tb.RECORD) {
                C132105Gk.LIZIZ(R.string.ts5);
            } else {
                C132105Gk.LIZIZ(R.string.fmq);
            }
            return false;
        }
        NLEModel LJJI = C79057V0z.LJJI(editorContext);
        long LJJLIIIJJIZ = C124574uj.LJJLIIIJJIZ(H9);
        if (C124864vC.LIZJ) {
            int LIZ2 = C124864vC.LIZ(LJJI, selectedTrackSlot);
            NLETrack LIZIZ3 = C141335gf.LIZIZ(LJJI);
            if (LIZIZ3 != null && (LJIILIIL = LIZIZ3.LJIILIIL(LIZ2)) != null) {
                EnumC123864ta LJIIZILJ = LIZIZ3.LJIIZILJ();
                o.LJIIIIZZ(LJIIZILJ, "originAudioTrack.trackType");
                int LIZ3 = C122524rQ.LIZ(LJJI, LJIIZILJ);
                PairSlotSlot LJJI2 = LIZIZ3.LJJI(LJJLIIIJJIZ, LJIILIIL);
                NLETrackSlot LIZ4 = LJJI2.LIZ();
                if (LIZ4 != null) {
                    LIZ4.LJIIJJI(null);
                }
                NLETrackSlot LIZIZ4 = LJJI2.LIZIZ();
                if (LIZIZ4 != null) {
                    LIZIZ4.setLayer(LIZ3);
                }
            }
        }
        String uuid = selectedTrackSlot.getUUID();
        EnumC123864ta LJJIJIL = C79057V0z.LJJIJIL(selectedTrack);
        EnumC123864ta enumC123864ta = EnumC123864ta.AUDIO;
        if (LJJIJIL == enumC123864ta) {
            if (o.LJ(selectedTrack.getExtra("AudioTrackType"), "BGM")) {
                long measuredEndTime = selectedTrackSlot.getMeasuredEndTime() - selectedTrackSlot.getMeasuredStartTime();
                selectedTrack.setExtra("AudioTrackType", "EDITOR_MUSIC");
                selectedTrackSlot.setEndTime(selectedTrackSlot.getStartTime() + measuredEndTime);
                NLESegmentAudio LIZLLL = NLESegmentAudio.LIZLLL(selectedTrackSlot.LJI());
                LIZLLL.LJIJJ(LIZLLL.LJIILIIL() + measuredEndTime);
            } else if (!selectedTrack.hasExtra("track_extra_is_audio_divided")) {
                selectedTrack.setExtra("track_extra_is_audio_divided", "true");
            }
        } else if (C79057V0z.LJJIJIL(selectedTrack) == EnumC123864ta.VIDEO && !selectedTrack.hasExtra("track_extra_is_video_divided")) {
            selectedTrack.setExtra("track_extra_is_video_divided", "true");
        }
        NLESegmentAudio nLESegmentAudio4 = (NLESegmentAudio) NLESegmentAudio.class.getMethod("LIZLLL", NLENode.class).invoke(null, selectedTrackSlot.LJI());
        if (nLESegmentAudio4 == null || (nLESegmentAudio4.LJII() == 0 && nLESegmentAudio4.LJIIIIZZ() == 0)) {
            c = 0;
        } else if (nLESegmentAudio4.LJII() > 0 && nLESegmentAudio4.LJIIIIZZ() == 0) {
            c = 1;
        } else if (nLESegmentAudio4.LJII() == 0 && nLESegmentAudio4.LJIIIIZZ() > 0) {
            c = 2;
        } else {
            c = 3;
        }
        NLESegmentAudio nLESegmentAudio5 = (NLESegmentAudio) NLESegmentAudio.class.getMethod("LIZLLL", NLENode.class).invoke(null, selectedTrackSlot.LJI());
        if (nLESegmentAudio5 != null) {
            j = nLESegmentAudio5.LJII();
        } else {
            j = 0;
        }
        NLESegmentAudio nLESegmentAudio6 = (NLESegmentAudio) NLESegmentAudio.class.getMethod("LIZLLL", NLENode.class).invoke(null, selectedTrackSlot.LJI());
        if (nLESegmentAudio6 != null) {
            j2 = nLESegmentAudio6.LJIIIIZZ();
        } else {
            j2 = 0;
        }
        PairSlotSlot LJJI3 = selectedTrack.LJJI(C124574uj.LJJLIIIJJIZ(H9), selectedTrackSlot);
        NLETrackSlot newSlot = LJJI3.LIZIZ();
        o.LJIIIIZZ(newSlot, "newSlot");
        NLEModel LJJI4 = C79057V0z.LJJI(editorContext);
        long LJJLIIIJJIZ2 = C124574uj.LJJLIIIJJIZ(H9);
        if (C124864vC.LJFF(LJJI4)) {
            C124864vC.LJFF.getClass();
            NLETrack LIZ5 = C120994ox.LIZ(LJJI4);
            if (LIZ5 != null && (LIZ = C120984ow.LIZ(selectedTrackSlot, LIZ5)) != null) {
                NLETrackSlot LIZIZ5 = LIZ5.LJJI(LJJLIIIJJIZ2, LIZ).LIZIZ();
                if (LIZIZ5 == null) {
                    C122384rC.LIZ(newSlot, LJJI4, true);
                } else {
                    newSlot.setExtra("extra_associated_vc_slot_id", LIZIZ5.getUUID());
                }
            }
        }
        NLESegment LJI2 = newSlot.LJI();
        if (LJI2 != null && (LIZIZ2 = LJI2.LIZIZ()) != null) {
            enumC123874tb = LIZIZ2.LJFF();
        } else {
            enumC123874tb = null;
        }
        if (enumC123874tb == EnumC123874tb.RECORD) {
            newSlot.setExtra("audio_record_order", String.valueOf(C124614un.LJII(C79057V0z.LJJI(editorContext)) + 1));
        }
        if (C124574uj.LJJJJZI(newSlot)) {
            newSlot.setExtra("slot_add_order", String.valueOf(C124574uj.LJJII(C79057V0z.LJJI(editorContext))));
        }
        LJJI3.LIZ().LJIIJJI(null);
        if (C79057V0z.LJJIJIL(selectedTrack) == EnumC123864ta.VIDEO && selectedTrack.LJIIJ() && !LJJI3.LIZ().hasExtra("split_ref_name")) {
            LJJI3.LIZ().setExtra("split_ref_name", uuid);
            LJJI3.LIZIZ().setExtra("split_ref_name", uuid);
        }
        if (C79057V0z.LJJIJIL(selectedTrack) == enumC123864ta) {
            LiveDataBus.getInstance().with("key_mainViewModel", Integer.TYPE).postValue(0);
            NLETrackSlot leftSlot = LJJI3.LIZ();
            NLETrackSlot rightSlot = LJJI3.LIZIZ();
            if (c != 1) {
                if (c != 2) {
                    if (c == 3) {
                        o.LJIIIIZZ(leftSlot, "leftSlot");
                        NLESegmentAudio nLESegmentAudio7 = (NLESegmentAudio) NLESegmentAudio.class.getMethod("LIZLLL", NLENode.class).invoke(null, leftSlot.LJI());
                        if (nLESegmentAudio7 != null) {
                            nLESegmentAudio7.LJIJ(0L);
                        }
                        o.LJIIIIZZ(rightSlot, "rightSlot");
                        NLESegmentAudio nLESegmentAudio8 = (NLESegmentAudio) NLESegmentAudio.class.getMethod("LIZLLL", NLENode.class).invoke(null, rightSlot.LJI());
                        if (nLESegmentAudio8 != null) {
                            nLESegmentAudio8.LJIIZILJ(0L);
                        }
                        long j3 = 2;
                        if (j > leftSlot.getDuration() / j3 && (nLESegmentAudio3 = (NLESegmentAudio) NLESegmentAudio.class.getMethod("LIZLLL", NLENode.class).invoke(null, leftSlot.LJI())) != null) {
                            nLESegmentAudio3.LJIIZILJ(leftSlot.getDuration() / j3);
                        }
                        if (j2 > rightSlot.getDuration() / j3 && (nLESegmentAudio2 = (NLESegmentAudio) NLESegmentAudio.class.getMethod("LIZLLL", NLENode.class).invoke(null, rightSlot.LJI())) != null) {
                            nLESegmentAudio2.LJIJ(rightSlot.getDuration() / j3);
                        }
                    }
                } else {
                    o.LJIIIIZZ(leftSlot, "leftSlot");
                    NLESegmentAudio nLESegmentAudio9 = (NLESegmentAudio) NLESegmentAudio.class.getMethod("LIZLLL", NLENode.class).invoke(null, leftSlot.LJI());
                    if (nLESegmentAudio9 != null) {
                        nLESegmentAudio9.LJIJ(0L);
                    }
                    long j4 = 2;
                    if (j2 > rightSlot.getDuration() / j4 && (nLESegmentAudio = (NLESegmentAudio) NLESegmentAudio.class.getMethod("LIZLLL", NLENode.class).invoke(null, rightSlot.LJI())) != null) {
                        nLESegmentAudio.LJIJ(rightSlot.getDuration() / j4);
                    }
                }
            } else {
                o.LJIIIIZZ(rightSlot, "rightSlot");
                NLESegmentAudio nLESegmentAudio10 = (NLESegmentAudio) NLESegmentAudio.class.getMethod("LIZLLL", NLENode.class).invoke(null, rightSlot.LJI());
                if (nLESegmentAudio10 != null) {
                    nLESegmentAudio10.LJIIZILJ(0L);
                }
                long j5 = 2;
                if (j > LJJI3.LIZ().getDuration() / j5) {
                    o.LJIIIIZZ(leftSlot, "leftSlot");
                    NLESegmentAudio nLESegmentAudio11 = (NLESegmentAudio) NLESegmentAudio.class.getMethod("LIZLLL", NLENode.class).invoke(null, leftSlot.LJI());
                    if (nLESegmentAudio11 != null) {
                        nLESegmentAudio11.LJIIZILJ(leftSlot.getDuration() / j5);
                    }
                }
            }
        }
        editorContext.getKeyframeEditor().LJJJJLL(selectedTrackSlot);
        C139795eB c139795eB = new C139795eB(EnumC126814yL.SPLIT.getNameId(), null, null, null, null, 30);
        if (enumC124724uy == EnumC124724uy.DONE) {
            C79057V0z.LJIILL(editorContext, C6YK.LIZ(c139795eB));
        } else {
            C79057V0z.LJIIL(editorContext);
        }
        editorContext.getPlayer().seek(H9);
        C79057V0z.LJJJJL(editorContext, "select_slot_event", new C127594zb(newSlot, null, 8));
        return true;
    }

    public static void LIZ(NLETrack nleTrack, NLETrackSlot nLETrackSlot, long[] range) {
        long measuredEndTime;
        long j;
        NLESegmentTransition LIZLLL;
        o.LJIIIZ(nleTrack, "nleTrack");
        o.LJIIIZ(range, "range");
        long startTime = nLETrackSlot.getStartTime();
        if (nleTrack.LJIIJ()) {
            measuredEndTime = nLETrackSlot.getEndTime();
        } else {
            measuredEndTime = nLETrackSlot.getMeasuredEndTime();
        }
        if (nleTrack.LJIIJ()) {
            int LJIILJJIL = nleTrack.LJIILJJIL(nLETrackSlot);
            VecNLETrackSlotSPtr LJIILLIIL = nleTrack.LJIILLIIL();
            long j2 = 0;
            if (LJIILJJIL > 0 && LJIILJJIL < LJIILLIIL.size() && (LIZLLL = LJIILLIIL.get(LJIILJJIL - 1).LIZLLL()) != null && LIZLLL.LJ()) {
                j = LIZLLL.LJFF();
            } else {
                j = 0;
            }
            NLESegmentTransition LIZLLL2 = nLETrackSlot.LIZLLL();
            if (LIZLLL2 != null && LIZLLL2.LJ()) {
                j2 = LIZLLL2.LJFF();
            }
            long j3 = 2;
            startTime += j / j3;
            measuredEndTime -= j2 / j3;
        }
        range[0] = startTime;
        range[1] = measuredEndTime;
    }
}
