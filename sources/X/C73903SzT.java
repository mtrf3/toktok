package X;

/* renamed from: X.SzT, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73903SzT<T, R> extends AbstractC73672Svk<R> {
    public final InterfaceC115714gR<? extends T>[] LJLIL;
    public final Iterable<? extends InterfaceC115714gR<? extends T>> LJLILLLLZI;
    public final InterfaceC48038ItG<? super Object[], ? extends R> LJLJI;
    public final int LJLJJI;
    public final boolean LJLJJL = false;

    @Override // X.AbstractC73672Svk
    public final void LJJJZ(InterfaceC116954iR<? super R> interfaceC116954iR) {
        int length;
        InterfaceC115714gR<? extends T>[] interfaceC115714gRArr = this.LJLIL;
        if (interfaceC115714gRArr == null) {
            interfaceC115714gRArr = new AbstractC73672Svk[8];
            length = 0;
            for (InterfaceC115714gR<? extends T> interfaceC115714gR : this.LJLILLLLZI) {
                if (length == interfaceC115714gRArr.length) {
                    InterfaceC115714gR<? extends T>[] interfaceC115714gRArr2 = new InterfaceC115714gR[(length >> 2) + length];
                    System.arraycopy(interfaceC115714gRArr, 0, interfaceC115714gRArr2, 0, length);
                    interfaceC115714gRArr = interfaceC115714gRArr2;
                }
                interfaceC115714gRArr[length] = interfaceC115714gR;
                length++;
            }
        } else {
            length = interfaceC115714gRArr.length;
        }
        if (length == 0) {
            EnumC73538Sta.complete(interfaceC116954iR);
            return;
        }
        C73904SzU c73904SzU = new C73904SzU(interfaceC116954iR, this.LJLJI, length, this.LJLJJL);
        int i = this.LJLJJI;
        C73906SzW<T, R>[] c73906SzWArr = c73904SzU.LJLJI;
        int length2 = c73906SzWArr.length;
        for (int i2 = 0; i2 < length2; i2++) {
            c73906SzWArr[i2] = new C73906SzW<>(c73904SzU, i);
        }
        c73904SzU.lazySet(0);
        c73904SzU.LJLIL.onSubscribe(c73904SzU);
        for (int i3 = 0; i3 < length2 && !c73904SzU.LJLJJLL; i3++) {
            interfaceC115714gRArr[i3].LIZ(c73906SzWArr[i3]);
        }
    }

    public C73903SzT(InterfaceC115714gR[] interfaceC115714gRArr, Iterable iterable, InterfaceC48038ItG interfaceC48038ItG, int i) {
        this.LJLIL = interfaceC115714gRArr;
        this.LJLILLLLZI = iterable;
        this.LJLJI = interfaceC48038ItG;
        this.LJLJJI = i;
    }
}
