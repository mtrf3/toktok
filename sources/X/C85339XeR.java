package X;

import android.content.Context;
import com.bytedance.bpea.cert.token.TokenCert;
import com.ss.android.ugc.tiktok.location_api.service.ILocationBaseServiceForMT;
import kotlin.jvm.internal.o;

/* renamed from: X.XeR, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85339XeR {
    public static final C62822Ol8 LIZJ = C221108m2.LIZIZ(C85343XeV.LJLIL);
    public final C62822Ol8 LIZ = C221108m2.LIZIZ(C85340XeS.LJLIL);
    public final C62822Ol8 LIZIZ = C221108m2.LIZIZ(C85341XeT.LJLIL);

    public final ILocationBaseServiceForMT LIZIZ() {
        Object value = this.LIZ.getValue();
        o.LJIIIIZZ(value, "<get-locationService>(...)");
        return (ILocationBaseServiceForMT) value;
    }

    public final boolean LIZJ() {
        return C85256Xd6.LIZIZ((Context) this.LIZIZ.getValue());
    }

    public final EnumC85338XeQ LIZ() {
        if (!LIZJ()) {
            return EnumC85338XeQ.NOT_GRANTED;
        }
        boolean isSystemPrecise = LIZIZ().isSystemPrecise((Context) this.LIZIZ.getValue());
        boolean inAppPreciseUnknown = LIZIZ().inAppPreciseUnknown();
        boolean isInAppPrecise = LIZIZ().isInAppPrecise();
        if (!inAppPreciseUnknown && isInAppPrecise && isSystemPrecise) {
            return EnumC85338XeQ.PRECISE;
        }
        return EnumC85338XeQ.COARSE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void LIZLLL(C85339XeR c85339XeR, Context context, TokenCert cert, final InterfaceC65784Pro interfaceC65784Pro, C85258Xd8 c85258Xd8) {
        c85339XeR.getClass();
        o.LJIIIZ(cert, "cert");
        ActivityC45651qj LJJIFFI = C45804HyK.LJJIFFI(context);
        if (LJJIFFI != null) {
            C56179M3b c56179M3b = C56179M3b.LIZ;
            final InterfaceC88472Yns interfaceC88472Yns = null;
            final Object[] objArr = 0 == true ? 1 : 0;
            c56179M3b.LJIJI("poi", "add_location", cert, LJJIFFI, c85258Xd8, new InterfaceC54674Ld0() { // from class: X.4rf
                @Override // X.InterfaceC54674Ld0
                public final void LIZ() {
                    InterfaceC65784Pro<C76800UCe> interfaceC65784Pro2 = interfaceC65784Pro;
                    if (interfaceC65784Pro2 != null) {
                        interfaceC65784Pro2.invoke();
                    }
                }

                @Override // X.InterfaceC54674Ld0
                public final void LIZJ(int i) {
                    InterfaceC88472Yns<Integer, C76800UCe> interfaceC88472Yns2 = interfaceC88472Yns;
                    if (interfaceC88472Yns2 != null) {
                        interfaceC88472Yns2.invoke(Integer.valueOf(i));
                    }
                }

                @Override // X.InterfaceC54674Ld0
                public final void LIZIZ(int i, String str) {
                    InterfaceC88471Ynr<Integer, String, C76800UCe> interfaceC88471Ynr = objArr;
                    if (interfaceC88471Ynr != null) {
                        interfaceC88471Ynr.invoke(Integer.valueOf(i), str);
                    }
                }
            }, null);
        }
    }
}
