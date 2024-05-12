package X;

import com.bytedance.ies.bullet.service.base.IResourceLoaderService;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import kotlin.jvm.internal.AqS176S0100000_10;
import kotlin.jvm.internal.o;

/* renamed from: X.NqK, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60596NqK implements InterfaceC61096NyO {
    public final InterfaceC60323Nlv LIZ;
    public final IResourceLoaderService LIZIZ;

    public C60596NqK(InterfaceC60323Nlv context, IResourceLoaderService iResourceLoaderService) {
        o.LJIIJ(context, "context");
        this.LIZ = context;
        this.LIZIZ = iResourceLoaderService;
    }

    @Override // X.InterfaceC61096NyO
    public final void LIZ(String str, InterfaceC60597NqL interfaceC60597NqL) {
        if (str == null) {
            interfaceC60597NqL.LIZ(null, new Throwable("url is null"));
            return;
        }
        O1L o1l = new O1L(0);
        o1l.LJIIJ = this.LIZ;
        o1l.LJIIJJI = "component";
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
            this.LIZ.printReject(th, "DefaultDynamicComponentFetcher parse url error");
        }
        this.LIZIZ.loadAsync(str, o1l, new AqS176S0100000_10(interfaceC60597NqL, 113), new AqS176S0100000_10(interfaceC60597NqL, 114));
    }
}
