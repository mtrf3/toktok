package X;

import android.content.Context;
import android.text.TextUtils;
import android.view.SurfaceView;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEEditorJniJNI;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLEResourceAV;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegmentMV;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideoAnimation;
import com.bytedance.ies.nle.editor_jni.NLEStyCanvas;
import com.bytedance.ies.nle.editor_jni.NLEStyCrop;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackAlgorithm;
import com.bytedance.ies.nle.editor_jni.NLETrackMV;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.NLEVideoAnimation;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ttve.nativePort.TEInterface;
import com.ss.android.ugc.aweme.canvas.CanvasFilterParam;
import com.ss.android.ugc.aweme.canvas.CanvasVideoData;
import com.ss.android.ugc.aweme.mvtheme.MvCreateVideoData;
import com.ss.android.ugc.aweme.mvtheme.MvNetFileBean;
import com.ss.android.ugc.aweme.services.video.VEVolumeChangeOp;
import com.ss.android.ugc.aweme.setting.performance.OpenUseVEUserConfigForImageOptimize;
import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoRecordData;
import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoSegmentRecordData;
import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoStatusRecordData;
import com.ss.android.ugc.aweme.shortvideo.stitch.StitchParams;
import com.ss.android.vesdk.VEEditor;
import com.ss.android.vesdk.VERecordData;
import com.ss.android.vesdk.VEUtils;
import com.ss.android.vesdk.clipparam.VEClipAlgorithmParam;
import com.ss.android.vesdk.filterparam.VEAudioVolumeFilterParam;
import com.ss.android.vesdk.filterparam.VEBaseFilterParam;
import com.ss.android.vesdk.filterparam.VEImageTransformFilterParam;
import com.ss.android.vesdk.filterparam.VEVideoCropFilterParam;
import com.ss.android.vesdk.filterparam.VEVideoTransformFilterParam;
import dmt.av.video.VEPreviewMusicParams;
import dmt.av.video.VEPreviewParams;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.jvm.internal.o;

