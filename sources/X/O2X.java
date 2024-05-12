package X;

import com.bytedance.lynx.hybrid.resource.config.IHybridResourceLoader;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public abstract class O2X extends IHybridResourceLoader {
    public abstract void LIZ(O26 o26, O1V o1v, InterfaceC88472Yns<? super O26, C76800UCe> interfaceC88472Yns, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns2);

    public abstract O26 LIZIZ(O26 o26, O1V o1v);

    @Override // com.bytedance.lynx.hybrid.resource.config.IHybridResourceLoader
    public void cancelLoad() {
    }

    @Override // com.bytedance.lynx.hybrid.resource.config.IHybridResourceLoader
    public final O26 loadSync(O26 input, O1M config) {
        O1V o1v;
        o.LJIIJ(input, "input");
        o.LJIIJ(config, "config");
        if (config instanceof O1V) {
            o1v = (O1V) config;
        } else {
            O1V o1v2 = new O1V(config.LJIILLIIL);
            o1v2.LIZ(config);
            o1v = o1v2;
        }
        return LIZIZ(input, o1v);
    }

    @Override // com.bytedance.lynx.hybrid.resource.config.IHybridResourceLoader
    public final void loadAsync(O26 input, O1M config, InterfaceC88472Yns<? super O26, C76800UCe> resolve, InterfaceC88472Yns<? super Throwable, C76800UCe> reject) {
        O1V o1v;
        o.LJIIJ(input, "input");
        o.LJIIJ(config, "config");
        o.LJIIJ(resolve, "resolve");
        o.LJIIJ(reject, "reject");
        if (config instanceof O1V) {
            o1v = (O1V) config;
        } else {
            O1V o1v2 = new O1V(config.LJIILLIIL);
            o1v2.LIZ(config);
            o1v = o1v2;
        }
        LIZ(input, o1v, resolve, reject);
    }
}
