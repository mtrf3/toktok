package X;

import com.bytedance.ies.nle.editor_jni.NLEAudioCompileEncodeSettings;
import com.bytedance.ies.nle.editor_jni.NLEEditorJniJNI;
import com.bytedance.ies.nle.editor_jni.NLEError;
import com.bytedance.ies.nle.editor_jni.NLEMediaJniJNI;
import com.bytedance.ies.nle.editor_jni.NLEMediaPublicJniJNI;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLESegmentAudio;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import defpackage.e1;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.NoSuchElementException;
import java.util.concurrent.CountDownLatch;
import kotlin.jvm.internal.o;

/* renamed from: X.4y9, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C126694y9 {
    public static NLEError LIZ(String outputPath, NLEModel nleModel, InterfaceC88472Yns interfaceC88472Yns, InterfaceC88472Yns interfaceC88472Yns2, int i, int i2, int i3, InterfaceC88472Yns interfaceC88472Yns3, int i4) {
        Float f;
        Float f2;
        Float f3;
        InterfaceC88472Yns interfaceC88472Yns4 = interfaceC88472Yns2;
        InterfaceC88472Yns interfaceC88472Yns5 = interfaceC88472Yns;
        int i5 = i2;
        int i6 = i;
        InterfaceC88472Yns interfaceC88472Yns6 = interfaceC88472Yns3;
        int i7 = i3;
        if ((i4 & 4) != 0) {
            interfaceC88472Yns5 = null;
        }
        if ((i4 & 8) != 0) {
            interfaceC88472Yns4 = null;
        }
        if ((i4 & 16) != 0) {
            i6 = 2;
        }
        if ((i4 & 32) != 0) {
            i5 = 128000;
        }
        if ((i4 & 64) != 0) {
            i7 = 44100;
        }
        if ((i4 & 128) != 0) {
            interfaceC88472Yns6 = null;
        }
        o.LJIIIZ(outputPath, "outputPath");
        o.LJIIIZ(nleModel, "nleModel");
        if (e1.LIZ(31744, "extract_audio_use_compile_only_audio", true, false)) {
            NLEModel nLEModel = new NLEModel();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            NLETrack mainTrack = nleModel.getMainTrack();
            if (mainTrack != null) {
                Iterator<NLETrackSlot> it = mainTrack.LJIILL().iterator();
                while (it.hasNext()) {
                    NLETrackSlot next = it.next();
                    if (next.hasExtra("extra_associated_vc_slot_id")) {
                        String uuid = next.getUUID();
                        o.LJIIIIZZ(uuid, "it.uuid");
                        Boolean bool = Boolean.TRUE;
                        linkedHashMap.put(uuid, bool);
                        NLETrackSlot LIZIZ = C122424rG.LIZIZ(nleModel, next);
                        if (LIZIZ != null) {
                            String uuid2 = LIZIZ.getUUID();
                            o.LJIIIIZZ(uuid2, "slot.uuid");
                            linkedHashMap.put(uuid2, bool);
                        }
                    }
                }
            }
            VecNLETrackSPtr tracks = nleModel.getTracks();
            ArrayList LIZ = C07080Po.LIZ(tracks, "nleModel.tracks");
            Iterator<NLETrack> it2 = tracks.iterator();
            while (it2.hasNext()) {
                NLETrack next2 = it2.next();
                NLETrack it3 = next2;
                o.LJIIIIZZ(it3, "it");
                if (C78983UzD.LJJJJLI(it3) == EnumC123864ta.VIDEO && (interfaceC88472Yns5 == null || ((Boolean) interfaceC88472Yns5.invoke(it3)).booleanValue())) {
                    LIZ.add(next2);
                }
            }
            Iterator it4 = LIZ.iterator();
            long j = 0;
            while (it4.hasNext()) {
                NLETrack nLETrack = (NLETrack) it4.next();
                NLETrack LJFF = NLETrack.LJFF(nLETrack.deepClone());
                Iterator<NLETrackSlot> it5 = LJFF.LJIILL().iterator();
                while (it5.hasNext()) {
                    NLETrackSlot slot = it5.next();
                    if (nLETrack.LJIIJ()) {
                        if (interfaceC88472Yns6 != null) {
                            o.LJIIIIZZ(slot, "slot");
                            if (!((Boolean) interfaceC88472Yns6.invoke(slot)).booleanValue()) {
                                o.LJIIIIZZ(slot, "slot");
                                NLESegmentAudio nLESegmentAudio = (NLESegmentAudio) NLESegmentVideo.class.getMethod("LJJ", NLENode.class).invoke(null, slot.LJI());
                                if (nLESegmentAudio != null) {
                                    nLESegmentAudio.LJIL(0.0f);
                                }
                            }
                        }
                        o.LJIIIIZZ(slot, "slot");
                        NLESegmentAudio nLESegmentAudio2 = (NLESegmentAudio) NLESegmentVideo.class.getMethod("LJJ", NLENode.class).invoke(null, slot.LJI());
                        if (nLESegmentAudio2 != null && nLESegmentAudio2.LJIILJJIL() > 0.0f) {
                            j = Math.max(j, slot.getMeasuredEndTime());
                        }
                    } else {
                        o.LJIIIIZZ(slot, "slot");
                        NLESegmentAudio nLESegmentAudio3 = (NLESegmentAudio) NLESegmentVideo.class.getMethod("LJJ", NLENode.class).invoke(null, slot.LJI());
                        if (nLESegmentAudio3 != null) {
                            f3 = Float.valueOf(nLESegmentAudio3.LJIILJJIL());
                        } else {
                            f3 = null;
                        }
                        if (o.LIZJ(f3, 0.0f) || (interfaceC88472Yns6 != null && !((Boolean) interfaceC88472Yns6.invoke(slot)).booleanValue())) {
                            if (!linkedHashMap.containsKey(slot.getUUID())) {
                                LJFF.LJIJJLI(slot);
                            }
                        } else {
                            j = Math.max(j, slot.getMeasuredEndTime());
                        }
                    }
                }
                nLEModel.addTrack(LJFF);
            }
            if (interfaceC88472Yns5 != null) {
                NLETrack mainTrack2 = nleModel.getMainTrack();
                o.LJIIIIZZ(mainTrack2, "nleModel.mainTrack");
                if (!((Boolean) interfaceC88472Yns5.invoke(mainTrack2)).booleanValue()) {
                    NLETrack LJFF2 = NLETrack.LJFF(nleModel.deepClone());
                    NLEEditorJniJNI.NLETrack_setVolume(LJFF2.LIZ, LJFF2, 0.0f);
                    nLEModel.addTrack(LJFF2);
                }
            }
            VecNLETrackSPtr tracks2 = nleModel.getTracks();
            ArrayList LIZ2 = C07080Po.LIZ(tracks2, "nleModel.tracks");
            Iterator<NLETrack> it6 = tracks2.iterator();
            while (it6.hasNext()) {
                NLETrack next3 = it6.next();
                NLETrack it7 = next3;
                o.LJIIIIZZ(it7, "it");
                if (C78983UzD.LJJJJLI(it7) == EnumC123864ta.AUDIO && (interfaceC88472Yns4 == null || ((Boolean) interfaceC88472Yns4.invoke(it7)).booleanValue())) {
                    LIZ2.add(next3);
                }
            }
            Iterator it8 = LIZ2.iterator();
            while (it8.hasNext()) {
                NLETrack LJFF3 = NLETrack.LJFF(((NLENode) it8.next()).deepClone());
                Iterator<NLETrackSlot> it9 = LJFF3.LJIILL().iterator();
                while (it9.hasNext()) {
                    NLETrackSlot slot2 = it9.next();
                    o.LJIIIIZZ(slot2, "slot");
                    NLESegmentAudio nLESegmentAudio4 = (NLESegmentAudio) NLESegmentAudio.class.getMethod("LIZLLL", NLENode.class).invoke(null, slot2.LJI());
                    if (nLESegmentAudio4 != null) {
                        f2 = Float.valueOf(nLESegmentAudio4.LJIILJJIL());
                    } else {
                        f2 = null;
                    }
                    if (!o.LIZJ(f2, 0.0f)) {
                        j = Math.max(j, slot2.getMeasuredEndTime());
                    } else if (!linkedHashMap.containsKey(slot2.getUUID())) {
                        LJFF3.LJIJJLI(slot2);
                    }
                }
                nLEModel.addTrack(LJFF3);
            }
            if (((float) j) > 0.0f) {
                nLEModel.getMainTrack().setEndTime(j);
                VecNLETrackSlotSPtr LJIILLIIL = nLEModel.getMainTrack().LJIILLIIL();
                for (int size = LJIILLIIL.size() - 1; -1 < size; size--) {
                    NLETrackSlot nLETrackSlot = LJIILLIIL.get(size);
                    if (nLETrackSlot.getMeasuredEndTime() <= j) {
                        break;
                    }
                    if (nLETrackSlot.getStartTime() >= j) {
                        nLEModel.getMainTrack().LJIJJLI(nLETrackSlot);
                    } else {
                        long startTime = nLETrackSlot.getStartTime() + 1;
                        if (j <= nLETrackSlot.getMeasuredEndTime() && startTime <= j) {
                            nLETrackSlot.setEndTime(j);
                            NLESegmentAudio nLESegmentAudio5 = (NLESegmentAudio) NLESegmentVideo.class.getMethod("LJJ", NLENode.class).invoke(null, nLETrackSlot.LJI());
                            if (nLESegmentAudio5 != null) {
                                nLESegmentAudio5.LJIJJ(nLESegmentAudio5.LJIILIIL() + (nLETrackSlot.getEndTime() - nLETrackSlot.getStartTime()));
                            }
                        }
                    }
                }
            }
            String parent = new File(outputPath).getParent();
            o.LJIIIIZZ(parent, "outputFile.parent");
            C133765Mu c133765Mu = new C133765Mu(parent, null, null, null, 62);
            c133765Mu.LJZ(nLEModel);
            NLEAudioCompileEncodeSettings nLEAudioCompileEncodeSettings = new NLEAudioCompileEncodeSettings();
            NLEMediaJniJNI.NLEAudioCompileEncodeSettings_channelCount_set(nLEAudioCompileEncodeSettings.LIZ, nLEAudioCompileEncodeSettings, i6);
            NLEMediaJniJNI.NLEAudioCompileEncodeSettings_audioBps_set(nLEAudioCompileEncodeSettings.LIZ, nLEAudioCompileEncodeSettings, i5);
            NLEMediaJniJNI.NLEAudioCompileEncodeSettings_sampleRate_set(nLEAudioCompileEncodeSettings.LIZ, nLEAudioCompileEncodeSettings, i7);
            final CountDownLatch countDownLatch = new CountDownLatch(1);
            final C34K c34k = new C34K();
            c133765Mu.LJI().LJIIJJI.W8().LJII(outputPath, nLEAudioCompileEncodeSettings, new InterfaceC133955Nn() { // from class: X.5Cb
                @Override // X.InterfaceC133955Nn
                public final void onCompileProgress(float f4) {
                }

                @Override // X.InterfaceC133955Nn
                public final void onCompileDone() {
                    H7B.LJ("NLEAudioExtractor compile only audio success");
                    C34K.this.element = true;
                    countDownLatch.countDown();
                }

                @Override // X.InterfaceC133955Nn
                public final void onCompileError(int i8, int i9, float f4, String str) {
                    StringBuilder LIZJ = C06460Ne.LIZJ("NLEAudioExtractor compile only audio error: ", i8, " ext: ", i9, " f: ");
                    LIZJ.append(f4);
                    LIZJ.append(" msg: ");
                    LIZJ.append(str);
                    H7B.LIZJ(X1D.LIZIZ(LIZJ));
                    C34K.this.element = false;
                    countDownLatch.countDown();
                }
            });
            try {
                countDownLatch.await();
                if (c34k.element) {
                    return NLEError.SUCCESS;
                }
                return NLEError.FAILED;
            } catch (InterruptedException unused) {
                return NLEError.FAILED;
            }
        }
        NLEModel nLEModel2 = new NLEModel();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        NLETrack mainTrack3 = nleModel.getMainTrack();
        if (mainTrack3 != null) {
            Iterator<NLETrackSlot> it10 = mainTrack3.LJIILL().iterator();
            while (it10.hasNext()) {
                NLETrackSlot next4 = it10.next();
                if (next4.hasExtra("extra_associated_vc_slot_id")) {
                    String uuid3 = next4.getUUID();
                    o.LJIIIIZZ(uuid3, "it.uuid");
                    Boolean bool2 = Boolean.TRUE;
                    linkedHashMap2.put(uuid3, bool2);
                    NLETrackSlot LIZIZ2 = C122424rG.LIZIZ(nleModel, next4);
                    if (LIZIZ2 != null) {
                        String uuid4 = LIZIZ2.getUUID();
                        o.LJIIIIZZ(uuid4, "slot.uuid");
                        linkedHashMap2.put(uuid4, bool2);
                    }
                }
            }
        }
        VecNLETrackSPtr tracks3 = nleModel.getTracks();
        ArrayList LIZ3 = C07080Po.LIZ(tracks3, "nleModel.tracks");
        Iterator<NLETrack> it11 = tracks3.iterator();
        while (it11.hasNext()) {
            NLETrack next5 = it11.next();
            NLETrack it12 = next5;
            o.LJIIIIZZ(it12, "it");
            if (C78983UzD.LJJJJLI(it12) == EnumC123864ta.VIDEO && NLEEditorJniJNI.NLETrack_isAudioEnable(it12.LIZ, it12) && !o.LJ(it12.getExtra("RewindTrackType"), EnumC121854qL.VIDEO.name()) && (interfaceC88472Yns5 == null || ((Boolean) interfaceC88472Yns5.invoke(it12)).booleanValue())) {
                LIZ3.add(next5);
            }
        }
        Iterator it13 = LIZ3.iterator();
        while (it13.hasNext()) {
            NLETrack nLETrack2 = (NLETrack) it13.next();
            NLETrack LJFF4 = NLETrack.LJFF(nLETrack2.deepClone());
            Iterator<NLETrackSlot> it14 = LJFF4.LJIILL().iterator();
            while (it14.hasNext()) {
                NLETrackSlot slot3 = it14.next();
                o.LJIIIIZZ(slot3, "slot");
                NLESegmentAudio nLESegmentAudio6 = (NLESegmentAudio) NLESegmentVideo.class.getMethod("LJJ", NLENode.class).invoke(null, slot3.LJI());
                if (nLESegmentAudio6 != null) {
                    f = Float.valueOf(nLESegmentAudio6.LJIILJJIL());
                } else {
                    f = null;
                }
                if (o.LIZJ(f, 0.0f) || ((nLETrack2.LJIIJ() && o.LJ(slot3.getExtra("has_origin_audio_slot"), "true")) || (interfaceC88472Yns6 != null && !((Boolean) interfaceC88472Yns6.invoke(slot3)).booleanValue()))) {
                    if (!linkedHashMap2.containsKey(slot3.getUUID())) {
                        LJFF4.LJIJJLI(slot3);
                    }
                }
            }
            nLEModel2.addTrack(LJFF4);
        }
        VecNLETrackSPtr tracks4 = nleModel.getTracks();
        ArrayList LIZ4 = C07080Po.LIZ(tracks4, "nleModel.tracks");
        Iterator<NLETrack> it15 = tracks4.iterator();
        while (it15.hasNext()) {
            NLETrack next6 = it15.next();
            NLETrack it16 = next6;
            o.LJIIIIZZ(it16, "it");
            if (C78983UzD.LJJJJLI(it16) == EnumC123864ta.AUDIO && (interfaceC88472Yns4 == null || ((Boolean) interfaceC88472Yns4.invoke(it16)).booleanValue())) {
                LIZ4.add(next6);
            }
        }
        Iterator it17 = LIZ4.iterator();
        while (it17.hasNext()) {
            NLETrack LJFF5 = NLETrack.LJFF(((NLENode) it17.next()).deepClone());
            Iterator<NLETrackSlot> it18 = LJFF5.LJIILL().iterator();
            while (it18.hasNext()) {
                NLETrackSlot slot4 = it18.next();
                o.LJIIIIZZ(slot4, "slot");
                Float f4 = null;
                NLESegmentAudio nLESegmentAudio7 = (NLESegmentAudio) NLESegmentAudio.class.getMethod("LIZLLL", NLENode.class).invoke(null, slot4.LJI());
                if (nLESegmentAudio7 != null) {
                    f4 = Float.valueOf(nLESegmentAudio7.LJIILJJIL());
                }
                if (o.LIZJ(f4, 0.0f) && !linkedHashMap2.containsKey(slot4.getUUID())) {
                    LJFF5.LJIJJLI(slot4);
                }
            }
            nLEModel2.addTrack(LJFF5);
        }
        if (nLEModel2.getMainTrack() == null) {
            VecNLETrackSPtr tracks5 = nLEModel2.getTracks();
            if (tracks5 != null) {
                Iterator<NLETrack> it19 = tracks5.iterator();
                if (it19.hasNext()) {
                    NLETrack next7 = it19.next();
                    if (it19.hasNext()) {
                        long measuredEndTime = ((NLETimeSpaceNode) ORZ.LLFF(next7.LJIILLIIL())).getMeasuredEndTime();
                        do {
                            NLETrack next8 = it19.next();
                            long measuredEndTime2 = ((NLETimeSpaceNode) ORZ.LLFF(next8.LJIILLIIL())).getMeasuredEndTime();
                            if (measuredEndTime < measuredEndTime2) {
                                next7 = next8;
                                measuredEndTime = measuredEndTime2;
                            }
                        } while (it19.hasNext());
                    }
                    NLETrack nLETrack3 = next7;
                    if (nLETrack3 != null) {
                        nLETrack3.LJJ(true);
                        nLETrack3.setEndTime(((NLETimeSpaceNode) ORZ.LLFF(nLETrack3.LJIILLIIL())).getMeasuredEndTime());
                    }
                } else {
                    throw new NoSuchElementException();
                }
            }
            throw new RuntimeException("Try to extract audio by detach but NLEModel doesn't have mainTrack.");
        }
        NLEError swigToEnum = NLEError.swigToEnum(NLEMediaPublicJniJNI.NLEMediaUtil_detachAudioStreamFile__SWIG_1(outputPath, NLEModel.getCPtr(nLEModel2), nLEModel2, i6, i5, i7));
        o.LJIIIIZZ(swigToEnum, "detachAudioStreamFile(\n …    sampleRate,\n        )");
        return swigToEnum;
    }
}
