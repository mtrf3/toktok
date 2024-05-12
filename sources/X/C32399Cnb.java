package X;

import Y.ARunnableS24S0200000_5;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.RunnableScheduledFuture;
import kotlin.jvm.internal.o;

/* renamed from: X.Cnb, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32399Cnb {
    public final HashMap<String, C32417Cnt> LIZ;
    public long LIZIZ;
    public EnumC32342Cmg LIZJ;
    public int LIZLLL;
    public InterfaceC32416Cns LJ;
    public ARunnableS24S0200000_5 LJFF;
    public RunnableScheduledFuture<?> LJI;
    public boolean LJII;
    public boolean LJIIIIZZ;
    public EnumC32408Cnk LJIIIZ;
    public String LJIIJ;
    public long LJIIJJI;
    public Throwable LJIIL;
    public long LJIILIIL;
    public List<String> LJIILJJIL;
    public java.util.Map<String, String> LJIILL;
    public C32420Cnw LJIILLIIL;

    public final String LIZ() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.LIZIZ);
        LIZ.append(this.LIZJ);
        return X1D.LIZIZ(LIZ);
    }

    public C32399Cnb(HashMap<String, C32417Cnt> mMultiplexMap) {
        o.LJIIIZ(mMultiplexMap, "mMultiplexMap");
        this.LIZ = mMultiplexMap;
        this.LIZJ = EnumC32342Cmg.PRE_DOWNLOAD;
        this.LIZLLL = 2;
        this.LJIIIZ = EnumC32408Cnk.DONE;
        this.LJIIJ = "";
    }

    public final void LIZIZ(EnumC32408Cnk enumC32408Cnk) {
        o.LJIIIZ(enumC32408Cnk, "<set-?>");
        this.LJIIIZ = enumC32408Cnk;
    }
}
