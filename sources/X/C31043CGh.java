package X;

import Y.ARunnableS41S0100000_5;
import Y.ARunnableS46S0100000_10;
import com.bytedance.android.livesdkapi.host.IHostResource;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.CGh, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31043CGh {
    public static int LIZ;
    public static int LIZIZ;
    public static int LIZJ;
    public static boolean LIZLLL;
    public static final List<String> LJ = new ArrayList();

    public final void LIZ() {
        if (LIZ != 0) {
            return;
        }
        LIZ = 2;
        C38995FSd.LIZIZ().submit(new ARunnableS46S0100000_10(this, 156));
    }

    public final void LIZIZ() {
        if (!LIZLLL) {
            ((IHostResource) CN1.LIZ(IHostResource.class)).Te0("tiktok_live_interaction_cross_platform");
            LIZLLL = true;
        }
        if (LIZIZ != 0) {
            return;
        }
        LIZIZ = 2;
        C38995FSd.LIZIZ().submit(new ARunnableS41S0100000_5(this, 284));
    }

    public final void LIZJ() {
        if (LIZJ != 0) {
            return;
        }
        LIZJ = 2;
        C38995FSd.LIZIZ().submit(new ARunnableS41S0100000_5(this, 285));
    }

    public static void LIZLLL(String str, InterfaceC65784Pro interfaceC65784Pro, boolean z) {
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("check update : ");
        LIZ2.append(str);
        C0NB.LIZIZ("GamePartnershipGeckoHandler", X1D.LIZIZ(LIZ2));
        InterfaceC06390Mx LIZ3 = CN1.LIZ(IHostResource.class);
        o.LJIIIIZZ(LIZ3, "getService(IHostResource::class.java)");
        IHostResource iHostResource = (IHostResource) LIZ3;
        boolean Br0 = iHostResource.Br0(str);
        ArrayList arrayList = (ArrayList) LJ;
        if (!arrayList.contains(str)) {
            Boolean valueOf = Boolean.valueOf(z);
            Boolean valueOf2 = Boolean.valueOf(Br0);
            BZI LIZ4 = C28787BRn.LIZ("livesdk_game_partnership_gecko_exist");
            LIZ4.LJIJJ(str, "channel");
            LIZ4.LJIJJ(Integer.valueOf(o.LJ(valueOf, Boolean.TRUE) ? 1 : 0), "is_anchor");
            LIZ4.LJIJJ(valueOf2, "gecko_exist");
            LIZ4.LJJIIJZLJL();
            arrayList.add(str);
        }
        iHostResource.FN(new C31042CGg(str, interfaceC65784Pro, z, Br0), str);
    }
}
