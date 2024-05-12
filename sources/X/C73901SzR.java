package X;

/* renamed from: X.SzR, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73901SzR<T, R> extends AbstractC73672Svk<R> {
    public final InterfaceC115714gR<? extends T>[] LJLIL;
    public final InterfaceC48038ItG<? super Object[], ? extends R> LJLJI;
    public final int LJLJJI;
    public final Iterable<? extends InterfaceC115714gR<? extends T>> LJLILLLLZI = null;
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
        C73902SzS c73902SzS = new C73902SzS(length, this.LJLJJI, interfaceC116954iR, this.LJLJI, this.LJLJJL);
        C73905SzV<T, R>[] c73905SzVArr = c73902SzS.LJLJI;
        int length2 = c73905SzVArr.length;
        c73902SzS.LJLIL.onSubscribe(c73902SzS);
        for (int i = 0; i < length2 && !c73902SzS.LJLJLJ && !c73902SzS.LJLJL; i++) {
            interfaceC115714gRArr[i].LIZ(c73905SzVArr[i]);
        }
    }

    public C73901SzR(InterfaceC115714gR[] interfaceC115714gRArr, C73337SqL c73337SqL, int i) {
        this.LJLIL = interfaceC115714gRArr;
        this.LJLJI = c73337SqL;
        this.LJLJJI = i;
    }
}
