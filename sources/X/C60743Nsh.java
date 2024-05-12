package X;

import android.text.TextUtils;
import com.bytedance.ies.bullet.service.base.IResourceLoaderService;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.AqS141S0200000_10;
import kotlin.jvm.internal.o;

/* renamed from: X.Nsh, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60743Nsh extends AbstractC61008Nwy<Object, byte[]> {
    public final WeakReference<InterfaceC60323Nlv> LIZ;
    public final C60379Nmp LIZIZ;

    public C60743Nsh(InterfaceC60323Nlv token, C60379Nmp service) {
        o.LJIIJ(token, "token");
        o.LJIIJ(service, "service");
        this.LIZIZ = service;
        this.LIZ = new WeakReference<>(token);
    }

    @Override // X.AbstractC61008Nwy
    public final void LIZ(C08200Tw c08200Tw, QXX qxx) {
        IResourceLoaderService iResourceLoaderService;
        InterfaceC60323Nlv interfaceC60323Nlv;
        String str = (String) c08200Tw.LIZ;
        InterfaceC60323Nlv interfaceC60323Nlv2 = null;
        if ((!TextUtils.isEmpty(str)) && str != null && (iResourceLoaderService = (IResourceLoaderService) this.LIZIZ.getService(IResourceLoaderService.class)) != null) {
            O1L o1l = new O1L(0);
            o1l.LJIIJJI = "external_js";
            WeakReference<InterfaceC60323Nlv> weakReference = this.LIZ;
            if (weakReference != null) {
                interfaceC60323Nlv2 = weakReference.get();
            }
            o1l.LJIIJ = interfaceC60323Nlv2;
            try {
                android.net.Uri uri = UriProtector.parse(str);
                o.LJFF(uri, "uri");
                o1l.LJIIL = new C60550Npa(uri);
                String queryParameter = UriProtector.getQueryParameter(uri, "surl");
                if (queryParameter != null) {
                    o1l.LJII = queryParameter;
                }
                String queryParameter2 = UriProtector.getQueryParameter(uri, "channel");
                if (queryParameter2 != null) {
                    o1l.LJ = queryParameter2;
                }
                String queryParameter3 = UriProtector.getQueryParameter(uri, "bundle");
                if (queryParameter3 != null) {
                    o1l.LJFF = queryParameter3;
                }
                o1l.LIZJ = 1;
                String queryParameter4 = UriProtector.getQueryParameter(uri, "dynamic");
                if (queryParameter4 != null) {
                    o1l.LIZJ = Integer.valueOf(CastIntegerProtector.parseInt(queryParameter4));
                }
            } catch (Throwable th) {
                WeakReference<InterfaceC60323Nlv> weakReference2 = this.LIZ;
                if (weakReference2 != null && (interfaceC60323Nlv = weakReference2.get()) != null) {
                    interfaceC60323Nlv.printReject(th, "ExternalJSProvider parse url error");
                }
                qxx.LLLILZJ(new VEH(-1, th));
            }
            iResourceLoaderService.loadAsync(str, o1l, new AqS141S0200000_10(this, qxx, 24), new AqS141S0200000_10(this, qxx, 25));
        }
    }
}
