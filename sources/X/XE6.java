package X;

import com.ss.ugc.effectplatform.model.Effect;
import com.ss.ugc.effectplatform.model.net.InfoStickerEffect;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class XE6 implements XCP {
    public final /* synthetic */ TO3 LIZ;
    public final /* synthetic */ InfoStickerEffect LIZIZ;

    @Override // X.XCP
    public final void onStart(Effect effect) {
    }

    @Override // X.XDR
    public final void onSuccess(Effect effect) {
        TO3 to3 = this.LIZ;
        if (to3 != null) {
            to3.onSuccess(this.LIZIZ);
        }
    }

    @Override // X.XDR
    public final /* bridge */ /* synthetic */ void preProcess(Effect effect) {
    }

    public XE6(C74548TNo c74548TNo, InfoStickerEffect infoStickerEffect) {
        this.LIZ = c74548TNo;
        this.LIZIZ = infoStickerEffect;
    }

    @Override // X.XDR
    public final void onFail(Effect effect, C84418XBe exception) {
        o.LJIIJ(exception, "exception");
        TO3 to3 = this.LIZ;
        if (to3 != null) {
            to3.onFail(this.LIZIZ, exception);
        }
    }

    @Override // X.XCP
    public final void onProgress(Effect effect, int i, long j) {
        TO3 to3 = this.LIZ;
        if (to3 != null) {
            to3.onProgress(i);
        }
    }
}
