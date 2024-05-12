package X;

import android.content.Context;
import java.io.File;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class WQY implements InterfaceC45333Hqj {
    public InterfaceC139745e6<InterfaceC82272WQq> LIZ;
    public InterfaceC139745e6<InterfaceC82271WQp> LIZIZ;
    public InterfaceC139745e6<AbstractC48314Ixi> LIZJ;
    public Boolean LIZLLL;
    public InterfaceC139745e6<InterfaceC82275WQt> LJ;
    public InterfaceC139745e6<InterfaceC82277WQv> LJFF;
    public final Context LJI;
    public final InterfaceC139745e6<InterfaceC84497XEf> LJII;
    public final InterfaceC139745e6<String> LJIIIIZZ;
    public final InterfaceC82281WQz LJIIIZ;
    public final boolean LJIIJ;

    @Override // X.InterfaceC45333Hqj
    public final WQW create() {
        InterfaceC82272WQq c82266WQk;
        InterfaceC82271WQp interfaceC82271WQp;
        boolean z;
        InterfaceC139745e6<InterfaceC82272WQq> interfaceC139745e6 = this.LIZ;
        if (interfaceC139745e6 == null || (c82266WQk = interfaceC139745e6.get()) == null) {
            String filterFileRootDir = new File(C44687HgJ.LJIIIZ(this.LJI), "filters").getAbsolutePath();
            o.LJIIIIZZ(filterFileRootDir, "filterFileRootDir");
            c82266WQk = new C82266WQk(new C82261WQf(filterFileRootDir));
        }
        InterfaceC139745e6<InterfaceC82277WQv> interfaceC139745e62 = this.LJFF;
        if (interfaceC139745e62 != null) {
            InterfaceC82277WQv interfaceC82277WQv = interfaceC139745e62.get();
            o.LJIIIIZZ(interfaceC82277WQv, "it.get()");
            c82266WQk.LJI(interfaceC82277WQv);
        }
        InterfaceC139745e6<InterfaceC82271WQp> interfaceC139745e63 = this.LIZIZ;
        if (interfaceC139745e63 == null || (interfaceC82271WQp = interfaceC139745e63.get()) == null) {
            interfaceC82271WQp = C82279WQx.LIZ;
        }
        InterfaceC139745e6 interfaceC139745e64 = this.LIZJ;
        if (interfaceC139745e64 == null) {
            interfaceC139745e64 = new C48311Ixf();
        }
        C82264WQi c82264WQi = new C82264WQi(c82266WQk, interfaceC82271WQp, interfaceC139745e64);
        InterfaceC139745e6<InterfaceC82275WQt> interfaceC139745e65 = this.LJ;
        if (interfaceC139745e65 != null) {
            InterfaceC82275WQt interfaceC82275WQt = interfaceC139745e65.get();
            o.LJIIIIZZ(interfaceC82275WQt, "it.get()");
            c82264WQi.LIZLLL = interfaceC82275WQt;
        }
        WQZ wqz = new WQZ(interfaceC82271WQp, c82264WQi, c82266WQk);
        WQS wqs = new WQS(new C82256WQa(interfaceC82271WQp), new WQU(this.LJII, this.LJIIIIZZ, this.LJIIJ));
        WQG wqg = new WQG();
        Boolean bool = this.LIZLLL;
        if (bool != null) {
            z = bool.booleanValue();
        } else {
            z = true;
        }
        return new WQW(c82266WQk, c82264WQi, interfaceC82271WQp, wqs, wqz, wqg, z, this.LJIIIZ);
    }

    public WQY(Context context, C45332Hqi c45332Hqi, InterfaceC139745e6 panelSupplier, C1TI c1ti, boolean z) {
        o.LJIIIZ(panelSupplier, "panelSupplier");
        this.LJI = context;
        this.LJII = c45332Hqi;
        this.LJIIIIZZ = panelSupplier;
        this.LJIIIZ = c1ti;
        this.LJIIJ = z;
    }
}
