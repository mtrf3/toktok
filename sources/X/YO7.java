package X;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Handler;
import android.text.TextUtils;
import android.view.Surface;
import android.view.SurfaceView;
import android.view.TextureView;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.ss.android.ttve.monitor.TEMonitorInvoker;
import com.ss.android.ttve.nativePort.TEInterface;
import com.ss.android.ttve.nativePort.TEVideoUtils;
import com.ss.android.vesdk.ROTATE_DEGREE;
import com.ss.android.vesdk.VEConfigCenter;
import com.ss.android.vesdk.VEEditor;
import com.ss.android.vesdk.VEEditorModel;
import com.ss.android.vesdk.VEException;
import com.ss.android.vesdk.VEMVAudioInfo;
import com.ss.android.vesdk.VESize;
import com.ss.android.vesdk.VETimelineParams;
import com.ss.android.vesdk.VEVideoEncodeSettings;
import com.ss.android.vesdk.clipparam.VEClipAlgorithmParam;
import com.ss.android.vesdk.clipparam.VEClipSourceParam;
import com.ss.android.vesdk.clipparam.VEClipTimelineParam;
import com.ss.android.vesdk.filterparam.VEBaseFilterParam;
import com.ss.android.vesdk.filterparam.VEImageTransformFilterParam;
import com.ss.android.vesdk.runtime.VEEditorResManager;
import com.ss.android.vesdk.runtime.VERuntime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import jp3.c;
import kotlin.jvm.internal.AqS165S0100000_15;
import kotlin.jvm.internal.o;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes16.dex */
public final class YO7 implements InterfaceC153045zY {
    public final C63078OpG LIZ;
    public final Rect LIZIZ;
    public boolean LIZJ;
    public final List<InterfaceC133835Nb> LIZLLL;
    public final C62822Ol8 LJ;
    public volatile int LJFF;
    public final CopyOnWriteArrayList<InterfaceC134025Nu> LJI;
    public final YOJ LJII;
    public final CopyOnWriteArrayList<InterfaceC133905Ni> LJIIIIZZ;
    public final C82642Wc2 LJIIIZ;
    public final CopyOnWriteArrayList<InterfaceC133905Ni> LJIIJ;
    public final C82643Wc3 LJIIJJI;
    public boolean LJIIL;
    public final YOG LJIILIIL;
    public final VEEditor LJIILJJIL;
    public final C62822Ol8 LJIILL;

    public final Handler LJFF() {
        return (Handler) this.LJ.getValue();
    }

    @Override // X.InterfaceC153045zY
    public final void LJZ(NLEModel nLEModel) {
    }

    @Override // X.InterfaceC153045zY
    public final void LLIFFJFJJ() {
    }

    @Override // X.InterfaceC153045zY
    public final void LLII() {
    }

    @Override // X.InterfaceC153045zY
    public final NLEModel LLIIIL() {
        return null;
    }

    @Override // X.InterfaceC153045zY
    public final int LLILIL() {
        return -1;
    }

    @Override // X.InterfaceC153045zY
    public final int LLJJJJLIIL() {
        int cancelGetImages;
        this.LIZJ = false;
        VEEditor LJ = LJ();
        synchronized (LJ) {
            P4Q.LJII("VEEditor", "cancelGetVideoFrames...");
            cancelGetImages = LJ.LLIIII.cancelGetImages();
        }
        return cancelGetImages;
    }

    @Override // X.InterfaceC153045zY
    public final String LLJJL() {
        return null;
    }

    @Override // X.InterfaceC153045zY
    public final void LLLF() {
    }

    @Override // X.InterfaceC153045zY
    public final void LLLILZ(boolean z) {
    }

    public final VEEditor LJ() {
        YOG yog = this.LJIILIIL;
        if (yog != null) {
            VEEditor vEEditor = yog.LIZ;
            if (vEEditor != null) {
                return vEEditor;
            }
            o.LJIJI("veEditor");
            throw null;
        }
        return this.LJIILJJIL;
    }

    @Override // X.InterfaceC153045zY
    public final void LLIIIILZ() {
        ((ArrayList) this.LIZLLL).clear();
        LJFF().removeMessages(100);
    }

    @Override // X.InterfaceC153045zY
    public final void destroy() {
        if (this.LIZJ) {
            LLJJJJLIIL();
        }
        LJFF().removeMessages(100);
        LJ().LJIILIIL();
    }

    @Override // X.InterfaceC153045zY
    public final void LIZIZ() {
        VEEditor LJ = LJ();
        synchronized (LJ) {
            LJ.LLILZ = false;
            P4Q.LJII("VEEditor", "onReleaseResource... ");
            if (LJ.LLIIII.getNativeHandler() != 0) {
                if (LJ.LLJJIJIIJIL == 1) {
                    TEMonitorInvoker.nativeMonitorPerfWithType(3);
                }
                LJ.LLIIII.releasePreviewSurface();
                SurfaceView surfaceView = LJ.LLIIIL;
                if (surfaceView != null) {
                    surfaceView.getHolder().removeCallback(LJ.LLJJL);
                } else {
                    TextureView textureView = LJ.LLIIIZ;
                    if (textureView != null && textureView.getSurfaceTextureListener() == LJ.LLJJJJLIIL) {
                        LJ.LLIIIZ.setSurfaceTextureListener(null);
                    }
                }
                LJ.LLIIIL = null;
                LJ.LLIIIZ = null;
                TEInterface tEInterface = LJ.LLIIII;
                if (tEInterface != null) {
                    tEInterface.setOpenGLListeners(null);
                    LJ.LLIIII.setInfoListener(null);
                    LJ.LLIIII.setErrorListener(null);
                    P4Q.LJII("VEEditor", "onReleaseResource... setNativeHandler 0");
                    LJ.LLIIII.setNativeHandler(0L);
                    LJ.LJII();
                }
                LJ.LJLJJLL = null;
                Bitmap bitmap = LJ.LLJJ;
                if (bitmap != null && !bitmap.isRecycled()) {
                    LJ.LLJJ.recycle();
                    LJ.LLJJ = null;
                }
            }
        }
    }

    @Override // X.InterfaceC153045zY
    public final int LIZJ() {
        return LJ().LJJIJIIJI();
    }

    @Override // X.InterfaceC153045zY
    public final int LJZL() {
        return LJ().LJIJJ();
    }

    @Override // X.InterfaceC153045zY
    public final boolean LLFII() {
        VEEditor LJ = LJ();
        synchronized (LJ) {
            if (LJ.LLILZ) {
                if (LJ.LLIIII.getNativeHandler() != 0) {
                    LJ.LLIIII.genEditorStatus();
                    return VKP.LJLILLLLZI.LJLIL.LIZJ();
                }
                return false;
            }
            throw new VEException(-105, "Make sure the initialization is successful before calling!!!");
        }
    }

    @Override // X.InterfaceC153045zY
    public final void LLIIIJ() {
        VEEditor LJ = LJ();
        LJ.LLF.set(true);
        P4Q.LJII("VEEditor", "releaseEngine... set destroying true");
        synchronized (LJ) {
            if (LJ.LLIIII != null) {
                P4Q.LJII("VEEditor", "releaseEngine... ");
                LJ.LLIIII.stop();
                LJ.LLIIII.releaseEngine();
            }
            LJ.LLF.set(false);
        }
    }

