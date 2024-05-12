package X;

/* renamed from: X.PeW, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract class AbstractC64960PeW<ResponseT, ReturnT> extends AbstractC64951PeN<ReturnT> {
    public final C64646PYs LIZ;
    public final InterfaceC48134Iuo LIZIZ;
    public final InterfaceC65017PfR<PVM, ResponseT> LIZJ;

    public abstract Object LIZJ(C64639PYl c64639PYl, Object[] objArr);

    @Override // X.AbstractC64951PeN
    public final ReturnT LIZ(Object[] objArr) {
        return (ReturnT) LIZJ(new C64639PYl(this.LIZ, objArr, this.LIZIZ, this.LIZJ), objArr);
    }

    public AbstractC64960PeW(C64646PYs c64646PYs, InterfaceC48134Iuo interfaceC48134Iuo, InterfaceC65017PfR<PVM, ResponseT> interfaceC65017PfR) {
        this.LIZ = c64646PYs;
        this.LIZIZ = interfaceC48134Iuo;
        this.LIZJ = interfaceC65017PfR;
    }
}
