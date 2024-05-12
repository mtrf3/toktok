package X;

import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import com.bytedance.ies.nle.editor_jni.INLEAsyncRenderPlayStatusListener;
import com.bytedance.ies.nle.editor_jni.INLEResourceDownloadStatusListener;
import com.bytedance.ies.nle.editor_jni.LogLevel;
import com.bytedance.ies.nle.editor_jni.NLEChromaChannel;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEEditorJniJNI;
import com.bytedance.ies.nle.editor_jni.NLEError;
import com.bytedance.ies.nle.editor_jni.NLEListenerGetImageWrapper;
import com.bytedance.ies.nle.editor_jni.NLELoggerListener;
import com.bytedance.ies.nle.editor_jni.NLEMediaConfig;
import com.bytedance.ies.nle.editor_jni.NLEMediaJniJNI;
import com.bytedance.ies.nle.editor_jni.NLEMediaMessageListener;
import com.bytedance.ies.nle.editor_jni.NLEMediaPublicJniJNI;
import com.bytedance.ies.nle.editor_jni.NLEMediaRuntimeController;
import com.bytedance.ies.nle.editor_jni.NLEPlayer;
import com.bytedance.ies.nle.editor_jni.NLEResourceManager;
import com.bytedance.ies.nle.editor_jni.NLESegmentChromaChannel;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.o;