    @Override // X.InterfaceC153045zY
    public final VEEditorModel LLIIZ() {
        VEEditor LJ = LJ();
        LJ.getClass();
        P4Q.LJFF("VEEditor", "saveModel...");
        if (LJ.LLILZ) {
            VEEditorModel vEEditorModel = new VEEditorModel();
            vEEditorModel.reverseDone = LJ.LJLJJLL.mReverseDone;
            vEEditorModel.videoOutRes = LJ.LLILLIZIL;
            vEEditorModel.videoGravity = LJ.LLILLJJLI;
            vEEditorModel.videoScaleType = LJ.LLILLL;
            vEEditorModel.separateAV = LJ.LLIFFJFJJ.booleanValue();
            vEEditorModel.masterTrackIndex = LJ.LLII;
            vEEditorModel.hostTrackIndex = LJ.LLIIII.getHostTrackIndex();
            YO9 yo9 = LJ.LJLJJI;
            vEEditorModel.audioEffectFilterIndex = yo9.LJI;
            vEEditorModel.colorFilterIndex = yo9.LIZLLL;
            vEEditorModel.effectHDRFilterIndex = yo9.LJ;
            vEEditorModel.mLensHDRFilterIndex = yo9.LJFF;
            VEEditorResManager vEEditorResManager = LJ.LJLJJLL;
            vEEditorModel.videoPaths = vEEditorResManager.mVideoPaths;
            vEEditorModel.audioPaths = vEEditorResManager.mAudioPaths;
            vEEditorModel.transitions = vEEditorResManager.mTransitions;
            vEEditorModel.backgroundColor = LJ.LLJJIJIL;
            vEEditorModel.videoBackgroundColor = LJ.LLJJJ;
            return vEEditorModel;
        }
        P4Q.LIZJ("VEEditor", "saveModel error, editor is not init...");
        return null;
    }

    @Override // X.InterfaceC153045zY
    public final VESize LLILZ() {
        VEEditor LJ = LJ();
        LJ.getClass();
        VESize vESize = new VESize(LJ.LLFZ, LJ.LLI);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("getInitSize... initWidth:");
        LIZ.append(vESize.width);
        LIZ.append(", initHeight:");
        LIZ.append(vESize.height);
        P4Q.LIZ("VEEditor", X1D.LIZIZ(LIZ));
        return vESize;
    }

    @Override // X.InterfaceC153045zY
    public final int LLILZLL() {
        VEEditorResManager vEEditorResManager = LJ().LJLJJLL;
        o.LJIIIIZZ(vEEditorResManager, "editor.resManager");
        return vEEditorResManager.mOriginalSoundTrackIndex;
    }

    @Override // X.InterfaceC153045zY
    public final int LLIZLLLIL() {
        VEEditor LJ = LJ();
        int LJIL = LJ().LJIL();
        YO9 yo9 = LJ.LJLJJI;
        synchronized (yo9.LIZ) {
            yo9.LJIIIIZZ.LIZ.getClass();
        }
        return LJIL;
    }

    @Override // X.InterfaceC153045zY
    public final int LLJILLL() {
        int doLensOneKeyHdrDetect;
        VEEditor LJ = LJ();
        synchronized (LJ) {
            doLensOneKeyHdrDetect = LJ.LLIIII.doLensOneKeyHdrDetect();
        }
        return doLensOneKeyHdrDetect;
    }

    @Override // X.InterfaceC153045zY
    public final int LLJJ() {
        VEEditor LJ = LJ();
        LJ.getClass();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setPreviewFps = ");
        LIZ.append(30);
        P4Q.LJFF("VEEditor", X1D.LIZIZ(LIZ));
        LJ.LLIIII.setPreviewFps(30);
        return 0;
    }

    @Override // X.InterfaceC153045zY
    public final float LLJJJ() {
        return LJ().LLJJJJJIL;
    }

    @Override // X.InterfaceC153045zY
    public final void LLJJJJ() {
        VEEditor LJ = LJ();
        LJ.getClass();
        P4Q.LJFF("VEEditor", "setSurfaceReDraw...");
        LJ.LLJILLL = true;
    }

    @Override // X.InterfaceC153045zY
    public final void LLJJLIIIJLLLLLLLZ() {
        VEEditor LJ = LJ();
        LJ.getClass();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("enableWatermarkMetadata:");
        LIZ.append(true);
        P4Q.LJII("VEEditor", X1D.LIZIZ(LIZ));
        LJ.LLIIII.enableWatermarkMetadata(true);
    }

    @Override // X.InterfaceC153045zY
    public final Bitmap LLJL() {
        VEEditor LJ = LJ();
        LJ.getClass();
        P4Q.LJFF("VEEditor", "getCurrDisplayImage...");
        return LJ.LJIJJLI(-1);
    }

    @Override // X.InterfaceC153045zY
    public final VEMVAudioInfo LLJZIJLIL() {
        YOO yoo = LJ().LJLIL;
        if (yoo == null) {
            P4Q.LIZJ("VEEditor", "MV IS NOT SUPPORT !!!");
            return null;
        }
        return yoo.getMVOriginalBackgroundAudio();
    }

    @Override // X.InterfaceC153045zY
    public final int LLL() {
        if (LJ() == null) {
            return -1;
        }
        if (LJ().LJJ() == VEEditor.VEState.SEEKING) {
            return this.LJFF;
        }
        return LJ().LJIJJ();
    }

    @Override // X.InterfaceC153045zY
    public final int genRandomSolve() {
        return LJ().LJLJI.genRandomSolve();
    }

    @Override // X.InterfaceC153045zY
    public final int genSmartCutting() {
        return LJ().LJLJI.genSmartCutting();
    }

    @Override // X.InterfaceC153045zY
    public final List<VEClipAlgorithmParam> getAllVideoRangeData() {
        return LJ().LJLJI.getAllVideoRangeData();
    }

    @Override // X.InterfaceC153045zY
    public final int getDuration() {
        return LJ().LJIL();
    }

    @Override // X.InterfaceC153045zY
    public final long getHandler() {
        VEEditor LJ = LJ();
        LJ.getClass();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("getHandler... ");
        LIZ.append(LJ.LLIIII.getNativeHandler());
        P4Q.LJII("VEEditor", X1D.LIZIZ(LIZ));
        return LJ.LLIIII.getNativeHandler();
    }

    @Override // X.InterfaceC153045zY
    public final VEEditor.VEState getState() {
        return LJ().LJJ();
    }

    @Override // X.InterfaceC153045zY
    public final String getWorkspace() {
        VEEditorResManager vEEditorResManager = LJ().LJLJJLL;
        o.LJIIIIZZ(vEEditorResManager, "editor.resManager");
        String workspace = vEEditorResManager.getWorkspace();
        o.LJIIIIZZ(workspace, "resManager.workspace");
        return workspace;
    }

    @Override // X.InterfaceC153045zY
    public final int initBingoAlgorithm() {
        return LJ().LJLJI.initBingoAlgorithm();
    }

    @Override // X.InterfaceC153045zY
    public final int pause() {
        int LJJIIZI;
        VEEditor LJ = LJ();
        synchronized (LJ) {
            LJJIIZI = LJ.LJJIIZI();
        }
        return LJJIIZI;
    }

    @Override // X.InterfaceC153045zY
    public final int play() {
        LJFF().removeMessages(100);
        LJFF().sendEmptyMessageDelayed(100, 100L);
        VEEditor LJ = LJ();
        int i = 0;
        if (LJ.LLF.get()) {
            P4Q.LJII("VEEditor", "no need to play, is destroying, just return");
        } else {
            synchronized (LJ) {
                if (LJ.LLF.get()) {
                    P4Q.LJII("VEEditor", "no need to play, is destroying, just lock return");
                } else {
                    P4Q.LJII("VEEditor", "play...");
                    LJ.LLIIJI = 0;
                    long currentTimeMillis = System.currentTimeMillis();
                    LJ.LLIIL = currentTimeMillis;
                    if (LJ.LLIIZ == 0) {
                        LJ.LLIIZ = currentTimeMillis;
                    }
                    i = LJ.LLIIII.start();
                }
            }
        }
        return i;
    }

