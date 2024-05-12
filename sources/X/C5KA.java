package X;

import android.graphics.BitmapFactory;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEEditorJniJNI;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLEResourceAV;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegmentAudio;
import com.bytedance.ies.nle.editor_jni.NLESegmentTransition;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackAlgorithm;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.ss.android.vesdk.ROTATE_DEGREE;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* renamed from: X.5KA, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5KA {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(C5KG c5kg, NLEEditor nleEditor) {
        float f;
        NLETrack nLETrack;
        NLEResourceAV nLEResourceAV;
        String str;
        float f2;
        ROTATE_DEGREE rotate_degree;
        o.LJIIIZ(nleEditor, "nleEditor");
        if (c5kg instanceof C5KE) {
            return;
        }
        long j = 0;
        int i = 0;
        boolean z = true;
        if (c5kg instanceof C5KD) {
            C5KD c5kd = (C5KD) c5kg;
            NLEModel LJ = nleEditor.LJ();
            if (LJ == null) {
                return;
            }
            LJ.clearTrack();
            NLETrack nLETrack2 = new NLETrack();
            nLETrack2.setExtra("__DEFAULT__", "__DEFAULT__");
            nLETrack2.setLayer(0);
            nLETrack2.LJJ(true);
            String[] strArr = c5kd.LJIIIZ;
            if (strArr != null) {
                int length = strArr.length;
                int i2 = 0;
                int i3 = 0;
                while (i2 < length) {
                    String str2 = strArr[i2];
                    int i4 = i3 + 1;
                    NLETrackSlot nLETrackSlot = new NLETrackSlot();
                    nLETrackSlot.setStartTime(j);
                    ROTATE_DEGREE[] rotate_degreeArr = c5kd.LJII;
                    if (rotate_degreeArr != null && (rotate_degree = rotate_degreeArr[i3]) != null) {
                        nLETrackSlot.setRotation(C87277YNd.LJJJ(rotate_degree));
                    }
                    NLESegmentVideo nLESegmentVideo = new NLESegmentVideo();
                    if (C44687HgJ.LJIIJJI(str2)) {
                        BitmapFactory.Options options = new BitmapFactory.Options();
                        options.inJustDecodeBounds = z;
                        C44694HgQ.LIZLLL(str2, options);
                        NLEResourceAV nLEResourceAV2 = new NLEResourceAV();
                        nLEResourceAV2.LJIILIIL(EnumC123874tb.IMAGE);
                        nLEResourceAV2.LJIILJJIL(options.outWidth);
                        nLEResourceAV2.LJIIIIZZ(options.outHeight);
                        nLEResourceAV2.setDuration(3000 * 1000);
                        nLEResourceAV2.LJIIIZ(str2);
                        nLESegmentVideo.LJIILL(nLEResourceAV2);
                    } else {
                        try {
                            C173916s7 LIZIZ = C173926s8.LIZIZ(str2);
                            nLEResourceAV = new NLEResourceAV();
                            nLEResourceAV.LJIILIIL(EnumC123874tb.VIDEO);
                            int i5 = LIZIZ.LJII;
                            if (i5 == 90 || i5 == 270) {
                                nLEResourceAV.LJIILJJIL(LIZIZ.LIZLLL);
                                nLEResourceAV.LJIIIIZZ(LIZIZ.LIZJ);
                            } else {
                                nLEResourceAV.LJIILJJIL(LIZIZ.LIZJ);
                                nLEResourceAV.LJIIIIZZ(LIZIZ.LIZLLL);
                            }
                            nLEResourceAV.setDuration(LIZIZ.LJ * 1000);
                            nLEResourceAV.LJIIIZ(str2);
                        } catch (Exception e) {
                            C16880lQ.LLLLIIL(e);
                            e.getMessage();
                            nLEResourceAV = null;
                        }
                        nLESegmentVideo.LJIILL(nLEResourceAV);
                    }
                    float[] fArr = c5kd.LJI;
                    if (fArr != null) {
                        nLESegmentVideo.setSpeed(fArr[i3]);
                    }
                    if (c5kd.LIZ != null) {
                        nLESegmentVideo.LJIJJLI(r0[i3] * 1000);
                    }
                    if (c5kd.LIZIZ != null) {
                        nLESegmentVideo.LJIJJ(r0[i3] * 1000);
                    }
                    if (i3 == 0) {
                        C5NI toNLERatio = c5kd.LJIIIIZZ;
                        NLEResourceAV LJ2 = nLESegmentVideo.LJ();
                        o.LJIIIIZZ(LJ2, "segment.avFile");
                        if (LJ2.LJI() != 0) {
                            NLEResourceAV LJ3 = nLESegmentVideo.LJ();
                            o.LJIIIIZZ(LJ3, "segment.avFile");
                            if (LJ3.LIZIZ() != 0) {
                                NLEResourceAV LJ4 = nLESegmentVideo.LJ();
                                o.LJIIIIZZ(LJ4, "segment.avFile");
                                long LJI = LJ4.LJI();
                                NLEResourceAV LJ5 = nLESegmentVideo.LJ();
                                o.LJIIIIZZ(LJ5, "segment.avFile");
                                long LIZIZ2 = LJ5.LIZIZ();
                                o.LJIIIZ(toNLERatio, "$this$toNLERatio");
                                if (LJI != 0 && LIZIZ2 != 0) {
                                    int i6 = C87279YNf.LJIIJJI[toNLERatio.ordinal()];
                                    if (i6 != 1) {
                                        if (i6 != 2) {
                                            if (i6 != 3) {
                                                if (i6 != 4) {
                                                    if (i6 != 5) {
                                                        f2 = ((float) LJI) / ((float) LIZIZ2);
                                                    } else {
                                                        f2 = 0.5625f;
                                                    }
                                                } else {
                                                    f2 = 1.7777778f;
                                                }
                                            } else {
                                                f2 = 0.75f;
                                            }
                                        } else {
                                            f2 = 1.3333334f;
                                        }
                                    } else {
                                        f2 = 1.0f;
                                    }
                                    LJ.setCanvasRatio(f2);
                                } else {
                                    throw new IllegalArgumentException("vWidth or vHeight can not be null");
                                }
                            }
                        }
                        LJ.setCanvasRatio(0.5625f);
                    }
                    nLETrackSlot.LJIIL(nLESegmentVideo);
                    String[] strArr2 = c5kd.LIZJ;
                    if (strArr2 != null && (str = strArr2[i3]) != null) {
                        NLESegmentTransition nLESegmentTransition = new NLESegmentTransition();
                        NLEResourceNode nLEResourceNode = new NLEResourceNode();
                        nLEResourceNode.LJIIIZ(str);
                        NLEEditorJniJNI.NLESegmentTransition_setEffectSDKTransition(nLESegmentTransition.LIZJ, nLESegmentTransition, NLEResourceNode.LIZ(nLEResourceNode), nLEResourceNode);
                        nLETrackSlot.LJIIJJI(nLESegmentTransition);
                    }
                    nLETrack2.LIZIZ(nLETrackSlot);
                    i2++;
                    i3 = i4;
                    z = true;
                    j = 0;
                }
            }
            if (c5kd.LIZLLL != null) {
                nLETrack = new NLETrack();
                nLETrack.setExtra("__DEFAULT__", "__DEFAULT__");
                String[] strArr3 = c5kd.LIZLLL;
                if (strArr3 != null) {
                    int length2 = strArr3.length;
                    int i7 = 0;
                    int i8 = 0;
                    while (i7 < length2) {
                        String str3 = strArr3[i7];
                        int i9 = i8 + 1;
                        NLETrackSlot nLETrackSlot2 = new NLETrackSlot();
                        NLESegmentAudio nLESegmentAudio = new NLESegmentAudio();
                        NLEResourceAV nLEResourceAV3 = new NLEResourceAV();
                        nLEResourceAV3.LJIILIIL(EnumC123874tb.AUDIO);
                        nLEResourceAV3.LJIIIZ(str3);
                        nLESegmentAudio.LJIILL(nLEResourceAV3);
                        if (c5kd.LJ != null) {
                            nLESegmentAudio.LJIJJLI(r0[i8] * 1000);
                        }
                        if (c5kd.LJFF != null) {
                            nLESegmentAudio.LJIJJ(r0[i8] * 1000);
                        }
                        nLETrackSlot2.LJIIL(nLESegmentAudio);
                        nLETrack.LIZIZ(nLETrackSlot2);
                        i7++;
                        i8 = i9;
                    }
                }
            } else {
                nLETrack = null;
            }
            LJ.addTrack(nLETrack2);
            LJ.addTrack(nLETrack);
            nleEditor.LIZIZ();
            return;
        }
        if (c5kg instanceof C5KC) {
            C5KC c5kc = (C5KC) c5kg;
            NLEModel nleModel = nleEditor.LJ();
            o.LJIIIIZZ(nleModel, "nleModel");
            String[] videoFilePaths = c5kc.LIZ;
            C5NI videoOutRes = c5kc.LIZIZ;
            o.LJIIIZ(videoFilePaths, "videoFilePaths");
            o.LJIIIZ(videoOutRes, "videoOutRes");
            VecNLETrackSPtr tracks = nleModel.getTracks();
            o.LJIIIIZZ(tracks, "nleModel.tracks");
            Iterator<NLETrack> it = tracks.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                NLETrack next = it.next();
                NLETrack it2 = next;
                o.LJIIIIZZ(it2, "it");
                if (it2.LJIIJ() && o.LJ(it2.getExtra("__Algorithm__"), "__Algorithm__")) {
                    if (next != null) {
                        throw new RuntimeException("addAlgorithm failed");
                    }
                }
            }
            NLETrackAlgorithm nLETrackAlgorithm = new NLETrackAlgorithm();
            nLETrackAlgorithm.setExtra("__Algorithm__", "__Algorithm__");
            nLETrackAlgorithm.LJJ(true);
            int length3 = videoFilePaths.length;
            int i10 = 0;
            while (i < length3) {
                String str4 = videoFilePaths[i];
                int i11 = i10 + 1;
                NLETrackSlot nLETrackSlot3 = new NLETrackSlot();
                NLESegmentVideo nLESegmentVideo2 = new NLESegmentVideo();
                NLEResourceAV nLEResourceAV4 = new NLEResourceAV();
                nLEResourceAV4.LJIIIZ(str4);
                nLETrackSlot3.setStartTime(0L);
                nLETrackSlot3.setEndTime(0L);
                nLESegmentVideo2.LJIILL(nLEResourceAV4);
                nLETrackSlot3.setStartTime(i10 * 1000);
                nLETrackSlot3.setEndTime(i11 * 1000);
                nLETrackSlot3.LJIIL(nLESegmentVideo2);
                nLETrackAlgorithm.LIZIZ(nLETrackSlot3);
                int i12 = C5NH.LIZ[videoOutRes.ordinal()];
                if (i12 != 1) {
                    if (i12 != 2) {
                        if (i12 != 3) {
                            if (i12 != 4) {
                                if (i12 != 5) {
                                    f = -1.0f;
                                } else {
                                    f = 0.5625f;
                                }
                            } else {
                                f = 1.7777778f;
                            }
                        } else {
                            f = 0.75f;
                        }
                    } else {
                        f = 1.3333334f;
                    }
                } else {
                    f = 1.0f;
                }
                NLEEditorJniJNI.NLETrackAlgorithm_setVideoRatio(nLETrackAlgorithm.LIZJ, nLETrackAlgorithm, f);
                i++;
                i10 = i11;
            }
            nleModel.addTrack(nLETrackAlgorithm);
            return;
        }
        if ((c5kg instanceof P5O) || (c5kg instanceof C5KB) || (c5kg instanceof YOP)) {
            return;
        }
        if (!(c5kg instanceof YON)) {
            if ((c5kg instanceof C5KF) || !(c5kg instanceof P5N)) {
            } else {
                throw null;
            }
        } else {
            o.LJIIIIZZ(nleEditor.LJ(), "nleModel");
            o.LJIIIZ(null, "veMVModel");
            throw null;
        }
    }
}
