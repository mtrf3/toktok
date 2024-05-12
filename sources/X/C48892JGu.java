package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.JGu, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48892JGu {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(C48881JGj provider, boolean z) {
        IWH LJJIJIL;
        o.LJIIIZ(provider, "provider");
        C48880JGi LJI = provider.LJI();
        if (LJI == null) {
            return;
        }
        InterfaceC46330IGg interfaceC46330IGg = provider.LJIILIIL;
        if (interfaceC46330IGg == null) {
            if (z) {
                interfaceC46330IGg = IQT.LIZ.LIZ();
            } else {
                interfaceC46330IGg = null;
            }
        }
        Integer num = provider.LJJIIZ;
        if (num != null) {
            int intValue = num.intValue();
            if (interfaceC46330IGg != null && (LJJIJIL = interfaceC46330IGg.LJJIJIL()) != null) {
                LJJIJIL.LJJLIIIJLLLLLLLZ(intValue);
            }
        }
        JHI LIZ2 = JHI.LIZ();
        LIZ2.LIZ = interfaceC46330IGg;
        LIZ2.LIZJ = LJI.LIZJ;
        LIZ2.LJIILJJIL = LJI.LJ;
        LIZ2.LJFF = true;
        provider.LIZLLL(System.currentTimeMillis());
        C48893JGv.LJIIIIZZ = System.currentTimeMillis();
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("inner last start play time: ");
        LIZ3.append(C48893JGv.LJIIIIZZ);
        X1D.LIZIZ(LIZ3);
        C48893JGv.LJFF = true;
        StringBuilder LIZ4 = X1D.LIZ();
        LIZ4.append("outer to inner, current: ");
        LIZ4.append(System.currentTimeMillis());
        X1D.LIZIZ(LIZ4);
        if (interfaceC46330IGg != null && interfaceC46330IGg.isPlaying()) {
            C48893JGv.LJII(provider.LJJIJ);
            provider.LJJIJ = 0L;
        }
        Aweme aweme = provider.LIZJ;
        if (aweme != null && ((C50322Jp0) KNV.LIZ()).LJLIL == C50605JtZ.LJIIJJI()) {
            String aid = aweme.getAid();
            if (aid == null) {
                aid = "";
            }
            C17N.LJJJJLL().j4(new JIR(true, aid));
        }
        provider.LJIILIIL = null;
        C48880JGi LJI2 = provider.LJI();
        if (LJI2 != null) {
            LJI2.LJFF = null;
        }
        C48880JGi LJI3 = provider.LJI();
        if (LJI3 != null) {
            LJI3.LJI = -1;
        }
        C48880JGi LJI4 = provider.LJI();
        if (LJI4 != null) {
            LJI4.LJII = false;
        }
        C48880JGi LJI5 = provider.LJI();
        if (LJI5 != null) {
            LJI5.LJ = -1;
        }
        C46331IGh c46331IGh = provider.LJ;
        if (c46331IGh != null) {
            c46331IGh.LIZJ();
        }
        C46331IGh c46331IGh2 = provider.LJ;
        if (c46331IGh2 != null) {
            c46331IGh2.LJI(null);
        }
        provider.LIZLLL = true;
    }

    public static void LIZIZ(Aweme aweme, boolean z, String shareId, long j, long j2) {
        int i;
        o.LJIIIZ(shareId, "shareId");
        JGY jgy = JGX.LIZ;
        C48880JGi LIZ2 = jgy.LIZ(shareId);
        if (LIZ2 == null) {
            LIZ2 = new C48880JGi(new OUP(), shareId);
        }
        C48893JGv.LJI();
        C48893JGv.LJ = System.currentTimeMillis();
        C48893JGv.LJI = true;
        LIZ2.LIZJ = j;
        if (JHI.LIZ().LIZ != null) {
            LIZ2.LJFF = JHI.LIZ().LIZ;
            JHI.LIZ().LIZ = null;
            LIZ2.LJII = true;
        } else {
            LIZ2.LJI = (int) j2;
        }
        LIZ2.LJ = JHI.LIZ().LJIILJJIL;
        JHI.LIZ().LJIILJJIL = -1;
        if (z) {
            i = 3;
        } else {
            i = 4;
        }
        LIZ2.LIZ = i;
        ((HashMap) jgy.LIZ).put(shareId, LIZ2);
    }
}
