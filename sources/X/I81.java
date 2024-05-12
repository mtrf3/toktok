package X;

import com.ss.ugc.effectplatform.model.ProviderEffect;
import kotlin.jvm.internal.AqS107S0101000_7;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class I81 implements InterfaceC84461XCv {
    public final /* synthetic */ InterfaceC88472Yns<C45705Hwj, C76800UCe> LIZ;
    public final /* synthetic */ C68322mC<A90> LIZIZ;
    public final /* synthetic */ String LIZJ;

    @Override // X.XDR
    public final void onSuccess(ProviderEffect providerEffect) {
        ProviderEffect response = providerEffect;
        o.LJIIIZ(response, "response");
        if (C74501TLt.LIZ) {
            String key = this.LIZJ;
            o.LJIIIZ(key, "key");
            ((C35979EAd) C74502TLu.LIZJ.getValue()).LIZLLL(key, new E47(System.currentTimeMillis(), key, response));
        }
        this.LIZ.invoke(new C45705Hwj(false, true, 100, response));
        A90 a90 = this.LIZIZ.element;
        if (a90 != null) {
            C6QQ.LIZ(new AqS157S0100000_7(a90, 654));
        }
    }

    @Override // X.XDR
    public final void preProcess(ProviderEffect providerEffect) {
    }

    @Override // X.XDR
    public final void onFail(ProviderEffect providerEffect, C84418XBe exception) {
        o.LJIIIZ(exception, "exception");
        this.LIZ.invoke(new C45705Hwj(true, true, 100, null));
        A90 a90 = this.LIZIZ.element;
        if (a90 != null) {
            C6QQ.LIZ(new AqS157S0100000_7(a90, 653));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public I81(InterfaceC88472Yns<? super C45705Hwj, C76800UCe> interfaceC88472Yns, C68322mC<A90> c68322mC, String str) {
        this.LIZ = interfaceC88472Yns;
        this.LIZIZ = c68322mC;
        this.LIZJ = str;
    }

    @Override // X.InterfaceC84461XCv
    public final void onProgress(ProviderEffect providerEffect, int i, long j) {
        this.LIZ.invoke(new C45705Hwj(false, false, i, null));
        A90 a90 = this.LIZIZ.element;
        if (a90 != null) {
            C6QQ.LIZ(new AqS107S0101000_7(a90, i, 11));
        }
    }
}
