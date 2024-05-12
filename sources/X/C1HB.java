package X;

import android.os.SystemClock;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveEnableUseEffectDownloadCacheSetting;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.android.livesdkapi.host.IHostCreativeTool;
import com.ss.android.ugc.effectmanager.EffectManager;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IEffectDownloadProgressListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.1HB, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C1HB implements InterfaceC08130Tp {
    public final EffectManager LIZ = ((IHostCreativeTool) CN1.LIZ(IHostCreativeTool.class)).LJLJJLL();
    public final List<InterfaceC08110Tn> LIZIZ = new ArrayList();
    public final List<String> LIZJ = new ArrayList();

    @Override // X.InterfaceC08130Tp
    public final boolean LIZ(LiveEffect liveEffect) {
        if (LiveEnableUseEffectDownloadCacheSetting.INSTANCE.enable()) {
            if (((ArrayList) this.LIZJ).contains(liveEffect.unzipPath)) {
                return true;
            }
        }
        return C1KJ.LJIIL(C0LT.LIZ(liveEffect));
    }

    @Override // X.InterfaceC08130Tp
    public final void LIZIZ(final String str, LiveEffect liveEffect, final InterfaceC08110Tn interfaceC08110Tn) {
        final C1HH c1hh;
        if (LIZ(liveEffect)) {
            return;
        }
        if (C0TY.LIZ.equals(str)) {
            c1hh = new C41141jS();
        } else if (C0TY.LIZIZ.equals(str)) {
            c1hh = new C41151jT();
        } else {
            c1hh = new C1HH();
        }
        c1hh.LIZIZ = SystemClock.uptimeMillis();
        this.LIZ.fetchEffect(C0LT.LIZ(liveEffect), new IEffectDownloadProgressListener() { // from class: X.1tp
            @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
            public final void onStart(Effect effect) {
            }

            @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
            public final void onSuccess(Effect effect) {
                Effect effect2 = effect;
                LiveEffect LIZIZ = C0LT.LIZIZ(effect2);
                LIZIZ.isDownloading = false;
                LIZIZ.isDownloaded = true;
                c1hh.LJIIJJI();
                ((ArrayList) C1HB.this.LIZJ).add(effect2.getUnzipPath());
                Iterator it = ((ArrayList) C1HB.this.LIZIZ).iterator();
                while (it.hasNext()) {
                    ((InterfaceC08110Tn) it.next()).LIZJ(LIZIZ, str);
                }
                InterfaceC08110Tn interfaceC08110Tn2 = interfaceC08110Tn;
                if (interfaceC08110Tn2 != null) {
                    interfaceC08110Tn2.LIZJ(LIZIZ, str);
                }
            }

            @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
            public final void onFail(Effect effect, ExceptionResult exceptionResult) {
                C1HB.this.LIZ.deleteEffect(effect);
                LiveEffect LIZIZ = C0LT.LIZIZ(effect);
                LIZIZ.isDownloading = false;
                c1hh.LJIIJ(exceptionResult.getErrorCode(), exceptionResult.getMsg());
                Iterator it = ((ArrayList) C1HB.this.LIZIZ).iterator();
                while (it.hasNext()) {
                    ((InterfaceC08110Tn) it.next()).LIZIZ(LIZIZ, str);
                }
                InterfaceC08110Tn interfaceC08110Tn2 = interfaceC08110Tn;
                if (interfaceC08110Tn2 != null) {
                    interfaceC08110Tn2.LIZIZ(LIZIZ, str);
                }
            }

            @Override // com.ss.android.ugc.effectmanager.effect.listener.IEffectDownloadProgressListener
            public final void onProgress(Effect effect, int i, long j) {
                LiveEffect LIZIZ = C0LT.LIZIZ(effect);
                Iterator it = ((ArrayList) C1HB.this.LIZIZ).iterator();
                while (it.hasNext()) {
                    ((InterfaceC08110Tn) it.next()).LIZLLL(LIZIZ);
                }
                InterfaceC08110Tn interfaceC08110Tn2 = interfaceC08110Tn;
                if (interfaceC08110Tn2 != null) {
                    interfaceC08110Tn2.LIZLLL(LIZIZ);
                }
            }
        });
        liveEffect.isDownloading = true;
        Iterator it = ((ArrayList) this.LIZIZ).iterator();
        while (it.hasNext()) {
            ((InterfaceC08110Tn) it.next()).LIZ();
        }
        if (interfaceC08110Tn != null) {
            interfaceC08110Tn.LIZ();
        }
    }
}
