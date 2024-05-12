package X;

import com.bytedance.ies.bullet.kit.web.IWebKitApi;
import com.ss.android.ugc.aweme.bullet.impl.BulletService;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* renamed from: X.Nle, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60306Nle implements InterfaceC60360NmW {
    public final /* synthetic */ BulletService LIZ;

    public C60306Nle(BulletService bulletService) {
        this.LIZ = bulletService;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC60360NmW
    public final void LIZ(C60249Nkj c60249Nkj, C60218NkE c60218NkE) {
        c60249Nkj.LIZIZ(IWebKitApi.class, false);
        C60320Nls c60320Nls = new C60320Nls();
        for (Map.Entry entry : ((LinkedHashMap) c60249Nkj.LIZIZ).entrySet()) {
            if ((entry.getValue() instanceof C60273Nl7) || (entry.getValue() instanceof C60265Nkz)) {
                c60249Nkj.LJ = c60320Nls;
            } else {
                Object apiClass = entry.getKey();
                try {
                    InterfaceC60224NkK LLLJ = ((InterfaceC60250Nkk) entry.getValue()).LLLJ(c60320Nls);
                    if (LLLJ != null) {
                        C60229NkP c60229NkP = c60249Nkj.LIZJ;
                        c60229NkP.getClass();
                        o.LJIIJ(apiClass, "apiClass");
                        c60229NkP.LIZLLL.put(apiClass, LLLJ);
                    }
                } catch (Throwable unused) {
                }
            }
        }
        c60249Nkj.LIZLLL.put("defaultPackageBundle", new C40475FuZ());
        c60249Nkj.LIZLLL.put("ad_commerce", new C40474FuY());
        this.LIZ.getClass();
        InterfaceC60324Nlw LIZIZ = C60373Nmj.LIZIZ();
        String str = c60218NkE.LIZ;
        C60342NmE c60342NmE = new C60342NmE();
        c60342NmE.LIZ(InterfaceC60270Nl4.class, new C60337Nm9());
        c60342NmE.LIZ(InterfaceC60353NmP.class, new C60345NmH());
        c60342NmE.LIZ(InterfaceC60336Nm8.class, new C60458No6());
        C60348NmK c60348NmK = new C60348NmK();
        c60348NmK.LIZ = false;
        c60342NmE.LIZ(InterfaceC39975FmV.class, new C60371Nmh(new C60347NmJ(c60348NmK)));
        c60342NmE.LIZ(InterfaceC60184Njg.class, new C60307Nlf(new C60331Nm3(new C60332Nm4())));
        LIZIZ.LJIIIIZZ(str, new C60378Nmo(c60342NmE));
    }
}
