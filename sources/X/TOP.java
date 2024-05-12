package X;

import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class TOP implements TOQ {
    public final InterfaceC65784Pro<InterfaceC84497XEf> LIZ;
    public final InterfaceC65784Pro<String> LIZIZ;
    public final InterfaceC65784Pro<String> LIZJ;
    public final int LIZLLL;
    public final int LJ;

    @Override // X.TOQ
    public final TMR LIZ() {
        return new TP2(this.LIZ, this.LIZIZ.invoke(), this.LIZJ.invoke(), this.LIZLLL);
    }

    @Override // X.TOQ
    public final TMR LLIIIL(String query) {
        o.LJIIIZ(query, "query");
        return new TP1(this.LIZ, this.LIZIZ.invoke(), this.LIZJ.invoke(), query, this.LJ);
    }

    public TOP(InterfaceC65784Pro effectPlatform, InterfaceC65784Pro providerNameSupplier, InterfaceC65784Pro providerSourceSupplier) {
        o.LJIIIZ(effectPlatform, "effectPlatform");
        o.LJIIIZ(providerNameSupplier, "providerNameSupplier");
        o.LJIIIZ(providerSourceSupplier, "providerSourceSupplier");
        this.LIZ = effectPlatform;
        this.LIZIZ = providerNameSupplier;
        this.LIZJ = providerSourceSupplier;
        this.LIZLLL = 30;
        this.LJ = 30;
    }
}
