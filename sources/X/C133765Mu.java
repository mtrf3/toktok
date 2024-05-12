package X;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Handler;
import android.view.Surface;
import android.view.SurfaceView;
import android.view.TextureView;
import com.bytedance.ies.nle.editor_jni.LogLevel;
import com.bytedance.ies.nle.editor_jni.NLEClipAlgorithmParam;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEEditorJniJNI;
import com.bytedance.ies.nle.editor_jni.NLEEditorListener;
import com.bytedance.ies.nle.editor_jni.NLELoggerListener;
import com.bytedance.ies.nle.editor_jni.NLEMVAudioInfo;
import com.bytedance.ies.nle.editor_jni.NLEMediaConfig;
import com.bytedance.ies.nle.editor_jni.NLEMediaJniJNI;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLEResourceAV;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegmentAudio;
import com.bytedance.ies.nle.editor_jni.NLESegmentImageVideoAnimation;
import com.bytedance.ies.nle.editor_jni.NLESegmentTimeEffect;
import com.bytedance.ies.nle.editor_jni.NLESegmentTransition;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideoAnimation;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.NLEVEUserConfig;
import com.bytedance.ies.nle.editor_jni.NLEVideoAnimation;
import com.bytedance.ies.nle.editor_jni.NLEVideoEncodeSettings;
import com.bytedance.ies.nle.editor_jni.PairIntInt;
import com.bytedance.ies.nle.editor_jni.VecLongLong;
import com.bytedance.ies.nle.editor_jni.VecNLEClipAlgorithmParam;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.asve.editor.NLEDropFrameParams;
import com.ss.android.vesdk.ROTATE_DEGREE;
import com.ss.android.vesdk.VEEditor;
import com.ss.android.vesdk.VEEditorModel;
import com.ss.android.vesdk.VEMVAudioInfo;
import com.ss.android.vesdk.VESize;
import com.ss.android.vesdk.VETimelineParams;
import com.ss.android.vesdk.VEUserConfig;
import com.ss.android.vesdk.VEUtils;
import com.ss.android.vesdk.VEVideoEncodeSettings;
import com.ss.android.vesdk.clipparam.VEClipAlgorithmParam;
import com.ss.android.vesdk.clipparam.VEClipSourceParam;
import com.ss.android.vesdk.clipparam.VEClipTimelineParam;
import com.ss.android.vesdk.filterparam.VEBaseFilterParam;
import com.ss.android.vesdk.filterparam.VEImageTransformFilterParam;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.5Mu, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C133765Mu implements InterfaceC153045zY {
    public final String LIZ;
    public final C5NZ LIZIZ;
    public final C133665Mk LIZJ;
    public final C133785Mw LIZLLL;
    public Throwable LJ;
    public final C5NW LJFF;
    public boolean LJI;
    public final C62822Ol8 LJII;
    public final Rect LJIIIIZZ;
    public final List<InterfaceC133835Nb> LJIIIZ;
    public volatile int LJIIJ;
    public final C62822Ol8 LJIIJJI;
    public final CopyOnWriteArrayList<InterfaceC134025Nu> LJIIL;
    public final C5NC LJIILIIL;
    public final CopyOnWriteArrayList<InterfaceC133905Ni> LJIILJJIL;
    public final C5ND LJIILL;
    public final CopyOnWriteArrayList<InterfaceC133905Ni> LJIILLIIL;
    public final C5NE LJIIZILJ;
    public final CopyOnWriteArrayList<InterfaceC88472Yns<Surface, C76800UCe>> LJIJ;

    public final Handler LJ() {
        return (Handler) this.LJIIJJI.getValue();
    }

    public final C122034qd LJI() {
        return (C122034qd) this.LJII.getValue();
    }

    @Override // X.InterfaceC153045zY
    public final boolean LLILZIL(float f, int i) {
        return true;
    }

    @Override // X.InterfaceC153045zY
    public final int LLILZLL() {
        return -101;
    }

    @Override // X.InterfaceC153045zY
    public final void LLLFFI(VEEditor.SCALE_MODE mode) {
        o.LJIIIZ(mode, "mode");
    }

    @Override // X.InterfaceC153045zY
    public final void LIZIZ() {
        C133785Mw c133785Mw = this.LIZLLL;
        if (c133785Mw != null) {
            c133785Mw.V8().LIZIZ();
        } else {
            o.LJIJI("nleSession");
            throw null;
        }
    }

    @Override // X.InterfaceC153045zY
    public final int LIZJ() {
        C133785Mw c133785Mw = this.LIZLLL;
        if (c133785Mw != null) {
            return c133785Mw.V8().LIZJ();
        }
        o.LJIJI("nleSession");
        throw null;
    }

    public final NLEModel LJFF() {
        NLEModel LJ = LJ();
        if (LJ != null) {
            return LJ;
        }
        return new NLEModel();
    }

    public final int LJII() {
        C133785Mw c133785Mw = this.LIZLLL;
        if (c133785Mw != null) {
            return c133785Mw.X8().LJII();
        }
        o.LJIJI("nleSession");
        throw null;
    }

    public final void LJIIJ() {
        C133785Mw c133785Mw = this.LIZLLL;
        if (c133785Mw != null) {
            c133785Mw.X8().LJIILLIIL();
        } else {
            o.LJIJI("nleSession");
            throw null;
        }
    }

    @Override // X.InterfaceC153045zY
    public final int LJZL() {
        C133785Mw c133785Mw = this.LIZLLL;
        if (c133785Mw != null) {
            return (int) (c133785Mw.V8().getCurrentPosition() / 1000);
        }
        o.LJIJI("nleSession");
        throw null;
    }

    @Override // X.InterfaceC153045zY
    public final boolean LLFII() {
        C133785Mw c133785Mw = this.LIZLLL;
        if (c133785Mw != null) {
            return c133785Mw.P8().LJIILL();
        }
        o.LJIJI("nleSession");
        throw null;
    }

    @Override // X.InterfaceC153045zY
    public final void LLIFFJFJJ() {
        C133785Mw c133785Mw = this.LIZLLL;
        if (c133785Mw != null) {
            c133785Mw.W8().LJIILL();
        } else {
            o.LJIJI("nleSession");
            throw null;
        }
    }

    @Override // X.InterfaceC153045zY
    public final void LLII() {
        C133785Mw c133785Mw = this.LIZLLL;
        if (c133785Mw != null) {
            c133785Mw.W8().LJIILJJIL();
        } else {
            o.LJIJI("nleSession");
            throw null;
        }
    }

    @Override // X.InterfaceC153045zY
    public final void LLIIIILZ() {
        this.LJIIIZ.clear();
        LJ().removeMessages(100);
    }

    @Override // X.InterfaceC153045zY
    public final void LLIIIJ() {
        C133785Mw c133785Mw = this.LIZLLL;
        if (c133785Mw != null) {
            c133785Mw.V8().LJIILJJIL();
        } else {
            o.LJIJI("nleSession");
            throw null;
        }
    }

    @Override // X.InterfaceC153045zY
    public final NLEModel LLIIIL() {
        return NLEModel.dynamicCast(LJ().deepClone());
    }

    @Override // X.InterfaceC153045zY
    public final int LLILIL() {
        C133785Mw c133785Mw = this.LIZLLL;
        if (c133785Mw != null) {
            return c133785Mw.P8().LJIILJJIL();
        }
        o.LJIJI("nleSession");
        throw null;
    }

    @Override // X.InterfaceC153045zY
    public final VESize LLILZ() {
        C133785Mw c133785Mw = this.LIZLLL;
        if (c133785Mw != null) {
            PairIntInt LJIIJ = c133785Mw.P8().LJIIJ();
            return new VESize(LJIIJ.LIZ(), LJIIJ.LIZIZ());
        }
        o.LJIJI("nleSession");
        throw null;
    }

    @Override // X.InterfaceC153045zY
    public final int LLIZLLLIL() {
        long duration;
        C133665Mk nleEditor = this.LIZJ;
        long duration2 = getDuration() * 1000;
        o.LJIIIZ(nleEditor, "nleEditor");
        NLETrackSlot LIZ = C120754oZ.LIZ(nleEditor);
        if (LIZ != null) {
            NLESegmentTimeEffect timeEffect = NLESegmentTimeEffect.LIZLLL(LIZ.LJI());
            o.LJIIIIZZ(timeEffect, "timeEffect");
            int NLESegmentTimeEffect_getTimeEffectType = (int) NLEEditorJniJNI.NLESegmentTimeEffect_getTimeEffectType(timeEffect.LIZJ, timeEffect);
            if (NLESegmentTimeEffect_getTimeEffectType != 2) {
                if (NLESegmentTimeEffect_getTimeEffectType == 3) {
                    duration = ((float) LIZ.getDuration()) * 0.5f;
                }
            } else {
                duration = 2 * (LIZ.getDuration() / 3);
            }
            duration2 -= duration;
        }
        return (int) (duration2 / 1000);
    }

    @Override // X.InterfaceC153045zY
    public final int LLJILLL() {
        C133785Mw c133785Mw = this.LIZLLL;
        if (c133785Mw != null) {
            return c133785Mw.S8().LJ();
        }
        o.LJIJI("nleSession");
        throw null;
    }

    @Override // X.InterfaceC153045zY
    public final int LLJJ() {
        C133785Mw c133785Mw = this.LIZLLL;
        if (c133785Mw != null) {
            return c133785Mw.X8().LJIILJJIL();
        }
        o.LJIJI("nleSession");
        throw null;
    }

    @Override // X.InterfaceC153045zY
    public final float LLJJJ() {
        C133785Mw c133785Mw = this.LIZLLL;
        if (c133785Mw != null) {
            return c133785Mw.P8().LJIILIIL();
        }
        o.LJIJI("nleSession");
        throw null;
    }

    @Override // X.InterfaceC153045zY
    public final void LLJJJJ() {
        C133785Mw c133785Mw = this.LIZLLL;
        if (c133785Mw != null) {
            c133785Mw.X8().LJIIZILJ();
        } else {
            o.LJIJI("nleSession");
            throw null;
        }
    }

    @Override // X.InterfaceC153045zY
    public final int LLJJJJLIIL() {
        C133785Mw c133785Mw = this.LIZLLL;
        if (c133785Mw != null) {
            return c133785Mw.P8().LJFF();
        }
        o.LJIJI("nleSession");
        throw null;
    }

    @Override // X.InterfaceC153045zY
    public final String LLJJL() {
        LIZIZ();
        LIZJ();
        return LJIIIIZZ();
    }

    @Override // X.InterfaceC153045zY
    public final void LLJJLIIIJLLLLLLLZ() {
        C133785Mw c133785Mw = this.LIZLLL;
        if (c133785Mw != null) {
            c133785Mw.P8().LJI(Boolean.TRUE);
        } else {
            o.LJIJI("nleSession");
            throw null;
        }
    }

    @Override // X.InterfaceC153045zY
    public final Bitmap LLJL() {
        C133785Mw c133785Mw = this.LIZLLL;
        if (c133785Mw != null) {
            return c133785Mw.P8().LJII(-1);
        }
        o.LJIJI("nleSession");
        throw null;
    }

    @Override // X.InterfaceC153045zY
    public final VEMVAudioInfo LLJZIJLIL() {
        C133785Mw c133785Mw = this.LIZLLL;
        if (c133785Mw != null) {
            NLEMVAudioInfo LJFF = c133785Mw.U8().LJFF();
            VEMVAudioInfo vEMVAudioInfo = new VEMVAudioInfo();
            if (NLEMediaJniJNI.NLEMVAudioInfo_path_get(LJFF.LIZ, LJFF) != null) {
                vEMVAudioInfo.path = NLEMediaJniJNI.NLEMVAudioInfo_path_get(LJFF.LIZ, LJFF);
            }
            vEMVAudioInfo.trimIn = C78926UyI.LJJIZ(NLEMediaJniJNI.NLEMVAudioInfo_trimIn_get(LJFF.LIZ, LJFF));
            vEMVAudioInfo.trimOut = C78926UyI.LJJIZ(NLEMediaJniJNI.NLEMVAudioInfo_trimOut_get(LJFF.LIZ, LJFF));
            return vEMVAudioInfo;
        }
        o.LJIJI("nleSession");
        throw null;
    }

    @Override // X.InterfaceC153045zY
    public final int LLL() {
        C133785Mw c133785Mw = this.LIZLLL;
        if (c133785Mw != null) {
            C5J1 V8 = c133785Mw.V8();
            if (V8 != null) {
                if (V8.LJJIL() == EnumC135185Sg.SEEKING) {
                    return this.LJIIJ;
                }
                return (int) (V8.getCurrentPosition() / 1000);
            }
            return -1;
        }
        o.LJIJI("nleSession");
        throw null;
    }

    @Override // X.InterfaceC153045zY
    public final void LLLF() {
        LIZIZ();
    }

    @Override // X.InterfaceC153045zY
    public final int genRandomSolve() {
        C133785Mw c133785Mw = this.LIZLLL;
        if (c133785Mw != null) {
            return c133785Mw.Y8().LJIIIIZZ();
        }
        o.LJIJI("nleSession");
        throw null;
    }

    @Override // X.InterfaceC153045zY
    public final int genSmartCutting() {
        C133785Mw c133785Mw = this.LIZLLL;
        if (c133785Mw != null) {
            return c133785Mw.Y8().LJIIIZ();
        }
        o.LJIJI("nleSession");
        throw null;
    }

    @Override // X.InterfaceC153045zY
    public final List<VEClipAlgorithmParam> getAllVideoRangeData() {
        C133785Mw c133785Mw = this.LIZLLL;
        if (c133785Mw != null) {
            VecNLEClipAlgorithmParam LJIIJJI = c133785Mw.Y8().LJIIJJI();
            ArrayList arrayList = new ArrayList(C32I.LJJL(LJIIJJI, 10));
            Iterator<NLEClipAlgorithmParam> it = LJIIJJI.iterator();
            while (it.hasNext()) {
                NLEClipAlgorithmParam it2 = it.next();
                o.LJIIIIZZ(it2, "it");
                VEClipAlgorithmParam vEClipAlgorithmParam = new VEClipAlgorithmParam();
                vEClipAlgorithmParam.index = NLEMediaJniJNI.NLEClipAlgorithmParam_index_get(it2.LIZ, it2);
                vEClipAlgorithmParam.bingoEffect = NLEMediaJniJNI.NLEClipAlgorithmParam_bingoEffect_get(it2.LIZ, it2);
                vEClipAlgorithmParam.range = (int) NLEMediaJniJNI.NLEClipAlgorithmParam_range_get(it2.LIZ, it2);
                vEClipAlgorithmParam.rotate = NLEMediaJniJNI.NLEClipAlgorithmParam_rotate_get(it2.LIZ, it2);
                vEClipAlgorithmParam.trimIn = (int) NLEMediaJniJNI.NLEClipAlgorithmParam_trimIn_get(it2.LIZ, it2);
                vEClipAlgorithmParam.trimOut = (int) NLEMediaJniJNI.NLEClipAlgorithmParam_trimOut_get(it2.LIZ, it2);
                arrayList.add(vEClipAlgorithmParam);
            }
            return arrayList;
        }
        o.LJIJI("nleSession");
        throw null;
    }

    @Override // X.InterfaceC153045zY
    public final VEEditor.VEState getState() {
        C133785Mw c133785Mw = this.LIZLLL;
        if (c133785Mw != null) {
            EnumC135185Sg LJJIL = c133785Mw.V8().LJJIL();
            if (LJJIL == null) {
                return null;
            }
            switch (C87279YNf.LIZ[LJJIL.ordinal()]) {
                case 1:
                    return VEEditor.VEState.PREPARED;
                case 2:
                    return VEEditor.VEState.STARTED;
                case 3:
                    return VEEditor.VEState.PAUSED;
                case 4:
                    return VEEditor.VEState.SEEKING;
                case 5:
                    return VEEditor.VEState.STOPPED;
                case 6:
                    return VEEditor.VEState.IDLE;
                default:
                    return VEEditor.VEState.ANY;
            }
        }
        o.LJIJI("nleSession");
        throw null;
    }

    @Override // X.InterfaceC153045zY
    public final int initBingoAlgorithm() {
        C133785Mw c133785Mw = this.LIZLLL;
        if (c133785Mw != null) {
            return c133785Mw.Y8().LJIIL();
        }
        o.LJIJI("nleSession");
        throw null;
    }

    @Override // X.InterfaceC153045zY
    public final int pause() {
        C133785Mw c133785Mw = this.LIZLLL;
        if (c133785Mw != null) {
            return c133785Mw.V8().pause();
        }
        o.LJIJI("nleSession");
        throw null;
    }

    @Override // X.InterfaceC153045zY
    public final int prepare() {
        C133785Mw c133785Mw = this.LIZLLL;
        if (c133785Mw != null) {
            return c133785Mw.V8().prepare();
        }
        o.LJIJI("nleSession");
        throw null;
    }

    @Override // X.InterfaceC153045zY
    public final int removeAllVideoSound() {
        C133785Mw c133785Mw = this.LIZLLL;
        if (c133785Mw != null) {
            return c133785Mw.Y8().LJIILIIL();
        }
        o.LJIJI("nleSession");
        throw null;
    }

    @Override // X.InterfaceC153045zY
    public final int restoreAllVideoSound() {
        C133785Mw c133785Mw = this.LIZLLL;
        if (c133785Mw != null) {
            return c133785Mw.Y8().LJIILLIIL();
        }
        o.LJIJI("nleSession");
        throw null;
    }

    @Override // X.InterfaceC153045zY
    public final void stop() {
        C133785Mw c133785Mw = this.LIZLLL;
        if (c133785Mw != null) {
            c133785Mw.V8().stop();
        } else {
            o.LJIJI("nleSession");
            throw null;
        }
    }

    @Override // X.InterfaceC153045zY
    public final int updateAlgorithmFromNormal() {
        C133785Mw c133785Mw = this.LIZLLL;
        if (c133785Mw != null) {
            return c133785Mw.Y8().LJIJI();
        }
        o.LJIJI("nleSession");
        throw null;
    }

    public static void LJIILJJIL() {
        Thread LLLLIIIILLL = C16880lQ.LLLLIIIILLL();
        o.LJIIIIZZ(LLLLIIIILLL, "Thread.currentThread()");
        StackTraceElement stackTraceElement = LLLLIIIILLL.getStackTrace()[2];
        if (!C82891Wg3.LIZIZ()) {
            C5NP LIZLLL = C82891Wg3.LIZLLL();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("nle call ve, method: ");
            LIZ.append(stackTraceElement);
            LIZ.append(" : ");
            LIZ.append(android.util.Log.getStackTraceString(new Throwable()));
            LIZLLL.LIZ(X1D.LIZIZ(LIZ));
            return;
        }
        throw new IllegalAccessException("nle call ve");
    }

    @Override // X.InterfaceC153045zY
    public final VEEditorModel LLIIZ() {
        C5NI c5ni;
        NLEResourceNode LIZLLL;
        String LIZJ;
        NLEModel LJFF = LJFF();
        VEEditorModel vEEditorModel = new VEEditorModel();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        VecNLETrackSPtr tracks = LJFF.getTracks();
        if (tracks != null) {
            Iterator<NLETrack> it = tracks.iterator();
            while (it.hasNext()) {
                NLETrack nleTrack = it.next();
                o.LJIIIIZZ(nleTrack, "nleTrack");
                if (nleTrack.LJIIJ() && nleTrack.getEnable()) {
                    Iterator<NLETrackSlot> it2 = nleTrack.LJIILLIIL().iterator();
                    while (it2.hasNext()) {
                        NLETrackSlot slot = it2.next();
                        o.LJIIIIZZ(slot, "slot");
                        NLESegmentVideo videoSeg = NLESegmentVideo.LJJ(slot.LJI());
                        o.LJIIIIZZ(videoSeg, "videoSeg");
                        NLEResourceAV LJ = videoSeg.LJ();
                        o.LJIIIIZZ(LJ, "videoSeg.avFile");
                        String LIZJ2 = LJ.LIZJ();
                        o.LJIIIIZZ(LIZJ2, "videoSeg.avFile.resourceFile");
                        arrayList.add(LIZJ2);
                        NLESegmentTransition LIZLLL2 = slot.LIZLLL();
                        if (LIZLLL2 != null && (LIZLLL = LIZLLL2.LIZLLL()) != null && (LIZJ = LIZLLL.LIZJ()) != null) {
                            arrayList3.add(LIZJ);
                        }
                    }
                }
                if (nleTrack.LJIIZILJ() == EnumC123864ta.AUDIO) {
                    Iterator<NLETrackSlot> it3 = nleTrack.LJIILLIIL().iterator();
                    while (it3.hasNext()) {
                        NLETrackSlot slot2 = it3.next();
                        o.LJIIIIZZ(slot2, "slot");
                        NLESegmentAudio audioSeg = NLESegmentAudio.LIZLLL(slot2.LJI());
                        o.LJIIIIZZ(audioSeg, "audioSeg");
                        NLEResourceAV LJ2 = audioSeg.LJ();
                        o.LJIIIIZZ(LJ2, "audioSeg.avFile");
                        String LIZJ3 = LJ2.LIZJ();
                        o.LJIIIIZZ(LIZJ3, "audioSeg.avFile.resourceFile");
                        arrayList2.add(LIZJ3);
                    }
                }
            }
        }
        float canvasRatio = LJFF.getCanvasRatio();
        if (canvasRatio == 1.3333334f) {
            c5ni = C5NI.VIDEO_OUT_RATIO_4_3;
        } else if (canvasRatio == 0.75f) {
            c5ni = C5NI.VIDEO_OUT_RATIO_3_4;
        } else if (canvasRatio == 1.7777778f) {
            c5ni = C5NI.VIDEO_OUT_RATIO_16_9;
        } else if (canvasRatio == 0.5625f) {
            c5ni = C5NI.VIDEO_OUT_RATIO_9_16;
        } else if (canvasRatio == 1.0f) {
            c5ni = C5NI.VIDEO_OUT_RATIO_1_1;
        } else {
            c5ni = C5NI.VIDEO_OUT_RATIO_ORIGINAL;
        }
        vEEditorModel.videoOutRes = c5ni;
        Object[] array = arrayList.toArray(new String[0]);
        if (array != null) {
            vEEditorModel.videoPaths = (String[]) array;
            Object[] array2 = arrayList2.toArray(new String[0]);
            if (array2 != null) {
                vEEditorModel.audioPaths = (String[]) array2;
                Object[] array3 = arrayList3.toArray(new String[0]);
                if (array3 != null) {
                    vEEditorModel.transitions = (String[]) array3;
                    return vEEditorModel;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
    }

    @Override // X.InterfaceC153045zY
    public final void destroy() {
        LJ().removeMessages(100);
        C133785Mw c133785Mw = this.LIZLLL;
        if (c133785Mw != null) {
            c133785Mw.Q8().LJFF();
            C133785Mw c133785Mw2 = this.LIZLLL;
            if (c133785Mw2 != null) {
                c133785Mw2.V8().destroy();
                return;
            } else {
                o.LJIJI("nleSession");
                throw null;
            }
        }
        o.LJIJI("nleSession");
        throw null;
    }

    @Override // X.InterfaceC153045zY
    public final int getDuration() {
        C122034qd nlePro = LJI();
        C133785Mw c133785Mw = this.LIZLLL;
        if (c133785Mw != null) {
            o.LJIIIZ(nlePro, "nlePro");
            return ((int) c133785Mw.V8().getDuration()) / 1000;
        }
        o.LJIJI("nleSession");
        throw null;
    }

    @Override // X.InterfaceC153045zY
    public final long getHandler() {
        LJIILJJIL();
        return -1;
    }

    @Override // X.InterfaceC153045zY
    public final int play() {
        LJ().removeMessages(100);
        LJ().sendEmptyMessageDelayed(100, 100L);
        C133785Mw c133785Mw = this.LIZLLL;
        if (c133785Mw != null) {
            return c133785Mw.V8().play();
        }
        o.LJIJI("nleSession");
        throw null;
    }

    @Override // X.InterfaceC153045zY
    public final String[] q0() {
        C121864qM LJJIL = LJI().LIZLLL().LJJIL(EnumC121854qL.VIDEO);
        if (LJJIL == null) {
            return null;
        }
        return new String[]{LJJIL.LIZIZ};
    }

    @Override // X.InterfaceC153045zY
    public final InterfaceC134035Nv LLLIILIL() {
        return this.LJFF;
    }

    @Override // X.InterfaceC153045zY
    public final String getWorkspace() {
        return this.LIZ;
    }

    @Override // X.InterfaceC153045zY
    public final Rect t5() {
        return this.LJIIIIZZ;
    }

    public final void LJIIIIZZ(float f) {
        C133785Mw c133785Mw = this.LIZLLL;
        if (c133785Mw != null) {
            c133785Mw.P8().LJJ(f);
        } else {
            o.LJIJI("nleSession");
            throw null;
        }
    }

    public final boolean LJIIL(NLEModel nleModel) {
        o.LJIIIZ(nleModel, "nleModel");
        LJII(nleModel);
        boolean LIZIZ = LIZIZ();
        boolean LIZJ = LIZJ();
        if (LIZIZ && LIZJ) {
            return true;
        }
        return false;
    }

    public final void LJIILIIL(NLEModel nleModel) {
        o.LJIIIZ(nleModel, "nleModel");
        LJII(nleModel);
    }

    @Override // X.InterfaceC153045zY
    public final void LJJIJLIJ(boolean z) {
        C133785Mw c133785Mw = this.LIZLLL;
        if (c133785Mw != null) {
            c133785Mw.X8().LJ(z);
        } else {
            o.LJIJI("nleSession");
            throw null;
        }
    }

    @Override // X.InterfaceC153045zY
    public final void LJJLIIIIJ(int i) {
        C133785Mw c133785Mw = this.LIZLLL;
        if (c133785Mw != null) {
            c133785Mw.P8().LJIJ(i);
        } else {
            o.LJIJI("nleSession");
            throw null;
        }
    }

    @Override // X.InterfaceC153045zY
    public final void LJZ(NLEModel nLEModel) {
        LJII(nLEModel);
        LIZIZ();
        LIZJ();
    }

    @Override // X.InterfaceC153045zY
    public final float LL(String filterPath) {
        o.LJIIIZ(filterPath, "filterPath");
        C133785Mw c133785Mw = this.LIZLLL;
        if (c133785Mw != null) {
            return c133785Mw.S8().LJFF(filterPath);
        }
        o.LJIJI("nleSession");
        throw null;
    }

    @Override // X.InterfaceC153045zY
    public final void LLFF(InterfaceC133905Ni callback) {
        o.LJIIIZ(callback, "callback");
        this.LJIILLIIL.remove(callback);
    }

    @Override // X.InterfaceC153045zY
    public final void LLFFF(C1551266y c1551266y) {
        Handler handler = LJ();
        List<InterfaceC133835Nb> list = this.LJIIIZ;
        o.LJIIIZ(handler, "handler");
        o.LJIIIZ(list, "list");
        if (c1551266y == null) {
            return;
        }
        ArrayList arrayList = (ArrayList) list;
        arrayList.remove(c1551266y);
        if (!arrayList.isEmpty()) {
            return;
        }
        handler.removeMessages(100);
    }

    @Override // X.InterfaceC153045zY
    public final int LLFZ(int i) {
        C133665Mk nleEditor = this.LIZJ;
        long j = i * 1000;
        o.LJIIIZ(nleEditor, "nleEditor");
        NLETrackSlot LIZ = C120754oZ.LIZ(nleEditor);
        if (LIZ != null) {
            NLESegmentTimeEffect timeEffect = NLESegmentTimeEffect.LIZLLL(LIZ.LJI());
            long startTime = LIZ.getStartTime();
            o.LJIIIIZZ(timeEffect, "timeEffect");
            int NLESegmentTimeEffect_getTimeEffectType = (int) NLEEditorJniJNI.NLESegmentTimeEffect_getTimeEffectType(timeEffect.LIZJ, timeEffect);
            if (NLESegmentTimeEffect_getTimeEffectType != 2) {
                if (NLESegmentTimeEffect_getTimeEffectType == 3 && j > startTime) {
                    j = ((float) j) <= (((float) LIZ.getDuration()) * 0.5f) + ((float) startTime) ? (((float) (j - startTime)) / 0.5f) + r4 : j + (((float) LIZ.getDuration()) * 0.5f);
                }
            } else {
                long j2 = 3;
                if (j > (LIZ.getDuration() / j2) + startTime) {
                    j += (LIZ.getDuration() / j2) * 2;
                }
            }
        }
        return (int) (j / 1000);
    }

    @Override // X.InterfaceC153045zY
    public final int LLI(C5RU c5ru) {
        int length = c5ru.LIZ.length;
        boolean[] zArr = new boolean[length];
        for (int i = 0; i < length; i++) {
            zArr[i] = true;
        }
        return LLLI(zArr, c5ru);
    }

    @Override // X.InterfaceC153045zY
    public final void LLIIII(InterfaceC134025Nu interfaceC134025Nu) {
        if (this.LJIIL.isEmpty()) {
            C133785Mw c133785Mw = this.LIZLLL;
            if (c133785Mw != null) {
                c133785Mw.V8().LJIJJ(this.LJIILIIL);
            } else {
                o.LJIJI("nleSession");
                throw null;
            }
        }
        if (!LIZLLL(this.LJIIL, interfaceC134025Nu)) {
            this.LJIIL.add(interfaceC134025Nu);
        }
    }

    @Override // X.InterfaceC153045zY
    public final void LLIIJI(InterfaceC88472Yns<? super Surface, C76800UCe> listener) {
        o.LJIIIZ(listener, "listener");
        this.LJIJ.remove(listener);
    }

    @Override // X.InterfaceC153045zY
    public final void LLIIJLIL(InterfaceC133905Ni callback) {
        o.LJIIIZ(callback, "callback");
        if (this.LJIILLIIL.isEmpty()) {
            C133785Mw c133785Mw = this.LIZLLL;
            if (c133785Mw != null) {
                c133785Mw.V8().LJJJJI(this.LJIIZILJ);
            } else {
                o.LJIJI("nleSession");
                throw null;
            }
        }
        if (!LIZLLL(this.LJIILLIIL, callback)) {
            this.LJIILLIIL.add(callback);
        }
    }

    @Override // X.InterfaceC153045zY
    public final void LLIILII(InterfaceC88472Yns<? super Surface, C76800UCe> listener) {
        o.LJIIIZ(listener, "listener");
        if (this.LJIJ.isEmpty()) {
            C133785Mw c133785Mw = this.LIZLLL;
            if (c133785Mw != null) {
                final CopyOnWriteArrayList<InterfaceC88472Yns<Surface, C76800UCe>> copyOnWriteArrayList = this.LJIJ;
                c133785Mw.V8().LJIIZILJ = new InterfaceC134005Ns() { // from class: X.5NN
                    @Override // X.InterfaceC134005Ns
                    public final void LIZ() {
                        Iterator it = copyOnWriteArrayList.iterator();
                        while (it.hasNext()) {
                            ((InterfaceC88472Yns) it.next()).invoke(null);
                        }
                    }
                };
            } else {
                o.LJIJI("nleSession");
                throw null;
            }
        }
        if (!LIZLLL(this.LJIJ, listener)) {
            this.LJIJ.add(listener);
        }
    }

    @Override // X.InterfaceC153045zY
    public final int LLILII(C5KG c5kg) {
        LJIILJJIL();
        return -1;
    }

    @Override // X.InterfaceC153045zY
    public final void LLILL(InterfaceC133905Ni interfaceC133905Ni) {
        if (this.LJIILJJIL.isEmpty()) {
            C133785Mw c133785Mw = this.LIZLLL;
            if (c133785Mw != null) {
                c133785Mw.V8().LJIJJLI(this.LJIILL);
                if (!LIZLLL(this.LJIILJJIL, interfaceC133905Ni)) {
                    this.LJIILJJIL.add(interfaceC133905Ni);
                    return;
                }
                return;
            }
            o.LJIJI("nleSession");
            throw null;
        }
    }

    @Override // X.InterfaceC153045zY
    public final void LLILLJJLI(int i) {
        C133785Mw c133785Mw = this.LIZLLL;
        if (c133785Mw != null) {
            c133785Mw.X8().LJIILIIL(i);
        } else {
            o.LJIJI("nleSession");
            throw null;
        }
    }

    @Override // X.InterfaceC153045zY
    public final boolean LLJI(VEVideoEncodeSettings vEVideoEncodeSettings) {
        C133785Mw c133785Mw = this.LIZLLL;
        if (c133785Mw != null) {
            return c133785Mw.W8().LJIILIIL(C87277YNd.LJJJJ(vEVideoEncodeSettings));
        }
        o.LJIJI("nleSession");
        throw null;
    }

    @Override // X.InterfaceC153045zY
    public final void LLJILJIL(boolean z) {
        C133785Mw c133785Mw = this.LIZLLL;
        if (c133785Mw != null) {
            c133785Mw.X8().LJIIL(z);
        } else {
            o.LJIJI("nleSession");
            throw null;
        }
    }

    @Override // X.InterfaceC153045zY
    public final int LLJILJILJ(VEVideoEncodeSettings vEVideoEncodeSettings) {
        C133785Mw c133785Mw = this.LIZLLL;
        if (c133785Mw != null) {
            return c133785Mw.W8().LJIIL(C87277YNd.LJJJJ(vEVideoEncodeSettings));
        }
        o.LJIJI("nleSession");
        throw null;
    }

    @Override // X.InterfaceC153045zY
    public final int LLJJI(int i) {
        long duration;
        C133665Mk nleEditor = this.LIZJ;
        long j = i * 1000;
        o.LJIIIZ(nleEditor, "nleEditor");
        NLETrackSlot LIZ = C120754oZ.LIZ(nleEditor);
        if (LIZ != null) {
            NLESegmentTimeEffect timeEffect = NLESegmentTimeEffect.LIZLLL(LIZ.LJI());
            long startTime = LIZ.getStartTime();
            o.LJIIIIZZ(timeEffect, "timeEffect");
            int NLESegmentTimeEffect_getTimeEffectType = (int) NLEEditorJniJNI.NLESegmentTimeEffect_getTimeEffectType(timeEffect.LIZJ, timeEffect);
            if (NLESegmentTimeEffect_getTimeEffectType != 2) {
                if (NLESegmentTimeEffect_getTimeEffectType == 3 && j > startTime) {
                    if (j <= LIZ.getEndTime()) {
                        j = (((float) (j - startTime)) * 0.5f) + ((float) startTime);
                    } else {
                        duration = ((float) LIZ.getDuration()) * 0.5f;
                        j -= duration;
                    }
                }
            } else if (j > startTime) {
                if (j <= LIZ.getEndTime()) {
                    j = ((j - startTime) % (LIZ.getDuration() / 3)) + startTime;
                } else {
                    duration = (LIZ.getDuration() / 3) * 2;
                    j -= duration;
                }
            }
        }
        return (int) (j / 1000);
    }

    @Override // X.InterfaceC153045zY
    public final int LLJJIJIL(VETimelineParams sceneTime) {
        o.LJIIIZ(sceneTime, "sceneTime");
        C133665Mk nleEditor = this.LIZJ;
        if (this.LIZLLL != null) {
            o.LJIIIZ(nleEditor, "nleEditor");
            return C123454sv.LIZIZ(nleEditor, sceneTime);
        }
        o.LJIJI("nleSession");
        throw null;
    }

    @Override // X.InterfaceC153045zY
    public final void LLJLIL(InterfaceC133835Nb interfaceC133835Nb) {
        if (interfaceC133835Nb == null || this.LJIIIZ.contains(interfaceC133835Nb)) {
            return;
        }
        this.LJIIIZ.add(interfaceC133835Nb);
        LJ().removeMessages(100);
        LJ().sendEmptyMessageDelayed(100, 100L);
    }

    @Override // X.InterfaceC153045zY
    public final Bitmap LLJLL(int i) {
        C133785Mw c133785Mw = this.LIZLLL;
        if (c133785Mw != null) {
            return c133785Mw.P8().LJII(i);
        }
        o.LJIJI("nleSession");
        throw null;
    }

    @Override // X.InterfaceC153045zY
    public final void LLJLLL(boolean z) {
        C133785Mw c133785Mw = this.LIZLLL;
        if (c133785Mw != null) {
            c133785Mw.X8().LJFF(z);
        } else {
            o.LJIJI("nleSession");
            throw null;
        }
    }

    @Override // X.InterfaceC153045zY
    public final int LLJZ(int[] iArr) {
        LJIILJJIL();
        return -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [X.5NS] */
    @Override // X.InterfaceC153045zY
    public final void LLLFF(final C5SJ c5sj) {
        this.LJI = true;
        C133785Mw c133785Mw = this.LIZLLL;
        if (c133785Mw != null) {
            c133785Mw.P8().LJIL(new InterfaceC133895Nh() { // from class: X.5NS
                @Override // X.InterfaceC133895Nh
                public final void LIZIZ(byte[] bArr, long j, int i, boolean z) {
                    C5SJ c5sj2 = C5SJ.this;
                    if (c5sj2 != null) {
                        c5sj2.LIZIZ(bArr, j, i, z);
                    }
                }
            });
        } else {
            o.LJIJI("nleSession");
            throw null;
        }
    }

    @Override // X.InterfaceC153045zY
    public final int LLLIIIIL(int i) {
        C133785Mw c133785Mw = this.LIZLLL;
        if (c133785Mw != null) {
            return c133785Mw.X8().LJIILL(i);
        }
        o.LJIJI("nleSession");
        throw null;
    }

    @Override // X.InterfaceC153045zY
    public final int LLLIIIL(boolean z) {
        LJI().LIZLLL().LJIILJJIL(z);
        return 0;
    }

    @Override // X.InterfaceC153045zY
    public final void LLLIIL(Bitmap bitmap) {
        C133785Mw c133785Mw = this.LIZLLL;
        if (c133785Mw != null) {
            c133785Mw.P8().LJJIFFI(bitmap);
        } else {
            o.LJIJI("nleSession");
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [X.5NU] */
    @Override // X.InterfaceC153045zY
    public final void LLLIL(final InterfaceC133845Nc interfaceC133845Nc) {
        C133785Mw c133785Mw = this.LIZLLL;
        if (c133785Mw != null) {
            c133785Mw.V8().LJIILLIIL(new C5JK() { // from class: X.5NU
                @Override // X.C5JK
                public final void LIZ() {
                    InterfaceC133845Nc.this.LIZ();
                }

                @Override // X.C5JK
                public final void LIZIZ(int i) {
                    InterfaceC133845Nc.this.LIZIZ();
                }
            });
        } else {
            o.LJIJI("nleSession");
            throw null;
        }
    }

    @Override // X.InterfaceC153045zY
    public final void LLLILZ(boolean z) {
        C133785Mw c133785Mw = this.LIZLLL;
        if (c133785Mw != null) {
            c133785Mw.LIZIZ();
        } else {
            o.LJIJI("nleSession");
            throw null;
        }
    }

    @Override // X.InterfaceC153045zY
    public final int cancelGenVideoFrame(int i) {
        C133785Mw c133785Mw = this.LIZLLL;
        if (c133785Mw != null) {
            return c133785Mw.Y8().LJFF(i);
        }
        o.LJIJI("nleSession");
        throw null;
    }

    @Override // X.InterfaceC153045zY
    public final float[] getInfoStickerBoundingBox(int i) {
        LJIILJJIL();
        return new float[]{0.0f, 0.0f, 0.0f, 0.0f};
    }

    @Override // X.InterfaceC153045zY
    public final int removeInfoSticker(int i) {
        LJIILJJIL();
        return -1;
    }

    @Override // X.InterfaceC153045zY
    public final int setInfoStickerRestoreMode(int i) {
        C133785Mw c133785Mw = this.LIZLLL;
        if (c133785Mw != null) {
            return c133785Mw.O8().LJIJ(i);
        }
        o.LJIJI("nleSession");
        throw null;
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [X.5NC] */
    /* JADX WARN: Type inference failed for: r0v15, types: [X.5ND] */
    /* JADX WARN: Type inference failed for: r0v17, types: [X.5NE] */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.5Mk, com.bytedance.ies.nle.editor_jni.NLEEditor] */
    public C133765Mu(String workSpace, TextureView textureView) {
        o.LJIIIZ(workSpace, "workSpace");
        o.LJIIIZ(textureView, "textureView");
        C5K0.LIZIZ();
        com.bytedance.ies.nleeditor.NLE nle = com.bytedance.ies.nleeditor.NLE.INSTANCE;
        nle.setLogger(new NLELoggerListener() { // from class: X.5N6
            @Override // com.bytedance.ies.nle.editor_jni.NLELoggerListener
            public final void onLog(LogLevel logLevel, String str) {
                int i;
                if (logLevel == null || (i = C134055Nx.LIZ[logLevel.ordinal()]) == 1) {
                    return;
                }
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                return;
                            }
                            C5NP LIZLLL = C82891Wg3.LIZLLL();
                            StringBuilder LIZ = X1D.LIZ();
                            LIZ.append("NLE ");
                            LIZ.append(str);
                            LIZLLL.LIZ(X1D.LIZIZ(LIZ));
                            return;
                        }
                        C5NP LIZLLL2 = C82891Wg3.LIZLLL();
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append("NLE ");
                        LIZ2.append(str);
                        LIZLLL2.w(X1D.LIZIZ(LIZ2));
                        return;
                    }
                    C5NP LIZLLL3 = C82891Wg3.LIZLLL();
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append("NLE ");
                    LIZ3.append(str);
                    LIZLLL3.i(X1D.LIZIZ(LIZ3));
                    return;
                }
                C5NP LIZLLL4 = C82891Wg3.LIZLLL();
                StringBuilder LIZ4 = X1D.LIZ();
                LIZ4.append("NLE ");
                LIZ4.append(str);
                LIZLLL4.d(X1D.LIZIZ(LIZ4));
            }
        });
        nle.setLogLevel(LogLevel.LEVEL_DEBUG);
        ?? r3 = new NLEEditor() { // from class: X.5Mk
            @Override // com.bytedance.ies.nle.editor_jni.NLEEditor
            public final boolean LIZIZ() {
                InterfaceC88472Yns<? super NLEModel, C76800UCe> interfaceC88472Yns = C5MK.LJIIIZ;
                if (interfaceC88472Yns != null) {
                    interfaceC88472Yns.invoke(C133765Mu.this.LJFF());
                }
                Throwable th = C133765Mu.this.LJ;
                if (th == null) {
                    return super.LIZIZ();
                }
                throw th;
            }
        };
        this.LIZJ = r3;
        this.LJFF = new C5NW(new AqS152S0100000_2(this, 637));
        this.LJII = C221108m2.LIZIZ(new AqS152S0100000_2(this, 639));
        this.LJIIIIZZ = new Rect();
        this.LJIIIZ = new ArrayList();
        this.LJIIJ = -1;
        this.LJIIJJI = C221108m2.LIZIZ(new AqS152S0100000_2(this, 638));
        this.LJIIL = new CopyOnWriteArrayList<>();
        this.LJIILIIL = new InterfaceC132775Iz() { // from class: X.5NC
            @Override // X.InterfaceC132775Iz
            public final void LIZ() {
                C133765Mu.this.getClass();
                Iterator<InterfaceC134025Nu> it = C133765Mu.this.LJIIL.iterator();
                while (it.hasNext()) {
                    it.next().LIZ();
                }
            }
        };
        this.LJIILJJIL = new CopyOnWriteArrayList<>();
        this.LJIILL = new C5JL() { // from class: X.5ND
            @Override // X.C5JL
            public final void LIZ(int i, int i2, float f, String str) {
                Iterator<InterfaceC133905Ni> it = C133765Mu.this.LJIILJJIL.iterator();
                while (it.hasNext()) {
                    it.next().LIZ(i, i2, f, str);
                }
            }
        };
        this.LJIILLIIL = new CopyOnWriteArrayList<>();
        this.LJIIZILJ = new C5JL() { // from class: X.5NE
            @Override // X.C5JL
            public final void LIZ(int i, int i2, float f, String str) {
                Iterator<InterfaceC133905Ni> it = C133765Mu.this.LJIILLIIL.iterator();
                while (it.hasNext()) {
                    it.next().LIZ(i, i2, f, str);
                }
            }
        };
        this.LJIJ = new CopyOnWriteArrayList<>();
        this.LIZ = workSpace;
        this.LIZIZ = null;
        C133035Jz c133035Jz = C133785Mw.LJFF;
        NLEMediaConfig LIZIZ = C5ML.LIZIZ(workSpace);
        c133035Jz.getClass();
        C5N8.LIZJ.LIZ();
        C133785Mw c133785Mw = new C133785Mw(LIZIZ, textureView, (C133665Mk) r3);
        this.LIZLLL = c133785Mw;
        r3.addConsumer(new NLEEditorListener() { // from class: X.5Ml
            @Override // com.bytedance.ies.nle.editor_jni.NLEEditorListener
            public final void onChanged() {
                try {
                    C133765Mu c133765Mu = C133765Mu.this;
                    C133785Mw c133785Mw2 = c133765Mu.LIZLLL;
                    if (c133785Mw2 != null) {
                        c133785Mw2.R8(c133765Mu.LJFF());
                    } else {
                        o.LJIJI("nleSession");
                        throw null;
                    }
                } catch (Throwable th) {
                    NLELoggerListener logger = com.bytedance.ies.nleeditor.NLE.INSTANCE.getLogger();
                    if (logger != null) {
                        LogLevel logLevel = LogLevel.LEVEL_DEBUG;
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append("NLEEditor callback: ");
                        LIZ.append(th);
                        logger.onLog(logLevel, X1D.LIZIZ(LIZ));
                    }
                    C133765Mu.this.LJ = th;
                }
            }
        });
        NLEDropFrameParams nLEDropFrameParams = C5MK.LJ;
        if (nLEDropFrameParams.isSetParams()) {
            c133785Mw.X8().LJIIJ(nLEDropFrameParams.getMaxDropCount(), nLEDropFrameParams.getDelayTime());
        }
    }

    public static final boolean LIZLLL(CopyOnWriteArrayList<?> copyOnWriteArrayList, Object obj) {
        Iterator<?> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            if (it.next() == obj) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJIIJJI(int r10, int r11) {
        /*
            r9 = this;
            float r5 = (float) r10
            float r0 = (float) r11
            float r5 = r5 / r0
            X.5Mk r0 = r9.LIZJ
            com.bytedance.ies.nle.editor_jni.NLEModel r0 = r0.LJ()
            java.lang.String r4 = "nleEditor.model"
            kotlin.jvm.internal.o.LJIIIIZZ(r0, r4)
            float r6 = r0.getCanvasRatio()
            r8 = 0
            int r0 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r0 == 0) goto L8a
            r7 = 1
        L18:
            X.5Mk r0 = r9.LIZJ
            com.bytedance.ies.nle.editor_jni.NLEModel r1 = r0.LJ()
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r4)
            java.lang.String r3 = "Canvas_Width"
            boolean r0 = r1.hasExtra(r3)
            r2 = 0
            if (r0 != 0) goto L58
        L2a:
            r2 = 1
        L2b:
            if (r7 == 0) goto L40
            X.5Mk r0 = r9.LIZJ
            com.bytedance.ies.nle.editor_jni.NLEModel r0 = r0.LJ()
            kotlin.jvm.internal.o.LJIIIIZZ(r0, r4)
            r0.setCanvasRatio(r5)
            X.5NZ r0 = r9.LIZIZ
            if (r0 == 0) goto L40
            r0.LIZJ(r9, r5, r6)
        L40:
            if (r2 == 0) goto L52
            X.5Mk r0 = r9.LIZJ
            com.bytedance.ies.nle.editor_jni.NLEModel r1 = r0.LJ()
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r4)
            java.lang.String r0 = java.lang.String.valueOf(r10)
            r1.setExtra(r3, r0)
        L52:
            if (r7 != 0) goto L56
            if (r2 == 0) goto L57
        L56:
            r8 = 1
        L57:
            return r8
        L58:
            java.lang.String r0 = r1.getExtra(r3)     // Catch: java.lang.Throwable -> L6c
            if (r0 == 0) goto L6a
            int r0 = com.bytedance.mt.protector.impl.string2number.CastIntegerProtector.parseInt(r0)     // Catch: java.lang.Throwable -> L6c
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L6c
        L66:
            X.C3C5.m7constructorimpl(r1)     // Catch: java.lang.Throwable -> L6c
            goto L74
        L6a:
            r1 = r2
            goto L66
        L6c:
            r0 = move-exception
            X.3C4 r1 = X.C141335gf.LIZ(r0)
            X.C3C5.m7constructorimpl(r1)
        L74:
            boolean r0 = X.C3C5.m12isFailureimpl(r1)
            if (r0 == 0) goto L7f
        L7a:
            java.lang.Integer r2 = (java.lang.Integer) r2
            if (r2 != 0) goto L81
            goto L2a
        L7f:
            r2 = r1
            goto L7a
        L81:
            int r0 = r2.intValue()
            if (r0 == r10) goto L88
            goto L2a
        L88:
            r2 = 0
            goto L2b
        L8a:
            r7 = 0
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C133765Mu.LJIIJJI(int, int):boolean");
    }

    @Override // X.InterfaceC153045zY
    public final boolean LLIILZL(String str, VEVideoEncodeSettings vEVideoEncodeSettings) {
        String str2;
        C5NP LIZLLL = C82891Wg3.LIZLLL();
        StringBuilder LIZLLL2 = C06540Nm.LIZLLL("ASNLEEditor compile：outFilePath: ", str, ", outWav: ", null, ", settings: ");
        LIZLLL2.append(vEVideoEncodeSettings);
        LIZLLL2.append(", enableUploadingWhileCompile: ");
        LIZLLL2.append(this.LJI);
        LIZLLL.LIZ(X1D.LIZIZ(LIZLLL2));
        if (str != null && !o.LJ(s.LJZI(str).toString(), "")) {
            if (C82891Wg3.LIZIZ()) {
                C133785Mw c133785Mw = this.LIZLLL;
                if (c133785Mw != null) {
                    C5N0 W8 = c133785Mw.W8();
                    StringBuilder LIZ = X1D.LIZ();
                    File externalFilesDir = C82891Wg3.LIZ().getExternalFilesDir(null);
                    if (externalFilesDir != null) {
                        str2 = externalFilesDir.getAbsolutePath();
                    } else {
                        str2 = null;
                    }
                    LIZ.append(str2);
                    LIZ.append("/nle_compile_dump");
                    W8.LJIILLIIL(X1D.LIZIZ(LIZ));
                } else {
                    o.LJIJI("nleSession");
                    throw null;
                }
            }
            NLEVideoEncodeSettings LJJJJ = C87277YNd.LJJJJ(vEVideoEncodeSettings);
            NLEMediaJniJNI.NLEVideoEncodeSettings_enableUploadingWhileCompile_set(LJJJJ.LIZ, LJJJJ, this.LJI);
            C133785Mw c133785Mw2 = this.LIZLLL;
            if (c133785Mw2 != null) {
                return c133785Mw2.W8().LJ(str, LJJJJ);
            }
            o.LJIJI("nleSession");
            throw null;
        }
        throw new Exception("outFilePath is invalid");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [X.5NY] */
    @Override // X.InterfaceC153045zY
    public final int LLIL(int i, final InterfaceC133855Nd interfaceC133855Nd) {
        C133785Mw c133785Mw = this.LIZLLL;
        if (c133785Mw != null) {
            return c133785Mw.Y8().LJ(i, new InterfaceC133885Ng() { // from class: X.5NY
                @Override // X.InterfaceC133885Ng
                public final void onProgress(float f) {
                    InterfaceC133855Nd interfaceC133855Nd2 = InterfaceC133855Nd.this;
                    if (interfaceC133855Nd2 != null) {
                        interfaceC133855Nd2.onProgress(f);
                    }
                }
            });
        }
        o.LJIJI("nleSession");
        throw null;
    }

    @Override // X.InterfaceC153045zY
    public final int LLILLL(String str, String str2) {
        C133785Mw c133785Mw = this.LIZLLL;
        if (c133785Mw != null) {
            return c133785Mw.P8().LJ(str, str2);
        }
        o.LJIJI("nleSession");
        throw null;
    }

    @Override // X.InterfaceC153045zY
    public final int LLIZ(int i, VEEditor.SET_RANGE_MODE mode) {
        o.LJIIIZ(mode, "mode");
        C133665Mk c133665Mk = this.LIZJ;
        C133785Mw c133785Mw = this.LIZLLL;
        if (c133785Mw != null) {
            return C5ML.LIZLLL(c133665Mk, c133785Mw, 0, i, mode);
        }
        o.LJIJI("nleSession");
        throw null;
    }

    @Override // X.InterfaceC153045zY
    public final void LLJ(int i, int i2) {
        C133785Mw c133785Mw = this.LIZLLL;
        if (c133785Mw != null) {
            c133785Mw.P8().LJJI(i, i2);
        } else {
            o.LJIJI("nleSession");
            throw null;
        }
    }

    @Override // X.InterfaceC153045zY
    public final void LLJIJIL(int i, int i2) {
        if (LJIIJJI(i, i2)) {
            LIZIZ();
        }
    }

    @Override // X.InterfaceC153045zY
    public final VESize LLJJIII(int i, int i2) {
        C133785Mw c133785Mw = this.LIZLLL;
        if (c133785Mw != null) {
            PairIntInt LJIIJJI = c133785Mw.P8().LJIIJJI(i, i2);
            return new VESize(LJIIJJI.LIZ(), LJIIJJI.LIZIZ());
        }
        o.LJIJI("nleSession");
        throw null;
    }

    @Override // X.InterfaceC153045zY
    public final int LLJJIJIIJIL(int i, ROTATE_DEGREE degree) {
        o.LJIIIZ(degree, "degree");
        LJIILJJIL();
        return -1;
    }

    @Override // X.InterfaceC153045zY
    public final int LLJJJIL(int i, VEEditor.SEEK_MODE flags) {
        o.LJIIIZ(flags, "flags");
        LJ().removeMessages(100);
        LJ().sendEmptyMessage(100);
        this.LJIIJ = i;
        EnumC133595Md LIZJ = C5ML.LIZJ(flags);
        C133785Mw c133785Mw = this.LIZLLL;
        if (c133785Mw != null) {
            return c133785Mw.V8().LJIJ(i * 1000, LIZJ);
        }
        o.LJIJI("nleSession");
        throw null;
    }

    @Override // X.InterfaceC153045zY
    public final int LLJLILLLLZIIL(int i, int i2) {
        NLETrack nLETrack;
        boolean z;
        NLETrack nLETrack2;
        boolean z2;
        NLETrack nLETrack3;
        boolean z3;
        String str;
        long j;
        C133665Mk nleEditor = this.LIZJ;
        o.LJIIIZ(nleEditor, "nleEditor");
        NLETrackSlot nLETrackSlot = new NLETrackSlot();
        NLEModel LJ = nleEditor.LJ();
        o.LJIIIIZZ(LJ, "nleEditor.model");
        VecNLETrackSPtr tracks = LJ.getTracks();
        o.LJIIIIZZ(tracks, "nleEditor.model.tracks");
        Iterator<NLETrack> it = tracks.iterator();
        while (true) {
            if (it.hasNext()) {
                nLETrack = it.next();
                NLETrack it2 = nLETrack;
                o.LJIIIIZZ(it2, "it");
                EnumC123864ta LJIIZILJ = it2.LJIIZILJ();
                o.LJIIIIZZ(LJIIZILJ, "it.trackType");
                if (LJIIZILJ == EnumC123864ta.VIDEO) {
                    break;
                }
            } else {
                nLETrack = null;
                break;
            }
        }
        NLETrack nLETrack4 = nLETrack;
        if (nLETrack4 == null || i >= nLETrack4.LJIILL().size() || i < 0) {
            z = false;
        } else {
            NLETrackSlot targetSlot = nLETrack4.LJIILLIIL().get(i);
            o.LJIIIIZZ(targetSlot, "targetSlot");
            NLESegmentVideo LJJ = NLESegmentVideo.LJJ(targetSlot.LJI());
            if (LJJ != null) {
                NLESegmentVideo nLESegmentVideo = new NLESegmentVideo();
                NLEResourceAV nLEResourceAV = new NLEResourceAV();
                NLEResourceAV LJ2 = LJJ.LJ();
                if (LJ2 == null || (str = LJ2.LIZJ()) == null) {
                    str = "";
                }
                nLEResourceAV.LJIIIZ(str);
                NLEResourceAV LJ3 = LJJ.LJ();
                if (LJ3 != null) {
                    j = LJ3.getDuration();
                } else {
                    j = 0;
                }
                nLEResourceAV.setDuration(j);
                NLEResourceAV LJ4 = LJJ.LJ();
                o.LJIIIIZZ(LJ4, "oldVideoSegment.avFile");
                nLEResourceAV.LJIILIIL(LJ4.LJFF());
                NLEResourceAV LJ5 = LJJ.LJ();
                o.LJIIIIZZ(LJ5, "oldVideoSegment.avFile");
                nLEResourceAV.LJIJI(LJ5.LJIIZILJ());
                nLESegmentVideo.LJIILL(nLEResourceAV);
                nLESegmentVideo.LJIJJLI(LJJ.LJIILIIL());
                nLESegmentVideo.LJIJJ(LJJ.LJIIL());
                nLESegmentVideo.setSpeed(LJJ.getSpeed());
                nLESegmentVideo.LJIL(LJJ.LJIILJJIL());
                nLETrackSlot.LJIIL(nLESegmentVideo);
            }
            nLETrack4.LJIJJLI(targetSlot);
            z = true;
        }
        NLEModel LJ6 = nleEditor.LJ();
        o.LJIIIIZZ(LJ6, "nleEditor.model");
        VecNLETrackSPtr tracks2 = LJ6.getTracks();
        o.LJIIIIZZ(tracks2, "nleEditor.model.tracks");
        Iterator<NLETrack> it3 = tracks2.iterator();
        while (true) {
            if (it3.hasNext()) {
                nLETrack2 = it3.next();
                NLETrack it4 = nLETrack2;
                o.LJIIIIZZ(it4, "it");
                EnumC123864ta LJIIZILJ2 = it4.LJIIZILJ();
                o.LJIIIIZZ(LJIIZILJ2, "it.trackType");
                if (LJIIZILJ2 == EnumC123864ta.VIDEO) {
                    break;
                }
            } else {
                nLETrack2 = null;
                break;
            }
        }
        NLETrack nLETrack5 = nLETrack2;
        if (nLETrack5 != null) {
            nLETrack5.LIZLLL(nLETrackSlot, i2);
            z2 = true;
        } else {
            z2 = false;
        }
        NLEModel LJ7 = nleEditor.LJ();
        o.LJIIIIZZ(LJ7, "nleEditor.model");
        VecNLETrackSPtr tracks3 = LJ7.getTracks();
        o.LJIIIIZZ(tracks3, "nleEditor.model.tracks");
        Iterator<NLETrack> it5 = tracks3.iterator();
        while (true) {
            if (it5.hasNext()) {
                nLETrack3 = it5.next();
                NLETrack it6 = nLETrack3;
                o.LJIIIIZZ(it6, "it");
                EnumC123864ta LJIIZILJ3 = it6.LJIIZILJ();
                o.LJIIIIZZ(LJIIZILJ3, "it.trackType");
                if (LJIIZILJ3 == EnumC123864ta.VIDEO) {
                    break;
                }
            } else {
                nLETrack3 = null;
                break;
            }
        }
        NLETrack nLETrack6 = nLETrack3;
        if (nLETrack6 != null) {
            VecNLETrackSlotSPtr LJIILLIIL = nLETrack6.LJIILLIIL();
            if (i <= i2) {
                while (true) {
                    NLETrackSlot nLETrackSlot2 = (NLETrackSlot) ORZ.LJLLLLLL(i, LJIILLIIL);
                    if (nLETrackSlot2 != null) {
                        Iterator<NLEVideoAnimation> it7 = nLETrackSlot2.LJIIIZ().iterator();
                        while (it7.hasNext()) {
                            NLEVideoAnimation videoAnim = it7.next();
                            o.LJIIIIZZ(videoAnim, "videoAnim");
                            NLESegmentVideoAnimation LIZIZ = videoAnim.LIZIZ();
                            long NLESegmentImageVideoAnimation_dynamicCast = NLEEditorJniJNI.NLESegmentImageVideoAnimation_dynamicCast(NLENode.getCPtr(LIZIZ), LIZIZ);
                            if (NLESegmentImageVideoAnimation_dynamicCast != 0) {
                                new NLESegmentImageVideoAnimation(NLESegmentImageVideoAnimation_dynamicCast);
                                videoAnim.setStartTime(nLETrackSlot2.getStartTime());
                                videoAnim.setEndTime(nLETrackSlot2.getEndTime());
                            }
                        }
                    }
                    if (i == i2) {
                        break;
                    }
                    i++;
                }
            }
            z3 = true;
        } else {
            z3 = false;
        }
        nleEditor.LIZIZ();
        if (z && z2 && z3) {
            return 0;
        }
        return -1;
    }

    @Override // X.InterfaceC153045zY
    public final int LLLFZ(int i, int i2) {
        C133665Mk c133665Mk = this.LIZJ;
        C133785Mw c133785Mw = this.LIZLLL;
        if (c133785Mw != null) {
            return C5ML.LIZLLL(c133665Mk, c133785Mw, i, i2, VEEditor.SET_RANGE_MODE.EDITOR_TIMERANGE_FLAG_BEFORE_SPEED);
        }
        o.LJIJI("nleSession");
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x026b, code lost:
    
        if (r13 != null) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0281, code lost:
    
        if (r13 != null) goto L102;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:129:0x02f8 A[EDGE_INSN: B:129:0x02f8->B:130:0x02f8 BREAK  A[LOOP:3: B:97:0x0211->B:124:0x02b3], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0305  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0424  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0438  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x05a9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:279:0x05d2  */
    /* JADX WARN: Removed duplicated region for block: B:385:0x07c0  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0221  */
    @Override // X.InterfaceC153045zY
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int LLLI(boolean[] r42, X.C5RU r43) {
        /*
            Method dump skipped, instructions count: 1992
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C133765Mu.LLLI(boolean[], X.5RU):int");
    }

    @Override // X.InterfaceC153045zY
    public final int addInfoSticker(String path, String[] strArr) {
        o.LJIIIZ(path, "path");
        LJIILJJIL();
        return -1;
    }

    @Override // X.InterfaceC153045zY
    public final int getSrtInfoStickerInitPosition(int i, float[] fArr) {
        LJIILJJIL();
        return -1;
    }

    @Override // X.InterfaceC153045zY
    public final int setInfoStickerAlpha(int i, float f) {
        LJIILJJIL();
        return -1;
    }

    @Override // X.InterfaceC153045zY
    public final int setInfoStickerLayer(int i, int i2) {
        LJIILJJIL();
        return -1;
    }

    @Override // X.InterfaceC153045zY
    public final int setInfoStickerRotation(int i, float f) {
        LJIILJJIL();
        return -1;
    }

    @Override // X.InterfaceC153045zY
    public final int setInfoStickerScale(int i, float f) {
        LJIILJJIL();
        return -1;
    }

    @Override // X.InterfaceC153045zY
    public final int updateTrackFilterParam(int i, VEBaseFilterParam param) {
        o.LJIIIZ(param, "param");
        LJIILJJIL();
        return -1;
    }

    @Override // X.InterfaceC153045zY
    public final int I7(int i, int i2, VEBaseFilterParam param) {
        o.LJIIIZ(param, "param");
        LJIILJJIL();
        return -1;
    }

    public final void LJIIIZ(int i, int i2, int i3) {
        C133785Mw c133785Mw = this.LIZLLL;
        if (c133785Mw != null) {
            c133785Mw.X8().LJIIJJI(i, i2, EnumC124224uA.swigToEnum(i3), EnumC123994tn.swigToEnum(0));
        } else {
            o.LJIJI("nleSession");
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [X.5NM] */
    @Override // X.InterfaceC153045zY
    public final int LLD(int i, int i2, final C6YZ c6yz) {
        this.LJIIJ = i;
        C133785Mw c133785Mw = this.LIZLLL;
        if (c133785Mw != null) {
            return c133785Mw.V8().LJIJI(i * 1000, i2, new C5JY() { // from class: X.5NM
                @Override // X.C5JY
                public final int LIZ(byte[] bArr, int i3, int i4, int i5, float f) {
                    return c6yz.LIZ(bArr, i3, i4, i5, f);
                }
            });
        }
        o.LJIJI("nleSession");
        throw null;
    }

    @Override // X.InterfaceC153045zY
    public final int LLIIIZ(VETimelineParams sceneTime, int i, int i2) {
        o.LJIIIZ(sceneTime, "sceneTime");
        C133665Mk nleEditor = this.LIZJ;
        if (this.LIZLLL != null) {
            o.LJIIIZ(nleEditor, "nleEditor");
            int LIZIZ = C123454sv.LIZIZ(nleEditor, sceneTime);
            LLLFZ(i, i2);
            return LIZIZ;
        }
        o.LJIJI("nleSession");
        throw null;
    }

    @Override // X.InterfaceC153045zY
    public final int LLJJJJJIL(int i, VEEditor.SEEK_MODE flags, final InterfaceC133865Ne interfaceC133865Ne) {
        o.LJIIIZ(flags, "flags");
        this.LJIIJ = i;
        C133785Mw c133785Mw = this.LIZLLL;
        if (c133785Mw != null) {
            return c133785Mw.V8().LJJJI(i * 1000, C5ML.LIZJ(flags), new AnonymousClass519() { // from class: X.5Na
                @Override // X.AnonymousClass519
                public final void LIZ(int i2) {
                    InterfaceC133865Ne interfaceC133865Ne2 = InterfaceC133865Ne.this;
                    if (interfaceC133865Ne2 != null) {
                        interfaceC133865Ne2.LIZ(i2);
                    }
                }
            });
        }
        o.LJIJI("nleSession");
        throw null;
    }

    @Override // X.InterfaceC153045zY
    public final int LLJLLIL(int i, ArrayList arrayList, ArrayList arrayList2) {
        NLETrack nLETrack;
        EnumC123874tb enumC123874tb;
        boolean z;
        C133665Mk nleEditor = this.LIZJ;
        o.LJIIIZ(nleEditor, "nleEditor");
        NLEModel LJ = nleEditor.LJ();
        o.LJIIIIZZ(LJ, "nleEditor.model");
        VecNLETrackSPtr tracks = LJ.getTracks();
        o.LJIIIIZZ(tracks, "nleEditor.model.tracks");
        Iterator<NLETrack> it = tracks.iterator();
        while (true) {
            if (it.hasNext()) {
                nLETrack = it.next();
                NLETrack it2 = nLETrack;
                o.LJIIIIZZ(it2, "it");
                if (it2.LJIIZILJ() == EnumC123864ta.VIDEO && it2.LJIIJ() && it2.getEnable()) {
                    break;
                }
            } else {
                nLETrack = null;
                break;
            }
        }
        NLETrack nLETrack2 = nLETrack;
        if (nLETrack2 != null) {
            Iterator it3 = arrayList.iterator();
            int i2 = 0;
            while (it3.hasNext()) {
                Object next = it3.next();
                int i3 = i2 + 1;
                if (i2 >= 0) {
                    VEClipSourceParam vEClipSourceParam = (VEClipSourceParam) next;
                    NLETrackSlot nLETrackSlot = new NLETrackSlot();
                    NLESegmentVideo nLESegmentVideo = new NLESegmentVideo();
                    NLEResourceAV nLEResourceAV = new NLEResourceAV();
                    nLEResourceAV.LJIIIZ(vEClipSourceParam.clipFilePath);
                    if (C44687HgJ.LJIIJJI(vEClipSourceParam.clipFilePath)) {
                        enumC123874tb = EnumC123874tb.IMAGE;
                    } else {
                        enumC123874tb = EnumC123874tb.VIDEO;
                    }
                    nLEResourceAV.LJIILIIL(enumC123874tb);
                    nLEResourceAV.LJIILJJIL(vEClipSourceParam.clipWidth);
                    nLEResourceAV.LJIIIIZZ(vEClipSourceParam.clipHeight);
                    if (nLEResourceAV.LJFF() == EnumC123874tb.VIDEO) {
                        o.LJIIIIZZ(VEUtils.getAudioFileInfoForAllTracks(vEClipSourceParam.clipFilePath), "VEUtils.getAudioFileInfo…SourceParam.clipFilePath)");
                        if (!r1.isEmpty()) {
                            z = true;
                            nLEResourceAV.LJIJI(z);
                            nLESegmentVideo.LJIILL(nLEResourceAV);
                            nLESegmentVideo.LJIJJLI(((VEClipTimelineParam) ListProtector.get(arrayList2, i2)).trimIn * 1000);
                            nLESegmentVideo.LJIJJ(((VEClipTimelineParam) ListProtector.get(arrayList2, i2)).trimOut * 1000);
                            nLESegmentVideo.setSpeed((float) ((VEClipTimelineParam) ListProtector.get(arrayList2, i2)).speed);
                            nLETrackSlot.LJIIL(nLESegmentVideo);
                            nLETrack2.LIZLLL(nLETrackSlot, i);
                            i++;
                            i2 = i3;
                        }
                    }
                    z = false;
                    nLEResourceAV.LJIJI(z);
                    nLESegmentVideo.LJIILL(nLEResourceAV);
                    nLESegmentVideo.LJIJJLI(((VEClipTimelineParam) ListProtector.get(arrayList2, i2)).trimIn * 1000);
                    nLESegmentVideo.LJIJJ(((VEClipTimelineParam) ListProtector.get(arrayList2, i2)).trimOut * 1000);
                    nLESegmentVideo.setSpeed((float) ((VEClipTimelineParam) ListProtector.get(arrayList2, i2)).speed);
                    nLETrackSlot.LJIIL(nLESegmentVideo);
                    nLETrack2.LIZLLL(nLETrackSlot, i);
                    i++;
                    i2 = i3;
                } else {
                    C47261Igj.LJJJJJ();
                    throw null;
                }
            }
            nleEditor.LIZIZ();
            return 0;
        }
        return -1;
    }

    @Override // X.InterfaceC153045zY
    public final int LLLIIII(VEImageTransformFilterParam vEImageTransformFilterParam, int i, int i2) {
        LJIILJJIL();
        return -1;
    }

    @Override // X.InterfaceC153045zY
    public final int setInfoStickerPosition(int i, float f, float f2) {
        LJIILJJIL();
        return -1;
    }

    @Override // X.InterfaceC153045zY
    public final int setInfoStickerTime(int i, int i2, int i3) {
        LJIILJJIL();
        return -1;
    }

    @Override // X.InterfaceC153045zY
    public final void LIZ(int i, int i2, int i3, int i4) {
        this.LJIIIIZZ.set(i, i2, i3, i4);
        C133785Mw c133785Mw = this.LIZLLL;
        if (c133785Mw != null) {
            c133785Mw.P8().LJIJJ(i, i2, i3, i4);
        } else {
            o.LJIJI("nleSession");
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.5Nn, X.5Nm] */
    @Override // X.InterfaceC153045zY
    public final boolean LLF(String str, String str2, VEVideoEncodeSettings settings, final InterfaceC134045Nw interfaceC134045Nw) {
        String str3;
        o.LJIIIZ(settings, "settings");
        ?? r2 = new InterfaceC133955Nn() { // from class: X.5Nm
            @Override // X.InterfaceC133955Nn
            public final void onCompileDone() {
                InterfaceC134045Nw interfaceC134045Nw2 = InterfaceC134045Nw.this;
                if (interfaceC134045Nw2 != null) {
                    interfaceC134045Nw2.onCompileDone();
                }
            }

            @Override // X.InterfaceC133955Nn
            public final void onCompileProgress(float f) {
                InterfaceC134045Nw interfaceC134045Nw2 = InterfaceC134045Nw.this;
                if (interfaceC134045Nw2 != null) {
                    interfaceC134045Nw2.onCompileProgress(f);
                }
            }

            @Override // X.InterfaceC133955Nn
            public final void onCompileError(int i, int i2, float f, String str4) {
                InterfaceC134045Nw interfaceC134045Nw2 = InterfaceC134045Nw.this;
                if (interfaceC134045Nw2 != null) {
                    interfaceC134045Nw2.onCompileError(i, i2, f, str4);
                }
            }
        };
        if (C82891Wg3.LIZIZ()) {
            C133785Mw c133785Mw = this.LIZLLL;
            if (c133785Mw != null) {
                C5N0 W8 = c133785Mw.W8();
                StringBuilder LIZ = X1D.LIZ();
                File externalFilesDir = C82891Wg3.LIZ().getExternalFilesDir(null);
                if (externalFilesDir != null) {
                    str3 = externalFilesDir.getAbsolutePath();
                } else {
                    str3 = null;
                }
                LIZ.append(str3);
                LIZ.append("/nle_compile_dump");
                W8.LJIILLIIL(X1D.LIZIZ(LIZ));
            } else {
                o.LJIJI("nleSession");
                throw null;
            }
        }
        NLEVideoEncodeSettings LJJJJ = C87277YNd.LJJJJ(settings);
        NLEMediaJniJNI.NLEVideoEncodeSettings_enableUploadingWhileCompile_set(LJJJJ.LIZ, LJJJJ, this.LJI);
        if (str2 == null || o.LJ(s.LJZI(str2).toString(), "")) {
            C133785Mw c133785Mw2 = this.LIZLLL;
            if (c133785Mw2 != null) {
                return c133785Mw2.W8().LJFF(str, LJJJJ, r2);
            }
            o.LJIJI("nleSession");
            throw null;
        }
        C133785Mw c133785Mw3 = this.LIZLLL;
        if (c133785Mw3 != null) {
            return c133785Mw3.W8().LJI(str, str2, LJJJJ, r2);
        }
        o.LJIJI("nleSession");
        throw null;
    }

    @Override // X.InterfaceC153045zY
    public final int LLIIL(String str, int i, int i2, int i3) {
        LJIILJJIL();
        return -1;
    }

    @Override // X.InterfaceC153045zY
    public final String LLILLIZIL(int i, int i2, int i3, String str) {
        C133785Mw c133785Mw = this.LIZLLL;
        if (c133785Mw != null) {
            return c133785Mw.P8().LJIIIIZZ(String.valueOf(i3), str);
        }
        o.LJIJI("nleSession");
        throw null;
    }

    /* JADX WARN: Type inference failed for: r0v15, types: [X.5NC] */
    /* JADX WARN: Type inference failed for: r0v17, types: [X.5ND] */
    /* JADX WARN: Type inference failed for: r0v19, types: [X.5NE] */
    /* JADX WARN: Type inference failed for: r5v0, types: [X.5Mk, com.bytedance.ies.nle.editor_jni.NLEEditor] */
    public C133765Mu(String workSpace, SurfaceView surfaceView, R3A r3a, VEUserConfig vEUserConfig, int i) {
        VEUserConfig.VEUserConfigItem<?>[] configItems;
        surfaceView = (i & 2) != 0 ? null : surfaceView;
        r3a = (i & 4) != 0 ? null : r3a;
        vEUserConfig = (i & 16) != 0 ? null : vEUserConfig;
        o.LJIIIZ(workSpace, "workSpace");
        C5K0.LIZIZ();
        com.bytedance.ies.nleeditor.NLE nle = com.bytedance.ies.nleeditor.NLE.INSTANCE;
        nle.setLogger(new NLELoggerListener() { // from class: X.5N6
            @Override // com.bytedance.ies.nle.editor_jni.NLELoggerListener
            public final void onLog(LogLevel logLevel, String str) {
                int i2;
                if (logLevel == null || (i2 = C134055Nx.LIZ[logLevel.ordinal()]) == 1) {
                    return;
                }
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 != 4) {
                            if (i2 != 5) {
                                return;
                            }
                            C5NP LIZLLL = C82891Wg3.LIZLLL();
                            StringBuilder LIZ = X1D.LIZ();
                            LIZ.append("NLE ");
                            LIZ.append(str);
                            LIZLLL.LIZ(X1D.LIZIZ(LIZ));
                            return;
                        }
                        C5NP LIZLLL2 = C82891Wg3.LIZLLL();
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append("NLE ");
                        LIZ2.append(str);
                        LIZLLL2.w(X1D.LIZIZ(LIZ2));
                        return;
                    }
                    C5NP LIZLLL3 = C82891Wg3.LIZLLL();
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append("NLE ");
                    LIZ3.append(str);
                    LIZLLL3.i(X1D.LIZIZ(LIZ3));
                    return;
                }
                C5NP LIZLLL4 = C82891Wg3.LIZLLL();
                StringBuilder LIZ4 = X1D.LIZ();
                LIZ4.append("NLE ");
                LIZ4.append(str);
                LIZLLL4.d(X1D.LIZIZ(LIZ4));
            }
        });
        nle.setLogLevel(LogLevel.LEVEL_DEBUG);
        ?? r5 = new NLEEditor() { // from class: X.5Mk
            @Override // com.bytedance.ies.nle.editor_jni.NLEEditor
            public final boolean LIZIZ() {
                InterfaceC88472Yns<? super NLEModel, C76800UCe> interfaceC88472Yns = C5MK.LJIIIZ;
                if (interfaceC88472Yns != null) {
                    interfaceC88472Yns.invoke(C133765Mu.this.LJFF());
                }
                Throwable th = C133765Mu.this.LJ;
                if (th == null) {
                    return super.LIZIZ();
                }
                throw th;
            }
        };
        this.LIZJ = r5;
        this.LJFF = new C5NW(new AqS152S0100000_2(this, 637));
        this.LJII = C221108m2.LIZIZ(new AqS152S0100000_2(this, 639));
        this.LJIIIIZZ = new Rect();
        this.LJIIIZ = new ArrayList();
        this.LJIIJ = -1;
        this.LJIIJJI = C221108m2.LIZIZ(new AqS152S0100000_2(this, 638));
        this.LJIIL = new CopyOnWriteArrayList<>();
        this.LJIILIIL = new InterfaceC132775Iz() { // from class: X.5NC
            @Override // X.InterfaceC132775Iz
            public final void LIZ() {
                C133765Mu.this.getClass();
                Iterator<InterfaceC134025Nu> it = C133765Mu.this.LJIIL.iterator();
                while (it.hasNext()) {
                    it.next().LIZ();
                }
            }
        };
        this.LJIILJJIL = new CopyOnWriteArrayList<>();
        this.LJIILL = new C5JL() { // from class: X.5ND
            @Override // X.C5JL
            public final void LIZ(int i2, int i22, float f, String str) {
                Iterator<InterfaceC133905Ni> it = C133765Mu.this.LJIILJJIL.iterator();
                while (it.hasNext()) {
                    it.next().LIZ(i2, i22, f, str);
                }
            }
        };
        this.LJIILLIIL = new CopyOnWriteArrayList<>();
        this.LJIIZILJ = new C5JL() { // from class: X.5NE
            @Override // X.C5JL
            public final void LIZ(int i2, int i22, float f, String str) {
                Iterator<InterfaceC133905Ni> it = C133765Mu.this.LJIILLIIL.iterator();
                while (it.hasNext()) {
                    it.next().LIZ(i2, i22, f, str);
                }
            }
        };
        this.LJIJ = new CopyOnWriteArrayList<>();
        this.LIZ = workSpace;
        this.LIZIZ = r3a;
        NLEMediaConfig LIZIZ = C5ML.LIZIZ(workSpace);
        if (vEUserConfig != null && (configItems = vEUserConfig.getConfigItems()) != null) {
            for (VEUserConfig.VEUserConfigItem<?> veUserConfigItem : configItems) {
                o.LJIIIIZZ(veUserConfigItem, "veUserConfigItem");
                Object value = veUserConfigItem.getValue();
                if (value instanceof Boolean) {
                    long NLEMediaConfig_nleVEUserConfig_get = NLEMediaJniJNI.NLEMediaConfig_nleVEUserConfig_get(LIZIZ.LIZ, LIZIZ);
                    if (NLEMediaConfig_nleVEUserConfig_get != 0) {
                        NLEVEUserConfig nLEVEUserConfig = new NLEVEUserConfig(NLEMediaConfig_nleVEUserConfig_get);
                        NLEMediaJniJNI.NLEVEUserConfig_addConfig__SWIG_1(nLEVEUserConfig.LIZ, nLEVEUserConfig, veUserConfigItem.id.value(), ((Boolean) value).booleanValue());
                    }
                } else if (value instanceof Integer) {
                    long NLEMediaConfig_nleVEUserConfig_get2 = NLEMediaJniJNI.NLEMediaConfig_nleVEUserConfig_get(LIZIZ.LIZ, LIZIZ);
                    if (NLEMediaConfig_nleVEUserConfig_get2 != 0) {
                        NLEVEUserConfig nLEVEUserConfig2 = new NLEVEUserConfig(NLEMediaConfig_nleVEUserConfig_get2);
                        NLEMediaJniJNI.NLEVEUserConfig_addConfig__SWIG_0(nLEVEUserConfig2.LIZ, nLEVEUserConfig2, veUserConfigItem.id.value(), ((Number) value).intValue());
                    }
                }
            }
        }
        C133785Mw.LJFF.getClass();
        C133785Mw LIZ = C133035Jz.LIZ(LIZIZ, surfaceView, r5);
        this.LIZLLL = LIZ;
        addConsumer(new NLEEditorListener() { // from class: X.5Mm
            @Override // com.bytedance.ies.nle.editor_jni.NLEEditorListener
            public final void onChanged() {
                try {
                    C133765Mu c133765Mu = C133765Mu.this;
                    C133785Mw c133785Mw = c133765Mu.LIZLLL;
                    if (c133785Mw != null) {
                        c133785Mw.R8(c133765Mu.LJFF());
                    } else {
                        o.LJIJI("nleSession");
                        throw null;
                    }
                } catch (Throwable th) {
                    NLELoggerListener logger = com.bytedance.ies.nleeditor.NLE.INSTANCE.getLogger();
                    if (logger != null) {
                        LogLevel logLevel = LogLevel.LEVEL_DEBUG;
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append("NLEEditor callback: ");
                        LIZ2.append(th);
                        logger.onLog(logLevel, X1D.LIZIZ(LIZ2));
                    }
                    C133765Mu.this.LJ = th;
                }
            }
        });
        NLEDropFrameParams nLEDropFrameParams = C5MK.LJ;
        if (nLEDropFrameParams.isSetParams()) {
            LIZ.X8().LJIIJ(nLEDropFrameParams.getMaxDropCount(), nLEDropFrameParams.getDelayTime());
        }
    }

    @Override // X.InterfaceC153045zY
    public final void LLJJIJI(float f, float f2, float f3, int i, int i2) {
        C133785Mw c133785Mw = this.LIZLLL;
        if (c133785Mw != null) {
            c133785Mw.P8().LJIJJLI(f, f2, f3, i, i2);
        } else {
            o.LJIJI("nleSession");
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0, types: [X.5NJ] */
    @Override // X.InterfaceC153045zY
    public final int LLLII(int[] timeStamps, int i, int i2, VEEditor.GET_FRAMES_FLAGS flags, final InterfaceC134015Nt interfaceC134015Nt) {
        C5NA c5na;
        o.LJIIIZ(timeStamps, "timeStamps");
        o.LJIIIZ(flags, "flags");
        C133785Mw c133785Mw = this.LIZLLL;
        if (c133785Mw != null) {
            C133775Mv P8 = c133785Mw.P8();
            ArrayList arrayList = new ArrayList(timeStamps.length);
            for (int i3 : timeStamps) {
                arrayList.add(Long.valueOf(i3 * 1000));
            }
            VecLongLong vecLongLong = new VecLongLong();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                vecLongLong.LIZJ(Long.valueOf(((Long) it.next()).longValue()));
            }
            int i4 = C87279YNf.LJIIIZ[flags.ordinal()];
            if (i4 != 1) {
                if (i4 == 2) {
                    c5na = C5NA.NLE_GET_FRAMES_MODE_NOEFFECT;
                } else {
                    throw new Exception("NLE not support this flag");
                }
            } else {
                c5na = C5NA.NLE_GET_FRAMES_MODE_NORMAL;
            }
            return P8.LJIIIZ(vecLongLong, i, i2, c5na, new C5JY() { // from class: X.5NJ
                @Override // X.C5JY
                public final int LIZ(byte[] bArr, int i5, int i6, int i7, float f) {
                    return InterfaceC134015Nt.this.LIZ(bArr, i5, i6, i7, f);
                }
            });
        }
        o.LJIJI("nleSession");
        throw null;
    }

    @Override // X.InterfaceC153045zY
    public final int addImageSticker(String path, float f, float f2, float f3, float f4) {
        o.LJIIIZ(path, "path");
        LJIILJJIL();
        return -1;
    }
}
