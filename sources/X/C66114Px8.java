package X;

import Y.ARunnableS18S0000000_11;
import com.bytedance.helios.api.config.SettingsModel;
import com.bytedance.helios.sdk.HeliosEnvImpl;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.Px8, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66114Px8 implements InterfaceC66094Pwo {
    public static final C66114Px8 LIZ = new C66114Px8();

    @Override // X.InterfaceC66094Pwo
    public final String type() {
        return "decision_engine";
    }

    @Override // X.InterfaceC66032Pvo
    public final void onNewSettings(SettingsModel newSettings) {
        o.LJIIIZ(newSettings, "newSettings");
        C66112Px6.LIZIZ.onNewSettings(newSettings);
    }

    @Override // X.InterfaceC66094Pwo
    public final boolean LIZ(C66120PxE event, boolean z) {
        String str;
        C66168Py0 c66168Py0;
        o.LJIIIZ(event, "event");
        long nanoTime = System.nanoTime();
        java.util.Map LIZIZ = C66112Px6.LIZIZ(event, z);
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("generateParams");
        if (z) {
            str = "F";
        } else {
            str = "G";
        }
        LIZ2.append(str);
        C66210Pyg c66210Pyg = null;
        C65929Pu9.LIZIZ(X1D.LIZIZ(LIZ2), nanoTime, null);
        long nanoTime2 = System.nanoTime();
        HeliosEnvImpl heliosEnvImpl = HeliosEnvImpl.get();
        o.LJIIIIZZ(heliosEnvImpl, "HeliosEnvImpl.get()");
        InterfaceC66053Pw9 LJIIIZ = heliosEnvImpl.LJIIIZ();
        if (LJIIIZ != null) {
            int i = event.LJLJI;
            java.util.Set<EnumC66158Pxq> checkModes = event.LLI.getCheckModes();
            ArrayList arrayList = new ArrayList(C32I.LJJL(checkModes, 10));
            for (EnumC66158Pxq enumC66158Pxq : checkModes) {
                if (enumC66158Pxq == EnumC66158Pxq.SYNC) {
                    c66168Py0 = new C66168Py0(enumC66158Pxq, null);
                } else {
                    c66168Py0 = new C66168Py0(enumC66158Pxq, new C66133PxR(event.LIZ()));
                }
                arrayList.add(c66168Py0);
            }
            c66210Pyg = ((C66143Pxb) LJIIIZ).LJ(LIZIZ, i, arrayList, null);
        }
        return LIZIZ(event, z, c66210Pyg, nanoTime2);
    }

    public static boolean LIZIZ(C66120PxE c66120PxE, boolean z, C66210Pyg c66210Pyg, long j) {
        Q11 q11;
        String str;
        if (c66210Pyg != null && (q11 = c66210Pyg.LJLJJLL) != null) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("validate");
            String str2 = "F";
            if (z) {
                str = "F";
            } else {
                str = "G";
            }
            LIZ2.append(str);
            C65929Pu9.LIZIZ(X1D.LIZIZ(LIZ2), j, C51029K0z.LJJIIZI(new OSZ("cache", Boolean.valueOf(q11.LIZLLL.LJLILLLLZI))));
            HandlerThreadC64418PPy.LIZ();
            HandlerThreadC64418PPy.LJLJJI.post(new ARunnableS18S0000000_11(32));
            long nanoTime = System.nanoTime();
            boolean LIZJ = C66112Px6.LIZJ(c66120PxE, z, q11);
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("handleResponse");
            if (!z) {
                str2 = "G";
            }
            LIZ3.append(str2);
            C65929Pu9.LIZIZ(X1D.LIZIZ(LIZ3), nanoTime, null);
            return LIZJ;
        }
        return false;
    }
}
