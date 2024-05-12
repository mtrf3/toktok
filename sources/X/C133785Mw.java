package X;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import com.bytedance.ies.nle.editor_jni.LogLevel;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEError;
import com.bytedance.ies.nle.editor_jni.NLELoggerListener;
import com.bytedance.ies.nle.editor_jni.NLEMediaConfig;
import com.bytedance.ies.nle.editor_jni.NLEMediaJniJNI;
import com.bytedance.ies.nle.editor_jni.NLEMediaPublicJniJNI;
import com.bytedance.ies.nle.editor_jni.NLEMediaSession;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLEPlayer;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.5Mw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C133785Mw implements InterfaceC126684y8 {
    public static final C133035Jz LJFF = new C133035Jz();
    public final TextureView LIZ;
    public final C62822Ol8 LIZIZ;
    public NLEModel LIZJ;
    public final NLEMediaConfig LIZLLL;
    public final NLEEditor LJ;

    public final C5NL LIZ() {
        return (C5NL) this.LIZIZ.getValue();
    }

    public final void LIZIZ() {
        NLEMediaConfig nLEMediaConfig = this.LIZLLL;
        NLEMediaJniJNI.NLEMediaConfig_reUseFirstAVInfo_set(nLEMediaConfig.LIZ, nLEMediaConfig, false);
    }

    @Override // X.InterfaceC126684y8
    public final C5J3 O8() {
        return (C5J3) LIZ().LJIIIIZZ.getValue();
    }

    @Override // X.InterfaceC126684y8
    public final C133775Mv P8() {
        return (C133775Mv) LIZ().LIZJ.getValue();
    }

    @Override // X.InterfaceC126684y8
    public final C5N9 Q8() {
        return (C5N9) LIZ().LJIIIZ.getValue();
    }

    @Override // X.InterfaceC126684y8
    public final C5JW S8() {
        return (C5JW) LIZ().LJ.getValue();
    }

    @Override // X.InterfaceC126684y8
    public final C5N7 U8() {
        return (C5N7) LIZ().LJFF.getValue();
    }

    @Override // X.InterfaceC126684y8
    public final C5J1 V8() {
        return LIZ().LIZ();
    }

    @Override // X.InterfaceC126684y8
    public final C5N0 W8() {
        return (C5N0) LIZ().LJI.getValue();
    }

    @Override // X.InterfaceC126684y8
    public final C5N1 X8() {
        return (C5N1) LIZ().LIZLLL.getValue();
    }

    @Override // X.InterfaceC126684y8
    public final C133795Mx Y8() {
        return (C133795Mx) LIZ().LJII.getValue();
    }

    @Override // X.InterfaceC126684y8
    public final C5NF Z8() {
        return (C5NF) LIZ().LJIIJ.getValue();
    }

    @Override // X.InterfaceC126684y8
    public final void R8(NLEModel nLEModel) {
        this.LIZJ = nLEModel;
        C5N2 LIZIZ = LIZ().LIZIZ();
        NLEMediaSession nLEMediaSession = LIZIZ.LJIILIIL;
        if (nLEMediaSession != null) {
            long NLEMediaSession_getMediaConfig = NLEMediaPublicJniJNI.NLEMediaSession_getMediaConfig(nLEMediaSession.LIZ, nLEMediaSession);
            if (NLEMediaSession_getMediaConfig != 0) {
                NLEMediaConfig nLEMediaConfig = new NLEMediaConfig(NLEMediaSession_getMediaConfig);
                if (NLEMediaJniJNI.NLEMediaConfig_lockSetDataSourceAndDestroy_get(nLEMediaConfig.LIZ, nLEMediaConfig)) {
                    synchronized (LIZIZ.LIZ) {
                        LIZIZ.LIZIZ = nLEModel;
                        NLEMediaSession nLEMediaSession2 = LIZIZ.LJIILIIL;
                        if (nLEMediaSession2 != null) {
                            NLEMediaPublicJniJNI.NLEMediaSession_setDataSource(nLEMediaSession2.LIZ, nLEMediaSession2, NLEModel.getCPtr(nLEModel), nLEModel);
                        }
                    }
                    return;
                }
            }
        }
        LIZIZ.LIZIZ = nLEModel;
        NLEMediaSession nLEMediaSession3 = LIZIZ.LJIILIIL;
        if (nLEMediaSession3 != null) {
            NLEMediaPublicJniJNI.NLEMediaSession_setDataSource(nLEMediaSession3.LIZ, nLEMediaSession3, NLEModel.getCPtr(nLEModel), nLEModel);
        }
    }

    @Override // X.InterfaceC126684y8
    public final void T8(NLEEditor nLEEditor) {
        C5NL LIZ = LIZ();
        LIZ.LIZ().LJJIIJ = nLEEditor;
        ((C133795Mx) LIZ.LJII.getValue()).LJFF = nLEEditor;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C133785Mw(NLEMediaConfig nLEMediaConfig, TextureView textureView, C133665Mk c133665Mk) {
        this(nLEMediaConfig, (SurfaceView) null, c133665Mk);
        o.LJIIIZ(textureView, "textureView");
        this.LIZ = textureView;
        final C5J1 LIZ = LIZ().LIZ();
        LIZ.getClass();
        if (o.LJ(LIZ.LJIILLIIL, textureView)) {
            return;
        }
        NLELoggerListener logger = com.bytedance.ies.nleeditor.NLE.INSTANCE.getLogger();
        if (logger != null) {
            LogLevel logLevel = LogLevel.LEVEL_INFO;
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("NLEVEPublic2: ");
            LIZ2.append(LIZ.hashCode());
            LIZ2.append(" bindTextureView");
            logger.onLog(logLevel, X1D.LIZIZ(LIZ2));
        }
        NLEPlayer LJIIIZ = LIZ.LJIIIZ();
        if (LJIIIZ != null) {
            NLEMediaPublicJniJNI.NLEPlayer_setEditorMode(LJIIIZ.LIZ, LJIIIZ, EnumC123974tl.PREVIEW_ONLY.swigValue());
        }
        textureView.setSurfaceTextureListener(new TextureView.SurfaceTextureListener() { // from class: X.5Mz
            public long LJLIL;
            public Surface LJLILLLLZI;

            @Override // android.view.TextureView.SurfaceTextureListener
            public final void onSurfaceTextureUpdated(SurfaceTexture p0) {
                o.LJIIIZ(p0, "p0");
            }

            @Override // android.view.TextureView.SurfaceTextureListener
            public final boolean onSurfaceTextureDestroyed(SurfaceTexture p0) {
                long j;
                o.LJIIIZ(p0, "p0");
                if (C5J1.this.LJIJI.get()) {
                    NLELoggerListener logger2 = com.bytedance.ies.nleeditor.NLE.INSTANCE.getLogger();
                    if (logger2 != null) {
                        logger2.onLog(LogLevel.LEVEL_INFO, "NLEVEPublic2: onSurfaceTextureDestroyed skip. is destroying");
                    }
                    return true;
                }
                synchronized (C5J1.this.LIZLLL) {
                    if (C5J1.this.LJIJI.get()) {
                        NLELoggerListener logger3 = com.bytedance.ies.nleeditor.NLE.INSTANCE.getLogger();
                        if (logger3 != null) {
                            logger3.onLog(LogLevel.LEVEL_INFO, "NLEVEPublic2: onSurfaceTextureDestroyed skip. is destroying");
                        }
                        return true;
                    }
                    NLELoggerListener logger4 = com.bytedance.ies.nleeditor.NLE.INSTANCE.getLogger();
                    if (logger4 != null) {
                        logger4.onLog(LogLevel.LEVEL_INFO, "NLEVEPublic2: onSurfaceTextureDestroyed");
                    }
                    NLEPlayer LJIIIZ2 = C5J1.this.LJIIIZ();
                    if (LJIIIZ2 != null) {
                        j = NLEMediaPublicJniJNI.NLEPlayer_getCurrentPosition(LJIIIZ2.LIZ, LJIIIZ2);
                    } else {
                        j = 0;
                    }
                    this.LJLIL = j;
                    NLEPlayer LJIIIZ3 = C5J1.this.LJIIIZ();
                    if (LJIIIZ3 != null) {
                        NLEMediaPublicJniJNI.NLEPlayer_releaseAndroidSurface(LJIIIZ3.LIZ, LJIIIZ3);
                    }
                    this.LJLILLLLZI = null;
                    return true;
                }
            }

            @Override // android.view.TextureView.SurfaceTextureListener
            public final void onSurfaceTextureAvailable(SurfaceTexture p0, int i, int i2) {
                EnumC135185Sg enumC135185Sg;
                NLEPlayer LJIIIZ2;
                o.LJIIIZ(p0, "p0");
                NLELoggerListener logger2 = com.bytedance.ies.nleeditor.NLE.INSTANCE.getLogger();
                if (logger2 != null) {
                    logger2.onLog(LogLevel.LEVEL_INFO, "NLEVEPublic2: onSurfaceTextureAvailable");
                }
                this.LJLILLLLZI = new Surface(p0);
                NLEPlayer LJIIIZ3 = C5J1.this.LJIIIZ();
                if (LJIIIZ3 != null) {
                    NLEError.swigToEnum(NLEMediaPublicJniJNI.NLEPlayer_setAndroidSurface(LJIIIZ3.LIZ, LJIIIZ3, this.LJLILLLLZI));
                }
                NLEPlayer LJIIIZ4 = C5J1.this.LJIIIZ();
                if (LJIIIZ4 != null) {
                    enumC135185Sg = EnumC135185Sg.swigToEnum(NLEMediaPublicJniJNI.NLEPlayer_state(LJIIIZ4.LIZ, LJIIIZ4));
                } else {
                    enumC135185Sg = null;
                }
                if (enumC135185Sg == EnumC135185Sg.STOPPED) {
                    NLEPlayer LJIIIZ5 = C5J1.this.LJIIIZ();
                    if (LJIIIZ5 != null) {
                        NLEMediaPublicJniJNI.NLEPlayer_prepare(LJIIIZ5.LIZ, LJIIIZ5);
                    }
                    NLEPlayer LJIIIZ6 = C5J1.this.LJIIIZ();
                    if (LJIIIZ6 != null) {
                        LJIIIZ6.LIZJ(this.LJLIL, EnumC133595Md.EDITOR_SEEK_FLAG_LastSeek);
                    }
                } else if (enumC135185Sg == EnumC135185Sg.PREPARED && (LJIIIZ2 = C5J1.this.LJIIIZ()) != null) {
                    NLEMediaPublicJniJNI.NLEPlayer_refreshCurrentFrame(LJIIIZ2.LIZ, LJIIIZ2, 0);
                }
                InterfaceC134005Ns interfaceC134005Ns = C5J1.this.LJIIZILJ;
                if (interfaceC134005Ns != null) {
                    interfaceC134005Ns.LIZ();
                }
            }

            @Override // android.view.TextureView.SurfaceTextureListener
            public final void onSurfaceTextureSizeChanged(SurfaceTexture p0, int i, int i2) {
                o.LJIIIZ(p0, "p0");
                NLELoggerListener logger2 = com.bytedance.ies.nleeditor.NLE.INSTANCE.getLogger();
                if (logger2 != null) {
                    logger2.onLog(LogLevel.LEVEL_INFO, C48263Iwt.LIZLLL("NLEVEPublic2: onSurfaceTextureSizeChanged, size: width: ", i, ", height: ", i2));
                }
                if (i == 0 || i2 == 0) {
                    return;
                }
                NLEPlayer LJIIIZ2 = C5J1.this.LJIIIZ();
                if (LJIIIZ2 != null) {
                    NLEError.swigToEnum(NLEMediaPublicJniJNI.NLEPlayer_setPreviewSurfaceSize(LJIIIZ2.LIZ, LJIIIZ2, i, i2));
                }
                NLEMediaPublicJniJNI.NLEImageTemplateEffectUtil_setSurfaceSize(i, i2);
            }
        });
        LIZ.LJIILLIIL = textureView;
    }

    public C133785Mw(NLEMediaConfig mediaConfig, SurfaceView surfaceView, NLEEditor nLEEditor) {
        Surface surface;
        NLEPlayer LIZJ;
        o.LJIIIZ(mediaConfig, "mediaConfig");
        this.LIZLLL = mediaConfig;
        this.LJ = nLEEditor;
        this.LIZIZ = C221108m2.LIZIZ(new AqS152S0100000_2(this, 773));
        if (surfaceView != null) {
            SurfaceHolder holder = surfaceView.getHolder();
            if (holder != null && (surface = holder.getSurface()) != null && (LIZJ = LIZ().LIZIZ().LIZJ()) != null) {
                NLEError.swigToEnum(NLEMediaPublicJniJNI.NLEPlayer_setAndroidSurface(LIZJ.LIZ, LIZJ, surface));
            }
            LIZ().LIZ().LJFF(surfaceView);
        }
    }
}
