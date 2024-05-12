package X;

import android.app.Application;
import com.bytedance.ies.bullet.kit.lynx.ILynxKitApi;
import com.bytedance.ies.bullet.service.base.IResourceLoaderService;
import kotlin.jvm.internal.o;

/* renamed from: X.Nml, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60375Nml extends AbstractC60374Nmk {
    public final InterfaceC60377Nmn LIZJ;

    @Override // X.AbstractC60374Nmk
    public final C60249Nkj LIZIZ() {
        Application application = this.LIZJ.LIZIZ().LIZJ;
        C60249Nkj c60249Nkj = this.LIZIZ;
        C60342NmE c60342NmE = c60249Nkj.LIZ;
        c60342NmE.LIZ(InterfaceC38945FQf.class, new C60376Nmm(application));
        c60342NmE.LIZ(InterfaceC60232NkS.class, new C60230NkQ(this.LIZJ.LJIIIZ()));
        c60342NmE.LIZ(InterfaceC60190Njm.class, new C60419NnT(this.LIZJ.LJIIIIZZ()));
        c60342NmE.LIZ(InterfaceC60385Nmv.class, new C60414NnO(this.LIZJ.LJIIJJI()));
        c60342NmE.LIZ(InterfaceC60316Nlo.class, new C40019FnD(this.LIZJ.LJII()));
        O1D o1d = new O1D(application);
        o1d.init(this.LIZJ.LJI());
        c60342NmE.LIZ(IResourceLoaderService.class, o1d);
        c60342NmE.LIZ(InterfaceC60276NlA.class, new C60544NpU(this.LIZJ.LJIIJ(), this.LIZJ.LJFF()));
        return c60249Nkj;
    }

    public C60375Nml(C60504Noq c60504Noq) {
        super(c60504Noq);
        this.LIZJ = c60504Noq;
    }

    @Override // X.AbstractC60374Nmk
    public final C60263Nkx LIZ(String bid) {
        o.LJIIJ(bid, "bid");
        Application application = this.LIZJ.LIZIZ().LIZJ;
        C60218NkE c60218NkE = new C60218NkE(this.LIZJ.LIZIZ().LIZJ);
        if (bid.length() == 0) {
            bid = this.LIZJ.LIZIZ().LIZ;
        }
        o.LJIIJ(bid, "<set-?>");
        c60218NkE.LIZ = bid;
        C63081OpJ c63081OpJ = this.LIZJ.LIZIZ().LIZIZ;
        o.LJIIJ(c63081OpJ, "<set-?>");
        c60218NkE.LIZIZ = c63081OpJ;
        C60249Nkj LIZIZ = LIZIZ();
        InterfaceC60324Nlw LIZIZ2 = C60373Nmj.LIZIZ();
        String bid2 = c60218NkE.LIZ;
        C60342NmE c60342NmE = LIZIZ.LIZ;
        c60342NmE.getClass();
        o.LJIIJ(bid2, "bid");
        c60342NmE.LIZIZ = bid2;
        LIZIZ2.LJIIIIZZ(bid2, new C60378Nmo(c60342NmE));
        LIZIZ.LIZIZ(ILynxKitApi.class, false);
        o.LJIIJ(application, "application");
        C60229NkP c60229NkP = LIZIZ.LIZJ;
        F3T f3t = new F3T();
        f3t.LJ(Application.class, new F25(application));
        c60229NkP.getClass();
        c60229NkP.LIZ = f3t;
        C60229NkP c60229NkP2 = LIZIZ.LIZJ;
        c60229NkP2.getClass();
        c60229NkP2.LIZIZ = c60218NkE;
        InterfaceC60360NmW interfaceC60360NmW = this.LIZ;
        if (interfaceC60360NmW != null) {
            interfaceC60360NmW.LIZ(LIZIZ, c60218NkE);
        }
        C60263Nkx LIZ = LIZIZ.LIZ();
        String bid3 = c60218NkE.LIZ;
        C60383Nmt c60383Nmt = new C60383Nmt(LIZ);
        o.LJIIJ(bid3, "bid");
        C58233MtJ.LIZ.put(bid3, c60383Nmt);
        return LIZ;
    }
}
