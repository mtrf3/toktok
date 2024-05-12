package X;

import com.bytedance.keva.Keva;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class WR3 {
    public final InterfaceC142225i6 LIZ;
    public final InterfaceC142225i6 LIZIZ;
    public final InterfaceC82284WRc LIZJ;
    public final java.util.Map<String, String> LIZLLL;
    public final Keva LJ;

    public WR3(TMK tmk, InterfaceC142225i6 interfaceC142225i6, InterfaceC82284WRc filterStore) {
        o.LJIIIZ(filterStore, "filterStore");
        this.LIZ = tmk;
        this.LIZIZ = interfaceC142225i6;
        this.LIZJ = filterStore;
        this.LIZLLL = C113554cx.LJJL(new OSZ("filtercomposer", "colorfilternew"), new OSZ("filtercomposerexperiment", "colorfilterexperiment"));
        this.LJ = Keva.getRepo("Filter_Data_Migration");
    }
}
