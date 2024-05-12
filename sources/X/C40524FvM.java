package X;

import com.bytedance.ies.bullet.service.base.IResourceLoaderService;
import com.bytedance.mt.protector.impl.UriProtector;
import kotlin.jvm.internal.AqS172S0100000_6;
import kotlin.jvm.internal.o;

/* renamed from: X.FvM, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40524FvM extends AbstractC40526FvO {
    public final InterfaceC60323Nlv LIZ;

    public C40524FvM(InterfaceC60323Nlv _token) {
        o.LJIIJ(_token, "_token");
        this.LIZ = _token;
    }

    @Override // X.AbstractC40526FvO
    public final void LIZ(InterfaceC40525FvN interfaceC40525FvN, String url) {
        o.LJIIJ(url, "url");
        IResourceLoaderService iResourceLoaderService = (IResourceLoaderService) this.LIZ.getService(IResourceLoaderService.class);
        if (iResourceLoaderService == null) {
            interfaceC40525FvN.onFailed("ResourceLoader Not Found!");
            return;
        }
        O1L o1l = new O1L(0);
        o1l.LJIIJJI = "template";
        o1l.LJIIJ = this.LIZ;
        android.net.Uri parse = UriProtector.parse(url);
        o.LJFF(parse, "Uri.parse(url)");
        o1l.LJIIL = new C60550Npa(parse);
        iResourceLoaderService.loadAsync(url, o1l, new AqS172S0100000_6(interfaceC40525FvN, 69), new AqS172S0100000_6(interfaceC40525FvN, 70));
    }
}
