package X;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.EuC, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37904EuC {
    public static final /* synthetic */ int LJIILIIL = 0;
    public C37903EuB LIZ;
    public InterfaceC37958Ev4 LIZLLL;
    public VNS LJ;
    public C37909EuH LJFF;
    public C37856EtQ LJIIJ;
    public final C37913EuL LIZIZ = new C37913EuL(this);
    public final C37965EvB LIZJ = new C37965EvB(this);
    public String LJI = "";
    public final List<AbstractC37899Eu7> LJII = new ArrayList();
    public final java.util.Set<InterfaceC37980EvQ> LJIIIIZZ = new LinkedHashSet();
    public final C37855EtP LJIIIZ = new C37855EtP();
    public EnumC37844EtE LJIIJJI = EnumC37844EtE.ALL;
    public final C37936Eui LJIIL = new C37936Eui();

    public final String LIZ() {
        C37856EtQ c37856EtQ = this.LJIIJ;
        if (c37856EtQ != null) {
            return c37856EtQ.LIZLLL;
        }
        return null;
    }

    public final boolean LIZIZ(C37955Ev1 call) {
        C37856EtQ c37856EtQ;
        o.LJIIJ(call, "call");
        if (this.LJIIJ == null) {
            return false;
        }
        if ((!o.LJ(call.LJIIIIZZ, LIZ()) && call.LJIIIIZZ.length() != 0) || (c37856EtQ = this.LJIIJ) == null || c37856EtQ.LIZIZ(this, call.LIZLLL) == null) {
            return false;
        }
        return true;
    }
}
