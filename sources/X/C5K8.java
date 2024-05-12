package X;

import android.graphics.BitmapFactory;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEEditorJniJNI;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLEResourceAV;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegmentTransition;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.ss.android.vesdk.ROTATE_DEGREE;
import com.ss.android.vesdk.VEUtils;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.5K8, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5K8 {
    public static C122104qk LIZ(C5KD c5kd, NLEEditor empty) {
        Object obj;
        VEUtils.VEAudioFileInfo audioFileInfo;
        int[] iArr;
        float f;
        EnumC123874tb enumC123874tb;
        String str;
        List<VEUtils.VEAudioFileInfo> audioFileInfoForAllTracks;
        boolean z;
        boolean z2;
        long j;
        float f2;
        long j2;
        float f3;
        String str2;
        ROTATE_DEGREE rotate_degree;
        o.LJIIIZ(empty, "empty");
        empty.LJ().clearTrack();
        C122104qk c122104qk = new C122104qk();
        NLETrack nLETrack = new NLETrack();
        nLETrack.setExtra("__DEFAULT__", "__DEFAULT__");
        nLETrack.setLayer(0);
        boolean z3 = true;
        nLETrack.LJJ(true);
        String[] strArr = c5kd.LJIIIZ;
        if (strArr != null) {
            int length = strArr.length;
            long j3 = 0;
            int i = 0;
            int i2 = 0;
            while (i < length) {
                String str3 = strArr[i];
                int i3 = i2 + 1;
                String[] strArr2 = c5kd.LIZLLL;
                if (strArr2 != null) {
                    str = strArr2[i2];
                } else {
                    str = null;
                }
                C5K9 c5k9 = new C5K9();
                if ((str == null || str.length() == 0) && ((audioFileInfoForAllTracks = VEUtils.getAudioFileInfoForAllTracks(str3)) == null || audioFileInfoForAllTracks.isEmpty())) {
                    z = false;
                } else {
                    z = true;
                }
                c5k9.LJIIIIZZ = z;
                if (str == null || str.length() == 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                c5k9.LJIIIZ = !z2;
                if (C44694HgQ.LJIJI(str3, z3)) {
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    options.inJustDecodeBounds = z3;
                    BitmapFactory.decodeFile(str3, options);
                    c5k9.LJII = EnumC123874tb.IMAGE;
                    c5k9.LJIIJ = Integer.valueOf(options.outWidth);
                    c5k9.LJIIJJI = Integer.valueOf(options.outHeight);
                    c5k9.LJIIL = 3000L;
                    c5k9.LJIILIIL = str3;
                } else {
                    c5k9.LJII = EnumC123874tb.VIDEO;
                    c5k9.LJIILIIL = str3;
                    VEUtils.VEVideoFileInfo videoFileInfo = VEUtils.getVideoFileInfo(str3);
                    if (videoFileInfo != null) {
                        c5k9.LJIIL = Long.valueOf(videoFileInfo.duration);
                        c5k9.LJIIJ = Integer.valueOf(videoFileInfo.width);
                        c5k9.LJIIJJI = Integer.valueOf(videoFileInfo.height);
                        c5k9.LIZIZ = 0L;
                        c5k9.LIZJ = Long.valueOf(videoFileInfo.duration);
                    }
                }
                if (c5kd.LIZ != null) {
                    c5k9.LIZIZ = Long.valueOf(r0[i2]);
                }
                if (c5kd.LIZIZ != null) {
                    c5k9.LIZJ = Long.valueOf(r0[i2]);
                }
                c5k9.LIZLLL = j3;
                Long l = c5k9.LIZJ;
                long j4 = -1;
                if (l != null) {
                    j = l.longValue();
                } else {
                    j = -1;
                }
                Long l2 = c5k9.LIZIZ;
                if (l2 != null) {
                    j4 = l2.longValue();
                }
                long j5 = j - j4;
                if (j5 <= 0) {
                    Long l3 = c5k9.LJIIL;
                    if (l3 != null) {
                        j5 = l3.longValue();
                    } else {
                        j5 = 0;
                    }
                }
                c5k9.LJIIL = Long.valueOf(j5);
                ROTATE_DEGREE[] rotate_degreeArr = c5kd.LJII;
                if (rotate_degreeArr != null && (rotate_degree = rotate_degreeArr[i2]) != null) {
                    c5k9.LJFF = Float.valueOf(C87277YNd.LJJJ(rotate_degree));
                }
                float[] fArr = c5kd.LJI;
                if (fArr != null) {
                    c5k9.LJI = Float.valueOf(fArr[i2]);
                }
                float f4 = (float) j5;
                Float f5 = c5k9.LJI;
                if (f5 != null) {
                    f2 = f5.floatValue();
                } else {
                    f2 = 1.0f;
                }
                j3 += f4 / f2;
                Long l4 = c5k9.LJIIL;
                if (l4 != null) {
                    j2 = l4.longValue();
                } else {
                    j2 = 0;
                }
                float f6 = (float) j2;
                Float f7 = c5k9.LJI;
                if (f7 != null) {
                    f3 = f7.floatValue();
                } else {
                    f3 = 1.0f;
                }
                c5k9.LJ = (f6 / f3) + c5k9.LIZLLL;
                String[] strArr3 = c5kd.LIZJ;
                if (strArr3 != null && (str2 = strArr3[i2]) != null) {
                    c5k9.LJIILJJIL = str2;
                }
                c122104qk.LIZ.add(c5k9);
                i++;
                z3 = true;
                i2 = i3;
            }
        }
        Iterator<C5K9> it = new C122354r9(c122104qk).LIZIZ.LIZ.iterator();
        while (it.hasNext()) {
            C5K9 next = it.next();
            NLETrackSlot nLETrackSlot = new NLETrackSlot();
            nLETrackSlot.setStartTime(next.LIZLLL * 1000);
            nLETrackSlot.setEndTime(next.LJ * 1000);
            Float f8 = next.LJFF;
            if (f8 != null) {
                nLETrackSlot.setRotation(f8.floatValue());
            }
            String str4 = next.LJIILJJIL;
            if (str4 != null) {
                NLESegmentTransition nLESegmentTransition = new NLESegmentTransition();
                NLEResourceNode nLEResourceNode = new NLEResourceNode();
                nLEResourceNode.LJIIIZ(str4);
                NLEEditorJniJNI.NLESegmentTransition_setEffectSDKTransition(nLESegmentTransition.LIZJ, nLESegmentTransition, NLEResourceNode.LIZ(nLEResourceNode), nLEResourceNode);
                nLETrackSlot.LJIIJJI(nLESegmentTransition);
            }
            NLESegmentVideo nLESegmentVideo = new NLESegmentVideo();
            NLEResourceAV nLEResourceAV = new NLEResourceAV();
            if (next.LJIIJ != null) {
                nLEResourceAV.LJIILJJIL(r0.intValue());
            }
            if (next.LJIIJJI != null) {
                nLEResourceAV.LJIIIIZZ(r0.intValue());
            }
            Long l5 = next.LJIIL;
            if (l5 != null) {
                nLEResourceAV.setDuration(l5.longValue() * 1000);
            }
            String str5 = next.LJIILIIL;
            if (str5 != null) {
                nLEResourceAV.LJIIIZ(str5);
                if (C44687HgJ.LJIIJJI(str5)) {
                    enumC123874tb = EnumC123874tb.IMAGE;
                } else {
                    enumC123874tb = EnumC123874tb.VIDEO;
                }
                nLEResourceAV.LJIILIIL(enumC123874tb);
            }
            nLEResourceAV.LJIJI(next.LJIIIIZZ);
            if (nLEResourceAV.LJIIZILJ()) {
                f = 1.0f;
            } else {
                f = 0.0f;
            }
            nLESegmentVideo.LJIL(f);
            nLESegmentVideo.LJIILL(nLEResourceAV);
            Float f9 = next.LJI;
            if (f9 != null) {
                nLESegmentVideo.setSpeed(f9.floatValue());
            }
            Long l6 = next.LIZIZ;
            if (l6 != null) {
                nLESegmentVideo.LJIJJLI(l6.longValue() * 1000);
            }
            Long l7 = next.LIZJ;
            if (l7 != null) {
                nLESegmentVideo.LJIJJ(l7.longValue() * 1000);
            }
            nLETrackSlot.LJIIL(nLESegmentVideo);
            next.LIZ = nLETrackSlot.getName();
            nLETrackSlot.setExtra("has_origin_audio_slot", String.valueOf(next.LJIIIZ));
            nLETrack.LIZIZ(nLETrackSlot);
        }
        empty.LJ().addTrack(nLETrack);
        String[] strArr4 = c5kd.LIZLLL;
        if (strArr4 != null) {
            int length2 = strArr4.length;
            long j6 = 0;
            int i4 = 0;
            int i5 = 0;
            while (i4 < length2) {
                String str6 = strArr4[i4];
                int i6 = i5 + 1;
                C122004qa c122004qa = new C122004qa(EnumC122254qz.ORIGIN);
                c122004qa.LIZ = str6;
                if (VEUtils.getAudioFileInfo(str6) != null) {
                    c122004qa.LIZJ = 0L;
                    c122004qa.LIZLLL = r11.duration;
                }
                int[] iArr2 = c5kd.LJ;
                if (iArr2 != null) {
                    c122004qa.LIZJ = iArr2[i5];
                }
                if (c5kd.LJFF != null) {
                    c122004qa.LIZLLL = r0[i5];
                }
                if ((iArr2 == null || ORY.LJJJJ(i5, iArr2) == null || (iArr = c5kd.LJFF) == null || ORY.LJJJJ(i5, iArr) == null) && (audioFileInfo = VEUtils.getAudioFileInfo(str6)) != null) {
                    c122004qa.LIZJ = 0L;
                    c122004qa.LIZLLL = audioFileInfo.duration;
                }
                c122004qa.LJ = j6;
                j6 += c122004qa.LIZLLL - c122004qa.LIZJ;
                new C121794qF(c122004qa, false).LIZJ(empty);
                i4++;
                i5 = i6;
            }
        }
        Iterator LIZ = C0FS.LIZ(empty, "empty.model", "empty.model.tracks");
        while (true) {
            if (LIZ.hasNext()) {
                obj = LIZ.next();
                NLETrack it2 = (NLETrack) obj;
                o.LJIIIIZZ(it2, "it");
                if (o.LJ(C77357UXp.LJIILIIL(it2), EnumC122254qz.ORIGIN.name())) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        NLENode nLENode = (NLENode) obj;
        if (nLENode != null) {
            nLENode.setExtra("__DEFAULT__", "__DEFAULT__");
        }
        return c122104qk;
    }
}