/* renamed from: X.5K2, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5K2 {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(C5K3.LJLIL);

    public static final boolean LIZIZ() {
        return ((Boolean) LIZ.getValue()).booleanValue();
    }

    public static final C5MG LIZ(int i, final C135235Sl configure) {
        o.LJIIIZ(configure, "configure");
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("VEVideoEditorFactory createVideoEditor type: ");
        LIZ2.append(i);
        H7B.LJ(X1D.LIZIZ(LIZ2));
        if (i != 2) {
            if (i != 3) {
                if (i != 4) {
                    if (i != 6) {
                        if (i != 7) {
                            if (i != 10) {
                                if (i != 11) {
                                    if (i != 13) {
                                        if (LIZIZ()) {
                                            configure.LIZJ = true;
                                        }
                                        ScheduledExecutorService LJ = C38995FSd.LJ();
                                        o.LJIIIIZZ(LJ, "getScheduledExecutor()");
                                        return new C5KX(configure, LJ);
                                    }
                                    if (LIZIZ()) {
                                        configure.LIZJ = true;
                                    }
                                    return new C146085oK(configure);
                                }
                                if (LIZIZ()) {
                                    configure.LIZJ = true;
                                }
                                return new C5MG(configure) { // from class: X.4tj
                                    public float LJJIJIIJI;

                                    {
                                        o.LJIIIIZZ(C38995FSd.LJ(), "getScheduledExecutor()");
                                        this.LJJIJIIJI = 1.0f;
                                    }

                                    @Override // X.C5MG
                                    public final NLEEditor LJII(VEPreviewParams params) {
                                        List<String> sourceInfo;
                                        boolean z;
                                        boolean z2;
                                        EnumC123874tb enumC123874tb;
                                        long j;
                                        long j2;
                                        List<CanvasFilterParam> transformList;
                                        CanvasFilterParam canvasFilterParam;
                                        float f;
                                        EnumC123874tb enumC123874tb2;
                                        long j3;
                                        float f2;
                                        long j4;
                                        long j5;
                                        long j6;
                                        List<CanvasFilterParam> transformList2;
                                        CanvasFilterParam canvasFilterParam2;
                                        o.LJIIIZ(params, "params");
                                        NLEEditor nLEEditor = new NLEEditor();
                                        StringBuilder LIZ3 = X1D.LIZ();
                                        LIZ3.append("setEnableEffectCanvas: ");
                                        LIZ3.append(true);
                                        P4Q.LJFF("VEEditor", X1D.LIZIZ(LIZ3));
                                        TEInterface.nativeEnableEffectCanvas(true);
                                        CanvasVideoData canvasVideoData = params.canvasVideoPreviewData;
                                        if (canvasVideoData != null && (sourceInfo = canvasVideoData.getSourceInfo()) != null && !sourceInfo.isEmpty()) {
                                            if (params.getCanvasHeight() != 0) {
                                                nLEEditor.LJ().setCanvasRatio(params.getCanvasWidth() / params.getCanvasHeight());
                                            }
                                            NLEModel LJ2 = nLEEditor.LJ();
                                            o.LJIIIIZZ(LJ2, "empty.model");
                                            NLEStyCanvas nLEStyCanvas = new NLEStyCanvas();
                                            List<CanvasVideoData> externalTracks = canvasVideoData.getExternalTracks();
                                            if (externalTracks == null || externalTracks.isEmpty()) {
                                                z = true;
                                            } else {
                                                z = false;
                                            }
                                            if (z) {
                                                nLEStyCanvas.setExtra("IS_SCENE_CANVAS_DMT", "true");
                                            }
                                            C123904te.LIZ(canvasVideoData.getBackground(), nLEStyCanvas);
                                            List<String> sourceInfo2 = canvasVideoData.getSourceInfo();
                                            if (sourceInfo2 == null || sourceInfo2.isEmpty()) {
                                                sourceInfo2 = null;
                                            }
                                            if (sourceInfo2 != null) {
                                                int size = sourceInfo2.size();
                                                int[] iArr = params.mVTrimIn;
                                                if (iArr == null) {
                                                    iArr = new int[size];
                                                    for (int i2 = 0; i2 < size; i2++) {
                                                        iArr[i2] = 0;
                                                    }
                                                }
                                                int[] iArr2 = params.mVTrimOut;
                                                if (iArr2 == null) {
                                                    iArr2 = new int[size];
                                                    for (int i3 = 0; i3 < size; i3++) {
                                                        iArr2[i3] = -1;
                                                    }
                                                }
                                                float[] fArr = params.mSpeedArray;
                                                if (fArr == null) {
                                                    fArr = new float[size];
                                                    for (int i4 = 0; i4 < size; i4++) {
                                                        fArr[i4] = 1.0f;
                                                    }
                                                }
                                                NLETrack nLETrack = new NLETrack();
                                                nLETrack.LJJ(true);
                                                int i5 = 0;
                                                for (String str : sourceInfo2) {
                                                    int i6 = i5 + 1;
                                                    if (i5 >= 0) {
                                                        String str2 = str;
                                                        NLETrackSlot nLETrackSlot = new NLETrackSlot();
                                                        boolean z3 = true;
                                                        nLETrackSlot.setExtra("canvas_type", String.valueOf(true));
                                                        nLETrackSlot.setLayer(0);
                                                        if (i5 < fArr.length) {
                                                            f = fArr[i5];
                                                        } else {
                                                            f = 1.0f;
                                                        }
                                                        this.LJJIJIIJI = f;
                                                        NLESegmentVideo nLESegmentVideo = new NLESegmentVideo();
                                                        NLEResourceAV nLEResourceAV = new NLEResourceAV();
                                                        nLEResourceAV.LJIIIZ(str2);
                                                        if (C44687HgJ.LJIIJJI(str2)) {
                                                            enumC123874tb2 = EnumC123874tb.IMAGE;
                                                        } else {
                                                            enumC123874tb2 = EnumC123874tb.VIDEO;
                                                        }
                                                        nLEResourceAV.LJIILIIL(enumC123874tb2);
                                                        if (str2 == null) {
                                                            str2 = "";
                                                        }
                                                        List<VEUtils.VEAudioFileInfo> audioFileInfoForAllTracks = VEUtils.getAudioFileInfoForAllTracks(str2);
                                                        if (audioFileInfoForAllTracks != null && !audioFileInfoForAllTracks.isEmpty()) {
                                                            z3 = false;
                                                        }
                                                        nLEResourceAV.LJIJI(!z3);
                                                        nLESegmentVideo.LJIILL(nLEResourceAV);
                                                        if (i5 < iArr.length) {
                                                            j3 = iArr[i5] * 1000;
                                                        } else {
                                                            j3 = 0;
                                                        }
                                                        nLESegmentVideo.LJIJJLI(j3);
                                                        if (i5 < fArr.length) {
                                                            f2 = fArr[i5];
                                                        } else {
                                                            f2 = 1.0f;
                                                        }
                                                        nLESegmentVideo.setAbsSpeed(f2);
                                                        if (i5 < iArr2.length) {
                                                            j4 = O6R.LJJIJ(((float) (iArr2[i5] * 1000)) * this.LJJIJIIJI);
                                                        } else {
                                                            j4 = -1;
                                                        }
                                                        nLESegmentVideo.LJIJJ(j4);
                                                        nLESegmentVideo.LJJIII(nLEStyCanvas);
                                                        nLETrackSlot.LJIIL(nLESegmentVideo);
                                                        List<CanvasFilterParam> transformList3 = canvasVideoData.getTransformList();
                                                        if (transformList3 != null && i5 < transformList3.size() && (transformList2 = canvasVideoData.getTransformList()) != null && (canvasFilterParam2 = (CanvasFilterParam) ListProtector.get(transformList2, i5)) != null) {
                                                            Iterator it = ((ArrayList) C79004UzY.LJJJLIIL(canvasFilterParam2)).iterator();
                                                            while (it.hasNext()) {
                                                                LJJIJIIJI(nLETrackSlot, nLEStyCanvas, (VEBaseFilterParam) it.next());
                                                            }
                                                        }
                                                        if (i5 < iArr.length) {
                                                            j5 = iArr[i5] * 1000;
                                                        } else {
                                                            j5 = 0;
                                                        }
                                                        nLETrackSlot.setStartTime(j5);
                                                        if (i5 < iArr2.length) {
                                                            j6 = iArr2[i5] * 1000;
                                                        } else {
                                                            j6 = -1;
                                                        }
                                                        nLETrackSlot.setEndTime(j6);
                                                        nLETrack.LIZIZ(nLETrackSlot);
                                                        i5 = i6;
                                                    } else {
                                                        C47261Igj.LJJJJJ();
                                                        throw null;
                                                    }
                                                }
                                                LJ2.addTrack(nLETrack);
                                            }
                                            List<CanvasVideoData> externalTracks2 = canvasVideoData.getExternalTracks();
                                            if (externalTracks2 != null) {
                                                int i7 = 0;
                                                for (CanvasVideoData canvasVideoData2 : externalTracks2) {
                                                    int i8 = i7 + 1;
                                                    if (i7 >= 0) {
                                                        CanvasVideoData canvasVideoData3 = canvasVideoData2;
                                                        NLEModel LJ3 = nLEEditor.LJ();
                                                        o.LJIIIIZZ(LJ3, "empty.model");
                                                        NLEStyCanvas nLEStyCanvas2 = new NLEStyCanvas();
                                                        List<CanvasVideoData> externalTracks3 = canvasVideoData3.getExternalTracks();
                                                        if (externalTracks3 == null || externalTracks3.isEmpty()) {
                                                            nLEStyCanvas2.setExtra("IS_SCENE_CANVAS_DMT", "true");
                                                        }
                                                        C123904te.LIZ(canvasVideoData3.getBackground(), nLEStyCanvas2);
                                                        List<String> sourceInfo3 = canvasVideoData3.getSourceInfo();
                                                        if (sourceInfo3 != null && !sourceInfo3.isEmpty()) {
                                                            int size2 = sourceInfo3.size();
                                                            int[] iArr3 = params.mVTrimIn;
                                                            if (iArr3 == null) {
                                                                iArr3 = new int[size2];
                                                                for (int i9 = 0; i9 < size2; i9++) {
                                                                    iArr3[i9] = 0;
                                                                }
                                                            }
                                                            int[] iArr4 = params.mVTrimOut;
                                                            if (iArr4 == null) {
                                                                iArr4 = new int[size2];
                                                                for (int i10 = 0; i10 < size2; i10++) {
                                                                    iArr4[i10] = -1;
                                                                }
                                                            }
                                                            NLETrack nLETrack2 = new NLETrack();
                                                            if (i8 == 0) {
                                                                z2 = true;
                                                            } else {
                                                                z2 = false;
                                                            }
                                                            nLETrack2.LJJ(z2);
                                                            int i11 = 0;
                                                            for (String str3 : sourceInfo3) {
                                                                int i12 = i11 + 1;
                                                                if (i11 >= 0) {
                                                                    String str4 = str3;
                                                                    NLETrackSlot nLETrackSlot2 = new NLETrackSlot();
                                                                    boolean z4 = true;
                                                                    nLETrackSlot2.setExtra("canvas_type", String.valueOf(true));
                                                                    nLETrackSlot2.setLayer(i8);
                                                                    NLESegmentVideo nLESegmentVideo2 = new NLESegmentVideo();
                                                                    NLEResourceAV nLEResourceAV2 = new NLEResourceAV();
                                                                    nLEResourceAV2.LJIIIZ(str4);
                                                                    if (C44687HgJ.LJIIJJI(str4)) {
                                                                        enumC123874tb = EnumC123874tb.IMAGE;
                                                                    } else {
                                                                        enumC123874tb = EnumC123874tb.VIDEO;
                                                                    }
                                                                    nLEResourceAV2.LJIILIIL(enumC123874tb);
                                                                    if (str4 == null) {
                                                                        str4 = "";
                                                                    }
                                                                    List<VEUtils.VEAudioFileInfo> audioFileInfoForAllTracks2 = VEUtils.getAudioFileInfoForAllTracks(str4);
                                                                    if (audioFileInfoForAllTracks2 != null && !audioFileInfoForAllTracks2.isEmpty()) {
                                                                        z4 = false;
                                                                    }
                                                                    nLEResourceAV2.LJIJI(!z4);
                                                                    nLESegmentVideo2.LJIILL(nLEResourceAV2);
                                                                    nLESegmentVideo2.LJIJJLI(0L);
                                                                    if (i11 < iArr4.length) {
                                                                        j = iArr4[i11] * 1000;
                                                                    } else {
                                                                        j = -1;
                                                                    }
                                                                    nLESegmentVideo2.LJIJJ(j);
                                                                    nLESegmentVideo2.LJJIII(nLEStyCanvas2);
                                                                    nLETrackSlot2.LJIIL(nLESegmentVideo2);
                                                                    List<CanvasFilterParam> transformList4 = canvasVideoData3.getTransformList();
                                                                    if (transformList4 != null && i11 < transformList4.size() && (transformList = canvasVideoData3.getTransformList()) != null && (canvasFilterParam = (CanvasFilterParam) ListProtector.get(transformList, i11)) != null) {
                                                                        Iterator it2 = ((ArrayList) C79004UzY.LJJJLIIL(canvasFilterParam)).iterator();
                                                                        while (it2.hasNext()) {
                                                                            LJJIJIIJI(nLETrackSlot2, nLEStyCanvas2, (VEBaseFilterParam) it2.next());
                                                                        }
                                                                    }
                                                                    nLETrackSlot2.setStartTime(0L);
                                                                    if (i11 < iArr4.length && i11 < iArr3.length) {
                                                                        j2 = (iArr4[i11] * 1000) - (iArr3[i11] * 1000);
                                                                    } else {
                                                                        j2 = -1;
                                                                    }
                                                                    nLETrackSlot2.setEndTime(j2);
                                                                    nLETrack2.LIZIZ(nLETrackSlot2);
                                                                    i11 = i12;
                                                                } else {
                                                                    C47261Igj.LJJJJJ();
                                                                    throw null;
                                                                }
                                                            }
                                                            LJ3.addTrack(nLETrack2);
                                                        }
                                                        i7 = i8;
                                                    } else {
                                                        C47261Igj.LJJJJJ();
                                                        throw null;
                                                    }
                                                }
                                            }
                                        }
                                        return nLEEditor;
                                    }

                                    public static void LJJIJIIJI(NLETrackSlot nLETrackSlot, NLEStyCanvas nLEStyCanvas, VEBaseFilterParam vEBaseFilterParam) {
                                        NLESegmentVideo LJJIZ;
                                        String str;
                                        if (vEBaseFilterParam instanceof VEVideoTransformFilterParam) {
                                            VEVideoTransformFilterParam vEVideoTransformFilterParam = (VEVideoTransformFilterParam) vEBaseFilterParam;
                                            nLETrackSlot.setScale(vEVideoTransformFilterParam.scaleFactor);
                                            nLETrackSlot.setTransformX(vEVideoTransformFilterParam.transX);
                                            nLETrackSlot.setTransformY(vEVideoTransformFilterParam.transY);
                                            float f = 360;
                                            nLETrackSlot.setRotation(f - (vEVideoTransformFilterParam.degree % f));
                                            int i2 = vEVideoTransformFilterParam.borderWidth;
                                            if (i2 > 0) {
                                                NLEEditorJniJNI.NLEStyCanvas_setBorderWidth(nLEStyCanvas.LIZ, nLEStyCanvas, i2);
                                                NLEEditorJniJNI.NLEStyCanvas_setBorderColor(nLEStyCanvas.LIZ, nLEStyCanvas, vEVideoTransformFilterParam.borderColor);
                                            }
                                            String str2 = vEVideoTransformFilterParam.animPath;
                                            if ((str2 == null || str2.length() == 0) && ((str = vEVideoTransformFilterParam.animJsonParam) == null || str.length() == 0)) {
                                                return;
                                            }
                                            NLESegmentVideoAnimation nLESegmentVideoAnimation = new NLESegmentVideoAnimation();
                                            NLEEditorJniJNI.NLESegmentVideoAnimation_setAnimJsonParam(nLESegmentVideoAnimation.LIZJ, nLESegmentVideoAnimation, vEVideoTransformFilterParam.animJsonParam);
                                            NLEResourceNode nLEResourceNode = new NLEResourceNode();
                                            nLEResourceNode.LJIIIZ(vEVideoTransformFilterParam.animPath);
                                            NLEEditorJniJNI.NLESegmentVideoAnimation_setEffectSDKVideoAnimation(nLESegmentVideoAnimation.LIZJ, nLESegmentVideoAnimation, NLEResourceNode.LIZ(nLEResourceNode), nLEResourceNode);
                                            NLEVideoAnimation nLEVideoAnimation = new NLEVideoAnimation();
                                            NLEEditorJniJNI.NLEVideoAnimation_setSegment(nLEVideoAnimation.LIZ, nLEVideoAnimation, nLESegmentVideoAnimation.LIZJ, nLESegmentVideoAnimation);
                                            NLEEditorJniJNI.NLETrackSlot_addVideoAnim(nLETrackSlot.LIZ, nLETrackSlot, NLEVideoAnimation.LIZ(nLEVideoAnimation), nLEVideoAnimation);
                                            return;
                                        }
                                        if (vEBaseFilterParam instanceof VEVideoCropFilterParam) {
                                            NLESegmentVideo LJJIZ2 = C78609UtB.LJJIZ(nLETrackSlot);
                                            if (LJJIZ2 == null) {
                                                return;
                                            }
                                            NLEStyCrop nLEStyCrop = new NLEStyCrop();
                                            VEVideoCropFilterParam vEVideoCropFilterParam = (VEVideoCropFilterParam) vEBaseFilterParam;
                                            OSZ osz = new OSZ(Float.valueOf(vEVideoCropFilterParam.cropNodesCoord[0]), Float.valueOf(vEVideoCropFilterParam.cropNodesCoord[1]));
                                            OSZ osz2 = new OSZ(Float.valueOf(vEVideoCropFilterParam.cropNodesCoord[2]), Float.valueOf(vEVideoCropFilterParam.cropNodesCoord[3]));
                                            OSZ osz3 = new OSZ(Float.valueOf(vEVideoCropFilterParam.cropNodesCoord[4]), Float.valueOf(vEVideoCropFilterParam.cropNodesCoord[5]));
                                            OSZ osz4 = new OSZ(Float.valueOf(vEVideoCropFilterParam.cropNodesCoord[6]), Float.valueOf(vEVideoCropFilterParam.cropNodesCoord[7]));
                                            C5NP LIZLLL = C82891Wg3.LIZLLL();
                                            StringBuilder LIZ3 = X1D.LIZ();
                                            LIZ3.append("NLEStyCrop -> crop: \n");
                                            LIZ3.append(osz);
                                            LIZ3.append("---");
                                            LIZ3.append(osz2);
                                            LIZ3.append('\n');
                                            LIZ3.append(osz3);
                                            LIZ3.append("---");
                                            LIZ3.append(osz4);
                                            LIZLLL.d(X1D.LIZIZ(LIZ3));
                                            NLEEditorJniJNI.NLEStyCrop_setXLeftUpper(nLEStyCrop.LIZ, nLEStyCrop, ((Number) osz.getFirst()).floatValue());
                                            NLEEditorJniJNI.NLEStyCrop_setYLeftUpper(nLEStyCrop.LIZ, nLEStyCrop, ((Number) osz.getSecond()).floatValue());
                                            NLEEditorJniJNI.NLEStyCrop_setXRightUpper(nLEStyCrop.LIZ, nLEStyCrop, ((Number) osz2.getFirst()).floatValue());
                                            NLEEditorJniJNI.NLEStyCrop_setYRightUpper(nLEStyCrop.LIZ, nLEStyCrop, ((Number) osz2.getSecond()).floatValue());
                                            NLEEditorJniJNI.NLEStyCrop_setXLeftLower(nLEStyCrop.LIZ, nLEStyCrop, ((Number) osz3.getFirst()).floatValue());
                                            NLEEditorJniJNI.NLEStyCrop_setYLeftLower(nLEStyCrop.LIZ, nLEStyCrop, ((Number) osz3.getSecond()).floatValue());
                                            NLEEditorJniJNI.NLEStyCrop_setXRightLower(nLEStyCrop.LIZ, nLEStyCrop, ((Number) osz4.getFirst()).floatValue());
                                            NLEEditorJniJNI.NLEStyCrop_setYRightLower(nLEStyCrop.LIZ, nLEStyCrop, ((Number) osz4.getSecond()).floatValue());
                                            LJJIZ2.LJJIIJ(nLEStyCrop);
                                            return;
                                        }
                                        if (!(vEBaseFilterParam instanceof VEAudioVolumeFilterParam) || (LJJIZ = C78609UtB.LJJIZ(nLETrackSlot)) == null) {
                                            return;
                                        }
                                        LJJIZ.LJJIIJZLJL(true);
                                        LJJIZ.LJIL(((VEAudioVolumeFilterParam) vEBaseFilterParam).volume);
                                    }

                                    @Override // X.C5MG
                                    public final int LJJII(Context context, InterfaceC133095Kf params, SurfaceView surfaceView, LifecycleOwner lifecycleOwner) {
                                        o.LJIIIZ(params, "params");
                                        if (OpenUseVEUserConfigForImageOptimize.isOpen() && (params instanceof VEPreviewParams) && ((VEPreviewParams) params).singleImageCoverBitmapData != null) {
                                            params.setLoadImageOptimizeByVEUserConfig(true);
                                        }
                                        super.LJJII(context, params, surfaceView, lifecycleOwner);
                                        if (C42117Gfx.LIZIZ()) {
                                            ((C133765Mu) LJIJ()).LJIIJ();
                                            return 0;
                                        }
                                        return 0;
                                    }
                                };
                            }
                            if (LIZIZ()) {
                                configure.LIZJ = true;
                            }
                            return new C5MG(configure) { // from class: X.55C
                                {
                                    C38995FSd.LJ();
                                }

                                @Override // X.C5MG
                                public final NLEEditor LJII(VEPreviewParams params) {
                                    MultiEditVideoRecordData multiEditVideoRecordData;
                                    MultiEditVideoStatusRecordData multiEditVideoStatusRecordData;
                                    boolean enableMusicSync;
                                    boolean z;
                                    float f;
                                    EnumC123874tb enumC123874tb;
                                    List<VEUtils.VEAudioFileInfo> audioFileInfoForAllTracks;
                                    int i2;
                                    o.LJIIIZ(params, "params");
                                    params.setLoadMixImageOptimizeByVEUserConfig(true);
                                    NLEEditor LIZ3 = C122974s9.LIZ();
                                    MultiEditVideoStatusRecordData multiEditVideoStatusRecordData2 = params.recordData;
                                    if (multiEditVideoStatusRecordData2 == null || (multiEditVideoRecordData = multiEditVideoStatusRecordData2.curMultiEditVideoRecordData) == null) {
                                        return LIZ3;
                                    }
                                    NLEModel LJ2 = LIZ3.LJ();
                                    int i3 = params.mCanvasHeight;
                                    if (i3 != 0 && (i2 = params.mCanvasWidth) != 0) {
                                        LJ2.setCanvasRatio(i2 / i3);
                                    } else {
                                        LJ2.setCanvasRatio(0.5625f);
                                    }
                                    List<MultiEditVideoSegmentRecordData> list = multiEditVideoRecordData.segmentDataList;
                                    if (list != null && !list.isEmpty()) {
                                        if (this.LIZ.LJIIIIZZ) {
                                            enableMusicSync = params.isMusicSyncMode;
                                        } else {
                                            enableMusicSync = params.getEnableMusicSync();
                                        }
                                        if (enableMusicSync && params.mPageType == 1) {
                                            ArrayList arrayList = new ArrayList();
                                            List<MultiEditVideoSegmentRecordData> list2 = multiEditVideoRecordData.segmentDataList;
                                            o.LJIIIIZZ(list2, "data.segmentDataList");
                                            Iterator<MultiEditVideoSegmentRecordData> it = list2.iterator();
                                            while (it.hasNext()) {
                                                String str = it.next().videoPath;
                                                o.LJIIIIZZ(str, "it.videoPath");
                                                arrayList.add(str);
                                            }
                                            NLETrack nLETrackAlgorithm = new NLETrackAlgorithm();
                                            nLETrackAlgorithm.LJJ(true);
                                            Iterator it2 = arrayList.iterator();
                                            int i4 = 0;
                                            long j = 0;
                                            while (it2.hasNext()) {
                                                Object next = it2.next();
                                                int i5 = i4 + 1;
                                                if (i4 >= 0) {
                                                    String str2 = (String) next;
                                                    NLETrackSlot nLETrackSlot = new NLETrackSlot();
                                                    if (!C78966Uyw.LJJIJIL(((MultiEditVideoSegmentRecordData) ListProtector.get(multiEditVideoRecordData.segmentDataList, i4)).audioPath) && ((audioFileInfoForAllTracks = VEUtils.getAudioFileInfoForAllTracks(str2)) == null || audioFileInfoForAllTracks.isEmpty())) {
                                                        z = false;
                                                    } else {
                                                        z = true;
                                                    }
                                                    NLESegmentVideo nLESegmentVideo = new NLESegmentVideo();
                                                    NLEResourceAV nLEResourceAV = new NLEResourceAV();
                                                    nLEResourceAV.LJIIIZ(str2);
                                                    nLEResourceAV.setDuration(((MultiEditVideoSegmentRecordData) ListProtector.get(multiEditVideoRecordData.segmentDataList, i4)).videoLength);
                                                    nLESegmentVideo.LJIJJLI(0L);
                                                    nLESegmentVideo.LJIJJ(((MultiEditVideoSegmentRecordData) ListProtector.get(multiEditVideoRecordData.segmentDataList, i4)).videoLength);
                                                    nLEResourceAV.LJIJI(z);
                                                    if (!z) {
                                                        f = 0.0f;
                                                    } else {
                                                        f = 1.0f;
                                                    }
                                                    nLESegmentVideo.LJIL(f);
                                                    if (C44687HgJ.LJIIJJI(str2)) {
                                                        enumC123874tb = EnumC123874tb.IMAGE;
                                                    } else {
                                                        enumC123874tb = EnumC123874tb.VIDEO;
                                                    }
                                                    nLEResourceAV.LJIILIIL(enumC123874tb);
                                                    nLESegmentVideo.LJIILL(nLEResourceAV);
                                                    nLESegmentVideo.LJJIIJZLJL(false);
                                                    nLETrackSlot.setExtra("has_origin_audio_slot", String.valueOf(C78685UuP.LJJJZ(((MultiEditVideoSegmentRecordData) ListProtector.get(multiEditVideoRecordData.segmentDataList, i4)).audioPath)));
                                                    nLETrackSlot.setStartTime(j);
                                                    j += ((MultiEditVideoSegmentRecordData) ListProtector.get(multiEditVideoRecordData.segmentDataList, i4)).videoLength;
                                                    nLETrackSlot.LJIIL(nLESegmentVideo);
                                                    nLETrackAlgorithm.LIZIZ(nLETrackSlot);
                                                    i4 = i5;
                                                } else {
                                                    C47261Igj.LJJJJJ();
                                                    throw null;
                                                }
                                            }
                                            LJ2.addTrack(nLETrackAlgorithm);
                                            return LIZ3;
                                        }
                                    }
                                    VERecordData LJIIJJI = C46104I7o.LJIIJJI(multiEditVideoRecordData);
                                    if (params.isStoryEditMode || !params.mIsFromDraft || ((multiEditVideoStatusRecordData = params.recordData) != null && multiEditVideoStatusRecordData.isSupportMultiEdit && multiEditVideoStatusRecordData.curMultiEditVideoRecordData != null)) {
                                        C127344zC.LIZIZ(LJIIJJI, LIZ3);
                                    } else {
                                        C127344zC.LIZ(LJIIJJI, LIZ3);
                                    }
                                    C120864ok.LIZ(LIZ3);
                                    return LIZ3;
                                }

                                @Override // X.C5MG
                                public final int LJJII(Context context, InterfaceC133095Kf params, SurfaceView surfaceView, LifecycleOwner lifecycleOwner) {
                                    o.LJIIIZ(params, "params");
                                    params.setLoadMixImageOptimizeByVEUserConfig(true);
                                    super.LJJII(context, params, surfaceView, lifecycleOwner);
                                    for (String str : params.getVideoPaths()) {
                                        StringBuilder LIZ3 = X1D.LIZ();
                                        LIZ3.append("VEVideoEditorCutVideoImpl -> initVEEditor -> IVEPreviewParams: videoPath = ");
                                        LIZ3.append(str);
                                        H78.LIZ(X1D.LIZIZ(LIZ3));
                                    }
                                    VEPreviewParams vEPreviewParams = (VEPreviewParams) params;
                                    ((C133765Mu) LJIJ()).LJIIIIZZ(vEPreviewParams.mCanvasHeight / vEPreviewParams.mCanvasWidth);
                                    if (C42117Gfx.LIZIZ()) {
                                        ((C133765Mu) LJIJ()).LJIIJ();
                                    }
                                    if (this.LJIIZILJ == 1) {
                                        ((C133765Mu) LJIJ()).LLLILZ(false);
                                    } else {
                                        ((C133765Mu) LJIJ()).LLLILZ(true);
                                    }
                                    return 0;
                                }
                            };
                        }
                        return new C5MG(configure) { // from class: X.5K4
                            {
                                C38995FSd.LJ();
                            }

                            @Override // X.C5MG
                            public final NLEEditor LJII(VEPreviewParams params) {
                                String[] audioPaths;
                                String str;
                                boolean z;
                                float f;
                                String str2;
                                boolean z2;
                                float f2;
                                float f3;
                                float f4;
                                List<VEUtils.VEAudioFileInfo> audioFileInfoForAllTracks;
                                List<VEUtils.VEAudioFileInfo> audioFileInfoForAllTracks2;
                                o.LJIIIZ(params, "params");
                                NLEEditor nLEEditor = new NLEEditor();
                                if (params.getVideoPaths().length >= 2 && (audioPaths = params.getAudioPaths()) != null && audioPaths.length >= 2) {
                                    String[] strArr = params.mVideoPaths;
                                    o.LJIIIIZZ(strArr, "it.mVideoPaths");
                                    long j = 0;
                                    for (String str3 : strArr) {
                                        j += C78926UyI.LJJJLZIJ(str3).getDuration();
                                    }
                                    long j2 = (int) j;
                                    long duration = params.stitchParams.getDuration();
                                    NLETrackSlot nLETrackSlot = new NLETrackSlot();
                                    nLETrackSlot.setExtra("VideoSlotType", C5K5.STITCHED.name());
                                    NLESegmentVideo nLESegmentVideo = new NLESegmentVideo();
                                    String[] audioPaths2 = params.getAudioPaths();
                                    if (audioPaths2 != null) {
                                        str = audioPaths2[0];
                                    } else {
                                        str = null;
                                    }
                                    if (!C78966Uyw.LJJIJIL(str) && ((audioFileInfoForAllTracks2 = VEUtils.getAudioFileInfoForAllTracks(params.getVideoPaths()[0])) == null || audioFileInfoForAllTracks2.isEmpty())) {
                                        z = false;
                                    } else {
                                        z = true;
                                    }
                                    NLEResourceAV nLEResourceAV = new NLEResourceAV();
                                    EnumC123874tb enumC123874tb = EnumC123874tb.VIDEO;
                                    nLEResourceAV.LJIILIIL(enumC123874tb);
                                    nLEResourceAV.LJIIIZ(params.getVideoPaths()[0]);
                                    nLEResourceAV.LJIJI(z);
                                    nLESegmentVideo.LJIILL(nLEResourceAV);
                                    nLESegmentVideo.LJIJJLI(0L);
                                    long j3 = duration * 1000;
                                    nLESegmentVideo.LJIJJ(j3);
                                    if (z) {
                                        f = 1.0f;
                                    } else {
                                        f = 0.0f;
                                    }
                                    nLESegmentVideo.LJIL(f);
                                    nLETrackSlot.LJIIL(nLESegmentVideo);
                                    nLETrackSlot.setStartTime(0L);
                                    nLETrackSlot.setEndTime(j3);
                                    NLETrackSlot nLETrackSlot2 = new NLETrackSlot();
                                    nLETrackSlot2.setExtra("VideoSlotType", C5K5.SHOOT.name());
                                    String[] audioPaths3 = params.getAudioPaths();
                                    if (audioPaths3 != null) {
                                        str2 = audioPaths3[1];
                                    } else {
                                        str2 = null;
                                    }
                                    if (!C78966Uyw.LJJIJIL(str2) && ((audioFileInfoForAllTracks = VEUtils.getAudioFileInfoForAllTracks(params.getVideoPaths()[1])) == null || audioFileInfoForAllTracks.isEmpty())) {
                                        z2 = false;
                                    } else {
                                        z2 = true;
                                    }
                                    NLESegmentVideo nLESegmentVideo2 = new NLESegmentVideo();
                                    nLETrackSlot2.setStartTime(j3);
                                    nLETrackSlot2.setEndTime(1000 * j2);
                                    NLEResourceAV nLEResourceAV2 = new NLEResourceAV();
                                    nLEResourceAV2.LJIILIIL(enumC123874tb);
                                    nLEResourceAV2.LJIIIZ(params.getVideoPaths()[1]);
                                    nLEResourceAV2.setDuration(nLETrackSlot2.getEndTime() - nLETrackSlot2.getStartTime());
                                    nLEResourceAV2.LJIJI(z2);
                                    nLESegmentVideo2.LJIILL(nLEResourceAV2);
                                    nLESegmentVideo2.LJIJJLI(0L);
                                    nLESegmentVideo2.LJIJJ(nLETrackSlot2.getEndTime() - nLETrackSlot2.getStartTime());
                                    if (z2) {
                                        f2 = 1.0f;
                                    } else {
                                        f2 = 0.0f;
                                    }
                                    nLESegmentVideo2.LJIL(f2);
                                    nLETrackSlot2.LJIIL(nLESegmentVideo2);
                                    nLETrackSlot2.setExtra("has_origin_audio_slot", String.valueOf(z2));
                                    NLETrack nLETrack = new NLETrack();
                                    nLETrack.LJJ(true);
                                    nLETrack.setExtra("__DEFAULT__", "__DEFAULT__");
                                    nLETrack.LIZIZ(nLETrackSlot);
                                    nLETrack.LIZIZ(nLETrackSlot2);
                                    if (params.stitchParams != null && (params.mPageType != 1 || params.mIsFromDraft)) {
                                        f3 = params.mVolume;
                                        f4 = params.getMusicVolume();
                                    } else {
                                        f3 = 1.0f;
                                        f4 = 1.0f;
                                    }
                                    C122004qa c122004qa = new C122004qa(EnumC122254qz.ORIGIN);
                                    String[] audioPaths4 = params.getAudioPaths();
                                    o.LJI(audioPaths4);
                                    c122004qa.LIZ = audioPaths4[1];
                                    c122004qa.LJI = f3;
                                    c122004qa.LJ = duration;
                                    c122004qa.LJFF = j2;
                                    c122004qa.LIZJ = 0L;
                                    c122004qa.LIZLLL = j2 - duration;
                                    StitchParams stitchParams = params.stitchParams;
                                    if (stitchParams.isPGCMusic() && C39579Fg7.LIZIZ(stitchParams.getMusicPath()) && stitchParams.getMusicStart() >= 0) {
                                        if (!stitchParams.isMuted()) {
                                            new C121794qF(c122004qa, false).LIZJ(nLEEditor);
                                        }
                                        C122004qa c122004qa2 = new C122004qa(EnumC122254qz.BGM);
                                        c122004qa2.LIZ = stitchParams.getMusicPath();
                                        c122004qa2.LJI = f4;
                                        c122004qa2.LJ = 0L;
                                        c122004qa2.LJFF = -2L;
                                        c122004qa2.LIZJ = stitchParams.getMusicStart();
                                        c122004qa2.LIZLLL = stitchParams.getMusicStart() + j2;
                                        new C121794qF(c122004qa2, false).LIZJ(nLEEditor);
                                    } else {
                                        new C121794qF(c122004qa, false).LIZJ(nLEEditor);
                                        C122004qa c122004qa3 = new C122004qa(EnumC122254qz.BGM);
                                        String[] audioPaths5 = params.getAudioPaths();
                                        o.LJI(audioPaths5);
                                        c122004qa3.LIZ = audioPaths5[0];
                                        c122004qa3.LJI = f4;
                                        c122004qa3.LJ = 0L;
                                        c122004qa3.LJFF = duration;
                                        c122004qa3.LIZJ = 0L;
                                        c122004qa3.LIZLLL = duration;
                                        new C121794qF(c122004qa3, false).LIZJ(nLEEditor);
                                    }
                                    nLEEditor.LJ().addTrack(nLETrack);
                                }
                                return nLEEditor;
                            }
                        };
                    }
                    if (LIZIZ()) {
                        configure.LIZJ = true;
                    }
                    return new C132555Id(configure);
                }
                return new C5KW(configure) { // from class: X.5K6
                    public boolean LJJIJIIJIL;

                    {
                        C38995FSd.LJ();
                        this.LJJIJIIJIL = true;
                    }

                    @Override // X.C5KW, X.C5MG
                    public final NLEEditor LJII(VEPreviewParams params) {
                        Object obj;
                        long j;
                        o.LJIIIZ(params, "params");
                        NLEEditor LIZ3 = C122974s9.LIZ();
                        if (LIZ3.LJ() == null) {
                            return LIZ3;
                        }
                        C122104qk LJJIJIIJI = LJJIJIIJI(LIZ3, params);
                        if (params.isVideoImageMixFastImport) {
                            String[] videoPaths = params.getVideoPaths();
                            int[] vTrimIn = params.getVTrimIn();
                            int[] vTrimOut = params.getVTrimOut();
                            if (videoPaths.length == vTrimIn.length && videoPaths.length == vTrimOut.length) {
                                if (C77413UZt.LJIILL(LJJIJIIJI.LIZ)) {
                                    return LIZ3;
                                }
                                if (!LJJIJIIJI.LIZ.isEmpty()) {
                                    Iterator<C5K9> it = LJJIJIIJI.LIZ.iterator();
                                    while (it.hasNext()) {
                                        C5K9 next = it.next();
                                        C43117Gw5 c43117Gw5 = C43117Gw5.LIZ;
                                        String str = next.LJIILIIL;
                                        c43117Gw5.getClass();
                                        if (!C43117Gw5.LJIIIZ(str)) {
                                            int i2 = VEClipAlgorithmParam.BINGO_EFFECT_ZOOMIN;
                                            Iterator<C5K9> it2 = LJJIJIIJI.LIZ.iterator();
                                            while (it2.hasNext()) {
                                                C5K9 next2 = it2.next();
                                                if (next2.LJII == EnumC123874tb.IMAGE) {
                                                    VEImageTransformFilterParam LIZ4 = C5K7.LIZ(i2);
                                                    if (LIZ4 != null) {
                                                        C120774ob c120774ob = new C120774ob();
                                                        c120774ob.LIZJ = LIZ4.beginScale;
                                                        c120774ob.LIZLLL = LIZ4.endScale;
                                                        long j2 = next2.LIZLLL;
                                                        c120774ob.LIZ = j2;
                                                        Long l = next2.LJIIL;
                                                        if (l != null) {
                                                            j = l.longValue();
                                                        } else {
                                                            j = 0;
                                                        }
                                                        c120774ob.LIZIZ = j2 + j;
                                                        next2.LJIILL = c120774ob;
                                                    }
                                                } else {
                                                    int i3 = VEClipAlgorithmParam.BINGO_EFFECT_ZOOMOUT;
                                                    if (i2 == i3) {
                                                        i2 = VEClipAlgorithmParam.BINGO_EFFECT_ZOOMIN;
                                                    } else {
                                                        i2 = i3;
                                                    }
                                                }
                                            }
                                            Iterator LIZJ = C141415gn.LIZJ(LIZ3, "empty.model.tracks");
                                            while (true) {
                                                if (LIZJ.hasNext()) {
                                                    obj = LIZJ.next();
                                                    if (((NLETrack) obj).LJIIJ()) {
                                                        break;
                                                    }
                                                } else {
                                                    obj = null;
                                                    break;
                                                }
                                            }
                                            NLETrack nLETrack = (NLETrack) obj;
                                            if (nLETrack != null) {
                                                new C120764oa(LJJIJIIJI).LJII(nLETrack);
                                            }
                                        }
                                    }
                                }
                                return LIZ3;
                            }
                        }
                        return LIZ3;
                    }

                    @Override // X.C5MG
                    public final boolean LJIIJJI(VEPreviewMusicParams params) {
                        o.LJIIIZ(params, "params");
                        if (params.isFastImport && this.LJJIJIIJIL) {
                            this.LJJIJIIJIL = false;
                            super.LJIIJJI(params);
                        }
                        return false;
                    }
                };
            }
            return new C5MG(configure) { // from class: X.4tU
                @Override // X.C5MG
                public final boolean LJIIJJI(VEPreviewMusicParams params) {
                    o.LJIIIZ(params, "params");
                    return false;
                }

                {
                    C38995FSd.LJ();
                }

                @Override // X.C5MG
                public final NLEEditor LJII(VEPreviewParams params) {
                    String str;
                    int swigValue;
                    o.LJIIIZ(params, "params");
                    NLEEditor nLEEditor = new NLEEditor();
                    NLEModel LJ2 = nLEEditor.LJ();
                    if (LJ2 == null) {
                        return nLEEditor;
                    }
                    MvCreateVideoData mvCreateVideoData = params.mvCreateVideoData;
                    if (mvCreateVideoData == null) {
                        return nLEEditor;
                    }
                    ArrayList<String> mediaList = mvCreateVideoData.selectMediaList;
                    int i2 = 0;
                    if (mediaList != null && !mediaList.isEmpty() && (str = mvCreateVideoData.mvResUnzipPath) != null && str.length() != 0) {
                        o.LJIIIIZZ(mediaList, "mediaList");
                        ArrayList arrayList = new ArrayList(C32I.LJJL(mediaList, 10));
                        Iterator<String> it = mediaList.iterator();
                        while (it.hasNext()) {
                            it.next();
                            arrayList.add("img");
                        }
                        NLETrackMV nLETrackMV = new NLETrackMV();
                        nLETrackMV.LJJ(true);
                        NLEResourceNode nLEResourceNode = new NLEResourceNode();
                        nLEResourceNode.LJIIIZ(mvCreateVideoData.mvResUnzipPath);
                        NLEEditorJniJNI.NLETrackMV_setMV(nLETrackMV.LIZJ, nLETrackMV, NLEResourceNode.LIZ(nLEResourceNode), nLEResourceNode);
                        if (mvCreateVideoData.resRatio == 1) {
                            swigValue = EnumC123844tY.RES_1080P.swigValue();
                        } else {
                            swigValue = EnumC123844tY.RES_720P.swigValue();
                        }
                        NLEEditorJniJNI.NLETrackMV_setMVResolution(nLETrackMV.LIZJ, nLETrackMV, swigValue);
                        Iterator<String> it2 = mediaList.iterator();
                        while (it2.hasNext()) {
                            String next = it2.next();
                            int i3 = i2 + 1;
                            if (i2 >= 0) {
                                NLETrackSlot nLETrackSlot = new NLETrackSlot();
                                NLESegmentMV nLESegmentMV = new NLESegmentMV();
                                NLEResourceNode nLEResourceNode2 = new NLEResourceNode();
                                nLEResourceNode2.LJIIIZ(next);
                                NLEEditorJniJNI.NLESegmentMV_setSourceFile(nLESegmentMV.LIZJ, nLESegmentMV, NLEResourceNode.LIZ(nLEResourceNode2), nLEResourceNode2);
                                if (i2 < arrayList.size()) {
                                    NLEEditorJniJNI.NLESegmentMV_setSourceFileType(nLESegmentMV.LIZJ, nLESegmentMV, (String) ListProtector.get(arrayList, i2));
                                }
                                nLETrackSlot.LJIIL(nLESegmentMV);
                                nLETrackMV.LIZIZ(nLETrackSlot);
                                i2 = i3;
                            } else {
                                C47261Igj.LJJJJJ();
                                throw null;
                            }
                        }
                        LJ2.addTrack(nLETrackMV);
                        C121914qR c121914qR = new C121914qR();
                        c121914qR.LJIIZILJ = EnumC121684q4.MV_MUSIC;
                        c121914qR.LIZ = "";
                        c121914qR.LJI = 1.0f;
                        new C121924qS(c121914qR).LIZJ(nLEEditor);
                    }
                    return nLEEditor;
                }

                @Override // X.C5MG
                public final void LJIIL(VEVolumeChangeOp op) {
                    InterfaceC123794tT LJFF;
                    C121914qR LJJIII;
                    InterfaceC123794tT LJFF2;
                    o.LJIIIZ(op, "op");
                    C122034qd LJJI = C17N.LJJI(LJIJ());
                    if (LJJI != null && (LJFF = LJJI.LJFF()) != null && (LJJIII = LJFF.LJJIII()) != null) {
                        LJJIII.LJI = op.mVolume;
                        C122034qd LJJI2 = C17N.LJJI(LJIJ());
                        if (LJJI2 != null && (LJFF2 = LJJI2.LJFF()) != null) {
                            LJFF2.LJJJJJL(LJJIII);
                        }
                    }
                }

                @Override // X.C5MG
                public final void LJIILL(C123774tR op) {
                    InterfaceC123794tT LJFF;
                    C121914qR LJJIII;
                    InterfaceC123794tT LJFF2;
                    o.LJIIIZ(op, "op");
                    C122034qd LJJI = C17N.LJJI(LJIJ());
                    if (LJJI != null && (LJFF = LJJI.LJFF()) != null && (LJJIII = LJFF.LJJIII()) != null) {
                        long j = op.LIZ;
                        LJJIII.LJ = j;
                        int i2 = op.LIZIZ;
                        LJJIII.LJFF = r2 + i2;
                        LJJIII.LIZJ = j;
                        LJJIII.LIZLLL = (i2 * LJJIII.LJIIIIZZ) + r2;
                        LJJIII.LJIILLIIL = op.LIZJ;
                        C122034qd LJJI2 = C17N.LJJI(LJIJ());
                        if (LJJI2 != null && (LJFF2 = LJJI2.LJFF()) != null) {
                            LJFF2.LJJJJJL(LJJIII);
                        }
                    }
                }

                @Override // X.C5MG
                public final int LJJII(Context context, InterfaceC133095Kf params, SurfaceView surfaceView, LifecycleOwner lifecycleOwner) {
                    o.LJIIIZ(params, "params");
                    super.LJJII(context, params, surfaceView, lifecycleOwner);
                    return 0;
                }
            };
        }
        return new C5MG(configure) { // from class: X.4tV
            public List<String> LJJIJIIJI;

            {
                C38995FSd.LJ();
            }

            @Override // X.C5MG
            public final NLEEditor LJII(VEPreviewParams params) {
                String str;
                o.LJIIIZ(params, "params");
                NLEEditor nLEEditor = new NLEEditor();
                MvCreateVideoData mvCreateVideoData = params.mvCreateVideoData;
                if (mvCreateVideoData == null) {
                    return nLEEditor;
                }
                ArrayList<String> mediaList = mvCreateVideoData.selectMediaList;
                if (mediaList == null || mediaList.isEmpty() || (str = mvCreateVideoData.mvResUnzipPath) == null || str.length() == 0) {
                    return nLEEditor;
                }
                NLEModel LJ2 = nLEEditor.LJ();
                if (LJ2 == null) {
                    return nLEEditor;
                }
                o.LJIIIIZZ(mediaList, "mediaList");
                ArrayList arrayList = new ArrayList(C32I.LJJL(mediaList, 10));
                Iterator<String> it = mediaList.iterator();
                while (it.hasNext()) {
                    it.next();
                    arrayList.add("img");
                }
                C121914qR c121914qR = new C121914qR();
                c121914qR.LIZ = "";
                c121914qR.LJI = 1.0f;
                new C121924qS(c121914qR).LIZJ(nLEEditor);
                NLETrackMV nLETrackMV = new NLETrackMV();
                nLETrackMV.LJJ(true);
                NLEResourceNode nLEResourceNode = new NLEResourceNode();
                nLEResourceNode.LJIIIZ(mvCreateVideoData.mvResUnzipPath);
                NLEEditorJniJNI.NLETrackMV_setMV(nLETrackMV.LIZJ, nLETrackMV, NLEResourceNode.LIZ(nLEResourceNode), nLEResourceNode);
                NLEEditorJniJNI.NLETrackMV_setMVResolution(nLETrackMV.LIZJ, nLETrackMV, EnumC123844tY.RES_CUSTOM.swigValue());
                NLEEditorJniJNI.NLETrackMV_setCustomWidth(nLETrackMV.LIZJ, nLETrackMV, params.mCanvasWidth);
                NLEEditorJniJNI.NLETrackMV_setCustomHeight(nLETrackMV.LIZJ, nLETrackMV, params.mCanvasHeight);
                Iterator<String> it2 = mediaList.iterator();
                long j = 0;
                int i2 = 0;
                while (it2.hasNext()) {
                    String next = it2.next();
                    int i3 = i2 + 1;
                    if (i2 >= 0) {
                        NLETrackSlot nLETrackSlot = new NLETrackSlot();
                        nLETrackSlot.setStartTime(j * 1000);
                        NLESegmentMV nLESegmentMV = new NLESegmentMV();
                        NLEResourceNode nLEResourceNode2 = new NLEResourceNode();
                        nLEResourceNode2.LJIIIZ(next);
                        nLEResourceNode2.setDuration(1 * 1000);
                        NLEEditorJniJNI.NLESegmentMV_setSourceFile(nLESegmentMV.LIZJ, nLESegmentMV, NLEResourceNode.LIZ(nLEResourceNode2), nLEResourceNode2);
                        if (i2 < arrayList.size()) {
                            NLEEditorJniJNI.NLESegmentMV_setSourceFileType(nLESegmentMV.LIZJ, nLESegmentMV, (String) ListProtector.get(arrayList, i2));
                        }
                        nLETrackSlot.LJIIL(nLESegmentMV);
                        j++;
                        nLETrackMV.LIZIZ(nLETrackSlot);
                        i2 = i3;
                    } else {
                        C47261Igj.LJJJJJ();
                        throw null;
                    }
                }
                ArrayList<MvNetFileBean> arrayList2 = mvCreateVideoData.newMaskFileData;
                if (arrayList2 != null && !arrayList2.isEmpty()) {
                    Iterator<MvNetFileBean> it3 = arrayList2.iterator();
                    while (it3.hasNext()) {
                        MvNetFileBean next2 = it3.next();
                        String photonPath = next2.getPhotonPath();
                        String algorithm = next2.getAlgorithm();
                        String filePath = next2.getFilePath();
                        String jsonParams = next2.getJsonParams();
                        if (filePath.length() > 0) {
                            if (ujb.o.LJJJJ(filePath, ".mp4", false)) {
                                C78842Uww.LJIJJLI(nLETrackMV, photonPath, algorithm, filePath, EnumC123824tW.TYPE_VIDEO.swigValue());
                            } else {
                                C78842Uww.LJIJJLI(nLETrackMV, photonPath, algorithm, filePath, EnumC123824tW.TYPE_IMAGE.swigValue());
                            }
                        }
                        if (jsonParams.length() > 0) {
                            C78842Uww.LJIJJLI(nLETrackMV, photonPath, algorithm, jsonParams, EnumC123824tW.TYPE_JSON.swigValue());
                        }
                    }
                }
                LJ2.addTrack(nLETrackMV);
                return nLEEditor;
            }

            @Override // X.C5MG
            public final boolean LJIIJJI(VEPreviewMusicParams params) {
                List<String> list;
                InterfaceC123794tT LJFF;
                int i2;
                int i3;
                int i4;
                int i5;
                InterfaceC123794tT LJFF2;
                InterfaceC123794tT LJFF3;
                InterfaceC123794tT LJFF4;
                C121914qR LJJIII;
                InterfaceC123794tT LJFF5;
                o.LJIIIZ(params, "params");
                if (params.isMusicIllegal) {
                    C122034qd LJJI = C17N.LJJI(LJJ());
                    if (LJJI != null && (LJFF4 = LJJI.LJFF()) != null && (LJJIII = LJFF4.LJJIII()) != null) {
                        LJJIII.LJI = 0.0f;
                        C122034qd LJJI2 = C17N.LJJI(LJJ());
                        if (LJJI2 != null && (LJFF5 = LJJI2.LJFF()) != null) {
                            LJFF5.LJJJJJL(LJJIII);
                        }
                    }
                    return false;
                }
                if (params.pageType == 2 && TextUtils.isEmpty(params.musicId)) {
                    return false;
                }
                C122034qd LJJI3 = C17N.LJJI(LJIJ());
                if (LJJI3 != null && (LJFF3 = LJJI3.LJFF()) != null) {
                    LJFF3.LJJJJJL(null);
                }
                C121914qR c121914qR = new C121914qR();
                String str = params.musicId;
                if (TextUtils.isEmpty(str) || (list = this.LJJIJIIJI) == null || C77413UZt.LJIILL(list) || !ORZ.LJLJJI(str, list)) {
                    if (!TextUtils.isEmpty(params.mPath)) {
                        c121914qR.LJIIZILJ = EnumC121684q4.MV_NORMAL;
                        c121914qR.LIZ = params.mPath;
                        c121914qR.LJIILJJIL = params.musicId;
                        c121914qR.LJIILL = params.musicName;
                        c121914qR.LJ = 0L;
                        int i6 = params.mShootDuration;
                        if (i6 > 0 && Math.abs(params.mDuration - i6) >= 1000) {
                            i2 = params.mInPoint;
                            i3 = params.mShootDuration;
                        } else {
                            i2 = params.mInPoint;
                            i3 = params.mDuration;
                        }
                        c121914qR.LJFF = i2 + i3;
                        c121914qR.LIZJ = params.mInPoint;
                        int i7 = params.mShootDuration;
                        if (i7 > 0 && Math.abs(params.mDuration - i7) >= 1000) {
                            i4 = params.mInPoint;
                            i5 = params.mShootDuration;
                        } else {
                            i4 = params.mInPoint;
                            i5 = params.mDuration;
                        }
                        c121914qR.LIZLLL = i4 + i5;
                        c121914qR.LJIILLIIL = params.isSoundLoop;
                        c121914qR.LJI = params.mVolume;
                        C122034qd LJJI4 = C17N.LJJI(LJIJ());
                        if (LJJI4 != null && (LJFF2 = LJJI4.LJFF()) != null) {
                            LJFF2.LJJJJJL(c121914qR);
                        }
                    }
                } else {
                    c121914qR.LJIIZILJ = EnumC121684q4.MV_NORMAL;
                    c121914qR.LIZ = "";
                    c121914qR.LJIILJJIL = params.musicId;
                    c121914qR.LJIILL = params.musicName;
                    c121914qR.LJI = params.mVolume;
                    C122034qd LJJI5 = C17N.LJJI(LJIJ());
                    if (LJJI5 != null && (LJFF = LJJI5.LJFF()) != null) {
                        LJFF.LJJJJJL(c121914qR);
                    }
                }
                return false;
            }

            @Override // X.C5MG
            public final void LJJIII(boolean z) {
                InterfaceC133095Kf interfaceC133095Kf = this.LJIIIIZZ;
                if (this.LJIJJ == null && interfaceC133095Kf != null && interfaceC133095Kf.getCanvasWidth() > 0 && interfaceC133095Kf.getCanvasHeight() > 0 && !interfaceC133095Kf.isCanvasVEEditorType()) {
                    ((C133765Mu) LJIJ()).LLLFFI(VEEditor.SCALE_MODE.SCALE_MODE_CENTER_INSIDE_WITH_2DENGINE);
                    ((C133765Mu) LJIJ()).LLJIJIL(interfaceC133095Kf.getCanvasWidth(), interfaceC133095Kf.getCanvasHeight());
                }
                super.LJJIII(z);
            }

            @Override // X.C5MG
            public final int LJJII(Context context, InterfaceC133095Kf params, SurfaceView surfaceView, LifecycleOwner lifecycleOwner) {
                MvCreateVideoData mvCreateVideoData;
                o.LJIIIZ(params, "params");
                super.LJJII(context, params, surfaceView, lifecycleOwner);
                if ((params instanceof VEPreviewParams) && (mvCreateVideoData = ((VEPreviewParams) params).mvCreateVideoData) != null) {
                    this.LJJIJIIJI = mvCreateVideoData.musicIds;
                }
                if (C42117Gfx.LIZIZ()) {
                    ((C133765Mu) LJIJ()).LJIIJ();
                    return 0;
                }
                return 0;
            }
        };
    }
}
