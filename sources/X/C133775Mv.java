package X;

import android.graphics.Bitmap;
import android.view.SurfaceView;
import com.bytedance.ies.nle.editor_jni.LogLevel;
import com.bytedance.ies.nle.editor_jni.NLEEditorJniJNI;
import com.bytedance.ies.nle.editor_jni.NLEEncodeListenerWrapper;
import com.bytedance.ies.nle.editor_jni.NLEError;
import com.bytedance.ies.nle.editor_jni.NLEListenerCompileTargetFileInfoPredictWrapper;
import com.bytedance.ies.nle.editor_jni.NLEListenerGetImageWrapper;
import com.bytedance.ies.nle.editor_jni.NLELoggerListener;
import com.bytedance.ies.nle.editor_jni.NLEMediaConfig;
import com.bytedance.ies.nle.editor_jni.NLEMediaPublicJniJNI;
import com.bytedance.ies.nle.editor_jni.NLEMediaRuntimeController;
import com.bytedance.ies.nle.editor_jni.PairIntInt;
import com.bytedance.ies.nle.editor_jni.VecLongLong;
import kotlin.jvm.internal.o;

/* renamed from: X.5Mv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C133775Mv extends C5N3 {
    public C132795Jb LJ;
    public C5NR LJFF;
    public C5NX LJI;
    public final C5N2 LJII;
    public final NLEMediaConfig LJIIIIZZ;
    public final C5J1 LJIIIZ;

    public final int LJFF() {
        int i;
        synchronized (this.LJII) {
            NLEMediaRuntimeController LJIIL = LJIIL();
            if (LJIIL != null) {
                i = NLEMediaPublicJniJNI.NLEMediaRuntimeController_cancelGetVideoFrames(LJIIL.LIZ, LJIIL);
            } else {
                i = -1;
            }
        }
        return i;
    }

    public final PairIntInt LJIIJ() {
        C5J1 c5j1;
        OSZ osz;
        synchronized (this.LJII) {
            NLEMediaRuntimeController LJIIL = LJIIL();
            if (LJIIL != null) {
                PairIntInt pairIntInt = new PairIntInt(NLEMediaPublicJniJNI.NLEMediaRuntimeController_getInitSize__SWIG_0(LJIIL.LIZ, LJIIL));
                if ((pairIntInt.LIZ() == 0 || pairIntInt.LIZIZ() == 0) && (c5j1 = this.LJIIIZ) != null) {
                    SurfaceView surfaceView = c5j1.LJIILL;
                    if (surfaceView != null) {
                        osz = new OSZ(Integer.valueOf(surfaceView.getWidth()), Integer.valueOf(surfaceView.getHeight()));
                    } else {
                        osz = new OSZ(0, 0);
                    }
                    if (((Number) osz.getFirst()).intValue() > 0 && ((Number) osz.getSecond()).intValue() > 0) {
                        PairIntInt LJIIJJI = LJIIJJI(((Number) osz.getFirst()).intValue(), ((Number) osz.getSecond()).intValue());
                        NLEEditorJniJNI.PairIntInt_first_set(pairIntInt.LIZ, pairIntInt, LJIIJJI.LIZ());
                        NLEEditorJniJNI.PairIntInt_second_set(pairIntInt.LIZ, pairIntInt, LJIIJJI.LIZIZ());
                    }
                }
                return pairIntInt;
            }
            return new PairIntInt();
        }
    }

    public final NLEMediaRuntimeController LJIIL() {
        C5N2 c5n2 = this.LJII;
        if (c5n2.LJIILIIL == null || c5n2.LIZJ.get()) {
            return null;
        }
        return (NLEMediaRuntimeController) c5n2.LIZLLL.getValue();
    }

    public final float LJIILIIL() {
        float f;
        synchronized (this.LJII) {
            NLEMediaRuntimeController LJIIL = LJIIL();
            if (LJIIL != null) {
                f = NLEMediaPublicJniJNI.NLEMediaRuntimeController_getPlayFps(LJIIL.LIZ, LJIIL);
            } else {
                f = 0.0f;
            }
        }
        return f;
    }

    public final boolean LJIILL() {
        boolean z;
        synchronized (this.LJII) {
            NLEMediaRuntimeController LJIIL = LJIIL();
            if (LJIIL != null) {
                z = NLEMediaPublicJniJNI.NLEMediaRuntimeController_isUseFilterProcess(LJIIL.LIZ, LJIIL);
            } else {
                z = false;
            }
        }
        return z;
    }

    public final int LJJIII() {
        int i;
        synchronized (this.LJII) {
            NLEMediaRuntimeController LJIIL = LJIIL();
            if (LJIIL != null) {
                i = NLEMediaPublicJniJNI.NLEMediaRuntimeController_unlockSeekVideoClip(LJIIL.LIZ, LJIIL);
            } else {
                i = -1;
            }
        }
        return i;
    }

    public final int LJIILJJIL() {
        NLEMediaRuntimeController LJIIL = LJIIL();
        if (LJIIL != null) {
            return NLEMediaPublicJniJNI.NLEMediaRuntimeController_getVEColorSpace(LJIIL.LIZ, LJIIL);
        }
        return -1;
    }

    public final int LJI(Boolean bool) {
        int i;
        boolean booleanValue = bool.booleanValue();
        synchronized (this.LJII) {
            NLEMediaRuntimeController LJIIL = LJIIL();
            if (LJIIL != null) {
                i = NLEMediaPublicJniJNI.NLEMediaRuntimeController_enableWatermarkMetadata(LJIIL.LIZ, LJIIL, booleanValue);
            } else {
                i = -1;
            }
        }
        return i;
    }

    public final Bitmap LJII(int i) {
        PairIntInt pairIntInt;
        int LIZIZ;
        Integer num;
        NLEMediaRuntimeController LJIIL = LJIIL();
        if (LJIIL != null) {
            pairIntInt = new PairIntInt(NLEMediaPublicJniJNI.NLEMediaRuntimeController_getCanvasSize(LJIIL.LIZ, LJIIL));
        } else {
            pairIntInt = new PairIntInt();
        }
        if (pairIntInt.LIZ() != 0 && pairIntInt.LIZIZ() != 0) {
            if (i <= 0 || i >= pairIntInt.LIZ()) {
                i = pairIntInt.LIZ();
                LIZIZ = pairIntInt.LIZIZ();
            } else {
                LIZIZ = (pairIntInt.LIZIZ() * i) / pairIntInt.LIZ();
            }
            if (i % 2 == 1) {
                i++;
            }
            if (LIZIZ % 2 == 1) {
                LIZIZ++;
            }
            if (i != 0 && LIZIZ != 0) {
                synchronized (this.LJII) {
                    try {
                        Bitmap createBitmap = Bitmap.createBitmap(i, LIZIZ, Bitmap.Config.ARGB_8888);
                        if (createBitmap == null) {
                            return null;
                        }
                        NLEMediaRuntimeController LJIIL2 = LJIIL();
                        if (LJIIL2 != null) {
                            num = Integer.valueOf(NLEMediaPublicJniJNI.NLEMediaRuntimeController_getDisplayImage(LJIIL2.LIZ, LJIIL2, createBitmap));
                        } else {
                            num = null;
                        }
                        int swigValue = NLEError.SUCCESS.swigValue();
                        if (num != null) {
                            if (num.intValue() != swigValue) {
                            }
                            return createBitmap;
                        }
                        NLELoggerListener logger = com.bytedance.ies.nleeditor.NLE.INSTANCE.getLogger();
                        if (logger != null) {
                            LogLevel logLevel = LogLevel.LEVEL_ERROR;
                            StringBuilder LIZ = X1D.LIZ();
                            LIZ.append("NLEVEPublic2: getCurrDisplayImage getDisplayImage failed! ");
                            LIZ.append(num);
                            logger.onLog(logLevel, X1D.LIZIZ(LIZ));
                        }
                        if (!createBitmap.isRecycled()) {
                            createBitmap.recycle();
                            return null;
                        }
                        return createBitmap;
                    } catch (Throwable th) {
                        NLELoggerListener logger2 = com.bytedance.ies.nleeditor.NLE.INSTANCE.getLogger();
                        if (logger2 != null) {
                            LogLevel logLevel2 = LogLevel.LEVEL_ERROR;
                            StringBuilder LIZ2 = X1D.LIZ();
                            LIZ2.append("NLEVEPublic2: getCurrDisplayImage createBitmap failed! ");
                            LIZ2.append(th.getMessage());
                            logger2.onLog(logLevel2, X1D.LIZIZ(LIZ2));
                        }
                        return null;
                    }
                }
            }
        }
        return null;
    }

    public final int LJIILLIIL(String nleSlotUUID) {
        int i;
        o.LJIIIZ(nleSlotUUID, "nleSlotUUID");
        synchronized (this.LJII) {
            NLEMediaRuntimeController LJIIL = LJIIL();
            if (LJIIL != null) {
                i = NLEMediaPublicJniJNI.NLEMediaRuntimeController_lockSeekVideoClip(LJIIL.LIZ, LJIIL, nleSlotUUID);
            } else {
                i = -1;
            }
        }
        return i;
    }

    public final void LJIJ(int i) {
        synchronized (this.LJII) {
            NLEMediaRuntimeController LJIIL = LJIIL();
            if (LJIIL != null) {
                NLEMediaPublicJniJNI.NLEMediaRuntimeController_setBackgroundColor(LJIIL.LIZ, LJIIL, i);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [X.5NX, com.bytedance.ies.nle.editor_jni.NLEListenerCompileTargetFileInfoPredictWrapper] */
    public final void LJIJI(final InterfaceC133985Nq interfaceC133985Nq) {
        ?? r5 = new NLEListenerCompileTargetFileInfoPredictWrapper() { // from class: X.5NX
            @Override // com.bytedance.ies.nle.editor_jni.NLEListenerCompileTargetFileInfoPredictWrapper
            public final void onCompileTargetFileInfoPredict(long j, long j2, boolean z, boolean z2) {
                InterfaceC133985Nq.this.LIZ(j, j2, z, z2);
            }
        };
        this.LJI = r5;
        NLEMediaRuntimeController LJIIL = LJIIL();
        if (LJIIL != null) {
            NLEMediaPublicJniJNI.NLEMediaRuntimeController_setOnCompileTargetFileInfoPredictListener(LJIIL.LIZ, LJIIL, NLEListenerCompileTargetFileInfoPredictWrapper.getCPtr(r5), r5);
        }
    }

    /* JADX WARN: Type inference failed for: r7v0, types: [com.bytedance.ies.nle.editor_jni.NLEEncodeListenerWrapper, X.5NR] */
    public final void LJIL(final C5NS c5ns) {
        synchronized (this.LJII) {
            if (LJIIL() != null) {
                ?? r7 = new NLEEncodeListenerWrapper() { // from class: X.5NR
                    @Override // com.bytedance.ies.nle.editor_jni.NLEEncodeListenerWrapper
                    public final void onCompressBuffer(byte[] bArr, long j, int i, boolean z) {
                        c5ns.LIZIZ(bArr, j, i, z);
                    }
                };
                this.LJFF = r7;
                NLEMediaRuntimeController LJIIL = LJIIL();
                if (LJIIL != null) {
                    NLEMediaPublicJniJNI.NLEMediaRuntimeController_setEncoderListener(LJIIL.LIZ, LJIIL, NLEEncodeListenerWrapper.getCPtr(r7), r7);
                }
            }
        }
    }

    public final int LJJ(float f) {
        NLEMediaRuntimeController LJIIL = LJIIL();
        if (LJIIL != null) {
            return NLEMediaPublicJniJNI.NLEMediaRuntimeController_setHeightWidthRatio(LJIIL.LIZ, LJIIL, f);
        }
        return -1;
    }

    public final int LJJIFFI(Bitmap bitmap) {
        NLEMediaRuntimeController LJIIL = LJIIL();
        if (LJIIL != null) {
            return NLEMediaPublicJniJNI.NLEMediaRuntimeController_setPreviewSurfaceImage(LJIIL.LIZ, LJIIL, bitmap, true);
        }
        return -1;
    }

    public final int LJ(String str, String str2) {
        int i;
        synchronized (this.LJII) {
            NLEMediaRuntimeController LJIIL = LJIIL();
            if (LJIIL != null) {
                i = NLEMediaPublicJniJNI.NLEMediaRuntimeController_addMetadata(LJIIL.LIZ, LJIIL, str, str2);
            } else {
                i = -1;
            }
        }
        return i;
    }

    public final String LJIIIIZZ(String nleSlotUUID, String str) {
        String NLEMediaRuntimeController_getFileInfo;
        o.LJIIIZ(nleSlotUUID, "nleSlotUUID");
        NLEMediaRuntimeController LJIIL = LJIIL();
        if (LJIIL != null && (NLEMediaRuntimeController_getFileInfo = NLEMediaPublicJniJNI.NLEMediaRuntimeController_getFileInfo(LJIIL.LIZ, LJIIL, nleSlotUUID, str)) != null) {
            return NLEMediaRuntimeController_getFileInfo;
        }
        return "";
    }

    public final PairIntInt LJIIJJI(int i, int i2) {
        PairIntInt pairIntInt;
        synchronized (this.LJII) {
            NLEMediaRuntimeController LJIIL = LJIIL();
            if (LJIIL != null) {
                pairIntInt = new PairIntInt(NLEMediaPublicJniJNI.NLEMediaRuntimeController_getInitSize__SWIG_1(LJIIL.LIZ, LJIIL, i, i2));
            } else {
                pairIntInt = new PairIntInt();
            }
        }
        return pairIntInt;
    }

    public final int LJJI(long j, long j2) {
        NLEMediaRuntimeController LJIIL = LJIIL();
        if (LJIIL != null) {
            return NLEMediaPublicJniJNI.NLEMediaRuntimeController_setMaxWidthAndHeight(LJIIL.LIZ, LJIIL, j, j2);
        }
        return -1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C133775Mv(C5N2 nleEditorPublic, NLEMediaConfig mediaConfig, C5J1 c5j1) {
        super(nleEditorPublic);
        o.LJIIIZ(nleEditorPublic, "nleEditorPublic");
        o.LJIIIZ(mediaConfig, "mediaConfig");
        this.LJII = nleEditorPublic;
        this.LJIIIIZZ = mediaConfig;
        this.LJIIIZ = c5j1;
    }

    public final int LJIIZILJ(int i, long j, long j2, String str) {
        NLEMediaRuntimeController LJIIL = LJIIL();
        if (LJIIL != null) {
            return NLEMediaPublicJniJNI.NLEMediaRuntimeController_sendEffectMsg(LJIIL.LIZ, LJIIL, i, (int) j, (int) j2, str);
        }
        return -1;
    }

    public final void LJIJJ(int i, int i2, int i3, int i4) {
        synchronized (this.LJII) {
            NLEMediaRuntimeController LJIIL = LJIIL();
            if (LJIIL != null) {
                NLEMediaPublicJniJNI.NLEMediaRuntimeController_setDisplayPos(LJIIL.LIZ, LJIIL, i, i2, i3, i4);
            }
        }
    }

    public final int LJJII(String str, String str2, boolean z, boolean z2) {
        int i;
        synchronized (this.LJII) {
            NLEMediaRuntimeController LJIIL = LJIIL();
            if (LJIIL != null) {
                i = NLEMediaPublicJniJNI.NLEMediaRuntimeController_setVEMetadataWhitelistConfig(LJIIL.LIZ, LJIIL, z, z2, str, str2);
            } else {
                i = -1;
            }
        }
        return i;
    }

    public final int LJIIIZ(VecLongLong vecLongLong, int i, int i2, C5NA c5na, C5NJ c5nj) {
        synchronized (this.LJII) {
            NLEMediaRuntimeController LJIIL = LJIIL();
            if (LJIIL != null) {
                C132795Jb c132795Jb = new C132795Jb(this, c5nj, vecLongLong);
                this.LJ = c132795Jb;
                return NLEMediaPublicJniJNI.NLEMediaRuntimeController_getImages(LJIIL.LIZ, LJIIL, vecLongLong.LJLIL, vecLongLong, i, i2, c5na.swigValue(), NLEListenerGetImageWrapper.getCPtr(c132795Jb), c132795Jb);
            }
            return -1;
        }
    }

    public final void LJIJJLI(float f, float f2, float f3, int i, int i2) {
        NLEMediaRuntimeController LJIIL = LJIIL();
        if (LJIIL != null) {
            NLEMediaPublicJniJNI.NLEMediaRuntimeController_setDisplayState(LJIIL.LIZ, LJIIL, f, f2, f3, i, i2);
        }
    }
}
