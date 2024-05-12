package X;

import Y.ARunnableS38S0100000_2;
import android.os.Looper;
import com.bytedance.ies.nle.editor_jni.LogLevel;
import com.bytedance.ies.nle.editor_jni.NLEAlgorithmCallbackWrapper;
import com.bytedance.ies.nle.editor_jni.NLEAlgorithmController;
import com.bytedance.ies.nle.editor_jni.NLEAlgorithmPath;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEError;
import com.bytedance.ies.nle.editor_jni.NLELoggerListener;
import com.bytedance.ies.nle.editor_jni.NLEMediaPublicJniJNI;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLEResourceAV;
import com.bytedance.ies.nle.editor_jni.NLESegmentAudio;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLEClipAlgorithmParam;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import kotlin.jvm.internal.o;

/* renamed from: X.5Mx, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C133795Mx extends C5N3 {
    public C5NT LJ;
    public NLEEditor LJFF;

    public final NLEAlgorithmController LJIIJ() {
        C5N2 c5n2 = this.LIZLLL;
        if (c5n2.LJIILIIL == null || c5n2.LIZJ.get()) {
            return null;
        }
        return (NLEAlgorithmController) c5n2.LJIIIIZZ.getValue();
    }

    public final int LJIILIIL() {
        NLELoggerListener logger = com.bytedance.ies.nleeditor.NLE.INSTANCE.getLogger();
        if (logger != null) {
            logger.onLog(LogLevel.LEVEL_DEBUG, "NLEVEPublic2: removeAllVideoSound");
        }
        return LJIILJJIL();
    }

    public final int LJIILJJIL() {
        NLEModel LJ;
        NLEEditor nLEEditor = this.LJFF;
        if (nLEEditor == null || (LJ = nLEEditor.LJ()) == null) {
            NLELoggerListener logger = com.bytedance.ies.nleeditor.NLE.INSTANCE.getLogger();
            if (logger != null) {
                logger.onLog(LogLevel.LEVEL_ERROR, "NLEVEPublic2: removeAllVideoSound error, model is null");
            }
            return NLEError.FAILED.swigValue();
        }
        NLETrack mainTrack = LJ.getMainTrack(true);
        if (mainTrack != null) {
            Iterator<NLETrackSlot> it = mainTrack.LJIILLIIL().iterator();
            while (it.hasNext()) {
                NLETrackSlot it2 = it.next();
                o.LJIIIIZZ(it2, "it");
                NLESegmentVideo LJJ = NLESegmentVideo.LJJ(it2.LJI());
                if (LJJ != null) {
                    LJJ.LJJIIJZLJL(false);
                }
            }
            NLEEditor nLEEditor2 = this.LJFF;
            if (nLEEditor2 != null) {
                nLEEditor2.LIZIZ();
            }
        }
        return 0;
    }

    public final int LJIILLIIL() {
        NLEModel LJ;
        com.bytedance.ies.nleeditor.NLE nle = com.bytedance.ies.nleeditor.NLE.INSTANCE;
        NLELoggerListener logger = nle.getLogger();
        if (logger != null) {
            logger.onLog(LogLevel.LEVEL_DEBUG, "NLEVEPublic2: restoreAllVideoSound");
        }
        NLEEditor nLEEditor = this.LJFF;
        if (nLEEditor == null || (LJ = nLEEditor.LJ()) == null) {
            NLELoggerListener logger2 = nle.getLogger();
            if (logger2 != null) {
                logger2.onLog(LogLevel.LEVEL_ERROR, "NLEVEPublic2: restoreAllVideoSound error, model is null");
            }
            return NLEError.FAILED.swigValue();
        }
        NLETrack mainTrack = LJ.getMainTrack(true);
        if (mainTrack != null) {
            Iterator<NLETrackSlot> it = mainTrack.LJIILLIIL().iterator();
            while (it.hasNext()) {
                NLETrackSlot it2 = it.next();
                o.LJIIIIZZ(it2, "it");
                NLESegmentVideo LJJ = NLESegmentVideo.LJJ(it2.LJI());
                if (LJJ != null) {
                    LJJ.LJJIIJZLJL(true);
                }
            }
            NLEEditor nLEEditor2 = this.LJFF;
            if (nLEEditor2 != null) {
                nLEEditor2.LIZIZ();
                return 0;
            }
            return 0;
        }
        return 0;
    }

    public final int LJIJI() {
        com.bytedance.ies.nleeditor.NLE nle = com.bytedance.ies.nleeditor.NLE.INSTANCE;
        NLELoggerListener logger = nle.getLogger();
        if (logger != null) {
            logger.onLog(LogLevel.LEVEL_DEBUG, "NLEVEPublic2: updateAlgorithmFromNormal");
        }
        long currentTimeMillis = System.currentTimeMillis();
        NLEAlgorithmController LJIIJ = LJIIJ();
        if (LJIIJ != null) {
            NLEMediaPublicJniJNI.NLEAlgorithmController_reInitSmartAlgorithmIfPossible(LJIIJ.LIZ, LJIIJ);
        }
        int LJIILIIL = LJIILIIL();
        NLELoggerListener logger2 = nle.getLogger();
        if (logger2 != null) {
            LogLevel logLevel = LogLevel.LEVEL_DEBUG;
            StringBuilder LJ = C7MY.LJ("NLEVEPublic2: updateAlgorithmFromNormal, result: ", LJIILIIL, ", cost: ");
            LJ.append(System.currentTimeMillis() - currentTimeMillis);
            logger2.onLog(logLevel, X1D.LIZIZ(LJ));
        }
        return LJIILIIL;
    }

    public final int LJIIIIZZ() {
        NLEAlgorithmController LJIIJ = LJIIJ();
        if (LJIIJ != null) {
            return NLEMediaPublicJniJNI.NLEAlgorithmController_genRandomSolve(LJIIJ.LIZ, LJIIJ);
        }
        return -1;
    }

    public final int LJIIIZ() {
        NLEAlgorithmController LJIIJ = LJIIJ();
        if (LJIIJ != null) {
            return NLEMediaPublicJniJNI.NLEAlgorithmController_genSmartCutting(LJIIJ.LIZ, LJIIJ);
        }
        return -1;
    }

    public final VecNLEClipAlgorithmParam LJIIJJI() {
        NLEAlgorithmController LJIIJ = LJIIJ();
        if (LJIIJ != null) {
            return new VecNLEClipAlgorithmParam(NLEMediaPublicJniJNI.NLEAlgorithmController_getAllVideoRangeData(LJIIJ.LIZ, LJIIJ));
        }
        return new VecNLEClipAlgorithmParam();
    }

    public final int LJIIL() {
        NLEAlgorithmController LJIIJ = LJIIJ();
        if (LJIIJ != null) {
            NLEMediaPublicJniJNI.NLEAlgorithmController_reInitSmartAlgorithmIfPossible(LJIIJ.LIZ, LJIIJ);
        }
        return LJIILIIL();
    }

    public static List LJII(NLEModel nLEModel) {
        ArrayList arrayList = new ArrayList();
        VecNLETrackSPtr tracks = nLEModel.getTracks();
        if (tracks != null) {
            Iterator<NLETrack> it = tracks.iterator();
            while (it.hasNext()) {
                NLETrack it2 = it.next();
                o.LJIIIIZZ(it2, "it");
                if (it2.LJIIZILJ() == EnumC123864ta.AUDIO && it2.LJIILL().size() == 1 && (o.LJ(it2.getExtra("AudioTrackType"), "BGM") || o.LJ(it2.getExtra("AudioTrackType"), "REVERSE_AUDIO"))) {
                    arrayList.add(it2);
                }
            }
        }
        return arrayList;
    }

    public final int LJFF(int i) {
        NLEAlgorithmController LJIIJ = LJIIJ();
        if (LJIIJ != null) {
            return NLEMediaPublicJniJNI.NLEAlgorithmController_cancelGenVideoFrame(LJIIJ.LIZ, LJIIJ, i);
        }
        return -1;
    }

    public final int LJIILL(int i) {
        NLEEditor nLEEditor;
        NLEModel LJ;
        NLELoggerListener logger = com.bytedance.ies.nleeditor.NLE.INSTANCE.getLogger();
        if (logger != null) {
            LogLevel logLevel = LogLevel.LEVEL_DEBUG;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("NLEVEPublic2: removeMusic: ");
            LIZ.append(i);
            logger.onLog(logLevel, X1D.LIZIZ(LIZ));
        }
        if (i >= 0 && (nLEEditor = this.LJFF) != null && (LJ = nLEEditor.LJ()) != null) {
            Iterator it = ((ArrayList) LJII(LJ)).iterator();
            while (it.hasNext()) {
                LJ.removeTrack((NLETrack) it.next());
            }
        }
        return LJIILLIIL();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C133795Mx(C5N2 session, NLEEditor nLEEditor) {
        super(session);
        o.LJIIIZ(session, "session");
        this.LJFF = nLEEditor;
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [com.bytedance.ies.nle.editor_jni.NLEAlgorithmCallbackWrapper, X.5NT] */
    public final int LJ(int i, final C5NY c5ny) {
        NLEAlgorithmController LJIIJ = LJIIJ();
        if (LJIIJ != null) {
            ?? r6 = new NLEAlgorithmCallbackWrapper() { // from class: X.5NT
                @Override // com.bytedance.ies.nle.editor_jni.NLEAlgorithmCallbackWrapper
                public final void onProgress(float f) {
                    InterfaceC133885Ng interfaceC133885Ng = c5ny;
                    if (interfaceC133885Ng != null) {
                        interfaceC133885Ng.onProgress(f);
                    }
                }
            };
            this.LJ = r6;
            return NLEMediaPublicJniJNI.NLEAlgorithmController_beginGenVideoFrames(LJIIJ.LIZ, LJIIJ, i, NLEAlgorithmCallbackWrapper.getCPtr(r6), r6);
        }
        return -1;
    }

    public static NLESegmentAudio LJI(int i, int i2, String str) {
        NLESegmentAudio nLESegmentAudio = new NLESegmentAudio();
        nLESegmentAudio.LJIJJLI(C78926UyI.LJJJ(i));
        nLESegmentAudio.LJIJJ(C78926UyI.LJJJ(i2));
        NLEResourceAV nLEResourceAV = new NLEResourceAV();
        if (str == null) {
            str = "";
        }
        nLEResourceAV.LJIIIZ(str);
        nLEResourceAV.LJIILIIL(EnumC123874tb.ALGORITHM_AUDIO);
        nLEResourceAV.setDuration(nLESegmentAudio.LJIIL() - nLESegmentAudio.LJIILIIL());
        nLESegmentAudio.LJIILL(nLEResourceAV);
        return nLESegmentAudio;
    }

    public final int LJIIZILJ(String str, int i, int i2, NLEAlgorithmPath nLEAlgorithmPath) {
        long currentTimeMillis = System.currentTimeMillis();
        C76732zl c76732zl = new C76732zl();
        c76732zl.element = -1;
        if (o.LJ(C16880lQ.LLJJJJ(), Looper.myLooper())) {
            c76732zl.element = LJIJ(str, i, i2, nLEAlgorithmPath);
        } else {
            CountDownLatch countDownLatch = new CountDownLatch(1);
            C5NG c5ng = new C5NG(this, c76732zl, str, i, i2, nLEAlgorithmPath, countDownLatch);
            Thread LLLLIIIILLL = C16880lQ.LLLLIIIILLL();
            Looper LLJJJJ = C16880lQ.LLJJJJ();
            o.LJIIIIZZ(LLJJJJ, "Looper.getMainLooper()");
            if (o.LJ(LLLLIIIILLL, LLJJJJ.getThread())) {
                c5ng.invoke();
            } else {
                C5NB.LIZ.postAtFrontOfQueue(new ARunnableS38S0100000_2(c5ng, 151));
            }
            try {
                countDownLatch.await();
            } catch (Exception e) {
                NLELoggerListener logger = com.bytedance.ies.nleeditor.NLE.INSTANCE.getLogger();
                if (logger != null) {
                    LogLevel logLevel = LogLevel.LEVEL_WARNING;
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("NLEVEPublic2: setMusicAndResult: ");
                    LIZ.append(e);
                    logger.onLog(logLevel, X1D.LIZIZ(LIZ));
                }
            }
        }
        NLELoggerListener logger2 = com.bytedance.ies.nleeditor.NLE.INSTANCE.getLogger();
        if (logger2 != null) {
            logger2.onLog(LogLevel.LEVEL_DEBUG, "NLEVEPublic2: setMusicAndResult: result: " + c76732zl.element + ", cost: " + (System.currentTimeMillis() - currentTimeMillis));
        }
        return c76732zl.element;
    }

    public final int LJIJ(String str, int i, int i2, NLEAlgorithmPath nLEAlgorithmPath) {
        long j;
        NLEModel LJ;
        com.bytedance.ies.nleeditor.NLE nle = com.bytedance.ies.nleeditor.NLE.INSTANCE;
        NLELoggerListener logger = nle.getLogger();
        if (logger != null) {
            LogLevel logLevel = LogLevel.LEVEL_DEBUG;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("NLEVEPublic2: setMusicAndResultInner: ");
            LIZ.append(str);
            logger.onLog(logLevel, X1D.LIZIZ(LIZ));
        }
        NLEAlgorithmController LJIIJ = LJIIJ();
        if (LJIIJ != null) {
            NLELoggerListener logger2 = nle.getLogger();
            if (logger2 != null) {
                LogLevel logLevel2 = LogLevel.LEVEL_DEBUG;
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("NLEVEPublic2: setMusicAndResultInnerSetModel: ");
                LIZ2.append(str);
                logger2.onLog(logLevel2, X1D.LIZIZ(LIZ2));
            }
            NLEEditor nLEEditor = this.LJFF;
            if (nLEEditor != null && (LJ = nLEEditor.LJ()) != null) {
                List LJII = LJII(LJ);
                if (((ArrayList) LJII).isEmpty()) {
                    NLELoggerListener logger3 = nle.getLogger();
                    if (logger3 != null) {
                        LogLevel logLevel3 = LogLevel.LEVEL_DEBUG;
                        StringBuilder LIZ3 = X1D.LIZ();
                        LIZ3.append("NLEVEPublic2: add algorithm audio track: ");
                        LIZ3.append(str);
                        logger3.onLog(logLevel3, X1D.LIZIZ(LIZ3));
                    }
                    NLETrack nLETrack = new NLETrack();
                    NLETrackSlot nLETrackSlot = new NLETrackSlot();
                    nLETrackSlot.LJIIL(LJI(i, i2, str));
                    nLETrackSlot.setStartTime(0L);
                    nLETrackSlot.setEndTime(C78926UyI.LJJJ(i2 - i));
                    nLETrack.LIZIZ(nLETrackSlot);
                    LJ.addTrack(nLETrack);
                } else {
                    Iterator it = ((ArrayList) LJII).iterator();
                    while (it.hasNext()) {
                        NLETrack nLETrack2 = (NLETrack) it.next();
                        NLELoggerListener logger4 = com.bytedance.ies.nleeditor.NLE.INSTANCE.getLogger();
                        if (logger4 != null) {
                            LogLevel logLevel4 = LogLevel.LEVEL_DEBUG;
                            StringBuilder LIZ4 = X1D.LIZ();
                            LIZ4.append("NLEVEPublic2: replace algorithm audio clip path: ");
                            LIZ4.append(str);
                            logger4.onLog(logLevel4, X1D.LIZIZ(LIZ4));
                        }
                        if (nLETrack2.LJIILL().size() == 0) {
                            NLETrackSlot nLETrackSlot2 = new NLETrackSlot();
                            nLETrackSlot2.LJIIL(LJI(i, i2, str));
                            nLETrackSlot2.setStartTime(0L);
                            nLETrackSlot2.setEndTime(C78926UyI.LJJJ(i2 - i));
                            nLETrack2.LIZIZ(nLETrackSlot2);
                        } else {
                            NLETrackSlot audioSlot = nLETrack2.LJIILLIIL().get(0);
                            o.LJIIIIZZ(audioSlot, "audioSlot");
                            NLESegmentAudio LIZLLL = NLESegmentAudio.LIZLLL(audioSlot.LJI());
                            if (LIZLLL != null) {
                                NLEResourceAV LJ2 = LIZLLL.LJ();
                                LIZLLL.LJIJJLI(C78926UyI.LJJJ(i));
                                LIZLLL.LJIJJ(C78926UyI.LJJJ(i2));
                                String str2 = "";
                                if (LJ2 != null) {
                                    if (str != null) {
                                        str2 = str;
                                    }
                                    LJ2.LJIIIZ(str2);
                                    LJ2.LJIILIIL(EnumC123874tb.ALGORITHM_AUDIO);
                                } else {
                                    NLEResourceAV nLEResourceAV = new NLEResourceAV();
                                    if (str != null) {
                                        str2 = str;
                                    }
                                    nLEResourceAV.LJIIIZ(str2);
                                    nLEResourceAV.LJIILIIL(EnumC123874tb.ALGORITHM_AUDIO);
                                    LIZLLL.LJIILL(nLEResourceAV);
                                }
                            }
                        }
                    }
                }
            }
            int LJIILJJIL = LJIILJJIL();
            long LJJJ = C78926UyI.LJJJ(i);
            long LJJJ2 = C78926UyI.LJJJ(i2);
            long j2 = LJIIJ.LIZ;
            if (nLEAlgorithmPath == null) {
                j = 0;
            } else {
                j = nLEAlgorithmPath.LIZ;
            }
            if (NLEMediaPublicJniJNI.NLEAlgorithmController_initSmartAlgorithm(j2, LJIIJ, LJJJ, LJJJ2, j, nLEAlgorithmPath) >= 0 && LJIILJJIL >= 0) {
                return 0;
            }
        }
        return -1;
    }
}
