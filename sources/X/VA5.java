package X;

import com.lynx.tasm.base.TraceEvent;

/* loaded from: classes14.dex */
public final class VA5 extends AbstractC50748Jvs implements VA4 {
    @Override // X.AbstractC50748Jvs
    public final String LJIIIIZZ() {
        return "com.bytedance.lynx.service.resource.LynxResourceService";
    }

    @Override // X.VA4
    public final String geckoResourcePathForUrlString(String str) {
        TraceEvent.LIZIZ("LynxServiceResourceProxy.geckoResourcePathForUrlString");
        if (LJII()) {
            String geckoResourcePathForUrlString = ((VA4) this.LIZIZ).geckoResourcePathForUrlString(str);
            TraceEvent.LJ("LynxServiceResourceProxy.geckoResourcePathForUrlString");
            return geckoResourcePathForUrlString;
        }
        TraceEvent.LJ("LynxServiceResourceProxy.geckoResourcePathForUrlString");
        return null;
    }

    @Override // X.VA4
    public final int isGeckoResource(String str) {
        TraceEvent.LIZIZ("LynxServiceResourceProxy.isGeckoResource");
        if (LJII()) {
            int isGeckoResource = ((VA4) this.LIZIZ).isGeckoResource(str);
            TraceEvent.LJ("LynxServiceResourceProxy.isGeckoResource");
            return isGeckoResource;
        }
        TraceEvent.LJ("LynxServiceResourceProxy.isGeckoResource");
        return -1;
    }

    @Override // X.VA4
    public final void cancelPreloadMedia(String str, String str2) {
        if (LJII()) {
            ((VA4) this.LIZIZ).cancelPreloadMedia(str, str2);
        }
    }

    @Override // X.VA4
    public final InterfaceC79289V9x fetchResourceSync(String str, O3M o3m) {
        TraceEvent.LIZIZ("LynxServiceResourceProxy.fetchResourceSync");
        if (LJII()) {
            InterfaceC79289V9x fetchResourceSync = ((VA4) this.LIZIZ).fetchResourceSync(str, o3m);
            TraceEvent.LJ("LynxServiceResourceProxy.fetchResourceSync");
            return fetchResourceSync;
        }
        TraceEvent.LJ("LynxServiceResourceProxy.fetchResourceSync");
        return null;
    }

    @Override // X.VA4
    public final void preload(String str, O3M o3m) {
        TraceEvent.LIZIZ("LynxServiceResourceProxy.preload");
        if (LJII()) {
            ((VA4) this.LIZIZ).preload(str, o3m);
        }
        TraceEvent.LJ("LynxServiceResourceProxy.preload");
    }

    @Override // X.VA4
    public final O3S fetchResourceAsync(String str, O3M o3m, O3R o3r) {
        TraceEvent.LIZIZ("LynxServiceResourceProxy.fetchResourceAsync");
        if (LJII()) {
            O3S fetchResourceAsync = ((VA4) this.LIZIZ).fetchResourceAsync(str, o3m, o3r);
            TraceEvent.LJ("LynxServiceResourceProxy.fetchResourceAsync");
            return fetchResourceAsync;
        }
        TraceEvent.LJ("LynxServiceResourceProxy.fetchResourceAsync");
        return null;
    }

    @Override // X.VA4
    public final void preloadMedia(String str, String str2, String str3, long j) {
        TraceEvent.LIZIZ("LynxServiceResourceProxy.preloadMedia");
        if (LJII()) {
            ((VA4) this.LIZIZ).preloadMedia(str, str2, str3, j);
        }
        TraceEvent.LJ("LynxServiceResourceProxy.preloadMedia");
    }
}