    @Override // X.InterfaceC153045zY
    public final int prepare() {
        int prepareEngine;
        VEEditor LJ = LJ();
        LJ.getClass();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("init start---> init end  VE cost: ");
        LIZ.append(LJ.LLJJJJ + LJ.LLJJJIL);
        P4Q.LJII("VEEditor", X1D.LIZIZ(LIZ));
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("init start---> init end  VE sequence cost: ");
        LIZ2.append(LJ.LLJJJIL);
        P4Q.LJFF("VEEditor", X1D.LIZIZ(LIZ2));
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("init start---> init end  VE editor cost: ");
        LIZ3.append(LJ.LLJJJJ);
        P4Q.LJFF("VEEditor", X1D.LIZIZ(LIZ3));
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (LJ) {
            P4Q.LJII("VEEditor", "prepare...");
            LJ.LJJJIL(LJ.LLJJJ);
            LJ.LLIIII.setEnableRemuxVideo(false);
            LJ.LLIIII.setUsrRotate(0);
            prepareEngine = LJ.LLIIII.prepareEngine(0);
            if (prepareEngine != 0) {
                StringBuilder LIZ4 = X1D.LIZ();
                LIZ4.append("prepare() prepareEngine failed: result: ");
                LIZ4.append(prepareEngine);
                P4Q.LIZJ("VEEditor", X1D.LIZIZ(LIZ4));
                LJ.LJJIIJ();
            }
            int[] initResolution = LJ.LLIIII.getInitResolution();
            VESize vESize = LJ.LJLJL;
            vESize.width = initResolution[0];
            vESize.height = initResolution[1];
            if (LJ.LLFFF > 0 && LJ.LLFII > 0) {
                LJ.LJJJJJL();
            }
            LJ.LJJIJIL(LJ.LLJJIJIL);
            StringBuilder LIZ5 = X1D.LIZ();
            LIZ5.append("prepare... cost ");
            LIZ5.append(System.currentTimeMillis() - currentTimeMillis);
            P4Q.LJII("VEEditor", X1D.LIZIZ(LIZ5));
        }
        return prepareEngine;
    }

    @Override // X.InterfaceC153045zY
    public final String[] q0() {
        VEEditorResManager vEEditorResManager = LJ().LJLJJLL;
        if (vEEditorResManager.mReverseDone) {
            return vEEditorResManager.mReverseVideoPath;
        }
        return null;
    }

    @Override // X.InterfaceC153045zY
    public final int removeAllVideoSound() {
        return LJ().LJLJI.removeAllVideoSound();
    }

    @Override // X.InterfaceC153045zY
    public final int restoreAllVideoSound() {
        return LJ().LJLJI.restoreAllVideoSound();
    }

    @Override // X.InterfaceC153045zY
    public final void stop() {
        LJ().LJJJJIZL();
    }

    @Override // X.InterfaceC153045zY
    public final int updateAlgorithmFromNormal() {
        return LJ().LJLJI.updateAlgorithmFromNormal();
    }

    @Override // X.InterfaceC153045zY
    public final InterfaceC134035Nv LLLIILIL() {
        return this.LIZ;
    }

    @Override // X.InterfaceC153045zY
    public final Rect t5() {
        return this.LIZIZ;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public YO7(String workSpace) {
        this(new VEEditor(workSpace), new YOG(null, workSpace));
        o.LJIIIZ(workSpace, "workSpace");
    }

    @Override // X.InterfaceC153045zY
    public final void LJJIJLIJ(boolean z) {
        VEEditor LJ = LJ();
        LJ.getClass();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("enableEffect... enable = ");
        LIZ.append(z);
        P4Q.LJII("VEEditor", X1D.LIZIZ(LIZ));
        int enableEffect = LJ.LLIIII.enableEffect(z);
        if (enableEffect != 0) {
            Q7K.LJ("enableEffect failed, ret = ", enableEffect, "VEEditor");
        }
    }

    @Override // X.InterfaceC153045zY
    public final void LJJLIIIIJ(int i) {
        LJ().LJJIJIL(i);
    }

    @Override // X.InterfaceC153045zY
    public final float LL(String filterPath) {
        o.LJIIIZ(filterPath, "filterPath");
        YO9 yo9 = LJ().LJLJJI;
        yo9.getClass();
        if (TextUtils.isEmpty(filterPath)) {
            return -1.0f;
        }
        return yo9.LIZIZ.getColorFilterIntensity(filterPath);
    }

    @Override // X.InterfaceC153045zY
    public final void LLFF(InterfaceC133905Ni callback) {
        o.LJIIIZ(callback, "callback");
        this.LJIIJ.remove(callback);
    }

    @Override // X.InterfaceC153045zY
    public final void LLFFF(C1551266y c1551266y) {
        if (c1551266y == null) {
            return;
        }
        ((ArrayList) this.LIZLLL).remove(c1551266y);
        if (((ArrayList) this.LIZLLL).isEmpty()) {
            LJFF().removeMessages(100);
        }
    }

    @Override // X.InterfaceC153045zY
    public final int LLFZ(int i) {
        LJ().LJLJJI.LJIIIIZZ.LIZ.getClass();
        return i;
    }

    @Override // X.InterfaceC153045zY
    public final int LLI(C5RU c5ru) {
        VEEditor LJ = LJ();
        String[] strArr = c5ru.LIZ;
        String[] strArr2 = c5ru.LIZIZ;
        int[] iArr = c5ru.LIZJ;
        int[] iArr2 = c5ru.LIZLLL;
        float[] fArr = c5ru.LJ;
        String[] strArr3 = c5ru.LJFF;
        String[] strArr4 = c5ru.LJI;
        int[] iArr3 = c5ru.LJII;
        int[] iArr4 = c5ru.LJIIIIZZ;
        float[] fArr2 = c5ru.LJIIIZ;
        ROTATE_DEGREE[] rotate_degreeArr = c5ru.LJIIJ;
        LJ.getClass();
        if (strArr == null || strArr.length == 0) {
            return -100;
        }
        boolean[] zArr = new boolean[strArr.length];
        Arrays.fill(zArr, true);
        return LJ.LJI(zArr, strArr, strArr2, iArr, iArr2, fArr, strArr3, strArr4, iArr3, iArr4, fArr2, rotate_degreeArr);
    }

    @Override // X.InterfaceC153045zY
    public final void LLIIII(InterfaceC134025Nu interfaceC134025Nu) {
        if (this.LJI.isEmpty()) {
            LJ().LJLLILLLL = this.LJII;
            YOG yog = this.LJIILIIL;
            if (yog != null) {
                YOJ listener = this.LJII;
                o.LJIIIZ(listener, "listener");
                yog.LIZJ = listener;
            }
        }
        if (!LIZLLL(this.LJI, interfaceC134025Nu)) {
            this.LJI.add(interfaceC134025Nu);
        }
    }

    @Override // X.InterfaceC153045zY
    public final void LLIIJI(InterfaceC88472Yns<? super Surface, C76800UCe> listener) {
        o.LJIIIZ(listener, "listener");
        YOH yoh = (YOH) this.LJIILL.getValue();
        yoh.getClass();
        yoh.LIZ.remove(listener);
        if (yoh.LIZ.isEmpty()) {
            yoh.LIZJ.LJLLL = null;
        }
    }

    @Override // X.InterfaceC153045zY
    public final void LLIIJLIL(InterfaceC133905Ni callback) {
        o.LJIIIZ(callback, "callback");
        if (this.LJIIJ.isEmpty()) {
            VEEditor LJ = LJ();
            C82643Wc3 c82643Wc3 = this.LJIIJJI;
            LJ.getClass();
            P4Q.LJFF("VEEditor", "setOnInfoListener...");
            LJ.LJLLLL = c82643Wc3;
            YOG yog = this.LJIILIIL;
            if (yog != null) {
                C82643Wc3 callback2 = this.LJIIJJI;
                o.LJIIIZ(callback2, "callback");
                yog.LIZLLL = callback2;
                VEEditor vEEditor = yog.LIZ;
                if (vEEditor != null) {
                    P4Q.LJFF("VEEditor", "setOnInfoListener...");
                    vEEditor.LJLLLL = callback2;
                } else {
                    o.LJIJI("veEditor");
                    throw null;
                }
            }
        }
        if (!LIZLLL(this.LJIIJ, callback)) {
            this.LJIIJ.add(callback);
        }
    }

    @Override // X.InterfaceC153045zY
    public final void LLIILII(InterfaceC88472Yns<? super Surface, C76800UCe> listener) {
        o.LJIIIZ(listener, "listener");
        YOH yoh = (YOH) this.LJIILL.getValue();
        yoh.getClass();
        if (yoh.LIZ.isEmpty()) {
            yoh.LIZJ.LJLLL = yoh.LIZIZ;
        }
        if (!yoh.LIZ.contains(listener)) {
            yoh.LIZ.add(listener);
        }
    }

    @Override // X.InterfaceC153045zY
    public final int LLILII(C5KG c5kg) {
        int LIZ = c5kg.LIZ(LJ(), this.LJIIL);
        this.LJIIL = true;
        return LIZ;
    }

    @Override // X.InterfaceC153045zY
    public final void LLILL(InterfaceC133905Ni interfaceC133905Ni) {
        if (this.LJIIIIZZ.isEmpty()) {
            LJ().LJLLLLLL = this.LJIIIZ;
            P4Q.LJFF("VEEditor", "setOnErrorListener...");
            YOG yog = this.LJIILIIL;
            if (yog != null) {
                C82642Wc2 callback = this.LJIIIZ;
                o.LJIIIZ(callback, "callback");
                yog.LJ = callback;
                VEEditor vEEditor = yog.LIZ;
                if (vEEditor != null) {
                    vEEditor.LJLLLLLL = callback;
                    P4Q.LJFF("VEEditor", "setOnErrorListener...");
                } else {
                    o.LJIJI("veEditor");
                    throw null;
                }
            }
        }
        if (!LIZLLL(this.LJIIIIZZ, interfaceC133905Ni)) {
            this.LJIIIIZZ.add(interfaceC133905Ni);
        }
    }

    @Override // X.InterfaceC153045zY
    public final void LLILLJJLI(int i) {
        LJ().LJJJI(i);
    }

    @Override // X.InterfaceC153045zY
    public final boolean LLJI(VEVideoEncodeSettings vEVideoEncodeSettings) {
        return LJ().LJJIII(vEVideoEncodeSettings);
    }

    @Override // X.InterfaceC153045zY
    public final void LLJILJIL(boolean z) {
        VEEditor LJ = LJ();
        LJ.getClass();
        P4Q.LJFF("VEEditor", "setLoopPlay");
        LJ.LLIIII.setLooping(z);
    }

    @Override // X.InterfaceC153045zY
    public final int LLJILJILJ(VEVideoEncodeSettings vEVideoEncodeSettings) {
        int i;
        VEEditor LJ = LJ();
        synchronized (LJ) {
            if (LJ.LLILZ) {
                i = -1;
                if (LJ.LLIIII.getNativeHandler() != 0) {
                    if (-1 == vEVideoEncodeSettings.getEnableRemuxVideoRes()) {
                        VEConfigCenter.ValuePkt value = VEConfigCenter.getInstance().getValue("remux_video_res");
                        if (value != null && value.getValue() != null && (value.getValue() instanceof Integer)) {
                            int intValue = ((Integer) value.getValue()).intValue();
                            vEVideoEncodeSettings.setEnableRemuxVideoRes(intValue);
                            StringBuilder LIZ = X1D.LIZ();
                            LIZ.append("getRemuxErrorCode::remuxVideoRes = ");
                            LIZ.append(intValue);
                            P4Q.LJFF("VESDK", X1D.LIZIZ(LIZ));
                        } else {
                            P4Q.LJFF("VESDK", "getRemuxErrorCode::No remux video resolution config");
                        }
                    }
                    LJ.LLIIII.genEditorStatus();
                    long nativeContext = VERuntime.getInstance().getNativeContext();
                    VKP vkp = VKP.LJLILLLLZI;
                    vkp.LJLIL.LIZLLL(vEVideoEncodeSettings, nativeContext);
                    VEVideoEncodeSettings LJ2 = vkp.LJLIL.LJ();
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("VideoEncodeSettings = ");
                    LIZ2.append(LJ2.toString());
                    P4Q.LJII("VEEditor", X1D.LIZIZ(LIZ2));
                    i = vkp.LJLIL.LIZ();
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append("before synthesis report remux error code = ");
                    LIZ3.append(i);
                    P4Q.LJII("VEEditor", X1D.LIZIZ(LIZ3));
                }
            } else {
                throw new VEException(-105, "Make sure the initialization is successful before calling!!!");
            }
        }
        return i;
    }

    @Override // X.InterfaceC153045zY
    public final int LLJJI(int i) {
        LJ().LJLJJI.LJIIIIZZ.LIZ.getClass();
        return i;
    }

    @Override // X.InterfaceC153045zY
    public final int LLJJIJIL(VETimelineParams sceneTime) {
        int i;
        o.LJIIIZ(sceneTime, "sceneTime");
        YOU you = LJ().LJLJJL;
        you.getClass();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("updateSceneTime... ");
        LIZ.append(sceneTime.toString());
        P4Q.LJII("VEEditor_VESequenceInvoker", X1D.LIZIZ(LIZ));
        synchronized (you.LIZ) {
            you.LIZIZ.stop();
            int updateSenceTime = you.LIZIZ.updateSenceTime(sceneTime);
            try {
                JSONObject jSONObject = new JSONObject();
                if (updateSenceTime >= 0) {
                    i = 0;
                } else {
                    i = updateSenceTime;
                }
                jSONObject.put("resultCode", String.valueOf(i));
                jSONObject.put("sceneTime", sceneTime.toString());
                c.LIZ("vesdk_event_editor_update_scene_time", "business", jSONObject);
            } catch (JSONException e) {
                C16880lQ.LLLLIIL(e);
            }
            if (updateSenceTime < 0) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("updateSceneTime failed, ret = ");
                LIZ2.append(updateSenceTime);
                P4Q.LIZJ("VEEditor_VESequenceInvoker", X1D.LIZIZ(LIZ2));
                return updateSenceTime;
            }
            VEEditor vEEditor = you.LIZ;
            vEEditor.LLII = 0;
            vEEditor.LJJJJJ();
            you.LIZIZ.setTimeRange(0, updateSenceTime, 0);
            int prepareEngine = you.LIZIZ.prepareEngine(0);
            if (prepareEngine != 0) {
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("Prepare Engine failed, ret = ");
                LIZ3.append(prepareEngine);
                P4Q.LIZJ("VEEditor_VESequenceInvoker", X1D.LIZIZ(LIZ3));
                return prepareEngine;
            }
            return 0;
        }
    }

