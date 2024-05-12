package X;

import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.knadapt.ListenerAdaptExtKt;
import com.ss.ugc.effectplatform.model.net.InfoStickerEffect;
import kotlin.jvm.internal.o;

/* renamed from: X.TNo, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C74548TNo implements TO3 {
    public final long LIZ = System.currentTimeMillis();
    public final /* synthetic */ AbstractC74546TNm LIZIZ;
    public final /* synthetic */ TO7 LIZJ;
    public final /* synthetic */ InfoStickerEffect LIZLLL;

    @Override // X.TO3
    public final void onProgress(int i) {
        this.LIZJ.LJII(i, this.LIZLLL);
    }

    @Override // X.XDR
    public final void onSuccess(InfoStickerEffect response) {
        o.LJIIIZ(response, "response");
        long currentTimeMillis = System.currentTimeMillis() - this.LIZ;
        TO7 to7 = this.LIZJ;
        InfoStickerEffect key = this.LIZLLL;
        this.LIZIZ.getClass();
        o.LJIIIZ(key, "key");
        AbstractC74546TNm abstractC74546TNm = this.LIZIZ;
        InfoStickerEffect key2 = this.LIZLLL;
        abstractC74546TNm.getClass();
        o.LJIIIZ(key2, "key");
        to7.LIZ(key, null, C76800UCe.LIZ, currentTimeMillis);
    }

    @Override // X.XDR
    public final void preProcess(InfoStickerEffect infoStickerEffect) {
    }

    @Override // X.XDR
    public final void onFail(InfoStickerEffect infoStickerEffect, C84418XBe exception) {
        Exception exc;
        o.LJIIIZ(exception, "exception");
        long currentTimeMillis = System.currentTimeMillis() - this.LIZ;
        TO7 to7 = this.LIZJ;
        InfoStickerEffect key = this.LIZLLL;
        AbstractC74546TNm abstractC74546TNm = this.LIZIZ;
        ExceptionResult oldExceptionResult = ListenerAdaptExtKt.toOldExceptionResult(exception);
        abstractC74546TNm.getClass();
        o.LJIIIZ(key, "key");
        if (oldExceptionResult != null) {
            exc = oldExceptionResult.getException();
        } else {
            exc = null;
        }
        AbstractC74546TNm abstractC74546TNm2 = this.LIZIZ;
        InfoStickerEffect key2 = this.LIZLLL;
        ListenerAdaptExtKt.toOldExceptionResult(exception);
        abstractC74546TNm2.getClass();
        o.LJIIIZ(key2, "key");
        to7.LIZIZ(key, exc, C76800UCe.LIZ, currentTimeMillis);
    }

    public C74548TNo(AbstractC74546TNm abstractC74546TNm, TNZ tnz, InfoStickerEffect infoStickerEffect) {
        this.LIZIZ = abstractC74546TNm;
        this.LIZJ = tnz;
        this.LIZLLL = infoStickerEffect;
    }
}
