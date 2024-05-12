package X;

import com.bytedance.ies.bullet.service.base.resourceloader.config.IXResourceLoader;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public abstract class O1T extends IXResourceLoader {
    public abstract void LIZ(O1I o1i, O1U o1u, InterfaceC88472Yns<? super O1I, C76800UCe> interfaceC88472Yns, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns2);

    public abstract O1I LIZIZ(O1I o1i, O1U o1u);

    @Override // com.bytedance.ies.bullet.service.base.resourceloader.config.IXResourceLoader
    public void cancelLoad() {
    }

    @Override // com.bytedance.ies.bullet.service.base.resourceloader.config.IXResourceLoader
    public final O1I loadSync(O1I input, O1L config) {
        O1U o1u;
        o.LJIIJ(input, "input");
        o.LJIIJ(config, "config");
        if (config instanceof O1U) {
            o1u = (O1U) config;
        } else {
            O1U o1u2 = new O1U(config.LJIILJJIL);
            o1u2.LIZ(config);
            o1u = o1u2;
        }
        return LIZIZ(input, o1u);
    }

    @Override // com.bytedance.ies.bullet.service.base.resourceloader.config.IXResourceLoader
    public final void loadAsync(O1I input, O1L config, InterfaceC88472Yns<? super O1I, C76800UCe> resolve, InterfaceC88472Yns<? super Throwable, C76800UCe> reject) {
        O1U o1u;
        o.LJIIJ(input, "input");
        o.LJIIJ(config, "config");
        o.LJIIJ(resolve, "resolve");
        o.LJIIJ(reject, "reject");
        if (config instanceof O1U) {
            o1u = (O1U) config;
        } else {
            O1U o1u2 = new O1U(config.LJIILJJIL);
            o1u2.LIZ(config);
            o1u = o1u2;
        }
        LIZ(input, o1u, resolve, reject);
    }
}