    @Override // X.InterfaceC153045zY
    public final void LLJLIL(InterfaceC133835Nb interfaceC133835Nb) {
        if (interfaceC133835Nb == null || ((ArrayList) this.LIZLLL).contains(interfaceC133835Nb)) {
            return;
        }
        ((ArrayList) this.LIZLLL).add(interfaceC133835Nb);
        LJFF().removeMessages(100);
        LJFF().sendEmptyMessageDelayed(100, 100L);
    }

    @Override // X.InterfaceC153045zY
    public final Bitmap LLJLL(int i) {
        return LJ().LJIJJLI(i);
    }

    @Override // X.InterfaceC153045zY
    public final void LLJLLL(boolean z) {
        LJ().LJIILL(z);
    }

    @Override // X.InterfaceC153045zY
    public final int LLJZ(int[] iArr) {
        int removeFilter;
        YO9 yo9 = LJ().LJLJJI;
        synchronized (yo9.LIZ) {
            P4Q.LJFF("VEEditor_VEFilterInvoker", "deleteFilters...");
            removeFilter = yo9.LIZIZ.removeFilter(iArr);
        }
        return removeFilter;
    }

    @Override // X.InterfaceC153045zY
    public final void LLLFF(C5SJ c5sj) {
        LJ().LLJI = c5sj;
    }

