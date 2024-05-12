package X;

/* renamed from: X.1mN, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C42951mN<T> extends C1UB<T> {
    public C42951mN() {
        super(5);
    }

    @Override // X.C1UB, X.InterfaceC15090iX
    public final T LIZIZ() {
        if (super.LIZIZ() != null) {
            C0NB.LIZIZ("LiveFlyMicGiftHelper", "FlyMicSimplePool hit， return noNull instance");
        }
        return (T) super.LIZIZ();
    }

    @Override // X.C1UB, X.InterfaceC15090iX
    public final boolean LIZ(T t) {
        C0NB.LIZIZ("LiveFlyMicGiftHelper", "FlyMicSimplePool release instance");
        try {
            return super.LIZ(t);
        } catch (Throwable th) {
            C0NB.LJFF("LiveFlyMicGiftHelper", "FlyMicSimplePool release failed,", th);
            return false;
        }
    }
}
