package X;

import com.ss.ugc.effectplatform.model.ProviderEffect;
import com.ss.ugc.effectplatform.model.net.InfoStickerEffect;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class XE5 implements InterfaceC84461XCv {
    public final /* synthetic */ TO3 LIZ;
    public final /* synthetic */ InfoStickerEffect LIZIZ;

    @Override // X.XDR
    public final void onSuccess(ProviderEffect response) {
        o.LJIIJ(response, "response");
        TO3 to3 = this.LIZ;
        if (to3 != null) {
            to3.onSuccess(this.LIZIZ);
        }
    }

    @Override // X.XDR
    public final void preProcess(ProviderEffect providerEffect) {
    }

    public XE5(C74548TNo c74548TNo, InfoStickerEffect infoStickerEffect) {
        this.LIZ = c74548TNo;
        this.LIZIZ = infoStickerEffect;
    }

    @Override // X.XDR
    public final void onFail(ProviderEffect providerEffect, C84418XBe exception) {
        o.LJIIJ(exception, "exception");
        TO3 to3 = this.LIZ;
        if (to3 != null) {
            to3.onFail(this.LIZIZ, exception);
        }
    }

    @Override // X.InterfaceC84461XCv
    public final void onProgress(ProviderEffect providerEffect, int i, long j) {
        TO3 to3 = this.LIZ;
        if (to3 != null) {
            to3.onProgress(i);
        }
    }
}
