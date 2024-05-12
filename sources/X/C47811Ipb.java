package X;

import java.lang.ref.WeakReference;

/* renamed from: X.Ipb, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class C47811Ipb implements InterfaceC48417IzN, InterfaceC48416IzM, InterfaceC47888Iqq, InterfaceC48414IzK, InterfaceC48415IzL, InterfaceC47890Iqs, InterfaceC48418IzO, InterfaceC47891Iqt {
    public final WeakReference<AbstractC47755Ioh> LIZ;

    public C47811Ipb(AbstractC47755Ioh abstractC47755Ioh) {
        this.LIZ = new WeakReference<>(abstractC47755Ioh);
    }

    @Override // X.InterfaceC48414IzK
    public final void LIZ(InterfaceC47775Ip1 interfaceC47775Ip1) {
        AbstractC47755Ioh abstractC47755Ioh = this.LIZ.get();
        if (abstractC47755Ioh == null) {
            return;
        }
        abstractC47755Ioh.LJIIJJI(interfaceC47775Ip1);
    }

    @Override // X.InterfaceC48417IzN
    public final void LIZIZ(InterfaceC47775Ip1 interfaceC47775Ip1) {
        AbstractC47755Ioh abstractC47755Ioh = this.LIZ.get();
        if (abstractC47755Ioh == null) {
            return;
        }
        abstractC47755Ioh.LJIILJJIL(interfaceC47775Ip1);
    }

    @Override // X.InterfaceC48415IzL
    public final boolean LIZJ(InterfaceC47775Ip1 interfaceC47775Ip1, int i, int i2) {
        AbstractC47755Ioh abstractC47755Ioh = this.LIZ.get();
        if (abstractC47755Ioh == null) {
            return false;
        }
        return abstractC47755Ioh.LJIIL(interfaceC47775Ip1, i, i2);
    }

    @Override // X.InterfaceC48418IzO
    public final void LIZLLL(InterfaceC47775Ip1 interfaceC47775Ip1, int i, int i2) {
        AbstractC47755Ioh abstractC47755Ioh = this.LIZ.get();
        if (abstractC47755Ioh == null) {
            return;
        }
        abstractC47755Ioh.LJIIZILJ(interfaceC47775Ip1, i, i2);
    }

    @Override // X.InterfaceC48416IzM
    public final boolean LJ(InterfaceC47775Ip1 interfaceC47775Ip1, int i, int i2) {
        AbstractC47755Ioh abstractC47755Ioh = this.LIZ.get();
        if (abstractC47755Ioh == null) {
            return false;
        }
        abstractC47755Ioh.LJIILIIL(interfaceC47775Ip1, i, i2);
        return false;
    }
}
