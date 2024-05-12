package X;

import java.util.List;

/* renamed from: X.Nkl, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60251Nkl implements InterfaceC60246Nkg {
    public final InterfaceC60250Nkk<?, ?, ?, ?> LIZ;
    public final InterfaceC60253Nkn<?, ?> LIZIZ;
    public final List<InterfaceC60253Nkn<?, ?>> LIZJ;
    public final InterfaceC60262Nkw LIZLLL;
    public final List<InterfaceC60262Nkw> LJ;
    public final List<InterfaceC88472Yns<F3T, List<AbstractC59475NVv>>> LJFF;

    @Override // X.InterfaceC60246Nkg
    public final List<InterfaceC88472Yns<F3T, List<AbstractC59475NVv>>> LIZ() {
        return this.LJFF;
    }

    @Override // X.InterfaceC60246Nkg
    public final List<InterfaceC60262Nkw> LIZIZ() {
        return this.LJ;
    }

    @Override // X.InterfaceC60246Nkg
    public final InterfaceC60262Nkw LIZJ() {
        return this.LIZLLL;
    }

    @Override // X.InterfaceC60246Nkg
    public final List<InterfaceC60253Nkn<?, ?>> LIZLLL() {
        return this.LIZJ;
    }

    @Override // X.InterfaceC60246Nkg
    public final InterfaceC60253Nkn<?, ?> LJ() {
        return this.LIZIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C60251Nkl(InterfaceC60250Nkk<?, ?, ?, ?> interfaceC60250Nkk, InterfaceC60253Nkn<?, ?> interfaceC60253Nkn, List<? extends InterfaceC60253Nkn<?, ?>> list, InterfaceC60262Nkw interfaceC60262Nkw, List<? extends InterfaceC60262Nkw> list2, List<? extends InterfaceC88472Yns<? super F3T, ? extends List<? extends AbstractC59475NVv>>> list3) {
        this.LIZ = interfaceC60250Nkk;
        this.LIZIZ = interfaceC60253Nkn;
        this.LIZJ = list;
        this.LIZLLL = interfaceC60262Nkw;
        this.LJ = list2;
        this.LJFF = list3;
    }
}
