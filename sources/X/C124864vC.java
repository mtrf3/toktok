package X;

import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLESegmentAudio;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.o;

/* renamed from: X.4vC, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C124864vC {
    public static boolean LIZ;
    public static boolean LIZIZ;
    public static boolean LIZJ;
    public static String LJ;
    public static final ReentrantLock LIZLLL = new ReentrantLock();
    public static final C120984ow LJFF = new C120984ow();

    public static void LIZLLL(NLEModel nleModel) {
        o.LJIIIZ(nleModel, "nleModel");
        if (LIZJ) {
            nleModel.setExtra("extra_key_realign_origin_slots", "true");
        }
        if (LJFF(nleModel)) {
            nleModel.setExtra("extra_key_realign_origin_slots", "true");
        }
    }

    public static void LJ(NLEModel nleModel) {
        NLESegmentAudio nLESegmentAudio;
        float f;
        Float LJJIJLIJ;
        List list;
        float f2;
        NLESegmentAudio nLESegmentAudio2;
        o.LJIIIZ(nleModel, "nleModel");
        LJFF.getClass();
        NLETrack LIZ2 = C120994ox.LIZ(nleModel);
        if (LIZ2 != null) {
            Iterator<NLETrackSlot> it = nleModel.getMainTrack().LJIILL().iterator();
            while (it.hasNext()) {
                NLETrackSlot it2 = it.next();
                o.LJIIIIZZ(it2, "it");
                NLETrackSlot LIZ3 = C120984ow.LIZ(it2, LIZ2);
                if (LIZ3 != null) {
                    LIZ3.setStartTime(it2.getStartTime());
                    LIZ3.setEndTime(it2.getEndTime());
                    LIZ3.setDuration(it2.getDuration());
                    NLESegmentAudio nLESegmentAudio3 = (NLESegmentAudio) NLESegmentVideo.class.getMethod("LJJ", NLENode.class).invoke(null, it2.LJI());
                    if (nLESegmentAudio3 != null && (nLESegmentAudio = (NLESegmentAudio) NLESegmentAudio.class.getMethod("LIZLLL", NLENode.class).invoke(null, LIZ3.LJI())) != null) {
                        if (LIZ3.hasExtra("extra_svc_speed")) {
                            String extra = LIZ3.getExtra("extra_svc_speed");
                            if (extra != null && (LJJIJLIJ = C38350F3i.LJJIJLIJ(extra)) != null) {
                                f = LJJIJLIJ.floatValue();
                            } else {
                                f = 1.0f;
                            }
                            float absSpeed = nLESegmentAudio3.getAbsSpeed();
                            if (absSpeed != 0.0f) {
                                nLESegmentAudio.setAbsSpeed(absSpeed * f);
                                nLESegmentAudio.LJIJJ(nLESegmentAudio3.LJIILIIL() + (((float) (nLESegmentAudio3.LJIIL() - nLESegmentAudio3.LJIILIIL())) * f));
                            }
                        } else {
                            nLESegmentAudio.setAbsSpeed(nLESegmentAudio3.getAbsSpeed());
                            nLESegmentAudio.LJIJJ(nLESegmentAudio3.LJIIL());
                        }
                        nLESegmentAudio.LJIJJLI(nLESegmentAudio3.LJIILIIL());
                    }
                }
            }
        }
        if (LIZ) {
            VecNLETrackSlotSPtr LJIILLIIL = nleModel.getMainTrack().LJIILLIIL();
            ArrayList arrayList = new ArrayList();
            Iterator<NLETrackSlot> it3 = LJIILLIIL.iterator();
            while (it3.hasNext()) {
                NLETrackSlot next = it3.next();
                NLETrackSlot it4 = next;
                o.LJIIIIZZ(it4, "it");
                if (C124574uj.LJJIJIIJIL(it4)) {
                    arrayList.add(next);
                }
            }
            NLETrack LIZIZ2 = C141335gf.LIZIZ(nleModel);
            if (LIZIZ2 == null || (list = LIZIZ2.LJIILLIIL()) == null) {
                list = C61878OQg.INSTANCE;
            }
            if (arrayList.size() != list.size()) {
                return;
            }
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                NLETrackSlot nLETrackSlot = (NLETrackSlot) ListProtector.get(list, i);
                NLETrackSlot nLETrackSlot2 = (NLETrackSlot) ListProtector.get(arrayList, i);
                nLETrackSlot.setStartTime(nLETrackSlot2.getStartTime());
                nLETrackSlot.setEndTime(nLETrackSlot2.getEndTime());
                nLETrackSlot.setDuration(nLETrackSlot2.getDuration());
                String extra2 = nLETrackSlot.getExtra("original_audio_speed_rate");
                o.LJIIIIZZ(extra2, "audioSlot.getExtra(SLOT_…RIGINAL_AUDIO_SPEED_RATE)");
                Float LJJIJLIJ2 = C38350F3i.LJJIJLIJ(extra2);
                if (LJJIJLIJ2 != null) {
                    f2 = LJJIJLIJ2.floatValue();
                } else {
                    f2 = 1.0f;
                }
                NLESegmentAudio nLESegmentAudio4 = (NLESegmentAudio) NLESegmentVideo.class.getMethod("LJJ", NLENode.class).invoke(null, nLETrackSlot2.LJI());
                if (nLESegmentAudio4 != null && (nLESegmentAudio2 = (NLESegmentAudio) NLESegmentAudio.class.getMethod("LIZLLL", NLENode.class).invoke(null, nLETrackSlot.LJI())) != null) {
                    nLESegmentAudio2.setAbsSpeed(nLESegmentAudio4.getAbsSpeed() * f2);
                    nLESegmentAudio2.LJIJJLI(((float) nLESegmentAudio4.LJIILIIL()) * f2);
                    nLESegmentAudio2.LJIJJ(((float) nLESegmentAudio4.LJIIL()) * f2);
                }
            }
        }
    }

    public static boolean LJFF(NLEModel nLEModel) {
        boolean z;
        if (C120994ox.LIZ(nLEModel) != null) {
            z = true;
        } else {
            z = false;
        }
        LIZIZ = z;
        return z;
    }

    public static int LIZ(NLEModel nleModel, NLETrackSlot videoSlot) {
        o.LJIIIZ(nleModel, "nleModel");
        o.LJIIIZ(videoSlot, "videoSlot");
        VecNLETrackSlotSPtr LJIILLIIL = nleModel.getMainTrack().LJIILLIIL();
        ArrayList arrayList = new ArrayList();
        Iterator<NLETrackSlot> it = LJIILLIIL.iterator();
        while (it.hasNext()) {
            NLETrackSlot next = it.next();
            NLETrackSlot it2 = next;
            o.LJIIIIZZ(it2, "it");
            if (C124574uj.LJJIJIIJIL(it2)) {
                arrayList.add(next);
            }
        }
        return arrayList.indexOf(videoSlot);
    }

    public static NLETrackSlot LIZIZ(NLEModel nleModel, NLETrackSlot nLETrackSlot) {
        o.LJIIIZ(nleModel, "nleModel");
        if (LIZJ) {
            int LIZ2 = LIZ(nleModel, nLETrackSlot);
            NLETrack LIZIZ2 = C141335gf.LIZIZ(nleModel);
            if (LIZIZ2 != null) {
                return LIZIZ2.LJIILIIL(LIZ2);
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0077, code lost:
    
        if (r2 == null) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZJ(com.bytedance.ies.nle.editor_jni.NLEModel r6, X.ActivityC45651qj r7) {
        /*
            java.lang.String r0 = "activity"
            kotlin.jvm.internal.o.LJIIIZ(r7, r0)
            boolean r0 = X.C124864vC.LIZ
            if (r0 != 0) goto Ld
            boolean r0 = X.C124864vC.LIZIZ
            if (r0 == 0) goto L3e
        Ld:
            java.lang.String r2 = "extra_key_realign_origin_slots"
            java.lang.String r0 = r6.getExtra(r2)
            if (r0 == 0) goto L3d
            java.util.concurrent.locks.ReentrantLock r1 = X.C124864vC.LIZLLL
            r1.lock()
            boolean r0 = java.lang.Boolean.parseBoolean(r0)     // Catch: java.lang.Throwable -> L35
            if (r0 == 0) goto L3a
            LJ(r6)     // Catch: java.lang.Throwable -> L35
            java.lang.String r0 = "false"
            r6.setExtra(r2, r0)     // Catch: java.lang.Throwable -> L35
            X.4vP r0 = com.ss.ugc.android.editor.core.EditorProContext.Companion     // Catch: java.lang.Throwable -> L35
            r0.getClass()     // Catch: java.lang.Throwable -> L35
            com.ss.ugc.android.editor.core.EditorProContext r0 = X.C124994vP.LIZ()     // Catch: java.lang.Throwable -> L35
            X.C79057V0z.LJIIL(r0)     // Catch: java.lang.Throwable -> L35
            goto L3a
        L35:
            r0 = move-exception
            r1.unlock()
            throw r0
        L3a:
            r1.unlock()
        L3d:
            return
        L3e:
            java.io.File r0 = r7.getFilesDir()
            java.lang.String r1 = r0.getAbsolutePath()
            java.lang.String r0 = "activity.filesDir.absolutePath"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            X.C124864vC.LJ = r1
            com.bytedance.ies.nle.editor_jni.NLETrack r5 = X.C141335gf.LIZIZ(r6)
            if (r5 != 0) goto L54
            return
        L54:
            r4 = 1
            X.C124864vC.LIZJ = r4
            com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr r0 = r6.getTracks()
            java.util.Iterator r3 = r0.iterator()
        L5f:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L79
            java.lang.Object r2 = r3.next()
            com.bytedance.ies.nle.editor_jni.NLETrack r2 = (com.bytedance.ies.nle.editor_jni.NLETrack) r2
            long r0 = r2.LIZ
            boolean r0 = com.bytedance.ies.nle.editor_jni.NLEEditorJniJNI.NLETrack_hasMainTrack(r0, r2)
            if (r0 == 0) goto L5f
            com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr r2 = r2.LJIILLIIL()
            if (r2 != 0) goto L7b
        L79:
            X.OQg r2 = X.C61878OQg.INSTANCE
        L7b:
            com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr r0 = r5.LJIILLIIL()
            int r1 = r0.size()
            int r0 = r2.size()
            if (r1 == r0) goto L8c
            LJ(r6)
        L8c:
            X.C124864vC.LIZ = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C124864vC.LIZJ(com.bytedance.ies.nle.editor_jni.NLEModel, X.1qj):void");
    }

    public static void LJI(NLEModel nLEModel, NLETrackSlot nLETrackSlot) {
        NLETrack LIZIZ2;
        if (LJFF(nLEModel)) {
            LJFF.getClass();
            C122384rC.LIZ(nLETrackSlot, nLEModel, true);
            nLEModel.setExtra("extra_key_realign_origin_slots", "true");
        }
        if (!LIZJ || (LIZIZ2 = C141335gf.LIZIZ(nLEModel)) == null) {
            return;
        }
        int LIZ2 = LIZ(nLEModel, nLETrackSlot);
        if (LIZ2 == -1) {
            nLEModel.setExtra("extra_key_realign_origin_slots", "true");
            return;
        }
        NLETrackSlot LJIILIIL = LIZIZ2.LJIILIIL(LIZ2);
        if (LJIILIIL == null) {
            return;
        }
        LIZIZ2.LJIJJLI(LJIILIIL);
        nLEModel.setExtra("extra_key_realign_origin_slots", "true");
    }

    public static void LJII(NLEModel nLEModel, NLETrackSlot nLETrackSlot, C124824v8 c124824v8) {
        NLETrackSlot LJIILIIL;
        float f;
        float absSpeed;
        boolean LJIIIZ;
        if (LJFF(nLEModel)) {
            nLEModel.setExtra("extra_key_realign_origin_slots", "true");
        }
        if (LIZJ) {
            int LIZ2 = LIZ(nLEModel, nLETrackSlot);
            if (LIZ2 == -1) {
                nLEModel.setExtra("extra_key_realign_origin_slots", "true");
                return;
            }
            NLETrack LIZIZ2 = C141335gf.LIZIZ(nLEModel);
            if (LIZIZ2 == null || (LJIILIIL = LIZIZ2.LJIILIIL(LIZ2)) == null) {
                return;
            }
            String extra = LJIILIIL.getExtra("original_audio_speed_rate");
            o.LJIIIIZZ(extra, "targetAudioSlot.getExtra…RIGINAL_AUDIO_SPEED_RATE)");
            Float LJJIJLIJ = C38350F3i.LJJIJLIJ(extra);
            if (LJJIJLIJ != null) {
                f = LJJIJLIJ.floatValue();
            } else {
                f = 1.0f;
            }
            NLESegmentAudio LIZLLL2 = NLESegmentAudio.LIZLLL(LJIILIIL.LJI());
            Float f2 = c124824v8.LIZ;
            if (f2 != null) {
                absSpeed = f2.floatValue() * f;
            } else {
                absSpeed = LIZLLL2.getAbsSpeed();
            }
            Boolean bool = c124824v8.LIZIZ;
            if (bool != null) {
                LJIIIZ = bool.booleanValue();
            } else {
                LJIIIZ = LIZLLL2.LJIIIZ();
            }
            LJIILIIL.setEndTime(nLETrackSlot.getEndTime());
            LJIILIIL.setDuration(nLETrackSlot.getDuration());
            LIZLLL2.setAbsSpeed(absSpeed + 0.001f);
            LIZLLL2.LJIJI(LJIIIZ);
            nLEModel.setExtra("extra_key_realign_origin_slots", "true");
        }
    }
}