    @Override // X.InterfaceC153045zY
    public final void LLLFFI(VEEditor.SCALE_MODE mode) {
        o.LJIIIZ(mode, "mode");
        VEEditor LJ = LJ();
        if (LJ.LLF.get()) {
            P4Q.LJII("VEEditor", "set scale mode failed,is destroying, just return");
            return;
        }
        if (LJ.LLF.get()) {
            P4Q.LJII("VEEditor", "set scale mode failed,is destroying, just return");
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setScaleMode... mode:");
        LIZ.append(mode);
        LIZ.append(", x = ");
        LIZ.append(0.0f);
        LIZ.append(", y = ");
        LIZ.append(0.0f);
        P4Q.LJII("VEEditor", X1D.LIZIZ(LIZ));
        switch (X0Y.LIZ[mode.ordinal()]) {
            case 1:
                LJ.LLIIII.setResizer(2, 0.0f, 0.0f);
                return;
            case 2:
                LJ.LLIIII.setResizer(1, 0.0f, 0.0f);
                return;
            case 3:
                LJ.LLIIII.setResizer(3, 0.0f, 0.0f);
                return;
            case 4:
                LJ.LLIIII.setResizer(4, 0.0f, 0.0f);
                return;
            case 5:
                LJ.LLIIII.setResizer(5, 0.0f, 0.0f);
                return;
            case 6:
                LJ.LLIIII.setResizer(6, 0.0f, 0.0f);
                return;
            default:
                return;
        }
    }

    @Override // X.InterfaceC153045zY
    public final int LLLIIIIL(int i) {
        VEEditor LJ = LJ();
        LJ.getClass();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setPreviewFps = ");
        LIZ.append(i);
        P4Q.LJFF("VEEditor", X1D.LIZIZ(LIZ));
        LJ.LLIIII.setPreviewFps(i);
        return 0;
    }

    @Override // X.InterfaceC153045zY
    public final int LLLIIIL(boolean z) {
        String[] strArr;
        boolean z2;
        boolean z3;
        VEEditor LJ = LJ();
        synchronized (LJ) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("enableReversePlay:");
            LIZ.append(z);
            P4Q.LJII("VEEditor", X1D.LIZIZ(LIZ));
            VEEditorResManager vEEditorResManager = LJ.LJLJJLL;
            if (!vEEditorResManager.mReverseDone) {
                P4Q.LIZJ("VEEditor", "enableReversePlay error: reverse video is not ready!");
                return -100;
            }
            String[] strArr2 = vEEditorResManager.mReverseVideoPath;
            if (strArr2 == null || strArr2.length <= 0) {
                P4Q.LIZJ("VEEditor", "enableReversePlay error: reverse video path is invalid!");
                return -105;
            }
            TEVideoUtils.nativeCancelCompileProbe();
            long durationUs = LJ.LLIIII.getDurationUs();
            LJ.LLIIII.stop();
            if (z) {
                strArr = LJ.LJLJJLL.mReverseVideoPath;
            } else {
                strArr = LJ.LJLJJLL.mVideoPaths;
            }
            int updateTrackClips = LJ.LLIIII.updateTrackClips(0, 0, strArr);
            if (updateTrackClips != 0) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("updateTrackClips failed, ret = ");
                LIZ2.append(updateTrackClips);
                P4Q.LIZJ("VEEditor", X1D.LIZIZ(LIZ2));
                return updateTrackClips;
            }
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("enableReversePlay: mReverseAudioPaths == null: ");
            if (LJ.LJLJJLL.mReverseAudioPaths == null) {
                z2 = true;
            } else {
                z2 = false;
            }
            LIZ3.append(z2);
            P4Q.LJFF("VEEditor", X1D.LIZIZ(LIZ3));
            StringBuilder LIZ4 = X1D.LIZ();
            LIZ4.append("enableReversePlay: mOriginalSoundTrackType = ");
            LIZ4.append(LJ.LJLJJLL.mOriginalSoundTrackType);
            P4Q.LJFF("VEEditor", X1D.LIZIZ(LIZ4));
            VEEditorResManager vEEditorResManager2 = LJ.LJLJJLL;
            String[] strArr3 = vEEditorResManager2.mReverseAudioPaths;
            if (strArr3 != null && vEEditorResManager2.mOriginalSoundTrackType != 1) {
                TEInterface tEInterface = LJ.LLIIII;
                int addAudioTrack = tEInterface.addAudioTrack(strArr3[0], 0, tEInterface.getDuration(), 0, LJ.LLIIII.getDuration(), false);
                LJ.LJLJJLL.mOriginalSoundTrackIndex = LJ.LJLZ.LIZ(addAudioTrack);
                VEEditorResManager vEEditorResManager3 = LJ.LJLJJLL;
                vEEditorResManager3.mOriginalSoundTrackType = 1;
                vEEditorResManager3.mReverseAudioDone = true;
                StringBuilder LIZ5 = X1D.LIZ();
                LIZ5.append("enableReversePlay: add org audio track index = ");
                LIZ5.append(LJ.LJLJJLL.mOriginalSoundTrackIndex);
                LIZ5.append(" mOriginalSoundTrackType = ");
                LIZ5.append(LJ.LJLJJLL.mOriginalSoundTrackType);
                P4Q.LJII("VEEditor", X1D.LIZIZ(LIZ5));
            }
            TEInterface tEInterface2 = LJ.LLIIII;
            if (z != LJ.LLIZ) {
                z3 = true;
            } else {
                z3 = false;
            }
            tEInterface2.updateTrackFilterDuration(0, 0, z3, durationUs);
            LJ.LLIIII.createTimeline();
            int prepareEngine = LJ.LLIIII.prepareEngine(0);
            if (prepareEngine != 0) {
                StringBuilder LIZ6 = X1D.LIZ();
                LIZ6.append("enableReversePlay() prepareEngine failed: result: ");
                LIZ6.append(prepareEngine);
                P4Q.LIZJ("VEEditor", X1D.LIZIZ(LIZ6));
                return prepareEngine;
            }
            LJ.LJLJJI.getClass();
            LJ.LJJIJIIJIL(0, VEEditor.SEEK_MODE.EDITOR_SEEK_FLAG_LastSeek);
            LJ.LLIZ = z;
            if (z) {
                C63870P4w c63870P4w = new C63870P4w();
                c63870P4w.LIZJ("iesve_veeditor_time_effect_id", "reverse");
                C63867P4t.LIZLLL("iesve_veeditor_time_effect", c63870P4w);
                LJ.LLJILJILJ.getClass();
            }
            return 0;
        }
    }

    @Override // X.InterfaceC153045zY
    public final void LLLIIL(Bitmap bitmap) {
        VEEditor LJ = LJ();
        if (LJ.LLF.get()) {
            P4Q.LJII("VEEditor", "no need to setPreviewSurfaceBitmap, is destroying, just return");
        } else {
            P4Q.LJFF("VEEditor", "setPreviewSurfaceBitmap...");
            LJ.LLIIII.setPreviewSurfaceBitmap(bitmap, true);
        }
    }

    @Override // X.InterfaceC153045zY
    public final void LLLIL(InterfaceC133845Nc interfaceC133845Nc) {
        VEEditor LJ = LJ();
        synchronized (LJ) {
            if (LJ.LLIIII != null) {
                P4Q.LJII("VEEditor", "onRelease Async... ");
                LJ.LJLLJ = interfaceC133845Nc;
                LJ.LLIIII.stop();
                LJ.LLIIII.releaseEngineAsync();
            }
        }
    }

    @Override // X.InterfaceC153045zY
    public final int cancelGenVideoFrame(int i) {
        return LJ().LJLJI.cancelGenVideoFrame(i);
    }

    @Override // X.InterfaceC153045zY
    public final float[] getInfoStickerBoundingBox(int i) {
        float[] infoStickerBoundingBox;
        YOC yoc = LJ().LJLILLLLZI;
        if (yoc == null) {
            P4Q.LIZJ("VEEditor", "getInfoStickerBoundingBox STICKER IS NOT SUPPORT !!!");
            infoStickerBoundingBox = null;
        } else {
            infoStickerBoundingBox = yoc.getInfoStickerBoundingBox(i);
        }
        for (int i2 = 0; i2 < infoStickerBoundingBox.length; i2++) {
        }
        return infoStickerBoundingBox;
    }

    @Override // X.InterfaceC153045zY
    public final int removeInfoSticker(int i) {
        YOC yoc = LJ().LJLILLLLZI;
        if (yoc == null) {
            P4Q.LIZJ("VEEditor", "removeInfoSticker STICKER IS NOT SUPPORT !!!");
            return -901;
        }
        return yoc.removeInfoSticker(i);
    }

    @Override // X.InterfaceC153045zY
    public final int setInfoStickerRestoreMode(int i) {
        YOC yoc = LJ().LJLILLLLZI;
        if (yoc == null) {
            P4Q.LIZJ("VEEditor", "setInfoStickerRestoreMode STICKER IS NOT SUPPORT !!!");
            return -901;
        }
        return yoc.setInfoStickerRestoreMode(i);
    }

    public YO7(VEEditor vEEditor, YOG yog) {
        this.LIZ = new C63078OpG();
        this.LIZIZ = new Rect();
        this.LIZLLL = new ArrayList();
        this.LJ = C221108m2.LIZIZ(new AqS165S0100000_15(this, 728));
        this.LJFF = -1;
        this.LJI = new CopyOnWriteArrayList<>();
        this.LJII = new YOJ(this);
        this.LJIIIIZZ = new CopyOnWriteArrayList<>();
        this.LJIIIZ = new C82642Wc2(this);
        this.LJIIJ = new CopyOnWriteArrayList<>();
        this.LJIIJJI = new C82643Wc3(this);
        this.LJIILL = C221108m2.LIZIZ(new AqS165S0100000_15(this, 729));
        this.LJIILJJIL = vEEditor;
        this.LJIILIIL = yog;
        yog.LIZ = vEEditor;
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

    @Override // X.InterfaceC153045zY
    public final boolean LLIILZL(String str, VEVideoEncodeSettings vEVideoEncodeSettings) {
        return LJ().LJIIIIZZ(str, null, vEVideoEncodeSettings);
    }

    @Override // X.InterfaceC153045zY
    public final int LLIL(int i, InterfaceC133855Nd interfaceC133855Nd) {
        return LJ().LJLJI.beginGenVideoFrames(i, 1, true, interfaceC133855Nd);
    }

    @Override // X.InterfaceC153045zY
    public final int LLILLL(String str, String str2) {
        VEEditor LJ = LJ();
        synchronized (LJ) {
            P4Q.LJII("VEEditor", "addMetadata...");
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                LJ.LLIIII.addMetaData(str, str2);
                return 0;
            }
            return -100;
        }
    }

    @Override // X.InterfaceC153045zY
    public final boolean LLILZIL(float f, int i) {
        return LJ().LJJJJ(f, i, 1);
    }

    @Override // X.InterfaceC153045zY
    public final int LLIZ(int i, VEEditor.SET_RANGE_MODE mode) {
        int prepareEngine;
        o.LJIIIZ(mode, "mode");
        YOU you = LJ().LJLJJL;
        synchronized (you.LIZ) {
            C63870P4w c63870P4w = new C63870P4w();
            c63870P4w.LIZIZ(i, "iesve_veeditor_cut_duration");
            C63867P4t.LIZLLL("iesve_veeditor_cut_duration", c63870P4w);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("setInOut... ");
            LIZ.append(0);
            LIZ.append(" ");
            LIZ.append(i);
            LIZ.append(" mode ");
            LIZ.append(mode.getValue());
            P4Q.LJFF("VEEditor_VESequenceInvoker", X1D.LIZIZ(LIZ));
            you.LIZIZ.stop();
            you.LIZIZ.setTimeRange(0, i, mode.getValue());
            prepareEngine = you.LIZIZ.prepareEngine(0);
        }
        return prepareEngine;
    }

    @Override // X.InterfaceC153045zY
    public final void LLJ(int i, int i2) {
        VEEditor LJ = LJ();
        LJ.getClass();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setMaxWidthHeight... width:");
        LIZ.append(i);
        LIZ.append(", height:");
        LIZ.append(i2);
        P4Q.LJFF("VEEditor", X1D.LIZIZ(LIZ));
        LJ.LLIIII.setMaxWidthHeight(i, i2);
    }

    @Override // X.InterfaceC153045zY
    public final void LLJIJIL(int i, int i2) {
        LJ().LJJJJI(i, i2);
    }

    @Override // X.InterfaceC153045zY
    public final VESize LLJJIII(int i, int i2) {
        VEEditor LJ = LJ();
        LJ.getClass();
        VESize vESize = new VESize(0, 0);
        VESize vESize2 = LJ.LJLJL;
        float f = vESize2.width;
        float f2 = vESize2.height;
        float f3 = i;
        float f4 = i2;
        if (f / f2 > f3 / f4) {
            vESize.width = i;
            vESize.height = (int) (f3 / (vESize2.width / f2));
        } else {
            vESize.height = i2;
            vESize.width = (int) (f4 / (vESize2.height / f));
        }
        StringBuilder LIZJ = C06460Ne.LIZJ("getInitSize... surfaceWidth:", i, ", surfaceHeight:", i2, ", width:");
        LIZJ.append(vESize.width);
        LIZJ.append(", height:");
        C01R.LIZJ(LIZJ, vESize.height, LIZJ, "VEEditor");
        return vESize;
    }

    @Override // X.InterfaceC153045zY
    public final int LLJJIJIIJIL(int i, ROTATE_DEGREE degree) {
        o.LJIIIZ(degree, "degree");
        YOU you = LJ().LJLJJL;
        you.getClass();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setFileRotate...");
        LIZ.append(0);
        LIZ.append(" ");
        LIZ.append(i);
        LIZ.append(" ");
        LIZ.append(degree);
        P4Q.LJFF("VEEditor_VESequenceInvoker", X1D.LIZIZ(LIZ));
        TEInterface tEInterface = you.LIZIZ;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("");
        LIZ2.append(degree.ordinal());
        return tEInterface.setClipAttr(0, 0, i, "clip rotate", X1D.LIZIZ(LIZ2));
    }

    @Override // X.InterfaceC153045zY
    public final int LLJJJIL(int i, VEEditor.SEEK_MODE flags) {
        o.LJIIIZ(flags, "flags");
        LJFF().removeMessages(100);
        LJFF().sendEmptyMessage(100);
        this.LJFF = i;
        return LJ().LJJIJIIJIL(i, flags);
    }

    @Override // X.InterfaceC153045zY
    public final int LLJLILLLLZIIL(int i, int i2) {
        YOU you = LJ().LJLJJL;
        synchronized (you.LIZ) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("moveClip, trackType:");
            LIZ.append(0);
            LIZ.append(" from:");
            LIZ.append(i);
            LIZ.append(" to:");
            LIZ.append(i2);
            LIZ.append(" isMoveEffect:");
            LIZ.append(true);
            P4Q.LJII("VEEditor_VESequenceInvoker", X1D.LIZIZ(LIZ));
            you.LIZIZ.stop();
            int moveClip = you.LIZIZ.moveClip(0, i, i2, true);
            if (moveClip < 0) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("moveClip failed, ret = ");
                LIZ2.append(moveClip);
                P4Q.LIZJ("VEEditor_VESequenceInvoker", X1D.LIZIZ(LIZ2));
            } else {
                VEEditor vEEditor = you.LIZ;
                vEEditor.LLII = 0;
                moveClip = vEEditor.LJJIJ();
                if (moveClip == 0) {
                    return 0;
                }
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("Prepare Engine failed, ret = ");
                LIZ3.append(moveClip);
                P4Q.LIZJ("VEEditor_VESequenceInvoker", X1D.LIZIZ(LIZ3));
            }
            return moveClip;
        }
    }

    @Override // X.InterfaceC153045zY
    public final int LLLFZ(int i, int i2) {
        int prepareEngine;
        YOU you = LJ().LJLJJL;
        synchronized (you.LIZ) {
            C63870P4w c63870P4w = new C63870P4w();
            c63870P4w.LIZIZ(i2 - i, "iesve_veeditor_cut_duration");
            C63867P4t.LIZLLL("iesve_veeditor_cut_duration", c63870P4w);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("setInOut... ");
            LIZ.append(i);
            LIZ.append(" ");
            LIZ.append(i2);
            P4Q.LJFF("VEEditor_VESequenceInvoker", X1D.LIZIZ(LIZ));
            you.LIZIZ.stop();
            you.LIZIZ.setTimeRange(i, i2, 0);
            prepareEngine = you.LIZIZ.prepareEngine(0);
        }
        return prepareEngine;
    }

    @Override // X.InterfaceC153045zY
    public final int LLLI(boolean[] zArr, C5RU c5ru) {
        return LJ().LJI(zArr, c5ru.LIZ, c5ru.LIZIZ, c5ru.LIZJ, c5ru.LIZLLL, c5ru.LJ, c5ru.LJFF, c5ru.LJI, c5ru.LJII, c5ru.LJIIIIZZ, c5ru.LJIIIZ, c5ru.LJIIJ);
    }

    @Override // X.InterfaceC153045zY
    public final int addInfoSticker(String path, String[] strArr) {
        int addInfoSticker;
        o.LJIIIZ(path, "path");
        YOC yoc = LJ().LJLILLLLZI;
        if (yoc == null) {
            P4Q.LIZJ("VEEditor", "addInfoSticker 1 STICKER IS NOT SUPPORT !!!");
            addInfoSticker = -901;
        } else {
            addInfoSticker = yoc.addInfoSticker(path, strArr);
        }
        if (strArr != null) {
            for (int i = 0; i < strArr.length; i++) {
            }
        }
        return addInfoSticker;
    }

    @Override // X.InterfaceC153045zY
    public final int getSrtInfoStickerInitPosition(int i, float[] fArr) {
        YOC yoc = LJ().LJLILLLLZI;
        if (yoc == null) {
            P4Q.LIZJ("VEEditor", "getSrtInfoStickerInitPosition STICKER IS NOT SUPPORT !!!");
            return -901;
        }
        return yoc.getSrtInfoStickerInitPosition(i, fArr);
    }

    @Override // X.InterfaceC153045zY
    public final int setInfoStickerAlpha(int i, float f) {
        YOC yoc = LJ().LJLILLLLZI;
        if (yoc == null) {
            P4Q.LIZJ("VEEditor", "setInfoStickerAlpha STICKER IS NOT SUPPORT !!!");
            return -901;
        }
        return yoc.setInfoStickerAlpha(i, f);
    }

    @Override // X.InterfaceC153045zY
    public final int setInfoStickerLayer(int i, int i2) {
        YOC yoc = LJ().LJLILLLLZI;
        if (yoc == null) {
            P4Q.LIZJ("VEEditor", "setInfoStickerLayer STICKER IS NOT SUPPORT !!!");
            return -901;
        }
        return yoc.setInfoStickerLayer(i, i2);
    }

    @Override // X.InterfaceC153045zY
    public final int setInfoStickerRotation(int i, float f) {
        YOC yoc = LJ().LJLILLLLZI;
        if (yoc == null) {
            P4Q.LIZJ("VEEditor", "setInfoStickerRotation STICKER IS NOT SUPPORT !!!");
            return -901;
        }
        return yoc.setInfoStickerRotation(i, f);
    }

    @Override // X.InterfaceC153045zY
    public final int setInfoStickerScale(int i, float f) {
        YOC yoc = LJ().LJLILLLLZI;
        if (yoc == null) {
            P4Q.LIZJ("VEEditor", "setInfoStickerScale STICKER IS NOT SUPPORT !!!");
            return -901;
        }
        return yoc.setInfoStickerScale(i, f);
    }

    @Override // X.InterfaceC153045zY
    public final int updateTrackFilterParam(int i, VEBaseFilterParam param) {
        o.LJIIIZ(param, "param");
        return LJ().LJJJJLI(i, param);
    }

    @Override // X.InterfaceC153045zY
    public final int I7(int i, int i2, VEBaseFilterParam param) {
        o.LJIIIZ(param, "param");
        return LJ().LJJJJL(i, i2, param);
    }

    @Override // X.InterfaceC153045zY
    public final int LLD(int i, int i2, C6YZ c6yz) {
        int i3;
        int i4;
        this.LJFF = i;
        VEEditor LJ = LJ();
        synchronized (LJ) {
            LJ.LLJILJIL = c6yz;
            LJ.LLIIII.setSeekFrameCallback(LJ.LLJLIL);
            i3 = -1;
            if (i2 > 0) {
                VESize LJJI = LJ.LJJI();
                int i5 = LJJI.width;
                if (i5 != 0 && (i4 = LJJI.height) != 0) {
                    if (i2 >= i5) {
                        i2 = i5;
                    } else {
                        i4 = (i4 * i2) / i5;
                    }
                    if (i2 % 2 == 1) {
                        i2++;
                    }
                    i3 = i2;
                    if (i4 % 2 == 1) {
                        i4++;
                    }
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("seekWithResult... ");
                    LIZ.append(i);
                    LIZ.append(", (");
                    LIZ.append(i3);
                    LIZ.append(", ");
                    LIZ.append(i4);
                    LIZ.append(")");
                    P4Q.LJII("VEEditor", X1D.LIZIZ(LIZ));
                }
            } else {
                i4 = -1;
            }
            i3 = LJ.LLIIII.seekWithResult(i, i3, i4);
            if (i3 != 0) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("seek failed, result = ");
                LIZ2.append(i3);
                P4Q.LIZJ("VEEditor", X1D.LIZIZ(LIZ2));
                LJ.LLJILJIL = null;
            }
        }
        return i3;
    }

    @Override // X.InterfaceC153045zY
    public final int LLIIIZ(VETimelineParams sceneTime, int i, int i2) {
        o.LJIIIZ(sceneTime, "sceneTime");
        YOU you = LJ().LJLJJL;
        you.getClass();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("updateSceneTime with start/end time");
        LIZ.append(sceneTime.toString());
        LIZ.append(" startTime: ");
        LIZ.append(i);
        LIZ.append(" endTime: ");
        LIZ.append(i2);
        P4Q.LJII("VEEditor_VESequenceInvoker", X1D.LIZIZ(LIZ));
        synchronized (you.LIZ) {
            you.LIZIZ.stop();
            int updateSenceTime = you.LIZIZ.updateSenceTime(sceneTime);
            if (updateSenceTime < 0) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("updateSceneTime failed, ret = ");
                LIZ2.append(updateSenceTime);
                P4Q.LIZJ("VEEditor_VESequenceInvoker", X1D.LIZIZ(LIZ2));
                return updateSenceTime;
            }
            you.LIZ.LLII = 0;
            you.LIZIZ.setTimeRange(i, i2, 0);
            int prepareEngine = you.LIZIZ.prepareEngine(0);
            if (prepareEngine != 0) {
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("Prepare Engine failed, ret = ");
                LIZ3.append(prepareEngine);
                P4Q.LIZJ("VEEditor_VESequenceInvoker", X1D.LIZIZ(LIZ3));
                return prepareEngine;
            }
            return 0;
        }
    }

    @Override // X.InterfaceC153045zY
    public final int LLJJJJJIL(int i, VEEditor.SEEK_MODE flags, InterfaceC133865Ne interfaceC133865Ne) {
        int seek;
        o.LJIIIZ(flags, "flags");
        this.LJFF = i;
        VEEditor LJ = LJ();
        synchronized (LJ) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("seek with cb... ");
            LIZ.append(i);
            LIZ.append(" flags ");
            LIZ.append(flags);
            P4Q.LJII("VEEditor", X1D.LIZIZ(LIZ));
            if ((flags.getValue() & VEEditor.SEEK_MODE.EDITOR_SEEK_FLAG_LastSeek.getValue()) != 0) {
                LJ.LJLL = interfaceC133865Ne;
                long currentTimeMillis = System.currentTimeMillis();
                LJ.LLIL = currentTimeMillis;
                if (LJ.LLIILZL == 0) {
                    LJ.LLIILZL = currentTimeMillis;
                }
            }
            seek = LJ.LLIIII.seek(i, LJ.LLFFF, LJ.LLFII, flags.getValue());
            if (seek != 0) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("seek failed, result = ");
                LIZ2.append(seek);
                P4Q.LIZJ("VEEditor", X1D.LIZIZ(LIZ2));
                LJ.LJLL = null;
            }
        }
        return seek;
    }

    @Override // X.InterfaceC153045zY
    public final int LLJLLIL(int i, ArrayList arrayList, ArrayList arrayList2) {
        int i2 = i;
        YOU you = LJ().LJLJJL;
        synchronized (you.LIZ) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("insertClip, trackType:");
            LIZ.append(0);
            LIZ.append("clipIndex:");
            LIZ.append(i2);
            P4Q.LJII("VEEditor_VESequenceInvoker", X1D.LIZIZ(LIZ));
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("index: ");
                LIZ2.append(i3);
                LIZ2.append("clipSourceParams: ");
                LIZ2.append(((VEClipSourceParam) arrayList.get(i3)).toString());
                P4Q.LJII("VEEditor_VESequenceInvoker", X1D.LIZIZ(LIZ2));
            }
            for (int i4 = 0; i4 < arrayList2.size(); i4++) {
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("index: ");
                LIZ3.append(i4);
                LIZ3.append("clipTimelineParams: ");
                LIZ3.append(((VEClipTimelineParam) arrayList2.get(i4)).toString());
                P4Q.LJII("VEEditor_VESequenceInvoker", X1D.LIZIZ(LIZ3));
            }
            you.LIZIZ.stop();
            for (int i5 = 0; i5 < arrayList.size(); i5++) {
                int insertClip = you.LIZIZ.insertClip(0, 0, i2, (VEClipSourceParam) arrayList.get(i5), (VEClipTimelineParam) arrayList2.get(i5));
                if (insertClip < 0) {
                    StringBuilder LIZ4 = X1D.LIZ();
                    LIZ4.append("insertClip failed, ret = ");
                    LIZ4.append(insertClip);
                    P4Q.LIZJ("VEEditor_VESequenceInvoker", X1D.LIZIZ(LIZ4));
                    return insertClip;
                }
                i2++;
            }
            you.LIZ.LLII = 0;
            TEInterface tEInterface = you.LIZIZ;
            tEInterface.setTimeRange(0, tEInterface.getDuration(), 1);
            int LJJIJ = you.LIZ.LJJIJ();
            if (LJJIJ == 0) {
                return 0;
            }
            StringBuilder LIZ5 = X1D.LIZ();
            LIZ5.append("Prepare Engine failed, ret = ");
            LIZ5.append(LJJIJ);
            P4Q.LIZJ("VEEditor_VESequenceInvoker", X1D.LIZIZ(LIZ5));
            return LJJIJ;
        }
    }

    @Override // X.InterfaceC153045zY
    public final int LLLIIII(VEImageTransformFilterParam vEImageTransformFilterParam, int i, int i2) {
        return LJ().LJFF(0, 0, vEImageTransformFilterParam, i, i2);
    }

    @Override // X.InterfaceC153045zY
    public final int setInfoStickerPosition(int i, float f, float f2) {
        YOC yoc = LJ().LJLILLLLZI;
        if (yoc == null) {
            P4Q.LIZJ("VEEditor", "setInfoStickerPosition STICKER IS NOT SUPPORT !!!");
            return -901;
        }
        return yoc.setInfoStickerPosition(i, f, f2);
    }

    @Override // X.InterfaceC153045zY
    public final int setInfoStickerTime(int i, int i2, int i3) {
        YOC yoc = LJ().LJLILLLLZI;
        if (yoc == null) {
            P4Q.LIZJ("VEEditor", "setInfoStickerTime STICKER IS NOT SUPPORT !!!");
            return -901;
        }
        return yoc.setInfoStickerTime(i, i2, i3);
    }

    @Override // X.InterfaceC153045zY
    public final void LIZ(int i, int i2, int i3, int i4) {
        this.LIZIZ.set(i, i2, i3, i4);
        VEEditor LJ = LJ();
        LJ.getClass();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setDisplayPos... ");
        LIZ.append(i);
        LIZ.append(" ");
        LIZ.append(i2);
        C1EU.LIZJ(LIZ, " ", i3, " ", i4);
        P4Q.LJFF("VEEditor", X1D.LIZIZ(LIZ));
        LJ.LJJIL(i3 / LJ.LLFZ, i4 / LJ.LLI, 0.0f, -(((LJ.LLFFF / 2) - (i3 / 2)) - i), ((LJ.LLFII / 2) - (i4 / 2)) - i2);
    }

    @Override // X.InterfaceC153045zY
    public final boolean LLF(String str, String str2, VEVideoEncodeSettings settings, InterfaceC134045Nw interfaceC134045Nw) {
        o.LJIIIZ(settings, "settings");
        return LJ().LJIIJ(str, str2, settings, interfaceC134045Nw);
    }

    @Override // X.InterfaceC153045zY
    public final int LLIIL(String str, int i, int i2, int i3) {
        YOU you = LJ().LJLJJL;
        synchronized (you.LIZ) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("addAudioTrack... ");
            LIZ.append(str);
            LIZ.append(" In ");
            LIZ.append(0);
            LIZ.append(" Out ");
            LIZ.append(i);
            LIZ.append(" SeqIn ");
            LIZ.append(i2);
            LIZ.append(" seqOut ");
            LIZ.append(i3);
            LIZ.append(" ");
            LIZ.append(false);
            LIZ.append(" ");
            LIZ.append(false);
            P4Q.LJII("VEEditor_VESequenceInvoker", X1D.LIZIZ(LIZ));
            if (!TextUtils.isEmpty(str)) {
                if (i > 0) {
                    if (i3 > i2 && i2 >= 0) {
                        int i4 = 0;
                        int LIZ2 = you.LIZ.LJLZ.LIZ(you.LIZIZ.addAudioTrack(str, (String) null, i2, i3, 0, i, false, false));
                        try {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("path", str);
                            jSONObject.put("sequenceIn", i2);
                            jSONObject.put("sequenceOut", i3);
                            jSONObject.put("trimIn", 0);
                            jSONObject.put("trimOut", i);
                            if (LIZ2 < 0) {
                                i4 = LIZ2;
                            }
                            jSONObject.put("resultCode", i4);
                            c.LIZ("vesdk_event_editor_audio_track", "business", jSONObject);
                        } catch (JSONException e) {
                            C16880lQ.LLLLIIL(e);
                        }
                        P4Q.LJII("VEEditor_VESequenceInvoker", "addAudioTrack... " + LIZ2);
                        return LIZ2;
                    }
                }
            }
            return -100;
        }
    }

    @Override // X.InterfaceC153045zY
    public final String LLILLIZIL(int i, int i2, int i3, String str) {
        String clipInfoStringWithPath;
        YOU you = LJ().LJLJJL;
        synchronized (you.LIZ) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("getClipFileInfoStringWithPath... ");
            LIZ.append(i);
            LIZ.append(", ");
            LIZ.append(i2);
            LIZ.append(", ");
            LIZ.append(i3);
            P4Q.LJFF("VEEditor_VESequenceInvoker", X1D.LIZIZ(LIZ));
            clipInfoStringWithPath = you.LIZIZ.getClipInfoStringWithPath(i, i2, i3, str);
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("getClipInfoStringWithPath result ");
            LIZ2.append(clipInfoStringWithPath);
            P4Q.LJFF("VEEditor_VESequenceInvoker", X1D.LIZIZ(LIZ2));
        }
        return clipInfoStringWithPath;
    }

    @Override // X.InterfaceC153045zY
    public final void LLJJIJI(float f, float f2, float f3, int i, int i2) {
        LJ().LJJIL(f, f2, f3, i, i2);
    }

    @Override // X.InterfaceC153045zY
    public final int LLLII(int[] timeStamps, int i, int i2, VEEditor.GET_FRAMES_FLAGS flags, InterfaceC134015Nt interfaceC134015Nt) {
        int i3;
        o.LJIIIZ(timeStamps, "timeStamps");
        o.LJIIIZ(flags, "flags");
        this.LIZJ = true;
        VEEditor LJ = LJ();
        YOL yol = new YOL(this, interfaceC134015Nt);
        synchronized (LJ) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("getImages... width:");
            LIZ.append(i);
            LIZ.append(", height:");
            LIZ.append(i2);
            LIZ.append(", flags:");
            LIZ.append(flags);
            P4Q.LJFF("VEEditor", X1D.LIZIZ(LIZ));
            if (i == 0 || i2 == 0) {
                P4Q.LIZJ("VEEditor", "getImages error, size invalid");
                i3 = -100;
            } else {
                LJ.LLJIJIL = yol;
                LJ.LLIIII.setGetImageCallback(LJ.LLJL);
                i3 = LJ.LLIIII.getImages(timeStamps, i, i2, flags.getValue());
            }
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("resultCode", i3);
                jSONObject.put("has_effect", 1);
            } catch (JSONException e) {
                C16880lQ.LLLLIIL(e);
            }
            c.LIZ("vesdk_editor_get_frame", "performance", jSONObject);
        }
        return i3;
    }

    @Override // X.InterfaceC153045zY
    public final int addImageSticker(String path, float f, float f2, float f3, float f4) {
        o.LJIIIZ(path, "path");
        YOC yoc = LJ().LJLILLLLZI;
        if (yoc == null) {
            P4Q.LIZJ("VEEditor", "addImageSticker STICKER IS NOT SUPPORT !!!");
            return -901;
        }
        return yoc.addImageSticker(path, f, f2, f3, f4);
    }
}
