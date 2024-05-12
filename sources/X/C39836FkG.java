package X;

import android.app.Application;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.FkG, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39836FkG {
    public boolean LIZ;
    public Application LIZIZ;
    public C39858Fkc LIZLLL;
    public FD2 LJ;
    public static final C38262Ezy LJII = new C38262Ezy();
    public static final C5H3 LJI = C221108m2.LIZ(EnumC221088m0.SYNCHRONIZED, C39837FkH.LJLIL);
    public final HashMap<String, InterfaceC39861Fkf> LIZJ = new HashMap<>();
    public final C39835FkF LJFF = new C39835FkF();

    public final Application LIZIZ() {
        Application application = this.LIZIZ;
        if (application != null) {
            return application;
        }
        o.LJIJI("context");
        throw null;
    }

    public final void LIZ(String oldContainerId, String newContainerId) {
        M2H m2h;
        o.LJIIJ(oldContainerId, "oldContainerId");
        o.LJIIJ(newContainerId, "newContainerId");
        HashMap<String, InterfaceC39861Fkf> hashMap = this.LIZJ;
        InterfaceC39861Fkf interfaceC39861Fkf = hashMap.get(oldContainerId);
        if (interfaceC39861Fkf == null || (m2h = interfaceC39861Fkf.LIZLLL()) == null) {
            m2h = new M2H();
        }
        hashMap.put(newContainerId, m2h);
    }
}