/* renamed from: X.5J1, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5J1 extends C5N3 implements InterfaceC132665Io {
    public C5JZ LJ;
    public C5J2 LJFF;
    public final List<C5JL> LJI;
    public final List<InterfaceC132745Iw> LJII;
    public C5JL LJIIIIZZ;
    public final ConcurrentHashMap<Long, AnonymousClass519> LJIIIZ;
    public InterfaceC132775Iz LJIIJ;
    public C5JX LJIIJJI;
    public C5JI LJIIL;
    public C5JK LJIILIIL;
    public SurfaceHolderCallbackC133805My LJIILJJIL;
    public SurfaceView LJIILL;
    public TextureView LJIILLIIL;
    public InterfaceC134005Ns LJIIZILJ;
    public final AtomicBoolean LJIJ;
    public final AtomicBoolean LJIJI;
    public InterfaceC125914wt LJIJJ;
    public final C62822Ol8 LJIJJLI;
    public final AtomicBoolean LJIL;
    public final List<INLEResourceDownloadStatusListener> LJJ;
    public C133205Kq LJJI;
    public NLEResourceManager LJJIFFI;
    public C5J0 LJJII;
    public final NLEMediaConfig LJJIII;
    public NLEEditor LJJIIJ;

    public final Gson LJII() {
        return (Gson) this.LJIJJLI.getValue();
    }

    @Override // X.InterfaceC132665Io
    public final int B3() {
        int i;
        synchronized (this.LIZLLL) {
            NLEPlayer LJIIIZ = LJIIIZ();
            if (LJIIIZ != null) {
                i = NLEMediaPublicJniJNI.NLEPlayer_flushSeekCmd(LJIIIZ.LIZ, LJIIIZ);
            } else {
                i = -1;
            }
        }
        return i;
    }

    @Override // X.InterfaceC132665Io
    public final int LIZIZ() {
        synchronized (this.LIZLLL) {
            NLEPlayer LJIIIZ = LJIIIZ();
            if (LJIIIZ != null) {
                int NLEPlayer_releaseResource = NLEMediaPublicJniJNI.NLEPlayer_releaseResource(LJIIIZ.LIZ, LJIIIZ);
                LIZLLL();
                return NLEPlayer_releaseResource;
            }
            return -1;
        }
    }

    @Override // X.InterfaceC132695Ir
    public final int LIZJ() {
        int i;
        synchronized (this.LIZLLL) {
            NLEPlayer LJIIIZ = LJIIIZ();
            if (LJIIIZ != null) {
                i = NLEMediaPublicJniJNI.NLEPlayer_refreshCurrentFrame(LJIIIZ.LIZ, LJIIIZ, 0);
            } else {
                i = -1;
            }
        }
        return i;
    }

    public final void LJI() {
        if (this.LJ == null) {
            NLEMediaConfig nLEMediaConfig = this.LJJIII;
            C5JZ c5jz = new C5JZ(NLEMediaJniJNI.NLEMediaConfig_enableCatchExceptionInCallback_get(nLEMediaConfig.LIZ, nLEMediaConfig));
            NLEPlayer LJIIIZ = LJIIIZ();
            if (LJIIIZ != null) {
                NLEMediaPublicJniJNI.NLEPlayer_addMessageListener(LJIIIZ.LIZ, LJIIIZ, NLEMediaMessageListener.getCPtr(c5jz), c5jz);
            }
            c5jz.delete();
            this.LJ = c5jz;
        }
    }

    public final NLEMediaRuntimeController LJIIIIZZ() {
        C5N2 c5n2 = this.LIZLLL;
        if (c5n2.LJIILIIL == null || c5n2.LIZJ.get()) {
            return null;
        }
        return (NLEMediaRuntimeController) c5n2.LIZLLL.getValue();
    }

    public final NLEPlayer LJIIIZ() {
        return this.LIZLLL.LIZJ();
    }

    public final void LJIIJJI() {
        if (this.LJJI == null) {
            this.LJJI = new C133205Kq(this);
        }
        NLEPlayer LJIIIZ = LJIIIZ();
        if (LJIIIZ != null) {
            C133205Kq c133205Kq = this.LJJI;
            NLEMediaPublicJniJNI.NLEPlayer_addNLEResourceDownloadStatusListener(LJIIIZ.LIZ, LJIIIZ, INLEResourceDownloadStatusListener.getCPtr(c133205Kq), c133205Kq);
        }
    }

    public final void LJIIL() {
        if (this.LJFF == null) {
            C5J2 c5j2 = new C5J2(this);
            C5JZ c5jz = this.LJ;
            if (c5jz != null) {
                ((ArrayList) c5jz.LIZ).add(c5j2);
            }
            this.LJFF = c5j2;
        }
    }

    public final void LJIILIIL() {
        SurfaceHolder holder;
        if (this.LJIILL == null) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        SurfaceView surfaceView = this.LJIILL;
        if (surfaceView != null && (holder = surfaceView.getHolder()) != null) {
            holder.removeCallback(this.LJIILJJIL);
        }
        NLEPlayer LJIIIZ = LJIIIZ();
        if (LJIIIZ != null) {
            NLEMediaPublicJniJNI.NLEPlayer_releaseAndroidSurface(LJIIIZ.LIZ, LJIIIZ);
        }
        this.LJIILL = null;
        NLELoggerListener logger = com.bytedance.ies.nleeditor.NLE.INSTANCE.getLogger();
        if (logger != null) {
            LogLevel logLevel = LogLevel.LEVEL_INFO;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("NLEVEPublic2: unbindSurfaceView ");
            LIZ.append(hashCode());
            LIZ.append(" cost: ");
            LIZ.append(System.currentTimeMillis() - currentTimeMillis);
            LIZ.append(" ms");
            logger.onLog(logLevel, X1D.LIZIZ(LIZ));
        }
    }

    public final int LJIILJJIL() {
        synchronized (this.LIZLLL) {
            this.LJIJ.set(false);
            NLEPlayer LJIIIZ = LJIIIZ();
            if (LJIIIZ != null) {
                NLEMediaPublicJniJNI.NLEPlayer_stop(LJIIIZ.LIZ, LJIIIZ);
                return NLEMediaPublicJniJNI.NLEPlayer_releaseEngine__SWIG_1(LJIIIZ.LIZ, LJIIIZ);
            }
            return -1;
        }
    }

    public final void LJJI() {
        NLEMediaConfig nLEMediaConfig = this.LJJIII;
        if (NLEMediaJniJNI.NLEMediaConfig_enableReleaseSurfaceLock_get(nLEMediaConfig.LIZ, nLEMediaConfig)) {
            synchronized (this.LIZLLL) {
                LJIILIIL();
            }
            return;
        }
        LJIILIIL();
    }

    @Override // X.InterfaceC132665Io
    public final EnumC135185Sg LJJIL() {
        EnumC135185Sg swigToEnum;
        if (this.LJIJI.get()) {
            return EnumC135185Sg.DESTROYING;
        }
        NLEPlayer LJIIIZ = LJIIIZ();
        if (LJIIIZ != null && (swigToEnum = EnumC135185Sg.swigToEnum(NLEMediaPublicJniJNI.NLEPlayer_state(LJIIIZ.LIZ, LJIIIZ))) != null) {
            return swigToEnum;
        }
        return EnumC135185Sg.ENGINE_NOT_CRATED;
    }

    @Override // X.InterfaceC132695Ir
    public final int destroy() {
        Integer num;
        SurfaceHolder holder;
        synchronized (this.LIZLLL) {
            int i = -1;
            if (this.LJIL.get()) {
                NLELoggerListener logger = com.bytedance.ies.nleeditor.NLE.INSTANCE.getLogger();
                if (logger != null) {
                    logger.onLog(LogLevel.LEVEL_ERROR, "has already destroyed!");
                }
                return -1;
            }
            this.LJIJI.set(true);
            this.LJIJ.set(false);
            ((CopyOnWriteArrayList) this.LJII).clear();
            ((CopyOnWriteArrayList) this.LJI).clear();
            this.LJIIIIZZ = null;
            this.LJIIJ = null;
            this.LJJII = null;
            ((CopyOnWriteArrayList) this.LJJ).clear();
            this.LJJI = null;
            SurfaceView surfaceView = this.LJIILL;
            if (surfaceView != null && (holder = surfaceView.getHolder()) != null) {
                holder.removeCallback(this.LJIILJJIL);
            }
            this.LJIILL = null;
            TextureView textureView = this.LJIILLIIL;
            if (textureView != null) {
                textureView.setSurfaceTextureListener(null);
            }
            this.LJIILLIIL = null;
            NLEPlayer LJIIIZ = LJIIIZ();
            if (LJIIIZ != null) {
                num = Integer.valueOf(LJIIIZ.LIZIZ());
            } else {
                num = null;
            }
            LIZLLL();
            this.LIZLLL.LIZ();
            C5JI c5ji = this.LJIIL;
            if (c5ji != null) {
                c5ji.onDestroy();
            }
            this.LJIIL = null;
            this.LJIJI.set(false);
            this.LJIL.set(true);
            NLEMediaRuntimeController LJIIIIZZ = LJIIIIZZ();
            if (LJIIIIZZ != null) {
                NLEMediaPublicJniJNI.NLEMediaRuntimeController_clearAndroidImageHolder(LJIIIIZZ.LIZ, LJIIIIZZ);
            }
            if (num != null) {
                i = num.intValue();
            }
            return i;
        }
    }

    @Override // X.InterfaceC132695Ir
    public final long getDuration() {
        long j;
        synchronized (this.LIZLLL) {
            NLEPlayer LJIIIZ = LJIIIZ();
            if (LJIIIZ != null) {
                j = NLEMediaPublicJniJNI.NLEPlayer_getDuration(LJIIIZ.LIZ, LJIIIZ);
            } else {
                j = 0;
            }
        }
        return j;
    }

    @Override // X.InterfaceC132695Ir
    public final int pause() {
        synchronized (this.LIZLLL) {
            this.LJIJ.set(false);
            NLEPlayer LJIIIZ = LJIIIZ();
            if (LJIIIZ != null) {
                int NLEPlayer_pause = NLEMediaPublicJniJNI.NLEPlayer_pause(LJIIIZ.LIZ, LJIIIZ);
                C5JI c5ji = this.LJIIL;
                if (c5ji != null) {
                    c5ji.onPause();
                }
                Iterator<InterfaceC132745Iw> it = this.LJII.iterator();
                while (it.hasNext()) {
                    it.next().LJJJLL();
                }
                return NLEPlayer_pause;
            }
            return -1;
        }
    }

    @Override // X.InterfaceC132695Ir
    public final int play() {
        synchronized (this.LIZLLL) {
            NLEPlayer LJIIIZ = LJIIIZ();
            if (LJIIIZ != null) {
                this.LJIJ.set(true);
                int NLEPlayer_play = NLEMediaPublicJniJNI.NLEPlayer_play(LJIIIZ.LIZ, LJIIIZ);
                C5JI c5ji = this.LJIIL;
                if (c5ji != null) {
                    c5ji.LIZIZ();
                }
                return NLEPlayer_play;
            }
            return -1;
        }
    }

    @Override // X.InterfaceC132695Ir
    public final int prepare() {
        int i;
        synchronized (this.LIZLLL) {
            NLEPlayer LJIIIZ = LJIIIZ();
            if (LJIIIZ != null) {
                i = NLEMediaPublicJniJNI.NLEPlayer_prepare(LJIIIZ.LIZ, LJIIIZ);
            } else {
                i = -1;
            }
        }
        return i;
    }

    @Override // X.InterfaceC132695Ir
    public final int stop() {
        synchronized (this.LIZLLL) {
            this.LJIJ.set(false);
            NLEPlayer LJIIIZ = LJIIIZ();
            if (LJIIIZ != null) {
                int NLEPlayer_stop = NLEMediaPublicJniJNI.NLEPlayer_stop(LJIIIZ.LIZ, LJIIIZ);
                C5JI c5ji = this.LJIIL;
                if (c5ji != null) {
                    c5ji.onStop();
                }
                return NLEPlayer_stop;
            }
            return -1;
        }
    }

    @Override // X.InterfaceC132665Io
    public final void LJJJIL() {
        NLEPlayer LJIIIZ = LJIIIZ();
        if (LJIIIZ != null) {
            NLEMediaPublicJniJNI.NLEPlayer_cancelAsyncRender(LJIIIZ.LIZ, LJIIIZ);
        }
        LJIIJJI();
    }

    @Override // X.InterfaceC132695Ir
    public final long getCurrentPosition() {
        NLEPlayer LJIIIZ = LJIIIZ();
        if (LJIIIZ != null) {
            return NLEMediaPublicJniJNI.NLEPlayer_getCurrentPosition(LJIIIZ.LIZ, LJIIIZ);
        }
        return 0L;
    }

    public final void LJ(C125904ws c125904ws) {
        LJI();
        this.LJIJJ = c125904ws;
        LJIIL();
    }

    public final void LJFF(SurfaceView surfaceView) {
        if (surfaceView == null || o.LJ(surfaceView, this.LJIILL)) {
            return;
        }
        NLELoggerListener logger = com.bytedance.ies.nleeditor.NLE.INSTANCE.getLogger();
        if (logger != null) {
            LogLevel logLevel = LogLevel.LEVEL_INFO;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("NLEVEPublic2: ");
            LIZ.append(hashCode());
            LIZ.append(" bindSurfaceView ");
            LIZ.append(surfaceView.hashCode());
            logger.onLog(logLevel, X1D.LIZIZ(LIZ));
        }
        NLEPlayer LJIIIZ = LJIIIZ();
        if (LJIIIZ != null) {
            NLEMediaPublicJniJNI.NLEPlayer_setEditorMode(LJIIIZ.LIZ, LJIIIZ, EnumC123974tl.PREVIEW_ONLY.swigValue());
        }
        SurfaceHolderCallbackC133805My surfaceHolderCallbackC133805My = new SurfaceHolderCallbackC133805My(this);
        surfaceView.getHolder().addCallback(surfaceHolderCallbackC133805My);
        this.LJIILL = surfaceView;
        this.LJIILJJIL = surfaceHolderCallbackC133805My;
    }

    public final int LJIILLIIL(C5NU c5nu) {
        synchronized (this.LIZLLL) {
            this.LJIJ.set(false);
            NLEPlayer LJIIIZ = LJIIIZ();
            if (LJIIIZ != null) {
                this.LJIILIIL = c5nu;
                NLEMediaPublicJniJNI.NLEPlayer_stop(LJIIIZ.LIZ, LJIIIZ);
                return NLEMediaPublicJniJNI.NLEPlayer_releaseEngine__SWIG_0(LJIIIZ.LIZ, LJIIIZ, true);
            }
            return -1;
        }
    }

    public final int LJIIZILJ(long j) {
        return LJIJ(j, EnumC133595Md.EDITOR_SEEK_FLAG_LastSeek);
    }

    public final void LJIJJ(InterfaceC132775Iz interfaceC132775Iz) {
        if (interfaceC132775Iz != null) {
            LJI();
            this.LJIIJ = interfaceC132775Iz;
            LJIIL();
        }
    }

    public final void LJIJJLI(C5JL c5jl) {
        if (c5jl != null) {
            LJI();
            this.LJIIIIZZ = c5jl;
            LJIIL();
        }
    }

    public final int LJIL(long j) {
        NLEPlayer LJIIIZ = LJIIIZ();
        if (LJIIIZ != null) {
            return NLEMediaPublicJniJNI.NLEPlayer_setPlayRange__SWIG_1(LJIIIZ.LIZ, LJIIIZ, 0L, j);
        }
        return -1;
    }

    @Override // X.InterfaceC132665Io
    public final void LJJIZ(Y52 y52) {
        NLEPlayer LJIIIZ = LJIIIZ();
        if (LJIIIZ != null) {
            NLEMediaPublicJniJNI.NLEPlayer_setAsyncRenderPlayStatusListener(LJIIIZ.LIZ, LJIIIZ, INLEAsyncRenderPlayStatusListener.getCPtr(y52), y52);
        }
    }

    @Override // X.InterfaceC132665Io
    public final void LJJJ(NLEResourceManager resourceManager) {
        o.LJIIIZ(resourceManager, "resourceManager");
        this.LJJIFFI = resourceManager;
        NLEPlayer LJIIIZ = LJIIIZ();
        if (LJIIIZ != null) {
            NLEMediaPublicJniJNI.NLEPlayer_setResourceManager(LJIIIZ.LIZ, LJIIIZ, NLEResourceManager.getCPtr(resourceManager), resourceManager);
        }
    }

    @Override // X.InterfaceC132665Io
    public final void LJJJJ(Y51 y51) {
        ((CopyOnWriteArrayList) this.LJJ).add(y51);
    }

    @Override // X.InterfaceC132665Io
    public final void LJJJJI(C5JL c5jl) {
        if (c5jl != null) {
            LJI();
            ((CopyOnWriteArrayList) this.LJI).add(c5jl);
            LJIIL();
        }
    }

    @Override // X.InterfaceC132665Io
    public final void LJJJJJ(C5J0 c5j0) {
        if (c5j0 != null) {
            LJI();
            this.LJJII = c5j0;
            LJIIL();
            return;
        }
        this.LJJII = null;
    }

    @Override // X.InterfaceC132665Io
    public final void LJJJJJL(C5JL c5jl) {
        List<C5JL> list = this.LJI;
        if (list != null) {
            C65777Prh.LIZ(list).remove(c5jl);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.MutableCollection<T>");
    }

    @Override // X.InterfaceC132665Io
    public final int LJJJJL(int i) {
        int i2;
        synchronized (this.LIZLLL) {
            NLEPlayer LJIIIZ = LJIIIZ();
            if (LJIIIZ != null) {
                i2 = NLEMediaPublicJniJNI.NLEPlayer_refreshCurrentFrame(LJIIIZ.LIZ, LJIIIZ, i);
            } else {
                i2 = -1;
            }
        }
        return i2;
    }

    public final void LJIIJ(NLEChromaChannel nLEChromaChannel, String str) {
        Object fromJson = GsonProtectorUtils.fromJson(LJII(), str, (Class<Object>) C5J9.class);
        o.LJIIIIZZ(fromJson, "gson.fromJson(json,Chrom…nnelProperty::class.java)");
        C5J9 c5j9 = (C5J9) fromJson;
        NLESegmentChromaChannel LIZIZ = nLEChromaChannel.LIZIZ();
        o.LJIIIIZZ(LIZIZ, "it.segment");
        NLEEditorJniJNI.NLESegmentChromaChannel_setIntensity(LIZIZ.LIZJ, LIZIZ, c5j9.LJLILLLLZI.LJLIL);
        NLESegmentChromaChannel LIZIZ2 = nLEChromaChannel.LIZIZ();
        o.LJIIIIZZ(LIZIZ2, "it.segment");
        NLEEditorJniJNI.NLESegmentChromaChannel_setShadow(LIZIZ2.LIZJ, LIZIZ2, c5j9.LJLJI.LJLIL);
        if (c5j9.LJLIL.LJLIL != -1) {
            NLESegmentChromaChannel LIZIZ3 = nLEChromaChannel.LIZIZ();
            o.LJIIIIZZ(LIZIZ3, "it.segment");
            NLEEditorJniJNI.NLESegmentChromaChannel_setColor(LIZIZ3.LIZJ, LIZIZ3, c5j9.LJLIL.LJLIL);
        }
        String NLEKeyFrameTransientExtrakey_getChromaChannelIntensity = NLEEditorJniJNI.NLEKeyFrameTransientExtrakey_getChromaChannelIntensity();
        NLESegmentChromaChannel LIZIZ4 = nLEChromaChannel.LIZIZ();
        o.LJIIIIZZ(LIZIZ4, "it.segment");
        nLEChromaChannel.setTransientExtra(NLEKeyFrameTransientExtrakey_getChromaChannelIntensity, String.valueOf(NLEEditorJniJNI.NLESegmentChromaChannel_getIntensity(LIZIZ4.LIZJ, LIZIZ4)));
        String NLEKeyFrameTransientExtrakey_getChromaChannelShadow = NLEEditorJniJNI.NLEKeyFrameTransientExtrakey_getChromaChannelShadow();
        NLESegmentChromaChannel LIZIZ5 = nLEChromaChannel.LIZIZ();
        o.LJIIIIZZ(LIZIZ5, "it.segment");
        nLEChromaChannel.setTransientExtra(NLEKeyFrameTransientExtrakey_getChromaChannelShadow, String.valueOf(NLEEditorJniJNI.NLESegmentChromaChannel_getShadow(LIZIZ5.LIZJ, LIZIZ5)));
    }

    public final int LJIJ(long j, EnumC133595Md enumC133595Md) {
        int i;
        synchronized (this.LIZLLL) {
            NLEPlayer LJIIIZ = LJIIIZ();
            if (LJIIIZ != null) {
                i = LJIIIZ.LIZJ(j, enumC133595Md);
            } else {
                i = -1;
            }
        }
        return i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5J1(C5N2 session, NLEMediaConfig mediaConfig, NLEEditor nLEEditor) {
        super(session);
        o.LJIIIZ(session, "session");
        o.LJIIIZ(mediaConfig, "mediaConfig");
        this.LJJIII = mediaConfig;
        this.LJJIIJ = nLEEditor;
        this.LJI = new CopyOnWriteArrayList();
        this.LJII = new CopyOnWriteArrayList();
        this.LJIIIZ = new ConcurrentHashMap<>();
        this.LJIJ = new AtomicBoolean(false);
        this.LJIJI = new AtomicBoolean(false);
        this.LJIJJLI = C221108m2.LIZIZ(C5JC.LJLIL);
        this.LJIL = new AtomicBoolean(false);
        this.LJJ = new CopyOnWriteArrayList();
        LJIIJJI();
    }

    /* JADX WARN: Type inference failed for: r10v0, types: [X.5JX, com.bytedance.ies.nle.editor_jni.NLEListenerGetImageWrapper] */
    public final int LJIJI(long j, int i, final C5NM c5nm) {
        synchronized (this.LIZLLL) {
            NLEPlayer LJIIIZ = LJIIIZ();
            if (LJIIIZ != null) {
                ?? r10 = new NLEListenerGetImageWrapper() { // from class: X.5JX
                    @Override // com.bytedance.ies.nle.editor_jni.NLEListenerGetImageWrapper
                    public final int onGetImageDataCalled(byte[] bArr, int i2, int i3, int i4, float f) {
                        NLEMediaConfig nLEMediaConfig = C5J1.this.LJJIII;
                        int i5 = 0;
                        if (NLEMediaJniJNI.NLEMediaConfig_enableCatchExceptionInCallback_get(nLEMediaConfig.LIZ, nLEMediaConfig)) {
                            try {
                                C5JY c5jy = c5nm;
                                if (c5jy == null) {
                                    return 0;
                                }
                                i5 = c5jy.LIZ(bArr, i2, i3, i4, f);
                                return i5;
                            } catch (Throwable th) {
                                String LJIJJLI = C1DF.LJIJJLI(th);
                                NLELoggerListener logger = com.bytedance.ies.nleeditor.NLE.INSTANCE.getLogger();
                                if (logger != null) {
                                    LogLevel logLevel = LogLevel.LEVEL_ERROR;
                                    StringBuilder LIZ = X1D.LIZ();
                                    C132805Jc.LJ(LIZ, "NLEVEPublic2: onGetImageDataCalled exception! errorMsg: ", th, " stack: ", LJIJJLI);
                                    logger.onLog(logLevel, X1D.LIZIZ(LIZ));
                                    return i5;
                                }
                                return i5;
                            }
                        }
                        C5JY c5jy2 = c5nm;
                        if (c5jy2 == null) {
                            return 0;
                        }
                        return c5jy2.LIZ(bArr, i2, i3, i4, f);
                    }
                };
                this.LJIIJJI = r10;
                return NLEMediaPublicJniJNI.NLEPlayer_seekWithFrame__SWIG_1(LJIIIZ.LIZ, LJIIIZ, j, i, NLEListenerGetImageWrapper.getCPtr(r10), r10);
            }
            return -1;
        }
    }

    public final int LJJ(long j, long j2, C5JT c5jt) {
        NLEPlayer LJIIIZ = LJIIIZ();
        if (LJIIIZ != null) {
            return NLEMediaPublicJniJNI.NLEPlayer_setPlayRange__SWIG_0(LJIIIZ.LIZ, LJIIIZ, j, j2, c5jt.swigValue());
        }
        return -1;
    }

    @Override // X.InterfaceC132665Io
    public final int LJJJI(long j, EnumC133595Md enumC133595Md, AnonymousClass519 anonymousClass519) {
        int LJIJ;
        synchronized (this.LIZLLL) {
            if (anonymousClass519 != null) {
                LJI();
                this.LJIIIZ.put(Long.valueOf(j), anonymousClass519);
                LJIIL();
            }
            LJIJ = LJIJ(j, enumC133595Md);
            if (LJIJ != NLEError.SUCCESS.swigValue()) {
                NLELoggerListener logger = com.bytedance.ies.nleeditor.NLE.INSTANCE.getLogger();
                if (logger != null) {
                    LogLevel logLevel = LogLevel.LEVEL_WARNING;
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("NLEVEPublic2: seekTime ");
                    LIZ.append(j);
                    LIZ.append(" failed! veResult: ");
                    LIZ.append(LJIJ);
                    logger.onLog(logLevel, X1D.LIZIZ(LIZ));
                }
                this.LJIIIZ.remove(Long.valueOf(j));
            }
        }
        return LJIJ;
    }

    @Override // X.InterfaceC132665Io
    public final int LJJJJIZL(long j, EnumC133595Md enumC133595Md, float f, float f2) {
        int i;
        synchronized (this.LIZLLL) {
            NLEPlayer LJIIIZ = LJIIIZ();
            if (LJIIIZ != null) {
                i = NLEMediaPublicJniJNI.NLEPlayer_seekWithSpeed(LJIIIZ.LIZ, LJIIIZ, j, enumC133595Md.swigValue(), f, f2);
            } else {
                i = -1;
            }
        }
        return i;
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x003f A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIILL(java.lang.String r17, long r18, java.lang.String r20, com.bytedance.ies.nle.editor_jni.NLETrack r21, com.bytedance.ies.nle.editor_jni.NLETrackSlot r22, com.bytedance.ies.nle.editor_jni.KeyframeType r23) {
        /*
            Method dump skipped, instructions count: 1464
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5J1.LJIILL(java.lang.String, long, java.lang.String, com.bytedance.ies.nle.editor_jni.NLETrack, com.bytedance.ies.nle.editor_jni.NLETrackSlot, com.bytedance.ies.nle.editor_jni.KeyframeType):void");
    }
}
