package X;

import com.bytedance.ies.nle.editor_jni.NLEError;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLESegmentAudio;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.vesdk.VEUtils;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* renamed from: X.6hB, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C167136hB {
    public static final /* synthetic */ int LIZ = 0;

    public static NLEError LIZ(String outputAudioFile, NLEModel nleModel, int i, int i2, int i3, boolean z, boolean z2) {
        NLEError nLEError;
        int i4 = i3;
        o.LJIIIZ(outputAudioFile, "outputAudioFile");
        o.LJIIIZ(nleModel, "nleModel");
        int i5 = i;
        int i6 = i2;
        if (i4 == 24000 && C167326hU.LIZ()) {
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("error_type", "detachAudio");
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("sampleRate=");
            LIZ2.append(i4);
            C1EU.LIZJ(LIZ2, ",bitRate=", i6, ",channels=", i5);
            c188727au.LJIIIZ("extra", X1D.LIZIZ(LIZ2));
            FMX.LJIIL("voice_conversion_extra_error", c188727au.LIZ);
            i4 = 44100;
        }
        ArrayList arrayList = new ArrayList();
        System.currentTimeMillis();
        Iterator<NLETrack> it = nleModel.getTracks().iterator();
        while (it.hasNext()) {
            NLETrack next = it.next();
            if (C79057V0z.LJJIJIL(next) == EnumC123864ta.VIDEO || C79057V0z.LJJIJIL(next) == EnumC123864ta.AUDIO) {
                StringBuilder LJFF = C72972SkS.LJFF(outputAudioFile, '_');
                LJFF.append(next.getName());
                String LIZIZ = X1D.LIZIZ(LJFF);
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                ArrayList arrayList5 = new ArrayList();
                ArrayList arrayList6 = new ArrayList();
                ArrayList arrayList7 = new ArrayList();
                Iterator<NLETrackSlot> it2 = next.LJIILLIIL().iterator();
                long j = -1;
                long j2 = -1;
                while (it2.hasNext()) {
                    NLETrackSlot next2 = it2.next();
                    NLESegmentAudio LIZLLL = NLESegmentAudio.LIZLLL(next2.LJI());
                    if (LIZLLL != null) {
                        String LIZJ = LIZLLL.LIZIZ().LIZJ();
                        o.LJIIIIZZ(LIZJ, "segmentAudioVideo.resource.resourceFile");
                        arrayList2.add(LIZJ);
                        if (z2) {
                            arrayList3.add(-1L);
                            arrayList4.add(-1L);
                            arrayList7.add(Float.valueOf(1.0f));
                            arrayList5.add(-1L);
                            arrayList6.add(-1L);
                        } else {
                            long j3 = 1000;
                            arrayList3.add(Long.valueOf(LIZLLL.LJIILIIL() / j3));
                            arrayList4.add(Long.valueOf(LIZLLL.LJIIL() / j3));
                            arrayList7.add(Float.valueOf(next2.getSpeed()));
                            arrayList5.add(Long.valueOf(next2.getMeasuredStartTime() / j3));
                            arrayList6.add(Long.valueOf(next2.getMeasuredEndTime() / j3));
                            j2 = next.getMeasuredEndTime() / j3;
                            j = 0;
                        }
                    }
                }
                i5 = i5;
                i6 = i6;
                int detachAudioFromVideos = VEUtils.detachAudioFromVideos(LIZIZ, (String[]) arrayList2.toArray(new String[0]), ORZ.LLJIJIL(arrayList3), ORZ.LLJIJIL(arrayList4), ORZ.LLJIJIL(arrayList5), ORZ.LLJIJIL(arrayList6), j, j2, ORZ.LLIZ(arrayList7), i5, i6, i4, VEUtils.CompatibleMode.Skip_invalid);
                Iterator it3 = arrayList2.iterator();
                while (it3.hasNext()) {
                    it3.next();
                }
                if (detachAudioFromVideos != -100) {
                    if (detachAudioFromVideos != -1) {
                        if (detachAudioFromVideos != 0) {
                            nLEError = NLEError.FAILED;
                        } else {
                            nLEError = NLEError.SUCCESS;
                        }
                    } else {
                        nLEError = NLEError.FAILED;
                    }
                } else {
                    nLEError = NLEError.PARAM_INVALID;
                }
                if (nLEError == NLEError.SUCCESS) {
                    arrayList.add(LIZIZ);
                }
            }
        }
        NLEError nLEError2 = NLEError.FAILED;
        System.currentTimeMillis();
        if (arrayList.size() > 0 && (z || arrayList.size() > 1)) {
            int mixAudio = VEUtils.mixAudio(arrayList, outputAudioFile, null);
            if (mixAudio != -100) {
                if (mixAudio != -1 && mixAudio == 0) {
                    nLEError2 = NLEError.SUCCESS;
                }
            } else {
                nLEError2 = NLEError.PARAM_INVALID;
            }
        } else if (arrayList.size() > 0 && C44687HgJ.LIZIZ((String) ListProtector.get(arrayList, 0)) && C44687HgJ.LJIIIIZZ((String) ListProtector.get(arrayList, 0)) > 0) {
            C44687HgJ.LIZLLL((String) ListProtector.get(arrayList, 0), outputAudioFile);
            nLEError2 = NLEError.SUCCESS;
        }
        Iterator it4 = arrayList.iterator();
        while (it4.hasNext()) {
            C44687HgJ.LJIILJJIL((String) it4.next());
        }
        return nLEError2;
    }
}
