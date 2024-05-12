package X;

import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class NZW implements InterfaceC59568NZk {
    public final /* synthetic */ NZQ LIZ;

    public NZW(NZQ nzq) {
        this.LIZ = nzq;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.NaV, X.NZR] */
    @Override // X.InterfaceC59568NZk
    public final void LIZ(String url, boolean z, java.util.Map map, Boolean bool, boolean z2) {
        o.LJIIIZ(url, "url");
        this.LIZ.LJIL(z, z2, url, bool);
        ?? r0 = this.LIZ.LJLJL;
        if (r0 != 0) {
            r0.getView().setVisibility(0);
            if (map != null) {
                C59615NaV c59615NaV = this.LIZ.LJLJL;
                if (c59615NaV != null) {
                    c59615NaV.loadUrl(url, map);
                    return;
                } else {
                    o.LJIJI("iWebViewRuntime");
                    throw null;
                }
            }
            C59615NaV c59615NaV2 = this.LIZ.LJLJL;
            if (c59615NaV2 != null) {
                c59615NaV2.loadUrl(url);
                return;
            } else {
                o.LJIJI("iWebViewRuntime");
                throw null;
            }
        }
        o.LJIJI("iWebViewRuntime");
        throw null;
    }
}
