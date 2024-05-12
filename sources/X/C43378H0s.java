package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.ss.android.ugc.aweme.publish.model.UploadAuthKeyConfig;
import kotlin.jvm.internal.o;

/* renamed from: X.H0s, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43378H0s implements InterfaceC116954iR<UploadAuthKeyConfig> {
    public final /* synthetic */ long LJLIL;
    public final /* synthetic */ InterfaceC88472Yns<Throwable, C76800UCe> LJLILLLLZI;
    public final /* synthetic */ InterfaceC88472Yns<UploadAuthKeyConfig, C76800UCe> LJLJI;

    @Override // X.InterfaceC116954iR
    public final void onComplete() {
    }

    @Override // X.InterfaceC116954iR
    public final void onSubscribe(InterfaceC92693kP d) {
        o.LJIIIZ(d, "d");
    }

    @Override // X.InterfaceC116954iR
    public final void onError(Throwable t) {
        o.LJIIIZ(t, "t");
        C43379H0t.LIZIZ();
        UploadAuthKeyConfig uploadAuthKeyConfig = C43379H0t.LIZ;
        if (uploadAuthKeyConfig != null) {
            LIZ(true, uploadAuthKeyConfig);
        } else {
            this.LJLILLLLZI.invoke(t);
        }
    }

    @Override // X.InterfaceC116954iR
    public final void onNext(UploadAuthKeyConfig uploadAuthKeyConfig) {
        UploadAuthKeyConfig config = uploadAuthKeyConfig;
        o.LJIIIZ(config, "config");
        config.saveTime = System.currentTimeMillis();
        C60903NvH.LJIIJJI().getRegionService();
        config.currentRegion = C44296Ha0.LIZ();
        LIZ(false, config);
        C43379H0t.LJI(config, this.LJLIL);
    }

    public final void LIZ(boolean z, UploadAuthKeyConfig config) {
        o.LJIIIZ(config, "config");
        this.LJLJI.invoke(config);
        if (!z) {
            C43379H0t.LIZ = config;
            String configString = GsonProtectorUtils.toJson(C60903NvH.LJIIJJI().LIZ(), config);
            o.LJIIIIZZ(configString, "configString");
            C43379H0t.LJFF(configString);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C43378H0s(long j, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88472Yns<? super UploadAuthKeyConfig, C76800UCe> interfaceC88472Yns2) {
        this.LJLIL = j;
        this.LJLILLLLZI = interfaceC88472Yns;
        this.LJLJI = interfaceC88472Yns2;
    }
}
