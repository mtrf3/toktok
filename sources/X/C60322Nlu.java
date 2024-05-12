package X;

import android.app.Application;
import com.bytedance.ies.bullet.kit.lynx.ILynxKitApi;
import com.ss.android.ugc.aweme.bullet.impl.BulletService;
import kotlin.jvm.internal.o;

/* renamed from: X.Nlu, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60322Nlu {
    public static Application LIZ;

    public static void LIZ(Application application) {
        o.LJIIIZ(application, "application");
        if (LIZ != null) {
            return;
        }
        BulletService.LIZ().LJIIL(ILynxKitApi.class);
        LIZ = application;
        C39960FmG c39960FmG = new C39960FmG(application);
        C39961FmH.LIZIZ = false;
        C39966FmM c39966FmM = new C39966FmM(c39960FmG.LJFF, c39960FmG);
        InterfaceC60324Nlw LIZIZ = C60373Nmj.LIZIZ();
        C60342NmE c60342NmE = new C60342NmE();
        c60342NmE.LIZ(InterfaceC60316Nlo.class, new C40019FnD(c39966FmM));
        LIZIZ.LJI(new C60378Nmo(c60342NmE));
        C60308Nlg c60308Nlg = new C60308Nlg("default_bid", new C31958CgU(application, false));
        InterfaceC60316Nlo interfaceC60316Nlo = (InterfaceC60316Nlo) C60299NlX.LIZ(c60308Nlg, InterfaceC60316Nlo.class);
        if (interfaceC60316Nlo != null) {
            interfaceC60316Nlo.LJJIJIIJI(c60308Nlg);
        }
    }
}
