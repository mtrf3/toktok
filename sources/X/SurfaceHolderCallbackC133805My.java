package X;

import Y.ARunnableS21S0200000_2;
import android.os.Handler;
import android.view.SurfaceHolder;
import com.bytedance.ies.nle.editor_jni.LogLevel;
import com.bytedance.ies.nle.editor_jni.NLEError;
import com.bytedance.ies.nle.editor_jni.NLELoggerListener;
import com.bytedance.ies.nle.editor_jni.NLEMediaPublicJniJNI;
import com.bytedance.ies.nle.editor_jni.NLEPlayer;
import kotlin.jvm.internal.o;

/* renamed from: X.5My, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class SurfaceHolderCallbackC133805My implements SurfaceHolder.Callback {
    public long LJLIL;
    public final /* synthetic */ C5J1 LJLILLLLZI;

    public SurfaceHolderCallbackC133805My(C5J1 c5j1) {
        this.LJLILLLLZI = c5j1;
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder holder) {
        EnumC135185Sg enumC135185Sg;
        NLEPlayer LJIIIZ;
        o.LJIIIZ(holder, "holder");
        if (C5MZ.LIZ) {
            new Handler(C16880lQ.LLJJJJ()).postAtFrontOfQueue(new ARunnableS21S0200000_2(holder, this, 53));
            return;
        }
        NLELoggerListener logger = com.bytedance.ies.nleeditor.NLE.INSTANCE.getLogger();
        if (logger != null) {
            logger.onLog(LogLevel.LEVEL_INFO, "NLEVEPublic2: surfaceCreated");
        }
        NLEPlayer LJIIIZ2 = this.LJLILLLLZI.LJIIIZ();
        if (LJIIIZ2 != null) {
            NLEError.swigToEnum(NLEMediaPublicJniJNI.NLEPlayer_setAndroidSurface(LJIIIZ2.LIZ, LJIIIZ2, holder.getSurface()));
        }
        NLEPlayer LJIIIZ3 = this.LJLILLLLZI.LJIIIZ();
        if (LJIIIZ3 != null) {
            enumC135185Sg = EnumC135185Sg.swigToEnum(NLEMediaPublicJniJNI.NLEPlayer_state(LJIIIZ3.LIZ, LJIIIZ3));
        } else {
            enumC135185Sg = null;
        }
        if (enumC135185Sg == EnumC135185Sg.STOPPED) {
            NLEPlayer LJIIIZ4 = this.LJLILLLLZI.LJIIIZ();
            if (LJIIIZ4 != null) {
                NLEMediaPublicJniJNI.NLEPlayer_prepare(LJIIIZ4.LIZ, LJIIIZ4);
            }
            NLEPlayer LJIIIZ5 = this.LJLILLLLZI.LJIIIZ();
            if (LJIIIZ5 != null) {
                LJIIIZ5.LIZJ(this.LJLIL, EnumC133595Md.EDITOR_SEEK_FLAG_LastSeek);
            }
        } else if (enumC135185Sg == EnumC135185Sg.PREPARED && (LJIIIZ = this.LJLILLLLZI.LJIIIZ()) != null) {
            NLEMediaPublicJniJNI.NLEPlayer_refreshCurrentFrame(LJIIIZ.LIZ, LJIIIZ, 0);
        }
        InterfaceC134005Ns interfaceC134005Ns = this.LJLILLLLZI.LJIIZILJ;
        if (interfaceC134005Ns == null) {
            return;
        }
        interfaceC134005Ns.LIZ();
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder p0) {
        long j;
        o.LJIIIZ(p0, "p0");
        if (this.LJLILLLLZI.LJIJI.get()) {
            NLELoggerListener logger = com.bytedance.ies.nleeditor.NLE.INSTANCE.getLogger();
            if (logger != null) {
                logger.onLog(LogLevel.LEVEL_INFO, "NLEVEPublic2: surfaceDestroyed skip. is destroying");
                return;
            }
            return;
        }
        synchronized (this.LJLILLLLZI.LIZLLL) {
            if (this.LJLILLLLZI.LJIJI.get()) {
                NLELoggerListener logger2 = com.bytedance.ies.nleeditor.NLE.INSTANCE.getLogger();
                if (logger2 != null) {
                    logger2.onLog(LogLevel.LEVEL_INFO, "NLEVEPublic2: surfaceDestroyed skip. is destroying");
                }
                return;
            }
            NLELoggerListener logger3 = com.bytedance.ies.nleeditor.NLE.INSTANCE.getLogger();
            if (logger3 != null) {
                logger3.onLog(LogLevel.LEVEL_INFO, "NLEVEPublic2: surfaceDestroyed");
            }
            NLEPlayer LJIIIZ = this.LJLILLLLZI.LJIIIZ();
            if (LJIIIZ != null) {
                j = NLEMediaPublicJniJNI.NLEPlayer_getCurrentPosition(LJIIIZ.LIZ, LJIIIZ);
            } else {
                j = 0;
            }
            this.LJLIL = j;
            NLEPlayer LJIIIZ2 = this.LJLILLLLZI.LJIIIZ();
            if (LJIIIZ2 != null) {
                NLEMediaPublicJniJNI.NLEPlayer_releaseAndroidSurface(LJIIIZ2.LIZ, LJIIIZ2);
            }
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder holder, int i, int i2, int i3) {
        o.LJIIIZ(holder, "holder");
        NLELoggerListener logger = com.bytedance.ies.nleeditor.NLE.INSTANCE.getLogger();
        if (logger != null) {
            logger.onLog(LogLevel.LEVEL_INFO, C48263Iwt.LIZLLL("NLEVEPublic2: surfaceChanged, size: width: ", i2, ", height: ", i3));
        }
        if (i2 == 0 || i3 == 0) {
            return;
        }
        NLEPlayer LJIIIZ = this.LJLILLLLZI.LJIIIZ();
        if (LJIIIZ != null) {
            NLEError.swigToEnum(NLEMediaPublicJniJNI.NLEPlayer_setPreviewSurfaceSize(LJIIIZ.LIZ, LJIIIZ, i2, i3));
        }
        NLEMediaPublicJniJNI.NLEImageTemplateEffectUtil_setSurfaceSize(i2, i3);
    }
}
