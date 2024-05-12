package X;

import com.bytedance.helios.sdk.HeliosEnvImpl;
import kotlin.jvm.internal.o;

/* renamed from: X.Pw3, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66047Pw3 extends AbstractC65781Prl implements InterfaceC65784Pro<InterfaceC66048Pw4> {
    public static final C66047Pw3 LJLIL = new C66047Pw3();

    public C66047Pw3() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final InterfaceC66048Pw4 invoke() {
        C66055PwB LJ;
        HeliosEnvImpl heliosEnvImpl = HeliosEnvImpl.get();
        o.LJIIIIZZ(heliosEnvImpl, "HeliosEnvImpl.get()");
        InterfaceC66045Pw1 interfaceC66045Pw1 = heliosEnvImpl.LJIILIIL;
        if (interfaceC66045Pw1 == null || (LJ = interfaceC66045Pw1.LJ()) == null) {
            return null;
        }
        return LJ.LIZ("helios");
    }
}
