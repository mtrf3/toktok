package X;

import com.bytedance.ies.bullet.service.base.resourceloader.config.IXResourceLoader;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class O1Q extends IXResourceLoader {
    public static String LJLIL = "";

    @Override // com.bytedance.ies.bullet.service.base.resourceloader.config.IXResourceLoader
    public final void cancelLoad() {
    }

    @Override // com.bytedance.ies.bullet.service.base.resourceloader.config.IXResourceLoader
    public final O1I loadSync(O1I input, O1L config) {
        o.LJIIIZ(input, "input");
        o.LJIIIZ(config, "config");
        O1L o1l = new O1L(0);
        o1l.LIZ(config);
        o1l.LIZIZ(LJLIL);
        C61225O1d c61225O1d = new C61225O1d();
        c61225O1d.setService(getService());
        return c61225O1d.loadSync(input, o1l);
    }

    @Override // com.bytedance.ies.bullet.service.base.resourceloader.config.IXResourceLoader
    public final void loadAsync(O1I input, O1L config, InterfaceC88472Yns<? super O1I, C76800UCe> resolve, InterfaceC88472Yns<? super Throwable, C76800UCe> reject) {
        o.LJIIIZ(input, "input");
        o.LJIIIZ(config, "config");
        o.LJIIIZ(resolve, "resolve");
        o.LJIIIZ(reject, "reject");
        O1L o1l = new O1L(0);
        o1l.LIZ(config);
        o1l.LIZIZ(LJLIL);
        C61225O1d c61225O1d = new C61225O1d();
        c61225O1d.setService(getService());
        c61225O1d.loadAsync(input, o1l, resolve, reject);
    }
}
