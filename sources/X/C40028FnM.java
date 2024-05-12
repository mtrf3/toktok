package X;

import com.bytedance.ies.bullet.service.base.IResourceLoaderService;
import kotlin.jvm.internal.AqS52S0400000_6;
import kotlin.jvm.internal.o;

/* renamed from: X.FnM, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40028FnM implements InterfaceC39980Fma {
    public final InterfaceC60323Nlv LIZ;

    public C40028FnM(InterfaceC60323Nlv _token) {
        o.LJIIJ(_token, "_token");
        this.LIZ = _token;
    }

    @Override // X.InterfaceC39980Fma
    public final void LIZ(C39984Fme requestParams, InterfaceC39983Fmd interfaceC39983Fmd) {
        o.LJIIJ(requestParams, "requestParams");
        IResourceLoaderService iResourceLoaderService = (IResourceLoaderService) this.LIZ.getService(IResourceLoaderService.class);
        C39982Fmc c39982Fmc = new C39982Fmc();
        if (iResourceLoaderService == null) {
            c39982Fmc.LIZ = -100;
            if (interfaceC39983Fmd != null) {
                interfaceC39983Fmd.LIZIZ(c39982Fmc);
            }
            InterfaceC60323Nlv interfaceC60323Nlv = this.LIZ;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("request ");
            interfaceC60323Nlv.printLog(JBR.LJFF(LIZ, requestParams.LIZ, " failed, for no resourceLoader found", LIZ), EnumC39958FmE.E, "DefaultLynxRequestProvider");
            return;
        }
        String str = requestParams.LIZ;
        o.LJFF(str, "requestParams.url");
        O1L o1l = new O1L(0);
        o1l.LJIIJJI = "sub_source";
        o1l.LJIIJ = this.LIZ;
        iResourceLoaderService.loadAsync(str, o1l, new AqS52S0400000_6(this, interfaceC39983Fmd, requestParams, c39982Fmc, 2), new AqS52S0400000_6(this, interfaceC39983Fmd, requestParams, c39982Fmc, 3));
    }
}
