package X;

import com.ss.ugc.effectplatform.model.ProviderEffectModel;
import kotlin.jvm.internal.o;

/* renamed from: X.TOw, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C74582TOw implements XDR<ProviderEffectModel> {
    public final /* synthetic */ InterfaceC65052gv<C35794E3a<com.ss.android.ugc.effectmanager.effect.model.ProviderEffectModel>> LIZ;

    public C74582TOw(C73578SuE c73578SuE) {
        this.LIZ = c73578SuE;
    }

    @Override // X.XDR
    public final void onSuccess(ProviderEffectModel providerEffectModel) {
        ProviderEffectModel response = providerEffectModel;
        o.LJIIIZ(response, "response");
        ((C73578SuE) this.LIZ).onSuccess(C1XY.LJJIIJ(new com.ss.android.ugc.effectmanager.effect.model.ProviderEffectModel(response)));
    }

    @Override // X.XDR
    public final /* bridge */ /* synthetic */ void preProcess(ProviderEffectModel providerEffectModel) {
    }

    @Override // X.XDR
    public final void onFail(ProviderEffectModel providerEffectModel, C84418XBe exception) {
        o.LJIIIZ(exception, "exception");
        InterfaceC65052gv<C35794E3a<com.ss.android.ugc.effectmanager.effect.model.ProviderEffectModel>> interfaceC65052gv = this.LIZ;
        Throwable th = exception.LIZJ;
        if (th == null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Failed on fetch from effect platform, msg: ");
            LIZ.append(exception.LIZIZ);
            LIZ.append(", code: ");
            LIZ.append(Integer.valueOf(exception.LIZ));
            th = new RuntimeException(X1D.LIZIZ(LIZ));
        }
        ((C73578SuE) interfaceC65052gv).tryOnError(th);
    }
}
