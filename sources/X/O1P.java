package X;

import com.bytedance.ies.bullet.service.base.resourceloader.config.IXResourceLoader;
import com.ss.android.ugc.aweme.ad.preload.AdLandPagePreloadServiceImpl;
import com.ss.android.ugc.aweme.ad.preload.IAdLandPagePreloadService;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class O1P extends IXResourceLoader {
    @Override // com.bytedance.ies.bullet.service.base.resourceloader.config.IXResourceLoader
    public final void cancelLoad() {
    }

    @Override // com.bytedance.ies.bullet.service.base.resourceloader.config.IXResourceLoader
    public final O1I loadSync(O1I input, O1L config) {
        String str;
        o.LJIIIZ(input, "input");
        o.LJIIIZ(config, "config");
        O1L o1l = new O1L(0);
        o1l.LIZ(config);
        IAdLandPagePreloadService LJJI = AdLandPagePreloadServiceImpl.LJJI();
        if (LJJI == null || (str = LJJI.LJIIL("lynx_feed")) == null) {
            str = "";
        }
        o1l.LJIILJJIL = str;
        C61225O1d c61225O1d = new C61225O1d();
        c61225O1d.setService(getService());
        return c61225O1d.loadSync(input, o1l);
    }

    @Override // com.bytedance.ies.bullet.service.base.resourceloader.config.IXResourceLoader
    public final void loadAsync(O1I input, O1L config, InterfaceC88472Yns<? super O1I, C76800UCe> resolve, InterfaceC88472Yns<? super Throwable, C76800UCe> reject) {
        String str;
        o.LJIIIZ(input, "input");
        o.LJIIIZ(config, "config");
        o.LJIIIZ(resolve, "resolve");
        o.LJIIIZ(reject, "reject");
        O1L o1l = new O1L(0);
        o1l.LIZ(config);
        IAdLandPagePreloadService LJJI = AdLandPagePreloadServiceImpl.LJJI();
        if (LJJI == null || (str = LJJI.LJIIL("lynx_feed")) == null) {
            str = "";
        }
        o1l.LJIILJJIL = str;
        C61225O1d c61225O1d = new C61225O1d();
        c61225O1d.setService(getService());
        c61225O1d.loadAsync(input, o1l, resolve, reject);
    }
}
